/*
 * Copyright (c) 2014-2017 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.sword.strategy;

import de.uniulm.omi.cloudiator.domain.*;
import de.uniulm.omi.cloudiator.sword.domain.Image;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by daniel on 20.04.17.
 */
public class NameSubstringBasedOperatingSystemDetectionStrategy
    implements OperatingSystemDetectionStrategy {


    @Override public OperatingSystem detectOperatingSystem(Image image) {

        OperatingSystemFamily osFamily = OperatingSystemFamily.UNKNOWN;
        OperatingSystemVersion osVersion = OperatingSystemVersions.unknown();
        OperatingSystemArchitecture osArch = OperatingSystemArchitecture.UNKNOWN;

        //detect the operating system family
        final Set<OperatingSystemFamily> candidates = Arrays.stream(OperatingSystemFamily.values())
            .filter(operatingSystemType -> image.name().toLowerCase()
                .contains(operatingSystemType.name().toLowerCase())).collect(Collectors.toSet());

        //detect the version
        versionLoop:
        for (OperatingSystemFamily operatingSystemFamily : candidates) {
            for (OperatingSystemVersion version : operatingSystemFamily
                .operatingSystemVersionFormat().allVersions()) {
                if (image.name().toLowerCase().contains(String.valueOf(version.version())) || (
                    version.name().isPresent() && image.name().toLowerCase()
                        .contains(version.name().get().toLowerCase()))) {
                    osFamily = operatingSystemFamily;
                    osVersion = version;
                    break versionLoop;
                }
            }
        }

        for (OperatingSystemArchitecture operatingSystemArchitecture : OperatingSystemArchitecture
            .values()) {
            if (image.name().toLowerCase()
                .contains(operatingSystemArchitecture.name().toLowerCase())) {
                osArch = operatingSystemArchitecture;
                break;
            }
        }

        return OperatingSystemBuilder.newBuilder().architecture(osArch).family(osFamily)
            .version(osVersion).build();
    }
}
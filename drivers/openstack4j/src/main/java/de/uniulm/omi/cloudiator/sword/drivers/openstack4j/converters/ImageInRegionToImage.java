/*
 * Copyright (c) 2014-2016 University of Ulm
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

package de.uniulm.omi.cloudiator.sword.drivers.openstack4j.converters;

import de.uniulm.omi.cloudiator.common.OneWayConverter;
import de.uniulm.omi.cloudiator.common.os.OperatingSystems;
import de.uniulm.omi.cloudiator.sword.core.domain.ImageBuilder;
import de.uniulm.omi.cloudiator.sword.drivers.openstack4j.domain.ImageInRegion;

import javax.annotation.Nullable;

/**
 * Created by daniel on 16.11.16.
 */
public class ImageInRegionToImage
    implements OneWayConverter<ImageInRegion, de.uniulm.omi.cloudiator.sword.api.domain.Image> {

    @Nullable @Override
    public de.uniulm.omi.cloudiator.sword.api.domain.Image apply(ImageInRegion imageInRegion) {
        return ImageBuilder.newBuilder().id(imageInRegion.getId()).location(imageInRegion.region())
            .name(imageInRegion.getName()).providerId(imageInRegion.providerId())
            .os(OperatingSystems.unknown()).build();
    }
}

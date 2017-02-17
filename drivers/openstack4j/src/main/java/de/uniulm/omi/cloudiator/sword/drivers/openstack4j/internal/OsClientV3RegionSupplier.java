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

package de.uniulm.omi.cloudiator.sword.drivers.openstack4j.internal;

import com.google.inject.Inject;
import de.uniulm.omi.cloudiator.util.OneWayConverter;
import de.uniulm.omi.cloudiator.domain.Location;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.identity.v3.Region;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

/**
 * Created by daniel on 18.11.16.
 */
public class OsClientV3RegionSupplier implements RegionSupplier {

    private final OSClient.OSClientV3 osClientV3;
    private final OneWayConverter<String, Location> regionConverter;

    @Inject public OsClientV3RegionSupplier(OSClient osClient,
        OneWayConverter<String, Location> regionConverter) {
        checkNotNull(regionConverter, "regionConverter is null.");
        this.regionConverter = regionConverter;
        checkNotNull(osClient, "osClient is null");
        checkState(osClient instanceof OSClient.OSClientV3,
            "Illegal version of OSClient supplied.");
        this.osClientV3 = (OSClient.OSClientV3) osClient;
    }

    @Override public Set<Location> get() {
        return osClientV3.identity().regions().list().stream()
            .map((Function<Region, String>) Region::getId).map(regionConverter)
            .collect(Collectors.toSet());
    }
}

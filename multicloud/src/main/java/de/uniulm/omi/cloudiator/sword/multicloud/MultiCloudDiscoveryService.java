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

package de.uniulm.omi.cloudiator.sword.multicloud;

import com.google.inject.Inject;
import de.uniulm.omi.cloudiator.sword.api.domain.HardwareFlavor;
import de.uniulm.omi.cloudiator.sword.api.domain.Image;
import de.uniulm.omi.cloudiator.sword.api.domain.Location;
import de.uniulm.omi.cloudiator.sword.api.domain.VirtualMachine;
import de.uniulm.omi.cloudiator.sword.api.service.DiscoveryService;
import de.uniulm.omi.cloudiator.sword.multicloud.domain.*;

import javax.annotation.Nullable;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by daniel on 17.04.15.
 */
public class MultiCloudDiscoveryService implements DiscoveryService {

    private final ComputeServiceProvider computeServiceProvider;

    @Inject public MultiCloudDiscoveryService(ComputeServiceProvider computeServiceProvider) {
        checkNotNull(computeServiceProvider, "computeServiceProvider is null");
        this.computeServiceProvider = computeServiceProvider;
    }

    @Nullable @Override public Image getImage(String id) {
        checkNotNull(id, "id is null");
        checkArgument(!id.isEmpty(), "id is empty");
        final IdScopedByCloud idScopedByCloud = IdScopedByClouds.from(id);
        return computeServiceProvider.forId(idScopedByCloud.cloudId()).discoveryService()
            .getImage(idScopedByCloud.id());
    }

    @Nullable @Override public VirtualMachine getVirtualMachine(String id) {
        checkNotNull(id, "id is null");
        checkArgument(!id.isEmpty(), "id is empty");
        final IdScopedByCloud idScopedByCloud = IdScopedByClouds.from(id);
        return computeServiceProvider.forId(idScopedByCloud.cloudId()).discoveryService()
            .getVirtualMachine(idScopedByCloud.id());
    }

    @Override public Iterable<HardwareFlavor> listHardwareFlavors() {
        return this.computeServiceProvider.all().entrySet().stream().flatMap(
            cloudComputeServiceEntry -> StreamSupport.stream(
                cloudComputeServiceEntry.getValue().discoveryService().listHardwareFlavors()
                    .spliterator(), false).map(
                (Function<HardwareFlavor, HardwareFlavorMultiCloud>) hardwareFlavor -> new HardwareFlavorMultiCloudImpl(
                    hardwareFlavor, cloudComputeServiceEntry.getKey())))
            .collect(Collectors.toSet());
    }

    @Override public Iterable<Image> listImages() {
        return this.computeServiceProvider.all().entrySet().stream().flatMap(
            cloudComputeServiceEntry -> StreamSupport.stream(
                cloudComputeServiceEntry.getValue().discoveryService().listImages().spliterator(),
                false).map(
                (Function<Image, ImageMultiCloud>) image -> new ImageMultiCloudImpl(image,
                    cloudComputeServiceEntry.getKey()))).collect(Collectors.toSet());
    }

    @Override public Iterable<Location> listLocations() {
        return this.computeServiceProvider.all().entrySet().stream().flatMap(
            cloudComputeServiceEntry -> StreamSupport.stream(
                cloudComputeServiceEntry.getValue().discoveryService().listLocations()
                    .spliterator(), false).map(
                (Function<Location, LocationMultiCloud>) location -> new LocationMultiCloudImpl(
                    location, cloudComputeServiceEntry.getKey()))).collect(Collectors.toSet());
    }

    @Override public Iterable<VirtualMachine> listVirtualMachines() {
        return this.computeServiceProvider.all().entrySet().stream().flatMap(
            cloudComputeServiceEntry -> StreamSupport.stream(
                cloudComputeServiceEntry.getValue().discoveryService().listVirtualMachines()
                    .spliterator(), false).map(
                (Function<VirtualMachine, VirtualMachineMultiCloud>) location -> new VirtualMachineMultiCloudImpl(
                    location, cloudComputeServiceEntry.getKey()))).collect(Collectors.toSet());
    }

    @Nullable @Override public Location getLocation(String id) {
        checkNotNull(id, "id is null");
        checkArgument(!id.isEmpty(), "id is empty");
        final IdScopedByCloud idScopedByCloud = IdScopedByClouds.from(id);
        return computeServiceProvider.forId(idScopedByCloud.cloudId()).discoveryService()
            .getLocation(idScopedByCloud.id());
    }

    @Nullable @Override public HardwareFlavor getHardwareFlavor(String id) {
        checkNotNull(id, "id is null");
        checkArgument(!id.isEmpty(), "id is empty");
        final IdScopedByCloud idScopedByCloud = IdScopedByClouds.from(id);
        return computeServiceProvider.forId(idScopedByCloud.cloudId()).discoveryService()
            .getHardwareFlavor(idScopedByCloud.id());
    }

}

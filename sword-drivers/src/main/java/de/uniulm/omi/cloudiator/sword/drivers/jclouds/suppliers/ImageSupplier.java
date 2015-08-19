/*
 * Copyright (c) 2014-2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.sword.drivers.jclouds.suppliers;


import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.uniulm.omi.cloudiator.common.OneWayConverter;
import de.uniulm.omi.cloudiator.sword.api.domain.Image;
import de.uniulm.omi.cloudiator.sword.api.supplier.ResourceSupplier;
import de.uniulm.omi.cloudiator.sword.drivers.jclouds.JCloudsComputeClient;

import java.util.Set;

/**
 * Created by daniel on 02.12.14.
 */
public class ImageSupplier implements ResourceSupplier<Set<Image>> {

    private final JCloudsComputeClient jCloudsComputeClient;
    private final OneWayConverter<org.jclouds.compute.domain.Image, Image> jCloudsImageToImage;

    @Inject public ImageSupplier(JCloudsComputeClient jCloudsComputeClient,
        OneWayConverter<org.jclouds.compute.domain.Image, Image> jCloudsImageToImage) {
        this.jCloudsComputeClient = jCloudsComputeClient;
        this.jCloudsImageToImage = jCloudsImageToImage;
    }

    @Override public Set<Image> get() {
        return Sets.newHashSet(
            Iterables.transform(jCloudsComputeClient.listImages(), this.jCloudsImageToImage));
    }
}

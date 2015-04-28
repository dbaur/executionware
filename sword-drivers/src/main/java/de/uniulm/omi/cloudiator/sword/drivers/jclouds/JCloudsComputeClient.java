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

package de.uniulm.omi.cloudiator.sword.drivers.jclouds;

import com.google.inject.ImplementedBy;
import org.jclouds.compute.domain.*;
import org.jclouds.domain.Location;

import java.util.Set;

/**
 * Created by daniel on 02.12.14.
 */
@ImplementedBy(JCloudsComputeClientImpl.class)
public interface JCloudsComputeClient {

    Set<? extends Image> listImages();

    Set<? extends Hardware> listHardwareProfiles();

    Set<? extends Location> listAssignableLocations();

    Set<? extends ComputeMetadata> listNodes();

    public NodeMetadata createNode(Template template);

    public void deleteNode(String id);

    public TemplateBuilder templateBuilder();
}
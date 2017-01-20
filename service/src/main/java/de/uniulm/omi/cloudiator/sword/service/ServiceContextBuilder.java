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

package de.uniulm.omi.cloudiator.sword.service;

import de.uniulm.omi.cloudiator.sword.api.ServiceContext;
import de.uniulm.omi.cloudiator.sword.api.domain.Cloud;
import de.uniulm.omi.cloudiator.sword.api.domain.Configuration;

/**
 * Created by daniel on 19.01.17.
 */
public class ServiceContextBuilder {

    private Cloud cloud;
    private Configuration configuration;

    private ServiceContextBuilder() {
    }

    public static ServiceContextBuilder newBuilder() {
        return new ServiceContextBuilder();
    }

    public ServiceContextBuilder cloud(Cloud cloud) {
        this.cloud = cloud;
        return this;
    }

    public ServiceContextBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    public ServiceContext build() {
        return new ServiceContextImpl(cloud, configuration);
    }

}

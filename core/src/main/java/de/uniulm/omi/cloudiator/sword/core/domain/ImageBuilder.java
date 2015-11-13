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

package de.uniulm.omi.cloudiator.sword.core.domain;

import de.uniulm.omi.cloudiator.sword.api.domain.Location;

/**
 * Created by daniel on 01.12.14.
 */
public class ImageBuilder {

    private String id;
    private String name;
    private Location location;

    private ImageBuilder() {

    }

    public static ImageBuilder newBuilder() {
        return new ImageBuilder();
    }

    public ImageBuilder id(String id) {
        this.id = id;
        return this;
    }

    public ImageBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ImageBuilder location(Location location) {
        this.location = location;
        return this;
    }

    public ImageImpl build() {
        return new ImageImpl(id, name, location);
    }
}

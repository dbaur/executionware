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
 * Created by daniel on 03.12.14.
 */
public class LocationImpl extends ResourceImpl implements Location {

    private final boolean isAssignable;

    LocationImpl(String id, String name, boolean isAssignable) {
        super(id, name);
        this.isAssignable = isAssignable;
    }


    @Override public String toString() {
        return String.format("Location(id: %s, name: %s, assignable: %s)", id, name, isAssignable);
    }

    @Override public boolean isAssignable() {
        return this.isAssignable;
    }
}
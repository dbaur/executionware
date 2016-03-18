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

import com.google.common.base.MoreObjects;
import de.uniulm.omi.cloudiator.sword.api.domain.Image;
import de.uniulm.omi.cloudiator.sword.api.domain.Location;

import javax.annotation.Nullable;

/**
 * Created by daniel on 01.12.14.
 */
public class ImageImpl extends ResourceImpl implements Image {

    ImageImpl(String id, String providerId, String name, @Nullable Location location) {
        super(id, providerId, name, location);
    }

    @Override public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id()).add("providerId", providerId())
            .add("name", name()).toString();
    }
}

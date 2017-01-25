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

import de.uniulm.omi.cloudiator.sword.api.domain.Credentials;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by daniel on 01.12.14.
 */
public class CredentialsImpl implements Credentials {

    private final String user;
    private final String password;

    CredentialsImpl(String user, String password) {

        checkNotNull(user);
        checkNotNull(password);
        checkArgument(!user.isEmpty());
        checkArgument(!password.isEmpty());

        this.user = user;
        this.password = password;
    }

    @Override
    public String user() {
        return this.user;
    }

    @Override
    public String password() {
        return this.password;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        CredentialsImpl that = (CredentialsImpl) o;

        if (!user.equals(that.user))
            return false;
        return password.equals(that.password);
    }

    @Override public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
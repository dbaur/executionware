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

package de.uniulm.omi.cloudiator.sword.multicloud.service;

import com.google.common.net.HostAndPort;
import de.uniulm.omi.cloudiator.common.os.RemoteType;
import de.uniulm.omi.cloudiator.sword.api.domain.LoginCredential;
import de.uniulm.omi.cloudiator.sword.api.remote.RemoteConnection;
import de.uniulm.omi.cloudiator.sword.api.remote.RemoteException;
import de.uniulm.omi.cloudiator.sword.api.service.ConnectionService;

import java.util.Collection;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by daniel on 23.01.17.
 */
public class MultiCloudConnectionService implements ConnectionService {

    private final Collection<ConnectionService> connectionServices;

    public MultiCloudConnectionService(Collection<ConnectionService> connectionServices) {
        checkNotNull(connectionServices, "connectionServices is null");
        this.connectionServices = connectionServices;
    }

    @Override
    public RemoteConnection getRemoteConnection(HostAndPort hostAndPort, RemoteType remoteType,
        LoginCredential loginCredential) throws RemoteException {

        //for the time being we simple choose a random connection service from the list.


        return null;
    }
}

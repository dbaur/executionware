/*
 * Copyright (c) 2014-2015 University of Ulm
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

package de.uniulm.omi.cloudiator.sword.drivers.openstack.extensions;

import com.google.inject.Inject;
import de.uniulm.omi.cloudiator.common.OneWayConverter;
import de.uniulm.omi.cloudiator.sword.api.domain.KeyPair;
import de.uniulm.omi.cloudiator.sword.api.extensions.KeyPairService;
import de.uniulm.omi.cloudiator.sword.api.util.NamingStrategy;
import de.uniulm.omi.cloudiator.sword.drivers.openstack.OpenstackKeyPairClient;

import javax.annotation.Nullable;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Implementation of the {@link KeyPairService} interface
 * for Openstack.
 */
public class OpenstackKeyPairService implements KeyPairService {

    private final OneWayConverter<org.jclouds.openstack.nova.v2_0.domain.KeyPair, KeyPair>
        keyPairConverter;
    private final OpenstackKeyPairClient openstackKeyPairClient;
    private final NamingStrategy namingStrategy;

    /**
     * Constructor.
     *
     * @param keyPairConverter       a converter for converting {@link org.jclouds.openstack.nova.v2_0.domain.KeyPair}
     *                               objects to {@link KeyPair} objects (non null).
     * @param openstackKeyPairClient an openstack client for key pairs (non null).
     * @param namingStrategy         the naming strategy used for creating the key pair names.
     * @throws NullPointerException if any of the supplied arguments is null.
     */
    @Inject public OpenstackKeyPairService(
        OneWayConverter<org.jclouds.openstack.nova.v2_0.domain.KeyPair, KeyPair> keyPairConverter,
        OpenstackKeyPairClient openstackKeyPairClient, NamingStrategy namingStrategy) {

        checkNotNull(namingStrategy);
        checkNotNull(keyPairConverter);
        checkNotNull(openstackKeyPairClient);

        this.keyPairConverter = keyPairConverter;
        this.openstackKeyPairClient = openstackKeyPairClient;
        this.namingStrategy = namingStrategy;
    }

    @Override public KeyPair create(@Nullable String name) {
        if (name != null) {
            checkArgument(!name.isEmpty());
        }
        return keyPairConverter
            .apply(openstackKeyPairClient.create(namingStrategy.generateUniqueNameInGroup(name)));
    }

    @Override public KeyPair create(@Nullable String name, String publicKey) {
        if (name != null) {
            checkArgument(!name.isEmpty());
        }
        checkNotNull(publicKey);
        checkArgument(!publicKey.isEmpty());
        return keyPairConverter.apply(openstackKeyPairClient
            .createWithPublicKey(namingStrategy.generateUniqueNameInGroup(name), publicKey));
    }

    @Override public boolean delete(String name) {
        checkNotNull(name);
        checkArgument(!name.isEmpty());
        return openstackKeyPairClient.delete(name);
    }

    @Override public KeyPair get(String name) {
        checkNotNull(name);
        checkArgument(!name.isEmpty());
        return keyPairConverter.apply(openstackKeyPairClient.get(name));
    }
}

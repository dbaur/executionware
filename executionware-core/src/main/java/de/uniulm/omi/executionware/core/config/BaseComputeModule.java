/*
 * Copyright (c) 2014 University of Ulm
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

package de.uniulm.omi.executionware.core.config;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import de.uniulm.omi.executionware.api.domain.HardwareFlavor;
import de.uniulm.omi.executionware.api.domain.Image;
import de.uniulm.omi.executionware.api.domain.Location;
import de.uniulm.omi.executionware.api.domain.VirtualMachine;
import de.uniulm.omi.executionware.api.supplier.Supplier;

import java.util.Set;

/**
 * Created by daniel on 02.12.14.
 */
public abstract class BaseComputeModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(new TypeLiteral<Supplier<Set<? extends Image>>>() {
        }).to(getImageSupplier());

        bind(new TypeLiteral<Supplier<Set<? extends Location>>>() {
        }).to(getLocationSupplier());

        bind(new TypeLiteral<Supplier<Set<? extends HardwareFlavor>>>() {
        }).to(getHardwareFlavorSupplier());

        bind(new TypeLiteral<Supplier<Set<? extends VirtualMachine>>>() {
        }).to(getVirtualMachineSupplier());
    }

    public abstract Class<? extends Supplier<Set<? extends Image>>> getImageSupplier();

    public abstract Class<? extends Supplier<Set<? extends Location>>> getLocationSupplier();

    public abstract Class<? extends Supplier<Set<? extends HardwareFlavor>>> getHardwareFlavorSupplier();

    public abstract Class<? extends Supplier<Set<? extends VirtualMachine>>> getVirtualMachineSupplier();

}

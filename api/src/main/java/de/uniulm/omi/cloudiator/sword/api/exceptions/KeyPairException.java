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

package de.uniulm.omi.cloudiator.sword.api.exceptions;

/**
 * An exception that is thrown while acquiring a keypair
 * at the cloud provider.
 */
public class KeyPairException extends Exception {
    public KeyPairException() {
    }

    public KeyPairException(String message) {
        super(message);
    }

    public KeyPairException(String message, Throwable cause) {
        super(message, cause);
    }

    public KeyPairException(Throwable cause) {
        super(cause);
    }

    public KeyPairException(String message, Throwable cause, boolean enableSuppression,
        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
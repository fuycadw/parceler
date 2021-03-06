/**
 * Copyright 2013 John Ericksen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.parceler;

/**
 * General RuntimeException in the Parceler library.
 *
 * @author John Ericksen
 */
public class ParcelerRuntimeException extends RuntimeException {

    public ParcelerRuntimeException(String message) {
        super(message);
    }

    public ParcelerRuntimeException(String s, Exception e) {
        super(s,e);
    }

    public ParcelerRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}

/*
 * $Id$
 *
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tiles;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Defines a set of methods which tiles use to communicate to
 * the tiles container and runtime environment.  There is only
 * one application context per container.
 *
 * @version $Rev$
 * @since 2.0
 */
public interface TilesApplicationContext {

    /**
     * Returns a mutable Map that maps application scope attribute names to
     * their values.
     *
     * @return Map of key value pairs.
     */
    Map<String, Object> getApplicationScope();

    /**
     * Return an immutable Map that maps context application initialization
     * parameters to their values.
     *
     * @return initialization parameters
     */
    Map<String, String> getInitParams();

    /**
     * Return a URL for the application resource mapped to the specified path.
     *
     * @param path to the desired resource.
     * @return the first located resource which matches the given path.
     * @throws java.net.MalformedURLException if the path is malformed
     */
    URL getResource(String path) throws MalformedURLException;

    /**
     * Return a URL for the application resource mapped to the specified path.
     *
     * @param path to the desired resource.
     * @return all resources which match the given path.
     * @throws java.net.MalformedURLException if the url is illegal
     */
    URL[] getResources(String path) throws MalformedURLException;
}

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.hadoop.fs.swift.http;

import org.apache.http.HttpHeaders;

/**
 * Constants used in the Swift REST protocol,
 * and in the properties used to configure the {@link SwiftRestClient}.
 */
public class SwiftProtocolConstants {
  public static final String HEADER_AUTH_KEY = "X-Auth-Token";
  public static final int SWIFT_HTTP_PORT = 8080;
  public static final int SWIFT_HTTPS_PORT = 443;
  public static final String HEADER_RANGE = HttpHeaders.RANGE;
  public static final String HEADER_DESTINATION = HttpHeaders.DESTINATION;
  public static final String HEADER_LAST_MODIFIED = "Last-Modified";
  public static final String HEADER_CONTENT_LENGTH = "Content-Length";
  public static final String SWIFT_RANGE_HEADER_FORMAT_PATTERN = "bytes=%d-%d";
  public static final String SERVICE_CATALOG_SWIFT = "swift";
  public static final String SERVICE_CATALOG_CLOUD_FILES = "cloudFiles";
  public static final String SERVICE_CATALOG_OBJECT_STORE = "object-store";
  public static final String SWIFT_OBJECT_AUTH_ENDPOINT =
          "/object_endpoint/";
  public static final String X_OBJECT_MANIFEST = "X-Object-Manifest";
  public static final String X_CONTAINER_OBJECT_COUNT =
          "X-Container-Object-Count";
  public static final String X_CONTAINER_BYTES_USED = "X-Container-Bytes-Used";

  /**
   * Header to set when requesting the latest version of a file
   */
  public static final String X_NEWEST = "X-Newest";

  public static final String FS_SWIFT = "fs.swift";
  /**
   * Prefix for all instance-specific values in the configuration: {@value}
   */
  public static final String SWIFT_SERVICE_PREFIX = FS_SWIFT + ".service.";

  /**
   * timeout for all connections
   */
  public static final String SWIFT_CONNECTION_TIMEOUT =
          FS_SWIFT + ".connect.timeout";

  /**
   * connection retry count for all connections
   */
  public static final String SWIFT_RETRY_COUNT =
          FS_SWIFT + "connect.retry.count";

  /**
   * blocksize for all filesystems: {@value}
   */
  public static final String SWIFT_BLOCKSIZE =
          FS_SWIFT + "blocksize";

  /**
   * the default blocksize for filesystems: {@value}
   */
  public static final long DEFAULT_SWIFT_BLOCKSIZE = 32 * 1024 * 1024;

  /**
   * Key for passing the service name as a property -not read from the
   * configuration : {@value}
   */
  public static final String DOT_SERVICE = ".SERVICE-NAME";

  /**
   * Key for passing the container name as a property -not read from the
   * configuration : {@value}
   */
  public static final String DOT_CONTAINER = ".CONTAINER-NAME";

  public static final String DOT_AUTH_URL = ".auth.url";
  public static final String DOT_TENANT = ".tenant";
  public static final String DOT_USERNAME = ".username";
  public static final String DOT_PASSWORD = ".password";
  public static final String DOT_HTTP_PORT = ".http.port";
  public static final String DOT_HTTPS_PORT = ".https.port";
  public static final String DOT_REGION = ".region";
  public static final String DOT_PROXY_HOST = ".proxy.host";
  public static final String DOT_PROXY_PORT = ".proxy.port";
  public static final String DOT_LOCATION_AWARE = ".location-aware";
  public static final String DOT_APIKEY = ".apikey";
  public static final String DOT_USE_APIKEY = ".useApikey";

  /**
   * flag to say use public URL
   */
  public static final String DOT_PUBLIC = ".public";

  public static final String SWIFT_SERVICE_PROPERTY = FS_SWIFT + DOT_SERVICE;
  public static final String SWIFT_CONTAINER_PROPERTY = FS_SWIFT + DOT_CONTAINER;

  public static final String SWIFT_AUTH_PROPERTY = FS_SWIFT + DOT_AUTH_URL;
  public static final String SWIFT_TENANT_PROPERTY = FS_SWIFT + DOT_TENANT;
  public static final String SWIFT_USERNAME_PROPERTY = FS_SWIFT + DOT_USERNAME;
  public static final String SWIFT_PASSWORD_PROPERTY = FS_SWIFT + DOT_PASSWORD;
  public static final String SWIFT_HTTP_PORT_PROPERTY = FS_SWIFT + DOT_HTTP_PORT;
  public static final String SWIFT_APIKEY_PROPERTY = FS_SWIFT + DOT_APIKEY;
  public static final String SWIFT_HTTPS_PORT_PROPERTY = FS_SWIFT
          + DOT_HTTPS_PORT;
  public static final String SWIFT_REGION_PROPERTY = FS_SWIFT + DOT_REGION;
  public static final String SWIFT_PUBLIC_PROPERTY = FS_SWIFT + DOT_PUBLIC;

  public static final String SWIFT_USE_API_KEY_PROPERTY = FS_SWIFT + DOT_USE_APIKEY;

  public static final String SWIFT_LOCATION_AWARE_PROPERTY = FS_SWIFT +
            DOT_LOCATION_AWARE;

  public static final String SWIFT_PROXY_HOST_PROPERTY = FS_SWIFT + DOT_PROXY_HOST;
  public static final String SWIFT_PROXY_PORT_PROPERTY = FS_SWIFT + DOT_PROXY_PORT;
}
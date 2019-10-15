/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.dromara.soul.config.api.original;

import lombok.Data;
import org.dromara.soul.config.api.ConfigParent;

import java.util.List;

/**
 * BaseConfig .
 *
 * @author sixh
 */
@Data
public class Server extends ConfigParent {

    private String configMode;

    private String cluster;

    private String serverId;

    private String host;

    private Integer port;

    private String monitorPort;

    /**
     * 需要加载的配置类.
     */
    private List<String> configs;

    @Override
    public String prefix() {
        return "soul.server";
    }
}
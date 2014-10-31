/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.jube.model;

import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;
import org.jboss.jube.JubeZKPaths;

import javax.inject.Inject;
import java.util.Map;

/**
 * Represents the model for {@link HostNode} instances
 */
public class HostNodeModel extends ZkCacheModel<HostNode> {
    @Inject
    public HostNodeModel(CuratorFramework curator) throws Exception {
        super(curator, JubeZKPaths.LOCAL_NODES, new HostNodeEntityModel());
        setCreateMode(CreateMode.EPHEMERAL);
    }

    public Map<String, HostNode> getMap() {
        return getEntityModel().getMap();
    }

    public HostNode getEntity(String id) {
        return getEntityModel().getEntity(id);
    }

    @Override
    protected HostNodeEntityModel getEntityModel() {
        return (HostNodeEntityModel) super.getEntityModel();
    }
}

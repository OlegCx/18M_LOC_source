/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ReplicationGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationGroupStaxUnmarshaller implements Unmarshaller<ReplicationGroup, StaxUnmarshallerContext> {

    public ReplicationGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReplicationGroup replicationGroup = new ReplicationGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return replicationGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ReplicationGroupId", targetDepth)) {
                    replicationGroup.setReplicationGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    replicationGroup.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GlobalReplicationGroupInfo", targetDepth)) {
                    replicationGroup.setGlobalReplicationGroupInfo(GlobalReplicationGroupInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    replicationGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    replicationGroup.setPendingModifiedValues(ReplicationGroupPendingModifiedValuesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MemberClusters", targetDepth)) {
                    replicationGroup.withMemberClusters(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MemberClusters/ClusterId", targetDepth)) {
                    replicationGroup.withMemberClusters(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeGroups", targetDepth)) {
                    replicationGroup.withNodeGroups(new ArrayList<NodeGroup>());
                    continue;
                }

                if (context.testExpression("NodeGroups/NodeGroup", targetDepth)) {
                    replicationGroup.withNodeGroups(NodeGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshottingClusterId", targetDepth)) {
                    replicationGroup.setSnapshottingClusterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutomaticFailover", targetDepth)) {
                    replicationGroup.setAutomaticFailover(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MultiAZ", targetDepth)) {
                    replicationGroup.setMultiAZ(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ConfigurationEndpoint", targetDepth)) {
                    replicationGroup.setConfigurationEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotRetentionLimit", targetDepth)) {
                    replicationGroup.setSnapshotRetentionLimit(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotWindow", targetDepth)) {
                    replicationGroup.setSnapshotWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterEnabled", targetDepth)) {
                    replicationGroup.setClusterEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeType", targetDepth)) {
                    replicationGroup.setCacheNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthTokenEnabled", targetDepth)) {
                    replicationGroup.setAuthTokenEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthTokenLastModifiedDate", targetDepth)) {
                    replicationGroup.setAuthTokenLastModifiedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TransitEncryptionEnabled", targetDepth)) {
                    replicationGroup.setTransitEncryptionEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AtRestEncryptionEnabled", targetDepth)) {
                    replicationGroup.setAtRestEncryptionEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MemberClustersOutpostArns", targetDepth)) {
                    replicationGroup.withMemberClustersOutpostArns(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MemberClustersOutpostArns/ReplicationGroupOutpostArn", targetDepth)) {
                    replicationGroup.withMemberClustersOutpostArns(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KmsKeyId", targetDepth)) {
                    replicationGroup.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    replicationGroup.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserGroupIds", targetDepth)) {
                    replicationGroup.withUserGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("UserGroupIds/member", targetDepth)) {
                    replicationGroup.withUserGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogDeliveryConfigurations", targetDepth)) {
                    replicationGroup.withLogDeliveryConfigurations(new ArrayList<LogDeliveryConfiguration>());
                    continue;
                }

                if (context.testExpression("LogDeliveryConfigurations/LogDeliveryConfiguration", targetDepth)) {
                    replicationGroup.withLogDeliveryConfigurations(LogDeliveryConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return replicationGroup;
                }
            }
        }
    }

    private static ReplicationGroupStaxUnmarshaller instance;

    public static ReplicationGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationGroupStaxUnmarshaller();
        return instance;
    }
}

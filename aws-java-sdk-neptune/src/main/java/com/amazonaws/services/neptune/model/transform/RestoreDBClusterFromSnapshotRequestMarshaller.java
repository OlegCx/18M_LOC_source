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
package com.amazonaws.services.neptune.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * RestoreDBClusterFromSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBClusterFromSnapshotRequestMarshaller implements
        Marshaller<Request<RestoreDBClusterFromSnapshotRequest>, RestoreDBClusterFromSnapshotRequest> {

    public Request<RestoreDBClusterFromSnapshotRequest> marshall(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest) {

        if (restoreDBClusterFromSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreDBClusterFromSnapshotRequest> request = new DefaultRequest<RestoreDBClusterFromSnapshotRequest>(restoreDBClusterFromSnapshotRequest,
                "AmazonNeptune");
        request.addParameter("Action", "RestoreDBClusterFromSnapshot");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (restoreDBClusterFromSnapshotRequest.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZonesList = restoreDBClusterFromSnapshotRequest.getAvailabilityZones();
            if (availabilityZonesList.isEmpty()) {
                request.addParameter("AvailabilityZones", "");
            } else {
                int availabilityZonesListIndex = 1;

                for (String availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {
                        request.addParameter("AvailabilityZones.AvailabilityZone." + availabilityZonesListIndex,
                                StringUtils.fromString(availabilityZonesListValue));
                    }
                    availabilityZonesListIndex++;
                }
            }
        }

        if (restoreDBClusterFromSnapshotRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getDBClusterIdentifier()));
        }

        if (restoreDBClusterFromSnapshotRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getSnapshotIdentifier()));
        }

        if (restoreDBClusterFromSnapshotRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getEngine()));
        }

        if (restoreDBClusterFromSnapshotRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getEngineVersion()));
        }

        if (restoreDBClusterFromSnapshotRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBClusterFromSnapshotRequest.getPort()));
        }

        if (restoreDBClusterFromSnapshotRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getDBSubnetGroupName()));
        }

        if (restoreDBClusterFromSnapshotRequest.getDatabaseName() != null) {
            request.addParameter("DatabaseName", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getDatabaseName()));
        }

        if (restoreDBClusterFromSnapshotRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getOptionGroupName()));
        }

        if (restoreDBClusterFromSnapshotRequest.getVpcSecurityGroupIds() != null) {
            java.util.List<String> vpcSecurityGroupIdsList = restoreDBClusterFromSnapshotRequest.getVpcSecurityGroupIds();
            if (vpcSecurityGroupIdsList.isEmpty()) {
                request.addParameter("VpcSecurityGroupIds", "");
            } else {
                int vpcSecurityGroupIdsListIndex = 1;

                for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                    if (vpcSecurityGroupIdsListValue != null) {
                        request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex,
                                StringUtils.fromString(vpcSecurityGroupIdsListValue));
                    }
                    vpcSecurityGroupIdsListIndex++;
                }
            }
        }

        if (restoreDBClusterFromSnapshotRequest.getTags() != null) {
            java.util.List<Tag> tagsList = restoreDBClusterFromSnapshotRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
                int tagsListIndex = 1;

                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        if (tagsListValue.getKey() != null) {
                            request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                        }

                        if (tagsListValue.getValue() != null) {
                            request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                        }
                    }
                    tagsListIndex++;
                }
            }
        }

        if (restoreDBClusterFromSnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getKmsKeyId()));
        }

        if (restoreDBClusterFromSnapshotRequest.getEnableIAMDatabaseAuthentication() != null) {
            request.addParameter("EnableIAMDatabaseAuthentication",
                    StringUtils.fromBoolean(restoreDBClusterFromSnapshotRequest.getEnableIAMDatabaseAuthentication()));
        }

        if (restoreDBClusterFromSnapshotRequest.getEnableCloudwatchLogsExports() != null) {
            java.util.List<String> enableCloudwatchLogsExportsList = restoreDBClusterFromSnapshotRequest.getEnableCloudwatchLogsExports();
            if (enableCloudwatchLogsExportsList.isEmpty()) {
                request.addParameter("EnableCloudwatchLogsExports", "");
            } else {
                int enableCloudwatchLogsExportsListIndex = 1;

                for (String enableCloudwatchLogsExportsListValue : enableCloudwatchLogsExportsList) {
                    if (enableCloudwatchLogsExportsListValue != null) {
                        request.addParameter("EnableCloudwatchLogsExports.member." + enableCloudwatchLogsExportsListIndex,
                                StringUtils.fromString(enableCloudwatchLogsExportsListValue));
                    }
                    enableCloudwatchLogsExportsListIndex++;
                }
            }
        }

        if (restoreDBClusterFromSnapshotRequest.getDBClusterParameterGroupName() != null) {
            request.addParameter("DBClusterParameterGroupName", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getDBClusterParameterGroupName()));
        }

        if (restoreDBClusterFromSnapshotRequest.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(restoreDBClusterFromSnapshotRequest.getDeletionProtection()));
        }

        return request;
    }

}

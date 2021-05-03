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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BuildBatchMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BuildBatchMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CURRENTPHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentPhase").build();
    private static final MarshallingInfo<String> BUILDBATCHSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildBatchStatus").build();
    private static final MarshallingInfo<String> SOURCEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceVersion").build();
    private static final MarshallingInfo<String> RESOLVEDSOURCEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolvedSourceVersion").build();
    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectName").build();
    private static final MarshallingInfo<List> PHASES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("phases").build();
    private static final MarshallingInfo<StructuredPojo> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("source").build();
    private static final MarshallingInfo<List> SECONDARYSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondarySources").build();
    private static final MarshallingInfo<List> SECONDARYSOURCEVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondarySourceVersions").build();
    private static final MarshallingInfo<StructuredPojo> ARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("artifacts").build();
    private static final MarshallingInfo<List> SECONDARYARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondaryArtifacts").build();
    private static final MarshallingInfo<StructuredPojo> CACHE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cache").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environment").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRole").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logConfig").build();
    private static final MarshallingInfo<Integer> BUILDTIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildTimeoutInMinutes").build();
    private static final MarshallingInfo<Integer> QUEUEDTIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queuedTimeoutInMinutes").build();
    private static final MarshallingInfo<Boolean> COMPLETE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("complete").build();
    private static final MarshallingInfo<String> INITIATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("initiator").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionKey").build();
    private static final MarshallingInfo<Long> BUILDBATCHNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildBatchNumber").build();
    private static final MarshallingInfo<List> FILESYSTEMLOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSystemLocations").build();
    private static final MarshallingInfo<StructuredPojo> BUILDBATCHCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildBatchConfig").build();
    private static final MarshallingInfo<List> BUILDGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("buildGroups").build();
    private static final MarshallingInfo<Boolean> DEBUGSESSIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("debugSessionEnabled").build();

    private static final BuildBatchMarshaller instance = new BuildBatchMarshaller();

    public static BuildBatchMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BuildBatch buildBatch, ProtocolMarshaller protocolMarshaller) {

        if (buildBatch == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(buildBatch.getId(), ID_BINDING);
            protocolMarshaller.marshall(buildBatch.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(buildBatch.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(buildBatch.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(buildBatch.getCurrentPhase(), CURRENTPHASE_BINDING);
            protocolMarshaller.marshall(buildBatch.getBuildBatchStatus(), BUILDBATCHSTATUS_BINDING);
            protocolMarshaller.marshall(buildBatch.getSourceVersion(), SOURCEVERSION_BINDING);
            protocolMarshaller.marshall(buildBatch.getResolvedSourceVersion(), RESOLVEDSOURCEVERSION_BINDING);
            protocolMarshaller.marshall(buildBatch.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(buildBatch.getPhases(), PHASES_BINDING);
            protocolMarshaller.marshall(buildBatch.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(buildBatch.getSecondarySources(), SECONDARYSOURCES_BINDING);
            protocolMarshaller.marshall(buildBatch.getSecondarySourceVersions(), SECONDARYSOURCEVERSIONS_BINDING);
            protocolMarshaller.marshall(buildBatch.getArtifacts(), ARTIFACTS_BINDING);
            protocolMarshaller.marshall(buildBatch.getSecondaryArtifacts(), SECONDARYARTIFACTS_BINDING);
            protocolMarshaller.marshall(buildBatch.getCache(), CACHE_BINDING);
            protocolMarshaller.marshall(buildBatch.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(buildBatch.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(buildBatch.getLogConfig(), LOGCONFIG_BINDING);
            protocolMarshaller.marshall(buildBatch.getBuildTimeoutInMinutes(), BUILDTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(buildBatch.getQueuedTimeoutInMinutes(), QUEUEDTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(buildBatch.getComplete(), COMPLETE_BINDING);
            protocolMarshaller.marshall(buildBatch.getInitiator(), INITIATOR_BINDING);
            protocolMarshaller.marshall(buildBatch.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(buildBatch.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(buildBatch.getBuildBatchNumber(), BUILDBATCHNUMBER_BINDING);
            protocolMarshaller.marshall(buildBatch.getFileSystemLocations(), FILESYSTEMLOCATIONS_BINDING);
            protocolMarshaller.marshall(buildBatch.getBuildBatchConfig(), BUILDBATCHCONFIG_BINDING);
            protocolMarshaller.marshall(buildBatch.getBuildGroups(), BUILDGROUPS_BINDING);
            protocolMarshaller.marshall(buildBatch.getDebugSessionEnabled(), DEBUGSESSIONENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

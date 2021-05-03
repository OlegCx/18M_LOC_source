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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProjectArtifactsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectArtifactsMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("path").build();
    private static final MarshallingInfo<String> NAMESPACETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceType").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PACKAGING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("packaging").build();
    private static final MarshallingInfo<Boolean> OVERRIDEARTIFACTNAME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("overrideArtifactName").build();
    private static final MarshallingInfo<Boolean> ENCRYPTIONDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionDisabled").build();
    private static final MarshallingInfo<String> ARTIFACTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("artifactIdentifier").build();
    private static final MarshallingInfo<String> BUCKETOWNERACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketOwnerAccess").build();

    private static final ProjectArtifactsMarshaller instance = new ProjectArtifactsMarshaller();

    public static ProjectArtifactsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProjectArtifacts projectArtifacts, ProtocolMarshaller protocolMarshaller) {

        if (projectArtifacts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(projectArtifacts.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getNamespaceType(), NAMESPACETYPE_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getName(), NAME_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getPackaging(), PACKAGING_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getOverrideArtifactName(), OVERRIDEARTIFACTNAME_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getEncryptionDisabled(), ENCRYPTIONDISABLED_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getArtifactIdentifier(), ARTIFACTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(projectArtifacts.getBucketOwnerAccess(), BUCKETOWNERACCESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

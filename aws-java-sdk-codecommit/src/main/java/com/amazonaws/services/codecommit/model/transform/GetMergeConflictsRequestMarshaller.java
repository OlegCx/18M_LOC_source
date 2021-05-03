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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetMergeConflictsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetMergeConflictsRequestMarshaller {

    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<String> DESTINATIONCOMMITSPECIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationCommitSpecifier").build();
    private static final MarshallingInfo<String> SOURCECOMMITSPECIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCommitSpecifier").build();
    private static final MarshallingInfo<String> MERGEOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergeOption").build();
    private static final MarshallingInfo<String> CONFLICTDETAILLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictDetailLevel").build();
    private static final MarshallingInfo<Integer> MAXCONFLICTFILES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxConflictFiles").build();
    private static final MarshallingInfo<String> CONFLICTRESOLUTIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictResolutionStrategy").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();

    private static final GetMergeConflictsRequestMarshaller instance = new GetMergeConflictsRequestMarshaller();

    public static GetMergeConflictsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetMergeConflictsRequest getMergeConflictsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getMergeConflictsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getMergeConflictsRequest.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(getMergeConflictsRequest.getDestinationCommitSpecifier(), DESTINATIONCOMMITSPECIFIER_BINDING);
            protocolMarshaller.marshall(getMergeConflictsRequest.getSourceCommitSpecifier(), SOURCECOMMITSPECIFIER_BINDING);
            protocolMarshaller.marshall(getMergeConflictsRequest.getMergeOption(), MERGEOPTION_BINDING);
            protocolMarshaller.marshall(getMergeConflictsRequest.getConflictDetailLevel(), CONFLICTDETAILLEVEL_BINDING);
            protocolMarshaller.marshall(getMergeConflictsRequest.getMaxConflictFiles(), MAXCONFLICTFILES_BINDING);
            protocolMarshaller.marshall(getMergeConflictsRequest.getConflictResolutionStrategy(), CONFLICTRESOLUTIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(getMergeConflictsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

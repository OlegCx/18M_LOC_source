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
 * UpdatePullRequestApprovalStateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePullRequestApprovalStateRequestMarshaller {

    private static final MarshallingInfo<String> PULLREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullRequestId").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revisionId").build();
    private static final MarshallingInfo<String> APPROVALSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalState").build();

    private static final UpdatePullRequestApprovalStateRequestMarshaller instance = new UpdatePullRequestApprovalStateRequestMarshaller();

    public static UpdatePullRequestApprovalStateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePullRequestApprovalStateRequest updatePullRequestApprovalStateRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePullRequestApprovalStateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePullRequestApprovalStateRequest.getPullRequestId(), PULLREQUESTID_BINDING);
            protocolMarshaller.marshall(updatePullRequestApprovalStateRequest.getRevisionId(), REVISIONID_BINDING);
            protocolMarshaller.marshall(updatePullRequestApprovalStateRequest.getApprovalState(), APPROVALSTATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

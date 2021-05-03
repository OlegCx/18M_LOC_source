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
 * UpdateApprovalRuleTemplateContentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateApprovalRuleTemplateContentRequestMarshaller {

    private static final MarshallingInfo<String> APPROVALRULETEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleTemplateName").build();
    private static final MarshallingInfo<String> NEWRULECONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newRuleContent").build();
    private static final MarshallingInfo<String> EXISTINGRULECONTENTSHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("existingRuleContentSha256").build();

    private static final UpdateApprovalRuleTemplateContentRequestMarshaller instance = new UpdateApprovalRuleTemplateContentRequestMarshaller();

    public static UpdateApprovalRuleTemplateContentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateApprovalRuleTemplateContentRequest updateApprovalRuleTemplateContentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateApprovalRuleTemplateContentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateApprovalRuleTemplateContentRequest.getApprovalRuleTemplateName(), APPROVALRULETEMPLATENAME_BINDING);
            protocolMarshaller.marshall(updateApprovalRuleTemplateContentRequest.getNewRuleContent(), NEWRULECONTENT_BINDING);
            protocolMarshaller.marshall(updateApprovalRuleTemplateContentRequest.getExistingRuleContentSha256(), EXISTINGRULECONTENTSHA256_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

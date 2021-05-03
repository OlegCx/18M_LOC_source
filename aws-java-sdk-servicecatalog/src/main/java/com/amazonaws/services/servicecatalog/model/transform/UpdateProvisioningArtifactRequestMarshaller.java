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
package com.amazonaws.services.servicecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateProvisioningArtifactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateProvisioningArtifactRequestMarshaller {

    private static final MarshallingInfo<String> ACCEPTLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptLanguage").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
    private static final MarshallingInfo<String> PROVISIONINGARTIFACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningArtifactId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Boolean> ACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Active").build();
    private static final MarshallingInfo<String> GUIDANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Guidance").build();

    private static final UpdateProvisioningArtifactRequestMarshaller instance = new UpdateProvisioningArtifactRequestMarshaller();

    public static UpdateProvisioningArtifactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateProvisioningArtifactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateProvisioningArtifactRequest.getAcceptLanguage(), ACCEPTLANGUAGE_BINDING);
            protocolMarshaller.marshall(updateProvisioningArtifactRequest.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(updateProvisioningArtifactRequest.getProvisioningArtifactId(), PROVISIONINGARTIFACTID_BINDING);
            protocolMarshaller.marshall(updateProvisioningArtifactRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateProvisioningArtifactRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateProvisioningArtifactRequest.getActive(), ACTIVE_BINDING);
            protocolMarshaller.marshall(updateProvisioningArtifactRequest.getGuidance(), GUIDANCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

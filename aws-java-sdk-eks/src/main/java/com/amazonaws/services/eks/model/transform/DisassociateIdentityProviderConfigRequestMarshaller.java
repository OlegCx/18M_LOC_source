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
package com.amazonaws.services.eks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisassociateIdentityProviderConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisassociateIdentityProviderConfigRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> IDENTITYPROVIDERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityProviderConfig").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final DisassociateIdentityProviderConfigRequestMarshaller instance = new DisassociateIdentityProviderConfigRequestMarshaller();

    public static DisassociateIdentityProviderConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisassociateIdentityProviderConfigRequest disassociateIdentityProviderConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (disassociateIdentityProviderConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disassociateIdentityProviderConfigRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(disassociateIdentityProviderConfigRequest.getIdentityProviderConfig(), IDENTITYPROVIDERCONFIG_BINDING);
            protocolMarshaller.marshall(disassociateIdentityProviderConfigRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

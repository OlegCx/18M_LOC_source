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
package com.amazonaws.services.amplify.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplify.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDomainAssociationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDomainAssociationRequestMarshaller {

    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<Boolean> ENABLEAUTOSUBDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableAutoSubDomain").build();
    private static final MarshallingInfo<List> SUBDOMAINSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subDomainSettings").build();
    private static final MarshallingInfo<List> AUTOSUBDOMAINCREATIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoSubDomainCreationPatterns").build();
    private static final MarshallingInfo<String> AUTOSUBDOMAINIAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoSubDomainIAMRole").build();

    private static final CreateDomainAssociationRequestMarshaller instance = new CreateDomainAssociationRequestMarshaller();

    public static CreateDomainAssociationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDomainAssociationRequest createDomainAssociationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDomainAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDomainAssociationRequest.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(createDomainAssociationRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(createDomainAssociationRequest.getEnableAutoSubDomain(), ENABLEAUTOSUBDOMAIN_BINDING);
            protocolMarshaller.marshall(createDomainAssociationRequest.getSubDomainSettings(), SUBDOMAINSETTINGS_BINDING);
            protocolMarshaller.marshall(createDomainAssociationRequest.getAutoSubDomainCreationPatterns(), AUTOSUBDOMAINCREATIONPATTERNS_BINDING);
            protocolMarshaller.marshall(createDomainAssociationRequest.getAutoSubDomainIAMRole(), AUTOSUBDOMAINIAMROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

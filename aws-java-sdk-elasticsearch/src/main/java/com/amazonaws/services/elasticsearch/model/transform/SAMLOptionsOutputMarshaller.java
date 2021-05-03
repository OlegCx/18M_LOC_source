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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SAMLOptionsOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SAMLOptionsOutputMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<StructuredPojo> IDP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Idp").build();
    private static final MarshallingInfo<String> SUBJECTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubjectKey").build();
    private static final MarshallingInfo<String> ROLESKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RolesKey").build();
    private static final MarshallingInfo<Integer> SESSIONTIMEOUTMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionTimeoutMinutes").build();

    private static final SAMLOptionsOutputMarshaller instance = new SAMLOptionsOutputMarshaller();

    public static SAMLOptionsOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SAMLOptionsOutput sAMLOptionsOutput, ProtocolMarshaller protocolMarshaller) {

        if (sAMLOptionsOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sAMLOptionsOutput.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(sAMLOptionsOutput.getIdp(), IDP_BINDING);
            protocolMarshaller.marshall(sAMLOptionsOutput.getSubjectKey(), SUBJECTKEY_BINDING);
            protocolMarshaller.marshall(sAMLOptionsOutput.getRolesKey(), ROLESKEY_BINDING);
            protocolMarshaller.marshall(sAMLOptionsOutput.getSessionTimeoutMinutes(), SESSIONTIMEOUTMINUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

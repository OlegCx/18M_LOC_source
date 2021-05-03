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
package com.amazonaws.services.acmpca.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.acmpca.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IssueCertificateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IssueCertificateRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> APIPASSTHROUGH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiPassthrough").build();
    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityArn").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> CSR_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Csr").build();
    private static final MarshallingInfo<String> SIGNINGALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SigningAlgorithm").build();
    private static final MarshallingInfo<String> TEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateArn").build();
    private static final MarshallingInfo<StructuredPojo> VALIDITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Validity").build();
    private static final MarshallingInfo<StructuredPojo> VALIDITYNOTBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidityNotBefore").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdempotencyToken").build();

    private static final IssueCertificateRequestMarshaller instance = new IssueCertificateRequestMarshaller();

    public static IssueCertificateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IssueCertificateRequest issueCertificateRequest, ProtocolMarshaller protocolMarshaller) {

        if (issueCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(issueCertificateRequest.getApiPassthrough(), APIPASSTHROUGH_BINDING);
            protocolMarshaller.marshall(issueCertificateRequest.getCertificateAuthorityArn(), CERTIFICATEAUTHORITYARN_BINDING);
            protocolMarshaller.marshall(issueCertificateRequest.getCsr(), CSR_BINDING);
            protocolMarshaller.marshall(issueCertificateRequest.getSigningAlgorithm(), SIGNINGALGORITHM_BINDING);
            protocolMarshaller.marshall(issueCertificateRequest.getTemplateArn(), TEMPLATEARN_BINDING);
            protocolMarshaller.marshall(issueCertificateRequest.getValidity(), VALIDITY_BINDING);
            protocolMarshaller.marshall(issueCertificateRequest.getValidityNotBefore(), VALIDITYNOTBEFORE_BINDING);
            protocolMarshaller.marshall(issueCertificateRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

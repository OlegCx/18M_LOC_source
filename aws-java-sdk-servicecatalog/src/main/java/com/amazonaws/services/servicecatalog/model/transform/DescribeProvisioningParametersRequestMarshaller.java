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
 * DescribeProvisioningParametersRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeProvisioningParametersRequestMarshaller {

    private static final MarshallingInfo<String> ACCEPTLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptLanguage").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
    private static final MarshallingInfo<String> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductName").build();
    private static final MarshallingInfo<String> PROVISIONINGARTIFACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningArtifactId").build();
    private static final MarshallingInfo<String> PROVISIONINGARTIFACTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningArtifactName").build();
    private static final MarshallingInfo<String> PATHID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PathId").build();
    private static final MarshallingInfo<String> PATHNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PathName").build();

    private static final DescribeProvisioningParametersRequestMarshaller instance = new DescribeProvisioningParametersRequestMarshaller();

    public static DescribeProvisioningParametersRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeProvisioningParametersRequest describeProvisioningParametersRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeProvisioningParametersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeProvisioningParametersRequest.getAcceptLanguage(), ACCEPTLANGUAGE_BINDING);
            protocolMarshaller.marshall(describeProvisioningParametersRequest.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(describeProvisioningParametersRequest.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(describeProvisioningParametersRequest.getProvisioningArtifactId(), PROVISIONINGARTIFACTID_BINDING);
            protocolMarshaller.marshall(describeProvisioningParametersRequest.getProvisioningArtifactName(), PROVISIONINGARTIFACTNAME_BINDING);
            protocolMarshaller.marshall(describeProvisioningParametersRequest.getPathId(), PATHID_BINDING);
            protocolMarshaller.marshall(describeProvisioningParametersRequest.getPathName(), PATHNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

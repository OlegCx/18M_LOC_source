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
package com.amazonaws.services.dataexchange.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RequestDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RequestDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> EXPORTASSETTOSIGNEDURL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportAssetToSignedUrl").build();
    private static final MarshallingInfo<StructuredPojo> EXPORTASSETSTOS3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportAssetsToS3").build();
    private static final MarshallingInfo<StructuredPojo> EXPORTREVISIONSTOS3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportRevisionsToS3").build();
    private static final MarshallingInfo<StructuredPojo> IMPORTASSETFROMSIGNEDURL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportAssetFromSignedUrl").build();
    private static final MarshallingInfo<StructuredPojo> IMPORTASSETSFROMS3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportAssetsFromS3").build();

    private static final RequestDetailsMarshaller instance = new RequestDetailsMarshaller();

    public static RequestDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RequestDetails requestDetails, ProtocolMarshaller protocolMarshaller) {

        if (requestDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(requestDetails.getExportAssetToSignedUrl(), EXPORTASSETTOSIGNEDURL_BINDING);
            protocolMarshaller.marshall(requestDetails.getExportAssetsToS3(), EXPORTASSETSTOS3_BINDING);
            protocolMarshaller.marshall(requestDetails.getExportRevisionsToS3(), EXPORTREVISIONSTOS3_BINDING);
            protocolMarshaller.marshall(requestDetails.getImportAssetFromSignedUrl(), IMPORTASSETFROMSIGNEDURL_BINDING);
            protocolMarshaller.marshall(requestDetails.getImportAssetsFromS3(), IMPORTASSETSFROMS3_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

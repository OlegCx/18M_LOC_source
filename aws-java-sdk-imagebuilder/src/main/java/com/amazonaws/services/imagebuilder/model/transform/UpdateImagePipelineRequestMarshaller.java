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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateImagePipelineRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateImagePipelineRequestMarshaller {

    private static final MarshallingInfo<String> IMAGEPIPELINEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imagePipelineArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> IMAGERECIPEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageRecipeArn").build();
    private static final MarshallingInfo<String> CONTAINERRECIPEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerRecipeArn").build();
    private static final MarshallingInfo<String> INFRASTRUCTURECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("infrastructureConfigurationArn").build();
    private static final MarshallingInfo<String> DISTRIBUTIONCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("distributionConfigurationArn").build();
    private static final MarshallingInfo<StructuredPojo> IMAGETESTSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageTestsConfiguration").build();
    private static final MarshallingInfo<Boolean> ENHANCEDIMAGEMETADATAENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedImageMetadataEnabled").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schedule").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final UpdateImagePipelineRequestMarshaller instance = new UpdateImagePipelineRequestMarshaller();

    public static UpdateImagePipelineRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateImagePipelineRequest updateImagePipelineRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateImagePipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateImagePipelineRequest.getImagePipelineArn(), IMAGEPIPELINEARN_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getImageRecipeArn(), IMAGERECIPEARN_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getContainerRecipeArn(), CONTAINERRECIPEARN_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getInfrastructureConfigurationArn(), INFRASTRUCTURECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getDistributionConfigurationArn(), DISTRIBUTIONCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getImageTestsConfiguration(), IMAGETESTSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getEnhancedImageMetadataEnabled(), ENHANCEDIMAGEMETADATAENABLED_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(updateImagePipelineRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

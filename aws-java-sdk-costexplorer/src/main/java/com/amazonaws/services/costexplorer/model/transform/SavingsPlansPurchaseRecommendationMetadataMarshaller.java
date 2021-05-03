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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SavingsPlansPurchaseRecommendationMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlansPurchaseRecommendationMetadataMarshaller {

    private static final MarshallingInfo<String> RECOMMENDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationId").build();
    private static final MarshallingInfo<String> GENERATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationTimestamp").build();
    private static final MarshallingInfo<String> ADDITIONALMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalMetadata").build();

    private static final SavingsPlansPurchaseRecommendationMetadataMarshaller instance = new SavingsPlansPurchaseRecommendationMetadataMarshaller();

    public static SavingsPlansPurchaseRecommendationMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlansPurchaseRecommendationMetadata savingsPlansPurchaseRecommendationMetadata, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlansPurchaseRecommendationMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationMetadata.getRecommendationId(), RECOMMENDATIONID_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationMetadata.getGenerationTimestamp(), GENERATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationMetadata.getAdditionalMetadata(), ADDITIONALMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.comprehend.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchDetectKeyPhrasesItemResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchDetectKeyPhrasesItemResultMarshaller {

    private static final MarshallingInfo<Integer> INDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Index").build();
    private static final MarshallingInfo<List> KEYPHRASES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyPhrases").build();

    private static final BatchDetectKeyPhrasesItemResultMarshaller instance = new BatchDetectKeyPhrasesItemResultMarshaller();

    public static BatchDetectKeyPhrasesItemResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchDetectKeyPhrasesItemResult batchDetectKeyPhrasesItemResult, ProtocolMarshaller protocolMarshaller) {

        if (batchDetectKeyPhrasesItemResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchDetectKeyPhrasesItemResult.getIndex(), INDEX_BINDING);
            protocolMarshaller.marshall(batchDetectKeyPhrasesItemResult.getKeyPhrases(), KEYPHRASES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

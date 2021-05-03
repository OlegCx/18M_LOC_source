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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConditionCheckMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConditionCheckMarshaller {

    private static final MarshallingInfo<Map> KEY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Key").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<String> CONDITIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConditionExpression").build();
    private static final MarshallingInfo<Map> EXPRESSIONATTRIBUTENAMES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpressionAttributeNames").build();
    private static final MarshallingInfo<Map> EXPRESSIONATTRIBUTEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpressionAttributeValues").build();
    private static final MarshallingInfo<String> RETURNVALUESONCONDITIONCHECKFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReturnValuesOnConditionCheckFailure").build();

    private static final ConditionCheckMarshaller instance = new ConditionCheckMarshaller();

    public static ConditionCheckMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConditionCheck conditionCheck, ProtocolMarshaller protocolMarshaller) {

        if (conditionCheck == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conditionCheck.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(conditionCheck.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(conditionCheck.getConditionExpression(), CONDITIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(conditionCheck.getExpressionAttributeNames(), EXPRESSIONATTRIBUTENAMES_BINDING);
            protocolMarshaller.marshall(conditionCheck.getExpressionAttributeValues(), EXPRESSIONATTRIBUTEVALUES_BINDING);
            protocolMarshaller.marshall(conditionCheck.getReturnValuesOnConditionCheckFailure(), RETURNVALUESONCONDITIONCHECKFAILURE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

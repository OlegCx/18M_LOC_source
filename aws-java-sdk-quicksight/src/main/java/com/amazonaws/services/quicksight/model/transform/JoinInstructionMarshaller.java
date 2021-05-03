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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JoinInstructionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JoinInstructionMarshaller {

    private static final MarshallingInfo<String> LEFTOPERAND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LeftOperand").build();
    private static final MarshallingInfo<String> RIGHTOPERAND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RightOperand").build();
    private static final MarshallingInfo<StructuredPojo> LEFTJOINKEYPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LeftJoinKeyProperties").build();
    private static final MarshallingInfo<StructuredPojo> RIGHTJOINKEYPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RightJoinKeyProperties").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> ONCLAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OnClause").build();

    private static final JoinInstructionMarshaller instance = new JoinInstructionMarshaller();

    public static JoinInstructionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JoinInstruction joinInstruction, ProtocolMarshaller protocolMarshaller) {

        if (joinInstruction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(joinInstruction.getLeftOperand(), LEFTOPERAND_BINDING);
            protocolMarshaller.marshall(joinInstruction.getRightOperand(), RIGHTOPERAND_BINDING);
            protocolMarshaller.marshall(joinInstruction.getLeftJoinKeyProperties(), LEFTJOINKEYPROPERTIES_BINDING);
            protocolMarshaller.marshall(joinInstruction.getRightJoinKeyProperties(), RIGHTJOINKEYPROPERTIES_BINDING);
            protocolMarshaller.marshall(joinInstruction.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(joinInstruction.getOnClause(), ONCLAUSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

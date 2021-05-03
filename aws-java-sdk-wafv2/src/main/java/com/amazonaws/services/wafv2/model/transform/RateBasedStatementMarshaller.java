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
package com.amazonaws.services.wafv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RateBasedStatementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RateBasedStatementMarshaller {

    private static final MarshallingInfo<Long> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();
    private static final MarshallingInfo<String> AGGREGATEKEYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AggregateKeyType").build();
    private static final MarshallingInfo<StructuredPojo> SCOPEDOWNSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScopeDownStatement").build();
    private static final MarshallingInfo<StructuredPojo> FORWARDEDIPCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForwardedIPConfig").build();

    private static final RateBasedStatementMarshaller instance = new RateBasedStatementMarshaller();

    public static RateBasedStatementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RateBasedStatement rateBasedStatement, ProtocolMarshaller protocolMarshaller) {

        if (rateBasedStatement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rateBasedStatement.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(rateBasedStatement.getAggregateKeyType(), AGGREGATEKEYTYPE_BINDING);
            protocolMarshaller.marshall(rateBasedStatement.getScopeDownStatement(), SCOPEDOWNSTATEMENT_BINDING);
            protocolMarshaller.marshall(rateBasedStatement.getForwardedIPConfig(), FORWARDEDIPCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

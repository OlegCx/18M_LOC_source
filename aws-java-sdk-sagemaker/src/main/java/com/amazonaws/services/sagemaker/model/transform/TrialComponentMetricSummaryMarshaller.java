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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrialComponentMetricSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrialComponentMetricSummaryMarshaller {

    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceArn").build();
    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeStamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Double> MAX_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Max").build();
    private static final MarshallingInfo<Double> MIN_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Min").build();
    private static final MarshallingInfo<Double> LAST_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Last").build();
    private static final MarshallingInfo<Integer> COUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Count").build();
    private static final MarshallingInfo<Double> AVG_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Avg").build();
    private static final MarshallingInfo<Double> STDDEV_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StdDev").build();

    private static final TrialComponentMetricSummaryMarshaller instance = new TrialComponentMetricSummaryMarshaller();

    public static TrialComponentMetricSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrialComponentMetricSummary trialComponentMetricSummary, ProtocolMarshaller protocolMarshaller) {

        if (trialComponentMetricSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trialComponentMetricSummary.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(trialComponentMetricSummary.getSourceArn(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(trialComponentMetricSummary.getTimeStamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(trialComponentMetricSummary.getMax(), MAX_BINDING);
            protocolMarshaller.marshall(trialComponentMetricSummary.getMin(), MIN_BINDING);
            protocolMarshaller.marshall(trialComponentMetricSummary.getLast(), LAST_BINDING);
            protocolMarshaller.marshall(trialComponentMetricSummary.getCount(), COUNT_BINDING);
            protocolMarshaller.marshall(trialComponentMetricSummary.getAvg(), AVG_BINDING);
            protocolMarshaller.marshall(trialComponentMetricSummary.getStdDev(), STDDEV_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

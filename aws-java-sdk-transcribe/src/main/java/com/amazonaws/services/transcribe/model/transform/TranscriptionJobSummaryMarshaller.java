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
package com.amazonaws.services.transcribe.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TranscriptionJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TranscriptionJobSummaryMarshaller {

    private static final MarshallingInfo<String> TRANSCRIPTIONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranscriptionJobName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> TRANSCRIPTIONJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranscriptionJobStatus").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> OUTPUTLOCATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputLocationType").build();
    private static final MarshallingInfo<StructuredPojo> CONTENTREDACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentRedaction").build();
    private static final MarshallingInfo<StructuredPojo> MODELSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelSettings").build();
    private static final MarshallingInfo<Boolean> IDENTIFYLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentifyLanguage").build();
    private static final MarshallingInfo<Float> IDENTIFIEDLANGUAGESCORE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentifiedLanguageScore").build();

    private static final TranscriptionJobSummaryMarshaller instance = new TranscriptionJobSummaryMarshaller();

    public static TranscriptionJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TranscriptionJobSummary transcriptionJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (transcriptionJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transcriptionJobSummary.getTranscriptionJobName(), TRANSCRIPTIONJOBNAME_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getTranscriptionJobStatus(), TRANSCRIPTIONJOBSTATUS_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getOutputLocationType(), OUTPUTLOCATIONTYPE_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getContentRedaction(), CONTENTREDACTION_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getModelSettings(), MODELSETTINGS_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getIdentifyLanguage(), IDENTIFYLANGUAGE_BINDING);
            protocolMarshaller.marshall(transcriptionJobSummary.getIdentifiedLanguageScore(), IDENTIFIEDLANGUAGESCORE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

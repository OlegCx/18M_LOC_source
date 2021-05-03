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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartTranscriptionJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartTranscriptionJobRequestMarshaller {

    private static final MarshallingInfo<String> TRANSCRIPTIONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranscriptionJobName").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<Integer> MEDIASAMPLERATEHERTZ_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaSampleRateHertz").build();
    private static final MarshallingInfo<String> MEDIAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaFormat").build();
    private static final MarshallingInfo<StructuredPojo> MEDIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Media").build();
    private static final MarshallingInfo<String> OUTPUTBUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputBucketName").build();
    private static final MarshallingInfo<String> OUTPUTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputKey").build();
    private static final MarshallingInfo<String> OUTPUTENCRYPTIONKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputEncryptionKMSKeyId").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Settings").build();
    private static final MarshallingInfo<StructuredPojo> MODELSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelSettings").build();
    private static final MarshallingInfo<StructuredPojo> JOBEXECUTIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobExecutionSettings").build();
    private static final MarshallingInfo<StructuredPojo> CONTENTREDACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentRedaction").build();
    private static final MarshallingInfo<Boolean> IDENTIFYLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentifyLanguage").build();
    private static final MarshallingInfo<List> LANGUAGEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageOptions").build();

    private static final StartTranscriptionJobRequestMarshaller instance = new StartTranscriptionJobRequestMarshaller();

    public static StartTranscriptionJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartTranscriptionJobRequest startTranscriptionJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startTranscriptionJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startTranscriptionJobRequest.getTranscriptionJobName(), TRANSCRIPTIONJOBNAME_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getMediaSampleRateHertz(), MEDIASAMPLERATEHERTZ_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getMediaFormat(), MEDIAFORMAT_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getMedia(), MEDIA_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getOutputBucketName(), OUTPUTBUCKETNAME_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getOutputKey(), OUTPUTKEY_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getOutputEncryptionKMSKeyId(), OUTPUTENCRYPTIONKMSKEYID_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getModelSettings(), MODELSETTINGS_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getJobExecutionSettings(), JOBEXECUTIONSETTINGS_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getContentRedaction(), CONTENTREDACTION_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getIdentifyLanguage(), IDENTIFYLANGUAGE_BINDING);
            protocolMarshaller.marshall(startTranscriptionJobRequest.getLanguageOptions(), LANGUAGEOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

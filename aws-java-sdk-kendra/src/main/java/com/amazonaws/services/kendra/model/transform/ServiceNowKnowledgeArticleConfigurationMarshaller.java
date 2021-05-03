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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceNowKnowledgeArticleConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceNowKnowledgeArticleConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> CRAWLATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlAttachments").build();
    private static final MarshallingInfo<List> INCLUDEATTACHMENTFILEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeAttachmentFilePatterns").build();
    private static final MarshallingInfo<List> EXCLUDEATTACHMENTFILEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeAttachmentFilePatterns").build();
    private static final MarshallingInfo<String> DOCUMENTDATAFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentDataFieldName").build();
    private static final MarshallingInfo<String> DOCUMENTTITLEFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentTitleFieldName").build();
    private static final MarshallingInfo<List> FIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldMappings").build();
    private static final MarshallingInfo<String> FILTERQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterQuery").build();

    private static final ServiceNowKnowledgeArticleConfigurationMarshaller instance = new ServiceNowKnowledgeArticleConfigurationMarshaller();

    public static ServiceNowKnowledgeArticleConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceNowKnowledgeArticleConfiguration serviceNowKnowledgeArticleConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (serviceNowKnowledgeArticleConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceNowKnowledgeArticleConfiguration.getCrawlAttachments(), CRAWLATTACHMENTS_BINDING);
            protocolMarshaller.marshall(serviceNowKnowledgeArticleConfiguration.getIncludeAttachmentFilePatterns(), INCLUDEATTACHMENTFILEPATTERNS_BINDING);
            protocolMarshaller.marshall(serviceNowKnowledgeArticleConfiguration.getExcludeAttachmentFilePatterns(), EXCLUDEATTACHMENTFILEPATTERNS_BINDING);
            protocolMarshaller.marshall(serviceNowKnowledgeArticleConfiguration.getDocumentDataFieldName(), DOCUMENTDATAFIELDNAME_BINDING);
            protocolMarshaller.marshall(serviceNowKnowledgeArticleConfiguration.getDocumentTitleFieldName(), DOCUMENTTITLEFIELDNAME_BINDING);
            protocolMarshaller.marshall(serviceNowKnowledgeArticleConfiguration.getFieldMappings(), FIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(serviceNowKnowledgeArticleConfiguration.getFilterQuery(), FILTERQUERY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

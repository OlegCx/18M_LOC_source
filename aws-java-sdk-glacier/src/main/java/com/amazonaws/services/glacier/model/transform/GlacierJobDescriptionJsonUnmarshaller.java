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
package com.amazonaws.services.glacier.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GlacierJobDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlacierJobDescriptionJsonUnmarshaller implements Unmarshaller<GlacierJobDescription, JsonUnmarshallerContext> {

    public GlacierJobDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        GlacierJobDescription glacierJobDescription = new GlacierJobDescription();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDescription", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setJobDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveId", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setArchiveId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VaultARN", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setVaultARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Completed", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setCompleted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StatusCode", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveSizeInBytes", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setArchiveSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("InventorySizeInBytes", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setInventorySizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SNSTopic", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setSNSTopic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setCompletionDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SHA256TreeHash", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setSHA256TreeHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveSHA256TreeHash", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setArchiveSHA256TreeHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetrievalByteRange", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setRetrievalByteRange(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tier", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InventoryRetrievalParameters", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setInventoryRetrievalParameters(InventoryRetrievalJobDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobOutputPath", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setJobOutputPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectParameters", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setSelectParameters(SelectParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputLocation", targetDepth)) {
                    context.nextToken();
                    glacierJobDescription.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return glacierJobDescription;
    }

    private static GlacierJobDescriptionJsonUnmarshaller instance;

    public static GlacierJobDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GlacierJobDescriptionJsonUnmarshaller();
        return instance;
    }
}

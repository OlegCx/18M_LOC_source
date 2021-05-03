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
package com.amazonaws.services.dataexchange.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResponseDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseDetailsJsonUnmarshaller implements Unmarshaller<ResponseDetails, JsonUnmarshallerContext> {

    public ResponseDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResponseDetails responseDetails = new ResponseDetails();

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
                if (context.testExpression("ExportAssetToSignedUrl", targetDepth)) {
                    context.nextToken();
                    responseDetails.setExportAssetToSignedUrl(ExportAssetToSignedUrlResponseDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportAssetsToS3", targetDepth)) {
                    context.nextToken();
                    responseDetails.setExportAssetsToS3(ExportAssetsToS3ResponseDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportRevisionsToS3", targetDepth)) {
                    context.nextToken();
                    responseDetails.setExportRevisionsToS3(ExportRevisionsToS3ResponseDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImportAssetFromSignedUrl", targetDepth)) {
                    context.nextToken();
                    responseDetails.setImportAssetFromSignedUrl(ImportAssetFromSignedUrlResponseDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImportAssetsFromS3", targetDepth)) {
                    context.nextToken();
                    responseDetails.setImportAssetsFromS3(ImportAssetsFromS3ResponseDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return responseDetails;
    }

    private static ResponseDetailsJsonUnmarshaller instance;

    public static ResponseDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseDetailsJsonUnmarshaller();
        return instance;
    }
}

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
package com.amazonaws.services.codeartifact.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DomainDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainDescriptionJsonUnmarshaller implements Unmarshaller<DomainDescription, JsonUnmarshallerContext> {

    public DomainDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainDescription domainDescription = new DomainDescription();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    domainDescription.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    context.nextToken();
                    domainDescription.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    domainDescription.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    domainDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    domainDescription.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("encryptionKey", targetDepth)) {
                    context.nextToken();
                    domainDescription.setEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repositoryCount", targetDepth)) {
                    context.nextToken();
                    domainDescription.setRepositoryCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("assetSizeBytes", targetDepth)) {
                    context.nextToken();
                    domainDescription.setAssetSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("s3BucketArn", targetDepth)) {
                    context.nextToken();
                    domainDescription.setS3BucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainDescription;
    }

    private static DomainDescriptionJsonUnmarshaller instance;

    public static DomainDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainDescriptionJsonUnmarshaller();
        return instance;
    }
}

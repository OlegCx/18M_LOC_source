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
package com.amazonaws.services.lambda.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateFunctionCodeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFunctionCodeResultJsonUnmarshaller implements Unmarshaller<UpdateFunctionCodeResult, JsonUnmarshallerContext> {

    public UpdateFunctionCodeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateFunctionCodeResult updateFunctionCodeResult = new UpdateFunctionCodeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateFunctionCodeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FunctionName", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setFunctionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Runtime", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setRuntime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Handler", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setHandler(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeSize", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setCodeSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MemorySize", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setMemorySize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setLastModified(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeSha256", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setCodeSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setVpcConfig(VpcConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeadLetterConfig", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setDeadLetterConfig(DeadLetterConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setEnvironment(EnvironmentResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KMSKeyArn", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setKMSKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TracingConfig", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setTracingConfig(TracingConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MasterArn", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setMasterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RevisionId", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Layers", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setLayers(new ListUnmarshaller<Layer>(LayerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReasonCode", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setStateReasonCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateStatus", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setLastUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateStatusReason", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setLastUpdateStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateStatusReasonCode", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setLastUpdateStatusReasonCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSystemConfigs", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setFileSystemConfigs(new ListUnmarshaller<FileSystemConfig>(FileSystemConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PackageType", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setPackageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageConfigResponse", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setImageConfigResponse(ImageConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SigningProfileVersionArn", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setSigningProfileVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SigningJobArn", targetDepth)) {
                    context.nextToken();
                    updateFunctionCodeResult.setSigningJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateFunctionCodeResult;
    }

    private static UpdateFunctionCodeResultJsonUnmarshaller instance;

    public static UpdateFunctionCodeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateFunctionCodeResultJsonUnmarshaller();
        return instance;
    }
}

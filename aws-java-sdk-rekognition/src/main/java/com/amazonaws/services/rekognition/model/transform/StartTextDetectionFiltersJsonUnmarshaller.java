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
package com.amazonaws.services.rekognition.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartTextDetectionFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTextDetectionFiltersJsonUnmarshaller implements Unmarshaller<StartTextDetectionFilters, JsonUnmarshallerContext> {

    public StartTextDetectionFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartTextDetectionFilters startTextDetectionFilters = new StartTextDetectionFilters();

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
                if (context.testExpression("WordFilter", targetDepth)) {
                    context.nextToken();
                    startTextDetectionFilters.setWordFilter(DetectionFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegionsOfInterest", targetDepth)) {
                    context.nextToken();
                    startTextDetectionFilters.setRegionsOfInterest(new ListUnmarshaller<RegionOfInterest>(RegionOfInterestJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startTextDetectionFilters;
    }

    private static StartTextDetectionFiltersJsonUnmarshaller instance;

    public static StartTextDetectionFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartTextDetectionFiltersJsonUnmarshaller();
        return instance;
    }
}

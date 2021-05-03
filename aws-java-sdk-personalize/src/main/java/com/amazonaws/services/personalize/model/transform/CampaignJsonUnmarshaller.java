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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Campaign JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignJsonUnmarshaller implements Unmarshaller<Campaign, JsonUnmarshallerContext> {

    public Campaign unmarshall(JsonUnmarshallerContext context) throws Exception {
        Campaign campaign = new Campaign();

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
                    campaign.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("campaignArn", targetDepth)) {
                    context.nextToken();
                    campaign.setCampaignArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionVersionArn", targetDepth)) {
                    context.nextToken();
                    campaign.setSolutionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minProvisionedTPS", targetDepth)) {
                    context.nextToken();
                    campaign.setMinProvisionedTPS(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("campaignConfig", targetDepth)) {
                    context.nextToken();
                    campaign.setCampaignConfig(CampaignConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    campaign.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    campaign.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    campaign.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    campaign.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("latestCampaignUpdate", targetDepth)) {
                    context.nextToken();
                    campaign.setLatestCampaignUpdate(CampaignUpdateSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return campaign;
    }

    private static CampaignJsonUnmarshaller instance;

    public static CampaignJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CampaignJsonUnmarshaller();
        return instance;
    }
}

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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeTrainingJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrainingJobResultJsonUnmarshaller implements Unmarshaller<DescribeTrainingJobResult, JsonUnmarshallerContext> {

    public DescribeTrainingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTrainingJobResult describeTrainingJobResult = new DescribeTrainingJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTrainingJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TrainingJobName", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setTrainingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingJobArn", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setTrainingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TuningJobArn", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setTuningJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelingJobArn", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setLabelingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArn", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setAutoMLJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArtifacts", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setModelArtifacts(ModelArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingJobStatus", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setTrainingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecondaryStatus", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setSecondaryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameters", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setHyperParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AlgorithmSpecification", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setAlgorithmSpecification(AlgorithmSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setInputDataConfig(new ListUnmarshaller<Channel>(ChannelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setResourceConfig(ResourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setStoppingCondition(StoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingStartTime", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setTrainingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingEndTime", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setTrainingEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SecondaryStatusTransitions", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setSecondaryStatusTransitions(new ListUnmarshaller<SecondaryStatusTransition>(
                            SecondaryStatusTransitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FinalMetricDataList", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setFinalMetricDataList(new ListUnmarshaller<MetricData>(MetricDataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EnableNetworkIsolation", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setEnableNetworkIsolation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableInterContainerTrafficEncryption", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setEnableInterContainerTrafficEncryption(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableManagedSpotTraining", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setEnableManagedSpotTraining(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CheckpointConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setCheckpointConfig(CheckpointConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingTimeInSeconds", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setTrainingTimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BillableTimeInSeconds", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setBillableTimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DebugHookConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setDebugHookConfig(DebugHookConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExperimentConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setExperimentConfig(ExperimentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DebugRuleConfigurations", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setDebugRuleConfigurations(new ListUnmarshaller<DebugRuleConfiguration>(DebugRuleConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TensorBoardOutputConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setTensorBoardOutputConfig(TensorBoardOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DebugRuleEvaluationStatuses", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setDebugRuleEvaluationStatuses(new ListUnmarshaller<DebugRuleEvaluationStatus>(
                            DebugRuleEvaluationStatusJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProfilerConfig", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setProfilerConfig(ProfilerConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProfilerRuleConfigurations", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setProfilerRuleConfigurations(new ListUnmarshaller<ProfilerRuleConfiguration>(
                            ProfilerRuleConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProfilerRuleEvaluationStatuses", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setProfilerRuleEvaluationStatuses(new ListUnmarshaller<ProfilerRuleEvaluationStatus>(
                            ProfilerRuleEvaluationStatusJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProfilingStatus", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setProfilingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    describeTrainingJobResult.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeTrainingJobResult;
    }

    private static DescribeTrainingJobResultJsonUnmarshaller instance;

    public static DescribeTrainingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrainingJobResultJsonUnmarshaller();
        return instance;
    }
}

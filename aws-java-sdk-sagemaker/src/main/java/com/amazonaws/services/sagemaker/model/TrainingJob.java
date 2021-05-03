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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a training job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrainingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the training job.
     * </p>
     */
    private String trainingJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     */
    private String trainingJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a
     * hyperparameter tuning job.
     * </p>
     */
    private String tuningJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     */
    private String labelingJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     */
    private String autoMLJobArn;
    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing model artifacts.
     * </p>
     */
    private ModelArtifacts modelArtifacts;
    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     */
    private String trainingJobStatus;
    /**
     * <p>
     * Provides detailed information about the state of the training job. For detailed information about the secondary
     * status of the training job, see <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input mode.
     * It indicates that data is being downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     * <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     */
    private String secondaryStatus;
    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;
    /**
     * <p>
     * Information about the algorithm used for training, and algorithm metadata.
     * </p>
     */
    private AlgorithmSpecification algorithmSpecification;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the training job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;
    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates
     * subfolders for model artifacts.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * </p>
     */
    private ResourceConfig resourceConfig;
    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more information, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon
     * Virtual Private Cloud</a>.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker
     * ends the training job. Use this API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination
     * for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of
     * training are not lost.
     * </p>
     */
    private StoppingCondition stoppingCondition;
    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Indicates the time when the training job starts on training instances. You are billed for the time interval
     * between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be later
     * than this time. The difference is due to the time it takes to download the training data and to the size of the
     * training container.
     * </p>
     */
    private java.util.Date trainingStartTime;
    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     */
    private java.util.Date trainingEndTime;
    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * A history of all of the secondary statuses that the training job has transitioned through.
     * </p>
     */
    private java.util.List<SecondaryStatusTransition> secondaryStatusTransitions;
    /**
     * <p>
     * A list of final metric values that are set when the training job completes. Used only if the training job was
     * configured to use metrics.
     * </p>
     */
    private java.util.List<MetricData> finalMetricDataList;
    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>. If
     * network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     * </p>
     */
    private Boolean enableNetworkIsolation;
    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training.
     * </p>
     */
    private Boolean enableInterContainerTrafficEncryption;
    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     * on-demand instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     */
    private Boolean enableManagedSpotTraining;

    private CheckpointConfig checkpointConfig;
    /**
     * <p>
     * The training time in seconds.
     * </p>
     */
    private Integer trainingTimeInSeconds;
    /**
     * <p>
     * The billable time in seconds.
     * </p>
     */
    private Integer billableTimeInSeconds;

    private DebugHookConfig debugHookConfig;

    private ExperimentConfig experimentConfig;
    /**
     * <p>
     * Information about the debug rule configuration.
     * </p>
     */
    private java.util.List<DebugRuleConfiguration> debugRuleConfigurations;

    private TensorBoardOutputConfig tensorBoardOutputConfig;
    /**
     * <p>
     * Information about the evaluation status of the rules for the training job.
     * </p>
     */
    private java.util.List<DebugRuleEvaluationStatus> debugRuleEvaluationStatuses;
    /**
     * <p>
     * The environment variables to set in the Docker container.
     * </p>
     */
    private java.util.Map<String, String> environment;
    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the training job.
     * </p>
     * 
     * @param trainingJobName
     *        The name of the training job.
     */

    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of the training job.
     * </p>
     * 
     * @return The name of the training job.
     */

    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    /**
     * <p>
     * The name of the training job.
     * </p>
     * 
     * @param trainingJobName
     *        The name of the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTrainingJobName(String trainingJobName) {
        setTrainingJobName(trainingJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @param trainingJobArn
     *        The Amazon Resource Name (ARN) of the training job.
     */

    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training job.
     */

    public String getTrainingJobArn() {
        return this.trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @param trainingJobArn
     *        The Amazon Resource Name (ARN) of the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTrainingJobArn(String trainingJobArn) {
        setTrainingJobArn(trainingJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a
     * hyperparameter tuning job.
     * </p>
     * 
     * @param tuningJobArn
     *        The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was
     *        launched by a hyperparameter tuning job.
     */

    public void setTuningJobArn(String tuningJobArn) {
        this.tuningJobArn = tuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a
     * hyperparameter tuning job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was
     *         launched by a hyperparameter tuning job.
     */

    public String getTuningJobArn() {
        return this.tuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a
     * hyperparameter tuning job.
     * </p>
     * 
     * @param tuningJobArn
     *        The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was
     *        launched by a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTuningJobArn(String tuningJobArn) {
        setTuningJobArn(tuningJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) of the labeling job.
     */

    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the labeling job.
     */

    public String getLabelingJobArn() {
        return this.labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) of the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withLabelingJobArn(String labelingJobArn) {
        setLabelingJobArn(labelingJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The Amazon Resource Name (ARN) of the job.
     */

    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the job.
     */

    public String getAutoMLJobArn() {
        return this.autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The Amazon Resource Name (ARN) of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withAutoMLJobArn(String autoMLJobArn) {
        setAutoMLJobArn(autoMLJobArn);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing model artifacts.
     * </p>
     * 
     * @param modelArtifacts
     *        Information about the Amazon S3 location that is configured for storing model artifacts.
     */

    public void setModelArtifacts(ModelArtifacts modelArtifacts) {
        this.modelArtifacts = modelArtifacts;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing model artifacts.
     * </p>
     * 
     * @return Information about the Amazon S3 location that is configured for storing model artifacts.
     */

    public ModelArtifacts getModelArtifacts() {
        return this.modelArtifacts;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing model artifacts.
     * </p>
     * 
     * @param modelArtifacts
     *        Information about the Amazon S3 location that is configured for storing model artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withModelArtifacts(ModelArtifacts modelArtifacts) {
        setModelArtifacts(modelArtifacts);
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * 
     * @param trainingJobStatus
     *        The status of the training job.</p>
     *        <p>
     *        Training job statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The training job has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     *        <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - The training job is stopping.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The training job has stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more detailed information, see <code>SecondaryStatus</code>.
     * @see TrainingJobStatus
     */

    public void setTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * 
     * @return The status of the training job.</p>
     *         <p>
     *         Training job statuses are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>InProgress</code> - The training is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Completed</code> - The training job has completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     *         <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - The training job is stopping.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code> - The training job has stopped.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more detailed information, see <code>SecondaryStatus</code>.
     * @see TrainingJobStatus
     */

    public String getTrainingJobStatus() {
        return this.trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * 
     * @param trainingJobStatus
     *        The status of the training job.</p>
     *        <p>
     *        Training job statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The training job has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     *        <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - The training job is stopping.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The training job has stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more detailed information, see <code>SecondaryStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobStatus
     */

    public TrainingJob withTrainingJobStatus(String trainingJobStatus) {
        setTrainingJobStatus(trainingJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * 
     * @param trainingJobStatus
     *        The status of the training job.</p>
     *        <p>
     *        Training job statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The training job has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The training job has failed. To see the reason for the failure, see the
     *        <code>FailureReason</code> field in the response to a <code>DescribeTrainingJobResponse</code> call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - The training job is stopping.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The training job has stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more detailed information, see <code>SecondaryStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobStatus
     */

    public TrainingJob withTrainingJobStatus(TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For detailed information about the secondary
     * status of the training job, see <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input mode.
     * It indicates that data is being downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     * <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param secondaryStatus
     *        Provides detailed information about the state of the training job. For detailed information about the
     *        secondary status of the training job, see <code>StatusMessage</code> under
     *        <a>SecondaryStatusTransition</a>.</p>
     *        <p>
     *        Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     *        </p>
     *        <dl>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Starting</code> - Starting the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input
     *        mode. It indicates that data is being downloaded to the ML storage volumes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Training</code> - Training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3
     *        location.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The training job has completed.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     *        <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Stopped</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The training job has stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Stopping</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - Stopping the training job.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <important>
     *        <p>
     *        Valid values for <code>SecondaryStatus</code> are subject to change.
     *        </p>
     *        </important>
     *        <p>
     *        We no longer support the following secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LaunchingMLInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PreparingTrainingStack</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DownloadingTrainingImage</code>
     *        </p>
     *        </li>
     * @see SecondaryStatus
     */

    public void setSecondaryStatus(String secondaryStatus) {
        this.secondaryStatus = secondaryStatus;
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For detailed information about the secondary
     * status of the training job, see <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input mode.
     * It indicates that data is being downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     * <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Provides detailed information about the state of the training job. For detailed information about the
     *         secondary status of the training job, see <code>StatusMessage</code> under
     *         <a>SecondaryStatusTransition</a>.</p>
     *         <p>
     *         Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     *         </p>
     *         <dl>
     *         <dt>InProgress</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Starting</code> - Starting the training job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input
     *         mode. It indicates that data is being downloaded to the ML storage volumes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Training</code> - Training is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3
     *         location.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Completed</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Completed</code> - The training job has completed.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     *         <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Stopped</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code> - The training job has stopped.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Stopping</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - Stopping the training job.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         </dl>
     *         <important>
     *         <p>
     *         Valid values for <code>SecondaryStatus</code> are subject to change.
     *         </p>
     *         </important>
     *         <p>
     *         We no longer support the following secondary statuses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LaunchingMLInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PreparingTrainingStack</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DownloadingTrainingImage</code>
     *         </p>
     *         </li>
     * @see SecondaryStatus
     */

    public String getSecondaryStatus() {
        return this.secondaryStatus;
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For detailed information about the secondary
     * status of the training job, see <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input mode.
     * It indicates that data is being downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     * <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param secondaryStatus
     *        Provides detailed information about the state of the training job. For detailed information about the
     *        secondary status of the training job, see <code>StatusMessage</code> under
     *        <a>SecondaryStatusTransition</a>.</p>
     *        <p>
     *        Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     *        </p>
     *        <dl>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Starting</code> - Starting the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input
     *        mode. It indicates that data is being downloaded to the ML storage volumes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Training</code> - Training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3
     *        location.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The training job has completed.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     *        <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Stopped</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The training job has stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Stopping</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - Stopping the training job.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <important>
     *        <p>
     *        Valid values for <code>SecondaryStatus</code> are subject to change.
     *        </p>
     *        </important>
     *        <p>
     *        We no longer support the following secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LaunchingMLInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PreparingTrainingStack</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DownloadingTrainingImage</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecondaryStatus
     */

    public TrainingJob withSecondaryStatus(String secondaryStatus) {
        setSecondaryStatus(secondaryStatus);
        return this;
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For detailed information about the secondary
     * status of the training job, see <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input mode.
     * It indicates that data is being downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     * <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param secondaryStatus
     *        Provides detailed information about the state of the training job. For detailed information about the
     *        secondary status of the training job, see <code>StatusMessage</code> under
     *        <a>SecondaryStatusTransition</a>.</p>
     *        <p>
     *        Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:
     *        </p>
     *        <dl>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Starting</code> - Starting the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Downloading</code> - An optional stage for algorithms that support <code>File</code> training input
     *        mode. It indicates that data is being downloaded to the ML storage volumes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Training</code> - Training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Uploading</code> - Training is complete and the model artifacts are being uploaded to the S3
     *        location.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The training job has completed.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The training job has failed. The reason for the failure is returned in the
     *        <code>FailureReason</code> field of <code>DescribeTrainingJobResponse</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Stopped</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the maximum allowed runtime.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The training job has stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Stopping</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - Stopping the training job.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <important>
     *        <p>
     *        Valid values for <code>SecondaryStatus</code> are subject to change.
     *        </p>
     *        </important>
     *        <p>
     *        We no longer support the following secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LaunchingMLInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PreparingTrainingStack</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DownloadingTrainingImage</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecondaryStatus
     */

    public TrainingJob withSecondaryStatus(SecondaryStatus secondaryStatus) {
        this.secondaryStatus = secondaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the training job failed, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * 
     * @return If the training job failed, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the training job failed, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     * 
     * @return Algorithm-specific parameters.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    /**
     * Add a single HyperParameters entry
     *
     * @see TrainingJob#withHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob addHyperParametersEntry(String key, String value) {
        if (null == this.hyperParameters) {
            this.hyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.hyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.hyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm metadata.
     * </p>
     * 
     * @param algorithmSpecification
     *        Information about the algorithm used for training, and algorithm metadata.
     */

    public void setAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm metadata.
     * </p>
     * 
     * @return Information about the algorithm used for training, and algorithm metadata.
     */

    public AlgorithmSpecification getAlgorithmSpecification() {
        return this.algorithmSpecification;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm metadata.
     * </p>
     * 
     * @param algorithmSpecification
     *        Information about the algorithm used for training, and algorithm metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        setAlgorithmSpecification(algorithmSpecification);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the training job.
     * </p>
     * 
     * @param roleArn
     *        The AWS Identity and Access Management (IAM) role configured for the training job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the training job.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) role configured for the training job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the training job.
     * </p>
     * 
     * @param roleArn
     *        The AWS Identity and Access Management (IAM) role configured for the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     * 
     * @return An array of <code>Channel</code> objects that describes each data input channel.
     */

    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects that describes each data input channel.
     */

    public void setInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<Channel>(inputDataConfig);
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects that describes each data input channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withInputDataConfig(Channel... inputDataConfig) {
        if (this.inputDataConfig == null) {
            setInputDataConfig(new java.util.ArrayList<Channel>(inputDataConfig.length));
        }
        for (Channel ele : inputDataConfig) {
            this.inputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects that describes each data input channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates
     * subfolders for model artifacts.
     * </p>
     * 
     * @param outputDataConfig
     *        The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker
     *        creates subfolders for model artifacts.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates
     * subfolders for model artifacts.
     * </p>
     * 
     * @return The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker
     *         creates subfolders for model artifacts.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates
     * subfolders for model artifacts.
     * </p>
     * 
     * @param outputDataConfig
     *        The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker
     *        creates subfolders for model artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * </p>
     * 
     * @param resourceConfig
     *        Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     */

    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * </p>
     * 
     * @return Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     */

    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * </p>
     * 
     * @param resourceConfig
     *        Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withResourceConfig(ResourceConfig resourceConfig) {
        setResourceConfig(resourceConfig);
        return this;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more information, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon
     * Virtual Private Cloud</a>.
     * </p>
     * 
     * @param vpcConfig
     *        A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more
     *        information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training
     *        Jobs by Using an Amazon Virtual Private Cloud</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more information, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon
     * Virtual Private Cloud</a>.
     * </p>
     * 
     * @return A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more
     *         information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect
     *         Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more information, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon
     * Virtual Private Cloud</a>.
     * </p>
     * 
     * @param vpcConfig
     *        A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more
     *        information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training
     *        Jobs by Using an Amazon Virtual Private Cloud</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker
     * ends the training job. Use this API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination
     * for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of
     * training are not lost.
     * </p>
     * 
     * @param stoppingCondition
     *        Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon
     *        SageMaker ends the training job. Use this API to cap model training costs.</p>
     *        <p>
     *        To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job
     *        termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the
     *        results of training are not lost.
     */

    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker
     * ends the training job. Use this API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination
     * for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of
     * training are not lost.
     * </p>
     * 
     * @return Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon
     *         SageMaker ends the training job. Use this API to cap model training costs.</p>
     *         <p>
     *         To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job
     *         termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so
     *         the results of training are not lost.
     */

    public StoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker
     * ends the training job. Use this API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination
     * for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of
     * training are not lost.
     * </p>
     * 
     * @param stoppingCondition
     *        Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon
     *        SageMaker ends the training job. Use this API to cap model training costs.</p>
     *        <p>
     *        To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job
     *        termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the
     *        results of training are not lost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withStoppingCondition(StoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the training job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     * 
     * @return A timestamp that indicates when the training job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the training job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances. You are billed for the time interval
     * between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be later
     * than this time. The difference is due to the time it takes to download the training data and to the size of the
     * training container.
     * </p>
     * 
     * @param trainingStartTime
     *        Indicates the time when the training job starts on training instances. You are billed for the time
     *        interval between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch
     *        Logs might be later than this time. The difference is due to the time it takes to download the training
     *        data and to the size of the training container.
     */

    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances. You are billed for the time interval
     * between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be later
     * than this time. The difference is due to the time it takes to download the training data and to the size of the
     * training container.
     * </p>
     * 
     * @return Indicates the time when the training job starts on training instances. You are billed for the time
     *         interval between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch
     *         Logs might be later than this time. The difference is due to the time it takes to download the training
     *         data and to the size of the training container.
     */

    public java.util.Date getTrainingStartTime() {
        return this.trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances. You are billed for the time interval
     * between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be later
     * than this time. The difference is due to the time it takes to download the training data and to the size of the
     * training container.
     * </p>
     * 
     * @param trainingStartTime
     *        Indicates the time when the training job starts on training instances. You are billed for the time
     *        interval between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch
     *        Logs might be later than this time. The difference is due to the time it takes to download the training
     *        data and to the size of the training container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTrainingStartTime(java.util.Date trainingStartTime) {
        setTrainingStartTime(trainingStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @param trainingEndTime
     *        Indicates the time when the training job ends on training instances. You are billed for the time interval
     *        between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *        this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *        SageMaker detects a job failure.
     */

    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @return Indicates the time when the training job ends on training instances. You are billed for the time interval
     *         between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *         this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *         SageMaker detects a job failure.
     */

    public java.util.Date getTrainingEndTime() {
        return this.trainingEndTime;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @param trainingEndTime
     *        Indicates the time when the training job ends on training instances. You are billed for the time interval
     *        between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *        this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *        SageMaker detects a job failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTrainingEndTime(java.util.Date trainingEndTime) {
        setTrainingEndTime(trainingEndTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when the status of the training job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last modified.
     * </p>
     * 
     * @return A timestamp that indicates when the status of the training job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when the status of the training job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has transitioned through.
     * </p>
     * 
     * @return A history of all of the secondary statuses that the training job has transitioned through.
     */

    public java.util.List<SecondaryStatusTransition> getSecondaryStatusTransitions() {
        return secondaryStatusTransitions;
    }

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has transitioned through.
     * </p>
     * 
     * @param secondaryStatusTransitions
     *        A history of all of the secondary statuses that the training job has transitioned through.
     */

    public void setSecondaryStatusTransitions(java.util.Collection<SecondaryStatusTransition> secondaryStatusTransitions) {
        if (secondaryStatusTransitions == null) {
            this.secondaryStatusTransitions = null;
            return;
        }

        this.secondaryStatusTransitions = new java.util.ArrayList<SecondaryStatusTransition>(secondaryStatusTransitions);
    }

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has transitioned through.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryStatusTransitions(java.util.Collection)} or
     * {@link #withSecondaryStatusTransitions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param secondaryStatusTransitions
     *        A history of all of the secondary statuses that the training job has transitioned through.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withSecondaryStatusTransitions(SecondaryStatusTransition... secondaryStatusTransitions) {
        if (this.secondaryStatusTransitions == null) {
            setSecondaryStatusTransitions(new java.util.ArrayList<SecondaryStatusTransition>(secondaryStatusTransitions.length));
        }
        for (SecondaryStatusTransition ele : secondaryStatusTransitions) {
            this.secondaryStatusTransitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has transitioned through.
     * </p>
     * 
     * @param secondaryStatusTransitions
     *        A history of all of the secondary statuses that the training job has transitioned through.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withSecondaryStatusTransitions(java.util.Collection<SecondaryStatusTransition> secondaryStatusTransitions) {
        setSecondaryStatusTransitions(secondaryStatusTransitions);
        return this;
    }

    /**
     * <p>
     * A list of final metric values that are set when the training job completes. Used only if the training job was
     * configured to use metrics.
     * </p>
     * 
     * @return A list of final metric values that are set when the training job completes. Used only if the training job
     *         was configured to use metrics.
     */

    public java.util.List<MetricData> getFinalMetricDataList() {
        return finalMetricDataList;
    }

    /**
     * <p>
     * A list of final metric values that are set when the training job completes. Used only if the training job was
     * configured to use metrics.
     * </p>
     * 
     * @param finalMetricDataList
     *        A list of final metric values that are set when the training job completes. Used only if the training job
     *        was configured to use metrics.
     */

    public void setFinalMetricDataList(java.util.Collection<MetricData> finalMetricDataList) {
        if (finalMetricDataList == null) {
            this.finalMetricDataList = null;
            return;
        }

        this.finalMetricDataList = new java.util.ArrayList<MetricData>(finalMetricDataList);
    }

    /**
     * <p>
     * A list of final metric values that are set when the training job completes. Used only if the training job was
     * configured to use metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFinalMetricDataList(java.util.Collection)} or {@link #withFinalMetricDataList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param finalMetricDataList
     *        A list of final metric values that are set when the training job completes. Used only if the training job
     *        was configured to use metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withFinalMetricDataList(MetricData... finalMetricDataList) {
        if (this.finalMetricDataList == null) {
            setFinalMetricDataList(new java.util.ArrayList<MetricData>(finalMetricDataList.length));
        }
        for (MetricData ele : finalMetricDataList) {
            this.finalMetricDataList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of final metric values that are set when the training job completes. Used only if the training job was
     * configured to use metrics.
     * </p>
     * 
     * @param finalMetricDataList
     *        A list of final metric values that are set when the training job completes. Used only if the training job
     *        was configured to use metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withFinalMetricDataList(java.util.Collection<MetricData> finalMetricDataList) {
        setFinalMetricDataList(finalMetricDataList);
        return this;
    }

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>. If
     * network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     * </p>
     * 
     * @param enableNetworkIsolation
     *        If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>.
     *        If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     */

    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>. If
     * network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     * </p>
     * 
     * @return If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>
     *         . If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     */

    public Boolean getEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>. If
     * network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     * </p>
     * 
     * @param enableNetworkIsolation
     *        If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>.
     *        If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        setEnableNetworkIsolation(enableNetworkIsolation);
        return this;
    }

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>. If
     * network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     * </p>
     * 
     * @return If the <code>TrainingJob</code> was created with network isolation, the value is set to <code>true</code>
     *         . If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
     */

    public Boolean isEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training.
     * </p>
     * 
     * @param enableInterContainerTrafficEncryption
     *        To encrypt all communications between ML compute instances in distributed training, choose
     *        <code>True</code>. Encryption provides greater security for distributed training, but training might take
     *        longer. How long it takes depends on the amount of communication between compute instances, especially if
     *        you use a deep learning algorithm in distributed training.
     */

    public void setEnableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training.
     * </p>
     * 
     * @return To encrypt all communications between ML compute instances in distributed training, choose
     *         <code>True</code>. Encryption provides greater security for distributed training, but training might take
     *         longer. How long it takes depends on the amount of communication between compute instances, especially if
     *         you use a deep learning algorithm in distributed training.
     */

    public Boolean getEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training.
     * </p>
     * 
     * @param enableInterContainerTrafficEncryption
     *        To encrypt all communications between ML compute instances in distributed training, choose
     *        <code>True</code>. Encryption provides greater security for distributed training, but training might take
     *        longer. How long it takes depends on the amount of communication between compute instances, especially if
     *        you use a deep learning algorithm in distributed training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withEnableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
        setEnableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption);
        return this;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training.
     * </p>
     * 
     * @return To encrypt all communications between ML compute instances in distributed training, choose
     *         <code>True</code>. Encryption provides greater security for distributed training, but training might take
     *         longer. How long it takes depends on the amount of communication between compute instances, especially if
     *         you use a deep learning algorithm in distributed training.
     */

    public Boolean isEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     * on-demand instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     * 
     * @param enableManagedSpotTraining
     *        When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     *        on-demand instances. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     *        Training</a>.
     */

    public void setEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
        this.enableManagedSpotTraining = enableManagedSpotTraining;
    }

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     * on-demand instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     * 
     * @return When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     *         on-demand instances. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     *         Training</a>.
     */

    public Boolean getEnableManagedSpotTraining() {
        return this.enableManagedSpotTraining;
    }

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     * on-demand instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     * 
     * @param enableManagedSpotTraining
     *        When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     *        on-demand instances. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     *        Training</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
        setEnableManagedSpotTraining(enableManagedSpotTraining);
        return this;
    }

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     * on-demand instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     * 
     * @return When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of
     *         on-demand instances. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     *         Training</a>.
     */

    public Boolean isEnableManagedSpotTraining() {
        return this.enableManagedSpotTraining;
    }

    /**
     * @param checkpointConfig
     */

    public void setCheckpointConfig(CheckpointConfig checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
    }

    /**
     * @return
     */

    public CheckpointConfig getCheckpointConfig() {
        return this.checkpointConfig;
    }

    /**
     * @param checkpointConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withCheckpointConfig(CheckpointConfig checkpointConfig) {
        setCheckpointConfig(checkpointConfig);
        return this;
    }

    /**
     * <p>
     * The training time in seconds.
     * </p>
     * 
     * @param trainingTimeInSeconds
     *        The training time in seconds.
     */

    public void setTrainingTimeInSeconds(Integer trainingTimeInSeconds) {
        this.trainingTimeInSeconds = trainingTimeInSeconds;
    }

    /**
     * <p>
     * The training time in seconds.
     * </p>
     * 
     * @return The training time in seconds.
     */

    public Integer getTrainingTimeInSeconds() {
        return this.trainingTimeInSeconds;
    }

    /**
     * <p>
     * The training time in seconds.
     * </p>
     * 
     * @param trainingTimeInSeconds
     *        The training time in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTrainingTimeInSeconds(Integer trainingTimeInSeconds) {
        setTrainingTimeInSeconds(trainingTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The billable time in seconds.
     * </p>
     * 
     * @param billableTimeInSeconds
     *        The billable time in seconds.
     */

    public void setBillableTimeInSeconds(Integer billableTimeInSeconds) {
        this.billableTimeInSeconds = billableTimeInSeconds;
    }

    /**
     * <p>
     * The billable time in seconds.
     * </p>
     * 
     * @return The billable time in seconds.
     */

    public Integer getBillableTimeInSeconds() {
        return this.billableTimeInSeconds;
    }

    /**
     * <p>
     * The billable time in seconds.
     * </p>
     * 
     * @param billableTimeInSeconds
     *        The billable time in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withBillableTimeInSeconds(Integer billableTimeInSeconds) {
        setBillableTimeInSeconds(billableTimeInSeconds);
        return this;
    }

    /**
     * @param debugHookConfig
     */

    public void setDebugHookConfig(DebugHookConfig debugHookConfig) {
        this.debugHookConfig = debugHookConfig;
    }

    /**
     * @return
     */

    public DebugHookConfig getDebugHookConfig() {
        return this.debugHookConfig;
    }

    /**
     * @param debugHookConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withDebugHookConfig(DebugHookConfig debugHookConfig) {
        setDebugHookConfig(debugHookConfig);
        return this;
    }

    /**
     * @param experimentConfig
     */

    public void setExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
    }

    /**
     * @return
     */

    public ExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    /**
     * @param experimentConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withExperimentConfig(ExperimentConfig experimentConfig) {
        setExperimentConfig(experimentConfig);
        return this;
    }

    /**
     * <p>
     * Information about the debug rule configuration.
     * </p>
     * 
     * @return Information about the debug rule configuration.
     */

    public java.util.List<DebugRuleConfiguration> getDebugRuleConfigurations() {
        return debugRuleConfigurations;
    }

    /**
     * <p>
     * Information about the debug rule configuration.
     * </p>
     * 
     * @param debugRuleConfigurations
     *        Information about the debug rule configuration.
     */

    public void setDebugRuleConfigurations(java.util.Collection<DebugRuleConfiguration> debugRuleConfigurations) {
        if (debugRuleConfigurations == null) {
            this.debugRuleConfigurations = null;
            return;
        }

        this.debugRuleConfigurations = new java.util.ArrayList<DebugRuleConfiguration>(debugRuleConfigurations);
    }

    /**
     * <p>
     * Information about the debug rule configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDebugRuleConfigurations(java.util.Collection)} or
     * {@link #withDebugRuleConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param debugRuleConfigurations
     *        Information about the debug rule configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withDebugRuleConfigurations(DebugRuleConfiguration... debugRuleConfigurations) {
        if (this.debugRuleConfigurations == null) {
            setDebugRuleConfigurations(new java.util.ArrayList<DebugRuleConfiguration>(debugRuleConfigurations.length));
        }
        for (DebugRuleConfiguration ele : debugRuleConfigurations) {
            this.debugRuleConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the debug rule configuration.
     * </p>
     * 
     * @param debugRuleConfigurations
     *        Information about the debug rule configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withDebugRuleConfigurations(java.util.Collection<DebugRuleConfiguration> debugRuleConfigurations) {
        setDebugRuleConfigurations(debugRuleConfigurations);
        return this;
    }

    /**
     * @param tensorBoardOutputConfig
     */

    public void setTensorBoardOutputConfig(TensorBoardOutputConfig tensorBoardOutputConfig) {
        this.tensorBoardOutputConfig = tensorBoardOutputConfig;
    }

    /**
     * @return
     */

    public TensorBoardOutputConfig getTensorBoardOutputConfig() {
        return this.tensorBoardOutputConfig;
    }

    /**
     * @param tensorBoardOutputConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTensorBoardOutputConfig(TensorBoardOutputConfig tensorBoardOutputConfig) {
        setTensorBoardOutputConfig(tensorBoardOutputConfig);
        return this;
    }

    /**
     * <p>
     * Information about the evaluation status of the rules for the training job.
     * </p>
     * 
     * @return Information about the evaluation status of the rules for the training job.
     */

    public java.util.List<DebugRuleEvaluationStatus> getDebugRuleEvaluationStatuses() {
        return debugRuleEvaluationStatuses;
    }

    /**
     * <p>
     * Information about the evaluation status of the rules for the training job.
     * </p>
     * 
     * @param debugRuleEvaluationStatuses
     *        Information about the evaluation status of the rules for the training job.
     */

    public void setDebugRuleEvaluationStatuses(java.util.Collection<DebugRuleEvaluationStatus> debugRuleEvaluationStatuses) {
        if (debugRuleEvaluationStatuses == null) {
            this.debugRuleEvaluationStatuses = null;
            return;
        }

        this.debugRuleEvaluationStatuses = new java.util.ArrayList<DebugRuleEvaluationStatus>(debugRuleEvaluationStatuses);
    }

    /**
     * <p>
     * Information about the evaluation status of the rules for the training job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDebugRuleEvaluationStatuses(java.util.Collection)} or
     * {@link #withDebugRuleEvaluationStatuses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param debugRuleEvaluationStatuses
     *        Information about the evaluation status of the rules for the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withDebugRuleEvaluationStatuses(DebugRuleEvaluationStatus... debugRuleEvaluationStatuses) {
        if (this.debugRuleEvaluationStatuses == null) {
            setDebugRuleEvaluationStatuses(new java.util.ArrayList<DebugRuleEvaluationStatus>(debugRuleEvaluationStatuses.length));
        }
        for (DebugRuleEvaluationStatus ele : debugRuleEvaluationStatuses) {
            this.debugRuleEvaluationStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the evaluation status of the rules for the training job.
     * </p>
     * 
     * @param debugRuleEvaluationStatuses
     *        Information about the evaluation status of the rules for the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withDebugRuleEvaluationStatuses(java.util.Collection<DebugRuleEvaluationStatus> debugRuleEvaluationStatuses) {
        setDebugRuleEvaluationStatuses(debugRuleEvaluationStatuses);
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container.
     * </p>
     * 
     * @return The environment variables to set in the Docker container.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container.
     * </p>
     * 
     * @param environment
     *        The environment variables to set in the Docker container.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container.
     * </p>
     * 
     * @param environment
     *        The environment variables to set in the Docker container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see TrainingJob#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     * </p>
     * 
     * @return An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for
     *         example, by purpose, owner, or environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for
     *        example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for
     *        example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for
     *        example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJob withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: ").append(getTrainingJobName()).append(",");
        if (getTrainingJobArn() != null)
            sb.append("TrainingJobArn: ").append(getTrainingJobArn()).append(",");
        if (getTuningJobArn() != null)
            sb.append("TuningJobArn: ").append(getTuningJobArn()).append(",");
        if (getLabelingJobArn() != null)
            sb.append("LabelingJobArn: ").append(getLabelingJobArn()).append(",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: ").append(getAutoMLJobArn()).append(",");
        if (getModelArtifacts() != null)
            sb.append("ModelArtifacts: ").append(getModelArtifacts()).append(",");
        if (getTrainingJobStatus() != null)
            sb.append("TrainingJobStatus: ").append(getTrainingJobStatus()).append(",");
        if (getSecondaryStatus() != null)
            sb.append("SecondaryStatus: ").append(getSecondaryStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
        if (getAlgorithmSpecification() != null)
            sb.append("AlgorithmSpecification: ").append(getAlgorithmSpecification()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: ").append(getResourceConfig()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTrainingStartTime() != null)
            sb.append("TrainingStartTime: ").append(getTrainingStartTime()).append(",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: ").append(getTrainingEndTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getSecondaryStatusTransitions() != null)
            sb.append("SecondaryStatusTransitions: ").append(getSecondaryStatusTransitions()).append(",");
        if (getFinalMetricDataList() != null)
            sb.append("FinalMetricDataList: ").append(getFinalMetricDataList()).append(",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: ").append(getEnableNetworkIsolation()).append(",");
        if (getEnableInterContainerTrafficEncryption() != null)
            sb.append("EnableInterContainerTrafficEncryption: ").append(getEnableInterContainerTrafficEncryption()).append(",");
        if (getEnableManagedSpotTraining() != null)
            sb.append("EnableManagedSpotTraining: ").append(getEnableManagedSpotTraining()).append(",");
        if (getCheckpointConfig() != null)
            sb.append("CheckpointConfig: ").append(getCheckpointConfig()).append(",");
        if (getTrainingTimeInSeconds() != null)
            sb.append("TrainingTimeInSeconds: ").append(getTrainingTimeInSeconds()).append(",");
        if (getBillableTimeInSeconds() != null)
            sb.append("BillableTimeInSeconds: ").append(getBillableTimeInSeconds()).append(",");
        if (getDebugHookConfig() != null)
            sb.append("DebugHookConfig: ").append(getDebugHookConfig()).append(",");
        if (getExperimentConfig() != null)
            sb.append("ExperimentConfig: ").append(getExperimentConfig()).append(",");
        if (getDebugRuleConfigurations() != null)
            sb.append("DebugRuleConfigurations: ").append(getDebugRuleConfigurations()).append(",");
        if (getTensorBoardOutputConfig() != null)
            sb.append("TensorBoardOutputConfig: ").append(getTensorBoardOutputConfig()).append(",");
        if (getDebugRuleEvaluationStatuses() != null)
            sb.append("DebugRuleEvaluationStatuses: ").append(getDebugRuleEvaluationStatuses()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingJob == false)
            return false;
        TrainingJob other = (TrainingJob) obj;
        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getTrainingJobArn() == null ^ this.getTrainingJobArn() == null)
            return false;
        if (other.getTrainingJobArn() != null && other.getTrainingJobArn().equals(this.getTrainingJobArn()) == false)
            return false;
        if (other.getTuningJobArn() == null ^ this.getTuningJobArn() == null)
            return false;
        if (other.getTuningJobArn() != null && other.getTuningJobArn().equals(this.getTuningJobArn()) == false)
            return false;
        if (other.getLabelingJobArn() == null ^ this.getLabelingJobArn() == null)
            return false;
        if (other.getLabelingJobArn() != null && other.getLabelingJobArn().equals(this.getLabelingJobArn()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getModelArtifacts() == null ^ this.getModelArtifacts() == null)
            return false;
        if (other.getModelArtifacts() != null && other.getModelArtifacts().equals(this.getModelArtifacts()) == false)
            return false;
        if (other.getTrainingJobStatus() == null ^ this.getTrainingJobStatus() == null)
            return false;
        if (other.getTrainingJobStatus() != null && other.getTrainingJobStatus().equals(this.getTrainingJobStatus()) == false)
            return false;
        if (other.getSecondaryStatus() == null ^ this.getSecondaryStatus() == null)
            return false;
        if (other.getSecondaryStatus() != null && other.getSecondaryStatus().equals(this.getSecondaryStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null && other.getHyperParameters().equals(this.getHyperParameters()) == false)
            return false;
        if (other.getAlgorithmSpecification() == null ^ this.getAlgorithmSpecification() == null)
            return false;
        if (other.getAlgorithmSpecification() != null && other.getAlgorithmSpecification().equals(this.getAlgorithmSpecification()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTrainingStartTime() == null ^ this.getTrainingStartTime() == null)
            return false;
        if (other.getTrainingStartTime() != null && other.getTrainingStartTime().equals(this.getTrainingStartTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getSecondaryStatusTransitions() == null ^ this.getSecondaryStatusTransitions() == null)
            return false;
        if (other.getSecondaryStatusTransitions() != null && other.getSecondaryStatusTransitions().equals(this.getSecondaryStatusTransitions()) == false)
            return false;
        if (other.getFinalMetricDataList() == null ^ this.getFinalMetricDataList() == null)
            return false;
        if (other.getFinalMetricDataList() != null && other.getFinalMetricDataList().equals(this.getFinalMetricDataList()) == false)
            return false;
        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() == null ^ this.getEnableInterContainerTrafficEncryption() == null)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() != null
                && other.getEnableInterContainerTrafficEncryption().equals(this.getEnableInterContainerTrafficEncryption()) == false)
            return false;
        if (other.getEnableManagedSpotTraining() == null ^ this.getEnableManagedSpotTraining() == null)
            return false;
        if (other.getEnableManagedSpotTraining() != null && other.getEnableManagedSpotTraining().equals(this.getEnableManagedSpotTraining()) == false)
            return false;
        if (other.getCheckpointConfig() == null ^ this.getCheckpointConfig() == null)
            return false;
        if (other.getCheckpointConfig() != null && other.getCheckpointConfig().equals(this.getCheckpointConfig()) == false)
            return false;
        if (other.getTrainingTimeInSeconds() == null ^ this.getTrainingTimeInSeconds() == null)
            return false;
        if (other.getTrainingTimeInSeconds() != null && other.getTrainingTimeInSeconds().equals(this.getTrainingTimeInSeconds()) == false)
            return false;
        if (other.getBillableTimeInSeconds() == null ^ this.getBillableTimeInSeconds() == null)
            return false;
        if (other.getBillableTimeInSeconds() != null && other.getBillableTimeInSeconds().equals(this.getBillableTimeInSeconds()) == false)
            return false;
        if (other.getDebugHookConfig() == null ^ this.getDebugHookConfig() == null)
            return false;
        if (other.getDebugHookConfig() != null && other.getDebugHookConfig().equals(this.getDebugHookConfig()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
            return false;
        if (other.getDebugRuleConfigurations() == null ^ this.getDebugRuleConfigurations() == null)
            return false;
        if (other.getDebugRuleConfigurations() != null && other.getDebugRuleConfigurations().equals(this.getDebugRuleConfigurations()) == false)
            return false;
        if (other.getTensorBoardOutputConfig() == null ^ this.getTensorBoardOutputConfig() == null)
            return false;
        if (other.getTensorBoardOutputConfig() != null && other.getTensorBoardOutputConfig().equals(this.getTensorBoardOutputConfig()) == false)
            return false;
        if (other.getDebugRuleEvaluationStatuses() == null ^ this.getDebugRuleEvaluationStatuses() == null)
            return false;
        if (other.getDebugRuleEvaluationStatuses() != null && other.getDebugRuleEvaluationStatuses().equals(this.getDebugRuleEvaluationStatuses()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobArn() == null) ? 0 : getTrainingJobArn().hashCode());
        hashCode = prime * hashCode + ((getTuningJobArn() == null) ? 0 : getTuningJobArn().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobArn() == null) ? 0 : getLabelingJobArn().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode + ((getModelArtifacts() == null) ? 0 : getModelArtifacts().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobStatus() == null) ? 0 : getTrainingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getSecondaryStatus() == null) ? 0 : getSecondaryStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmSpecification() == null) ? 0 : getAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingStartTime() == null) ? 0 : getTrainingStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getSecondaryStatusTransitions() == null) ? 0 : getSecondaryStatusTransitions().hashCode());
        hashCode = prime * hashCode + ((getFinalMetricDataList() == null) ? 0 : getFinalMetricDataList().hashCode());
        hashCode = prime * hashCode + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation().hashCode());
        hashCode = prime * hashCode + ((getEnableInterContainerTrafficEncryption() == null) ? 0 : getEnableInterContainerTrafficEncryption().hashCode());
        hashCode = prime * hashCode + ((getEnableManagedSpotTraining() == null) ? 0 : getEnableManagedSpotTraining().hashCode());
        hashCode = prime * hashCode + ((getCheckpointConfig() == null) ? 0 : getCheckpointConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingTimeInSeconds() == null) ? 0 : getTrainingTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBillableTimeInSeconds() == null) ? 0 : getBillableTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDebugHookConfig() == null) ? 0 : getDebugHookConfig().hashCode());
        hashCode = prime * hashCode + ((getExperimentConfig() == null) ? 0 : getExperimentConfig().hashCode());
        hashCode = prime * hashCode + ((getDebugRuleConfigurations() == null) ? 0 : getDebugRuleConfigurations().hashCode());
        hashCode = prime * hashCode + ((getTensorBoardOutputConfig() == null) ? 0 : getTensorBoardOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getDebugRuleEvaluationStatuses() == null) ? 0 : getDebugRuleEvaluationStatuses().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TrainingJob clone() {
        try {
            return (TrainingJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrainingJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

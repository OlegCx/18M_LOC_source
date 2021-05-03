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
 * Defines the training jobs launched by a hyperparameter tuning job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTrainingJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTrainingJobDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job definition name.
     * </p>
     */
    private String definitionName;

    private HyperParameterTuningJobObjective tuningObjective;

    private ParameterRanges hyperParameterRanges;
    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning job.
     * </p>
     */
    private java.util.Map<String, String> staticHyperParameters;
    /**
     * <p>
     * The <a>HyperParameterAlgorithmSpecification</a> object that specifies the resource algorithm to use for the
     * training jobs that the tuning job launches.
     * </p>
     */
    private HyperParameterAlgorithmSpecification algorithmSpecification;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;
    /**
     * <p>
     * The <a>VpcConfig</a> object that specifies the VPC that you want the training jobs that this hyperparameter
     * tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training
     * Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning
     * job launches.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning
     * job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes
     * for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed training
     * algorithms, specify an instance count greater than 1.
     * </p>
     */
    private ResourceConfig resourceConfig;
    /**
     * <p>
     * Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you are
     * willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon SageMaker
     * ends the training job. Use this API to cap model training costs.
     * </p>
     */
    private StoppingCondition stoppingCondition;
    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If network isolation is used for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
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
     * A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (<code>False</code>).
     * </p>
     */
    private Boolean enableManagedSpotTraining;

    private CheckpointConfig checkpointConfig;

    /**
     * <p>
     * The job definition name.
     * </p>
     * 
     * @param definitionName
     *        The job definition name.
     */

    public void setDefinitionName(String definitionName) {
        this.definitionName = definitionName;
    }

    /**
     * <p>
     * The job definition name.
     * </p>
     * 
     * @return The job definition name.
     */

    public String getDefinitionName() {
        return this.definitionName;
    }

    /**
     * <p>
     * The job definition name.
     * </p>
     * 
     * @param definitionName
     *        The job definition name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withDefinitionName(String definitionName) {
        setDefinitionName(definitionName);
        return this;
    }

    /**
     * @param tuningObjective
     */

    public void setTuningObjective(HyperParameterTuningJobObjective tuningObjective) {
        this.tuningObjective = tuningObjective;
    }

    /**
     * @return
     */

    public HyperParameterTuningJobObjective getTuningObjective() {
        return this.tuningObjective;
    }

    /**
     * @param tuningObjective
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withTuningObjective(HyperParameterTuningJobObjective tuningObjective) {
        setTuningObjective(tuningObjective);
        return this;
    }

    /**
     * @param hyperParameterRanges
     */

    public void setHyperParameterRanges(ParameterRanges hyperParameterRanges) {
        this.hyperParameterRanges = hyperParameterRanges;
    }

    /**
     * @return
     */

    public ParameterRanges getHyperParameterRanges() {
        return this.hyperParameterRanges;
    }

    /**
     * @param hyperParameterRanges
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withHyperParameterRanges(ParameterRanges hyperParameterRanges) {
        setHyperParameterRanges(hyperParameterRanges);
        return this;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning job.
     * </p>
     * 
     * @return Specifies the values of hyperparameters that do not change for the tuning job.
     */

    public java.util.Map<String, String> getStaticHyperParameters() {
        return staticHyperParameters;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning job.
     * </p>
     * 
     * @param staticHyperParameters
     *        Specifies the values of hyperparameters that do not change for the tuning job.
     */

    public void setStaticHyperParameters(java.util.Map<String, String> staticHyperParameters) {
        this.staticHyperParameters = staticHyperParameters;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning job.
     * </p>
     * 
     * @param staticHyperParameters
     *        Specifies the values of hyperparameters that do not change for the tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withStaticHyperParameters(java.util.Map<String, String> staticHyperParameters) {
        setStaticHyperParameters(staticHyperParameters);
        return this;
    }

    /**
     * Add a single StaticHyperParameters entry
     *
     * @see HyperParameterTrainingJobDefinition#withStaticHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition addStaticHyperParametersEntry(String key, String value) {
        if (null == this.staticHyperParameters) {
            this.staticHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.staticHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.staticHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StaticHyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition clearStaticHyperParametersEntries() {
        this.staticHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterAlgorithmSpecification</a> object that specifies the resource algorithm to use for the
     * training jobs that the tuning job launches.
     * </p>
     * 
     * @param algorithmSpecification
     *        The <a>HyperParameterAlgorithmSpecification</a> object that specifies the resource algorithm to use for
     *        the training jobs that the tuning job launches.
     */

    public void setAlgorithmSpecification(HyperParameterAlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * The <a>HyperParameterAlgorithmSpecification</a> object that specifies the resource algorithm to use for the
     * training jobs that the tuning job launches.
     * </p>
     * 
     * @return The <a>HyperParameterAlgorithmSpecification</a> object that specifies the resource algorithm to use for
     *         the training jobs that the tuning job launches.
     */

    public HyperParameterAlgorithmSpecification getAlgorithmSpecification() {
        return this.algorithmSpecification;
    }

    /**
     * <p>
     * The <a>HyperParameterAlgorithmSpecification</a> object that specifies the resource algorithm to use for the
     * training jobs that the tuning job launches.
     * </p>
     * 
     * @param algorithmSpecification
     *        The <a>HyperParameterAlgorithmSpecification</a> object that specifies the resource algorithm to use for
     *        the training jobs that the tuning job launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withAlgorithmSpecification(HyperParameterAlgorithmSpecification algorithmSpecification) {
        setAlgorithmSpecification(algorithmSpecification);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job
     *        launches.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job
     *         launches.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job
     *        launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     * 
     * @return An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job
     *         launches.
     */

    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job
     *        launches.
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
     * An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job
     *        launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withInputDataConfig(Channel... inputDataConfig) {
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
     * An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <a>Channel</a> objects that specify the input for the training jobs that the tuning job
     *        launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The <a>VpcConfig</a> object that specifies the VPC that you want the training jobs that this hyperparameter
     * tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training
     * Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @param vpcConfig
     *        The <a>VpcConfig</a> object that specifies the VPC that you want the training jobs that this
     *        hyperparameter tuning job launches to connect to. Control access to and from your training container by
     *        configuring the VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an
     *        Amazon Virtual Private Cloud</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The <a>VpcConfig</a> object that specifies the VPC that you want the training jobs that this hyperparameter
     * tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training
     * Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @return The <a>VpcConfig</a> object that specifies the VPC that you want the training jobs that this
     *         hyperparameter tuning job launches to connect to. Control access to and from your training container by
     *         configuring the VPC. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an
     *         Amazon Virtual Private Cloud</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The <a>VpcConfig</a> object that specifies the VPC that you want the training jobs that this hyperparameter
     * tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training
     * Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @param vpcConfig
     *        The <a>VpcConfig</a> object that specifies the VPC that you want the training jobs that this
     *        hyperparameter tuning job launches to connect to. Control access to and from your training container by
     *        configuring the VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an
     *        Amazon Virtual Private Cloud</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning
     * job launches.
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the
     *        tuning job launches.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning
     * job launches.
     * </p>
     * 
     * @return Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that
     *         the tuning job launches.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning
     * job launches.
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the
     *        tuning job launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning
     * job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes
     * for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed training
     * algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @param resourceConfig
     *        The resources, including the compute instances and storage volumes, to use for the training jobs that the
     *        tuning job launches.</p>
     *        <p>
     *        Storage volumes store model artifacts and incremental states. Training algorithms might also use storage
     *        volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training
     *        data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For
     *        distributed training algorithms, specify an instance count greater than 1.
     */

    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning
     * job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes
     * for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed training
     * algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @return The resources, including the compute instances and storage volumes, to use for the training jobs that the
     *         tuning job launches.</p>
     *         <p>
     *         Storage volumes store model artifacts and incremental states. Training algorithms might also use storage
     *         volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training
     *         data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For
     *         distributed training algorithms, specify an instance count greater than 1.
     */

    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning
     * job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes
     * for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed training
     * algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @param resourceConfig
     *        The resources, including the compute instances and storage volumes, to use for the training jobs that the
     *        tuning job launches.</p>
     *        <p>
     *        Storage volumes store model artifacts and incremental states. Training algorithms might also use storage
     *        volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training
     *        data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For
     *        distributed training algorithms, specify an instance count greater than 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withResourceConfig(ResourceConfig resourceConfig) {
        setResourceConfig(resourceConfig);
        return this;
    }

    /**
     * <p>
     * Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you are
     * willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon SageMaker
     * ends the training job. Use this API to cap model training costs.
     * </p>
     * 
     * @param stoppingCondition
     *        Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you
     *        are willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon
     *        SageMaker ends the training job. Use this API to cap model training costs.
     */

    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you are
     * willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon SageMaker
     * ends the training job. Use this API to cap model training costs.
     * </p>
     * 
     * @return Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you
     *         are willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon
     *         SageMaker ends the training job. Use this API to cap model training costs.
     */

    public StoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you are
     * willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon SageMaker
     * ends the training job. Use this API to cap model training costs.
     * </p>
     * 
     * @param stoppingCondition
     *        Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you
     *        are willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon
     *        SageMaker ends the training job. Use this API to cap model training costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withStoppingCondition(StoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If network isolation is used for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * 
     * @param enableNetworkIsolation
     *        Isolates the training container. No inbound or outbound network calls can be made, except for calls
     *        between peers within a training cluster for distributed training. If network isolation is used for
     *        training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and
     *        model artifacts through the specified VPC, but the training container does not have network access.
     */

    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If network isolation is used for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * 
     * @return Isolates the training container. No inbound or outbound network calls can be made, except for calls
     *         between peers within a training cluster for distributed training. If network isolation is used for
     *         training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and
     *         model artifacts through the specified VPC, but the training container does not have network access.
     */

    public Boolean getEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If network isolation is used for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * 
     * @param enableNetworkIsolation
     *        Isolates the training container. No inbound or outbound network calls can be made, except for calls
     *        between peers within a training cluster for distributed training. If network isolation is used for
     *        training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and
     *        model artifacts through the specified VPC, but the training container does not have network access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        setEnableNetworkIsolation(enableNetworkIsolation);
        return this;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If network isolation is used for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * 
     * @return Isolates the training container. No inbound or outbound network calls can be made, except for calls
     *         between peers within a training cluster for distributed training. If network isolation is used for
     *         training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and
     *         model artifacts through the specified VPC, but the training container does not have network access.
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

    public HyperParameterTrainingJobDefinition withEnableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
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
     * A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (<code>False</code>).
     * </p>
     * 
     * @param enableManagedSpotTraining
     *        A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (
     *        <code>False</code>).
     */

    public void setEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
        this.enableManagedSpotTraining = enableManagedSpotTraining;
    }

    /**
     * <p>
     * A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (<code>False</code>).
     * </p>
     * 
     * @return A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (
     *         <code>False</code>).
     */

    public Boolean getEnableManagedSpotTraining() {
        return this.enableManagedSpotTraining;
    }

    /**
     * <p>
     * A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (<code>False</code>).
     * </p>
     * 
     * @param enableManagedSpotTraining
     *        A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (
     *        <code>False</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
        setEnableManagedSpotTraining(enableManagedSpotTraining);
        return this;
    }

    /**
     * <p>
     * A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (<code>False</code>).
     * </p>
     * 
     * @return A Boolean indicating whether managed spot training is enabled (<code>True</code>) or not (
     *         <code>False</code>).
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

    public HyperParameterTrainingJobDefinition withCheckpointConfig(CheckpointConfig checkpointConfig) {
        setCheckpointConfig(checkpointConfig);
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
        if (getDefinitionName() != null)
            sb.append("DefinitionName: ").append(getDefinitionName()).append(",");
        if (getTuningObjective() != null)
            sb.append("TuningObjective: ").append(getTuningObjective()).append(",");
        if (getHyperParameterRanges() != null)
            sb.append("HyperParameterRanges: ").append(getHyperParameterRanges()).append(",");
        if (getStaticHyperParameters() != null)
            sb.append("StaticHyperParameters: ").append(getStaticHyperParameters()).append(",");
        if (getAlgorithmSpecification() != null)
            sb.append("AlgorithmSpecification: ").append(getAlgorithmSpecification()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: ").append(getResourceConfig()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: ").append(getEnableNetworkIsolation()).append(",");
        if (getEnableInterContainerTrafficEncryption() != null)
            sb.append("EnableInterContainerTrafficEncryption: ").append(getEnableInterContainerTrafficEncryption()).append(",");
        if (getEnableManagedSpotTraining() != null)
            sb.append("EnableManagedSpotTraining: ").append(getEnableManagedSpotTraining()).append(",");
        if (getCheckpointConfig() != null)
            sb.append("CheckpointConfig: ").append(getCheckpointConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTrainingJobDefinition == false)
            return false;
        HyperParameterTrainingJobDefinition other = (HyperParameterTrainingJobDefinition) obj;
        if (other.getDefinitionName() == null ^ this.getDefinitionName() == null)
            return false;
        if (other.getDefinitionName() != null && other.getDefinitionName().equals(this.getDefinitionName()) == false)
            return false;
        if (other.getTuningObjective() == null ^ this.getTuningObjective() == null)
            return false;
        if (other.getTuningObjective() != null && other.getTuningObjective().equals(this.getTuningObjective()) == false)
            return false;
        if (other.getHyperParameterRanges() == null ^ this.getHyperParameterRanges() == null)
            return false;
        if (other.getHyperParameterRanges() != null && other.getHyperParameterRanges().equals(this.getHyperParameterRanges()) == false)
            return false;
        if (other.getStaticHyperParameters() == null ^ this.getStaticHyperParameters() == null)
            return false;
        if (other.getStaticHyperParameters() != null && other.getStaticHyperParameters().equals(this.getStaticHyperParameters()) == false)
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
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefinitionName() == null) ? 0 : getDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getTuningObjective() == null) ? 0 : getTuningObjective().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterRanges() == null) ? 0 : getHyperParameterRanges().hashCode());
        hashCode = prime * hashCode + ((getStaticHyperParameters() == null) ? 0 : getStaticHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmSpecification() == null) ? 0 : getAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation().hashCode());
        hashCode = prime * hashCode + ((getEnableInterContainerTrafficEncryption() == null) ? 0 : getEnableInterContainerTrafficEncryption().hashCode());
        hashCode = prime * hashCode + ((getEnableManagedSpotTraining() == null) ? 0 : getEnableManagedSpotTraining().hashCode());
        hashCode = prime * hashCode + ((getCheckpointConfig() == null) ? 0 : getCheckpointConfig().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTrainingJobDefinition clone() {
        try {
            return (HyperParameterTrainingJobDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTrainingJobDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

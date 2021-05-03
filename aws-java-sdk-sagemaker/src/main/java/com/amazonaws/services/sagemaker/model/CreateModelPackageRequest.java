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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelPackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * <p>
     * This parameter is required for unversioned models. It is not applicable to versioned models.
     * </p>
     */
    private String modelPackageName;
    /**
     * <p>
     * The name of the model group that this model version belongs to.
     * </p>
     * <p>
     * This parameter is required for versioned models, and does not apply to unversioned models.
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * A description of the model package.
     * </p>
     */
    private String modelPackageDescription;
    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based on this model package, including the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the model package supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for inference.
     * </p>
     * </li>
     * </ul>
     */
    private InferenceSpecification inferenceSpecification;
    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     */
    private ModelPackageValidationSpecification validationSpecification;
    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     */
    private SourceAlgorithmSpecification sourceAlgorithmSpecification;
    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     */
    private Boolean certifyForMarketplace;
    /**
     * <p>
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the <i>AWS
     * General Reference Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     */
    private String modelApprovalStatus;

    private MetadataProperties metadataProperties;
    /**
     * <p>
     * A structure that contains model metrics reports.
     * </p>
     */
    private ModelMetrics modelMetrics;
    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * <p>
     * This parameter is required for unversioned models. It is not applicable to versioned models.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *        and - (hyphen).</p>
     *        <p>
     *        This parameter is required for unversioned models. It is not applicable to versioned models.
     */

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * <p>
     * This parameter is required for unversioned models. It is not applicable to versioned models.
     * </p>
     * 
     * @return The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *         and - (hyphen).</p>
     *         <p>
     *         This parameter is required for unversioned models. It is not applicable to versioned models.
     */

    public String getModelPackageName() {
        return this.modelPackageName;
    }

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * <p>
     * This parameter is required for unversioned models. It is not applicable to versioned models.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *        and - (hyphen).</p>
     *        <p>
     *        This parameter is required for unversioned models. It is not applicable to versioned models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelPackageName(String modelPackageName) {
        setModelPackageName(modelPackageName);
        return this;
    }

    /**
     * <p>
     * The name of the model group that this model version belongs to.
     * </p>
     * <p>
     * This parameter is required for versioned models, and does not apply to unversioned models.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name of the model group that this model version belongs to.</p>
     *        <p>
     *        This parameter is required for versioned models, and does not apply to unversioned models.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * The name of the model group that this model version belongs to.
     * </p>
     * <p>
     * This parameter is required for versioned models, and does not apply to unversioned models.
     * </p>
     * 
     * @return The name of the model group that this model version belongs to.</p>
     *         <p>
     *         This parameter is required for versioned models, and does not apply to unversioned models.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * The name of the model group that this model version belongs to.
     * </p>
     * <p>
     * This parameter is required for versioned models, and does not apply to unversioned models.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name of the model group that this model version belongs to.</p>
     *        <p>
     *        This parameter is required for versioned models, and does not apply to unversioned models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        A description of the model package.
     */

    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * 
     * @return A description of the model package.
     */

    public String getModelPackageDescription() {
        return this.modelPackageDescription;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        A description of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelPackageDescription(String modelPackageDescription) {
        setModelPackageDescription(modelPackageDescription);
        return this;
    }

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based on this model package, including the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the model package supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceSpecification
     *        Specifies details about inference jobs that can be run with models based on this model package, including
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance types that the model package supports for transform jobs and real-time endpoints used for
     *        inference.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The input and output content formats that the model package supports for inference.
     *        </p>
     *        </li>
     */

    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based on this model package, including the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the model package supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies details about inference jobs that can be run with models based on this model package, including
     *         the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance types that the model package supports for transform jobs and real-time endpoints used for
     *         inference.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The input and output content formats that the model package supports for inference.
     *         </p>
     *         </li>
     */

    public InferenceSpecification getInferenceSpecification() {
        return this.inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based on this model package, including the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the model package supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceSpecification
     *        Specifies details about inference jobs that can be run with models based on this model package, including
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance types that the model package supports for transform jobs and real-time endpoints used for
     *        inference.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The input and output content formats that the model package supports for inference.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withInferenceSpecification(InferenceSpecification inferenceSpecification) {
        setInferenceSpecification(inferenceSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model
     *        package.
     */

    public void setValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @return Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model
     *         package.
     */

    public ModelPackageValidationSpecification getValidationSpecification() {
        return this.validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model
     *        package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        setValidationSpecification(validationSpecification);
        return this;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     * 
     * @param sourceAlgorithmSpecification
     *        Details about the algorithm that was used to create the model package.
     */

    public void setSourceAlgorithmSpecification(SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        this.sourceAlgorithmSpecification = sourceAlgorithmSpecification;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     * 
     * @return Details about the algorithm that was used to create the model package.
     */

    public SourceAlgorithmSpecification getSourceAlgorithmSpecification() {
        return this.sourceAlgorithmSpecification;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     * 
     * @param sourceAlgorithmSpecification
     *        Details about the algorithm that was used to create the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withSourceAlgorithmSpecification(SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        setSourceAlgorithmSpecification(sourceAlgorithmSpecification);
        return this;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether to certify the model package for listing on AWS Marketplace.</p>
     *        <p>
     *        This parameter is optional for unversioned models, and does not apply to versioned models.
     */

    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     * 
     * @return Whether to certify the model package for listing on AWS Marketplace.</p>
     *         <p>
     *         This parameter is optional for unversioned models, and does not apply to versioned models.
     */

    public Boolean getCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether to certify the model package for listing on AWS Marketplace.</p>
     *        <p>
     *        This parameter is optional for unversioned models, and does not apply to versioned models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withCertifyForMarketplace(Boolean certifyForMarketplace) {
        setCertifyForMarketplace(certifyForMarketplace);
        return this;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     * 
     * @return Whether to certify the model package for listing on AWS Marketplace.</p>
     *         <p>
     *         This parameter is optional for unversioned models, and does not apply to versioned models.
     */

    public Boolean isCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the <i>AWS
     * General Reference Guide</i>.
     * </p>
     * 
     * @return A list of key value pairs associated with the model. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the
     *         <i>AWS General Reference Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the <i>AWS
     * General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the
     *        <i>AWS General Reference Guide</i>.
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
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the <i>AWS
     * General Reference Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the
     *        <i>AWS General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withTags(Tag... tags) {
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
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the <i>AWS
     * General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a> in the
     *        <i>AWS General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        Whether the model is approved for deployment.</p>
     *        <p>
     *        This parameter is optional for versioned models, and does not apply to unversioned models.
     *        </p>
     *        <p>
     *        For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the
     *        model.
     * @see ModelApprovalStatus
     */

    public void setModelApprovalStatus(String modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus;
    }

    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     * 
     * @return Whether the model is approved for deployment.</p>
     *         <p>
     *         This parameter is optional for versioned models, and does not apply to unversioned models.
     *         </p>
     *         <p>
     *         For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the
     *         model.
     * @see ModelApprovalStatus
     */

    public String getModelApprovalStatus() {
        return this.modelApprovalStatus;
    }

    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        Whether the model is approved for deployment.</p>
     *        <p>
     *        This parameter is optional for versioned models, and does not apply to unversioned models.
     *        </p>
     *        <p>
     *        For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public CreateModelPackageRequest withModelApprovalStatus(String modelApprovalStatus) {
        setModelApprovalStatus(modelApprovalStatus);
        return this;
    }

    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        Whether the model is approved for deployment.</p>
     *        <p>
     *        This parameter is optional for versioned models, and does not apply to unversioned models.
     *        </p>
     *        <p>
     *        For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public CreateModelPackageRequest withModelApprovalStatus(ModelApprovalStatus modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus.toString();
        return this;
    }

    /**
     * @param metadataProperties
     */

    public void setMetadataProperties(MetadataProperties metadataProperties) {
        this.metadataProperties = metadataProperties;
    }

    /**
     * @return
     */

    public MetadataProperties getMetadataProperties() {
        return this.metadataProperties;
    }

    /**
     * @param metadataProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withMetadataProperties(MetadataProperties metadataProperties) {
        setMetadataProperties(metadataProperties);
        return this;
    }

    /**
     * <p>
     * A structure that contains model metrics reports.
     * </p>
     * 
     * @param modelMetrics
     *        A structure that contains model metrics reports.
     */

    public void setModelMetrics(ModelMetrics modelMetrics) {
        this.modelMetrics = modelMetrics;
    }

    /**
     * <p>
     * A structure that contains model metrics reports.
     * </p>
     * 
     * @return A structure that contains model metrics reports.
     */

    public ModelMetrics getModelMetrics() {
        return this.modelMetrics;
    }

    /**
     * <p>
     * A structure that contains model metrics reports.
     * </p>
     * 
     * @param modelMetrics
     *        A structure that contains model metrics reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelMetrics(ModelMetrics modelMetrics) {
        setModelMetrics(modelMetrics);
        return this;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A unique token that guarantees that the call to this API is idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @return A unique token that guarantees that the call to this API is idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A unique token that guarantees that the call to this API is idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getModelPackageName() != null)
            sb.append("ModelPackageName: ").append(getModelPackageName()).append(",");
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName()).append(",");
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: ").append(getModelPackageDescription()).append(",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: ").append(getInferenceSpecification()).append(",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: ").append(getValidationSpecification()).append(",");
        if (getSourceAlgorithmSpecification() != null)
            sb.append("SourceAlgorithmSpecification: ").append(getSourceAlgorithmSpecification()).append(",");
        if (getCertifyForMarketplace() != null)
            sb.append("CertifyForMarketplace: ").append(getCertifyForMarketplace()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getModelApprovalStatus() != null)
            sb.append("ModelApprovalStatus: ").append(getModelApprovalStatus()).append(",");
        if (getMetadataProperties() != null)
            sb.append("MetadataProperties: ").append(getMetadataProperties()).append(",");
        if (getModelMetrics() != null)
            sb.append("ModelMetrics: ").append(getModelMetrics()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelPackageRequest == false)
            return false;
        CreateModelPackageRequest other = (CreateModelPackageRequest) obj;
        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        if (other.getModelPackageDescription() == null ^ this.getModelPackageDescription() == null)
            return false;
        if (other.getModelPackageDescription() != null && other.getModelPackageDescription().equals(this.getModelPackageDescription()) == false)
            return false;
        if (other.getInferenceSpecification() == null ^ this.getInferenceSpecification() == null)
            return false;
        if (other.getInferenceSpecification() != null && other.getInferenceSpecification().equals(this.getInferenceSpecification()) == false)
            return false;
        if (other.getValidationSpecification() == null ^ this.getValidationSpecification() == null)
            return false;
        if (other.getValidationSpecification() != null && other.getValidationSpecification().equals(this.getValidationSpecification()) == false)
            return false;
        if (other.getSourceAlgorithmSpecification() == null ^ this.getSourceAlgorithmSpecification() == null)
            return false;
        if (other.getSourceAlgorithmSpecification() != null && other.getSourceAlgorithmSpecification().equals(this.getSourceAlgorithmSpecification()) == false)
            return false;
        if (other.getCertifyForMarketplace() == null ^ this.getCertifyForMarketplace() == null)
            return false;
        if (other.getCertifyForMarketplace() != null && other.getCertifyForMarketplace().equals(this.getCertifyForMarketplace()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getModelApprovalStatus() == null ^ this.getModelApprovalStatus() == null)
            return false;
        if (other.getModelApprovalStatus() != null && other.getModelApprovalStatus().equals(this.getModelApprovalStatus()) == false)
            return false;
        if (other.getMetadataProperties() == null ^ this.getMetadataProperties() == null)
            return false;
        if (other.getMetadataProperties() != null && other.getMetadataProperties().equals(this.getMetadataProperties()) == false)
            return false;
        if (other.getModelMetrics() == null ^ this.getModelMetrics() == null)
            return false;
        if (other.getModelMetrics() != null && other.getModelMetrics().equals(this.getModelMetrics()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification().hashCode());
        hashCode = prime * hashCode + ((getValidationSpecification() == null) ? 0 : getValidationSpecification().hashCode());
        hashCode = prime * hashCode + ((getSourceAlgorithmSpecification() == null) ? 0 : getSourceAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getCertifyForMarketplace() == null) ? 0 : getCertifyForMarketplace().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getModelApprovalStatus() == null) ? 0 : getModelApprovalStatus().hashCode());
        hashCode = prime * hashCode + ((getMetadataProperties() == null) ? 0 : getMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getModelMetrics() == null) ? 0 : getModelMetrics().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelPackageRequest clone() {
        return (CreateModelPackageRequest) super.clone();
    }

}

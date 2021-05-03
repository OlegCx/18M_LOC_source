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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartTopicsDetectionJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTopicsDetectionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * Specifies where to send the output files. The output is a compressed archive with two files,
     * <code>topic-terms.csv</code> that lists the terms associated with each topic, and <code>doc-topics.csv</code>
     * that lists the documents associated with each topic
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data. For more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     * >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions<
     * /a>.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The identifier of the job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The number of topics to detect.
     * </p>
     */
    private Integer numberOfTopics;
    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Comprehend generates one.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String volumeKmsKeyId;
    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are
     * using for your topic detection job. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     * 
     * @param inputDataConfig
     *        Specifies the format and location of the input data for the job.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     * 
     * @return Specifies the format and location of the input data for the job.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     * 
     * @param inputDataConfig
     *        Specifies the format and location of the input data for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTopicsDetectionJobRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Specifies where to send the output files. The output is a compressed archive with two files,
     * <code>topic-terms.csv</code> that lists the terms associated with each topic, and <code>doc-topics.csv</code>
     * that lists the documents associated with each topic
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies where to send the output files. The output is a compressed archive with two files,
     *        <code>topic-terms.csv</code> that lists the terms associated with each topic, and
     *        <code>doc-topics.csv</code> that lists the documents associated with each topic
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies where to send the output files. The output is a compressed archive with two files,
     * <code>topic-terms.csv</code> that lists the terms associated with each topic, and <code>doc-topics.csv</code>
     * that lists the documents associated with each topic
     * </p>
     * 
     * @return Specifies where to send the output files. The output is a compressed archive with two files,
     *         <code>topic-terms.csv</code> that lists the terms associated with each topic, and
     *         <code>doc-topics.csv</code> that lists the documents associated with each topic
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Specifies where to send the output files. The output is a compressed archive with two files,
     * <code>topic-terms.csv</code> that lists the terms associated with each topic, and <code>doc-topics.csv</code>
     * that lists the documents associated with each topic
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies where to send the output files. The output is a compressed archive with two files,
     *        <code>topic-terms.csv</code> that lists the terms associated with each topic, and
     *        <code>doc-topics.csv</code> that lists the documents associated with each topic
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTopicsDetectionJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data. For more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     * >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions<
     * /a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon
     *        Comprehend read access to your input data. For more information, see <a href=
     *        "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     *        >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-
     *        permissions</a>.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data. For more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     * >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions<
     * /a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon
     *         Comprehend read access to your input data. For more information, see <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     *         >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-
     *         permissions</a>.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data. For more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     * >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions<
     * /a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon
     *        Comprehend read access to your input data. For more information, see <a href=
     *        "https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions"
     *        >https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-
     *        permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTopicsDetectionJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * 
     * @param jobName
     *        The identifier of the job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * 
     * @return The identifier of the job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * 
     * @param jobName
     *        The identifier of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTopicsDetectionJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The number of topics to detect.
     * </p>
     * 
     * @param numberOfTopics
     *        The number of topics to detect.
     */

    public void setNumberOfTopics(Integer numberOfTopics) {
        this.numberOfTopics = numberOfTopics;
    }

    /**
     * <p>
     * The number of topics to detect.
     * </p>
     * 
     * @return The number of topics to detect.
     */

    public Integer getNumberOfTopics() {
        return this.numberOfTopics;
    }

    /**
     * <p>
     * The number of topics to detect.
     * </p>
     * 
     * @param numberOfTopics
     *        The number of topics to detect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTopicsDetectionJobRequest withNumberOfTopics(Integer numberOfTopics) {
        setNumberOfTopics(numberOfTopics);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Comprehend
     *        generates one.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @return A unique identifier for the request. If you do not set the client request token, Amazon Comprehend
     *         generates one.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Comprehend
     *        generates one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTopicsDetectionJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the
     *         storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId
     *         can be either of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTopicsDetectionJobRequest withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are
     * using for your topic detection job. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * </p>
     * 
     * @param vpcConfig
     *        Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you
     *        are using for your topic detection job. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are
     * using for your topic detection job. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * </p>
     * 
     * @return Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you
     *         are using for your topic detection job. For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are
     * using for your topic detection job. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * </p>
     * 
     * @param vpcConfig
     *        Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you
     *        are using for your topic detection job. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTopicsDetectionJobRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getNumberOfTopics() != null)
            sb.append("NumberOfTopics: ").append(getNumberOfTopics()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTopicsDetectionJobRequest == false)
            return false;
        StartTopicsDetectionJobRequest other = (StartTopicsDetectionJobRequest) obj;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getNumberOfTopics() == null ^ this.getNumberOfTopics() == null)
            return false;
        if (other.getNumberOfTopics() != null && other.getNumberOfTopics().equals(this.getNumberOfTopics()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTopics() == null) ? 0 : getNumberOfTopics().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartTopicsDetectionJobRequest clone() {
        return (StartTopicsDetectionJobRequest) super.clone();
    }

}
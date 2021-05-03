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
 * Configure encryption on the storage volume attached to the ML compute instance used to run automated data labeling
 * model training and inference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobResourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobResourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the training and inference jobs used for automated data labeling.
     * </p>
     * <p>
     * You can only specify a <code>VolumeKmsKeyId</code> when you create a labeling job with automated data labeling
     * enabled using the API operation <code>CreateLabelingJob</code>. You cannot specify an AWS KMS customer managed
     * CMK to encrypt the storage volume used for automated data labeling model training and inference when you create a
     * labeling job using the console. To learn more, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security.html">Output Data and Storage Volume
     * Encryption</a>.
     * </p>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the training and inference jobs used for automated data labeling.
     * </p>
     * <p>
     * You can only specify a <code>VolumeKmsKeyId</code> when you create a labeling job with automated data labeling
     * enabled using the API operation <code>CreateLabelingJob</code>. You cannot specify an AWS KMS customer managed
     * CMK to encrypt the storage volume used for automated data labeling model training and inference when you create a
     * labeling job using the console. To learn more, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security.html">Output Data and Storage Volume
     * Encryption</a>.
     * </p>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that run the training and inference jobs used for automated
     *        data labeling. </p>
     *        <p>
     *        You can only specify a <code>VolumeKmsKeyId</code> when you create a labeling job with automated data
     *        labeling enabled using the API operation <code>CreateLabelingJob</code>. You cannot specify an AWS KMS
     *        customer managed CMK to encrypt the storage volume used for automated data labeling model training and
     *        inference when you create a labeling job using the console. To learn more, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security.html">Output Data and Storage Volume
     *        Encryption</a>.
     *        </p>
     *        <p>
     *        The <code>VolumeKmsKeyId</code> can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the training and inference jobs used for automated data labeling.
     * </p>
     * <p>
     * You can only specify a <code>VolumeKmsKeyId</code> when you create a labeling job with automated data labeling
     * enabled using the API operation <code>CreateLabelingJob</code>. You cannot specify an AWS KMS customer managed
     * CMK to encrypt the storage volume used for automated data labeling model training and inference when you create a
     * labeling job using the console. To learn more, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security.html">Output Data and Storage Volume
     * Encryption</a>.
     * </p>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *         volume attached to the ML compute instance(s) that run the training and inference jobs used for automated
     *         data labeling. </p>
     *         <p>
     *         You can only specify a <code>VolumeKmsKeyId</code> when you create a labeling job with automated data
     *         labeling enabled using the API operation <code>CreateLabelingJob</code>. You cannot specify an AWS KMS
     *         customer managed CMK to encrypt the storage volume used for automated data labeling model training and
     *         inference when you create a labeling job using the console. To learn more, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security.html">Output Data and Storage Volume
     *         Encryption</a>.
     *         </p>
     *         <p>
     *         The <code>VolumeKmsKeyId</code> can be any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the training and inference jobs used for automated data labeling.
     * </p>
     * <p>
     * You can only specify a <code>VolumeKmsKeyId</code> when you create a labeling job with automated data labeling
     * enabled using the API operation <code>CreateLabelingJob</code>. You cannot specify an AWS KMS customer managed
     * CMK to encrypt the storage volume used for automated data labeling model training and inference when you create a
     * labeling job using the console. To learn more, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security.html">Output Data and Storage Volume
     * Encryption</a>.
     * </p>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that run the training and inference jobs used for automated
     *        data labeling. </p>
     *        <p>
     *        You can only specify a <code>VolumeKmsKeyId</code> when you create a labeling job with automated data
     *        labeling enabled using the API operation <code>CreateLabelingJob</code>. You cannot specify an AWS KMS
     *        customer managed CMK to encrypt the storage volume used for automated data labeling model training and
     *        inference when you create a labeling job using the console. To learn more, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security.html">Output Data and Storage Volume
     *        Encryption</a>.
     *        </p>
     *        <p>
     *        The <code>VolumeKmsKeyId</code> can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobResourceConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
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
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobResourceConfig == false)
            return false;
        LabelingJobResourceConfig other = (LabelingJobResourceConfig) obj;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobResourceConfig clone() {
        try {
            return (LabelingJobResourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobResourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

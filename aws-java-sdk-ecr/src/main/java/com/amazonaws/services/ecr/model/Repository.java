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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/Repository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Repository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code>
     * namespace, followed by the region of the repository, AWS account ID of the repository owner, repository
     * namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * </p>
     */
    private String repositoryArn;
    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The URI for the repository. You can use this URI for container image <code>push</code> and <code>pull</code>
     * operations.
     * </p>
     */
    private String repositoryUri;
    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The tag mutability setting for the repository.
     * </p>
     */
    private String imageTagMutability;

    private ImageScanningConfiguration imageScanningConfiguration;
    /**
     * <p>
     * The encryption configuration for the repository. This determines how the contents of your repository are
     * encrypted at rest.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code>
     * namespace, followed by the region of the repository, AWS account ID of the repository owner, repository
     * namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * </p>
     * 
     * @param repositoryArn
     *        The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the
     *        <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the
     *        repository owner, repository namespace, and repository name. For example,
     *        <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     */

    public void setRepositoryArn(String repositoryArn) {
        this.repositoryArn = repositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code>
     * namespace, followed by the region of the repository, AWS account ID of the repository owner, repository
     * namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the
     *         <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the
     *         repository owner, repository namespace, and repository name. For example,
     *         <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     */

    public String getRepositoryArn() {
        return this.repositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the <code>arn:aws:ecr</code>
     * namespace, followed by the region of the repository, AWS account ID of the repository owner, repository
     * namespace, and repository name. For example, <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * </p>
     * 
     * @param repositoryArn
     *        The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the
     *        <code>arn:aws:ecr</code> namespace, followed by the region of the repository, AWS account ID of the
     *        repository owner, repository namespace, and repository name. For example,
     *        <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withRepositoryArn(String repositoryArn) {
        setRepositoryArn(repositoryArn);
        return this;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the repository.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The URI for the repository. You can use this URI for container image <code>push</code> and <code>pull</code>
     * operations.
     * </p>
     * 
     * @param repositoryUri
     *        The URI for the repository. You can use this URI for container image <code>push</code> and
     *        <code>pull</code> operations.
     */

    public void setRepositoryUri(String repositoryUri) {
        this.repositoryUri = repositoryUri;
    }

    /**
     * <p>
     * The URI for the repository. You can use this URI for container image <code>push</code> and <code>pull</code>
     * operations.
     * </p>
     * 
     * @return The URI for the repository. You can use this URI for container image <code>push</code> and
     *         <code>pull</code> operations.
     */

    public String getRepositoryUri() {
        return this.repositoryUri;
    }

    /**
     * <p>
     * The URI for the repository. You can use this URI for container image <code>push</code> and <code>pull</code>
     * operations.
     * </p>
     * 
     * @param repositoryUri
     *        The URI for the repository. You can use this URI for container image <code>push</code> and
     *        <code>pull</code> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withRepositoryUri(String repositoryUri) {
        setRepositoryUri(repositoryUri);
        return this;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in JavaScript date format, when the repository was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository was created.
     * </p>
     * 
     * @return The date and time, in JavaScript date format, when the repository was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in JavaScript date format, when the repository was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository.
     * @see ImageTagMutability
     */

    public void setImageTagMutability(String imageTagMutability) {
        this.imageTagMutability = imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository.
     * </p>
     * 
     * @return The tag mutability setting for the repository.
     * @see ImageTagMutability
     */

    public String getImageTagMutability() {
        return this.imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public Repository withImageTagMutability(String imageTagMutability) {
        setImageTagMutability(imageTagMutability);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public Repository withImageTagMutability(ImageTagMutability imageTagMutability) {
        this.imageTagMutability = imageTagMutability.toString();
        return this;
    }

    /**
     * @param imageScanningConfiguration
     */

    public void setImageScanningConfiguration(ImageScanningConfiguration imageScanningConfiguration) {
        this.imageScanningConfiguration = imageScanningConfiguration;
    }

    /**
     * @return
     */

    public ImageScanningConfiguration getImageScanningConfiguration() {
        return this.imageScanningConfiguration;
    }

    /**
     * @param imageScanningConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withImageScanningConfiguration(ImageScanningConfiguration imageScanningConfiguration) {
        setImageScanningConfiguration(imageScanningConfiguration);
        return this;
    }

    /**
     * <p>
     * The encryption configuration for the repository. This determines how the contents of your repository are
     * encrypted at rest.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration for the repository. This determines how the contents of your repository are
     *        encrypted at rest.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration for the repository. This determines how the contents of your repository are
     * encrypted at rest.
     * </p>
     * 
     * @return The encryption configuration for the repository. This determines how the contents of your repository are
     *         encrypted at rest.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration for the repository. This determines how the contents of your repository are
     * encrypted at rest.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration for the repository. This determines how the contents of your repository are
     *        encrypted at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
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
        if (getRepositoryArn() != null)
            sb.append("RepositoryArn: ").append(getRepositoryArn()).append(",");
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getRepositoryUri() != null)
            sb.append("RepositoryUri: ").append(getRepositoryUri()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getImageTagMutability() != null)
            sb.append("ImageTagMutability: ").append(getImageTagMutability()).append(",");
        if (getImageScanningConfiguration() != null)
            sb.append("ImageScanningConfiguration: ").append(getImageScanningConfiguration()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Repository == false)
            return false;
        Repository other = (Repository) obj;
        if (other.getRepositoryArn() == null ^ this.getRepositoryArn() == null)
            return false;
        if (other.getRepositoryArn() != null && other.getRepositoryArn().equals(this.getRepositoryArn()) == false)
            return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryUri() == null ^ this.getRepositoryUri() == null)
            return false;
        if (other.getRepositoryUri() != null && other.getRepositoryUri().equals(this.getRepositoryUri()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getImageTagMutability() == null ^ this.getImageTagMutability() == null)
            return false;
        if (other.getImageTagMutability() != null && other.getImageTagMutability().equals(this.getImageTagMutability()) == false)
            return false;
        if (other.getImageScanningConfiguration() == null ^ this.getImageScanningConfiguration() == null)
            return false;
        if (other.getImageScanningConfiguration() != null && other.getImageScanningConfiguration().equals(this.getImageScanningConfiguration()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryArn() == null) ? 0 : getRepositoryArn().hashCode());
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryUri() == null) ? 0 : getRepositoryUri().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getImageTagMutability() == null) ? 0 : getImageTagMutability().hashCode());
        hashCode = prime * hashCode + ((getImageScanningConfiguration() == null) ? 0 : getImageScanningConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Repository clone() {
        try {
            return (Repository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.RepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

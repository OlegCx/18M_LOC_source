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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the document that you want to delete. If not provided, all versions of the document are deleted.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The version name of the document that you want to delete. If not provided, all versions of the document are
     * deleted.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document.
     * For example, you must specify a <code>Force</code> flag to delete a document of type
     * <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS
     * Identity and Access Management (IAM) policy.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @param name
     *        The name of the document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @return The name of the document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @param name
     *        The name of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the document that you want to delete. If not provided, all versions of the document are deleted.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document that you want to delete. If not provided, all versions of the document are
     *        deleted.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document that you want to delete. If not provided, all versions of the document are deleted.
     * </p>
     * 
     * @return The version of the document that you want to delete. If not provided, all versions of the document are
     *         deleted.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the document that you want to delete. If not provided, all versions of the document are deleted.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document that you want to delete. If not provided, all versions of the document are
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The version name of the document that you want to delete. If not provided, all versions of the document are
     * deleted.
     * </p>
     * 
     * @param versionName
     *        The version name of the document that you want to delete. If not provided, all versions of the document
     *        are deleted.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The version name of the document that you want to delete. If not provided, all versions of the document are
     * deleted.
     * </p>
     * 
     * @return The version name of the document that you want to delete. If not provided, all versions of the document
     *         are deleted.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The version name of the document that you want to delete. If not provided, all versions of the document are
     * deleted.
     * </p>
     * 
     * @param versionName
     *        The version name of the document that you want to delete. If not provided, all versions of the document
     *        are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document.
     * For example, you must specify a <code>Force</code> flag to delete a document of type
     * <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS
     * Identity and Access Management (IAM) policy.
     * </p>
     * 
     * @param force
     *        Some SSM document types require that you specify a <code>Force</code> flag before you can delete the
     *        document. For example, you must specify a <code>Force</code> flag to delete a document of type
     *        <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an
     *        AWS Identity and Access Management (IAM) policy.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document.
     * For example, you must specify a <code>Force</code> flag to delete a document of type
     * <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS
     * Identity and Access Management (IAM) policy.
     * </p>
     * 
     * @return Some SSM document types require that you specify a <code>Force</code> flag before you can delete the
     *         document. For example, you must specify a <code>Force</code> flag to delete a document of type
     *         <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an
     *         AWS Identity and Access Management (IAM) policy.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document.
     * For example, you must specify a <code>Force</code> flag to delete a document of type
     * <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS
     * Identity and Access Management (IAM) policy.
     * </p>
     * 
     * @param force
     *        Some SSM document types require that you specify a <code>Force</code> flag before you can delete the
     *        document. For example, you must specify a <code>Force</code> flag to delete a document of type
     *        <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an
     *        AWS Identity and Access Management (IAM) policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document.
     * For example, you must specify a <code>Force</code> flag to delete a document of type
     * <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS
     * Identity and Access Management (IAM) policy.
     * </p>
     * 
     * @return Some SSM document types require that you specify a <code>Force</code> flag before you can delete the
     *         document. For example, you must specify a <code>Force</code> flag to delete a document of type
     *         <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an
     *         AWS Identity and Access Management (IAM) policy.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDocumentRequest == false)
            return false;
        DeleteDocumentRequest other = (DeleteDocumentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDocumentRequest clone() {
        return (DeleteDocumentRequest) super.clone();
    }

}

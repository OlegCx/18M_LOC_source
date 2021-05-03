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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output from the GetPolicy operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The policy name.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The policy ARN.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The default policy version ID.
     * </p>
     */
    private String defaultVersionId;
    /**
     * <p>
     * The date the policy was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the policy was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The generation ID of the policy.
     * </p>
     */
    private String generationId;

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @param policyName
     *        The policy name.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @return The policy name.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @param policyName
     *        The policy name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The policy ARN.
     * </p>
     * 
     * @param policyArn
     *        The policy ARN.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The policy ARN.
     * </p>
     * 
     * @return The policy ARN.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The policy ARN.
     * </p>
     * 
     * @param policyArn
     *        The policy ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document that describes the policy.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     * 
     * @return The JSON document that describes the policy.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document that describes the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The default policy version ID.
     * </p>
     * 
     * @param defaultVersionId
     *        The default policy version ID.
     */

    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The default policy version ID.
     * </p>
     * 
     * @return The default policy version ID.
     */

    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * <p>
     * The default policy version ID.
     * </p>
     * 
     * @param defaultVersionId
     *        The default policy version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withDefaultVersionId(String defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
    }

    /**
     * <p>
     * The date the policy was created.
     * </p>
     * 
     * @param creationDate
     *        The date the policy was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the policy was created.
     * </p>
     * 
     * @return The date the policy was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the policy was created.
     * </p>
     * 
     * @param creationDate
     *        The date the policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the policy was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the policy was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the policy was last modified.
     * </p>
     * 
     * @return The date the policy was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the policy was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the policy was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The generation ID of the policy.
     * </p>
     * 
     * @param generationId
     *        The generation ID of the policy.
     */

    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The generation ID of the policy.
     * </p>
     * 
     * @return The generation ID of the policy.
     */

    public String getGenerationId() {
        return this.generationId;
    }

    /**
     * <p>
     * The generation ID of the policy.
     * </p>
     * 
     * @param generationId
     *        The generation ID of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withGenerationId(String generationId) {
        setGenerationId(generationId);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getGenerationId() != null)
            sb.append("GenerationId: ").append(getGenerationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyResult == false)
            return false;
        GetPolicyResult other = (GetPolicyResult) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getGenerationId() == null ^ this.getGenerationId() == null)
            return false;
        if (other.getGenerationId() != null && other.getGenerationId().equals(this.getGenerationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getGenerationId() == null) ? 0 : getGenerationId().hashCode());
        return hashCode;
    }

    @Override
    public GetPolicyResult clone() {
        try {
            return (GetPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

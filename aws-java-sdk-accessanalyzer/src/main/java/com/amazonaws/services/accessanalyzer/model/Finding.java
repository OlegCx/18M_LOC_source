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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/Finding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Finding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     */
    private java.util.List<String> action;
    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     */
    private java.util.Date analyzedAt;
    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a finding.
     * </p>
     */
    private java.util.Map<String, String> condition;
    /**
     * <p>
     * The time at which the finding was generated.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * An error.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The ID of the finding.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Indicates whether the policy that generated the finding allows public access to the resource.
     * </p>
     */
    private Boolean isPublic;
    /**
     * <p>
     * The external principal that access to a resource within the zone of trust.
     * </p>
     */
    private java.util.Map<String, String> principal;
    /**
     * <p>
     * The resource that an external principal has access to.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     */
    private String resourceOwnerAccount;
    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated
     * for Amazon S3 bucket findings.
     * </p>
     */
    private java.util.List<FindingSource> sources;
    /**
     * <p>
     * The current status of the finding.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     * 
     * @return The action in the analyzed policy statement that an external principal has permission to use.
     */

    public java.util.List<String> getAction() {
        return action;
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     * 
     * @param action
     *        The action in the analyzed policy statement that an external principal has permission to use.
     */

    public void setAction(java.util.Collection<String> action) {
        if (action == null) {
            this.action = null;
            return;
        }

        this.action = new java.util.ArrayList<String>(action);
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAction(java.util.Collection)} or {@link #withAction(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param action
     *        The action in the analyzed policy statement that an external principal has permission to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAction(String... action) {
        if (this.action == null) {
            setAction(new java.util.ArrayList<String>(action.length));
        }
        for (String ele : action) {
            this.action.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     * 
     * @param action
     *        The action in the analyzed policy statement that an external principal has permission to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAction(java.util.Collection<String> action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     * 
     * @param analyzedAt
     *        The time at which the resource was analyzed.
     */

    public void setAnalyzedAt(java.util.Date analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     * 
     * @return The time at which the resource was analyzed.
     */

    public java.util.Date getAnalyzedAt() {
        return this.analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     * 
     * @param analyzedAt
     *        The time at which the resource was analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAnalyzedAt(java.util.Date analyzedAt) {
        setAnalyzedAt(analyzedAt);
        return this;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a finding.
     * </p>
     * 
     * @return The condition in the analyzed policy statement that resulted in a finding.
     */

    public java.util.Map<String, String> getCondition() {
        return condition;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a finding.
     * </p>
     * 
     * @param condition
     *        The condition in the analyzed policy statement that resulted in a finding.
     */

    public void setCondition(java.util.Map<String, String> condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a finding.
     * </p>
     * 
     * @param condition
     *        The condition in the analyzed policy statement that resulted in a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCondition(java.util.Map<String, String> condition) {
        setCondition(condition);
        return this;
    }

    /**
     * Add a single Condition entry
     *
     * @see Finding#withCondition
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Finding addConditionEntry(String key, String value) {
        if (null == this.condition) {
            this.condition = new java.util.HashMap<String, String>();
        }
        if (this.condition.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.condition.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Condition.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding clearConditionEntries() {
        this.condition = null;
        return this;
    }

    /**
     * <p>
     * The time at which the finding was generated.
     * </p>
     * 
     * @param createdAt
     *        The time at which the finding was generated.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the finding was generated.
     * </p>
     * 
     * @return The time at which the finding was generated.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the finding was generated.
     * </p>
     * 
     * @param createdAt
     *        The time at which the finding was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An error.
     * </p>
     * 
     * @param error
     *        An error.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * An error.
     * </p>
     * 
     * @return An error.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * An error.
     * </p>
     * 
     * @param error
     *        An error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @param id
     *        The ID of the finding.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @return The ID of the finding.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @param id
     *        The ID of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding allows public access to the resource.
     * </p>
     * 
     * @param isPublic
     *        Indicates whether the policy that generated the finding allows public access to the resource.
     */

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding allows public access to the resource.
     * </p>
     * 
     * @return Indicates whether the policy that generated the finding allows public access to the resource.
     */

    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding allows public access to the resource.
     * </p>
     * 
     * @param isPublic
     *        Indicates whether the policy that generated the finding allows public access to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withIsPublic(Boolean isPublic) {
        setIsPublic(isPublic);
        return this;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding allows public access to the resource.
     * </p>
     * 
     * @return Indicates whether the policy that generated the finding allows public access to the resource.
     */

    public Boolean isPublic() {
        return this.isPublic;
    }

    /**
     * <p>
     * The external principal that access to a resource within the zone of trust.
     * </p>
     * 
     * @return The external principal that access to a resource within the zone of trust.
     */

    public java.util.Map<String, String> getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The external principal that access to a resource within the zone of trust.
     * </p>
     * 
     * @param principal
     *        The external principal that access to a resource within the zone of trust.
     */

    public void setPrincipal(java.util.Map<String, String> principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The external principal that access to a resource within the zone of trust.
     * </p>
     * 
     * @param principal
     *        The external principal that access to a resource within the zone of trust.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withPrincipal(java.util.Map<String, String> principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * Add a single Principal entry
     *
     * @see Finding#withPrincipal
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Finding addPrincipalEntry(String key, String value) {
        if (null == this.principal) {
            this.principal = new java.util.HashMap<String, String>();
        }
        if (this.principal.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.principal.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Principal.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding clearPrincipalEntries() {
        this.principal = null;
        return this;
    }

    /**
     * <p>
     * The resource that an external principal has access to.
     * </p>
     * 
     * @param resource
     *        The resource that an external principal has access to.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource that an external principal has access to.
     * </p>
     * 
     * @return The resource that an external principal has access to.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource that an external principal has access to.
     * </p>
     * 
     * @param resource
     *        The resource that an external principal has access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     * 
     * @param resourceOwnerAccount
     *        The AWS account ID that owns the resource.
     */

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     * 
     * @return The AWS account ID that owns the resource.
     */

    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     * 
     * @param resourceOwnerAccount
     *        The AWS account ID that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withResourceOwnerAccount(String resourceOwnerAccount) {
        setResourceOwnerAccount(resourceOwnerAccount);
        return this;
    }

    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource identified in the finding.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     * 
     * @return The type of the resource identified in the finding.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource identified in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Finding withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource identified in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Finding withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated
     * for Amazon S3 bucket findings.
     * </p>
     * 
     * @return The sources of the finding. This indicates how the access that generated the finding is granted. It is
     *         populated for Amazon S3 bucket findings.
     */

    public java.util.List<FindingSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated
     * for Amazon S3 bucket findings.
     * </p>
     * 
     * @param sources
     *        The sources of the finding. This indicates how the access that generated the finding is granted. It is
     *        populated for Amazon S3 bucket findings.
     */

    public void setSources(java.util.Collection<FindingSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<FindingSource>(sources);
    }

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated
     * for Amazon S3 bucket findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The sources of the finding. This indicates how the access that generated the finding is granted. It is
     *        populated for Amazon S3 bucket findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withSources(FindingSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<FindingSource>(sources.length));
        }
        for (FindingSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated
     * for Amazon S3 bucket findings.
     * </p>
     * 
     * @param sources
     *        The sources of the finding. This indicates how the access that generated the finding is granted. It is
     *        populated for Amazon S3 bucket findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withSources(java.util.Collection<FindingSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The current status of the finding.
     * </p>
     * 
     * @param status
     *        The current status of the finding.
     * @see FindingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the finding.
     * </p>
     * 
     * @return The current status of the finding.
     * @see FindingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the finding.
     * </p>
     * 
     * @param status
     *        The current status of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatus
     */

    public Finding withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the finding.
     * </p>
     * 
     * @param status
     *        The current status of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatus
     */

    public Finding withStatus(FindingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the finding was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @return The time at which the finding was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the finding was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getAnalyzedAt() != null)
            sb.append("AnalyzedAt: ").append(getAnalyzedAt()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsPublic() != null)
            sb.append("IsPublic: ").append(getIsPublic()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getResourceOwnerAccount() != null)
            sb.append("ResourceOwnerAccount: ").append(getResourceOwnerAccount()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Finding == false)
            return false;
        Finding other = (Finding) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getAnalyzedAt() == null ^ this.getAnalyzedAt() == null)
            return false;
        if (other.getAnalyzedAt() != null && other.getAnalyzedAt().equals(this.getAnalyzedAt()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsPublic() == null ^ this.getIsPublic() == null)
            return false;
        if (other.getIsPublic() != null && other.getIsPublic().equals(this.getIsPublic()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getResourceOwnerAccount() == null ^ this.getResourceOwnerAccount() == null)
            return false;
        if (other.getResourceOwnerAccount() != null && other.getResourceOwnerAccount().equals(this.getResourceOwnerAccount()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getAnalyzedAt() == null) ? 0 : getAnalyzedAt().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsPublic() == null) ? 0 : getIsPublic().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getResourceOwnerAccount() == null) ? 0 : getResourceOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Finding clone() {
        try {
            return (Finding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.FindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

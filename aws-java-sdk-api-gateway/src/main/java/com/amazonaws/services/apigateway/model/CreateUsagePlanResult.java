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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a usage plan than can specify who can assess associated API stages with specified request limits and
 * quotas.
 * </p>
 * <div class="remarks">
 * <p>
 * In a usage plan, you associate an API by specifying the API's Id and a stage name of the specified API. You add plan
 * customers by adding API keys to the plan.
 * </p>
 * </div> <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html">Create and Use
 * Usage Plans</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUsagePlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of a <a>UsagePlan</a> resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of a usage plan.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of a usage plan.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The associated API stages of a usage plan.
     * </p>
     */
    private java.util.List<ApiStage> apiStages;
    /**
     * <p>
     * The request throttle limits of a usage plan.
     * </p>
     */
    private ThrottleSettings throttle;
    /**
     * <p>
     * The maximum number of permitted requests per a given unit time interval.
     * </p>
     */
    private QuotaSettings quota;
    /**
     * <p>
     * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of a <a>UsagePlan</a> resource.
     * </p>
     * 
     * @param id
     *        The identifier of a <a>UsagePlan</a> resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of a <a>UsagePlan</a> resource.
     * </p>
     * 
     * @return The identifier of a <a>UsagePlan</a> resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of a <a>UsagePlan</a> resource.
     * </p>
     * 
     * @param id
     *        The identifier of a <a>UsagePlan</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of a usage plan.
     * </p>
     * 
     * @param name
     *        The name of a usage plan.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a usage plan.
     * </p>
     * 
     * @return The name of a usage plan.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a usage plan.
     * </p>
     * 
     * @param name
     *        The name of a usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of a usage plan.
     * </p>
     * 
     * @param description
     *        The description of a usage plan.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a usage plan.
     * </p>
     * 
     * @return The description of a usage plan.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a usage plan.
     * </p>
     * 
     * @param description
     *        The description of a usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The associated API stages of a usage plan.
     * </p>
     * 
     * @return The associated API stages of a usage plan.
     */

    public java.util.List<ApiStage> getApiStages() {
        return apiStages;
    }

    /**
     * <p>
     * The associated API stages of a usage plan.
     * </p>
     * 
     * @param apiStages
     *        The associated API stages of a usage plan.
     */

    public void setApiStages(java.util.Collection<ApiStage> apiStages) {
        if (apiStages == null) {
            this.apiStages = null;
            return;
        }

        this.apiStages = new java.util.ArrayList<ApiStage>(apiStages);
    }

    /**
     * <p>
     * The associated API stages of a usage plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApiStages(java.util.Collection)} or {@link #withApiStages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param apiStages
     *        The associated API stages of a usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withApiStages(ApiStage... apiStages) {
        if (this.apiStages == null) {
            setApiStages(new java.util.ArrayList<ApiStage>(apiStages.length));
        }
        for (ApiStage ele : apiStages) {
            this.apiStages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The associated API stages of a usage plan.
     * </p>
     * 
     * @param apiStages
     *        The associated API stages of a usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withApiStages(java.util.Collection<ApiStage> apiStages) {
        setApiStages(apiStages);
        return this;
    }

    /**
     * <p>
     * The request throttle limits of a usage plan.
     * </p>
     * 
     * @param throttle
     *        The request throttle limits of a usage plan.
     */

    public void setThrottle(ThrottleSettings throttle) {
        this.throttle = throttle;
    }

    /**
     * <p>
     * The request throttle limits of a usage plan.
     * </p>
     * 
     * @return The request throttle limits of a usage plan.
     */

    public ThrottleSettings getThrottle() {
        return this.throttle;
    }

    /**
     * <p>
     * The request throttle limits of a usage plan.
     * </p>
     * 
     * @param throttle
     *        The request throttle limits of a usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withThrottle(ThrottleSettings throttle) {
        setThrottle(throttle);
        return this;
    }

    /**
     * <p>
     * The maximum number of permitted requests per a given unit time interval.
     * </p>
     * 
     * @param quota
     *        The maximum number of permitted requests per a given unit time interval.
     */

    public void setQuota(QuotaSettings quota) {
        this.quota = quota;
    }

    /**
     * <p>
     * The maximum number of permitted requests per a given unit time interval.
     * </p>
     * 
     * @return The maximum number of permitted requests per a given unit time interval.
     */

    public QuotaSettings getQuota() {
        return this.quota;
    }

    /**
     * <p>
     * The maximum number of permitted requests per a given unit time interval.
     * </p>
     * 
     * @param quota
     *        The maximum number of permitted requests per a given unit time interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withQuota(QuotaSettings quota) {
        setQuota(quota);
        return this;
    }

    /**
     * <p>
     * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * </p>
     * 
     * @param productCode
     *        The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS
     *        Marketplace.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * </p>
     * 
     * @return The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS
     *         Marketplace.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * </p>
     * 
     * @param productCode
     *        The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS
     *        Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @return The collection of tags. Each tag element is associated with a given resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @param tags
     *        The collection of tags. Each tag element is associated with a given resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @param tags
     *        The collection of tags. Each tag element is associated with a given resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateUsagePlanResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanResult clearTagsEntries() {
        this.tags = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getApiStages() != null)
            sb.append("ApiStages: ").append(getApiStages()).append(",");
        if (getThrottle() != null)
            sb.append("Throttle: ").append(getThrottle()).append(",");
        if (getQuota() != null)
            sb.append("Quota: ").append(getQuota()).append(",");
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
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

        if (obj instanceof CreateUsagePlanResult == false)
            return false;
        CreateUsagePlanResult other = (CreateUsagePlanResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getApiStages() == null ^ this.getApiStages() == null)
            return false;
        if (other.getApiStages() != null && other.getApiStages().equals(this.getApiStages()) == false)
            return false;
        if (other.getThrottle() == null ^ this.getThrottle() == null)
            return false;
        if (other.getThrottle() != null && other.getThrottle().equals(this.getThrottle()) == false)
            return false;
        if (other.getQuota() == null ^ this.getQuota() == null)
            return false;
        if (other.getQuota() != null && other.getQuota().equals(this.getQuota()) == false)
            return false;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApiStages() == null) ? 0 : getApiStages().hashCode());
        hashCode = prime * hashCode + ((getThrottle() == null) ? 0 : getThrottle().hashCode());
        hashCode = prime * hashCode + ((getQuota() == null) ? 0 : getQuota().hashCode());
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateUsagePlanResult clone() {
        try {
            return (CreateUsagePlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a webhook that connects repository events to an Amplify app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Webhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Webhook implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the webhook.
     * </p>
     */
    private String webhookArn;
    /**
     * <p>
     * The ID of the webhook.
     * </p>
     */
    private String webhookId;
    /**
     * <p>
     * The URL of the webhook.
     * </p>
     */
    private String webhookUrl;
    /**
     * <p>
     * The name for a branch that is part of an Amplify app.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The description for a webhook.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The create date and time for a webhook.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Updates the date and time for a webhook.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the webhook.
     * </p>
     * 
     * @param webhookArn
     *        The Amazon Resource Name (ARN) for the webhook.
     */

    public void setWebhookArn(String webhookArn) {
        this.webhookArn = webhookArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the webhook.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the webhook.
     */

    public String getWebhookArn() {
        return this.webhookArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the webhook.
     * </p>
     * 
     * @param webhookArn
     *        The Amazon Resource Name (ARN) for the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withWebhookArn(String webhookArn) {
        setWebhookArn(webhookArn);
        return this;
    }

    /**
     * <p>
     * The ID of the webhook.
     * </p>
     * 
     * @param webhookId
     *        The ID of the webhook.
     */

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    /**
     * <p>
     * The ID of the webhook.
     * </p>
     * 
     * @return The ID of the webhook.
     */

    public String getWebhookId() {
        return this.webhookId;
    }

    /**
     * <p>
     * The ID of the webhook.
     * </p>
     * 
     * @param webhookId
     *        The ID of the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withWebhookId(String webhookId) {
        setWebhookId(webhookId);
        return this;
    }

    /**
     * <p>
     * The URL of the webhook.
     * </p>
     * 
     * @param webhookUrl
     *        The URL of the webhook.
     */

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    /**
     * <p>
     * The URL of the webhook.
     * </p>
     * 
     * @return The URL of the webhook.
     */

    public String getWebhookUrl() {
        return this.webhookUrl;
    }

    /**
     * <p>
     * The URL of the webhook.
     * </p>
     * 
     * @param webhookUrl
     *        The URL of the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withWebhookUrl(String webhookUrl) {
        setWebhookUrl(webhookUrl);
        return this;
    }

    /**
     * <p>
     * The name for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param branchName
     *        The name for a branch that is part of an Amplify app.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name for a branch that is part of an Amplify app.
     * </p>
     * 
     * @return The name for a branch that is part of an Amplify app.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name for a branch that is part of an Amplify app.
     * </p>
     * 
     * @param branchName
     *        The name for a branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The description for a webhook.
     * </p>
     * 
     * @param description
     *        The description for a webhook.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for a webhook.
     * </p>
     * 
     * @return The description for a webhook.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for a webhook.
     * </p>
     * 
     * @param description
     *        The description for a webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The create date and time for a webhook.
     * </p>
     * 
     * @param createTime
     *        The create date and time for a webhook.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The create date and time for a webhook.
     * </p>
     * 
     * @return The create date and time for a webhook.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The create date and time for a webhook.
     * </p>
     * 
     * @param createTime
     *        The create date and time for a webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Updates the date and time for a webhook.
     * </p>
     * 
     * @param updateTime
     *        Updates the date and time for a webhook.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * Updates the date and time for a webhook.
     * </p>
     * 
     * @return Updates the date and time for a webhook.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * Updates the date and time for a webhook.
     * </p>
     * 
     * @param updateTime
     *        Updates the date and time for a webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getWebhookArn() != null)
            sb.append("WebhookArn: ").append(getWebhookArn()).append(",");
        if (getWebhookId() != null)
            sb.append("WebhookId: ").append(getWebhookId()).append(",");
        if (getWebhookUrl() != null)
            sb.append("WebhookUrl: ").append(getWebhookUrl()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Webhook == false)
            return false;
        Webhook other = (Webhook) obj;
        if (other.getWebhookArn() == null ^ this.getWebhookArn() == null)
            return false;
        if (other.getWebhookArn() != null && other.getWebhookArn().equals(this.getWebhookArn()) == false)
            return false;
        if (other.getWebhookId() == null ^ this.getWebhookId() == null)
            return false;
        if (other.getWebhookId() != null && other.getWebhookId().equals(this.getWebhookId()) == false)
            return false;
        if (other.getWebhookUrl() == null ^ this.getWebhookUrl() == null)
            return false;
        if (other.getWebhookUrl() != null && other.getWebhookUrl().equals(this.getWebhookUrl()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhookArn() == null) ? 0 : getWebhookArn().hashCode());
        hashCode = prime * hashCode + ((getWebhookId() == null) ? 0 : getWebhookId().hashCode());
        hashCode = prime * hashCode + ((getWebhookUrl() == null) ? 0 : getWebhookUrl().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public Webhook clone() {
        try {
            return (Webhook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.WebhookMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

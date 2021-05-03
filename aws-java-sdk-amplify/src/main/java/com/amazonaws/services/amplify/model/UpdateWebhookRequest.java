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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request structure for the update webhook request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateWebhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWebhookRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for a webhook.
     * </p>
     */
    private String webhookId;
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
     * The unique ID for a webhook.
     * </p>
     * 
     * @param webhookId
     *        The unique ID for a webhook.
     */

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    /**
     * <p>
     * The unique ID for a webhook.
     * </p>
     * 
     * @return The unique ID for a webhook.
     */

    public String getWebhookId() {
        return this.webhookId;
    }

    /**
     * <p>
     * The unique ID for a webhook.
     * </p>
     * 
     * @param webhookId
     *        The unique ID for a webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebhookRequest withWebhookId(String webhookId) {
        setWebhookId(webhookId);
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

    public UpdateWebhookRequest withBranchName(String branchName) {
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

    public UpdateWebhookRequest withDescription(String description) {
        setDescription(description);
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
        if (getWebhookId() != null)
            sb.append("WebhookId: ").append(getWebhookId()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWebhookRequest == false)
            return false;
        UpdateWebhookRequest other = (UpdateWebhookRequest) obj;
        if (other.getWebhookId() == null ^ this.getWebhookId() == null)
            return false;
        if (other.getWebhookId() != null && other.getWebhookId().equals(this.getWebhookId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhookId() == null) ? 0 : getWebhookId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWebhookRequest clone() {
        return (UpdateWebhookRequest) super.clone();
    }

}

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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeHub" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHubResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Hub resource that was retrieved.
     * </p>
     */
    private String hubArn;
    /**
     * <p>
     * The date and time when Security Hub was enabled in the account.
     * </p>
     */
    private String subscribedAt;
    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     * <code>false</code>, then new controls are not enabled.
     * </p>
     */
    private Boolean autoEnableControls;

    /**
     * <p>
     * The ARN of the Hub resource that was retrieved.
     * </p>
     * 
     * @param hubArn
     *        The ARN of the Hub resource that was retrieved.
     */

    public void setHubArn(String hubArn) {
        this.hubArn = hubArn;
    }

    /**
     * <p>
     * The ARN of the Hub resource that was retrieved.
     * </p>
     * 
     * @return The ARN of the Hub resource that was retrieved.
     */

    public String getHubArn() {
        return this.hubArn;
    }

    /**
     * <p>
     * The ARN of the Hub resource that was retrieved.
     * </p>
     * 
     * @param hubArn
     *        The ARN of the Hub resource that was retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubResult withHubArn(String hubArn) {
        setHubArn(hubArn);
        return this;
    }

    /**
     * <p>
     * The date and time when Security Hub was enabled in the account.
     * </p>
     * 
     * @param subscribedAt
     *        The date and time when Security Hub was enabled in the account.
     */

    public void setSubscribedAt(String subscribedAt) {
        this.subscribedAt = subscribedAt;
    }

    /**
     * <p>
     * The date and time when Security Hub was enabled in the account.
     * </p>
     * 
     * @return The date and time when Security Hub was enabled in the account.
     */

    public String getSubscribedAt() {
        return this.subscribedAt;
    }

    /**
     * <p>
     * The date and time when Security Hub was enabled in the account.
     * </p>
     * 
     * @param subscribedAt
     *        The date and time when Security Hub was enabled in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubResult withSubscribedAt(String subscribedAt) {
        setSubscribedAt(subscribedAt);
        return this;
    }

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     * <code>false</code>, then new controls are not enabled.
     * </p>
     * 
     * @param autoEnableControls
     *        Whether to automatically enable new controls when they are added to standards that are enabled.</p>
     *        <p>
     *        If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     *        <code>false</code>, then new controls are not enabled.
     */

    public void setAutoEnableControls(Boolean autoEnableControls) {
        this.autoEnableControls = autoEnableControls;
    }

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     * <code>false</code>, then new controls are not enabled.
     * </p>
     * 
     * @return Whether to automatically enable new controls when they are added to standards that are enabled.</p>
     *         <p>
     *         If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     *         <code>false</code>, then new controls are not enabled.
     */

    public Boolean getAutoEnableControls() {
        return this.autoEnableControls;
    }

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     * <code>false</code>, then new controls are not enabled.
     * </p>
     * 
     * @param autoEnableControls
     *        Whether to automatically enable new controls when they are added to standards that are enabled.</p>
     *        <p>
     *        If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     *        <code>false</code>, then new controls are not enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubResult withAutoEnableControls(Boolean autoEnableControls) {
        setAutoEnableControls(autoEnableControls);
        return this;
    }

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     * <code>false</code>, then new controls are not enabled.
     * </p>
     * 
     * @return Whether to automatically enable new controls when they are added to standards that are enabled.</p>
     *         <p>
     *         If set to <code>true</code>, then new controls for enabled standards are enabled automatically. If set to
     *         <code>false</code>, then new controls are not enabled.
     */

    public Boolean isAutoEnableControls() {
        return this.autoEnableControls;
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
        if (getHubArn() != null)
            sb.append("HubArn: ").append(getHubArn()).append(",");
        if (getSubscribedAt() != null)
            sb.append("SubscribedAt: ").append(getSubscribedAt()).append(",");
        if (getAutoEnableControls() != null)
            sb.append("AutoEnableControls: ").append(getAutoEnableControls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHubResult == false)
            return false;
        DescribeHubResult other = (DescribeHubResult) obj;
        if (other.getHubArn() == null ^ this.getHubArn() == null)
            return false;
        if (other.getHubArn() != null && other.getHubArn().equals(this.getHubArn()) == false)
            return false;
        if (other.getSubscribedAt() == null ^ this.getSubscribedAt() == null)
            return false;
        if (other.getSubscribedAt() != null && other.getSubscribedAt().equals(this.getSubscribedAt()) == false)
            return false;
        if (other.getAutoEnableControls() == null ^ this.getAutoEnableControls() == null)
            return false;
        if (other.getAutoEnableControls() != null && other.getAutoEnableControls().equals(this.getAutoEnableControls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHubArn() == null) ? 0 : getHubArn().hashCode());
        hashCode = prime * hashCode + ((getSubscribedAt() == null) ? 0 : getSubscribedAt().hashCode());
        hashCode = prime * hashCode + ((getAutoEnableControls() == null) ? 0 : getAutoEnableControls().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHubResult clone() {
        try {
            return (DescribeHubResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

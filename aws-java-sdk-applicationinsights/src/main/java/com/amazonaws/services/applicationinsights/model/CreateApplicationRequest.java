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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource group.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * When set to <code>true</code>, creates opsItems for any problems detected on an application.
     * </p>
     */
    private Boolean opsCenterEnabled;
    /**
     * <p>
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as
     * <code>instance terminated</code>, <code>failed deployment</code>, and others.
     * </p>
     */
    private Boolean cWEMonitorEnabled;
    /**
     * <p>
     * The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive
     * notifications for updates to the opsItem.
     * </p>
     */
    private String opsItemSNSTopicArn;
    /**
     * <p>
     * List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     * <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @return The name of the resource group.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, creates opsItems for any problems detected on an application.
     * </p>
     * 
     * @param opsCenterEnabled
     *        When set to <code>true</code>, creates opsItems for any problems detected on an application.
     */

    public void setOpsCenterEnabled(Boolean opsCenterEnabled) {
        this.opsCenterEnabled = opsCenterEnabled;
    }

    /**
     * <p>
     * When set to <code>true</code>, creates opsItems for any problems detected on an application.
     * </p>
     * 
     * @return When set to <code>true</code>, creates opsItems for any problems detected on an application.
     */

    public Boolean getOpsCenterEnabled() {
        return this.opsCenterEnabled;
    }

    /**
     * <p>
     * When set to <code>true</code>, creates opsItems for any problems detected on an application.
     * </p>
     * 
     * @param opsCenterEnabled
     *        When set to <code>true</code>, creates opsItems for any problems detected on an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withOpsCenterEnabled(Boolean opsCenterEnabled) {
        setOpsCenterEnabled(opsCenterEnabled);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, creates opsItems for any problems detected on an application.
     * </p>
     * 
     * @return When set to <code>true</code>, creates opsItems for any problems detected on an application.
     */

    public Boolean isOpsCenterEnabled() {
        return this.opsCenterEnabled;
    }

    /**
     * <p>
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as
     * <code>instance terminated</code>, <code>failed deployment</code>, and others.
     * </p>
     * 
     * @param cWEMonitorEnabled
     *        Indicates whether Application Insights can listen to CloudWatch events for the application resources, such
     *        as <code>instance terminated</code>, <code>failed deployment</code>, and others.
     */

    public void setCWEMonitorEnabled(Boolean cWEMonitorEnabled) {
        this.cWEMonitorEnabled = cWEMonitorEnabled;
    }

    /**
     * <p>
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as
     * <code>instance terminated</code>, <code>failed deployment</code>, and others.
     * </p>
     * 
     * @return Indicates whether Application Insights can listen to CloudWatch events for the application resources,
     *         such as <code>instance terminated</code>, <code>failed deployment</code>, and others.
     */

    public Boolean getCWEMonitorEnabled() {
        return this.cWEMonitorEnabled;
    }

    /**
     * <p>
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as
     * <code>instance terminated</code>, <code>failed deployment</code>, and others.
     * </p>
     * 
     * @param cWEMonitorEnabled
     *        Indicates whether Application Insights can listen to CloudWatch events for the application resources, such
     *        as <code>instance terminated</code>, <code>failed deployment</code>, and others.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withCWEMonitorEnabled(Boolean cWEMonitorEnabled) {
        setCWEMonitorEnabled(cWEMonitorEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as
     * <code>instance terminated</code>, <code>failed deployment</code>, and others.
     * </p>
     * 
     * @return Indicates whether Application Insights can listen to CloudWatch events for the application resources,
     *         such as <code>instance terminated</code>, <code>failed deployment</code>, and others.
     */

    public Boolean isCWEMonitorEnabled() {
        return this.cWEMonitorEnabled;
    }

    /**
     * <p>
     * The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive
     * notifications for updates to the opsItem.
     * </p>
     * 
     * @param opsItemSNSTopicArn
     *        The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to
     *        receive notifications for updates to the opsItem.
     */

    public void setOpsItemSNSTopicArn(String opsItemSNSTopicArn) {
        this.opsItemSNSTopicArn = opsItemSNSTopicArn;
    }

    /**
     * <p>
     * The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive
     * notifications for updates to the opsItem.
     * </p>
     * 
     * @return The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to
     *         receive notifications for updates to the opsItem.
     */

    public String getOpsItemSNSTopicArn() {
        return this.opsItemSNSTopicArn;
    }

    /**
     * <p>
     * The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive
     * notifications for updates to the opsItem.
     * </p>
     * 
     * @param opsItemSNSTopicArn
     *        The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to
     *        receive notifications for updates to the opsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withOpsItemSNSTopicArn(String opsItemSNSTopicArn) {
        setOpsItemSNSTopicArn(opsItemSNSTopicArn);
        return this;
    }

    /**
     * <p>
     * List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     * <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * 
     * @return List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     *         <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value
     *         is 256 characters.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     * <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * 
     * @param tags
     *        List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     *        <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value
     *        is 256 characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     * <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     *        <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value
     *        is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     * <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * 
     * @param tags
     *        List of tags to add to the application. tag key (<code>Key</code>) and an associated tag value (
     *        <code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length of a tag value
     *        is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getOpsCenterEnabled() != null)
            sb.append("OpsCenterEnabled: ").append(getOpsCenterEnabled()).append(",");
        if (getCWEMonitorEnabled() != null)
            sb.append("CWEMonitorEnabled: ").append(getCWEMonitorEnabled()).append(",");
        if (getOpsItemSNSTopicArn() != null)
            sb.append("OpsItemSNSTopicArn: ").append(getOpsItemSNSTopicArn()).append(",");
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

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getOpsCenterEnabled() == null ^ this.getOpsCenterEnabled() == null)
            return false;
        if (other.getOpsCenterEnabled() != null && other.getOpsCenterEnabled().equals(this.getOpsCenterEnabled()) == false)
            return false;
        if (other.getCWEMonitorEnabled() == null ^ this.getCWEMonitorEnabled() == null)
            return false;
        if (other.getCWEMonitorEnabled() != null && other.getCWEMonitorEnabled().equals(this.getCWEMonitorEnabled()) == false)
            return false;
        if (other.getOpsItemSNSTopicArn() == null ^ this.getOpsItemSNSTopicArn() == null)
            return false;
        if (other.getOpsItemSNSTopicArn() != null && other.getOpsItemSNSTopicArn().equals(this.getOpsItemSNSTopicArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getOpsCenterEnabled() == null) ? 0 : getOpsCenterEnabled().hashCode());
        hashCode = prime * hashCode + ((getCWEMonitorEnabled() == null) ? 0 : getCWEMonitorEnabled().hashCode());
        hashCode = prime * hashCode + ((getOpsItemSNSTopicArn() == null) ? 0 : getOpsItemSNSTopicArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}

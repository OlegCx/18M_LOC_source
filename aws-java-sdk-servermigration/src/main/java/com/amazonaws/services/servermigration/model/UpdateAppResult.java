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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary description of the application.
     * </p>
     */
    private AppSummary appSummary;
    /**
     * <p>
     * The updated server groups in the application.
     * </p>
     */
    private java.util.List<ServerGroup> serverGroups;
    /**
     * <p>
     * The tags associated with the application.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A summary description of the application.
     * </p>
     * 
     * @param appSummary
     *        A summary description of the application.
     */

    public void setAppSummary(AppSummary appSummary) {
        this.appSummary = appSummary;
    }

    /**
     * <p>
     * A summary description of the application.
     * </p>
     * 
     * @return A summary description of the application.
     */

    public AppSummary getAppSummary() {
        return this.appSummary;
    }

    /**
     * <p>
     * A summary description of the application.
     * </p>
     * 
     * @param appSummary
     *        A summary description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppResult withAppSummary(AppSummary appSummary) {
        setAppSummary(appSummary);
        return this;
    }

    /**
     * <p>
     * The updated server groups in the application.
     * </p>
     * 
     * @return The updated server groups in the application.
     */

    public java.util.List<ServerGroup> getServerGroups() {
        return serverGroups;
    }

    /**
     * <p>
     * The updated server groups in the application.
     * </p>
     * 
     * @param serverGroups
     *        The updated server groups in the application.
     */

    public void setServerGroups(java.util.Collection<ServerGroup> serverGroups) {
        if (serverGroups == null) {
            this.serverGroups = null;
            return;
        }

        this.serverGroups = new java.util.ArrayList<ServerGroup>(serverGroups);
    }

    /**
     * <p>
     * The updated server groups in the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerGroups(java.util.Collection)} or {@link #withServerGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serverGroups
     *        The updated server groups in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppResult withServerGroups(ServerGroup... serverGroups) {
        if (this.serverGroups == null) {
            setServerGroups(new java.util.ArrayList<ServerGroup>(serverGroups.length));
        }
        for (ServerGroup ele : serverGroups) {
            this.serverGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated server groups in the application.
     * </p>
     * 
     * @param serverGroups
     *        The updated server groups in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppResult withServerGroups(java.util.Collection<ServerGroup> serverGroups) {
        setServerGroups(serverGroups);
        return this;
    }

    /**
     * <p>
     * The tags associated with the application.
     * </p>
     * 
     * @return The tags associated with the application.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the application.
     * </p>
     * 
     * @param tags
     *        The tags associated with the application.
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
     * The tags associated with the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppResult withTags(Tag... tags) {
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
     * The tags associated with the application.
     * </p>
     * 
     * @param tags
     *        The tags associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppResult withTags(java.util.Collection<Tag> tags) {
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
        if (getAppSummary() != null)
            sb.append("AppSummary: ").append(getAppSummary()).append(",");
        if (getServerGroups() != null)
            sb.append("ServerGroups: ").append(getServerGroups()).append(",");
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

        if (obj instanceof UpdateAppResult == false)
            return false;
        UpdateAppResult other = (UpdateAppResult) obj;
        if (other.getAppSummary() == null ^ this.getAppSummary() == null)
            return false;
        if (other.getAppSummary() != null && other.getAppSummary().equals(this.getAppSummary()) == false)
            return false;
        if (other.getServerGroups() == null ^ this.getServerGroups() == null)
            return false;
        if (other.getServerGroups() != null && other.getServerGroups().equals(this.getServerGroups()) == false)
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

        hashCode = prime * hashCode + ((getAppSummary() == null) ? 0 : getAppSummary().hashCode());
        hashCode = prime * hashCode + ((getServerGroups() == null) ? 0 : getServerGroups().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppResult clone() {
        try {
            return (UpdateAppResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

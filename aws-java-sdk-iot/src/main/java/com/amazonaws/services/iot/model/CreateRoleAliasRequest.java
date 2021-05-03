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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoleAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
     * </p>
     */
    private String roleAlias;
    /**
     * <p>
     * The role ARN.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * How long (in seconds) the credentials will be valid.
     * </p>
     */
    private Integer credentialDurationSeconds;
    /**
     * <p>
     * Metadata which can be used to manage the role alias.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
     * </p>
     * 
     * @param roleAlias
     *        The role alias that points to a role ARN. This allows you to change the role without having to update the
     *        device.
     */

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    /**
     * <p>
     * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
     * </p>
     * 
     * @return The role alias that points to a role ARN. This allows you to change the role without having to update the
     *         device.
     */

    public String getRoleAlias() {
        return this.roleAlias;
    }

    /**
     * <p>
     * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
     * </p>
     * 
     * @param roleAlias
     *        The role alias that points to a role ARN. This allows you to change the role without having to update the
     *        device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleAliasRequest withRoleAlias(String roleAlias) {
        setRoleAlias(roleAlias);
        return this;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @param roleArn
     *        The role ARN.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @return The role ARN.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @param roleArn
     *        The role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleAliasRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * How long (in seconds) the credentials will be valid.
     * </p>
     * 
     * @param credentialDurationSeconds
     *        How long (in seconds) the credentials will be valid.
     */

    public void setCredentialDurationSeconds(Integer credentialDurationSeconds) {
        this.credentialDurationSeconds = credentialDurationSeconds;
    }

    /**
     * <p>
     * How long (in seconds) the credentials will be valid.
     * </p>
     * 
     * @return How long (in seconds) the credentials will be valid.
     */

    public Integer getCredentialDurationSeconds() {
        return this.credentialDurationSeconds;
    }

    /**
     * <p>
     * How long (in seconds) the credentials will be valid.
     * </p>
     * 
     * @param credentialDurationSeconds
     *        How long (in seconds) the credentials will be valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleAliasRequest withCredentialDurationSeconds(Integer credentialDurationSeconds) {
        setCredentialDurationSeconds(credentialDurationSeconds);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the role alias.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @return Metadata which can be used to manage the role alias.</p> <note>
     *         <p>
     *         For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *         </p>
     *         <p>
     *         For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *         </p>
     *         <p>
     *         For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the role alias.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @param tags
     *        Metadata which can be used to manage the role alias.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
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
     * Metadata which can be used to manage the role alias.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the role alias.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleAliasRequest withTags(Tag... tags) {
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
     * Metadata which can be used to manage the role alias.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @param tags
     *        Metadata which can be used to manage the role alias.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleAliasRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getRoleAlias() != null)
            sb.append("RoleAlias: ").append(getRoleAlias()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getCredentialDurationSeconds() != null)
            sb.append("CredentialDurationSeconds: ").append(getCredentialDurationSeconds()).append(",");
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

        if (obj instanceof CreateRoleAliasRequest == false)
            return false;
        CreateRoleAliasRequest other = (CreateRoleAliasRequest) obj;
        if (other.getRoleAlias() == null ^ this.getRoleAlias() == null)
            return false;
        if (other.getRoleAlias() != null && other.getRoleAlias().equals(this.getRoleAlias()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCredentialDurationSeconds() == null ^ this.getCredentialDurationSeconds() == null)
            return false;
        if (other.getCredentialDurationSeconds() != null && other.getCredentialDurationSeconds().equals(this.getCredentialDurationSeconds()) == false)
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

        hashCode = prime * hashCode + ((getRoleAlias() == null) ? 0 : getRoleAlias().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCredentialDurationSeconds() == null) ? 0 : getCredentialDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoleAliasRequest clone() {
        return (CreateRoleAliasRequest) super.clone();
    }

}

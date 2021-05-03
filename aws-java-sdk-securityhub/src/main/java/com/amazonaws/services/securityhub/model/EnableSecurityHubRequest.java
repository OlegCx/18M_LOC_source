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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableSecurityHubRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The tags to add to the hub resource when you enable Security Hub.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not
     * provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To not enable the
     * automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     */
    private Boolean enableDefaultStandards;

    /**
     * <p>
     * The tags to add to the hub resource when you enable Security Hub.
     * </p>
     * 
     * @return The tags to add to the hub resource when you enable Security Hub.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the hub resource when you enable Security Hub.
     * </p>
     * 
     * @param tags
     *        The tags to add to the hub resource when you enable Security Hub.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to add to the hub resource when you enable Security Hub.
     * </p>
     * 
     * @param tags
     *        The tags to add to the hub resource when you enable Security Hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableSecurityHubRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EnableSecurityHubRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EnableSecurityHubRequest addTagsEntry(String key, String value) {
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

    public EnableSecurityHubRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not
     * provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To not enable the
     * automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * 
     * @param enableDefaultStandards
     *        Whether to enable the security standards that Security Hub has designated as automatically enabled. If you
     *        do not provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To not
     *        enable the automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     */

    public void setEnableDefaultStandards(Boolean enableDefaultStandards) {
        this.enableDefaultStandards = enableDefaultStandards;
    }

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not
     * provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To not enable the
     * automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * 
     * @return Whether to enable the security standards that Security Hub has designated as automatically enabled. If
     *         you do not provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To
     *         not enable the automatically enabled standards, set <code>EnableDefaultStandards</code> to
     *         <code>false</code>.
     */

    public Boolean getEnableDefaultStandards() {
        return this.enableDefaultStandards;
    }

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not
     * provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To not enable the
     * automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * 
     * @param enableDefaultStandards
     *        Whether to enable the security standards that Security Hub has designated as automatically enabled. If you
     *        do not provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To not
     *        enable the automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableSecurityHubRequest withEnableDefaultStandards(Boolean enableDefaultStandards) {
        setEnableDefaultStandards(enableDefaultStandards);
        return this;
    }

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not
     * provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To not enable the
     * automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * 
     * @return Whether to enable the security standards that Security Hub has designated as automatically enabled. If
     *         you do not provide a value for <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To
     *         not enable the automatically enabled standards, set <code>EnableDefaultStandards</code> to
     *         <code>false</code>.
     */

    public Boolean isEnableDefaultStandards() {
        return this.enableDefaultStandards;
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getEnableDefaultStandards() != null)
            sb.append("EnableDefaultStandards: ").append(getEnableDefaultStandards());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableSecurityHubRequest == false)
            return false;
        EnableSecurityHubRequest other = (EnableSecurityHubRequest) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEnableDefaultStandards() == null ^ this.getEnableDefaultStandards() == null)
            return false;
        if (other.getEnableDefaultStandards() != null && other.getEnableDefaultStandards().equals(this.getEnableDefaultStandards()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultStandards() == null) ? 0 : getEnableDefaultStandards().hashCode());
        return hashCode;
    }

    @Override
    public EnableSecurityHubRequest clone() {
        return (EnableSecurityHubRequest) super.clone();
    }

}

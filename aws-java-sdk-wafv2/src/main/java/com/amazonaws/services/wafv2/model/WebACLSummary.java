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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * High-level information about a <a>WebACL</a>, returned by operations like create and list. This provides information
 * like the ID, that you can use to retrieve and manage a <code>WebACL</code>, and the ARN, that you provide to
 * operations like <a>AssociateWebACL</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/WebACLSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebACLSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A description of the Web ACL that helps with identification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     */
    private String lockToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @param name
     *        The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @return The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @param name
     *        The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACLSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @return The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *         You provide it to operations like update and delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACLSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A description of the Web ACL that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the Web ACL that helps with identification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the Web ACL that helps with identification.
     * </p>
     * 
     * @return A description of the Web ACL that helps with identification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the Web ACL that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the Web ACL that helps with identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACLSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     */

    public void setLockToken(String lockToken) {
        this.lockToken = lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *         state of the entity at the time of the request. To make changes to the entity associated with the token,
     *         you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *         changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *         fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *         new token returned by that operation.
     */

    public String getLockToken() {
        return this.lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACLSummary withLockToken(String lockToken) {
        setLockToken(lockToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the entity.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACLSummary withARN(String aRN) {
        setARN(aRN);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLockToken() != null)
            sb.append("LockToken: ").append(getLockToken()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebACLSummary == false)
            return false;
        WebACLSummary other = (WebACLSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLockToken() == null ^ this.getLockToken() == null)
            return false;
        if (other.getLockToken() != null && other.getLockToken().equals(this.getLockToken()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLockToken() == null) ? 0 : getLockToken().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public WebACLSummary clone() {
        try {
            return (WebACLSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.WebACLSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

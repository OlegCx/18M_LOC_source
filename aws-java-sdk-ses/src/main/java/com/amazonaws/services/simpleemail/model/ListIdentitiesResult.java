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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of all identities that you have attempted to verify under your AWS account, regardless of verification status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of identities.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> identities;
    /**
     * <p>
     * The token used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of identities.
     * </p>
     * 
     * @return A list of identities.
     */

    public java.util.List<String> getIdentities() {
        if (identities == null) {
            identities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return identities;
    }

    /**
     * <p>
     * A list of identities.
     * </p>
     * 
     * @param identities
     *        A list of identities.
     */

    public void setIdentities(java.util.Collection<String> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }

        this.identities = new com.amazonaws.internal.SdkInternalList<String>(identities);
    }

    /**
     * <p>
     * A list of identities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentities(java.util.Collection)} or {@link #withIdentities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param identities
     *        A list of identities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesResult withIdentities(String... identities) {
        if (this.identities == null) {
            setIdentities(new com.amazonaws.internal.SdkInternalList<String>(identities.length));
        }
        for (String ele : identities) {
            this.identities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identities.
     * </p>
     * 
     * @param identities
     *        A list of identities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesResult withIdentities(java.util.Collection<String> identities) {
        setIdentities(identities);
        return this;
    }

    /**
     * <p>
     * The token used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token used for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used for pagination.
     * </p>
     * 
     * @return The token used for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token used for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getIdentities() != null)
            sb.append("Identities: ").append(getIdentities()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdentitiesResult == false)
            return false;
        ListIdentitiesResult other = (ListIdentitiesResult) obj;
        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null && other.getIdentities().equals(this.getIdentities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentitiesResult clone() {
        try {
            return (ListIdentitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

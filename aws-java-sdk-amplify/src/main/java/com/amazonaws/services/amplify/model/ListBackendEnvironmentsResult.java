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

/**
 * <p>
 * The result structure for the list backend environments result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBackendEnvironments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackendEnvironmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     */
    private java.util.List<BackendEnvironment> backendEnvironments;
    /**
     * <p>
     * A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to
     * retrieve more entries.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     * 
     * @return The list of backend environments for an Amplify app.
     */

    public java.util.List<BackendEnvironment> getBackendEnvironments() {
        return backendEnvironments;
    }

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     * 
     * @param backendEnvironments
     *        The list of backend environments for an Amplify app.
     */

    public void setBackendEnvironments(java.util.Collection<BackendEnvironment> backendEnvironments) {
        if (backendEnvironments == null) {
            this.backendEnvironments = null;
            return;
        }

        this.backendEnvironments = new java.util.ArrayList<BackendEnvironment>(backendEnvironments);
    }

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackendEnvironments(java.util.Collection)} or {@link #withBackendEnvironments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param backendEnvironments
     *        The list of backend environments for an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendEnvironmentsResult withBackendEnvironments(BackendEnvironment... backendEnvironments) {
        if (this.backendEnvironments == null) {
            setBackendEnvironments(new java.util.ArrayList<BackendEnvironment>(backendEnvironments.length));
        }
        for (BackendEnvironment ele : backendEnvironments) {
            this.backendEnvironments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     * 
     * @param backendEnvironments
     *        The list of backend environments for an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendEnvironmentsResult withBackendEnvironments(java.util.Collection<BackendEnvironment> backendEnvironments) {
        setBackendEnvironments(backendEnvironments);
        return this;
    }

    /**
     * <p>
     * A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to
     * retrieve more entries.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. If a non-null pagination token is returned in a result, pass its value in another
     *        request to retrieve more entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to
     * retrieve more entries.
     * </p>
     * 
     * @return A pagination token. If a non-null pagination token is returned in a result, pass its value in another
     *         request to retrieve more entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to
     * retrieve more entries.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. If a non-null pagination token is returned in a result, pass its value in another
     *        request to retrieve more entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendEnvironmentsResult withNextToken(String nextToken) {
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
        if (getBackendEnvironments() != null)
            sb.append("BackendEnvironments: ").append(getBackendEnvironments()).append(",");
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

        if (obj instanceof ListBackendEnvironmentsResult == false)
            return false;
        ListBackendEnvironmentsResult other = (ListBackendEnvironmentsResult) obj;
        if (other.getBackendEnvironments() == null ^ this.getBackendEnvironments() == null)
            return false;
        if (other.getBackendEnvironments() != null && other.getBackendEnvironments().equals(this.getBackendEnvironments()) == false)
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

        hashCode = prime * hashCode + ((getBackendEnvironments() == null) ? 0 : getBackendEnvironments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBackendEnvironmentsResult clone() {
        try {
            return (ListBackendEnvironmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

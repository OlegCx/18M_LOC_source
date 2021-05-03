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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DeleteGitHubAccount</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteGitHubAccountToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteGitHubAccountTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the GitHub account connection to delete.
     * </p>
     */
    private String tokenName;

    /**
     * <p>
     * The name of the GitHub account connection to delete.
     * </p>
     * 
     * @param tokenName
     *        The name of the GitHub account connection to delete.
     */

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    /**
     * <p>
     * The name of the GitHub account connection to delete.
     * </p>
     * 
     * @return The name of the GitHub account connection to delete.
     */

    public String getTokenName() {
        return this.tokenName;
    }

    /**
     * <p>
     * The name of the GitHub account connection to delete.
     * </p>
     * 
     * @param tokenName
     *        The name of the GitHub account connection to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGitHubAccountTokenRequest withTokenName(String tokenName) {
        setTokenName(tokenName);
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
        if (getTokenName() != null)
            sb.append("TokenName: ").append(getTokenName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGitHubAccountTokenRequest == false)
            return false;
        DeleteGitHubAccountTokenRequest other = (DeleteGitHubAccountTokenRequest) obj;
        if (other.getTokenName() == null ^ this.getTokenName() == null)
            return false;
        if (other.getTokenName() != null && other.getTokenName().equals(this.getTokenName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenName() == null) ? 0 : getTokenName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGitHubAccountTokenRequest clone() {
        return (DeleteGitHubAccountTokenRequest) super.clone();
    }

}

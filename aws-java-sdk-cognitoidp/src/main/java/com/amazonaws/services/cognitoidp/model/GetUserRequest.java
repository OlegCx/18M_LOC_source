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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to get information about the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The access token returned by the server response to get information about the user.
     * </p>
     */
    private String accessToken;

    /**
     * <p>
     * The access token returned by the server response to get information about the user.
     * </p>
     * 
     * @param accessToken
     *        The access token returned by the server response to get information about the user.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token returned by the server response to get information about the user.
     * </p>
     * 
     * @return The access token returned by the server response to get information about the user.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The access token returned by the server response to get information about the user.
     * </p>
     * 
     * @param accessToken
     *        The access token returned by the server response to get information about the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserRequest == false)
            return false;
        GetUserRequest other = (GetUserRequest) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public GetUserRequest clone() {
        return (GetUserRequest) super.clone();
    }

}

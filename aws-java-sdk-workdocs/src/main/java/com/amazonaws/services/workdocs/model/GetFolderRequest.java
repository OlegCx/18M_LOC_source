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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFolderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the folder.
     * </p>
     */
    private String folderId;
    /**
     * <p>
     * Set to TRUE to include custom metadata in the response.
     * </p>
     */
    private Boolean includeCustomMetadata;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the
     *        API.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the
     *         API.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param folderId
     *        The ID of the folder.
     */

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @return The ID of the folder.
     */

    public String getFolderId() {
        return this.folderId;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param folderId
     *        The ID of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderRequest withFolderId(String folderId) {
        setFolderId(folderId);
        return this;
    }

    /**
     * <p>
     * Set to TRUE to include custom metadata in the response.
     * </p>
     * 
     * @param includeCustomMetadata
     *        Set to TRUE to include custom metadata in the response.
     */

    public void setIncludeCustomMetadata(Boolean includeCustomMetadata) {
        this.includeCustomMetadata = includeCustomMetadata;
    }

    /**
     * <p>
     * Set to TRUE to include custom metadata in the response.
     * </p>
     * 
     * @return Set to TRUE to include custom metadata in the response.
     */

    public Boolean getIncludeCustomMetadata() {
        return this.includeCustomMetadata;
    }

    /**
     * <p>
     * Set to TRUE to include custom metadata in the response.
     * </p>
     * 
     * @param includeCustomMetadata
     *        Set to TRUE to include custom metadata in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderRequest withIncludeCustomMetadata(Boolean includeCustomMetadata) {
        setIncludeCustomMetadata(includeCustomMetadata);
        return this;
    }

    /**
     * <p>
     * Set to TRUE to include custom metadata in the response.
     * </p>
     * 
     * @return Set to TRUE to include custom metadata in the response.
     */

    public Boolean isIncludeCustomMetadata() {
        return this.includeCustomMetadata;
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getFolderId() != null)
            sb.append("FolderId: ").append(getFolderId()).append(",");
        if (getIncludeCustomMetadata() != null)
            sb.append("IncludeCustomMetadata: ").append(getIncludeCustomMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFolderRequest == false)
            return false;
        GetFolderRequest other = (GetFolderRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getFolderId() == null ^ this.getFolderId() == null)
            return false;
        if (other.getFolderId() != null && other.getFolderId().equals(this.getFolderId()) == false)
            return false;
        if (other.getIncludeCustomMetadata() == null ^ this.getIncludeCustomMetadata() == null)
            return false;
        if (other.getIncludeCustomMetadata() != null && other.getIncludeCustomMetadata().equals(this.getIncludeCustomMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getFolderId() == null) ? 0 : getFolderId().hashCode());
        hashCode = prime * hashCode + ((getIncludeCustomMetadata() == null) ? 0 : getIncludeCustomMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetFolderRequest clone() {
        return (GetFolderRequest) super.clone();
    }

}

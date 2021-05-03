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
 * Returns the result structure for the get artifact request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetArtifactUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArtifactUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for an artifact.
     * </p>
     */
    private String artifactId;
    /**
     * <p>
     * The presigned URL for the artifact.
     * </p>
     */
    private String artifactUrl;

    /**
     * <p>
     * The unique ID for an artifact.
     * </p>
     * 
     * @param artifactId
     *        The unique ID for an artifact.
     */

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * <p>
     * The unique ID for an artifact.
     * </p>
     * 
     * @return The unique ID for an artifact.
     */

    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * <p>
     * The unique ID for an artifact.
     * </p>
     * 
     * @param artifactId
     *        The unique ID for an artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArtifactUrlResult withArtifactId(String artifactId) {
        setArtifactId(artifactId);
        return this;
    }

    /**
     * <p>
     * The presigned URL for the artifact.
     * </p>
     * 
     * @param artifactUrl
     *        The presigned URL for the artifact.
     */

    public void setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    /**
     * <p>
     * The presigned URL for the artifact.
     * </p>
     * 
     * @return The presigned URL for the artifact.
     */

    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    /**
     * <p>
     * The presigned URL for the artifact.
     * </p>
     * 
     * @param artifactUrl
     *        The presigned URL for the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArtifactUrlResult withArtifactUrl(String artifactUrl) {
        setArtifactUrl(artifactUrl);
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
        if (getArtifactId() != null)
            sb.append("ArtifactId: ").append(getArtifactId()).append(",");
        if (getArtifactUrl() != null)
            sb.append("ArtifactUrl: ").append(getArtifactUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArtifactUrlResult == false)
            return false;
        GetArtifactUrlResult other = (GetArtifactUrlResult) obj;
        if (other.getArtifactId() == null ^ this.getArtifactId() == null)
            return false;
        if (other.getArtifactId() != null && other.getArtifactId().equals(this.getArtifactId()) == false)
            return false;
        if (other.getArtifactUrl() == null ^ this.getArtifactUrl() == null)
            return false;
        if (other.getArtifactUrl() != null && other.getArtifactUrl().equals(this.getArtifactUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactId() == null) ? 0 : getArtifactId().hashCode());
        hashCode = prime * hashCode + ((getArtifactUrl() == null) ? 0 : getArtifactUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetArtifactUrlResult clone() {
        try {
            return (GetArtifactUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateConnectivityInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectivityInfoResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A message about the connectivity info update request. */
    private String message;
    /** The new version of the connectivity info. */
    private String version;

    /**
     * A message about the connectivity info update request.
     * 
     * @param message
     *        A message about the connectivity info update request.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * A message about the connectivity info update request.
     * 
     * @return A message about the connectivity info update request.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * A message about the connectivity info update request.
     * 
     * @param message
     *        A message about the connectivity info update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectivityInfoResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * The new version of the connectivity info.
     * 
     * @param version
     *        The new version of the connectivity info.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * The new version of the connectivity info.
     * 
     * @return The new version of the connectivity info.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * The new version of the connectivity info.
     * 
     * @param version
     *        The new version of the connectivity info.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectivityInfoResult withVersion(String version) {
        setVersion(version);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectivityInfoResult == false)
            return false;
        UpdateConnectivityInfoResult other = (UpdateConnectivityInfoResult) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectivityInfoResult clone() {
        try {
            return (UpdateConnectivityInfoResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

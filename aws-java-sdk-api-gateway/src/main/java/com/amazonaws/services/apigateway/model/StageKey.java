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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A reference to a unique stage identified in the format <code>{restApiId}/{stage}</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The stage name associated with the stage key.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageKey withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The stage name associated with the stage key.
     * </p>
     * 
     * @param stageName
     *        The stage name associated with the stage key.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The stage name associated with the stage key.
     * </p>
     * 
     * @return The stage name associated with the stage key.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The stage name associated with the stage key.
     * </p>
     * 
     * @param stageName
     *        The stage name associated with the stage key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageKey withStageName(String stageName) {
        setStageName(stageName);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StageKey == false)
            return false;
        StageKey other = (StageKey) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public StageKey clone() {
        try {
            return (StageKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.StageKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

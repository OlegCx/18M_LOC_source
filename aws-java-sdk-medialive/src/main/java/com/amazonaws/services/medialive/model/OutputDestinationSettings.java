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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for OutputDestinationSettings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/OutputDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /** key used to extract the password from EC2 Parameter store */
    private String passwordParam;
    /** Stream name for RTMP destinations (URLs of type rtmp://) */
    private String streamName;
    /** A URL specifying a destination */
    private String url;
    /** username for destination */
    private String username;

    /**
     * key used to extract the password from EC2 Parameter store
     * 
     * @param passwordParam
     *        key used to extract the password from EC2 Parameter store
     */

    public void setPasswordParam(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    /**
     * key used to extract the password from EC2 Parameter store
     * 
     * @return key used to extract the password from EC2 Parameter store
     */

    public String getPasswordParam() {
        return this.passwordParam;
    }

    /**
     * key used to extract the password from EC2 Parameter store
     * 
     * @param passwordParam
     *        key used to extract the password from EC2 Parameter store
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestinationSettings withPasswordParam(String passwordParam) {
        setPasswordParam(passwordParam);
        return this;
    }

    /**
     * Stream name for RTMP destinations (URLs of type rtmp://)
     * 
     * @param streamName
     *        Stream name for RTMP destinations (URLs of type rtmp://)
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * Stream name for RTMP destinations (URLs of type rtmp://)
     * 
     * @return Stream name for RTMP destinations (URLs of type rtmp://)
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * Stream name for RTMP destinations (URLs of type rtmp://)
     * 
     * @param streamName
     *        Stream name for RTMP destinations (URLs of type rtmp://)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestinationSettings withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * A URL specifying a destination
     * 
     * @param url
     *        A URL specifying a destination
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * A URL specifying a destination
     * 
     * @return A URL specifying a destination
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * A URL specifying a destination
     * 
     * @param url
     *        A URL specifying a destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestinationSettings withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * username for destination
     * 
     * @param username
     *        username for destination
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * username for destination
     * 
     * @return username for destination
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * username for destination
     * 
     * @param username
     *        username for destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestinationSettings withUsername(String username) {
        setUsername(username);
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
        if (getPasswordParam() != null)
            sb.append("PasswordParam: ").append(getPasswordParam()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDestinationSettings == false)
            return false;
        OutputDestinationSettings other = (OutputDestinationSettings) obj;
        if (other.getPasswordParam() == null ^ this.getPasswordParam() == null)
            return false;
        if (other.getPasswordParam() != null && other.getPasswordParam().equals(this.getPasswordParam()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPasswordParam() == null) ? 0 : getPasswordParam().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public OutputDestinationSettings clone() {
        try {
            return (OutputDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.OutputDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

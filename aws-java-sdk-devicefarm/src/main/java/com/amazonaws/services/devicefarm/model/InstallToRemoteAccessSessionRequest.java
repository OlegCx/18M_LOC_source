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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa format) as
 * part of a remote access session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/InstallToRemoteAccessSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstallToRemoteAccessSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
     * </p>
     */
    private String remoteAccessSessionArn;
    /**
     * <p>
     * The ARN of the app about which you are requesting information.
     * </p>
     */
    private String appArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
     * </p>
     * 
     * @param remoteAccessSessionArn
     *        The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
     */

    public void setRemoteAccessSessionArn(String remoteAccessSessionArn) {
        this.remoteAccessSessionArn = remoteAccessSessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
     */

    public String getRemoteAccessSessionArn() {
        return this.remoteAccessSessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
     * </p>
     * 
     * @param remoteAccessSessionArn
     *        The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstallToRemoteAccessSessionRequest withRemoteAccessSessionArn(String remoteAccessSessionArn) {
        setRemoteAccessSessionArn(remoteAccessSessionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the app about which you are requesting information.
     * </p>
     * 
     * @param appArn
     *        The ARN of the app about which you are requesting information.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The ARN of the app about which you are requesting information.
     * </p>
     * 
     * @return The ARN of the app about which you are requesting information.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The ARN of the app about which you are requesting information.
     * </p>
     * 
     * @param appArn
     *        The ARN of the app about which you are requesting information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstallToRemoteAccessSessionRequest withAppArn(String appArn) {
        setAppArn(appArn);
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
        if (getRemoteAccessSessionArn() != null)
            sb.append("RemoteAccessSessionArn: ").append(getRemoteAccessSessionArn()).append(",");
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstallToRemoteAccessSessionRequest == false)
            return false;
        InstallToRemoteAccessSessionRequest other = (InstallToRemoteAccessSessionRequest) obj;
        if (other.getRemoteAccessSessionArn() == null ^ this.getRemoteAccessSessionArn() == null)
            return false;
        if (other.getRemoteAccessSessionArn() != null && other.getRemoteAccessSessionArn().equals(this.getRemoteAccessSessionArn()) == false)
            return false;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemoteAccessSessionArn() == null) ? 0 : getRemoteAccessSessionArn().hashCode());
        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        return hashCode;
    }

    @Override
    public InstallToRemoteAccessSessionRequest clone() {
        return (InstallToRemoteAccessSessionRequest) super.clone();
    }

}

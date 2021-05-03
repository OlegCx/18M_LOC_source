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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for GetPlatformApplicationAttributes action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetPlatformApplicationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPlatformApplicationAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * </p>
     */
    private String platformApplicationArn;

    /**
     * <p>
     * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * </p>
     * 
     * @param platformApplicationArn
     *        PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     */

    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * </p>
     * 
     * @return PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     */

    public String getPlatformApplicationArn() {
        return this.platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * </p>
     * 
     * @param platformApplicationArn
     *        PlatformApplicationArn for GetPlatformApplicationAttributesInput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlatformApplicationAttributesRequest withPlatformApplicationArn(String platformApplicationArn) {
        setPlatformApplicationArn(platformApplicationArn);
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
        if (getPlatformApplicationArn() != null)
            sb.append("PlatformApplicationArn: ").append(getPlatformApplicationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlatformApplicationAttributesRequest == false)
            return false;
        GetPlatformApplicationAttributesRequest other = (GetPlatformApplicationAttributesRequest) obj;
        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null)
            return false;
        if (other.getPlatformApplicationArn() != null && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformApplicationArn() == null) ? 0 : getPlatformApplicationArn().hashCode());
        return hashCode;
    }

    @Override
    public GetPlatformApplicationAttributesRequest clone() {
        return (GetPlatformApplicationAttributesRequest) super.clone();
    }

}

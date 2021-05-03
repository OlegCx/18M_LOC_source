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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSigningProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the target signing profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The AWS account ID of the profile owner.
     * </p>
     */
    private String profileOwner;

    /**
     * <p>
     * The name of the target signing profile.
     * </p>
     * 
     * @param profileName
     *        The name of the target signing profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the target signing profile.
     * </p>
     * 
     * @return The name of the target signing profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the target signing profile.
     * </p>
     * 
     * @param profileName
     *        The name of the target signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the profile owner.
     * </p>
     * 
     * @param profileOwner
     *        The AWS account ID of the profile owner.
     */

    public void setProfileOwner(String profileOwner) {
        this.profileOwner = profileOwner;
    }

    /**
     * <p>
     * The AWS account ID of the profile owner.
     * </p>
     * 
     * @return The AWS account ID of the profile owner.
     */

    public String getProfileOwner() {
        return this.profileOwner;
    }

    /**
     * <p>
     * The AWS account ID of the profile owner.
     * </p>
     * 
     * @param profileOwner
     *        The AWS account ID of the profile owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileRequest withProfileOwner(String profileOwner) {
        setProfileOwner(profileOwner);
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
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getProfileOwner() != null)
            sb.append("ProfileOwner: ").append(getProfileOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSigningProfileRequest == false)
            return false;
        GetSigningProfileRequest other = (GetSigningProfileRequest) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileOwner() == null ^ this.getProfileOwner() == null)
            return false;
        if (other.getProfileOwner() != null && other.getProfileOwner().equals(this.getProfileOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileOwner() == null) ? 0 : getProfileOwner().hashCode());
        return hashCode;
    }

    @Override
    public GetSigningProfileRequest clone() {
        return (GetSigningProfileRequest) super.clone();
    }

}

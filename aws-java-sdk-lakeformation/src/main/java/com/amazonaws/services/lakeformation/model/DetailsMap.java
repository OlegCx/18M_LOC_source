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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing the additional details to be returned in the <code>AdditionalDetails</code> attribute of
 * <code>PrincipalResourcePermissions</code>.
 * </p>
 * <p>
 * If a catalog resource is shared through AWS Resource Access Manager (AWS RAM), then there will exist a corresponding
 * RAM share resource ARN.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DetailsMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetailsMap implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     * </p>
     */
    private java.util.List<String> resourceShare;

    /**
     * <p>
     * A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @return A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     */

    public java.util.List<String> getResourceShare() {
        return resourceShare;
    }

    /**
     * <p>
     * A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param resourceShare
     *        A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     */

    public void setResourceShare(java.util.Collection<String> resourceShare) {
        if (resourceShare == null) {
            this.resourceShare = null;
            return;
        }

        this.resourceShare = new java.util.ArrayList<String>(resourceShare);
    }

    /**
     * <p>
     * A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShare(java.util.Collection)} or {@link #withResourceShare(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceShare
     *        A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetailsMap withResourceShare(String... resourceShare) {
        if (this.resourceShare == null) {
            setResourceShare(new java.util.ArrayList<String>(resourceShare.length));
        }
        for (String ele : resourceShare) {
            this.resourceShare.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param resourceShare
     *        A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetailsMap withResourceShare(java.util.Collection<String> resourceShare) {
        setResourceShare(resourceShare);
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
        if (getResourceShare() != null)
            sb.append("ResourceShare: ").append(getResourceShare());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetailsMap == false)
            return false;
        DetailsMap other = (DetailsMap) obj;
        if (other.getResourceShare() == null ^ this.getResourceShare() == null)
            return false;
        if (other.getResourceShare() != null && other.getResourceShare().equals(this.getResourceShare()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShare() == null) ? 0 : getResourceShare().hashCode());
        return hashCode;
    }

    @Override
    public DetailsMap clone() {
        try {
            return (DetailsMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.DetailsMapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

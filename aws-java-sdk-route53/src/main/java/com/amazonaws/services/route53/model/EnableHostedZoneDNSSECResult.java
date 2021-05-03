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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/EnableHostedZoneDNSSEC" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableHostedZoneDNSSECResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ChangeInfo changeInfo;

    /**
     * @param changeInfo
     */

    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }

    /**
     * @return
     */

    public ChangeInfo getChangeInfo() {
        return this.changeInfo;
    }

    /**
     * @param changeInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableHostedZoneDNSSECResult withChangeInfo(ChangeInfo changeInfo) {
        setChangeInfo(changeInfo);
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
        if (getChangeInfo() != null)
            sb.append("ChangeInfo: ").append(getChangeInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableHostedZoneDNSSECResult == false)
            return false;
        EnableHostedZoneDNSSECResult other = (EnableHostedZoneDNSSECResult) obj;
        if (other.getChangeInfo() == null ^ this.getChangeInfo() == null)
            return false;
        if (other.getChangeInfo() != null && other.getChangeInfo().equals(this.getChangeInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeInfo() == null) ? 0 : getChangeInfo().hashCode());
        return hashCode;
    }

    @Override
    public EnableHostedZoneDNSSECResult clone() {
        try {
            return (EnableHostedZoneDNSSECResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

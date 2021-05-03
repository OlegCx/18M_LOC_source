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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatusForObjectLambda"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessPointPolicyStatusForObjectLambdaResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements Serializable, Cloneable {

    private PolicyStatus policyStatus;

    /**
     * @param policyStatus
     */

    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }

    /**
     * @return
     */

    public PolicyStatus getPolicyStatus() {
        return this.policyStatus;
    }

    /**
     * @param policyStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointPolicyStatusForObjectLambdaResult withPolicyStatus(PolicyStatus policyStatus) {
        setPolicyStatus(policyStatus);
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
        if (getPolicyStatus() != null)
            sb.append("PolicyStatus: ").append(getPolicyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessPointPolicyStatusForObjectLambdaResult == false)
            return false;
        GetAccessPointPolicyStatusForObjectLambdaResult other = (GetAccessPointPolicyStatusForObjectLambdaResult) obj;
        if (other.getPolicyStatus() == null ^ this.getPolicyStatus() == null)
            return false;
        if (other.getPolicyStatus() != null && other.getPolicyStatus().equals(this.getPolicyStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStatus() == null) ? 0 : getPolicyStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessPointPolicyStatusForObjectLambdaResult clone() {
        try {
            return (GetAccessPointPolicyStatusForObjectLambdaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

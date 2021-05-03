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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponentPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComponentPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component whose policy you want to retrieve.
     * </p>
     */
    private String componentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component whose policy you want to retrieve.
     * </p>
     * 
     * @param componentArn
     *        The Amazon Resource Name (ARN) of the component whose policy you want to retrieve.
     */

    public void setComponentArn(String componentArn) {
        this.componentArn = componentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component whose policy you want to retrieve.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the component whose policy you want to retrieve.
     */

    public String getComponentArn() {
        return this.componentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component whose policy you want to retrieve.
     * </p>
     * 
     * @param componentArn
     *        The Amazon Resource Name (ARN) of the component whose policy you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentPolicyRequest withComponentArn(String componentArn) {
        setComponentArn(componentArn);
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
        if (getComponentArn() != null)
            sb.append("ComponentArn: ").append(getComponentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComponentPolicyRequest == false)
            return false;
        GetComponentPolicyRequest other = (GetComponentPolicyRequest) obj;
        if (other.getComponentArn() == null ^ this.getComponentArn() == null)
            return false;
        if (other.getComponentArn() != null && other.getComponentArn().equals(this.getComponentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentArn() == null) ? 0 : getComponentArn().hashCode());
        return hashCode;
    }

    @Override
    public GetComponentPolicyRequest clone() {
        return (GetComponentPolicyRequest) super.clone();
    }

}

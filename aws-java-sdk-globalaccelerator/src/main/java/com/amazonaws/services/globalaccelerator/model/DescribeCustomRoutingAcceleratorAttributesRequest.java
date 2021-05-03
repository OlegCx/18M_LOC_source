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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAcceleratorAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomRoutingAcceleratorAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
     * </p>
     */
    private String acceleratorArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
     */

    public void setAcceleratorArn(String acceleratorArn) {
        this.acceleratorArn = acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
     */

    public String getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomRoutingAcceleratorAttributesRequest withAcceleratorArn(String acceleratorArn) {
        setAcceleratorArn(acceleratorArn);
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
        if (getAcceleratorArn() != null)
            sb.append("AcceleratorArn: ").append(getAcceleratorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomRoutingAcceleratorAttributesRequest == false)
            return false;
        DescribeCustomRoutingAcceleratorAttributesRequest other = (DescribeCustomRoutingAcceleratorAttributesRequest) obj;
        if (other.getAcceleratorArn() == null ^ this.getAcceleratorArn() == null)
            return false;
        if (other.getAcceleratorArn() != null && other.getAcceleratorArn().equals(this.getAcceleratorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorArn() == null) ? 0 : getAcceleratorArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomRoutingAcceleratorAttributesRequest clone() {
        return (DescribeCustomRoutingAcceleratorAttributesRequest) super.clone();
    }

}

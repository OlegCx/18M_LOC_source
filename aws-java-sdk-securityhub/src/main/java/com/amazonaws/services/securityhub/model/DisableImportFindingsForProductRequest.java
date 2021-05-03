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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableImportFindingsForProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the integrated product to disable the integration for.
     * </p>
     */
    private String productSubscriptionArn;

    /**
     * <p>
     * The ARN of the integrated product to disable the integration for.
     * </p>
     * 
     * @param productSubscriptionArn
     *        The ARN of the integrated product to disable the integration for.
     */

    public void setProductSubscriptionArn(String productSubscriptionArn) {
        this.productSubscriptionArn = productSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of the integrated product to disable the integration for.
     * </p>
     * 
     * @return The ARN of the integrated product to disable the integration for.
     */

    public String getProductSubscriptionArn() {
        return this.productSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of the integrated product to disable the integration for.
     * </p>
     * 
     * @param productSubscriptionArn
     *        The ARN of the integrated product to disable the integration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableImportFindingsForProductRequest withProductSubscriptionArn(String productSubscriptionArn) {
        setProductSubscriptionArn(productSubscriptionArn);
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
        if (getProductSubscriptionArn() != null)
            sb.append("ProductSubscriptionArn: ").append(getProductSubscriptionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableImportFindingsForProductRequest == false)
            return false;
        DisableImportFindingsForProductRequest other = (DisableImportFindingsForProductRequest) obj;
        if (other.getProductSubscriptionArn() == null ^ this.getProductSubscriptionArn() == null)
            return false;
        if (other.getProductSubscriptionArn() != null && other.getProductSubscriptionArn().equals(this.getProductSubscriptionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductSubscriptionArn() == null) ? 0 : getProductSubscriptionArn().hashCode());
        return hashCode;
    }

    @Override
    public DisableImportFindingsForProductRequest clone() {
        return (DisableImportFindingsForProductRequest) super.clone();
    }

}

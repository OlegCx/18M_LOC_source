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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountCustomization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountCustomizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that you want to describe QuickSight customizations for.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The QuickSight namespace that you want to describe QuickSight customizations for.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     * customizations is returned. You can add this flag to your command to use the same view that QuickSight uses to
     * identify which customizations to apply to the console. Omit this flag, or set it to <code>no-resolved</code>, to
     * reveal customizations that are configured at different levels.
     * </p>
     */
    private Boolean resolved;

    /**
     * <p>
     * The ID for the AWS account that you want to describe QuickSight customizations for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to describe QuickSight customizations for.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to describe QuickSight customizations for.
     * </p>
     * 
     * @return The ID for the AWS account that you want to describe QuickSight customizations for.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to describe QuickSight customizations for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to describe QuickSight customizations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountCustomizationRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The QuickSight namespace that you want to describe QuickSight customizations for.
     * </p>
     * 
     * @param namespace
     *        The QuickSight namespace that you want to describe QuickSight customizations for.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The QuickSight namespace that you want to describe QuickSight customizations for.
     * </p>
     * 
     * @return The QuickSight namespace that you want to describe QuickSight customizations for.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The QuickSight namespace that you want to describe QuickSight customizations for.
     * </p>
     * 
     * @param namespace
     *        The QuickSight namespace that you want to describe QuickSight customizations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountCustomizationRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     * customizations is returned. You can add this flag to your command to use the same view that QuickSight uses to
     * identify which customizations to apply to the console. Omit this flag, or set it to <code>no-resolved</code>, to
     * reveal customizations that are configured at different levels.
     * </p>
     * 
     * @param resolved
     *        The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     *        customizations is returned. You can add this flag to your command to use the same view that QuickSight
     *        uses to identify which customizations to apply to the console. Omit this flag, or set it to
     *        <code>no-resolved</code>, to reveal customizations that are configured at different levels.
     */

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    /**
     * <p>
     * The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     * customizations is returned. You can add this flag to your command to use the same view that QuickSight uses to
     * identify which customizations to apply to the console. Omit this flag, or set it to <code>no-resolved</code>, to
     * reveal customizations that are configured at different levels.
     * </p>
     * 
     * @return The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     *         customizations is returned. You can add this flag to your command to use the same view that QuickSight
     *         uses to identify which customizations to apply to the console. Omit this flag, or set it to
     *         <code>no-resolved</code>, to reveal customizations that are configured at different levels.
     */

    public Boolean getResolved() {
        return this.resolved;
    }

    /**
     * <p>
     * The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     * customizations is returned. You can add this flag to your command to use the same view that QuickSight uses to
     * identify which customizations to apply to the console. Omit this flag, or set it to <code>no-resolved</code>, to
     * reveal customizations that are configured at different levels.
     * </p>
     * 
     * @param resolved
     *        The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     *        customizations is returned. You can add this flag to your command to use the same view that QuickSight
     *        uses to identify which customizations to apply to the console. Omit this flag, or set it to
     *        <code>no-resolved</code>, to reveal customizations that are configured at different levels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountCustomizationRequest withResolved(Boolean resolved) {
        setResolved(resolved);
        return this;
    }

    /**
     * <p>
     * The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     * customizations is returned. You can add this flag to your command to use the same view that QuickSight uses to
     * identify which customizations to apply to the console. Omit this flag, or set it to <code>no-resolved</code>, to
     * reveal customizations that are configured at different levels.
     * </p>
     * 
     * @return The <code>Resolved</code> flag works with the other parameters to determine which view of QuickSight
     *         customizations is returned. You can add this flag to your command to use the same view that QuickSight
     *         uses to identify which customizations to apply to the console. Omit this flag, or set it to
     *         <code>no-resolved</code>, to reveal customizations that are configured at different levels.
     */

    public Boolean isResolved() {
        return this.resolved;
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getResolved() != null)
            sb.append("Resolved: ").append(getResolved());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountCustomizationRequest == false)
            return false;
        DescribeAccountCustomizationRequest other = (DescribeAccountCustomizationRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getResolved() == null ^ this.getResolved() == null)
            return false;
        if (other.getResolved() != null && other.getResolved().equals(this.getResolved()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getResolved() == null) ? 0 : getResolved().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountCustomizationRequest clone() {
        return (DescribeAccountCustomizationRequest) super.clone();
    }

}

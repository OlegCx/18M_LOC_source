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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies criteria for sorting the results of a query for information about S3 buckets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketSortCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketSortCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the bucket property to sort the results by. This value can be one of the following properties that
     * Amazon Macie defines as bucket metadata: accountId, bucketName, classifiableObjectCount, classifiableSizeInBytes,
     * objectCount, or sizeInBytes.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The sort order to apply to the results, based on the value specified by the attributeName property. Valid values
     * are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * </p>
     */
    private String orderBy;

    /**
     * <p>
     * The name of the bucket property to sort the results by. This value can be one of the following properties that
     * Amazon Macie defines as bucket metadata: accountId, bucketName, classifiableObjectCount, classifiableSizeInBytes,
     * objectCount, or sizeInBytes.
     * </p>
     * 
     * @param attributeName
     *        The name of the bucket property to sort the results by. This value can be one of the following properties
     *        that Amazon Macie defines as bucket metadata: accountId, bucketName, classifiableObjectCount,
     *        classifiableSizeInBytes, objectCount, or sizeInBytes.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the bucket property to sort the results by. This value can be one of the following properties that
     * Amazon Macie defines as bucket metadata: accountId, bucketName, classifiableObjectCount, classifiableSizeInBytes,
     * objectCount, or sizeInBytes.
     * </p>
     * 
     * @return The name of the bucket property to sort the results by. This value can be one of the following properties
     *         that Amazon Macie defines as bucket metadata: accountId, bucketName, classifiableObjectCount,
     *         classifiableSizeInBytes, objectCount, or sizeInBytes.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the bucket property to sort the results by. This value can be one of the following properties that
     * Amazon Macie defines as bucket metadata: accountId, bucketName, classifiableObjectCount, classifiableSizeInBytes,
     * objectCount, or sizeInBytes.
     * </p>
     * 
     * @param attributeName
     *        The name of the bucket property to sort the results by. This value can be one of the following properties
     *        that Amazon Macie defines as bucket metadata: accountId, bucketName, classifiableObjectCount,
     *        classifiableSizeInBytes, objectCount, or sizeInBytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketSortCriteria withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value specified by the attributeName property. Valid values
     * are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * </p>
     * 
     * @param orderBy
     *        The sort order to apply to the results, based on the value specified by the attributeName property. Valid
     *        values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * @see OrderBy
     */

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value specified by the attributeName property. Valid values
     * are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * </p>
     * 
     * @return The sort order to apply to the results, based on the value specified by the attributeName property. Valid
     *         values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * @see OrderBy
     */

    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value specified by the attributeName property. Valid values
     * are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * </p>
     * 
     * @param orderBy
     *        The sort order to apply to the results, based on the value specified by the attributeName property. Valid
     *        values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public BucketSortCriteria withOrderBy(String orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value specified by the attributeName property. Valid values
     * are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * </p>
     * 
     * @param orderBy
     *        The sort order to apply to the results, based on the value specified by the attributeName property. Valid
     *        values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public BucketSortCriteria withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketSortCriteria == false)
            return false;
        BucketSortCriteria other = (BucketSortCriteria) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        return hashCode;
    }

    @Override
    public BucketSortCriteria clone() {
        try {
            return (BucketSortCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketSortCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

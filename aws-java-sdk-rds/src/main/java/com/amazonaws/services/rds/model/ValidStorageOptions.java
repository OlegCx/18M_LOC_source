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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call
 * to the <code>DescribeValidDBInstanceModifications</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ValidStorageOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidStorageOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The valid storage types for your DB instance. For example, gp2, io1.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Range> storageSize;
    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Range> provisionedIops;
    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that
     * provisioned IOPS can be between 3 and 10 times storage.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DoubleRange> iopsToStorageRatio;
    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance class.
     * </p>
     */
    private Boolean supportsStorageAutoscaling;

    /**
     * <p>
     * The valid storage types for your DB instance. For example, gp2, io1.
     * </p>
     * 
     * @param storageType
     *        The valid storage types for your DB instance. For example, gp2, io1.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The valid storage types for your DB instance. For example, gp2, io1.
     * </p>
     * 
     * @return The valid storage types for your DB instance. For example, gp2, io1.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The valid storage types for your DB instance. For example, gp2, io1.
     * </p>
     * 
     * @param storageType
     *        The valid storage types for your DB instance. For example, gp2, io1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidStorageOptions withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     * 
     * @return The valid range of storage in gibibytes. For example, 100 to 16384.
     */

    public java.util.List<Range> getStorageSize() {
        if (storageSize == null) {
            storageSize = new com.amazonaws.internal.SdkInternalList<Range>();
        }
        return storageSize;
    }

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     * 
     * @param storageSize
     *        The valid range of storage in gibibytes. For example, 100 to 16384.
     */

    public void setStorageSize(java.util.Collection<Range> storageSize) {
        if (storageSize == null) {
            this.storageSize = null;
            return;
        }

        this.storageSize = new com.amazonaws.internal.SdkInternalList<Range>(storageSize);
    }

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageSize(java.util.Collection)} or {@link #withStorageSize(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param storageSize
     *        The valid range of storage in gibibytes. For example, 100 to 16384.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidStorageOptions withStorageSize(Range... storageSize) {
        if (this.storageSize == null) {
            setStorageSize(new com.amazonaws.internal.SdkInternalList<Range>(storageSize.length));
        }
        for (Range ele : storageSize) {
            this.storageSize.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     * 
     * @param storageSize
     *        The valid range of storage in gibibytes. For example, 100 to 16384.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidStorageOptions withStorageSize(java.util.Collection<Range> storageSize) {
        setStorageSize(storageSize);
        return this;
    }

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     * 
     * @return The valid range of provisioned IOPS. For example, 1000-20000.
     */

    public java.util.List<Range> getProvisionedIops() {
        if (provisionedIops == null) {
            provisionedIops = new com.amazonaws.internal.SdkInternalList<Range>();
        }
        return provisionedIops;
    }

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     * 
     * @param provisionedIops
     *        The valid range of provisioned IOPS. For example, 1000-20000.
     */

    public void setProvisionedIops(java.util.Collection<Range> provisionedIops) {
        if (provisionedIops == null) {
            this.provisionedIops = null;
            return;
        }

        this.provisionedIops = new com.amazonaws.internal.SdkInternalList<Range>(provisionedIops);
    }

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisionedIops(java.util.Collection)} or {@link #withProvisionedIops(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param provisionedIops
     *        The valid range of provisioned IOPS. For example, 1000-20000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidStorageOptions withProvisionedIops(Range... provisionedIops) {
        if (this.provisionedIops == null) {
            setProvisionedIops(new com.amazonaws.internal.SdkInternalList<Range>(provisionedIops.length));
        }
        for (Range ele : provisionedIops) {
            this.provisionedIops.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     * 
     * @param provisionedIops
     *        The valid range of provisioned IOPS. For example, 1000-20000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidStorageOptions withProvisionedIops(java.util.Collection<Range> provisionedIops) {
        setProvisionedIops(provisionedIops);
        return this;
    }

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that
     * provisioned IOPS can be between 3 and 10 times storage.
     * </p>
     * 
     * @return The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means
     *         that provisioned IOPS can be between 3 and 10 times storage.
     */

    public java.util.List<DoubleRange> getIopsToStorageRatio() {
        if (iopsToStorageRatio == null) {
            iopsToStorageRatio = new com.amazonaws.internal.SdkInternalList<DoubleRange>();
        }
        return iopsToStorageRatio;
    }

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that
     * provisioned IOPS can be between 3 and 10 times storage.
     * </p>
     * 
     * @param iopsToStorageRatio
     *        The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means
     *        that provisioned IOPS can be between 3 and 10 times storage.
     */

    public void setIopsToStorageRatio(java.util.Collection<DoubleRange> iopsToStorageRatio) {
        if (iopsToStorageRatio == null) {
            this.iopsToStorageRatio = null;
            return;
        }

        this.iopsToStorageRatio = new com.amazonaws.internal.SdkInternalList<DoubleRange>(iopsToStorageRatio);
    }

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that
     * provisioned IOPS can be between 3 and 10 times storage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIopsToStorageRatio(java.util.Collection)} or {@link #withIopsToStorageRatio(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param iopsToStorageRatio
     *        The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means
     *        that provisioned IOPS can be between 3 and 10 times storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidStorageOptions withIopsToStorageRatio(DoubleRange... iopsToStorageRatio) {
        if (this.iopsToStorageRatio == null) {
            setIopsToStorageRatio(new com.amazonaws.internal.SdkInternalList<DoubleRange>(iopsToStorageRatio.length));
        }
        for (DoubleRange ele : iopsToStorageRatio) {
            this.iopsToStorageRatio.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that
     * provisioned IOPS can be between 3 and 10 times storage.
     * </p>
     * 
     * @param iopsToStorageRatio
     *        The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means
     *        that provisioned IOPS can be between 3 and 10 times storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidStorageOptions withIopsToStorageRatio(java.util.Collection<DoubleRange> iopsToStorageRatio) {
        setIopsToStorageRatio(iopsToStorageRatio);
        return this;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance class.
     * </p>
     * 
     * @param supportsStorageAutoscaling
     *        Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance
     *        class.
     */

    public void setSupportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
        this.supportsStorageAutoscaling = supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance class.
     * </p>
     * 
     * @return Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance
     *         class.
     */

    public Boolean getSupportsStorageAutoscaling() {
        return this.supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance class.
     * </p>
     * 
     * @param supportsStorageAutoscaling
     *        Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance
     *        class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidStorageOptions withSupportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
        setSupportsStorageAutoscaling(supportsStorageAutoscaling);
        return this;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance class.
     * </p>
     * 
     * @return Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance
     *         class.
     */

    public Boolean isSupportsStorageAutoscaling() {
        return this.supportsStorageAutoscaling;
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
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getStorageSize() != null)
            sb.append("StorageSize: ").append(getStorageSize()).append(",");
        if (getProvisionedIops() != null)
            sb.append("ProvisionedIops: ").append(getProvisionedIops()).append(",");
        if (getIopsToStorageRatio() != null)
            sb.append("IopsToStorageRatio: ").append(getIopsToStorageRatio()).append(",");
        if (getSupportsStorageAutoscaling() != null)
            sb.append("SupportsStorageAutoscaling: ").append(getSupportsStorageAutoscaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidStorageOptions == false)
            return false;
        ValidStorageOptions other = (ValidStorageOptions) obj;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getStorageSize() == null ^ this.getStorageSize() == null)
            return false;
        if (other.getStorageSize() != null && other.getStorageSize().equals(this.getStorageSize()) == false)
            return false;
        if (other.getProvisionedIops() == null ^ this.getProvisionedIops() == null)
            return false;
        if (other.getProvisionedIops() != null && other.getProvisionedIops().equals(this.getProvisionedIops()) == false)
            return false;
        if (other.getIopsToStorageRatio() == null ^ this.getIopsToStorageRatio() == null)
            return false;
        if (other.getIopsToStorageRatio() != null && other.getIopsToStorageRatio().equals(this.getIopsToStorageRatio()) == false)
            return false;
        if (other.getSupportsStorageAutoscaling() == null ^ this.getSupportsStorageAutoscaling() == null)
            return false;
        if (other.getSupportsStorageAutoscaling() != null && other.getSupportsStorageAutoscaling().equals(this.getSupportsStorageAutoscaling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getStorageSize() == null) ? 0 : getStorageSize().hashCode());
        hashCode = prime * hashCode + ((getProvisionedIops() == null) ? 0 : getProvisionedIops().hashCode());
        hashCode = prime * hashCode + ((getIopsToStorageRatio() == null) ? 0 : getIopsToStorageRatio().hashCode());
        hashCode = prime * hashCode + ((getSupportsStorageAutoscaling() == null) ? 0 : getSupportsStorageAutoscaling().hashCode());
        return hashCode;
    }

    @Override
    public ValidStorageOptions clone() {
        try {
            return (ValidStorageOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

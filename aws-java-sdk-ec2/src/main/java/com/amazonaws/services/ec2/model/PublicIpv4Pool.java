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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an IPv4 address pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PublicIpv4Pool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicIpv4Pool implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * A description of the address pool.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The address ranges.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PublicIpv4PoolRange> poolAddressRanges;
    /**
     * <p>
     * The total number of addresses.
     * </p>
     */
    private Integer totalAddressCount;
    /**
     * <p>
     * The total number of available addresses.
     * </p>
     */
    private Integer totalAvailableAddressCount;
    /**
     * <p>
     * The name of the location from which the address pool is advertised. A network border group is a unique set of
     * Availability Zones or Local Zones from where AWS advertises public IP addresses.
     * </p>
     */
    private String networkBorderGroup;
    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @param poolId
     *        The ID of the address pool.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @return The ID of the address pool.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @param poolId
     *        The ID of the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * A description of the address pool.
     * </p>
     * 
     * @param description
     *        A description of the address pool.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the address pool.
     * </p>
     * 
     * @return A description of the address pool.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the address pool.
     * </p>
     * 
     * @param description
     *        A description of the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The address ranges.
     * </p>
     * 
     * @return The address ranges.
     */

    public java.util.List<PublicIpv4PoolRange> getPoolAddressRanges() {
        if (poolAddressRanges == null) {
            poolAddressRanges = new com.amazonaws.internal.SdkInternalList<PublicIpv4PoolRange>();
        }
        return poolAddressRanges;
    }

    /**
     * <p>
     * The address ranges.
     * </p>
     * 
     * @param poolAddressRanges
     *        The address ranges.
     */

    public void setPoolAddressRanges(java.util.Collection<PublicIpv4PoolRange> poolAddressRanges) {
        if (poolAddressRanges == null) {
            this.poolAddressRanges = null;
            return;
        }

        this.poolAddressRanges = new com.amazonaws.internal.SdkInternalList<PublicIpv4PoolRange>(poolAddressRanges);
    }

    /**
     * <p>
     * The address ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPoolAddressRanges(java.util.Collection)} or {@link #withPoolAddressRanges(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param poolAddressRanges
     *        The address ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withPoolAddressRanges(PublicIpv4PoolRange... poolAddressRanges) {
        if (this.poolAddressRanges == null) {
            setPoolAddressRanges(new com.amazonaws.internal.SdkInternalList<PublicIpv4PoolRange>(poolAddressRanges.length));
        }
        for (PublicIpv4PoolRange ele : poolAddressRanges) {
            this.poolAddressRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The address ranges.
     * </p>
     * 
     * @param poolAddressRanges
     *        The address ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withPoolAddressRanges(java.util.Collection<PublicIpv4PoolRange> poolAddressRanges) {
        setPoolAddressRanges(poolAddressRanges);
        return this;
    }

    /**
     * <p>
     * The total number of addresses.
     * </p>
     * 
     * @param totalAddressCount
     *        The total number of addresses.
     */

    public void setTotalAddressCount(Integer totalAddressCount) {
        this.totalAddressCount = totalAddressCount;
    }

    /**
     * <p>
     * The total number of addresses.
     * </p>
     * 
     * @return The total number of addresses.
     */

    public Integer getTotalAddressCount() {
        return this.totalAddressCount;
    }

    /**
     * <p>
     * The total number of addresses.
     * </p>
     * 
     * @param totalAddressCount
     *        The total number of addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withTotalAddressCount(Integer totalAddressCount) {
        setTotalAddressCount(totalAddressCount);
        return this;
    }

    /**
     * <p>
     * The total number of available addresses.
     * </p>
     * 
     * @param totalAvailableAddressCount
     *        The total number of available addresses.
     */

    public void setTotalAvailableAddressCount(Integer totalAvailableAddressCount) {
        this.totalAvailableAddressCount = totalAvailableAddressCount;
    }

    /**
     * <p>
     * The total number of available addresses.
     * </p>
     * 
     * @return The total number of available addresses.
     */

    public Integer getTotalAvailableAddressCount() {
        return this.totalAvailableAddressCount;
    }

    /**
     * <p>
     * The total number of available addresses.
     * </p>
     * 
     * @param totalAvailableAddressCount
     *        The total number of available addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withTotalAvailableAddressCount(Integer totalAvailableAddressCount) {
        setTotalAvailableAddressCount(totalAvailableAddressCount);
        return this;
    }

    /**
     * <p>
     * The name of the location from which the address pool is advertised. A network border group is a unique set of
     * Availability Zones or Local Zones from where AWS advertises public IP addresses.
     * </p>
     * 
     * @param networkBorderGroup
     *        The name of the location from which the address pool is advertised. A network border group is a unique set
     *        of Availability Zones or Local Zones from where AWS advertises public IP addresses.
     */

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the address pool is advertised. A network border group is a unique set of
     * Availability Zones or Local Zones from where AWS advertises public IP addresses.
     * </p>
     * 
     * @return The name of the location from which the address pool is advertised. A network border group is a unique
     *         set of Availability Zones or Local Zones from where AWS advertises public IP addresses.
     */

    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the address pool is advertised. A network border group is a unique set of
     * Availability Zones or Local Zones from where AWS advertises public IP addresses.
     * </p>
     * 
     * @param networkBorderGroup
     *        The name of the location from which the address pool is advertised. A network border group is a unique set
     *        of Availability Zones or Local Zones from where AWS advertises public IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
        return this;
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     * 
     * @return Any tags for the address pool.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     * 
     * @param tags
     *        Any tags for the address pool.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags for the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     * 
     * @param tags
     *        Any tags for the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4Pool withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPoolAddressRanges() != null)
            sb.append("PoolAddressRanges: ").append(getPoolAddressRanges()).append(",");
        if (getTotalAddressCount() != null)
            sb.append("TotalAddressCount: ").append(getTotalAddressCount()).append(",");
        if (getTotalAvailableAddressCount() != null)
            sb.append("TotalAvailableAddressCount: ").append(getTotalAvailableAddressCount()).append(",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: ").append(getNetworkBorderGroup()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicIpv4Pool == false)
            return false;
        PublicIpv4Pool other = (PublicIpv4Pool) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPoolAddressRanges() == null ^ this.getPoolAddressRanges() == null)
            return false;
        if (other.getPoolAddressRanges() != null && other.getPoolAddressRanges().equals(this.getPoolAddressRanges()) == false)
            return false;
        if (other.getTotalAddressCount() == null ^ this.getTotalAddressCount() == null)
            return false;
        if (other.getTotalAddressCount() != null && other.getTotalAddressCount().equals(this.getTotalAddressCount()) == false)
            return false;
        if (other.getTotalAvailableAddressCount() == null ^ this.getTotalAvailableAddressCount() == null)
            return false;
        if (other.getTotalAvailableAddressCount() != null && other.getTotalAvailableAddressCount().equals(this.getTotalAvailableAddressCount()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPoolAddressRanges() == null) ? 0 : getPoolAddressRanges().hashCode());
        hashCode = prime * hashCode + ((getTotalAddressCount() == null) ? 0 : getTotalAddressCount().hashCode());
        hashCode = prime * hashCode + ((getTotalAvailableAddressCount() == null) ? 0 : getTotalAvailableAddressCount().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PublicIpv4Pool clone() {
        try {
            return (PublicIpv4Pool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

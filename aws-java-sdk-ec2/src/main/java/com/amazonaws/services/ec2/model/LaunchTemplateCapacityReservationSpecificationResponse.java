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
 * Information about the Capacity Reservation targeting option.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateCapacityReservationSpecificationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateCapacityReservationSpecificationResponse implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     */
    private String capacityReservationPreference;
    /**
     * <p>
     * Information about the target Capacity Reservation or Capacity Reservation group.
     * </p>
     */
    private CapacityReservationTargetResponse capacityReservationTarget;

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Indicates the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     *        attributes (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs in On-Demand capacity.
     *        </p>
     *        </li>
     * @see CapacityReservationPreference
     */

    public void setCapacityReservationPreference(String capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     *         attributes (instance type, platform, Availability Zone).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *         instance runs in On-Demand capacity.
     *         </p>
     *         </li>
     * @see CapacityReservationPreference
     */

    public String getCapacityReservationPreference() {
        return this.capacityReservationPreference;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Indicates the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     *        attributes (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs in On-Demand capacity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationPreference
     */

    public LaunchTemplateCapacityReservationSpecificationResponse withCapacityReservationPreference(String capacityReservationPreference) {
        setCapacityReservationPreference(capacityReservationPreference);
        return this;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Indicates the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     *        attributes (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs in On-Demand capacity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationPreference
     */

    public LaunchTemplateCapacityReservationSpecificationResponse withCapacityReservationPreference(CapacityReservationPreference capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference.toString();
        return this;
    }

    /**
     * <p>
     * Information about the target Capacity Reservation or Capacity Reservation group.
     * </p>
     * 
     * @param capacityReservationTarget
     *        Information about the target Capacity Reservation or Capacity Reservation group.
     */

    public void setCapacityReservationTarget(CapacityReservationTargetResponse capacityReservationTarget) {
        this.capacityReservationTarget = capacityReservationTarget;
    }

    /**
     * <p>
     * Information about the target Capacity Reservation or Capacity Reservation group.
     * </p>
     * 
     * @return Information about the target Capacity Reservation or Capacity Reservation group.
     */

    public CapacityReservationTargetResponse getCapacityReservationTarget() {
        return this.capacityReservationTarget;
    }

    /**
     * <p>
     * Information about the target Capacity Reservation or Capacity Reservation group.
     * </p>
     * 
     * @param capacityReservationTarget
     *        Information about the target Capacity Reservation or Capacity Reservation group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateCapacityReservationSpecificationResponse withCapacityReservationTarget(CapacityReservationTargetResponse capacityReservationTarget) {
        setCapacityReservationTarget(capacityReservationTarget);
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
        if (getCapacityReservationPreference() != null)
            sb.append("CapacityReservationPreference: ").append(getCapacityReservationPreference()).append(",");
        if (getCapacityReservationTarget() != null)
            sb.append("CapacityReservationTarget: ").append(getCapacityReservationTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateCapacityReservationSpecificationResponse == false)
            return false;
        LaunchTemplateCapacityReservationSpecificationResponse other = (LaunchTemplateCapacityReservationSpecificationResponse) obj;
        if (other.getCapacityReservationPreference() == null ^ this.getCapacityReservationPreference() == null)
            return false;
        if (other.getCapacityReservationPreference() != null
                && other.getCapacityReservationPreference().equals(this.getCapacityReservationPreference()) == false)
            return false;
        if (other.getCapacityReservationTarget() == null ^ this.getCapacityReservationTarget() == null)
            return false;
        if (other.getCapacityReservationTarget() != null && other.getCapacityReservationTarget().equals(this.getCapacityReservationTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationPreference() == null) ? 0 : getCapacityReservationPreference().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationTarget() == null) ? 0 : getCapacityReservationTarget().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateCapacityReservationSpecificationResponse clone() {
        try {
            return (LaunchTemplateCapacityReservationSpecificationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * Describes the market (purchasing) option for the instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceMarketOptionsRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceMarketOptionsRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The market type.
     * </p>
     */
    private String marketType;
    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     */
    private SpotMarketOptions spotOptions;

    /**
     * <p>
     * The market type.
     * </p>
     * 
     * @param marketType
     *        The market type.
     * @see MarketType
     */

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    /**
     * <p>
     * The market type.
     * </p>
     * 
     * @return The market type.
     * @see MarketType
     */

    public String getMarketType() {
        return this.marketType;
    }

    /**
     * <p>
     * The market type.
     * </p>
     * 
     * @param marketType
     *        The market type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public InstanceMarketOptionsRequest withMarketType(String marketType) {
        setMarketType(marketType);
        return this;
    }

    /**
     * <p>
     * The market type.
     * </p>
     * 
     * @param marketType
     *        The market type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public InstanceMarketOptionsRequest withMarketType(MarketType marketType) {
        this.marketType = marketType.toString();
        return this;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     * 
     * @param spotOptions
     *        The options for Spot Instances.
     */

    public void setSpotOptions(SpotMarketOptions spotOptions) {
        this.spotOptions = spotOptions;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     * 
     * @return The options for Spot Instances.
     */

    public SpotMarketOptions getSpotOptions() {
        return this.spotOptions;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     * 
     * @param spotOptions
     *        The options for Spot Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMarketOptionsRequest withSpotOptions(SpotMarketOptions spotOptions) {
        setSpotOptions(spotOptions);
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
        if (getMarketType() != null)
            sb.append("MarketType: ").append(getMarketType()).append(",");
        if (getSpotOptions() != null)
            sb.append("SpotOptions: ").append(getSpotOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceMarketOptionsRequest == false)
            return false;
        InstanceMarketOptionsRequest other = (InstanceMarketOptionsRequest) obj;
        if (other.getMarketType() == null ^ this.getMarketType() == null)
            return false;
        if (other.getMarketType() != null && other.getMarketType().equals(this.getMarketType()) == false)
            return false;
        if (other.getSpotOptions() == null ^ this.getSpotOptions() == null)
            return false;
        if (other.getSpotOptions() != null && other.getSpotOptions().equals(this.getSpotOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarketType() == null) ? 0 : getMarketType().hashCode());
        hashCode = prime * hashCode + ((getSpotOptions() == null) ? 0 : getSpotOptions().hashCode());
        return hashCode;
    }

    @Override
    public InstanceMarketOptionsRequest clone() {
        try {
            return (InstanceMarketOptionsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

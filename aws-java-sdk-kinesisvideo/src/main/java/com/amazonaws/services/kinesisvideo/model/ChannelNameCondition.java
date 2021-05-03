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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An optional input parameter for the <code>ListSignalingChannels</code> API. When this parameter is specified while
 * invoking <code>ListSignalingChannels</code>, the API returns only the channels that satisfy a condition specified in
 * <code>ChannelNameCondition</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ChannelNameCondition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelNameCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     * signaling channels whose names begin with a given prefix.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * A value to compare.
     * </p>
     */
    private String comparisonValue;

    /**
     * <p>
     * A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     * signaling channels whose names begin with a given prefix.
     * </p>
     * 
     * @param comparisonOperator
     *        A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     *        signaling channels whose names begin with a given prefix.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     * signaling channels whose names begin with a given prefix.
     * </p>
     * 
     * @return A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     *         signaling channels whose names begin with a given prefix.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     * signaling channels whose names begin with a given prefix.
     * </p>
     * 
     * @param comparisonOperator
     *        A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     *        signaling channels whose names begin with a given prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public ChannelNameCondition withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     * signaling channels whose names begin with a given prefix.
     * </p>
     * 
     * @param comparisonOperator
     *        A comparison operator. Currently, you can only specify the <code>BEGINS_WITH</code> operator, which finds
     *        signaling channels whose names begin with a given prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public ChannelNameCondition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * A value to compare.
     * </p>
     * 
     * @param comparisonValue
     *        A value to compare.
     */

    public void setComparisonValue(String comparisonValue) {
        this.comparisonValue = comparisonValue;
    }

    /**
     * <p>
     * A value to compare.
     * </p>
     * 
     * @return A value to compare.
     */

    public String getComparisonValue() {
        return this.comparisonValue;
    }

    /**
     * <p>
     * A value to compare.
     * </p>
     * 
     * @param comparisonValue
     *        A value to compare.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelNameCondition withComparisonValue(String comparisonValue) {
        setComparisonValue(comparisonValue);
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
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getComparisonValue() != null)
            sb.append("ComparisonValue: ").append(getComparisonValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelNameCondition == false)
            return false;
        ChannelNameCondition other = (ChannelNameCondition) obj;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getComparisonValue() == null ^ this.getComparisonValue() == null)
            return false;
        if (other.getComparisonValue() != null && other.getComparisonValue().equals(this.getComparisonValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getComparisonValue() == null) ? 0 : getComparisonValue().hashCode());
        return hashCode;
    }

    @Override
    public ChannelNameCondition clone() {
        try {
            return (ChannelNameCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.ChannelNameConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

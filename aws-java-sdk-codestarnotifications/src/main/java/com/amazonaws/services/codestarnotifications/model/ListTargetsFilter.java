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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a filter to apply to the list of returned targets. You can filter by target type, address, or
 * status. For example, to filter results to notification rules that have active Amazon SNS topics as targets, you could
 * specify a ListTargetsFilter Name as TargetType and a Value of SNS, and a Name of TARGET_STATUS and a Value of ACTIVE.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTargetsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTargetsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute you want to use to filter the returned targets.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the attribute you want to use to filter the returned targets. For example, if you specify <i>SNS</i>
     * for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the attribute you want to use to filter the returned targets.
     * </p>
     * 
     * @param name
     *        The name of the attribute you want to use to filter the returned targets.
     * @see ListTargetsFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute you want to use to filter the returned targets.
     * </p>
     * 
     * @return The name of the attribute you want to use to filter the returned targets.
     * @see ListTargetsFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute you want to use to filter the returned targets.
     * </p>
     * 
     * @param name
     *        The name of the attribute you want to use to filter the returned targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListTargetsFilterName
     */

    public ListTargetsFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the attribute you want to use to filter the returned targets.
     * </p>
     * 
     * @param name
     *        The name of the attribute you want to use to filter the returned targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListTargetsFilterName
     */

    public ListTargetsFilter withName(ListTargetsFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the attribute you want to use to filter the returned targets. For example, if you specify <i>SNS</i>
     * for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
     * </p>
     * 
     * @param value
     *        The value of the attribute you want to use to filter the returned targets. For example, if you specify
     *        <i>SNS</i> for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute you want to use to filter the returned targets. For example, if you specify <i>SNS</i>
     * for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
     * </p>
     * 
     * @return The value of the attribute you want to use to filter the returned targets. For example, if you specify
     *         <i>SNS</i> for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the attribute you want to use to filter the returned targets. For example, if you specify <i>SNS</i>
     * for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
     * </p>
     * 
     * @param value
     *        The value of the attribute you want to use to filter the returned targets. For example, if you specify
     *        <i>SNS</i> for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsFilter withValue(String value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTargetsFilter == false)
            return false;
        ListTargetsFilter other = (ListTargetsFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ListTargetsFilter clone() {
        try {
            return (ListTargetsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestarnotifications.model.transform.ListTargetsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

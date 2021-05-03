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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing group.
     * </p>
     */
    private String thingGroupName;

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * 
     * @param thingGroupName
     *        The name of the thing group.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * 
     * @return The name of the thing group.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * 
     * @param thingGroupName
     *        The name of the thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupRequest withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
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
        if (getThingGroupName() != null)
            sb.append("ThingGroupName: ").append(getThingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingGroupRequest == false)
            return false;
        DescribeThingGroupRequest other = (DescribeThingGroupRequest) obj;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThingGroupRequest clone() {
        return (DescribeThingGroupRequest) super.clone();
    }

}

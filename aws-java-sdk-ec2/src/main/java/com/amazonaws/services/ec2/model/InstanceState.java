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
 * Describes the current state of an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceState implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the instance as a 16-bit unsigned integer.
     * </p>
     * <p>
     * The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535.
     * These numerical values are used for internal purposes and should be ignored.
     * </p>
     * <p>
     * The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
     * </p>
     * <p>
     * The valid values for instance-state-code will all be in the range of the low byte and they are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> : <code>pending</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>16</code> : <code>running</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>32</code> : <code>shutting-down</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>48</code> : <code>terminated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>64</code> : <code>stopping</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>80</code> : <code>stopped</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
     * </p>
     */
    private Integer code;
    /**
     * <p>
     * The current state of the instance.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The state of the instance as a 16-bit unsigned integer.
     * </p>
     * <p>
     * The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535.
     * These numerical values are used for internal purposes and should be ignored.
     * </p>
     * <p>
     * The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
     * </p>
     * <p>
     * The valid values for instance-state-code will all be in the range of the low byte and they are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> : <code>pending</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>16</code> : <code>running</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>32</code> : <code>shutting-down</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>48</code> : <code>terminated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>64</code> : <code>stopping</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>80</code> : <code>stopped</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
     * </p>
     * 
     * @param code
     *        The state of the instance as a 16-bit unsigned integer. </p>
     *        <p>
     *        The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and
     *        65,535. These numerical values are used for internal purposes and should be ignored.
     *        </p>
     *        <p>
     *        The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
     *        </p>
     *        <p>
     *        The valid values for instance-state-code will all be in the range of the low byte and they are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0</code> : <code>pending</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>16</code> : <code>running</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>32</code> : <code>shutting-down</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>48</code> : <code>terminated</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>64</code> : <code>stopping</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>80</code> : <code>stopped</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
     */

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * <p>
     * The state of the instance as a 16-bit unsigned integer.
     * </p>
     * <p>
     * The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535.
     * These numerical values are used for internal purposes and should be ignored.
     * </p>
     * <p>
     * The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
     * </p>
     * <p>
     * The valid values for instance-state-code will all be in the range of the low byte and they are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> : <code>pending</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>16</code> : <code>running</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>32</code> : <code>shutting-down</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>48</code> : <code>terminated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>64</code> : <code>stopping</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>80</code> : <code>stopped</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
     * </p>
     * 
     * @return The state of the instance as a 16-bit unsigned integer. </p>
     *         <p>
     *         The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and
     *         65,535. These numerical values are used for internal purposes and should be ignored.
     *         </p>
     *         <p>
     *         The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
     *         </p>
     *         <p>
     *         The valid values for instance-state-code will all be in the range of the low byte and they are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>0</code> : <code>pending</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>16</code> : <code>running</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>32</code> : <code>shutting-down</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>48</code> : <code>terminated</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>64</code> : <code>stopping</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>80</code> : <code>stopped</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
     */

    public Integer getCode() {
        return this.code;
    }

    /**
     * <p>
     * The state of the instance as a 16-bit unsigned integer.
     * </p>
     * <p>
     * The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535.
     * These numerical values are used for internal purposes and should be ignored.
     * </p>
     * <p>
     * The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
     * </p>
     * <p>
     * The valid values for instance-state-code will all be in the range of the low byte and they are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> : <code>pending</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>16</code> : <code>running</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>32</code> : <code>shutting-down</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>48</code> : <code>terminated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>64</code> : <code>stopping</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>80</code> : <code>stopped</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
     * </p>
     * 
     * @param code
     *        The state of the instance as a 16-bit unsigned integer. </p>
     *        <p>
     *        The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and
     *        65,535. These numerical values are used for internal purposes and should be ignored.
     *        </p>
     *        <p>
     *        The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
     *        </p>
     *        <p>
     *        The valid values for instance-state-code will all be in the range of the low byte and they are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0</code> : <code>pending</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>16</code> : <code>running</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>32</code> : <code>shutting-down</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>48</code> : <code>terminated</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>64</code> : <code>stopping</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>80</code> : <code>stopped</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceState withCode(Integer code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @param name
     *        The current state of the instance.
     * @see InstanceStateName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @return The current state of the instance.
     * @see InstanceStateName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @param name
     *        The current state of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStateName
     */

    public InstanceState withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @param name
     *        The current state of the instance.
     * @see InstanceStateName
     */

    public void setName(InstanceStateName name) {
        withName(name);
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @param name
     *        The current state of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStateName
     */

    public InstanceState withName(InstanceStateName name) {
        this.name = name.toString();
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceState == false)
            return false;
        InstanceState other = (InstanceState) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public InstanceState clone() {
        try {
            return (InstanceState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

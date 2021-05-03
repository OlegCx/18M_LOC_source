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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about additional load balancer attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/AdditionalAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdditionalAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb.http.desyncmitigationmode</code> - Determines how the load balancer handles requests that might pose a
     * security risk to your application. The possible values are <code>monitor</code>, <code>defensive</code>, and
     * <code>strictest</code>. The default is <code>defensive</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String key;
    /**
     * <p>
     * This value of the attribute.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb.http.desyncmitigationmode</code> - Determines how the load balancer handles requests that might pose a
     * security risk to your application. The possible values are <code>monitor</code>, <code>defensive</code>, and
     * <code>strictest</code>. The default is <code>defensive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The name of the attribute.</p>
     *        <p>
     *        The following attribute is supported.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>elb.http.desyncmitigationmode</code> - Determines how the load balancer handles requests that might
     *        pose a security risk to your application. The possible values are <code>monitor</code>,
     *        <code>defensive</code>, and <code>strictest</code>. The default is <code>defensive</code>.
     *        </p>
     *        </li>
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb.http.desyncmitigationmode</code> - Determines how the load balancer handles requests that might pose a
     * security risk to your application. The possible values are <code>monitor</code>, <code>defensive</code>, and
     * <code>strictest</code>. The default is <code>defensive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the attribute.</p>
     *         <p>
     *         The following attribute is supported.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>elb.http.desyncmitigationmode</code> - Determines how the load balancer handles requests that might
     *         pose a security risk to your application. The possible values are <code>monitor</code>,
     *         <code>defensive</code>, and <code>strictest</code>. The default is <code>defensive</code>.
     *         </p>
     *         </li>
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb.http.desyncmitigationmode</code> - Determines how the load balancer handles requests that might pose a
     * security risk to your application. The possible values are <code>monitor</code>, <code>defensive</code>, and
     * <code>strictest</code>. The default is <code>defensive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The name of the attribute.</p>
     *        <p>
     *        The following attribute is supported.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>elb.http.desyncmitigationmode</code> - Determines how the load balancer handles requests that might
     *        pose a security risk to your application. The possible values are <code>monitor</code>,
     *        <code>defensive</code>, and <code>strictest</code>. The default is <code>defensive</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalAttribute withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * This value of the attribute.
     * </p>
     * 
     * @param value
     *        This value of the attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * This value of the attribute.
     * </p>
     * 
     * @return This value of the attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * This value of the attribute.
     * </p>
     * 
     * @param value
     *        This value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalAttribute withValue(String value) {
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
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

        if (obj instanceof AdditionalAttribute == false)
            return false;
        AdditionalAttribute other = (AdditionalAttribute) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AdditionalAttribute clone() {
        try {
            return (AdditionalAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

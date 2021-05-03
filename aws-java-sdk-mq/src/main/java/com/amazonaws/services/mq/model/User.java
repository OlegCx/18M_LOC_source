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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A user associated with the broker.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/User" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /** Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers). */
    private Boolean consoleAccess;
    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */
    private java.util.List<String> groups;
    /**
     * Required. The password of the broker user. This value must be at least 12 characters long, must contain at least
     * 4 unique characters, and must not contain commas.
     */
    private String password;
    /**
     * Required. The username of the broker user. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */
    private String username;

    /**
     * Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers).
     * 
     * @param consoleAccess
     *        Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers).
     */

    public void setConsoleAccess(Boolean consoleAccess) {
        this.consoleAccess = consoleAccess;
    }

    /**
     * Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers).
     * 
     * @return Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers).
     */

    public Boolean getConsoleAccess() {
        return this.consoleAccess;
    }

    /**
     * Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers).
     * 
     * @param consoleAccess
     *        Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withConsoleAccess(Boolean consoleAccess) {
        setConsoleAccess(consoleAccess);
        return this;
    }

    /**
     * Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers).
     * 
     * @return Enables access to the ActiveMQ Web Console for the ActiveMQ user (Does not apply to RabbitMQ brokers).
     */

    public Boolean isConsoleAccess() {
        return this.consoleAccess;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @return The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *         alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *         characters long.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * Required. The password of the broker user. This value must be at least 12 characters long, must contain at least
     * 4 unique characters, and must not contain commas.
     * 
     * @param password
     *        Required. The password of the broker user. This value must be at least 12 characters long, must contain at
     *        least 4 unique characters, and must not contain commas.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Required. The password of the broker user. This value must be at least 12 characters long, must contain at least
     * 4 unique characters, and must not contain commas.
     * 
     * @return Required. The password of the broker user. This value must be at least 12 characters long, must contain
     *         at least 4 unique characters, and must not contain commas.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * Required. The password of the broker user. This value must be at least 12 characters long, must contain at least
     * 4 unique characters, and must not contain commas.
     * 
     * @param password
     *        Required. The password of the broker user. This value must be at least 12 characters long, must contain at
     *        least 4 unique characters, and must not contain commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * Required. The username of the broker user. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param username
     *        Required. The username of the broker user. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Required. The username of the broker user. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @return Required. The username of the broker user. This value can contain only alphanumeric characters, dashes,
     *         periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * Required. The username of the broker user. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param username
     *        Required. The username of the broker user. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUsername(String username) {
        setUsername(username);
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
        if (getConsoleAccess() != null)
            sb.append("ConsoleAccess: ").append(getConsoleAccess()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getConsoleAccess() == null ^ this.getConsoleAccess() == null)
            return false;
        if (other.getConsoleAccess() != null && other.getConsoleAccess().equals(this.getConsoleAccess()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsoleAccess() == null) ? 0 : getConsoleAccess().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

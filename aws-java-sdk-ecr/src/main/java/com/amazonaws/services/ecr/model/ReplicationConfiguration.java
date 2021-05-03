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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The replication configuration for a registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ReplicationConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects representing the replication rules for a replication configuration. A replication
     * configuration may contain only one replication rule but the rule may contain one or more replication
     * destinations.
     * </p>
     */
    private java.util.List<ReplicationRule> rules;

    /**
     * <p>
     * An array of objects representing the replication rules for a replication configuration. A replication
     * configuration may contain only one replication rule but the rule may contain one or more replication
     * destinations.
     * </p>
     * 
     * @return An array of objects representing the replication rules for a replication configuration. A replication
     *         configuration may contain only one replication rule but the rule may contain one or more replication
     *         destinations.
     */

    public java.util.List<ReplicationRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array of objects representing the replication rules for a replication configuration. A replication
     * configuration may contain only one replication rule but the rule may contain one or more replication
     * destinations.
     * </p>
     * 
     * @param rules
     *        An array of objects representing the replication rules for a replication configuration. A replication
     *        configuration may contain only one replication rule but the rule may contain one or more replication
     *        destinations.
     */

    public void setRules(java.util.Collection<ReplicationRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ReplicationRule>(rules);
    }

    /**
     * <p>
     * An array of objects representing the replication rules for a replication configuration. A replication
     * configuration may contain only one replication rule but the rule may contain one or more replication
     * destinations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        An array of objects representing the replication rules for a replication configuration. A replication
     *        configuration may contain only one replication rule but the rule may contain one or more replication
     *        destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfiguration withRules(ReplicationRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<ReplicationRule>(rules.length));
        }
        for (ReplicationRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects representing the replication rules for a replication configuration. A replication
     * configuration may contain only one replication rule but the rule may contain one or more replication
     * destinations.
     * </p>
     * 
     * @param rules
     *        An array of objects representing the replication rules for a replication configuration. A replication
     *        configuration may contain only one replication rule but the rule may contain one or more replication
     *        destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfiguration withRules(java.util.Collection<ReplicationRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationConfiguration == false)
            return false;
        ReplicationConfiguration other = (ReplicationConfiguration) obj;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationConfiguration clone() {
        try {
            return (ReplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ReplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

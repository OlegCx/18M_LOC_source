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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A DNS Firewall rule group that Firewall Manager tried to associate with a VPC is already associated with the VPC and
 * can't be associated again.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DnsDuplicateRuleGroupViolation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsDuplicateRuleGroupViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * A description of the violation that specifies the rule group and VPC.
     * </p>
     */
    private String violationTargetDescription;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param violationTarget
     *        The ID of the VPC.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param violationTarget
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsDuplicateRuleGroupViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * A description of the violation that specifies the rule group and VPC.
     * </p>
     * 
     * @param violationTargetDescription
     *        A description of the violation that specifies the rule group and VPC.
     */

    public void setViolationTargetDescription(String violationTargetDescription) {
        this.violationTargetDescription = violationTargetDescription;
    }

    /**
     * <p>
     * A description of the violation that specifies the rule group and VPC.
     * </p>
     * 
     * @return A description of the violation that specifies the rule group and VPC.
     */

    public String getViolationTargetDescription() {
        return this.violationTargetDescription;
    }

    /**
     * <p>
     * A description of the violation that specifies the rule group and VPC.
     * </p>
     * 
     * @param violationTargetDescription
     *        A description of the violation that specifies the rule group and VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsDuplicateRuleGroupViolation withViolationTargetDescription(String violationTargetDescription) {
        setViolationTargetDescription(violationTargetDescription);
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
        if (getViolationTarget() != null)
            sb.append("ViolationTarget: ").append(getViolationTarget()).append(",");
        if (getViolationTargetDescription() != null)
            sb.append("ViolationTargetDescription: ").append(getViolationTargetDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsDuplicateRuleGroupViolation == false)
            return false;
        DnsDuplicateRuleGroupViolation other = (DnsDuplicateRuleGroupViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getViolationTargetDescription() == null ^ this.getViolationTargetDescription() == null)
            return false;
        if (other.getViolationTargetDescription() != null && other.getViolationTargetDescription().equals(this.getViolationTargetDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getViolationTargetDescription() == null) ? 0 : getViolationTargetDescription().hashCode());
        return hashCode;
    }

    @Override
    public DnsDuplicateRuleGroupViolation clone() {
        try {
            return (DnsDuplicateRuleGroupViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.DnsDuplicateRuleGroupViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

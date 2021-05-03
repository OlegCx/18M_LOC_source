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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of search criteria that targets instances using a Key,Value combination that you specify.
 * </p>
 * <note>
 * <p>
 * One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task, targets
 * are optional for other maintenance window task types (Automation, AWS Lambda, and AWS Step Functions). For more
 * information about running tasks that do not specify targets, see <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
 * >Registering maintenance window tasks without targets</a> in the <i>AWS Systems Manager User Guide</i>.
 * </p>
 * </note>
 * <p>
 * Supported formats include the following.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Run Command and Maintenance window targets only</b>:
 * <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Maintenance window targets only</b>:
 * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Automation targets only</b>: <code>Key=ResourceGroup;Values=<i>resource-group-name</i> </code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Key=InstanceIds,Values=i-02573cafcfEXAMPLE,i-0471e04240EXAMPLE,i-07782c72faEXAMPLE</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key=tag:CostCenter,Values=CostCenter1,CostCenter2,CostCenter3</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key=tag-key,Values=Name,Instance-Type,CostCenter</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Run Command and Maintenance window targets only</b>:
 * <code>Key=resource-groups:Name,Values=ProductionResourceGroup</code>
 * </p>
 * <p>
 * This example demonstrates how to target all resources in the resource group <b>ProductionResourceGroup</b> in your
 * maintenance window.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Maintenance window targets only</b>:
 * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
 * </p>
 * <p>
 * This example demonstrates how to target only EC2 instances and VPCs in your maintenance window.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Automation targets only</b>: <code>Key=ResourceGroup,Values=MyResourceGroup</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>State Manager association targets only</b>: <code>Key=InstanceIds,Values=<i>*</i> </code>
 * </p>
 * <p>
 * This example demonstrates how to target all managed instances in the AWS Region where the association was created.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about how to send commands that target instances using <code>Key,Value</code> parameters, see <a
 * href
 * ="https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
 * >Targeting multiple instances</a> in the <i>AWS Systems Manager User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Target" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that meet the criteria.
     * </p>
     */
    private String key;
    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include EC2 tags of
     * <code>ServerRole,WebServer</code>.
     * </p>
     * <p>
     * Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might be lower
     * than the global maximum of 50.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that meet the criteria.
     * </p>
     * 
     * @param key
     *        User-defined criteria for sending commands that target instances that meet the criteria.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that meet the criteria.
     * </p>
     * 
     * @return User-defined criteria for sending commands that target instances that meet the criteria.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that meet the criteria.
     * </p>
     * 
     * @param key
     *        User-defined criteria for sending commands that target instances that meet the criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include EC2 tags of
     * <code>ServerRole,WebServer</code>.
     * </p>
     * <p>
     * Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might be lower
     * than the global maximum of 50.
     * </p>
     * 
     * @return User-defined criteria that maps to <code>Key</code>. For example, if you specified
     *         <code>tag:ServerRole</code>, you could specify <code>value:WebServer</code> to run a command on instances
     *         that include EC2 tags of <code>ServerRole,WebServer</code>. </p>
     *         <p>
     *         Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might
     *         be lower than the global maximum of 50.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include EC2 tags of
     * <code>ServerRole,WebServer</code>.
     * </p>
     * <p>
     * Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might be lower
     * than the global maximum of 50.
     * </p>
     * 
     * @param values
     *        User-defined criteria that maps to <code>Key</code>. For example, if you specified
     *        <code>tag:ServerRole</code>, you could specify <code>value:WebServer</code> to run a command on instances
     *        that include EC2 tags of <code>ServerRole,WebServer</code>. </p>
     *        <p>
     *        Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might be
     *        lower than the global maximum of 50.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include EC2 tags of
     * <code>ServerRole,WebServer</code>.
     * </p>
     * <p>
     * Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might be lower
     * than the global maximum of 50.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        User-defined criteria that maps to <code>Key</code>. For example, if you specified
     *        <code>tag:ServerRole</code>, you could specify <code>value:WebServer</code> to run a command on instances
     *        that include EC2 tags of <code>ServerRole,WebServer</code>. </p>
     *        <p>
     *        Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might be
     *        lower than the global maximum of 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you specified <code>tag:ServerRole</code>,
     * you could specify <code>value:WebServer</code> to run a command on instances that include EC2 tags of
     * <code>ServerRole,WebServer</code>.
     * </p>
     * <p>
     * Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might be lower
     * than the global maximum of 50.
     * </p>
     * 
     * @param values
     *        User-defined criteria that maps to <code>Key</code>. For example, if you specified
     *        <code>tag:ServerRole</code>, you could specify <code>value:WebServer</code> to run a command on instances
     *        that include EC2 tags of <code>ServerRole,WebServer</code>. </p>
     *        <p>
     *        Depending on the type of <code>Target</code>, the maximum number of values for a <code>Key</code> might be
     *        lower than the global maximum of 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

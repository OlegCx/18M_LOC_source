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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an association between Amazon Kinesis Data Firehose destinations and a web ACL resource, for logging from AWS
 * WAF. As part of the association, you can specify parts of the standard logging fields to keep out of the logs and you
 * can specify filters so that you log only a subset of the logging records.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/LoggingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with <code>LogDestinationConfigs</code>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     * </p>
     */
    private java.util.List<String> logDestinationConfigs;
    /**
     * <p>
     * The parts of the request that you want to keep out of the logs. For example, if you redact the
     * <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>.
     * </p>
     * <note>
     * <p>
     * You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or
     * <code>METHOD</code>.
     * </p>
     * </note>
     */
    private java.util.List<FieldToMatch> redactedFields;
    /**
     * <p>
     * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy
     * configuration. If true, only Firewall Manager can modify or delete the configuration.
     * </p>
     */
    private Boolean managedByFirewallManager;
    /**
     * <p>
     * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the
     * rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
     * </p>
     */
    private LoggingFilter loggingFilter;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with <code>LogDestinationConfigs</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the web ACL that you want to associate with
     *        <code>LogDestinationConfigs</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with <code>LogDestinationConfigs</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the web ACL that you want to associate with
     *         <code>LogDestinationConfigs</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with <code>LogDestinationConfigs</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the web ACL that you want to associate with
     *        <code>LogDestinationConfigs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     * </p>
     * 
     * @return The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     */

    public java.util.List<String> getLogDestinationConfigs() {
        return logDestinationConfigs;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     * </p>
     * 
     * @param logDestinationConfigs
     *        The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     */

    public void setLogDestinationConfigs(java.util.Collection<String> logDestinationConfigs) {
        if (logDestinationConfigs == null) {
            this.logDestinationConfigs = null;
            return;
        }

        this.logDestinationConfigs = new java.util.ArrayList<String>(logDestinationConfigs);
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogDestinationConfigs(java.util.Collection)} or
     * {@link #withLogDestinationConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param logDestinationConfigs
     *        The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withLogDestinationConfigs(String... logDestinationConfigs) {
        if (this.logDestinationConfigs == null) {
            setLogDestinationConfigs(new java.util.ArrayList<String>(logDestinationConfigs.length));
        }
        for (String ele : logDestinationConfigs) {
            this.logDestinationConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     * </p>
     * 
     * @param logDestinationConfigs
     *        The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withLogDestinationConfigs(java.util.Collection<String> logDestinationConfigs) {
        setLogDestinationConfigs(logDestinationConfigs);
        return this;
    }

    /**
     * <p>
     * The parts of the request that you want to keep out of the logs. For example, if you redact the
     * <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>.
     * </p>
     * <note>
     * <p>
     * You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or
     * <code>METHOD</code>.
     * </p>
     * </note>
     * 
     * @return The parts of the request that you want to keep out of the logs. For example, if you redact the
     *         <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>. </p>
     *         <note>
     *         <p>
     *         You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>,
     *         <code>HEADER</code>, or <code>METHOD</code>.
     *         </p>
     */

    public java.util.List<FieldToMatch> getRedactedFields() {
        return redactedFields;
    }

    /**
     * <p>
     * The parts of the request that you want to keep out of the logs. For example, if you redact the
     * <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>.
     * </p>
     * <note>
     * <p>
     * You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or
     * <code>METHOD</code>.
     * </p>
     * </note>
     * 
     * @param redactedFields
     *        The parts of the request that you want to keep out of the logs. For example, if you redact the
     *        <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>. </p>
     *        <note>
     *        <p>
     *        You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>
     *        , or <code>METHOD</code>.
     *        </p>
     */

    public void setRedactedFields(java.util.Collection<FieldToMatch> redactedFields) {
        if (redactedFields == null) {
            this.redactedFields = null;
            return;
        }

        this.redactedFields = new java.util.ArrayList<FieldToMatch>(redactedFields);
    }

    /**
     * <p>
     * The parts of the request that you want to keep out of the logs. For example, if you redact the
     * <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>.
     * </p>
     * <note>
     * <p>
     * You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or
     * <code>METHOD</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRedactedFields(java.util.Collection)} or {@link #withRedactedFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param redactedFields
     *        The parts of the request that you want to keep out of the logs. For example, if you redact the
     *        <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>. </p>
     *        <note>
     *        <p>
     *        You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>
     *        , or <code>METHOD</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withRedactedFields(FieldToMatch... redactedFields) {
        if (this.redactedFields == null) {
            setRedactedFields(new java.util.ArrayList<FieldToMatch>(redactedFields.length));
        }
        for (FieldToMatch ele : redactedFields) {
            this.redactedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parts of the request that you want to keep out of the logs. For example, if you redact the
     * <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>.
     * </p>
     * <note>
     * <p>
     * You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or
     * <code>METHOD</code>.
     * </p>
     * </note>
     * 
     * @param redactedFields
     *        The parts of the request that you want to keep out of the logs. For example, if you redact the
     *        <code>HEADER</code> field, the <code>HEADER</code> field in the firehose will be <code>xxx</code>. </p>
     *        <note>
     *        <p>
     *        You must use one of the following values: <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>
     *        , or <code>METHOD</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withRedactedFields(java.util.Collection<FieldToMatch> redactedFields) {
        setRedactedFields(redactedFields);
        return this;
    }

    /**
     * <p>
     * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy
     * configuration. If true, only Firewall Manager can modify or delete the configuration.
     * </p>
     * 
     * @param managedByFirewallManager
     *        Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF
     *        policy configuration. If true, only Firewall Manager can modify or delete the configuration.
     */

    public void setManagedByFirewallManager(Boolean managedByFirewallManager) {
        this.managedByFirewallManager = managedByFirewallManager;
    }

    /**
     * <p>
     * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy
     * configuration. If true, only Firewall Manager can modify or delete the configuration.
     * </p>
     * 
     * @return Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF
     *         policy configuration. If true, only Firewall Manager can modify or delete the configuration.
     */

    public Boolean getManagedByFirewallManager() {
        return this.managedByFirewallManager;
    }

    /**
     * <p>
     * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy
     * configuration. If true, only Firewall Manager can modify or delete the configuration.
     * </p>
     * 
     * @param managedByFirewallManager
     *        Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF
     *        policy configuration. If true, only Firewall Manager can modify or delete the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withManagedByFirewallManager(Boolean managedByFirewallManager) {
        setManagedByFirewallManager(managedByFirewallManager);
        return this;
    }

    /**
     * <p>
     * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy
     * configuration. If true, only Firewall Manager can modify or delete the configuration.
     * </p>
     * 
     * @return Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF
     *         policy configuration. If true, only Firewall Manager can modify or delete the configuration.
     */

    public Boolean isManagedByFirewallManager() {
        return this.managedByFirewallManager;
    }

    /**
     * <p>
     * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the
     * rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
     * </p>
     * 
     * @param loggingFilter
     *        Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on
     *        the rule action and on the web request labels that were applied by matching rules during web ACL
     *        evaluation.
     */

    public void setLoggingFilter(LoggingFilter loggingFilter) {
        this.loggingFilter = loggingFilter;
    }

    /**
     * <p>
     * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the
     * rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
     * </p>
     * 
     * @return Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on
     *         the rule action and on the web request labels that were applied by matching rules during web ACL
     *         evaluation.
     */

    public LoggingFilter getLoggingFilter() {
        return this.loggingFilter;
    }

    /**
     * <p>
     * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the
     * rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
     * </p>
     * 
     * @param loggingFilter
     *        Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on
     *        the rule action and on the web request labels that were applied by matching rules during web ACL
     *        evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withLoggingFilter(LoggingFilter loggingFilter) {
        setLoggingFilter(loggingFilter);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getLogDestinationConfigs() != null)
            sb.append("LogDestinationConfigs: ").append(getLogDestinationConfigs()).append(",");
        if (getRedactedFields() != null)
            sb.append("RedactedFields: ").append(getRedactedFields()).append(",");
        if (getManagedByFirewallManager() != null)
            sb.append("ManagedByFirewallManager: ").append(getManagedByFirewallManager()).append(",");
        if (getLoggingFilter() != null)
            sb.append("LoggingFilter: ").append(getLoggingFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfiguration == false)
            return false;
        LoggingConfiguration other = (LoggingConfiguration) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getLogDestinationConfigs() == null ^ this.getLogDestinationConfigs() == null)
            return false;
        if (other.getLogDestinationConfigs() != null && other.getLogDestinationConfigs().equals(this.getLogDestinationConfigs()) == false)
            return false;
        if (other.getRedactedFields() == null ^ this.getRedactedFields() == null)
            return false;
        if (other.getRedactedFields() != null && other.getRedactedFields().equals(this.getRedactedFields()) == false)
            return false;
        if (other.getManagedByFirewallManager() == null ^ this.getManagedByFirewallManager() == null)
            return false;
        if (other.getManagedByFirewallManager() != null && other.getManagedByFirewallManager().equals(this.getManagedByFirewallManager()) == false)
            return false;
        if (other.getLoggingFilter() == null ^ this.getLoggingFilter() == null)
            return false;
        if (other.getLoggingFilter() != null && other.getLoggingFilter().equals(this.getLoggingFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getLogDestinationConfigs() == null) ? 0 : getLogDestinationConfigs().hashCode());
        hashCode = prime * hashCode + ((getRedactedFields() == null) ? 0 : getRedactedFields().hashCode());
        hashCode = prime * hashCode + ((getManagedByFirewallManager() == null) ? 0 : getManagedByFirewallManager().hashCode());
        hashCode = prime * hashCode + ((getLoggingFilter() == null) ? 0 : getLoggingFilter().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfiguration clone() {
        try {
            return (LoggingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.LoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

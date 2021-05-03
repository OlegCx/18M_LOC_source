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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeComponentConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     */
    private Boolean monitor;
    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     * <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * </p>
     */
    private String tier;
    /**
     * <p>
     * The configuration settings of the component. The value is the escaped JSON of the configuration.
     * </p>
     */
    private String componentConfiguration;

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     * 
     * @param monitor
     *        Indicates whether the application component is monitored.
     */

    public void setMonitor(Boolean monitor) {
        this.monitor = monitor;
    }

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     * 
     * @return Indicates whether the application component is monitored.
     */

    public Boolean getMonitor() {
        return this.monitor;
    }

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     * 
     * @param monitor
     *        Indicates whether the application component is monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentConfigurationResult withMonitor(Boolean monitor) {
        setMonitor(monitor);
        return this;
    }

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     * 
     * @return Indicates whether the application component is monitored.
     */

    public Boolean isMonitor() {
        return this.monitor;
    }

    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     * <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * </p>
     * 
     * @param tier
     *        The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     *        <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * @see Tier
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     * <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * </p>
     * 
     * @return The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     *         <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * @see Tier
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     * <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * </p>
     * 
     * @param tier
     *        The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     *        <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public DescribeComponentConfigurationResult withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     * <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * </p>
     * 
     * @param tier
     *        The tier of the application component. Supported tiers include <code>DOT_NET_CORE</code>,
     *        <code>DOT_NET_WORKER</code>, <code>DOT_NET_WEB</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public DescribeComponentConfigurationResult withTier(Tier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings of the component. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @param componentConfiguration
     *        The configuration settings of the component. The value is the escaped JSON of the configuration.
     */

    public void setComponentConfiguration(String componentConfiguration) {
        this.componentConfiguration = componentConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the component. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @return The configuration settings of the component. The value is the escaped JSON of the configuration.
     */

    public String getComponentConfiguration() {
        return this.componentConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the component. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @param componentConfiguration
     *        The configuration settings of the component. The value is the escaped JSON of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentConfigurationResult withComponentConfiguration(String componentConfiguration) {
        setComponentConfiguration(componentConfiguration);
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
        if (getMonitor() != null)
            sb.append("Monitor: ").append(getMonitor()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getComponentConfiguration() != null)
            sb.append("ComponentConfiguration: ").append(getComponentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeComponentConfigurationResult == false)
            return false;
        DescribeComponentConfigurationResult other = (DescribeComponentConfigurationResult) obj;
        if (other.getMonitor() == null ^ this.getMonitor() == null)
            return false;
        if (other.getMonitor() != null && other.getMonitor().equals(this.getMonitor()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getComponentConfiguration() == null ^ this.getComponentConfiguration() == null)
            return false;
        if (other.getComponentConfiguration() != null && other.getComponentConfiguration().equals(this.getComponentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitor() == null) ? 0 : getMonitor().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getComponentConfiguration() == null) ? 0 : getComponentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComponentConfigurationResult clone() {
        try {
            return (DescribeComponentConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

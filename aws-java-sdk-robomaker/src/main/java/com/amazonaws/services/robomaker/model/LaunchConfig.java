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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a launch configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/LaunchConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The package name.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The launch file name.
     * </p>
     */
    private String launchFile;
    /**
     * <p>
     * The environment variables for the application launch.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * The port forwarding configuration.
     * </p>
     */
    private PortForwardingConfig portForwardingConfig;
    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the application. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with your application as it is running in the
     * simulation. You must configure and launch the component. It must have a graphical user interface.
     * </p>
     */
    private Boolean streamUI;

    /**
     * <p>
     * The package name.
     * </p>
     * 
     * @param packageName
     *        The package name.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The package name.
     * </p>
     * 
     * @return The package name.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The package name.
     * </p>
     * 
     * @param packageName
     *        The package name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfig withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The launch file name.
     * </p>
     * 
     * @param launchFile
     *        The launch file name.
     */

    public void setLaunchFile(String launchFile) {
        this.launchFile = launchFile;
    }

    /**
     * <p>
     * The launch file name.
     * </p>
     * 
     * @return The launch file name.
     */

    public String getLaunchFile() {
        return this.launchFile;
    }

    /**
     * <p>
     * The launch file name.
     * </p>
     * 
     * @param launchFile
     *        The launch file name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfig withLaunchFile(String launchFile) {
        setLaunchFile(launchFile);
        return this;
    }

    /**
     * <p>
     * The environment variables for the application launch.
     * </p>
     * 
     * @return The environment variables for the application launch.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The environment variables for the application launch.
     * </p>
     * 
     * @param environmentVariables
     *        The environment variables for the application launch.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The environment variables for the application launch.
     * </p>
     * 
     * @param environmentVariables
     *        The environment variables for the application launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfig withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see LaunchConfig#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfig addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfig clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * The port forwarding configuration.
     * </p>
     * 
     * @param portForwardingConfig
     *        The port forwarding configuration.
     */

    public void setPortForwardingConfig(PortForwardingConfig portForwardingConfig) {
        this.portForwardingConfig = portForwardingConfig;
    }

    /**
     * <p>
     * The port forwarding configuration.
     * </p>
     * 
     * @return The port forwarding configuration.
     */

    public PortForwardingConfig getPortForwardingConfig() {
        return this.portForwardingConfig;
    }

    /**
     * <p>
     * The port forwarding configuration.
     * </p>
     * 
     * @param portForwardingConfig
     *        The port forwarding configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfig withPortForwardingConfig(PortForwardingConfig portForwardingConfig) {
        setPortForwardingConfig(portForwardingConfig);
        return this;
    }

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the application. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with your application as it is running in the
     * simulation. You must configure and launch the component. It must have a graphical user interface.
     * </p>
     * 
     * @param streamUI
     *        Boolean indicating whether a streaming session will be configured for the application. If
     *        <code>True</code>, AWS RoboMaker will configure a connection so you can interact with your application as
     *        it is running in the simulation. You must configure and launch the component. It must have a graphical
     *        user interface.
     */

    public void setStreamUI(Boolean streamUI) {
        this.streamUI = streamUI;
    }

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the application. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with your application as it is running in the
     * simulation. You must configure and launch the component. It must have a graphical user interface.
     * </p>
     * 
     * @return Boolean indicating whether a streaming session will be configured for the application. If
     *         <code>True</code>, AWS RoboMaker will configure a connection so you can interact with your application as
     *         it is running in the simulation. You must configure and launch the component. It must have a graphical
     *         user interface.
     */

    public Boolean getStreamUI() {
        return this.streamUI;
    }

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the application. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with your application as it is running in the
     * simulation. You must configure and launch the component. It must have a graphical user interface.
     * </p>
     * 
     * @param streamUI
     *        Boolean indicating whether a streaming session will be configured for the application. If
     *        <code>True</code>, AWS RoboMaker will configure a connection so you can interact with your application as
     *        it is running in the simulation. You must configure and launch the component. It must have a graphical
     *        user interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfig withStreamUI(Boolean streamUI) {
        setStreamUI(streamUI);
        return this;
    }

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the application. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with your application as it is running in the
     * simulation. You must configure and launch the component. It must have a graphical user interface.
     * </p>
     * 
     * @return Boolean indicating whether a streaming session will be configured for the application. If
     *         <code>True</code>, AWS RoboMaker will configure a connection so you can interact with your application as
     *         it is running in the simulation. You must configure and launch the component. It must have a graphical
     *         user interface.
     */

    public Boolean isStreamUI() {
        return this.streamUI;
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
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getLaunchFile() != null)
            sb.append("LaunchFile: ").append(getLaunchFile()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getPortForwardingConfig() != null)
            sb.append("PortForwardingConfig: ").append(getPortForwardingConfig()).append(",");
        if (getStreamUI() != null)
            sb.append("StreamUI: ").append(getStreamUI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchConfig == false)
            return false;
        LaunchConfig other = (LaunchConfig) obj;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getLaunchFile() == null ^ this.getLaunchFile() == null)
            return false;
        if (other.getLaunchFile() != null && other.getLaunchFile().equals(this.getLaunchFile()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getPortForwardingConfig() == null ^ this.getPortForwardingConfig() == null)
            return false;
        if (other.getPortForwardingConfig() != null && other.getPortForwardingConfig().equals(this.getPortForwardingConfig()) == false)
            return false;
        if (other.getStreamUI() == null ^ this.getStreamUI() == null)
            return false;
        if (other.getStreamUI() != null && other.getStreamUI().equals(this.getStreamUI()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getLaunchFile() == null) ? 0 : getLaunchFile().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getPortForwardingConfig() == null) ? 0 : getPortForwardingConfig().hashCode());
        hashCode = prime * hashCode + ((getStreamUI() == null) ? 0 : getStreamUI().hashCode());
        return hashCode;
    }

    @Override
    public LaunchConfig clone() {
        try {
            return (LaunchConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.LaunchConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

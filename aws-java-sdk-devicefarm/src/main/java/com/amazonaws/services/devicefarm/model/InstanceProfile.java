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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the instance profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/InstanceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     * <code>false</code> for private devices.
     * </p>
     */
    private Boolean packageCleanup;
    /**
     * <p>
     * An array of strings containing the list of app packages that should not be cleaned up from the device after a
     * test run completes.
     * </p>
     * <p>
     * The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     * </p>
     */
    private java.util.List<String> excludeAppPackagesFromCleanup;
    /**
     * <p>
     * When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     * <code>true</code>.
     * </p>
     */
    private Boolean rebootAfterUse;
    /**
     * <p>
     * The name of the instance profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the instance profile.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the instance profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instance profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     * <code>false</code> for private devices.
     * </p>
     * 
     * @param packageCleanup
     *        When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     *        <code>false</code> for private devices.
     */

    public void setPackageCleanup(Boolean packageCleanup) {
        this.packageCleanup = packageCleanup;
    }

    /**
     * <p>
     * When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     * <code>false</code> for private devices.
     * </p>
     * 
     * @return When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     *         <code>false</code> for private devices.
     */

    public Boolean getPackageCleanup() {
        return this.packageCleanup;
    }

    /**
     * <p>
     * When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     * <code>false</code> for private devices.
     * </p>
     * 
     * @param packageCleanup
     *        When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     *        <code>false</code> for private devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withPackageCleanup(Boolean packageCleanup) {
        setPackageCleanup(packageCleanup);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     * <code>false</code> for private devices.
     * </p>
     * 
     * @return When set to <code>true</code>, Device Farm removes app packages after a test run. The default value is
     *         <code>false</code> for private devices.
     */

    public Boolean isPackageCleanup() {
        return this.packageCleanup;
    }

    /**
     * <p>
     * An array of strings containing the list of app packages that should not be cleaned up from the device after a
     * test run completes.
     * </p>
     * <p>
     * The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     * </p>
     * 
     * @return An array of strings containing the list of app packages that should not be cleaned up from the device
     *         after a test run completes.</p>
     *         <p>
     *         The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     */

    public java.util.List<String> getExcludeAppPackagesFromCleanup() {
        return excludeAppPackagesFromCleanup;
    }

    /**
     * <p>
     * An array of strings containing the list of app packages that should not be cleaned up from the device after a
     * test run completes.
     * </p>
     * <p>
     * The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     * </p>
     * 
     * @param excludeAppPackagesFromCleanup
     *        An array of strings containing the list of app packages that should not be cleaned up from the device
     *        after a test run completes.</p>
     *        <p>
     *        The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     */

    public void setExcludeAppPackagesFromCleanup(java.util.Collection<String> excludeAppPackagesFromCleanup) {
        if (excludeAppPackagesFromCleanup == null) {
            this.excludeAppPackagesFromCleanup = null;
            return;
        }

        this.excludeAppPackagesFromCleanup = new java.util.ArrayList<String>(excludeAppPackagesFromCleanup);
    }

    /**
     * <p>
     * An array of strings containing the list of app packages that should not be cleaned up from the device after a
     * test run completes.
     * </p>
     * <p>
     * The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeAppPackagesFromCleanup(java.util.Collection)} or
     * {@link #withExcludeAppPackagesFromCleanup(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludeAppPackagesFromCleanup
     *        An array of strings containing the list of app packages that should not be cleaned up from the device
     *        after a test run completes.</p>
     *        <p>
     *        The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withExcludeAppPackagesFromCleanup(String... excludeAppPackagesFromCleanup) {
        if (this.excludeAppPackagesFromCleanup == null) {
            setExcludeAppPackagesFromCleanup(new java.util.ArrayList<String>(excludeAppPackagesFromCleanup.length));
        }
        for (String ele : excludeAppPackagesFromCleanup) {
            this.excludeAppPackagesFromCleanup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings containing the list of app packages that should not be cleaned up from the device after a
     * test run completes.
     * </p>
     * <p>
     * The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     * </p>
     * 
     * @param excludeAppPackagesFromCleanup
     *        An array of strings containing the list of app packages that should not be cleaned up from the device
     *        after a test run completes.</p>
     *        <p>
     *        The list of packages is considered only if you set <code>packageCleanup</code> to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withExcludeAppPackagesFromCleanup(java.util.Collection<String> excludeAppPackagesFromCleanup) {
        setExcludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     * <code>true</code>.
     * </p>
     * 
     * @param rebootAfterUse
     *        When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     *        <code>true</code>.
     */

    public void setRebootAfterUse(Boolean rebootAfterUse) {
        this.rebootAfterUse = rebootAfterUse;
    }

    /**
     * <p>
     * When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     * <code>true</code>.
     * </p>
     * 
     * @return When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     *         <code>true</code>.
     */

    public Boolean getRebootAfterUse() {
        return this.rebootAfterUse;
    }

    /**
     * <p>
     * When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     * <code>true</code>.
     * </p>
     * 
     * @param rebootAfterUse
     *        When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withRebootAfterUse(Boolean rebootAfterUse) {
        setRebootAfterUse(rebootAfterUse);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     * <code>true</code>.
     * </p>
     * 
     * @return When set to <code>true</code>, Device Farm reboots the instance after a test run. The default value is
     *         <code>true</code>.
     */

    public Boolean isRebootAfterUse() {
        return this.rebootAfterUse;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @param name
     *        The name of the instance profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @return The name of the instance profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @param name
     *        The name of the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the instance profile.
     * </p>
     * 
     * @param description
     *        The description of the instance profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the instance profile.
     * </p>
     * 
     * @return The description of the instance profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the instance profile.
     * </p>
     * 
     * @param description
     *        The description of the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withDescription(String description) {
        setDescription(description);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPackageCleanup() != null)
            sb.append("PackageCleanup: ").append(getPackageCleanup()).append(",");
        if (getExcludeAppPackagesFromCleanup() != null)
            sb.append("ExcludeAppPackagesFromCleanup: ").append(getExcludeAppPackagesFromCleanup()).append(",");
        if (getRebootAfterUse() != null)
            sb.append("RebootAfterUse: ").append(getRebootAfterUse()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceProfile == false)
            return false;
        InstanceProfile other = (InstanceProfile) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPackageCleanup() == null ^ this.getPackageCleanup() == null)
            return false;
        if (other.getPackageCleanup() != null && other.getPackageCleanup().equals(this.getPackageCleanup()) == false)
            return false;
        if (other.getExcludeAppPackagesFromCleanup() == null ^ this.getExcludeAppPackagesFromCleanup() == null)
            return false;
        if (other.getExcludeAppPackagesFromCleanup() != null
                && other.getExcludeAppPackagesFromCleanup().equals(this.getExcludeAppPackagesFromCleanup()) == false)
            return false;
        if (other.getRebootAfterUse() == null ^ this.getRebootAfterUse() == null)
            return false;
        if (other.getRebootAfterUse() != null && other.getRebootAfterUse().equals(this.getRebootAfterUse()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPackageCleanup() == null) ? 0 : getPackageCleanup().hashCode());
        hashCode = prime * hashCode + ((getExcludeAppPackagesFromCleanup() == null) ? 0 : getExcludeAppPackagesFromCleanup().hashCode());
        hashCode = prime * hashCode + ((getRebootAfterUse() == null) ? 0 : getRebootAfterUse().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public InstanceProfile clone() {
        try {
            return (InstanceProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.InstanceProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

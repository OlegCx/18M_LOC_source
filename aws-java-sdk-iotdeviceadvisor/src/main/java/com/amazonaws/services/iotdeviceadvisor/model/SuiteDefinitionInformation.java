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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Get suite definition information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/SuiteDefinitionInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuiteDefinitionInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Get suite definition Id.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Get test suite name.
     * </p>
     */
    private String suiteDefinitionName;
    /**
     * <p>
     * Specifies the devices under test.
     * </p>
     */
    private java.util.List<DeviceUnderTest> defaultDevices;
    /**
     * <p>
     * Gets the test suites which will be used for qualification.
     * </p>
     */
    private Boolean intendedForQualification;
    /**
     * <p>
     * Gets the information of when the test suite was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Get suite definition Id.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Get suite definition Id.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Get suite definition Id.
     * </p>
     * 
     * @return Get suite definition Id.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Get suite definition Id.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Get suite definition Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionInformation withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Get test suite name.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Get test suite name.
     */

    public void setSuiteDefinitionName(String suiteDefinitionName) {
        this.suiteDefinitionName = suiteDefinitionName;
    }

    /**
     * <p>
     * Get test suite name.
     * </p>
     * 
     * @return Get test suite name.
     */

    public String getSuiteDefinitionName() {
        return this.suiteDefinitionName;
    }

    /**
     * <p>
     * Get test suite name.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Get test suite name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionInformation withSuiteDefinitionName(String suiteDefinitionName) {
        setSuiteDefinitionName(suiteDefinitionName);
        return this;
    }

    /**
     * <p>
     * Specifies the devices under test.
     * </p>
     * 
     * @return Specifies the devices under test.
     */

    public java.util.List<DeviceUnderTest> getDefaultDevices() {
        return defaultDevices;
    }

    /**
     * <p>
     * Specifies the devices under test.
     * </p>
     * 
     * @param defaultDevices
     *        Specifies the devices under test.
     */

    public void setDefaultDevices(java.util.Collection<DeviceUnderTest> defaultDevices) {
        if (defaultDevices == null) {
            this.defaultDevices = null;
            return;
        }

        this.defaultDevices = new java.util.ArrayList<DeviceUnderTest>(defaultDevices);
    }

    /**
     * <p>
     * Specifies the devices under test.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultDevices(java.util.Collection)} or {@link #withDefaultDevices(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param defaultDevices
     *        Specifies the devices under test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionInformation withDefaultDevices(DeviceUnderTest... defaultDevices) {
        if (this.defaultDevices == null) {
            setDefaultDevices(new java.util.ArrayList<DeviceUnderTest>(defaultDevices.length));
        }
        for (DeviceUnderTest ele : defaultDevices) {
            this.defaultDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the devices under test.
     * </p>
     * 
     * @param defaultDevices
     *        Specifies the devices under test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionInformation withDefaultDevices(java.util.Collection<DeviceUnderTest> defaultDevices) {
        setDefaultDevices(defaultDevices);
        return this;
    }

    /**
     * <p>
     * Gets the test suites which will be used for qualification.
     * </p>
     * 
     * @param intendedForQualification
     *        Gets the test suites which will be used for qualification.
     */

    public void setIntendedForQualification(Boolean intendedForQualification) {
        this.intendedForQualification = intendedForQualification;
    }

    /**
     * <p>
     * Gets the test suites which will be used for qualification.
     * </p>
     * 
     * @return Gets the test suites which will be used for qualification.
     */

    public Boolean getIntendedForQualification() {
        return this.intendedForQualification;
    }

    /**
     * <p>
     * Gets the test suites which will be used for qualification.
     * </p>
     * 
     * @param intendedForQualification
     *        Gets the test suites which will be used for qualification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionInformation withIntendedForQualification(Boolean intendedForQualification) {
        setIntendedForQualification(intendedForQualification);
        return this;
    }

    /**
     * <p>
     * Gets the test suites which will be used for qualification.
     * </p>
     * 
     * @return Gets the test suites which will be used for qualification.
     */

    public Boolean isIntendedForQualification() {
        return this.intendedForQualification;
    }

    /**
     * <p>
     * Gets the information of when the test suite was created.
     * </p>
     * 
     * @param createdAt
     *        Gets the information of when the test suite was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Gets the information of when the test suite was created.
     * </p>
     * 
     * @return Gets the information of when the test suite was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Gets the information of when the test suite was created.
     * </p>
     * 
     * @param createdAt
     *        Gets the information of when the test suite was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteDefinitionInformation withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getSuiteDefinitionId() != null)
            sb.append("SuiteDefinitionId: ").append(getSuiteDefinitionId()).append(",");
        if (getSuiteDefinitionName() != null)
            sb.append("SuiteDefinitionName: ").append(getSuiteDefinitionName()).append(",");
        if (getDefaultDevices() != null)
            sb.append("DefaultDevices: ").append(getDefaultDevices()).append(",");
        if (getIntendedForQualification() != null)
            sb.append("IntendedForQualification: ").append(getIntendedForQualification()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuiteDefinitionInformation == false)
            return false;
        SuiteDefinitionInformation other = (SuiteDefinitionInformation) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionName() == null ^ this.getSuiteDefinitionName() == null)
            return false;
        if (other.getSuiteDefinitionName() != null && other.getSuiteDefinitionName().equals(this.getSuiteDefinitionName()) == false)
            return false;
        if (other.getDefaultDevices() == null ^ this.getDefaultDevices() == null)
            return false;
        if (other.getDefaultDevices() != null && other.getDefaultDevices().equals(this.getDefaultDevices()) == false)
            return false;
        if (other.getIntendedForQualification() == null ^ this.getIntendedForQualification() == null)
            return false;
        if (other.getIntendedForQualification() != null && other.getIntendedForQualification().equals(this.getIntendedForQualification()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionName() == null) ? 0 : getSuiteDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getDefaultDevices() == null) ? 0 : getDefaultDevices().hashCode());
        hashCode = prime * hashCode + ((getIntendedForQualification() == null) ? 0 : getIntendedForQualification().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public SuiteDefinitionInformation clone() {
        try {
            return (SuiteDefinitionInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.SuiteDefinitionInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

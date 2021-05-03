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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a quota.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ServiceQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuota implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The service identifier.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The service name.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quota.
     * </p>
     */
    private String quotaArn;
    /**
     * <p>
     * The quota identifier.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The quota name.
     * </p>
     */
    private String quotaName;
    /**
     * <p>
     * The quota value.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * The unit of measurement.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * Indicates whether the quota value can be increased.
     * </p>
     */
    private Boolean adjustable;
    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     */
    private Boolean globalQuota;
    /**
     * <p>
     * Information about the measurement.
     * </p>
     */
    private MetricInfo usageMetric;
    /**
     * <p>
     * The period of time.
     * </p>
     */
    private QuotaPeriod period;
    /**
     * <p>
     * The error code and error reason.
     * </p>
     */
    private ErrorReason errorReason;

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @param serviceCode
     *        The service identifier.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @return The service identifier.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @param serviceCode
     *        The service identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @param serviceName
     *        The service name.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @return The service name.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @param serviceName
     *        The service name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quota.
     * </p>
     * 
     * @param quotaArn
     *        The Amazon Resource Name (ARN) of the quota.
     */

    public void setQuotaArn(String quotaArn) {
        this.quotaArn = quotaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quota.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the quota.
     */

    public String getQuotaArn() {
        return this.quotaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quota.
     * </p>
     * 
     * @param quotaArn
     *        The Amazon Resource Name (ARN) of the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withQuotaArn(String quotaArn) {
        setQuotaArn(quotaArn);
        return this;
    }

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @param quotaCode
     *        The quota identifier.
     */

    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @return The quota identifier.
     */

    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @param quotaCode
     *        The quota identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The quota name.
     * </p>
     * 
     * @param quotaName
     *        The quota name.
     */

    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    /**
     * <p>
     * The quota name.
     * </p>
     * 
     * @return The quota name.
     */

    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * <p>
     * The quota name.
     * </p>
     * 
     * @param quotaName
     *        The quota name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withQuotaName(String quotaName) {
        setQuotaName(quotaName);
        return this;
    }

    /**
     * <p>
     * The quota value.
     * </p>
     * 
     * @param value
     *        The quota value.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The quota value.
     * </p>
     * 
     * @return The quota value.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The quota value.
     * </p>
     * 
     * @param value
     *        The quota value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The unit of measurement.
     * </p>
     * 
     * @param unit
     *        The unit of measurement.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measurement.
     * </p>
     * 
     * @return The unit of measurement.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measurement.
     * </p>
     * 
     * @param unit
     *        The unit of measurement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Indicates whether the quota value can be increased.
     * </p>
     * 
     * @param adjustable
     *        Indicates whether the quota value can be increased.
     */

    public void setAdjustable(Boolean adjustable) {
        this.adjustable = adjustable;
    }

    /**
     * <p>
     * Indicates whether the quota value can be increased.
     * </p>
     * 
     * @return Indicates whether the quota value can be increased.
     */

    public Boolean getAdjustable() {
        return this.adjustable;
    }

    /**
     * <p>
     * Indicates whether the quota value can be increased.
     * </p>
     * 
     * @param adjustable
     *        Indicates whether the quota value can be increased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withAdjustable(Boolean adjustable) {
        setAdjustable(adjustable);
        return this;
    }

    /**
     * <p>
     * Indicates whether the quota value can be increased.
     * </p>
     * 
     * @return Indicates whether the quota value can be increased.
     */

    public Boolean isAdjustable() {
        return this.adjustable;
    }

    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     * 
     * @param globalQuota
     *        Indicates whether the quota is global.
     */

    public void setGlobalQuota(Boolean globalQuota) {
        this.globalQuota = globalQuota;
    }

    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     * 
     * @return Indicates whether the quota is global.
     */

    public Boolean getGlobalQuota() {
        return this.globalQuota;
    }

    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     * 
     * @param globalQuota
     *        Indicates whether the quota is global.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withGlobalQuota(Boolean globalQuota) {
        setGlobalQuota(globalQuota);
        return this;
    }

    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     * 
     * @return Indicates whether the quota is global.
     */

    public Boolean isGlobalQuota() {
        return this.globalQuota;
    }

    /**
     * <p>
     * Information about the measurement.
     * </p>
     * 
     * @param usageMetric
     *        Information about the measurement.
     */

    public void setUsageMetric(MetricInfo usageMetric) {
        this.usageMetric = usageMetric;
    }

    /**
     * <p>
     * Information about the measurement.
     * </p>
     * 
     * @return Information about the measurement.
     */

    public MetricInfo getUsageMetric() {
        return this.usageMetric;
    }

    /**
     * <p>
     * Information about the measurement.
     * </p>
     * 
     * @param usageMetric
     *        Information about the measurement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withUsageMetric(MetricInfo usageMetric) {
        setUsageMetric(usageMetric);
        return this;
    }

    /**
     * <p>
     * The period of time.
     * </p>
     * 
     * @param period
     *        The period of time.
     */

    public void setPeriod(QuotaPeriod period) {
        this.period = period;
    }

    /**
     * <p>
     * The period of time.
     * </p>
     * 
     * @return The period of time.
     */

    public QuotaPeriod getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period of time.
     * </p>
     * 
     * @param period
     *        The period of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withPeriod(QuotaPeriod period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The error code and error reason.
     * </p>
     * 
     * @param errorReason
     *        The error code and error reason.
     */

    public void setErrorReason(ErrorReason errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * <p>
     * The error code and error reason.
     * </p>
     * 
     * @return The error code and error reason.
     */

    public ErrorReason getErrorReason() {
        return this.errorReason;
    }

    /**
     * <p>
     * The error code and error reason.
     * </p>
     * 
     * @param errorReason
     *        The error code and error reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuota withErrorReason(ErrorReason errorReason) {
        setErrorReason(errorReason);
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
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getQuotaArn() != null)
            sb.append("QuotaArn: ").append(getQuotaArn()).append(",");
        if (getQuotaCode() != null)
            sb.append("QuotaCode: ").append(getQuotaCode()).append(",");
        if (getQuotaName() != null)
            sb.append("QuotaName: ").append(getQuotaName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getAdjustable() != null)
            sb.append("Adjustable: ").append(getAdjustable()).append(",");
        if (getGlobalQuota() != null)
            sb.append("GlobalQuota: ").append(getGlobalQuota()).append(",");
        if (getUsageMetric() != null)
            sb.append("UsageMetric: ").append(getUsageMetric()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getErrorReason() != null)
            sb.append("ErrorReason: ").append(getErrorReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceQuota == false)
            return false;
        ServiceQuota other = (ServiceQuota) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getQuotaArn() == null ^ this.getQuotaArn() == null)
            return false;
        if (other.getQuotaArn() != null && other.getQuotaArn().equals(this.getQuotaArn()) == false)
            return false;
        if (other.getQuotaCode() == null ^ this.getQuotaCode() == null)
            return false;
        if (other.getQuotaCode() != null && other.getQuotaCode().equals(this.getQuotaCode()) == false)
            return false;
        if (other.getQuotaName() == null ^ this.getQuotaName() == null)
            return false;
        if (other.getQuotaName() != null && other.getQuotaName().equals(this.getQuotaName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getAdjustable() == null ^ this.getAdjustable() == null)
            return false;
        if (other.getAdjustable() != null && other.getAdjustable().equals(this.getAdjustable()) == false)
            return false;
        if (other.getGlobalQuota() == null ^ this.getGlobalQuota() == null)
            return false;
        if (other.getGlobalQuota() != null && other.getGlobalQuota().equals(this.getGlobalQuota()) == false)
            return false;
        if (other.getUsageMetric() == null ^ this.getUsageMetric() == null)
            return false;
        if (other.getUsageMetric() != null && other.getUsageMetric().equals(this.getUsageMetric()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getErrorReason() == null ^ this.getErrorReason() == null)
            return false;
        if (other.getErrorReason() != null && other.getErrorReason().equals(this.getErrorReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getQuotaArn() == null) ? 0 : getQuotaArn().hashCode());
        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        hashCode = prime * hashCode + ((getQuotaName() == null) ? 0 : getQuotaName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getAdjustable() == null) ? 0 : getAdjustable().hashCode());
        hashCode = prime * hashCode + ((getGlobalQuota() == null) ? 0 : getGlobalQuota().hashCode());
        hashCode = prime * hashCode + ((getUsageMetric() == null) ? 0 : getUsageMetric().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getErrorReason() == null) ? 0 : getErrorReason().hashCode());
        return hashCode;
    }

    @Override
    public ServiceQuota clone() {
        try {
            return (ServiceQuota) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicequotas.model.transform.ServiceQuotaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

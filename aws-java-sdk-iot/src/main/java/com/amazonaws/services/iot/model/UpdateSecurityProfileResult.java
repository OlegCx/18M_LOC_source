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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the security profile that was updated.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The ARN of the security profile that was updated.
     * </p>
     */
    private String securityProfileArn;
    /**
     * <p>
     * The description of the security profile.
     * </p>
     */
    private String securityProfileDescription;
    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     */
    private java.util.List<Behavior> behaviors;
    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     */
    private java.util.Map<String, AlertTarget> alertTargets;
    /**
     * <p>
     * <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     * </p>
     */
    @Deprecated
    private java.util.List<String> additionalMetricsToRetain;
    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's behaviors, but it is also retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     */
    private java.util.List<MetricToRetain> additionalMetricsToRetainV2;
    /**
     * <p>
     * The updated version of the security profile.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The time the security profile was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The time the security profile was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The name of the security profile that was updated.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile that was updated.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile that was updated.
     * </p>
     * 
     * @return The name of the security profile that was updated.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile that was updated.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The ARN of the security profile that was updated.
     * </p>
     * 
     * @param securityProfileArn
     *        The ARN of the security profile that was updated.
     */

    public void setSecurityProfileArn(String securityProfileArn) {
        this.securityProfileArn = securityProfileArn;
    }

    /**
     * <p>
     * The ARN of the security profile that was updated.
     * </p>
     * 
     * @return The ARN of the security profile that was updated.
     */

    public String getSecurityProfileArn() {
        return this.securityProfileArn;
    }

    /**
     * <p>
     * The ARN of the security profile that was updated.
     * </p>
     * 
     * @param securityProfileArn
     *        The ARN of the security profile that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withSecurityProfileArn(String securityProfileArn) {
        setSecurityProfileArn(securityProfileArn);
        return this;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @param securityProfileDescription
     *        The description of the security profile.
     */

    public void setSecurityProfileDescription(String securityProfileDescription) {
        this.securityProfileDescription = securityProfileDescription;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @return The description of the security profile.
     */

    public String getSecurityProfileDescription() {
        return this.securityProfileDescription;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @param securityProfileDescription
     *        The description of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withSecurityProfileDescription(String securityProfileDescription) {
        setSecurityProfileDescription(securityProfileDescription);
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @return Specifies the behaviors that, when violated by a device (thing), cause an alert.
     */

    public java.util.List<Behavior> getBehaviors() {
        return behaviors;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     */

    public void setBehaviors(java.util.Collection<Behavior> behaviors) {
        if (behaviors == null) {
            this.behaviors = null;
            return;
        }

        this.behaviors = new java.util.ArrayList<Behavior>(behaviors);
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBehaviors(java.util.Collection)} or {@link #withBehaviors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withBehaviors(Behavior... behaviors) {
        if (this.behaviors == null) {
            setBehaviors(new java.util.ArrayList<Behavior>(behaviors.length));
        }
        for (Behavior ele : behaviors) {
            this.behaviors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withBehaviors(java.util.Collection<Behavior> behaviors) {
        setBehaviors(behaviors);
        return this;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * 
     * @return Where the alerts are sent. (Alerts are always sent to the console.)
     */

    public java.util.Map<String, AlertTarget> getAlertTargets() {
        return alertTargets;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * 
     * @param alertTargets
     *        Where the alerts are sent. (Alerts are always sent to the console.)
     */

    public void setAlertTargets(java.util.Map<String, AlertTarget> alertTargets) {
        this.alertTargets = alertTargets;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * 
     * @param alertTargets
     *        Where the alerts are sent. (Alerts are always sent to the console.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withAlertTargets(java.util.Map<String, AlertTarget> alertTargets) {
        setAlertTargets(alertTargets);
        return this;
    }

    /**
     * Add a single AlertTargets entry
     *
     * @see UpdateSecurityProfileResult#withAlertTargets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult addAlertTargetsEntry(String key, AlertTarget value) {
        if (null == this.alertTargets) {
            this.alertTargets = new java.util.HashMap<String, AlertTarget>();
        }
        if (this.alertTargets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.alertTargets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AlertTargets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult clearAlertTargetsEntries() {
        this.alertTargets = null;
        return this;
    }

    /**
     * <p>
     * <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     * </p>
     * 
     * @return <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i> </p>
     *         <p>
     *         A list of metrics whose data is retained (stored). By default, data is retained for any metric used in
     *         the security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     */
    @Deprecated
    public java.util.List<String> getAdditionalMetricsToRetain() {
        return additionalMetricsToRetain;
    }

    /**
     * <p>
     * <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     * </p>
     * 
     * @param additionalMetricsToRetain
     *        <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i> </p>
     *        <p>
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     */
    @Deprecated
    public void setAdditionalMetricsToRetain(java.util.Collection<String> additionalMetricsToRetain) {
        if (additionalMetricsToRetain == null) {
            this.additionalMetricsToRetain = null;
            return;
        }

        this.additionalMetricsToRetain = new java.util.ArrayList<String>(additionalMetricsToRetain);
    }

    /**
     * <p>
     * <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalMetricsToRetain(java.util.Collection)} or
     * {@link #withAdditionalMetricsToRetain(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalMetricsToRetain
     *        <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i> </p>
     *        <p>
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateSecurityProfileResult withAdditionalMetricsToRetain(String... additionalMetricsToRetain) {
        if (this.additionalMetricsToRetain == null) {
            setAdditionalMetricsToRetain(new java.util.ArrayList<String>(additionalMetricsToRetain.length));
        }
        for (String ele : additionalMetricsToRetain) {
            this.additionalMetricsToRetain.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     * </p>
     * 
     * @param additionalMetricsToRetain
     *        <i>Please use <a>UpdateSecurityProfileResponse$additionalMetricsToRetainV2</a> instead.</i> </p>
     *        <p>
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        security profile's <code>behaviors</code>, but it is also retained for any metric specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateSecurityProfileResult withAdditionalMetricsToRetain(java.util.Collection<String> additionalMetricsToRetain) {
        setAdditionalMetricsToRetain(additionalMetricsToRetain);
        return this;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's behaviors, but it is also retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     * 
     * @return A list of metrics whose data is retained (stored). By default, data is retained for any metric used in
     *         the profile's behaviors, but it is also retained for any metric specified here. Can be used with custom
     *         metrics; cannot be used with dimensions.
     */

    public java.util.List<MetricToRetain> getAdditionalMetricsToRetainV2() {
        return additionalMetricsToRetainV2;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's behaviors, but it is also retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     * 
     * @param additionalMetricsToRetainV2
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        profile's behaviors, but it is also retained for any metric specified here. Can be used with custom
     *        metrics; cannot be used with dimensions.
     */

    public void setAdditionalMetricsToRetainV2(java.util.Collection<MetricToRetain> additionalMetricsToRetainV2) {
        if (additionalMetricsToRetainV2 == null) {
            this.additionalMetricsToRetainV2 = null;
            return;
        }

        this.additionalMetricsToRetainV2 = new java.util.ArrayList<MetricToRetain>(additionalMetricsToRetainV2);
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's behaviors, but it is also retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalMetricsToRetainV2(java.util.Collection)} or
     * {@link #withAdditionalMetricsToRetainV2(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalMetricsToRetainV2
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        profile's behaviors, but it is also retained for any metric specified here. Can be used with custom
     *        metrics; cannot be used with dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withAdditionalMetricsToRetainV2(MetricToRetain... additionalMetricsToRetainV2) {
        if (this.additionalMetricsToRetainV2 == null) {
            setAdditionalMetricsToRetainV2(new java.util.ArrayList<MetricToRetain>(additionalMetricsToRetainV2.length));
        }
        for (MetricToRetain ele : additionalMetricsToRetainV2) {
            this.additionalMetricsToRetainV2.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's behaviors, but it is also retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     * 
     * @param additionalMetricsToRetainV2
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        profile's behaviors, but it is also retained for any metric specified here. Can be used with custom
     *        metrics; cannot be used with dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withAdditionalMetricsToRetainV2(java.util.Collection<MetricToRetain> additionalMetricsToRetainV2) {
        setAdditionalMetricsToRetainV2(additionalMetricsToRetainV2);
        return this;
    }

    /**
     * <p>
     * The updated version of the security profile.
     * </p>
     * 
     * @param version
     *        The updated version of the security profile.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The updated version of the security profile.
     * </p>
     * 
     * @return The updated version of the security profile.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The updated version of the security profile.
     * </p>
     * 
     * @param version
     *        The updated version of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The time the security profile was created.
     * </p>
     * 
     * @param creationDate
     *        The time the security profile was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The time the security profile was created.
     * </p>
     * 
     * @return The time the security profile was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The time the security profile was created.
     * </p>
     * 
     * @param creationDate
     *        The time the security profile was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The time the security profile was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The time the security profile was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The time the security profile was last modified.
     * </p>
     * 
     * @return The time the security profile was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The time the security profile was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The time the security profile was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getSecurityProfileArn() != null)
            sb.append("SecurityProfileArn: ").append(getSecurityProfileArn()).append(",");
        if (getSecurityProfileDescription() != null)
            sb.append("SecurityProfileDescription: ").append(getSecurityProfileDescription()).append(",");
        if (getBehaviors() != null)
            sb.append("Behaviors: ").append(getBehaviors()).append(",");
        if (getAlertTargets() != null)
            sb.append("AlertTargets: ").append(getAlertTargets()).append(",");
        if (getAdditionalMetricsToRetain() != null)
            sb.append("AdditionalMetricsToRetain: ").append(getAdditionalMetricsToRetain()).append(",");
        if (getAdditionalMetricsToRetainV2() != null)
            sb.append("AdditionalMetricsToRetainV2: ").append(getAdditionalMetricsToRetainV2()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityProfileResult == false)
            return false;
        UpdateSecurityProfileResult other = (UpdateSecurityProfileResult) obj;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getSecurityProfileArn() == null ^ this.getSecurityProfileArn() == null)
            return false;
        if (other.getSecurityProfileArn() != null && other.getSecurityProfileArn().equals(this.getSecurityProfileArn()) == false)
            return false;
        if (other.getSecurityProfileDescription() == null ^ this.getSecurityProfileDescription() == null)
            return false;
        if (other.getSecurityProfileDescription() != null && other.getSecurityProfileDescription().equals(this.getSecurityProfileDescription()) == false)
            return false;
        if (other.getBehaviors() == null ^ this.getBehaviors() == null)
            return false;
        if (other.getBehaviors() != null && other.getBehaviors().equals(this.getBehaviors()) == false)
            return false;
        if (other.getAlertTargets() == null ^ this.getAlertTargets() == null)
            return false;
        if (other.getAlertTargets() != null && other.getAlertTargets().equals(this.getAlertTargets()) == false)
            return false;
        if (other.getAdditionalMetricsToRetain() == null ^ this.getAdditionalMetricsToRetain() == null)
            return false;
        if (other.getAdditionalMetricsToRetain() != null && other.getAdditionalMetricsToRetain().equals(this.getAdditionalMetricsToRetain()) == false)
            return false;
        if (other.getAdditionalMetricsToRetainV2() == null ^ this.getAdditionalMetricsToRetainV2() == null)
            return false;
        if (other.getAdditionalMetricsToRetainV2() != null && other.getAdditionalMetricsToRetainV2().equals(this.getAdditionalMetricsToRetainV2()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileArn() == null) ? 0 : getSecurityProfileArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileDescription() == null) ? 0 : getSecurityProfileDescription().hashCode());
        hashCode = prime * hashCode + ((getBehaviors() == null) ? 0 : getBehaviors().hashCode());
        hashCode = prime * hashCode + ((getAlertTargets() == null) ? 0 : getAlertTargets().hashCode());
        hashCode = prime * hashCode + ((getAdditionalMetricsToRetain() == null) ? 0 : getAdditionalMetricsToRetain().hashCode());
        hashCode = prime * hashCode + ((getAdditionalMetricsToRetainV2() == null) ? 0 : getAdditionalMetricsToRetainV2().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityProfileResult clone() {
        try {
            return (UpdateSecurityProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

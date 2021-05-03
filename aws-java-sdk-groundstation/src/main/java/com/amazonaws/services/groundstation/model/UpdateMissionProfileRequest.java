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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateMissionProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMissionProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     */
    private Integer contactPostPassDurationSeconds;
    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     */
    private Integer contactPrePassDurationSeconds;
    /**
     * <p>
     * A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a <i>to</i>
     * <code>Config</code>.
     * </p>
     */
    private java.util.List<java.util.List<String>> dataflowEdges;
    /**
     * <p>
     * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not
     * present you with contacts shorter than this duration.
     * </p>
     */
    private Integer minimumViableContactDurationSeconds;
    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     */
    private String missionProfileId;
    /**
     * <p>
     * Name of a mission profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * ARN of a tracking <code>Config</code>.
     * </p>
     */
    private String trackingConfigArn;

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @param contactPostPassDurationSeconds
     *        Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *        finished.
     */

    public void setContactPostPassDurationSeconds(Integer contactPostPassDurationSeconds) {
        this.contactPostPassDurationSeconds = contactPostPassDurationSeconds;
    }

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @return Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *         finished.
     */

    public Integer getContactPostPassDurationSeconds() {
        return this.contactPostPassDurationSeconds;
    }

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @param contactPostPassDurationSeconds
     *        Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *        finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMissionProfileRequest withContactPostPassDurationSeconds(Integer contactPostPassDurationSeconds) {
        setContactPostPassDurationSeconds(contactPostPassDurationSeconds);
        return this;
    }

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @param contactPrePassDurationSeconds
     *        Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *        finished.
     */

    public void setContactPrePassDurationSeconds(Integer contactPrePassDurationSeconds) {
        this.contactPrePassDurationSeconds = contactPrePassDurationSeconds;
    }

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @return Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *         finished.
     */

    public Integer getContactPrePassDurationSeconds() {
        return this.contactPrePassDurationSeconds;
    }

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @param contactPrePassDurationSeconds
     *        Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *        finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMissionProfileRequest withContactPrePassDurationSeconds(Integer contactPrePassDurationSeconds) {
        setContactPrePassDurationSeconds(contactPrePassDurationSeconds);
        return this;
    }

    /**
     * <p>
     * A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a <i>to</i>
     * <code>Config</code>.
     * </p>
     * 
     * @return A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a
     *         <i>to</i> <code>Config</code>.
     */

    public java.util.List<java.util.List<String>> getDataflowEdges() {
        return dataflowEdges;
    }

    /**
     * <p>
     * A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a <i>to</i>
     * <code>Config</code>.
     * </p>
     * 
     * @param dataflowEdges
     *        A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a
     *        <i>to</i> <code>Config</code>.
     */

    public void setDataflowEdges(java.util.Collection<java.util.List<String>> dataflowEdges) {
        if (dataflowEdges == null) {
            this.dataflowEdges = null;
            return;
        }

        this.dataflowEdges = new java.util.ArrayList<java.util.List<String>>(dataflowEdges);
    }

    /**
     * <p>
     * A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a <i>to</i>
     * <code>Config</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataflowEdges(java.util.Collection)} or {@link #withDataflowEdges(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataflowEdges
     *        A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a
     *        <i>to</i> <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMissionProfileRequest withDataflowEdges(java.util.List<String>... dataflowEdges) {
        if (this.dataflowEdges == null) {
            setDataflowEdges(new java.util.ArrayList<java.util.List<String>>(dataflowEdges.length));
        }
        for (java.util.List<String> ele : dataflowEdges) {
            this.dataflowEdges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a <i>to</i>
     * <code>Config</code>.
     * </p>
     * 
     * @param dataflowEdges
     *        A list of lists of ARNs. Each list of ARNs is an edge, with a <i>from</i> <code>Config</code> and a
     *        <i>to</i> <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMissionProfileRequest withDataflowEdges(java.util.Collection<java.util.List<String>> dataflowEdges) {
        setDataflowEdges(dataflowEdges);
        return this;
    }

    /**
     * <p>
     * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not
     * present you with contacts shorter than this duration.
     * </p>
     * 
     * @param minimumViableContactDurationSeconds
     *        Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station
     *        will not present you with contacts shorter than this duration.
     */

    public void setMinimumViableContactDurationSeconds(Integer minimumViableContactDurationSeconds) {
        this.minimumViableContactDurationSeconds = minimumViableContactDurationSeconds;
    }

    /**
     * <p>
     * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not
     * present you with contacts shorter than this duration.
     * </p>
     * 
     * @return Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station
     *         will not present you with contacts shorter than this duration.
     */

    public Integer getMinimumViableContactDurationSeconds() {
        return this.minimumViableContactDurationSeconds;
    }

    /**
     * <p>
     * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not
     * present you with contacts shorter than this duration.
     * </p>
     * 
     * @param minimumViableContactDurationSeconds
     *        Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station
     *        will not present you with contacts shorter than this duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMissionProfileRequest withMinimumViableContactDurationSeconds(Integer minimumViableContactDurationSeconds) {
        setMinimumViableContactDurationSeconds(minimumViableContactDurationSeconds);
        return this;
    }

    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     * 
     * @param missionProfileId
     *        UUID of a mission profile.
     */

    public void setMissionProfileId(String missionProfileId) {
        this.missionProfileId = missionProfileId;
    }

    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     * 
     * @return UUID of a mission profile.
     */

    public String getMissionProfileId() {
        return this.missionProfileId;
    }

    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     * 
     * @param missionProfileId
     *        UUID of a mission profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMissionProfileRequest withMissionProfileId(String missionProfileId) {
        setMissionProfileId(missionProfileId);
        return this;
    }

    /**
     * <p>
     * Name of a mission profile.
     * </p>
     * 
     * @param name
     *        Name of a mission profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of a mission profile.
     * </p>
     * 
     * @return Name of a mission profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of a mission profile.
     * </p>
     * 
     * @param name
     *        Name of a mission profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMissionProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * ARN of a tracking <code>Config</code>.
     * </p>
     * 
     * @param trackingConfigArn
     *        ARN of a tracking <code>Config</code>.
     */

    public void setTrackingConfigArn(String trackingConfigArn) {
        this.trackingConfigArn = trackingConfigArn;
    }

    /**
     * <p>
     * ARN of a tracking <code>Config</code>.
     * </p>
     * 
     * @return ARN of a tracking <code>Config</code>.
     */

    public String getTrackingConfigArn() {
        return this.trackingConfigArn;
    }

    /**
     * <p>
     * ARN of a tracking <code>Config</code>.
     * </p>
     * 
     * @param trackingConfigArn
     *        ARN of a tracking <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMissionProfileRequest withTrackingConfigArn(String trackingConfigArn) {
        setTrackingConfigArn(trackingConfigArn);
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
        if (getContactPostPassDurationSeconds() != null)
            sb.append("ContactPostPassDurationSeconds: ").append(getContactPostPassDurationSeconds()).append(",");
        if (getContactPrePassDurationSeconds() != null)
            sb.append("ContactPrePassDurationSeconds: ").append(getContactPrePassDurationSeconds()).append(",");
        if (getDataflowEdges() != null)
            sb.append("DataflowEdges: ").append(getDataflowEdges()).append(",");
        if (getMinimumViableContactDurationSeconds() != null)
            sb.append("MinimumViableContactDurationSeconds: ").append(getMinimumViableContactDurationSeconds()).append(",");
        if (getMissionProfileId() != null)
            sb.append("MissionProfileId: ").append(getMissionProfileId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTrackingConfigArn() != null)
            sb.append("TrackingConfigArn: ").append(getTrackingConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMissionProfileRequest == false)
            return false;
        UpdateMissionProfileRequest other = (UpdateMissionProfileRequest) obj;
        if (other.getContactPostPassDurationSeconds() == null ^ this.getContactPostPassDurationSeconds() == null)
            return false;
        if (other.getContactPostPassDurationSeconds() != null
                && other.getContactPostPassDurationSeconds().equals(this.getContactPostPassDurationSeconds()) == false)
            return false;
        if (other.getContactPrePassDurationSeconds() == null ^ this.getContactPrePassDurationSeconds() == null)
            return false;
        if (other.getContactPrePassDurationSeconds() != null
                && other.getContactPrePassDurationSeconds().equals(this.getContactPrePassDurationSeconds()) == false)
            return false;
        if (other.getDataflowEdges() == null ^ this.getDataflowEdges() == null)
            return false;
        if (other.getDataflowEdges() != null && other.getDataflowEdges().equals(this.getDataflowEdges()) == false)
            return false;
        if (other.getMinimumViableContactDurationSeconds() == null ^ this.getMinimumViableContactDurationSeconds() == null)
            return false;
        if (other.getMinimumViableContactDurationSeconds() != null
                && other.getMinimumViableContactDurationSeconds().equals(this.getMinimumViableContactDurationSeconds()) == false)
            return false;
        if (other.getMissionProfileId() == null ^ this.getMissionProfileId() == null)
            return false;
        if (other.getMissionProfileId() != null && other.getMissionProfileId().equals(this.getMissionProfileId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTrackingConfigArn() == null ^ this.getTrackingConfigArn() == null)
            return false;
        if (other.getTrackingConfigArn() != null && other.getTrackingConfigArn().equals(this.getTrackingConfigArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactPostPassDurationSeconds() == null) ? 0 : getContactPostPassDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getContactPrePassDurationSeconds() == null) ? 0 : getContactPrePassDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getDataflowEdges() == null) ? 0 : getDataflowEdges().hashCode());
        hashCode = prime * hashCode + ((getMinimumViableContactDurationSeconds() == null) ? 0 : getMinimumViableContactDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getMissionProfileId() == null) ? 0 : getMissionProfileId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTrackingConfigArn() == null) ? 0 : getTrackingConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMissionProfileRequest clone() {
        return (UpdateMissionProfileRequest) super.clone();
    }

}

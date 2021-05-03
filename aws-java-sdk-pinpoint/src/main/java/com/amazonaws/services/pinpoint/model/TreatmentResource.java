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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the settings for a campaign treatment. A <i>treatment</i> is a variation of a campaign that's used for A/B
 * testing of a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TreatmentResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TreatmentResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The delivery configuration settings for sending the treatment through a custom channel. This object is required
     * if the MessageConfiguration object for the treatment specifies a CustomMessage object.
     * </p>
     */
    private CustomDeliveryConfiguration customDeliveryConfiguration;
    /**
     * <p>
     * The unique identifier for the treatment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The message configuration settings for the treatment.
     * </p>
     */
    private MessageConfiguration messageConfiguration;
    /**
     * <p>
     * The schedule settings for the treatment.
     * </p>
     */
    private Schedule schedule;
    /**
     * <p>
     * The allocated percentage of users (segment members) that the treatment is sent to.
     * </p>
     */
    private Integer sizePercent;
    /**
     * <p>
     * The current status of the treatment.
     * </p>
     */
    private CampaignState state;
    /**
     * <p>
     * The message template to use for the treatment.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;
    /**
     * <p>
     * The custom description of the treatment.
     * </p>
     */
    private String treatmentDescription;
    /**
     * <p>
     * The custom name of the treatment.
     * </p>
     */
    private String treatmentName;

    /**
     * <p>
     * The delivery configuration settings for sending the treatment through a custom channel. This object is required
     * if the MessageConfiguration object for the treatment specifies a CustomMessage object.
     * </p>
     * 
     * @param customDeliveryConfiguration
     *        The delivery configuration settings for sending the treatment through a custom channel. This object is
     *        required if the MessageConfiguration object for the treatment specifies a CustomMessage object.
     */

    public void setCustomDeliveryConfiguration(CustomDeliveryConfiguration customDeliveryConfiguration) {
        this.customDeliveryConfiguration = customDeliveryConfiguration;
    }

    /**
     * <p>
     * The delivery configuration settings for sending the treatment through a custom channel. This object is required
     * if the MessageConfiguration object for the treatment specifies a CustomMessage object.
     * </p>
     * 
     * @return The delivery configuration settings for sending the treatment through a custom channel. This object is
     *         required if the MessageConfiguration object for the treatment specifies a CustomMessage object.
     */

    public CustomDeliveryConfiguration getCustomDeliveryConfiguration() {
        return this.customDeliveryConfiguration;
    }

    /**
     * <p>
     * The delivery configuration settings for sending the treatment through a custom channel. This object is required
     * if the MessageConfiguration object for the treatment specifies a CustomMessage object.
     * </p>
     * 
     * @param customDeliveryConfiguration
     *        The delivery configuration settings for sending the treatment through a custom channel. This object is
     *        required if the MessageConfiguration object for the treatment specifies a CustomMessage object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withCustomDeliveryConfiguration(CustomDeliveryConfiguration customDeliveryConfiguration) {
        setCustomDeliveryConfiguration(customDeliveryConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the treatment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the treatment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the treatment.
     * </p>
     * 
     * @return The unique identifier for the treatment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the treatment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The message configuration settings for the treatment.
     * </p>
     * 
     * @param messageConfiguration
     *        The message configuration settings for the treatment.
     */

    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * <p>
     * The message configuration settings for the treatment.
     * </p>
     * 
     * @return The message configuration settings for the treatment.
     */

    public MessageConfiguration getMessageConfiguration() {
        return this.messageConfiguration;
    }

    /**
     * <p>
     * The message configuration settings for the treatment.
     * </p>
     * 
     * @param messageConfiguration
     *        The message configuration settings for the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withMessageConfiguration(MessageConfiguration messageConfiguration) {
        setMessageConfiguration(messageConfiguration);
        return this;
    }

    /**
     * <p>
     * The schedule settings for the treatment.
     * </p>
     * 
     * @param schedule
     *        The schedule settings for the treatment.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule settings for the treatment.
     * </p>
     * 
     * @return The schedule settings for the treatment.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule settings for the treatment.
     * </p>
     * 
     * @param schedule
     *        The schedule settings for the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) that the treatment is sent to.
     * </p>
     * 
     * @param sizePercent
     *        The allocated percentage of users (segment members) that the treatment is sent to.
     */

    public void setSizePercent(Integer sizePercent) {
        this.sizePercent = sizePercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) that the treatment is sent to.
     * </p>
     * 
     * @return The allocated percentage of users (segment members) that the treatment is sent to.
     */

    public Integer getSizePercent() {
        return this.sizePercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) that the treatment is sent to.
     * </p>
     * 
     * @param sizePercent
     *        The allocated percentage of users (segment members) that the treatment is sent to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withSizePercent(Integer sizePercent) {
        setSizePercent(sizePercent);
        return this;
    }

    /**
     * <p>
     * The current status of the treatment.
     * </p>
     * 
     * @param state
     *        The current status of the treatment.
     */

    public void setState(CampaignState state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the treatment.
     * </p>
     * 
     * @return The current status of the treatment.
     */

    public CampaignState getState() {
        return this.state;
    }

    /**
     * <p>
     * The current status of the treatment.
     * </p>
     * 
     * @param state
     *        The current status of the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withState(CampaignState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The message template to use for the treatment.
     * </p>
     * 
     * @param templateConfiguration
     *        The message template to use for the treatment.
     */

    public void setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * The message template to use for the treatment.
     * </p>
     * 
     * @return The message template to use for the treatment.
     */

    public TemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * <p>
     * The message template to use for the treatment.
     * </p>
     * 
     * @param templateConfiguration
     *        The message template to use for the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        setTemplateConfiguration(templateConfiguration);
        return this;
    }

    /**
     * <p>
     * The custom description of the treatment.
     * </p>
     * 
     * @param treatmentDescription
     *        The custom description of the treatment.
     */

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * <p>
     * The custom description of the treatment.
     * </p>
     * 
     * @return The custom description of the treatment.
     */

    public String getTreatmentDescription() {
        return this.treatmentDescription;
    }

    /**
     * <p>
     * The custom description of the treatment.
     * </p>
     * 
     * @param treatmentDescription
     *        The custom description of the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withTreatmentDescription(String treatmentDescription) {
        setTreatmentDescription(treatmentDescription);
        return this;
    }

    /**
     * <p>
     * The custom name of the treatment.
     * </p>
     * 
     * @param treatmentName
     *        The custom name of the treatment.
     */

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * <p>
     * The custom name of the treatment.
     * </p>
     * 
     * @return The custom name of the treatment.
     */

    public String getTreatmentName() {
        return this.treatmentName;
    }

    /**
     * <p>
     * The custom name of the treatment.
     * </p>
     * 
     * @param treatmentName
     *        The custom name of the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreatmentResource withTreatmentName(String treatmentName) {
        setTreatmentName(treatmentName);
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
        if (getCustomDeliveryConfiguration() != null)
            sb.append("CustomDeliveryConfiguration: ").append(getCustomDeliveryConfiguration()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: ").append(getMessageConfiguration()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSizePercent() != null)
            sb.append("SizePercent: ").append(getSizePercent()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: ").append(getTemplateConfiguration()).append(",");
        if (getTreatmentDescription() != null)
            sb.append("TreatmentDescription: ").append(getTreatmentDescription()).append(",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: ").append(getTreatmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TreatmentResource == false)
            return false;
        TreatmentResource other = (TreatmentResource) obj;
        if (other.getCustomDeliveryConfiguration() == null ^ this.getCustomDeliveryConfiguration() == null)
            return false;
        if (other.getCustomDeliveryConfiguration() != null && other.getCustomDeliveryConfiguration().equals(this.getCustomDeliveryConfiguration()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessageConfiguration() == null ^ this.getMessageConfiguration() == null)
            return false;
        if (other.getMessageConfiguration() != null && other.getMessageConfiguration().equals(this.getMessageConfiguration()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSizePercent() == null ^ this.getSizePercent() == null)
            return false;
        if (other.getSizePercent() != null && other.getSizePercent().equals(this.getSizePercent()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
            return false;
        if (other.getTreatmentDescription() == null ^ this.getTreatmentDescription() == null)
            return false;
        if (other.getTreatmentDescription() != null && other.getTreatmentDescription().equals(this.getTreatmentDescription()) == false)
            return false;
        if (other.getTreatmentName() == null ^ this.getTreatmentName() == null)
            return false;
        if (other.getTreatmentName() != null && other.getTreatmentName().equals(this.getTreatmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDeliveryConfiguration() == null) ? 0 : getCustomDeliveryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSizePercent() == null) ? 0 : getSizePercent().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTreatmentDescription() == null) ? 0 : getTreatmentDescription().hashCode());
        hashCode = prime * hashCode + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        return hashCode;
    }

    @Override
    public TreatmentResource clone() {
        try {
            return (TreatmentResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.TreatmentResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

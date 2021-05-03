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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WriteTreatmentResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteTreatmentResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The delivery configuration settings for sending the treatment through a custom channel. This object is required
     * if the MessageConfiguration object for the treatment specifies a CustomMessage object.
     * </p>
     */
    private CustomDeliveryConfiguration customDeliveryConfiguration;
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
     * The allocated percentage of users (segment members) to send the treatment to.
     * </p>
     */
    private Integer sizePercent;
    /**
     * <p>
     * The message template to use for the treatment.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;
    /**
     * <p>
     * A custom description of the treatment.
     * </p>
     */
    private String treatmentDescription;
    /**
     * <p>
     * A custom name for the treatment.
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

    public WriteTreatmentResource withCustomDeliveryConfiguration(CustomDeliveryConfiguration customDeliveryConfiguration) {
        setCustomDeliveryConfiguration(customDeliveryConfiguration);
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

    public WriteTreatmentResource withMessageConfiguration(MessageConfiguration messageConfiguration) {
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

    public WriteTreatmentResource withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) to send the treatment to.
     * </p>
     * 
     * @param sizePercent
     *        The allocated percentage of users (segment members) to send the treatment to.
     */

    public void setSizePercent(Integer sizePercent) {
        this.sizePercent = sizePercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) to send the treatment to.
     * </p>
     * 
     * @return The allocated percentage of users (segment members) to send the treatment to.
     */

    public Integer getSizePercent() {
        return this.sizePercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) to send the treatment to.
     * </p>
     * 
     * @param sizePercent
     *        The allocated percentage of users (segment members) to send the treatment to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteTreatmentResource withSizePercent(Integer sizePercent) {
        setSizePercent(sizePercent);
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

    public WriteTreatmentResource withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        setTemplateConfiguration(templateConfiguration);
        return this;
    }

    /**
     * <p>
     * A custom description of the treatment.
     * </p>
     * 
     * @param treatmentDescription
     *        A custom description of the treatment.
     */

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * <p>
     * A custom description of the treatment.
     * </p>
     * 
     * @return A custom description of the treatment.
     */

    public String getTreatmentDescription() {
        return this.treatmentDescription;
    }

    /**
     * <p>
     * A custom description of the treatment.
     * </p>
     * 
     * @param treatmentDescription
     *        A custom description of the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteTreatmentResource withTreatmentDescription(String treatmentDescription) {
        setTreatmentDescription(treatmentDescription);
        return this;
    }

    /**
     * <p>
     * A custom name for the treatment.
     * </p>
     * 
     * @param treatmentName
     *        A custom name for the treatment.
     */

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * <p>
     * A custom name for the treatment.
     * </p>
     * 
     * @return A custom name for the treatment.
     */

    public String getTreatmentName() {
        return this.treatmentName;
    }

    /**
     * <p>
     * A custom name for the treatment.
     * </p>
     * 
     * @param treatmentName
     *        A custom name for the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteTreatmentResource withTreatmentName(String treatmentName) {
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
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: ").append(getMessageConfiguration()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSizePercent() != null)
            sb.append("SizePercent: ").append(getSizePercent()).append(",");
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

        if (obj instanceof WriteTreatmentResource == false)
            return false;
        WriteTreatmentResource other = (WriteTreatmentResource) obj;
        if (other.getCustomDeliveryConfiguration() == null ^ this.getCustomDeliveryConfiguration() == null)
            return false;
        if (other.getCustomDeliveryConfiguration() != null && other.getCustomDeliveryConfiguration().equals(this.getCustomDeliveryConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSizePercent() == null) ? 0 : getSizePercent().hashCode());
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTreatmentDescription() == null) ? 0 : getTreatmentDescription().hashCode());
        hashCode = prime * hashCode + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        return hashCode;
    }

    @Override
    public WriteTreatmentResource clone() {
        try {
            return (WriteTreatmentResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WriteTreatmentResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

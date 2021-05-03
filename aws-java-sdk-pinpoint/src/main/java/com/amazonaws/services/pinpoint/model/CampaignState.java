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
 * Provides information about the status of a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign.
     * </p>
     * <p>
     * If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a
     * status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign fails and has a
     * status of DELETED.
     * </p>
     */
    private String campaignStatus;

    /**
     * <p>
     * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign.
     * </p>
     * <p>
     * If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a
     * status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign fails and has a
     * status of DELETED.
     * </p>
     * 
     * @param campaignStatus
     *        The current status of the campaign, or the current status of a treatment that belongs to an A/B test
     *        campaign.</p>
     *        <p>
     *        If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments
     *        have a status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign
     *        fails and has a status of DELETED.
     * @see CampaignStatus
     */

    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * <p>
     * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign.
     * </p>
     * <p>
     * If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a
     * status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign fails and has a
     * status of DELETED.
     * </p>
     * 
     * @return The current status of the campaign, or the current status of a treatment that belongs to an A/B test
     *         campaign.</p>
     *         <p>
     *         If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments
     *         have a status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign
     *         fails and has a status of DELETED.
     * @see CampaignStatus
     */

    public String getCampaignStatus() {
        return this.campaignStatus;
    }

    /**
     * <p>
     * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign.
     * </p>
     * <p>
     * If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a
     * status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign fails and has a
     * status of DELETED.
     * </p>
     * 
     * @param campaignStatus
     *        The current status of the campaign, or the current status of a treatment that belongs to an A/B test
     *        campaign.</p>
     *        <p>
     *        If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments
     *        have a status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign
     *        fails and has a status of DELETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CampaignStatus
     */

    public CampaignState withCampaignStatus(String campaignStatus) {
        setCampaignStatus(campaignStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign.
     * </p>
     * <p>
     * If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a
     * status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign fails and has a
     * status of DELETED.
     * </p>
     * 
     * @param campaignStatus
     *        The current status of the campaign, or the current status of a treatment that belongs to an A/B test
     *        campaign.</p>
     *        <p>
     *        If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments
     *        have a status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign
     *        fails and has a status of DELETED.
     * @see CampaignStatus
     */

    public void setCampaignStatus(CampaignStatus campaignStatus) {
        withCampaignStatus(campaignStatus);
    }

    /**
     * <p>
     * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign.
     * </p>
     * <p>
     * If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a
     * status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign fails and has a
     * status of DELETED.
     * </p>
     * 
     * @param campaignStatus
     *        The current status of the campaign, or the current status of a treatment that belongs to an A/B test
     *        campaign.</p>
     *        <p>
     *        If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments
     *        have a status of COMPLETED. If you delete the segment that's associated with a campaign, the campaign
     *        fails and has a status of DELETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CampaignStatus
     */

    public CampaignState withCampaignStatus(CampaignStatus campaignStatus) {
        this.campaignStatus = campaignStatus.toString();
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
        if (getCampaignStatus() != null)
            sb.append("CampaignStatus: ").append(getCampaignStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignState == false)
            return false;
        CampaignState other = (CampaignState) obj;
        if (other.getCampaignStatus() == null ^ this.getCampaignStatus() == null)
            return false;
        if (other.getCampaignStatus() != null && other.getCampaignStatus().equals(this.getCampaignStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignStatus() == null) ? 0 : getCampaignStatus().hashCode());
        return hashCode;
    }

    @Override
    public CampaignState clone() {
        try {
            return (CampaignState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CampaignStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

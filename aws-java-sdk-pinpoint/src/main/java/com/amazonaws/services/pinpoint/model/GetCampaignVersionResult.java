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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCampaignVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private CampaignResponse campaignResponse;

    /**
     * @param campaignResponse
     */

    public void setCampaignResponse(CampaignResponse campaignResponse) {
        this.campaignResponse = campaignResponse;
    }

    /**
     * @return
     */

    public CampaignResponse getCampaignResponse() {
        return this.campaignResponse;
    }

    /**
     * @param campaignResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignVersionResult withCampaignResponse(CampaignResponse campaignResponse) {
        setCampaignResponse(campaignResponse);
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
        if (getCampaignResponse() != null)
            sb.append("CampaignResponse: ").append(getCampaignResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignVersionResult == false)
            return false;
        GetCampaignVersionResult other = (GetCampaignVersionResult) obj;
        if (other.getCampaignResponse() == null ^ this.getCampaignResponse() == null)
            return false;
        if (other.getCampaignResponse() != null && other.getCampaignResponse().equals(this.getCampaignResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignResponse() == null) ? 0 : getCampaignResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetCampaignVersionResult clone() {
        try {
            return (GetCampaignVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

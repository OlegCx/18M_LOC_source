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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipSandboxChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApnsVoipSandboxChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest;
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * @param aPNSVoipSandboxChannelRequest
     */

    public void setAPNSVoipSandboxChannelRequest(APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest) {
        this.aPNSVoipSandboxChannelRequest = aPNSVoipSandboxChannelRequest;
    }

    /**
     * @return
     */

    public APNSVoipSandboxChannelRequest getAPNSVoipSandboxChannelRequest() {
        return this.aPNSVoipSandboxChannelRequest;
    }

    /**
     * @param aPNSVoipSandboxChannelRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApnsVoipSandboxChannelRequest withAPNSVoipSandboxChannelRequest(APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest) {
        setAPNSVoipSandboxChannelRequest(aPNSVoipSandboxChannelRequest);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *         Amazon Pinpoint console.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApnsVoipSandboxChannelRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
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
        if (getAPNSVoipSandboxChannelRequest() != null)
            sb.append("APNSVoipSandboxChannelRequest: ").append(getAPNSVoipSandboxChannelRequest()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApnsVoipSandboxChannelRequest == false)
            return false;
        UpdateApnsVoipSandboxChannelRequest other = (UpdateApnsVoipSandboxChannelRequest) obj;
        if (other.getAPNSVoipSandboxChannelRequest() == null ^ this.getAPNSVoipSandboxChannelRequest() == null)
            return false;
        if (other.getAPNSVoipSandboxChannelRequest() != null
                && other.getAPNSVoipSandboxChannelRequest().equals(this.getAPNSVoipSandboxChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAPNSVoipSandboxChannelRequest() == null) ? 0 : getAPNSVoipSandboxChannelRequest().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApnsVoipSandboxChannelRequest clone() {
        return (UpdateApnsVoipSandboxChannelRequest) super.clone();
    }

}

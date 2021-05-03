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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the certificate authority (CA).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/WebsiteCaSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebsiteCaSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     */
    private String websiteCaId;
    /**
     * <p>
     * The time when the CA was added.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The name to display.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * 
     * @param websiteCaId
     *        A unique identifier for the CA.
     */

    public void setWebsiteCaId(String websiteCaId) {
        this.websiteCaId = websiteCaId;
    }

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * 
     * @return A unique identifier for the CA.
     */

    public String getWebsiteCaId() {
        return this.websiteCaId;
    }

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * 
     * @param websiteCaId
     *        A unique identifier for the CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebsiteCaSummary withWebsiteCaId(String websiteCaId) {
        setWebsiteCaId(websiteCaId);
        return this;
    }

    /**
     * <p>
     * The time when the CA was added.
     * </p>
     * 
     * @param createdTime
     *        The time when the CA was added.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time when the CA was added.
     * </p>
     * 
     * @return The time when the CA was added.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time when the CA was added.
     * </p>
     * 
     * @param createdTime
     *        The time when the CA was added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebsiteCaSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @param displayName
     *        The name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @return The name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @param displayName
     *        The name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebsiteCaSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getWebsiteCaId() != null)
            sb.append("WebsiteCaId: ").append(getWebsiteCaId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebsiteCaSummary == false)
            return false;
        WebsiteCaSummary other = (WebsiteCaSummary) obj;
        if (other.getWebsiteCaId() == null ^ this.getWebsiteCaId() == null)
            return false;
        if (other.getWebsiteCaId() != null && other.getWebsiteCaId().equals(this.getWebsiteCaId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebsiteCaId() == null) ? 0 : getWebsiteCaId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public WebsiteCaSummary clone() {
        try {
            return (WebsiteCaSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.worklink.model.transform.WebsiteCaSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

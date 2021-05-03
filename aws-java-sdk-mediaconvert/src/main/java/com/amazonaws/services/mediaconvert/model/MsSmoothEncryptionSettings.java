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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MsSmoothEncryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MsSmoothEncryptionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a
     * SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
     */
    private SpekeKeyProvider spekeKeyProvider;

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a
     * SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
     * 
     * @param spekeKeyProvider
     *        If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption
     *        with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf
     *        settings instead.
     */

    public void setSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a
     * SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
     * 
     * @return If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption
     *         with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf
     *         settings instead.
     */

    public SpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a
     * SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
     * 
     * @param spekeKeyProvider
     *        If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption
     *        with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf
     *        settings instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothEncryptionSettings withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        setSpekeKeyProvider(spekeKeyProvider);
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
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: ").append(getSpekeKeyProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MsSmoothEncryptionSettings == false)
            return false;
        MsSmoothEncryptionSettings other = (MsSmoothEncryptionSettings) obj;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        return hashCode;
    }

    @Override
    public MsSmoothEncryptionSettings clone() {
        try {
            return (MsSmoothEncryptionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MsSmoothEncryptionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Hls Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/HlsSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsSettings implements Serializable, Cloneable, StructuredPojo {

    private AudioOnlyHlsSettings audioOnlyHlsSettings;

    private Fmp4HlsSettings fmp4HlsSettings;

    private FrameCaptureHlsSettings frameCaptureHlsSettings;

    private StandardHlsSettings standardHlsSettings;

    /**
     * @param audioOnlyHlsSettings
     */

    public void setAudioOnlyHlsSettings(AudioOnlyHlsSettings audioOnlyHlsSettings) {
        this.audioOnlyHlsSettings = audioOnlyHlsSettings;
    }

    /**
     * @return
     */

    public AudioOnlyHlsSettings getAudioOnlyHlsSettings() {
        return this.audioOnlyHlsSettings;
    }

    /**
     * @param audioOnlyHlsSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsSettings withAudioOnlyHlsSettings(AudioOnlyHlsSettings audioOnlyHlsSettings) {
        setAudioOnlyHlsSettings(audioOnlyHlsSettings);
        return this;
    }

    /**
     * @param fmp4HlsSettings
     */

    public void setFmp4HlsSettings(Fmp4HlsSettings fmp4HlsSettings) {
        this.fmp4HlsSettings = fmp4HlsSettings;
    }

    /**
     * @return
     */

    public Fmp4HlsSettings getFmp4HlsSettings() {
        return this.fmp4HlsSettings;
    }

    /**
     * @param fmp4HlsSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsSettings withFmp4HlsSettings(Fmp4HlsSettings fmp4HlsSettings) {
        setFmp4HlsSettings(fmp4HlsSettings);
        return this;
    }

    /**
     * @param frameCaptureHlsSettings
     */

    public void setFrameCaptureHlsSettings(FrameCaptureHlsSettings frameCaptureHlsSettings) {
        this.frameCaptureHlsSettings = frameCaptureHlsSettings;
    }

    /**
     * @return
     */

    public FrameCaptureHlsSettings getFrameCaptureHlsSettings() {
        return this.frameCaptureHlsSettings;
    }

    /**
     * @param frameCaptureHlsSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsSettings withFrameCaptureHlsSettings(FrameCaptureHlsSettings frameCaptureHlsSettings) {
        setFrameCaptureHlsSettings(frameCaptureHlsSettings);
        return this;
    }

    /**
     * @param standardHlsSettings
     */

    public void setStandardHlsSettings(StandardHlsSettings standardHlsSettings) {
        this.standardHlsSettings = standardHlsSettings;
    }

    /**
     * @return
     */

    public StandardHlsSettings getStandardHlsSettings() {
        return this.standardHlsSettings;
    }

    /**
     * @param standardHlsSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsSettings withStandardHlsSettings(StandardHlsSettings standardHlsSettings) {
        setStandardHlsSettings(standardHlsSettings);
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
        if (getAudioOnlyHlsSettings() != null)
            sb.append("AudioOnlyHlsSettings: ").append(getAudioOnlyHlsSettings()).append(",");
        if (getFmp4HlsSettings() != null)
            sb.append("Fmp4HlsSettings: ").append(getFmp4HlsSettings()).append(",");
        if (getFrameCaptureHlsSettings() != null)
            sb.append("FrameCaptureHlsSettings: ").append(getFrameCaptureHlsSettings()).append(",");
        if (getStandardHlsSettings() != null)
            sb.append("StandardHlsSettings: ").append(getStandardHlsSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsSettings == false)
            return false;
        HlsSettings other = (HlsSettings) obj;
        if (other.getAudioOnlyHlsSettings() == null ^ this.getAudioOnlyHlsSettings() == null)
            return false;
        if (other.getAudioOnlyHlsSettings() != null && other.getAudioOnlyHlsSettings().equals(this.getAudioOnlyHlsSettings()) == false)
            return false;
        if (other.getFmp4HlsSettings() == null ^ this.getFmp4HlsSettings() == null)
            return false;
        if (other.getFmp4HlsSettings() != null && other.getFmp4HlsSettings().equals(this.getFmp4HlsSettings()) == false)
            return false;
        if (other.getFrameCaptureHlsSettings() == null ^ this.getFrameCaptureHlsSettings() == null)
            return false;
        if (other.getFrameCaptureHlsSettings() != null && other.getFrameCaptureHlsSettings().equals(this.getFrameCaptureHlsSettings()) == false)
            return false;
        if (other.getStandardHlsSettings() == null ^ this.getStandardHlsSettings() == null)
            return false;
        if (other.getStandardHlsSettings() != null && other.getStandardHlsSettings().equals(this.getStandardHlsSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioOnlyHlsSettings() == null) ? 0 : getAudioOnlyHlsSettings().hashCode());
        hashCode = prime * hashCode + ((getFmp4HlsSettings() == null) ? 0 : getFmp4HlsSettings().hashCode());
        hashCode = prime * hashCode + ((getFrameCaptureHlsSettings() == null) ? 0 : getFrameCaptureHlsSettings().hashCode());
        hashCode = prime * hashCode + ((getStandardHlsSettings() == null) ? 0 : getStandardHlsSettings().hashCode());
        return hashCode;
    }

    @Override
    public HlsSettings clone() {
        try {
            return (HlsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.HlsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

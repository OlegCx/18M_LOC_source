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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A CMAF packaging configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CmafPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafPackage implements Serializable, Cloneable, StructuredPojo {

    private CmafEncryption encryption;
    /** A list of HLS manifest configurations. */
    private java.util.List<HlsManifest> hlsManifests;
    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter
     * Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of
     * in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     */
    private Boolean includeEncoderConfigurationInSegments;
    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     */
    private Integer segmentDurationSeconds;

    /**
     * @param encryption
     */

    public void setEncryption(CmafEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return
     */

    public CmafEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * @param encryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackage withEncryption(CmafEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     * @return A list of HLS manifest configurations.
     */

    public java.util.List<HlsManifest> getHlsManifests() {
        return hlsManifests;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations.
     */

    public void setHlsManifests(java.util.Collection<HlsManifest> hlsManifests) {
        if (hlsManifests == null) {
            this.hlsManifests = null;
            return;
        }

        this.hlsManifests = new java.util.ArrayList<HlsManifest>(hlsManifests);
    }

    /**
     * A list of HLS manifest configurations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHlsManifests(java.util.Collection)} or {@link #withHlsManifests(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackage withHlsManifests(HlsManifest... hlsManifests) {
        if (this.hlsManifests == null) {
            setHlsManifests(new java.util.ArrayList<HlsManifest>(hlsManifests.length));
        }
        for (HlsManifest ele : hlsManifests) {
            this.hlsManifests.add(ele);
        }
        return this;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackage withHlsManifests(java.util.Collection<HlsManifest> hlsManifests) {
        setHlsManifests(hlsManifests);
        return this;
    }

    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter
     * Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of
     * in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
     * @param includeEncoderConfigurationInSegments
     *        When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence
     *        Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video
     *        segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets
     *        during content playback.
     */

    public void setIncludeEncoderConfigurationInSegments(Boolean includeEncoderConfigurationInSegments) {
        this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
    }

    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter
     * Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of
     * in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
     * @return When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence
     *         Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video
     *         segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets
     *         during content playback.
     */

    public Boolean getIncludeEncoderConfigurationInSegments() {
        return this.includeEncoderConfigurationInSegments;
    }

    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter
     * Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of
     * in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
     * @param includeEncoderConfigurationInSegments
     *        When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence
     *        Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video
     *        segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets
     *        during content playback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackage withIncludeEncoderConfigurationInSegments(Boolean includeEncoderConfigurationInSegments) {
        setIncludeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments);
        return this;
    }

    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter
     * Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of
     * in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
     * @return When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence
     *         Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video
     *         segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets
     *         during content playback.
     */

    public Boolean isIncludeEncoderConfigurationInSegments() {
        return this.includeEncoderConfigurationInSegments;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *        source fragment duration.
     */

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @return Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *         source fragment duration.
     */

    public Integer getSegmentDurationSeconds() {
        return this.segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *        source fragment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        setSegmentDurationSeconds(segmentDurationSeconds);
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
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getHlsManifests() != null)
            sb.append("HlsManifests: ").append(getHlsManifests()).append(",");
        if (getIncludeEncoderConfigurationInSegments() != null)
            sb.append("IncludeEncoderConfigurationInSegments: ").append(getIncludeEncoderConfigurationInSegments()).append(",");
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: ").append(getSegmentDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmafPackage == false)
            return false;
        CmafPackage other = (CmafPackage) obj;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getHlsManifests() == null ^ this.getHlsManifests() == null)
            return false;
        if (other.getHlsManifests() != null && other.getHlsManifests().equals(this.getHlsManifests()) == false)
            return false;
        if (other.getIncludeEncoderConfigurationInSegments() == null ^ this.getIncludeEncoderConfigurationInSegments() == null)
            return false;
        if (other.getIncludeEncoderConfigurationInSegments() != null
                && other.getIncludeEncoderConfigurationInSegments().equals(this.getIncludeEncoderConfigurationInSegments()) == false)
            return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null)
            return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getHlsManifests() == null) ? 0 : getHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getIncludeEncoderConfigurationInSegments() == null) ? 0 : getIncludeEncoderConfigurationInSegments().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CmafPackage clone() {
        try {
            return (CmafPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.CmafPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

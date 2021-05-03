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
 * These settings relate to your MP4 output container. You can create audio only outputs with this container. For more
 * information, see
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/supported-codecs-containers-audio-only.html#output
 * -codecs-and-containers-supported-for-audio-only.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Mp4Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mp4Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     */
    private String audioDuration;
    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     */
    private String cslgAtom;
    /**
     * Ignore this setting unless compliance to the CTTS box version specification matters in your workflow. Specify a
     * value of 1 to set your CTTS box version to 1 and make your output compliant with the specification. When you
     * specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the default value 0 to set
     * your CTTS box version to 0. This can provide backward compatibility for some players and packagers.
     */
    private Integer cttsVersion;
    /** Inserts a free-space box immediately after the moov box. */
    private String freeSpaceBox;
    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     */
    private String moovPlacement;
    /** Overrides the "Major Brand" field in the output file. Usually not necessary to specify. */
    private String mp4MajorBrand;

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     * 
     * @param audioDuration
     *        Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     *        sensitive to very small duration differences between video and audio. For this situation, choose Match
     *        video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     *        (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams
     *        with silence or trims them to ensure that the total duration of each audio stream is at least as long as
     *        the total duration of the video stream. After padding or trimming, the audio stream duration is no more
     *        than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the
     *        end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end
     *        of the file. When you keep the default value, any minor discrepancies between audio and video duration
     *        will depend on your output audio codec.
     * @see CmfcAudioDuration
     */

    public void setAudioDuration(String audioDuration) {
        this.audioDuration = audioDuration;
    }

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     * 
     * @return Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     *         sensitive to very small duration differences between video and audio. For this situation, choose Match
     *         video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     *         (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio
     *         streams with silence or trims them to ensure that the total duration of each audio stream is at least as
     *         long as the total duration of the video stream. After padding or trimming, the audio stream duration is
     *         no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only
     *         to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to
     *         the end of the file. When you keep the default value, any minor discrepancies between audio and video
     *         duration will depend on your output audio codec.
     * @see CmfcAudioDuration
     */

    public String getAudioDuration() {
        return this.audioDuration;
    }

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     * 
     * @param audioDuration
     *        Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     *        sensitive to very small duration differences between video and audio. For this situation, choose Match
     *        video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     *        (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams
     *        with silence or trims them to ensure that the total duration of each audio stream is at least as long as
     *        the total duration of the video stream. After padding or trimming, the audio stream duration is no more
     *        than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the
     *        end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end
     *        of the file. When you keep the default value, any minor discrepancies between audio and video duration
     *        will depend on your output audio codec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcAudioDuration
     */

    public Mp4Settings withAudioDuration(String audioDuration) {
        setAudioDuration(audioDuration);
        return this;
    }

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     * 
     * @param audioDuration
     *        Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     *        sensitive to very small duration differences between video and audio. For this situation, choose Match
     *        video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     *        (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams
     *        with silence or trims them to ensure that the total duration of each audio stream is at least as long as
     *        the total duration of the video stream. After padding or trimming, the audio stream duration is no more
     *        than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the
     *        end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end
     *        of the file. When you keep the default value, any minor discrepancies between audio and video duration
     *        will depend on your output audio codec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcAudioDuration
     */

    public Mp4Settings withAudioDuration(CmfcAudioDuration audioDuration) {
        this.audioDuration = audioDuration.toString();
        return this;
    }

    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * 
     * @param cslgAtom
     *        When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time
     *        to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be
     *        included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * @see Mp4CslgAtom
     */

    public void setCslgAtom(String cslgAtom) {
        this.cslgAtom = cslgAtom;
    }

    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * 
     * @return When enabled, file composition times will start at zero, composition times in the 'ctts' (composition
     *         time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box
     *         will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * @see Mp4CslgAtom
     */

    public String getCslgAtom() {
        return this.cslgAtom;
    }

    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * 
     * @param cslgAtom
     *        When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time
     *        to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be
     *        included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mp4CslgAtom
     */

    public Mp4Settings withCslgAtom(String cslgAtom) {
        setCslgAtom(cslgAtom);
        return this;
    }

    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * 
     * @param cslgAtom
     *        When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time
     *        to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be
     *        included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mp4CslgAtom
     */

    public Mp4Settings withCslgAtom(Mp4CslgAtom cslgAtom) {
        this.cslgAtom = cslgAtom.toString();
        return this;
    }

    /**
     * Ignore this setting unless compliance to the CTTS box version specification matters in your workflow. Specify a
     * value of 1 to set your CTTS box version to 1 and make your output compliant with the specification. When you
     * specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the default value 0 to set
     * your CTTS box version to 0. This can provide backward compatibility for some players and packagers.
     * 
     * @param cttsVersion
     *        Ignore this setting unless compliance to the CTTS box version specification matters in your workflow.
     *        Specify a value of 1 to set your CTTS box version to 1 and make your output compliant with the
     *        specification. When you specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE.
     *        Keep the default value 0 to set your CTTS box version to 0. This can provide backward compatibility for
     *        some players and packagers.
     */

    public void setCttsVersion(Integer cttsVersion) {
        this.cttsVersion = cttsVersion;
    }

    /**
     * Ignore this setting unless compliance to the CTTS box version specification matters in your workflow. Specify a
     * value of 1 to set your CTTS box version to 1 and make your output compliant with the specification. When you
     * specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the default value 0 to set
     * your CTTS box version to 0. This can provide backward compatibility for some players and packagers.
     * 
     * @return Ignore this setting unless compliance to the CTTS box version specification matters in your workflow.
     *         Specify a value of 1 to set your CTTS box version to 1 and make your output compliant with the
     *         specification. When you specify a value of 1, you must also set CSLG atom (cslgAtom) to the value
     *         INCLUDE. Keep the default value 0 to set your CTTS box version to 0. This can provide backward
     *         compatibility for some players and packagers.
     */

    public Integer getCttsVersion() {
        return this.cttsVersion;
    }

    /**
     * Ignore this setting unless compliance to the CTTS box version specification matters in your workflow. Specify a
     * value of 1 to set your CTTS box version to 1 and make your output compliant with the specification. When you
     * specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the default value 0 to set
     * your CTTS box version to 0. This can provide backward compatibility for some players and packagers.
     * 
     * @param cttsVersion
     *        Ignore this setting unless compliance to the CTTS box version specification matters in your workflow.
     *        Specify a value of 1 to set your CTTS box version to 1 and make your output compliant with the
     *        specification. When you specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE.
     *        Keep the default value 0 to set your CTTS box version to 0. This can provide backward compatibility for
     *        some players and packagers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mp4Settings withCttsVersion(Integer cttsVersion) {
        setCttsVersion(cttsVersion);
        return this;
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * 
     * @param freeSpaceBox
     *        Inserts a free-space box immediately after the moov box.
     * @see Mp4FreeSpaceBox
     */

    public void setFreeSpaceBox(String freeSpaceBox) {
        this.freeSpaceBox = freeSpaceBox;
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * 
     * @return Inserts a free-space box immediately after the moov box.
     * @see Mp4FreeSpaceBox
     */

    public String getFreeSpaceBox() {
        return this.freeSpaceBox;
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * 
     * @param freeSpaceBox
     *        Inserts a free-space box immediately after the moov box.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mp4FreeSpaceBox
     */

    public Mp4Settings withFreeSpaceBox(String freeSpaceBox) {
        setFreeSpaceBox(freeSpaceBox);
        return this;
    }

    /**
     * Inserts a free-space box immediately after the moov box.
     * 
     * @param freeSpaceBox
     *        Inserts a free-space box immediately after the moov box.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mp4FreeSpaceBox
     */

    public Mp4Settings withFreeSpaceBox(Mp4FreeSpaceBox freeSpaceBox) {
        this.freeSpaceBox = freeSpaceBox.toString();
        return this;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     * 
     * @param moovPlacement
     *        If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     *        progressive downloading. Otherwise it is placed normally at the end.
     * @see Mp4MoovPlacement
     */

    public void setMoovPlacement(String moovPlacement) {
        this.moovPlacement = moovPlacement;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     * 
     * @return If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required
     *         for progressive downloading. Otherwise it is placed normally at the end.
     * @see Mp4MoovPlacement
     */

    public String getMoovPlacement() {
        return this.moovPlacement;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     * 
     * @param moovPlacement
     *        If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     *        progressive downloading. Otherwise it is placed normally at the end.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mp4MoovPlacement
     */

    public Mp4Settings withMoovPlacement(String moovPlacement) {
        setMoovPlacement(moovPlacement);
        return this;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     * 
     * @param moovPlacement
     *        If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     *        progressive downloading. Otherwise it is placed normally at the end.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mp4MoovPlacement
     */

    public Mp4Settings withMoovPlacement(Mp4MoovPlacement moovPlacement) {
        this.moovPlacement = moovPlacement.toString();
        return this;
    }

    /**
     * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
     * 
     * @param mp4MajorBrand
     *        Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
     */

    public void setMp4MajorBrand(String mp4MajorBrand) {
        this.mp4MajorBrand = mp4MajorBrand;
    }

    /**
     * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
     * 
     * @return Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
     */

    public String getMp4MajorBrand() {
        return this.mp4MajorBrand;
    }

    /**
     * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
     * 
     * @param mp4MajorBrand
     *        Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mp4Settings withMp4MajorBrand(String mp4MajorBrand) {
        setMp4MajorBrand(mp4MajorBrand);
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
        if (getAudioDuration() != null)
            sb.append("AudioDuration: ").append(getAudioDuration()).append(",");
        if (getCslgAtom() != null)
            sb.append("CslgAtom: ").append(getCslgAtom()).append(",");
        if (getCttsVersion() != null)
            sb.append("CttsVersion: ").append(getCttsVersion()).append(",");
        if (getFreeSpaceBox() != null)
            sb.append("FreeSpaceBox: ").append(getFreeSpaceBox()).append(",");
        if (getMoovPlacement() != null)
            sb.append("MoovPlacement: ").append(getMoovPlacement()).append(",");
        if (getMp4MajorBrand() != null)
            sb.append("Mp4MajorBrand: ").append(getMp4MajorBrand());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mp4Settings == false)
            return false;
        Mp4Settings other = (Mp4Settings) obj;
        if (other.getAudioDuration() == null ^ this.getAudioDuration() == null)
            return false;
        if (other.getAudioDuration() != null && other.getAudioDuration().equals(this.getAudioDuration()) == false)
            return false;
        if (other.getCslgAtom() == null ^ this.getCslgAtom() == null)
            return false;
        if (other.getCslgAtom() != null && other.getCslgAtom().equals(this.getCslgAtom()) == false)
            return false;
        if (other.getCttsVersion() == null ^ this.getCttsVersion() == null)
            return false;
        if (other.getCttsVersion() != null && other.getCttsVersion().equals(this.getCttsVersion()) == false)
            return false;
        if (other.getFreeSpaceBox() == null ^ this.getFreeSpaceBox() == null)
            return false;
        if (other.getFreeSpaceBox() != null && other.getFreeSpaceBox().equals(this.getFreeSpaceBox()) == false)
            return false;
        if (other.getMoovPlacement() == null ^ this.getMoovPlacement() == null)
            return false;
        if (other.getMoovPlacement() != null && other.getMoovPlacement().equals(this.getMoovPlacement()) == false)
            return false;
        if (other.getMp4MajorBrand() == null ^ this.getMp4MajorBrand() == null)
            return false;
        if (other.getMp4MajorBrand() != null && other.getMp4MajorBrand().equals(this.getMp4MajorBrand()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioDuration() == null) ? 0 : getAudioDuration().hashCode());
        hashCode = prime * hashCode + ((getCslgAtom() == null) ? 0 : getCslgAtom().hashCode());
        hashCode = prime * hashCode + ((getCttsVersion() == null) ? 0 : getCttsVersion().hashCode());
        hashCode = prime * hashCode + ((getFreeSpaceBox() == null) ? 0 : getFreeSpaceBox().hashCode());
        hashCode = prime * hashCode + ((getMoovPlacement() == null) ? 0 : getMoovPlacement().hashCode());
        hashCode = prime * hashCode + ((getMp4MajorBrand() == null) ? 0 : getMp4MajorBrand().hashCode());
        return hashCode;
    }

    @Override
    public Mp4Settings clone() {
        try {
            return (Mp4Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Mp4SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

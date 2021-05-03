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
 * Settings for embedded captions Source
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/EmbeddedSourceSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmbeddedSourceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     */
    private String convert608To708;
    /**
     * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for
     * passthrough.
     */
    private Integer source608ChannelNumber;
    /**
     * Specifies the video track index used for extracting captions. The system only supports one input video track, so
     * this should always be set to '1'.
     */
    private Integer source608TrackNumber;
    /**
     * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to
     * continue onto your next input, disable this setting.
     */
    private String terminateCaptions;

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     * 
     * @param convert608To708
     *        Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you
     *        choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data
     *        through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data
     *        into 708.
     * @see EmbeddedConvert608To708
     */

    public void setConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     * 
     * @return Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you
     *         choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data
     *         through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data
     *         into 708.
     * @see EmbeddedConvert608To708
     */

    public String getConvert608To708() {
        return this.convert608To708;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     * 
     * @param convert608To708
     *        Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you
     *        choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data
     *        through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data
     *        into 708.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmbeddedConvert608To708
     */

    public EmbeddedSourceSettings withConvert608To708(String convert608To708) {
        setConvert608To708(convert608To708);
        return this;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     * 
     * @param convert608To708
     *        Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you
     *        choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data
     *        through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data
     *        into 708.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmbeddedConvert608To708
     */

    public EmbeddedSourceSettings withConvert608To708(EmbeddedConvert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
        return this;
    }

    /**
     * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for
     * passthrough.
     * 
     * @param source608ChannelNumber
     *        Specifies the 608/708 channel number within the video track from which to extract captions. Unused for
     *        passthrough.
     */

    public void setSource608ChannelNumber(Integer source608ChannelNumber) {
        this.source608ChannelNumber = source608ChannelNumber;
    }

    /**
     * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for
     * passthrough.
     * 
     * @return Specifies the 608/708 channel number within the video track from which to extract captions. Unused for
     *         passthrough.
     */

    public Integer getSource608ChannelNumber() {
        return this.source608ChannelNumber;
    }

    /**
     * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for
     * passthrough.
     * 
     * @param source608ChannelNumber
     *        Specifies the 608/708 channel number within the video track from which to extract captions. Unused for
     *        passthrough.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmbeddedSourceSettings withSource608ChannelNumber(Integer source608ChannelNumber) {
        setSource608ChannelNumber(source608ChannelNumber);
        return this;
    }

    /**
     * Specifies the video track index used for extracting captions. The system only supports one input video track, so
     * this should always be set to '1'.
     * 
     * @param source608TrackNumber
     *        Specifies the video track index used for extracting captions. The system only supports one input video
     *        track, so this should always be set to '1'.
     */

    public void setSource608TrackNumber(Integer source608TrackNumber) {
        this.source608TrackNumber = source608TrackNumber;
    }

    /**
     * Specifies the video track index used for extracting captions. The system only supports one input video track, so
     * this should always be set to '1'.
     * 
     * @return Specifies the video track index used for extracting captions. The system only supports one input video
     *         track, so this should always be set to '1'.
     */

    public Integer getSource608TrackNumber() {
        return this.source608TrackNumber;
    }

    /**
     * Specifies the video track index used for extracting captions. The system only supports one input video track, so
     * this should always be set to '1'.
     * 
     * @param source608TrackNumber
     *        Specifies the video track index used for extracting captions. The system only supports one input video
     *        track, so this should always be set to '1'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmbeddedSourceSettings withSource608TrackNumber(Integer source608TrackNumber) {
        setSource608TrackNumber(source608TrackNumber);
        return this;
    }

    /**
     * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to
     * continue onto your next input, disable this setting.
     * 
     * @param terminateCaptions
     *        By default, the service terminates any unterminated captions at the end of each input. If you want the
     *        caption to continue onto your next input, disable this setting.
     * @see EmbeddedTerminateCaptions
     */

    public void setTerminateCaptions(String terminateCaptions) {
        this.terminateCaptions = terminateCaptions;
    }

    /**
     * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to
     * continue onto your next input, disable this setting.
     * 
     * @return By default, the service terminates any unterminated captions at the end of each input. If you want the
     *         caption to continue onto your next input, disable this setting.
     * @see EmbeddedTerminateCaptions
     */

    public String getTerminateCaptions() {
        return this.terminateCaptions;
    }

    /**
     * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to
     * continue onto your next input, disable this setting.
     * 
     * @param terminateCaptions
     *        By default, the service terminates any unterminated captions at the end of each input. If you want the
     *        caption to continue onto your next input, disable this setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmbeddedTerminateCaptions
     */

    public EmbeddedSourceSettings withTerminateCaptions(String terminateCaptions) {
        setTerminateCaptions(terminateCaptions);
        return this;
    }

    /**
     * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to
     * continue onto your next input, disable this setting.
     * 
     * @param terminateCaptions
     *        By default, the service terminates any unterminated captions at the end of each input. If you want the
     *        caption to continue onto your next input, disable this setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmbeddedTerminateCaptions
     */

    public EmbeddedSourceSettings withTerminateCaptions(EmbeddedTerminateCaptions terminateCaptions) {
        this.terminateCaptions = terminateCaptions.toString();
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
        if (getConvert608To708() != null)
            sb.append("Convert608To708: ").append(getConvert608To708()).append(",");
        if (getSource608ChannelNumber() != null)
            sb.append("Source608ChannelNumber: ").append(getSource608ChannelNumber()).append(",");
        if (getSource608TrackNumber() != null)
            sb.append("Source608TrackNumber: ").append(getSource608TrackNumber()).append(",");
        if (getTerminateCaptions() != null)
            sb.append("TerminateCaptions: ").append(getTerminateCaptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmbeddedSourceSettings == false)
            return false;
        EmbeddedSourceSettings other = (EmbeddedSourceSettings) obj;
        if (other.getConvert608To708() == null ^ this.getConvert608To708() == null)
            return false;
        if (other.getConvert608To708() != null && other.getConvert608To708().equals(this.getConvert608To708()) == false)
            return false;
        if (other.getSource608ChannelNumber() == null ^ this.getSource608ChannelNumber() == null)
            return false;
        if (other.getSource608ChannelNumber() != null && other.getSource608ChannelNumber().equals(this.getSource608ChannelNumber()) == false)
            return false;
        if (other.getSource608TrackNumber() == null ^ this.getSource608TrackNumber() == null)
            return false;
        if (other.getSource608TrackNumber() != null && other.getSource608TrackNumber().equals(this.getSource608TrackNumber()) == false)
            return false;
        if (other.getTerminateCaptions() == null ^ this.getTerminateCaptions() == null)
            return false;
        if (other.getTerminateCaptions() != null && other.getTerminateCaptions().equals(this.getTerminateCaptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConvert608To708() == null) ? 0 : getConvert608To708().hashCode());
        hashCode = prime * hashCode + ((getSource608ChannelNumber() == null) ? 0 : getSource608ChannelNumber().hashCode());
        hashCode = prime * hashCode + ((getSource608TrackNumber() == null) ? 0 : getSource608TrackNumber().hashCode());
        hashCode = prime * hashCode + ((getTerminateCaptions() == null) ? 0 : getTerminateCaptions().hashCode());
        return hashCode;
    }

    @Override
    public EmbeddedSourceSettings clone() {
        try {
            return (EmbeddedSourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.EmbeddedSourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

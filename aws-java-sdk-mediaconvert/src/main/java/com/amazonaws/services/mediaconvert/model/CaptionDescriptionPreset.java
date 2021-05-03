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
 * Caption Description for preset
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CaptionDescriptionPreset"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDescriptionPreset implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the language for this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information when automatically selecting the font script for rendering the captions
     * text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any
     * other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output
     * groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     */
    private String customLanguageCode;
    /**
     * Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of captions
     * DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab corresponds to
     * one output captions track. Depending on your output captions format, one tab might correspond to a set of output
     * captions tracks. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
     */
    private CaptionDestinationSettings destinationSettings;
    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     */
    private String languageCode;
    /**
     * Specify a label for this set of output captions. For example, "English", "Director commentary", or "track_2". For
     * streaming outputs, MediaConvert passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     */
    private String languageDescription;

    /**
     * Specify the language for this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information when automatically selecting the font script for rendering the captions
     * text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any
     * other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output
     * groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     * 
     * @param customLanguageCode
     *        Specify the language for this captions output track. For most captions output formats, the encoder puts
     *        this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *        Burn in, the encoder uses this language information when automatically selecting the font script for
     *        rendering the captions text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming
     *        outputs, you can also use any other code in the full RFC-5646 specification. Streaming outputs are those
     *        that are in one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     */

    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * Specify the language for this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information when automatically selecting the font script for rendering the captions
     * text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any
     * other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output
     * groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     * 
     * @return Specify the language for this captions output track. For most captions output formats, the encoder puts
     *         this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *         Burn in, the encoder uses this language information when automatically selecting the font script for
     *         rendering the captions text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming
     *         outputs, you can also use any other code in the full RFC-5646 specification. Streaming outputs are those
     *         that are in one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     */

    public String getCustomLanguageCode() {
        return this.customLanguageCode;
    }

    /**
     * Specify the language for this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information when automatically selecting the font script for rendering the captions
     * text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any
     * other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output
     * groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     * 
     * @param customLanguageCode
     *        Specify the language for this captions output track. For most captions output formats, the encoder puts
     *        this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *        Burn in, the encoder uses this language information when automatically selecting the font script for
     *        rendering the captions text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming
     *        outputs, you can also use any other code in the full RFC-5646 specification. Streaming outputs are those
     *        that are in one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescriptionPreset withCustomLanguageCode(String customLanguageCode) {
        setCustomLanguageCode(customLanguageCode);
        return this;
    }

    /**
     * Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of captions
     * DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab corresponds to
     * one output captions track. Depending on your output captions format, one tab might correspond to a set of output
     * captions tracks. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
     * 
     * @param destinationSettings
     *        Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of
     *        captions DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab
     *        corresponds to one output captions track. Depending on your output captions format, one tab might
     *        correspond to a set of output captions tracks. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
     */

    public void setDestinationSettings(CaptionDestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of captions
     * DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab corresponds to
     * one output captions track. Depending on your output captions format, one tab might correspond to a set of output
     * captions tracks. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
     * 
     * @return Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of
     *         captions DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab
     *         corresponds to one output captions track. Depending on your output captions format, one tab might
     *         correspond to a set of output captions tracks. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
     */

    public CaptionDestinationSettings getDestinationSettings() {
        return this.destinationSettings;
    }

    /**
     * Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of captions
     * DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab corresponds to
     * one output captions track. Depending on your output captions format, one tab might correspond to a set of output
     * captions tracks. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
     * 
     * @param destinationSettings
     *        Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of
     *        captions DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab
     *        corresponds to one output captions track. Depending on your output captions format, one tab might
     *        correspond to a set of output captions tracks. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescriptionPreset withDestinationSettings(CaptionDestinationSettings destinationSettings) {
        setDestinationSettings(destinationSettings);
        return this;
    }

    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     * 
     * @param languageCode
     *        Specify the language of this captions output track. For most captions output formats, the encoder puts
     *        this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *        Burn in, the encoder uses this language information to choose the font language for rendering the captions
     *        text.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     * 
     * @return Specify the language of this captions output track. For most captions output formats, the encoder puts
     *         this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *         Burn in, the encoder uses this language information to choose the font language for rendering the
     *         captions text.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     * 
     * @param languageCode
     *        Specify the language of this captions output track. For most captions output formats, the encoder puts
     *        this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *        Burn in, the encoder uses this language information to choose the font language for rendering the captions
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CaptionDescriptionPreset withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     * 
     * @param languageCode
     *        Specify the language of this captions output track. For most captions output formats, the encoder puts
     *        this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *        Burn in, the encoder uses this language information to choose the font language for rendering the captions
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CaptionDescriptionPreset withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Specify a label for this set of output captions. For example, "English", "Director commentary", or "track_2". For
     * streaming outputs, MediaConvert passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     * 
     * @param languageDescription
     *        Specify a label for this set of output captions. For example, "English", "Director commentary", or
     *        "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for
     *        display on the end-viewer's player device. For outputs in other output groups, the service ignores this
     *        setting.
     */

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Specify a label for this set of output captions. For example, "English", "Director commentary", or "track_2". For
     * streaming outputs, MediaConvert passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     * 
     * @return Specify a label for this set of output captions. For example, "English", "Director commentary", or
     *         "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for
     *         display on the end-viewer's player device. For outputs in other output groups, the service ignores this
     *         setting.
     */

    public String getLanguageDescription() {
        return this.languageDescription;
    }

    /**
     * Specify a label for this set of output captions. For example, "English", "Director commentary", or "track_2". For
     * streaming outputs, MediaConvert passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     * 
     * @param languageDescription
     *        Specify a label for this set of output captions. For example, "English", "Director commentary", or
     *        "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for
     *        display on the end-viewer's player device. For outputs in other output groups, the service ignores this
     *        setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescriptionPreset withLanguageDescription(String languageDescription) {
        setLanguageDescription(languageDescription);
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
        if (getCustomLanguageCode() != null)
            sb.append("CustomLanguageCode: ").append(getCustomLanguageCode()).append(",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: ").append(getLanguageDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionDescriptionPreset == false)
            return false;
        CaptionDescriptionPreset other = (CaptionDescriptionPreset) obj;
        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageDescription() == null ^ this.getLanguageDescription() == null)
            return false;
        if (other.getLanguageDescription() != null && other.getLanguageDescription().equals(this.getLanguageDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomLanguageCode() == null) ? 0 : getCustomLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        return hashCode;
    }

    @Override
    public CaptionDescriptionPreset clone() {
        try {
            return (CaptionDescriptionPreset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CaptionDescriptionPresetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

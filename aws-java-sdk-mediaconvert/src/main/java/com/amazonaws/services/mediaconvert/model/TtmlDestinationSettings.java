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
 * Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate from the
 * video container. Set up sidecar captions in the same output group, but different output from your video. For more
 * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you
 * work directly in your JSON job specification, include this object and any required children when you set
 * destinationType to TTML.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TtmlDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TtmlDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the TTML
     * output.
     */
    private String stylePassthrough;

    /**
     * Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the TTML
     * output.
     * 
     * @param stylePassthrough
     *        Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the
     *        TTML output.
     * @see TtmlStylePassthrough
     */

    public void setStylePassthrough(String stylePassthrough) {
        this.stylePassthrough = stylePassthrough;
    }

    /**
     * Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the TTML
     * output.
     * 
     * @return Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the
     *         TTML output.
     * @see TtmlStylePassthrough
     */

    public String getStylePassthrough() {
        return this.stylePassthrough;
    }

    /**
     * Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the TTML
     * output.
     * 
     * @param stylePassthrough
     *        Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the
     *        TTML output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TtmlStylePassthrough
     */

    public TtmlDestinationSettings withStylePassthrough(String stylePassthrough) {
        setStylePassthrough(stylePassthrough);
        return this;
    }

    /**
     * Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the TTML
     * output.
     * 
     * @param stylePassthrough
     *        Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the
     *        TTML output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TtmlStylePassthrough
     */

    public TtmlDestinationSettings withStylePassthrough(TtmlStylePassthrough stylePassthrough) {
        this.stylePassthrough = stylePassthrough.toString();
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
        if (getStylePassthrough() != null)
            sb.append("StylePassthrough: ").append(getStylePassthrough());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TtmlDestinationSettings == false)
            return false;
        TtmlDestinationSettings other = (TtmlDestinationSettings) obj;
        if (other.getStylePassthrough() == null ^ this.getStylePassthrough() == null)
            return false;
        if (other.getStylePassthrough() != null && other.getStylePassthrough().equals(this.getStylePassthrough()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStylePassthrough() == null) ? 0 : getStylePassthrough().hashCode());
        return hashCode;
    }

    @Override
    public TtmlDestinationSettings clone() {
        try {
            return (TtmlDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.TtmlDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

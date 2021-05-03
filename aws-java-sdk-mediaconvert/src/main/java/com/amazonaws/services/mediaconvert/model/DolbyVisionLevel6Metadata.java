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
 * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in your
 * input with new values.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DolbyVisionLevel6Metadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DolbyVisionLevel6Metadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream.
     * Measured in nits.
     */
    private Integer maxCll;
    /**
     * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness
     * in the entire stream. Measured in nits.
     */
    private Integer maxFall;

    /**
     * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream.
     * Measured in nits.
     * 
     * @param maxCll
     *        Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire
     *        stream. Measured in nits.
     */

    public void setMaxCll(Integer maxCll) {
        this.maxCll = maxCll;
    }

    /**
     * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream.
     * Measured in nits.
     * 
     * @return Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire
     *         stream. Measured in nits.
     */

    public Integer getMaxCll() {
        return this.maxCll;
    }

    /**
     * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream.
     * Measured in nits.
     * 
     * @param maxCll
     *        Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire
     *        stream. Measured in nits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DolbyVisionLevel6Metadata withMaxCll(Integer maxCll) {
        setMaxCll(maxCll);
        return this;
    }

    /**
     * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness
     * in the entire stream. Measured in nits.
     * 
     * @param maxFall
     *        Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average
     *        brightness in the entire stream. Measured in nits.
     */

    public void setMaxFall(Integer maxFall) {
        this.maxFall = maxFall;
    }

    /**
     * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness
     * in the entire stream. Measured in nits.
     * 
     * @return Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average
     *         brightness in the entire stream. Measured in nits.
     */

    public Integer getMaxFall() {
        return this.maxFall;
    }

    /**
     * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness
     * in the entire stream. Measured in nits.
     * 
     * @param maxFall
     *        Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average
     *        brightness in the entire stream. Measured in nits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DolbyVisionLevel6Metadata withMaxFall(Integer maxFall) {
        setMaxFall(maxFall);
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
        if (getMaxCll() != null)
            sb.append("MaxCll: ").append(getMaxCll()).append(",");
        if (getMaxFall() != null)
            sb.append("MaxFall: ").append(getMaxFall());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DolbyVisionLevel6Metadata == false)
            return false;
        DolbyVisionLevel6Metadata other = (DolbyVisionLevel6Metadata) obj;
        if (other.getMaxCll() == null ^ this.getMaxCll() == null)
            return false;
        if (other.getMaxCll() != null && other.getMaxCll().equals(this.getMaxCll()) == false)
            return false;
        if (other.getMaxFall() == null ^ this.getMaxFall() == null)
            return false;
        if (other.getMaxFall() != null && other.getMaxFall().equals(this.getMaxFall()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxCll() == null) ? 0 : getMaxCll().hashCode());
        hashCode = prime * hashCode + ((getMaxFall() == null) ? 0 : getMaxFall().hashCode());
        return hashCode;
    }

    @Override
    public DolbyVisionLevel6Metadata clone() {
        try {
            return (DolbyVisionLevel6Metadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DolbyVisionLevel6MetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

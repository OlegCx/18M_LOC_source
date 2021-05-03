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
 * Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate control mode to
 * QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control
 * mode.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Av1QvbrSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Av1QvbrSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within av1Settings. Specify
     * the general target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10
     * results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and
     * 9. Optionally, to specify a value between whole numbers, also provide a value for the setting
     * qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7
     * and set qvbrQualityLevelFineTune to .33.
     */
    private Integer qvbrQualityLevel;
    /**
     * Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For example, if
     * you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     * MediaConvert rounds your QVBR quality level to the nearest third of a whole number. For example, if you set
     * qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
     */
    private Double qvbrQualityLevelFineTune;

    /**
     * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within av1Settings. Specify
     * the general target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10
     * results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and
     * 9. Optionally, to specify a value between whole numbers, also provide a value for the setting
     * qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7
     * and set qvbrQualityLevelFineTune to .33.
     * 
     * @param qvbrQualityLevel
     *        Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within av1Settings.
     *        Specify the general target quality level for this output, from 1 to 10. Use higher numbers for greater
     *        quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality
     *        transcodes is between 6 and 9. Optionally, to specify a value between whole numbers, also provide a value
     *        for the setting qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set
     *        qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     */

    public void setQvbrQualityLevel(Integer qvbrQualityLevel) {
        this.qvbrQualityLevel = qvbrQualityLevel;
    }

    /**
     * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within av1Settings. Specify
     * the general target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10
     * results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and
     * 9. Optionally, to specify a value between whole numbers, also provide a value for the setting
     * qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7
     * and set qvbrQualityLevelFineTune to .33.
     * 
     * @return Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within av1Settings.
     *         Specify the general target quality level for this output, from 1 to 10. Use higher numbers for greater
     *         quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality
     *         transcodes is between 6 and 9. Optionally, to specify a value between whole numbers, also provide a value
     *         for the setting qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33,
     *         set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     */

    public Integer getQvbrQualityLevel() {
        return this.qvbrQualityLevel;
    }

    /**
     * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within av1Settings. Specify
     * the general target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10
     * results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and
     * 9. Optionally, to specify a value between whole numbers, also provide a value for the setting
     * qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7
     * and set qvbrQualityLevelFineTune to .33.
     * 
     * @param qvbrQualityLevel
     *        Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within av1Settings.
     *        Specify the general target quality level for this output, from 1 to 10. Use higher numbers for greater
     *        quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality
     *        transcodes is between 6 and 9. Optionally, to specify a value between whole numbers, also provide a value
     *        for the setting qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set
     *        qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Av1QvbrSettings withQvbrQualityLevel(Integer qvbrQualityLevel) {
        setQvbrQualityLevel(qvbrQualityLevel);
        return this;
    }

    /**
     * Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For example, if
     * you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     * MediaConvert rounds your QVBR quality level to the nearest third of a whole number. For example, if you set
     * qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
     * 
     * @param qvbrQualityLevelFineTune
     *        Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For
     *        example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set
     *        qvbrQualityLevelFineTune to .33. MediaConvert rounds your QVBR quality level to the nearest third of a
     *        whole number. For example, if you set qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25,
     *        your actual QVBR quality level is 7.33.
     */

    public void setQvbrQualityLevelFineTune(Double qvbrQualityLevelFineTune) {
        this.qvbrQualityLevelFineTune = qvbrQualityLevelFineTune;
    }

    /**
     * Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For example, if
     * you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     * MediaConvert rounds your QVBR quality level to the nearest third of a whole number. For example, if you set
     * qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
     * 
     * @return Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For
     *         example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set
     *         qvbrQualityLevelFineTune to .33. MediaConvert rounds your QVBR quality level to the nearest third of a
     *         whole number. For example, if you set qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25,
     *         your actual QVBR quality level is 7.33.
     */

    public Double getQvbrQualityLevelFineTune() {
        return this.qvbrQualityLevelFineTune;
    }

    /**
     * Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For example, if
     * you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     * MediaConvert rounds your QVBR quality level to the nearest third of a whole number. For example, if you set
     * qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
     * 
     * @param qvbrQualityLevelFineTune
     *        Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For
     *        example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set
     *        qvbrQualityLevelFineTune to .33. MediaConvert rounds your QVBR quality level to the nearest third of a
     *        whole number. For example, if you set qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25,
     *        your actual QVBR quality level is 7.33.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Av1QvbrSettings withQvbrQualityLevelFineTune(Double qvbrQualityLevelFineTune) {
        setQvbrQualityLevelFineTune(qvbrQualityLevelFineTune);
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
        if (getQvbrQualityLevel() != null)
            sb.append("QvbrQualityLevel: ").append(getQvbrQualityLevel()).append(",");
        if (getQvbrQualityLevelFineTune() != null)
            sb.append("QvbrQualityLevelFineTune: ").append(getQvbrQualityLevelFineTune());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Av1QvbrSettings == false)
            return false;
        Av1QvbrSettings other = (Av1QvbrSettings) obj;
        if (other.getQvbrQualityLevel() == null ^ this.getQvbrQualityLevel() == null)
            return false;
        if (other.getQvbrQualityLevel() != null && other.getQvbrQualityLevel().equals(this.getQvbrQualityLevel()) == false)
            return false;
        if (other.getQvbrQualityLevelFineTune() == null ^ this.getQvbrQualityLevelFineTune() == null)
            return false;
        if (other.getQvbrQualityLevelFineTune() != null && other.getQvbrQualityLevelFineTune().equals(this.getQvbrQualityLevelFineTune()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQvbrQualityLevel() == null) ? 0 : getQvbrQualityLevel().hashCode());
        hashCode = prime * hashCode + ((getQvbrQualityLevelFineTune() == null) ? 0 : getQvbrQualityLevelFineTune().hashCode());
        return hashCode;
    }

    @Override
    public Av1QvbrSettings clone() {
        try {
            return (Av1QvbrSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Av1QvbrSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

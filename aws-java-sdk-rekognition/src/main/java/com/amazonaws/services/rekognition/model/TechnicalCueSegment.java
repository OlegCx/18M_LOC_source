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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a technical cue segment. For more information, see <a>SegmentDetection</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TechnicalCueSegment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * 
     * @param type
     *        The type of the technical cue.
     * @see TechnicalCueType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * 
     * @return The type of the technical cue.
     * @see TechnicalCueType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * 
     * @param type
     *        The type of the technical cue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TechnicalCueType
     */

    public TechnicalCueSegment withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * 
     * @param type
     *        The type of the technical cue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TechnicalCueType
     */

    public TechnicalCueSegment withType(TechnicalCueType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
     * </p>
     * 
     * @return The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TechnicalCueSegment withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TechnicalCueSegment == false)
            return false;
        TechnicalCueSegment other = (TechnicalCueSegment) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public TechnicalCueSegment clone() {
        try {
            return (TechnicalCueSegment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.TechnicalCueSegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

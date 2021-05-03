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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteDetectorModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDetectorModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the detector model to be deleted.
     * </p>
     */
    private String detectorModelName;

    /**
     * <p>
     * The name of the detector model to be deleted.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model to be deleted.
     */

    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model to be deleted.
     * </p>
     * 
     * @return The name of the detector model to be deleted.
     */

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model to be deleted.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDetectorModelRequest withDetectorModelName(String detectorModelName) {
        setDetectorModelName(detectorModelName);
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
        if (getDetectorModelName() != null)
            sb.append("DetectorModelName: ").append(getDetectorModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDetectorModelRequest == false)
            return false;
        DeleteDetectorModelRequest other = (DeleteDetectorModelRequest) obj;
        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDetectorModelRequest clone() {
        return (DeleteDetectorModelRequest) super.clone();
    }

}

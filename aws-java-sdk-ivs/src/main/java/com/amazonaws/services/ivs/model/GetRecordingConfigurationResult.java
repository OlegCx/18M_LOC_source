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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetRecordingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecordingConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private RecordingConfiguration recordingConfiguration;

    /**
     * @param recordingConfiguration
     */

    public void setRecordingConfiguration(RecordingConfiguration recordingConfiguration) {
        this.recordingConfiguration = recordingConfiguration;
    }

    /**
     * @return
     */

    public RecordingConfiguration getRecordingConfiguration() {
        return this.recordingConfiguration;
    }

    /**
     * @param recordingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordingConfigurationResult withRecordingConfiguration(RecordingConfiguration recordingConfiguration) {
        setRecordingConfiguration(recordingConfiguration);
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
        if (getRecordingConfiguration() != null)
            sb.append("RecordingConfiguration: ").append(getRecordingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecordingConfigurationResult == false)
            return false;
        GetRecordingConfigurationResult other = (GetRecordingConfigurationResult) obj;
        if (other.getRecordingConfiguration() == null ^ this.getRecordingConfiguration() == null)
            return false;
        if (other.getRecordingConfiguration() != null && other.getRecordingConfiguration().equals(this.getRecordingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordingConfiguration() == null) ? 0 : getRecordingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetRecordingConfigurationResult clone() {
        try {
            return (GetRecordingConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.costandusagereport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * If the action is successful, the service sends back an HTTP 200 response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DeleteReportDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReportDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String responseMessage;

    /**
     * @param responseMessage
     */

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    /**
     * @return
     */

    public String getResponseMessage() {
        return this.responseMessage;
    }

    /**
     * @param responseMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReportDefinitionResult withResponseMessage(String responseMessage) {
        setResponseMessage(responseMessage);
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
        if (getResponseMessage() != null)
            sb.append("ResponseMessage: ").append(getResponseMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReportDefinitionResult == false)
            return false;
        DeleteReportDefinitionResult other = (DeleteReportDefinitionResult) obj;
        if (other.getResponseMessage() == null ^ this.getResponseMessage() == null)
            return false;
        if (other.getResponseMessage() != null && other.getResponseMessage().equals(this.getResponseMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponseMessage() == null) ? 0 : getResponseMessage().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReportDefinitionResult clone() {
        try {
            return (DeleteReportDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

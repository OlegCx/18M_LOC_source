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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetSerialConsoleAccessStatusRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSerialConsoleAccessStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetSerialConsoleAccessStatusRequest> {

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetSerialConsoleAccessStatusRequest> getDryRunRequest() {
        Request<GetSerialConsoleAccessStatusRequest> request = new GetSerialConsoleAccessStatusRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSerialConsoleAccessStatusRequest == false)
            return false;
        GetSerialConsoleAccessStatusRequest other = (GetSerialConsoleAccessStatusRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public GetSerialConsoleAccessStatusRequest clone() {
        return (GetSerialConsoleAccessStatusRequest) super.clone();
    }
}

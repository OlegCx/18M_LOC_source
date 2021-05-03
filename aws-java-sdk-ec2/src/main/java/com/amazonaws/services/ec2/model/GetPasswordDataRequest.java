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
import com.amazonaws.services.ec2.model.transform.GetPasswordDataRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPasswordDataRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<GetPasswordDataRequest> {

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     */
    private String instanceId;

    /**
     * Default constructor for GetPasswordDataRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public GetPasswordDataRequest() {
    }

    /**
     * Constructs a new GetPasswordDataRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param instanceId
     *        The ID of the Windows instance.
     */
    public GetPasswordDataRequest(String instanceId) {
        setInstanceId(instanceId);
    }

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the Windows instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     * 
     * @return The ID of the Windows instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the Windows instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPasswordDataRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetPasswordDataRequest> getDryRunRequest() {
        Request<GetPasswordDataRequest> request = new GetPasswordDataRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPasswordDataRequest == false)
            return false;
        GetPasswordDataRequest other = (GetPasswordDataRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public GetPasswordDataRequest clone() {
        return (GetPasswordDataRequest) super.clone();
    }
}

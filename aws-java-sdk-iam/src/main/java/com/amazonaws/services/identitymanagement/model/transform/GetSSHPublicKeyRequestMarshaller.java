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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetSSHPublicKeyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSSHPublicKeyRequestMarshaller implements Marshaller<Request<GetSSHPublicKeyRequest>, GetSSHPublicKeyRequest> {

    public Request<GetSSHPublicKeyRequest> marshall(GetSSHPublicKeyRequest getSSHPublicKeyRequest) {

        if (getSSHPublicKeyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetSSHPublicKeyRequest> request = new DefaultRequest<GetSSHPublicKeyRequest>(getSSHPublicKeyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "GetSSHPublicKey");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (getSSHPublicKeyRequest.getUserName() != null) {
            request.addParameter("UserName", StringUtils.fromString(getSSHPublicKeyRequest.getUserName()));
        }

        if (getSSHPublicKeyRequest.getSSHPublicKeyId() != null) {
            request.addParameter("SSHPublicKeyId", StringUtils.fromString(getSSHPublicKeyRequest.getSSHPublicKeyId()));
        }

        if (getSSHPublicKeyRequest.getEncoding() != null) {
            request.addParameter("Encoding", StringUtils.fromString(getSSHPublicKeyRequest.getEncoding()));
        }

        return request;
    }

}

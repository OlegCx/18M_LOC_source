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
package com.amazonaws.services.config.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates one of the following errors:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks permissions to
 * perform the config:Put* action.
 * </p>
 * </li>
 * <li>
 * <p>
 * For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the function's
 * permissions.
 * </p>
 * </li>
 * <li>
 * <p>
 * For PutOrganizationConfigRule, organization config rule cannot be created because you do not have permissions to call
 * IAM <code>GetRole</code> action or create a service linked role.
 * </p>
 * </li>
 * <li>
 * <p>
 * For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because you do not
 * have permissions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * To call IAM <code>GetRole</code> action or create a service linked role.
 * </p>
 * </li>
 * <li>
 * <p>
 * To read Amazon S3 bucket.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsufficientPermissionsException extends com.amazonaws.services.config.model.AmazonConfigException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InsufficientPermissionsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InsufficientPermissionsException(String message) {
        super(message);
    }

}

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

/**
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT-Data enables secure, bi-directional communication between Internet-connected things (such as sensors,
 * actuators, embedded devices, or smart appliances) and the AWS cloud. It implements a broker for applications and
 * things to publish messages over HTTP (Publish) and retrieve, update, and delete shadows. A shadow is a persistent
 * representation of your things and their state in the AWS cloud.
 * </p>
 * <p>
 * Find the endpoint address for actions in the AWS IoT data plane by running this CLI command:
 * </p>
 * <p>
 * <code>aws iot describe-endpoint --endpoint-type iot:Data-ATS</code>
 * </p>
 * <p>
 * The service name used by <a href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">AWS
 * Signature Version 4</a> to sign requests is: <i>iotdevicegateway</i>.
 * </p>
 */
package com.amazonaws.services.iotdata;


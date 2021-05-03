/*
 * Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3;

import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;

/**
 * @deprecated This feature is in maintenance mode, no new updates will be released.
 * Please see https://docs.aws.amazon.com/general/latest/gr/aws_sdk_cryptography.html for more information.
 */
@Deprecated
abstract class AmazonS3EncryptionClientParams extends AmazonS3ClientParams {
    abstract EncryptionMaterialsProvider getEncryptionMaterials();
    abstract CryptoConfiguration getCryptoConfiguration();
    abstract AWSKMS getKmsClient();
}

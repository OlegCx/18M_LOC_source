/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request object for checking if the bucket exists and the user has access to
 * the given bucket.
 */
public class HeadBucketRequest extends AmazonWebServiceRequest implements Serializable, ExpectedBucketOwnerRequest {

    private String bucketName;
    private String expectedBucketOwner;

    public String getExpectedBucketOwner() {
        return expectedBucketOwner;
    }

    public HeadBucketRequest withExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
        return this;
    }

    public void setExpectedBucketOwner(String expectedBucketOwner) {
        withExpectedBucketOwner(expectedBucketOwner);
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

    public HeadBucketRequest(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeadBucketRequest == false){
            return false;
        }
        HeadBucketRequest other = (HeadBucketRequest)obj;
        if(other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && !other.getBucketName().equals(this.getBucketName()))
            return false;
        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        return hashCode;
    }
}

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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of CancelBundleTask.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelBundleTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the bundle task.
     * </p>
     */
    private BundleTask bundleTask;

    /**
     * <p>
     * Information about the bundle task.
     * </p>
     * 
     * @param bundleTask
     *        Information about the bundle task.
     */

    public void setBundleTask(BundleTask bundleTask) {
        this.bundleTask = bundleTask;
    }

    /**
     * <p>
     * Information about the bundle task.
     * </p>
     * 
     * @return Information about the bundle task.
     */

    public BundleTask getBundleTask() {
        return this.bundleTask;
    }

    /**
     * <p>
     * Information about the bundle task.
     * </p>
     * 
     * @param bundleTask
     *        Information about the bundle task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelBundleTaskResult withBundleTask(BundleTask bundleTask) {
        setBundleTask(bundleTask);
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
        if (getBundleTask() != null)
            sb.append("BundleTask: ").append(getBundleTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelBundleTaskResult == false)
            return false;
        CancelBundleTaskResult other = (CancelBundleTaskResult) obj;
        if (other.getBundleTask() == null ^ this.getBundleTask() == null)
            return false;
        if (other.getBundleTask() != null && other.getBundleTask().equals(this.getBundleTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleTask() == null) ? 0 : getBundleTask().hashCode());
        return hashCode;
    }

    @Override
    public CancelBundleTaskResult clone() {
        try {
            return (CancelBundleTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingListener"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomRoutingListenerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The listener that you've created for a custom routing accelerator.
     * </p>
     */
    private CustomRoutingListener listener;

    /**
     * <p>
     * The listener that you've created for a custom routing accelerator.
     * </p>
     * 
     * @param listener
     *        The listener that you've created for a custom routing accelerator.
     */

    public void setListener(CustomRoutingListener listener) {
        this.listener = listener;
    }

    /**
     * <p>
     * The listener that you've created for a custom routing accelerator.
     * </p>
     * 
     * @return The listener that you've created for a custom routing accelerator.
     */

    public CustomRoutingListener getListener() {
        return this.listener;
    }

    /**
     * <p>
     * The listener that you've created for a custom routing accelerator.
     * </p>
     * 
     * @param listener
     *        The listener that you've created for a custom routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingListenerResult withListener(CustomRoutingListener listener) {
        setListener(listener);
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
        if (getListener() != null)
            sb.append("Listener: ").append(getListener());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomRoutingListenerResult == false)
            return false;
        CreateCustomRoutingListenerResult other = (CreateCustomRoutingListenerResult) obj;
        if (other.getListener() == null ^ this.getListener() == null)
            return false;
        if (other.getListener() != null && other.getListener().equals(this.getListener()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListener() == null) ? 0 : getListener().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomRoutingListenerResult clone() {
        try {
            return (CreateCustomRoutingListenerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

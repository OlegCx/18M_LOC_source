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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilderStreamingURL"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageBuilderStreamingURLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image builder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The
     * default is 3600 seconds.
     * </p>
     */
    private Long validity;

    /**
     * <p>
     * The name of the image builder.
     * </p>
     * 
     * @param name
     *        The name of the image builder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image builder.
     * </p>
     * 
     * @return The name of the image builder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image builder.
     * </p>
     * 
     * @param name
     *        The name of the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderStreamingURLRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The
     * default is 3600 seconds.
     * </p>
     * 
     * @param validity
     *        The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds.
     *        The default is 3600 seconds.
     */

    public void setValidity(Long validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The
     * default is 3600 seconds.
     * </p>
     * 
     * @return The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds.
     *         The default is 3600 seconds.
     */

    public Long getValidity() {
        return this.validity;
    }

    /**
     * <p>
     * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The
     * default is 3600 seconds.
     * </p>
     * 
     * @param validity
     *        The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds.
     *        The default is 3600 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderStreamingURLRequest withValidity(Long validity) {
        setValidity(validity);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValidity() != null)
            sb.append("Validity: ").append(getValidity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageBuilderStreamingURLRequest == false)
            return false;
        CreateImageBuilderStreamingURLRequest other = (CreateImageBuilderStreamingURLRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageBuilderStreamingURLRequest clone() {
        return (CreateImageBuilderStreamingURLRequest) super.clone();
    }

}

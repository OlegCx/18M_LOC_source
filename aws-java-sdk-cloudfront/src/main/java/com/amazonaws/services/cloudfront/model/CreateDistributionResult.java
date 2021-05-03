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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDistributionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The distribution's information.
     * </p>
     */
    private Distribution distribution;
    /**
     * <p>
     * The fully qualified URI of the new distribution resource just created.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The current version of the distribution created.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The distribution's information.
     * </p>
     * 
     * @param distribution
     *        The distribution's information.
     */

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    /**
     * <p>
     * The distribution's information.
     * </p>
     * 
     * @return The distribution's information.
     */

    public Distribution getDistribution() {
        return this.distribution;
    }

    /**
     * <p>
     * The distribution's information.
     * </p>
     * 
     * @param distribution
     *        The distribution's information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionResult withDistribution(Distribution distribution) {
        setDistribution(distribution);
        return this;
    }

    /**
     * <p>
     * The fully qualified URI of the new distribution resource just created.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the new distribution resource just created.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fully qualified URI of the new distribution resource just created.
     * </p>
     * 
     * @return The fully qualified URI of the new distribution resource just created.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fully qualified URI of the new distribution resource just created.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the new distribution resource just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The current version of the distribution created.
     * </p>
     * 
     * @param eTag
     *        The current version of the distribution created.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the distribution created.
     * </p>
     * 
     * @return The current version of the distribution created.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the distribution created.
     * </p>
     * 
     * @param eTag
     *        The current version of the distribution created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionResult withETag(String eTag) {
        setETag(eTag);
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
        if (getDistribution() != null)
            sb.append("Distribution: ").append(getDistribution()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDistributionResult == false)
            return false;
        CreateDistributionResult other = (CreateDistributionResult) obj;
        if (other.getDistribution() == null ^ this.getDistribution() == null)
            return false;
        if (other.getDistribution() != null && other.getDistribution().equals(this.getDistribution()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistribution() == null) ? 0 : getDistribution().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public CreateDistributionResult clone() {
        try {
            return (CreateDistributionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

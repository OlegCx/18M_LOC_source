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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateTagOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTagOptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the TagOption.
     * </p>
     */
    private TagOptionDetail tagOptionDetail;

    /**
     * <p>
     * Information about the TagOption.
     * </p>
     * 
     * @param tagOptionDetail
     *        Information about the TagOption.
     */

    public void setTagOptionDetail(TagOptionDetail tagOptionDetail) {
        this.tagOptionDetail = tagOptionDetail;
    }

    /**
     * <p>
     * Information about the TagOption.
     * </p>
     * 
     * @return Information about the TagOption.
     */

    public TagOptionDetail getTagOptionDetail() {
        return this.tagOptionDetail;
    }

    /**
     * <p>
     * Information about the TagOption.
     * </p>
     * 
     * @param tagOptionDetail
     *        Information about the TagOption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagOptionResult withTagOptionDetail(TagOptionDetail tagOptionDetail) {
        setTagOptionDetail(tagOptionDetail);
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
        if (getTagOptionDetail() != null)
            sb.append("TagOptionDetail: ").append(getTagOptionDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTagOptionResult == false)
            return false;
        UpdateTagOptionResult other = (UpdateTagOptionResult) obj;
        if (other.getTagOptionDetail() == null ^ this.getTagOptionDetail() == null)
            return false;
        if (other.getTagOptionDetail() != null && other.getTagOptionDetail().equals(this.getTagOptionDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagOptionDetail() == null) ? 0 : getTagOptionDetail().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTagOptionResult clone() {
        try {
            return (UpdateTagOptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

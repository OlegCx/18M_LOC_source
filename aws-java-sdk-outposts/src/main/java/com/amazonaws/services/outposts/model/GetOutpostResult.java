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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOutpostResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Outpost outpost;

    /**
     * @param outpost
     */

    public void setOutpost(Outpost outpost) {
        this.outpost = outpost;
    }

    /**
     * @return
     */

    public Outpost getOutpost() {
        return this.outpost;
    }

    /**
     * @param outpost
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutpostResult withOutpost(Outpost outpost) {
        setOutpost(outpost);
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
        if (getOutpost() != null)
            sb.append("Outpost: ").append(getOutpost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOutpostResult == false)
            return false;
        GetOutpostResult other = (GetOutpostResult) obj;
        if (other.getOutpost() == null ^ this.getOutpost() == null)
            return false;
        if (other.getOutpost() != null && other.getOutpost().equals(this.getOutpost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpost() == null) ? 0 : getOutpost().hashCode());
        return hashCode;
    }

    @Override
    public GetOutpostResult clone() {
        try {
            return (GetOutpostResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

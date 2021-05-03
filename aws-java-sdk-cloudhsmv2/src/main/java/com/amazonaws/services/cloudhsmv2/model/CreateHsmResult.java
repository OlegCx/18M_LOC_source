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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHsmResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the HSM that was created.
     * </p>
     */
    private Hsm hsm;

    /**
     * <p>
     * Information about the HSM that was created.
     * </p>
     * 
     * @param hsm
     *        Information about the HSM that was created.
     */

    public void setHsm(Hsm hsm) {
        this.hsm = hsm;
    }

    /**
     * <p>
     * Information about the HSM that was created.
     * </p>
     * 
     * @return Information about the HSM that was created.
     */

    public Hsm getHsm() {
        return this.hsm;
    }

    /**
     * <p>
     * Information about the HSM that was created.
     * </p>
     * 
     * @param hsm
     *        Information about the HSM that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmResult withHsm(Hsm hsm) {
        setHsm(hsm);
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
        if (getHsm() != null)
            sb.append("Hsm: ").append(getHsm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHsmResult == false)
            return false;
        CreateHsmResult other = (CreateHsmResult) obj;
        if (other.getHsm() == null ^ this.getHsm() == null)
            return false;
        if (other.getHsm() != null && other.getHsm().equals(this.getHsm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsm() == null) ? 0 : getHsm().hashCode());
        return hashCode;
    }

    @Override
    public CreateHsmResult clone() {
        try {
            return (CreateHsmResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

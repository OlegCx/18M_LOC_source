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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnablePolicyType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnablePolicyTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that shows the root with the updated list of enabled policy types.
     * </p>
     */
    private Root root;

    /**
     * <p>
     * A structure that shows the root with the updated list of enabled policy types.
     * </p>
     * 
     * @param root
     *        A structure that shows the root with the updated list of enabled policy types.
     */

    public void setRoot(Root root) {
        this.root = root;
    }

    /**
     * <p>
     * A structure that shows the root with the updated list of enabled policy types.
     * </p>
     * 
     * @return A structure that shows the root with the updated list of enabled policy types.
     */

    public Root getRoot() {
        return this.root;
    }

    /**
     * <p>
     * A structure that shows the root with the updated list of enabled policy types.
     * </p>
     * 
     * @param root
     *        A structure that shows the root with the updated list of enabled policy types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnablePolicyTypeResult withRoot(Root root) {
        setRoot(root);
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
        if (getRoot() != null)
            sb.append("Root: ").append(getRoot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnablePolicyTypeResult == false)
            return false;
        EnablePolicyTypeResult other = (EnablePolicyTypeResult) obj;
        if (other.getRoot() == null ^ this.getRoot() == null)
            return false;
        if (other.getRoot() != null && other.getRoot().equals(this.getRoot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoot() == null) ? 0 : getRoot().hashCode());
        return hashCode;
    }

    @Override
    public EnablePolicyTypeResult clone() {
        try {
            return (EnablePolicyTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

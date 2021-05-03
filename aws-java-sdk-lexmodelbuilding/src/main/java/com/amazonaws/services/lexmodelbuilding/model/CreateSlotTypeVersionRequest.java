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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateSlotTypeVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSlotTypeVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the slot type that you want to create a new version for. The name is case sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Checksum for the <code>$LATEST</code> version of the slot type that you want to publish. If you specify a
     * checksum and the <code>$LATEST</code> version of the slot type has a different checksum, Amazon Lex returns a
     * <code>PreconditionFailedException</code> exception and doesn't publish the new version. If you don't specify a
     * checksum, Amazon Lex publishes the <code>$LATEST</code> version.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The name of the slot type that you want to create a new version for. The name is case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the slot type that you want to create a new version for. The name is case sensitive.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot type that you want to create a new version for. The name is case sensitive.
     * </p>
     * 
     * @return The name of the slot type that you want to create a new version for. The name is case sensitive.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the slot type that you want to create a new version for. The name is case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the slot type that you want to create a new version for. The name is case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeVersionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Checksum for the <code>$LATEST</code> version of the slot type that you want to publish. If you specify a
     * checksum and the <code>$LATEST</code> version of the slot type has a different checksum, Amazon Lex returns a
     * <code>PreconditionFailedException</code> exception and doesn't publish the new version. If you don't specify a
     * checksum, Amazon Lex publishes the <code>$LATEST</code> version.
     * </p>
     * 
     * @param checksum
     *        Checksum for the <code>$LATEST</code> version of the slot type that you want to publish. If you specify a
     *        checksum and the <code>$LATEST</code> version of the slot type has a different checksum, Amazon Lex
     *        returns a <code>PreconditionFailedException</code> exception and doesn't publish the new version. If you
     *        don't specify a checksum, Amazon Lex publishes the <code>$LATEST</code> version.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum for the <code>$LATEST</code> version of the slot type that you want to publish. If you specify a
     * checksum and the <code>$LATEST</code> version of the slot type has a different checksum, Amazon Lex returns a
     * <code>PreconditionFailedException</code> exception and doesn't publish the new version. If you don't specify a
     * checksum, Amazon Lex publishes the <code>$LATEST</code> version.
     * </p>
     * 
     * @return Checksum for the <code>$LATEST</code> version of the slot type that you want to publish. If you specify a
     *         checksum and the <code>$LATEST</code> version of the slot type has a different checksum, Amazon Lex
     *         returns a <code>PreconditionFailedException</code> exception and doesn't publish the new version. If you
     *         don't specify a checksum, Amazon Lex publishes the <code>$LATEST</code> version.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Checksum for the <code>$LATEST</code> version of the slot type that you want to publish. If you specify a
     * checksum and the <code>$LATEST</code> version of the slot type has a different checksum, Amazon Lex returns a
     * <code>PreconditionFailedException</code> exception and doesn't publish the new version. If you don't specify a
     * checksum, Amazon Lex publishes the <code>$LATEST</code> version.
     * </p>
     * 
     * @param checksum
     *        Checksum for the <code>$LATEST</code> version of the slot type that you want to publish. If you specify a
     *        checksum and the <code>$LATEST</code> version of the slot type has a different checksum, Amazon Lex
     *        returns a <code>PreconditionFailedException</code> exception and doesn't publish the new version. If you
     *        don't specify a checksum, Amazon Lex publishes the <code>$LATEST</code> version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeVersionRequest withChecksum(String checksum) {
        setChecksum(checksum);
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
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSlotTypeVersionRequest == false)
            return false;
        CreateSlotTypeVersionRequest other = (CreateSlotTypeVersionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        return hashCode;
    }

    @Override
    public CreateSlotTypeVersionRequest clone() {
        return (CreateSlotTypeVersionRequest) super.clone();
    }

}

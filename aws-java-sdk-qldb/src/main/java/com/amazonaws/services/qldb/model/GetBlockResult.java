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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The block data object in Amazon Ion format.
     * </p>
     */
    private ValueHolder block;
    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetBlock</code> request. A proof contains the list of
     * hash values required to recalculate the specified digest using a Merkle tree, starting with the specified block.
     * </p>
     */
    private ValueHolder proof;

    /**
     * <p>
     * The block data object in Amazon Ion format.
     * </p>
     * 
     * @param block
     *        The block data object in Amazon Ion format.
     */

    public void setBlock(ValueHolder block) {
        this.block = block;
    }

    /**
     * <p>
     * The block data object in Amazon Ion format.
     * </p>
     * 
     * @return The block data object in Amazon Ion format.
     */

    public ValueHolder getBlock() {
        return this.block;
    }

    /**
     * <p>
     * The block data object in Amazon Ion format.
     * </p>
     * 
     * @param block
     *        The block data object in Amazon Ion format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlockResult withBlock(ValueHolder block) {
        setBlock(block);
        return this;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetBlock</code> request. A proof contains the list of
     * hash values required to recalculate the specified digest using a Merkle tree, starting with the specified block.
     * </p>
     * 
     * @param proof
     *        The proof object in Amazon Ion format returned by a <code>GetBlock</code> request. A proof contains the
     *        list of hash values required to recalculate the specified digest using a Merkle tree, starting with the
     *        specified block.
     */

    public void setProof(ValueHolder proof) {
        this.proof = proof;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetBlock</code> request. A proof contains the list of
     * hash values required to recalculate the specified digest using a Merkle tree, starting with the specified block.
     * </p>
     * 
     * @return The proof object in Amazon Ion format returned by a <code>GetBlock</code> request. A proof contains the
     *         list of hash values required to recalculate the specified digest using a Merkle tree, starting with the
     *         specified block.
     */

    public ValueHolder getProof() {
        return this.proof;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetBlock</code> request. A proof contains the list of
     * hash values required to recalculate the specified digest using a Merkle tree, starting with the specified block.
     * </p>
     * 
     * @param proof
     *        The proof object in Amazon Ion format returned by a <code>GetBlock</code> request. A proof contains the
     *        list of hash values required to recalculate the specified digest using a Merkle tree, starting with the
     *        specified block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlockResult withProof(ValueHolder proof) {
        setProof(proof);
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
        if (getBlock() != null)
            sb.append("Block: ").append("***Sensitive Data Redacted***").append(",");
        if (getProof() != null)
            sb.append("Proof: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlockResult == false)
            return false;
        GetBlockResult other = (GetBlockResult) obj;
        if (other.getBlock() == null ^ this.getBlock() == null)
            return false;
        if (other.getBlock() != null && other.getBlock().equals(this.getBlock()) == false)
            return false;
        if (other.getProof() == null ^ this.getProof() == null)
            return false;
        if (other.getProof() != null && other.getProof().equals(this.getProof()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlock() == null) ? 0 : getBlock().hashCode());
        hashCode = prime * hashCode + ((getProof() == null) ? 0 : getProof().hashCode());
        return hashCode;
    }

    @Override
    public GetBlockResult clone() {
        try {
            return (GetBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

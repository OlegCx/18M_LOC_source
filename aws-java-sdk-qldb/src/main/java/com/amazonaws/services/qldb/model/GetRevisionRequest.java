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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The block location of the document revision to be verified. An address is an Amazon Ion structure that has two
     * fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * </p>
     */
    private ValueHolder blockAddress;
    /**
     * <p>
     * The unique ID of the document to be verified.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion
     * structure that has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * </p>
     */
    private ValueHolder digestTipAddress;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevisionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The block location of the document revision to be verified. An address is an Amazon Ion structure that has two
     * fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * </p>
     * 
     * @param blockAddress
     *        The block location of the document revision to be verified. An address is an Amazon Ion structure that has
     *        two fields: <code>strandId</code> and <code>sequenceNo</code>.</p>
     *        <p>
     *        For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     */

    public void setBlockAddress(ValueHolder blockAddress) {
        this.blockAddress = blockAddress;
    }

    /**
     * <p>
     * The block location of the document revision to be verified. An address is an Amazon Ion structure that has two
     * fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * </p>
     * 
     * @return The block location of the document revision to be verified. An address is an Amazon Ion structure that
     *         has two fields: <code>strandId</code> and <code>sequenceNo</code>.</p>
     *         <p>
     *         For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     */

    public ValueHolder getBlockAddress() {
        return this.blockAddress;
    }

    /**
     * <p>
     * The block location of the document revision to be verified. An address is an Amazon Ion structure that has two
     * fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * </p>
     * 
     * @param blockAddress
     *        The block location of the document revision to be verified. An address is an Amazon Ion structure that has
     *        two fields: <code>strandId</code> and <code>sequenceNo</code>.</p>
     *        <p>
     *        For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevisionRequest withBlockAddress(ValueHolder blockAddress) {
        setBlockAddress(blockAddress);
        return this;
    }

    /**
     * <p>
     * The unique ID of the document to be verified.
     * </p>
     * 
     * @param documentId
     *        The unique ID of the document to be verified.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The unique ID of the document to be verified.
     * </p>
     * 
     * @return The unique ID of the document to be verified.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The unique ID of the document to be verified.
     * </p>
     * 
     * @param documentId
     *        The unique ID of the document to be verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevisionRequest withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion
     * structure that has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * </p>
     * 
     * @param digestTipAddress
     *        The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion
     *        structure that has two fields: <code>strandId</code> and <code>sequenceNo</code>.</p>
     *        <p>
     *        For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     */

    public void setDigestTipAddress(ValueHolder digestTipAddress) {
        this.digestTipAddress = digestTipAddress;
    }

    /**
     * <p>
     * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion
     * structure that has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * </p>
     * 
     * @return The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion
     *         structure that has two fields: <code>strandId</code> and <code>sequenceNo</code>.</p>
     *         <p>
     *         For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     */

    public ValueHolder getDigestTipAddress() {
        return this.digestTipAddress;
    }

    /**
     * <p>
     * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion
     * structure that has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * </p>
     * 
     * @param digestTipAddress
     *        The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion
     *        structure that has two fields: <code>strandId</code> and <code>sequenceNo</code>.</p>
     *        <p>
     *        For example: <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevisionRequest withDigestTipAddress(ValueHolder digestTipAddress) {
        setDigestTipAddress(digestTipAddress);
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
        if (getBlockAddress() != null)
            sb.append("BlockAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getDocumentId() != null)
            sb.append("DocumentId: ").append(getDocumentId()).append(",");
        if (getDigestTipAddress() != null)
            sb.append("DigestTipAddress: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRevisionRequest == false)
            return false;
        GetRevisionRequest other = (GetRevisionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBlockAddress() == null ^ this.getBlockAddress() == null)
            return false;
        if (other.getBlockAddress() != null && other.getBlockAddress().equals(this.getBlockAddress()) == false)
            return false;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getDigestTipAddress() == null ^ this.getDigestTipAddress() == null)
            return false;
        if (other.getDigestTipAddress() != null && other.getDigestTipAddress().equals(this.getDigestTipAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBlockAddress() == null) ? 0 : getBlockAddress().hashCode());
        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getDigestTipAddress() == null) ? 0 : getDigestTipAddress().hashCode());
        return hashCode;
    }

    @Override
    public GetRevisionRequest clone() {
        return (GetRevisionRequest) super.clone();
    }

}

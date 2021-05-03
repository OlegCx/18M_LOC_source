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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about text documents indexed in an index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/TextDocumentStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextDocumentStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     */
    private Integer indexedTextDocumentsCount;
    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     */
    private Long indexedTextBytes;

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * 
     * @param indexedTextDocumentsCount
     *        The number of text documents indexed.
     */

    public void setIndexedTextDocumentsCount(Integer indexedTextDocumentsCount) {
        this.indexedTextDocumentsCount = indexedTextDocumentsCount;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * 
     * @return The number of text documents indexed.
     */

    public Integer getIndexedTextDocumentsCount() {
        return this.indexedTextDocumentsCount;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * 
     * @param indexedTextDocumentsCount
     *        The number of text documents indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextDocumentStatistics withIndexedTextDocumentsCount(Integer indexedTextDocumentsCount) {
        setIndexedTextDocumentsCount(indexedTextDocumentsCount);
        return this;
    }

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * 
     * @param indexedTextBytes
     *        The total size, in bytes, of the indexed documents.
     */

    public void setIndexedTextBytes(Long indexedTextBytes) {
        this.indexedTextBytes = indexedTextBytes;
    }

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * 
     * @return The total size, in bytes, of the indexed documents.
     */

    public Long getIndexedTextBytes() {
        return this.indexedTextBytes;
    }

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * 
     * @param indexedTextBytes
     *        The total size, in bytes, of the indexed documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextDocumentStatistics withIndexedTextBytes(Long indexedTextBytes) {
        setIndexedTextBytes(indexedTextBytes);
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
        if (getIndexedTextDocumentsCount() != null)
            sb.append("IndexedTextDocumentsCount: ").append(getIndexedTextDocumentsCount()).append(",");
        if (getIndexedTextBytes() != null)
            sb.append("IndexedTextBytes: ").append(getIndexedTextBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextDocumentStatistics == false)
            return false;
        TextDocumentStatistics other = (TextDocumentStatistics) obj;
        if (other.getIndexedTextDocumentsCount() == null ^ this.getIndexedTextDocumentsCount() == null)
            return false;
        if (other.getIndexedTextDocumentsCount() != null && other.getIndexedTextDocumentsCount().equals(this.getIndexedTextDocumentsCount()) == false)
            return false;
        if (other.getIndexedTextBytes() == null ^ this.getIndexedTextBytes() == null)
            return false;
        if (other.getIndexedTextBytes() != null && other.getIndexedTextBytes().equals(this.getIndexedTextBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexedTextDocumentsCount() == null) ? 0 : getIndexedTextDocumentsCount().hashCode());
        hashCode = prime * hashCode + ((getIndexedTextBytes() == null) ? 0 : getIndexedTextBytes().hashCode());
        return hashCode;
    }

    @Override
    public TextDocumentStatistics clone() {
        try {
            return (TextDocumentStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.TextDocumentStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

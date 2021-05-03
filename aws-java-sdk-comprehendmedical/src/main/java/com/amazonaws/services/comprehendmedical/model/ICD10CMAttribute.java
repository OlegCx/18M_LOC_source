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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The detected attributes that relate to an entity. This includes an extracted segment of the text that is an attribute
 * of an entity, or otherwise related to an entity. InferICD10CM detects the following attributes:
 * <code>Direction</code>, <code>System, Organ or Site</code>, and <code>Acuity</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ICD10CMAttribute" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ICD10CMAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an
     * attribute.
     * </p>
     */
    private Float score;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this
     * entity.
     * </p>
     */
    private Float relationshipScore;
    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response
     * rather than a global unique identifier.
     * </p>
     */
    private Integer id;
    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the
     * UTF-8 code point in the string.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     */
    private Integer endOffset;
    /**
     * <p>
     * The segment of input text which contains the detected attribute.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     * <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     */
    private java.util.List<ICD10CMTrait> traits;
    /**
     * <p>
     * The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the relationship can be either of
     * <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * </p>
     */
    private String relationshipType;

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * 
     * @param type
     *        The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * @see ICD10CMAttributeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * 
     * @return The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * @see ICD10CMAttributeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * 
     * @param type
     *        The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ICD10CMAttributeType
     */

    public ICD10CMAttribute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * 
     * @param type
     *        The type of attribute. InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ICD10CMAttributeType
     */

    public ICD10CMAttribute withType(ICD10CMAttributeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an
     * attribute.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly
     *        recognized as an attribute.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an
     * attribute.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly
     *         recognized as an attribute.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an
     * attribute.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly
     *        recognized as an attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMAttribute withScore(Float score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this
     * entity.
     * </p>
     * 
     * @param relationshipScore
     *        The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to
     *        this entity.
     */

    public void setRelationshipScore(Float relationshipScore) {
        this.relationshipScore = relationshipScore;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this
     * entity.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to
     *         this entity.
     */

    public Float getRelationshipScore() {
        return this.relationshipScore;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this
     * entity.
     * </p>
     * 
     * @param relationshipScore
     *        The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to
     *        this entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMAttribute withRelationshipScore(Float relationshipScore) {
        setRelationshipScore(relationshipScore);
        return this;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response
     * rather than a global unique identifier.
     * </p>
     * 
     * @param id
     *        The numeric identifier for this attribute. This is a monotonically increasing id unique within this
     *        response rather than a global unique identifier.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response
     * rather than a global unique identifier.
     * </p>
     * 
     * @return The numeric identifier for this attribute. This is a monotonically increasing id unique within this
     *         response rather than a global unique identifier.
     */

    public Integer getId() {
        return this.id;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response
     * rather than a global unique identifier.
     * </p>
     * 
     * @param id
     *        The numeric identifier for this attribute. This is a monotonically increasing id unique within this
     *        response rather than a global unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMAttribute withId(Integer id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the
     * UTF-8 code point in the string.
     * </p>
     * 
     * @param beginOffset
     *        The 0-based character offset in the input text that shows where the attribute begins. The offset returns
     *        the UTF-8 code point in the string.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the
     * UTF-8 code point in the string.
     * </p>
     * 
     * @return The 0-based character offset in the input text that shows where the attribute begins. The offset returns
     *         the UTF-8 code point in the string.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the
     * UTF-8 code point in the string.
     * </p>
     * 
     * @param beginOffset
     *        The 0-based character offset in the input text that shows where the attribute begins. The offset returns
     *        the UTF-8 code point in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMAttribute withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param endOffset
     *        The 0-based character offset in the input text that shows where the attribute ends. The offset returns the
     *        UTF-8 code point in the string.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @return The 0-based character offset in the input text that shows where the attribute ends. The offset returns
     *         the UTF-8 code point in the string.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param endOffset
     *        The 0-based character offset in the input text that shows where the attribute ends. The offset returns the
     *        UTF-8 code point in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMAttribute withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
        return this;
    }

    /**
     * <p>
     * The segment of input text which contains the detected attribute.
     * </p>
     * 
     * @param text
     *        The segment of input text which contains the detected attribute.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The segment of input text which contains the detected attribute.
     * </p>
     * 
     * @return The segment of input text which contains the detected attribute.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The segment of input text which contains the detected attribute.
     * </p>
     * 
     * @param text
     *        The segment of input text which contains the detected attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMAttribute withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     * <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     * 
     * @return The contextual information for the attribute. The traits recognized by InferICD10CM are
     *         <code>DIAGNOSIS</code>, <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     */

    public java.util.List<ICD10CMTrait> getTraits() {
        return traits;
    }

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     * <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     * 
     * @param traits
     *        The contextual information for the attribute. The traits recognized by InferICD10CM are
     *        <code>DIAGNOSIS</code>, <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     */

    public void setTraits(java.util.Collection<ICD10CMTrait> traits) {
        if (traits == null) {
            this.traits = null;
            return;
        }

        this.traits = new java.util.ArrayList<ICD10CMTrait>(traits);
    }

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     * <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraits(java.util.Collection)} or {@link #withTraits(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param traits
     *        The contextual information for the attribute. The traits recognized by InferICD10CM are
     *        <code>DIAGNOSIS</code>, <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMAttribute withTraits(ICD10CMTrait... traits) {
        if (this.traits == null) {
            setTraits(new java.util.ArrayList<ICD10CMTrait>(traits.length));
        }
        for (ICD10CMTrait ele : traits) {
            this.traits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     * <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     * 
     * @param traits
     *        The contextual information for the attribute. The traits recognized by InferICD10CM are
     *        <code>DIAGNOSIS</code>, <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMAttribute withTraits(java.util.Collection<ICD10CMTrait> traits) {
        setTraits(traits);
        return this;
    }

    /**
     * <p>
     * The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * </p>
     * 
     * @param category
     *        The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * @see ICD10CMEntityType
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * </p>
     * 
     * @return The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * @see ICD10CMEntityType
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * </p>
     * 
     * @param category
     *        The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ICD10CMEntityType
     */

    public ICD10CMAttribute withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * </p>
     * 
     * @param category
     *        The category of attribute. Can be either of <code>DX_NAME</code> or <code>TIME_EXPRESSION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ICD10CMEntityType
     */

    public ICD10CMAttribute withCategory(ICD10CMEntityType category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the relationship can be either of
     * <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * </p>
     * 
     * @param relationshipType
     *        The type of relationship between the entity and attribute. Type for the relationship can be either of
     *        <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * @see ICD10CMRelationshipType
     */

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the relationship can be either of
     * <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * </p>
     * 
     * @return The type of relationship between the entity and attribute. Type for the relationship can be either of
     *         <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * @see ICD10CMRelationshipType
     */

    public String getRelationshipType() {
        return this.relationshipType;
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the relationship can be either of
     * <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * </p>
     * 
     * @param relationshipType
     *        The type of relationship between the entity and attribute. Type for the relationship can be either of
     *        <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ICD10CMRelationshipType
     */

    public ICD10CMAttribute withRelationshipType(String relationshipType) {
        setRelationshipType(relationshipType);
        return this;
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the relationship can be either of
     * <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * </p>
     * 
     * @param relationshipType
     *        The type of relationship between the entity and attribute. Type for the relationship can be either of
     *        <code>OVERLAP</code> or <code>SYSTEM_ORGAN_SITE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ICD10CMRelationshipType
     */

    public ICD10CMAttribute withRelationshipType(ICD10CMRelationshipType relationshipType) {
        this.relationshipType = relationshipType.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getRelationshipScore() != null)
            sb.append("RelationshipScore: ").append(getRelationshipScore()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getTraits() != null)
            sb.append("Traits: ").append(getTraits()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getRelationshipType() != null)
            sb.append("RelationshipType: ").append(getRelationshipType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ICD10CMAttribute == false)
            return false;
        ICD10CMAttribute other = (ICD10CMAttribute) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getRelationshipScore() == null ^ this.getRelationshipScore() == null)
            return false;
        if (other.getRelationshipScore() != null && other.getRelationshipScore().equals(this.getRelationshipScore()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getTraits() == null ^ this.getTraits() == null)
            return false;
        if (other.getTraits() != null && other.getTraits().equals(this.getTraits()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getRelationshipType() == null ^ this.getRelationshipType() == null)
            return false;
        if (other.getRelationshipType() != null && other.getRelationshipType().equals(this.getRelationshipType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getRelationshipScore() == null) ? 0 : getRelationshipScore().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTraits() == null) ? 0 : getTraits().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getRelationshipType() == null) ? 0 : getRelationshipType().hashCode());
        return hashCode;
    }

    @Override
    public ICD10CMAttribute clone() {
        try {
            return (ICD10CMAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.ICD10CMAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

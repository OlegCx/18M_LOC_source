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
 * Provides information about an extracted medical entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/Entity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Entity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather
     * than a global unique identifier.
     * </p>
     */
    private Integer id;
    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8
     * code point in the string.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     */
    private Integer endOffset;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
     * </p>
     */
    private Float score;
    /**
     * <p>
     * The segment of input text extracted as this entity.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The category of the entity.
     * </p>
     */
    private String category;
    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     */
    private java.util.List<Trait> traits;
    /**
     * <p>
     * The extracted attributes that relate to this entity.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather
     * than a global unique identifier.
     * </p>
     * 
     * @param id
     *        The numeric identifier for the entity. This is a monotonically increasing id unique within this response
     *        rather than a global unique identifier.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather
     * than a global unique identifier.
     * </p>
     * 
     * @return The numeric identifier for the entity. This is a monotonically increasing id unique within this response
     *         rather than a global unique identifier.
     */

    public Integer getId() {
        return this.id;
    }

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather
     * than a global unique identifier.
     * </p>
     * 
     * @param id
     *        The numeric identifier for the entity. This is a monotonically increasing id unique within this response
     *        rather than a global unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withId(Integer id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param beginOffset
     *        The 0-based character offset in the input text that shows where the entity begins. The offset returns the
     *        UTF-8 code point in the string.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @return The 0-based character offset in the input text that shows where the entity begins. The offset returns the
     *         UTF-8 code point in the string.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param beginOffset
     *        The 0-based character offset in the input text that shows where the entity begins. The offset returns the
     *        UTF-8 code point in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param endOffset
     *        The 0-based character offset in the input text that shows where the entity ends. The offset returns the
     *        UTF-8 code point in the string.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @return The 0-based character offset in the input text that shows where the entity ends. The offset returns the
     *         UTF-8 code point in the string.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param endOffset
     *        The 0-based character offset in the input text that shows where the entity ends. The offset returns the
     *        UTF-8 code point in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withScore(Float score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The segment of input text extracted as this entity.
     * </p>
     * 
     * @param text
     *        The segment of input text extracted as this entity.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The segment of input text extracted as this entity.
     * </p>
     * 
     * @return The segment of input text extracted as this entity.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The segment of input text extracted as this entity.
     * </p>
     * 
     * @param text
     *        The segment of input text extracted as this entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The category of the entity.
     * </p>
     * 
     * @param category
     *        The category of the entity.
     * @see EntityType
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the entity.
     * </p>
     * 
     * @return The category of the entity.
     * @see EntityType
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the entity.
     * </p>
     * 
     * @param category
     *        The category of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public Entity withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of the entity.
     * </p>
     * 
     * @param category
     *        The category of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public Entity withCategory(EntityType category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * </p>
     * 
     * @param type
     *        Describes the specific type of entity with category of entities.
     * @see EntitySubType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * </p>
     * 
     * @return Describes the specific type of entity with category of entities.
     * @see EntitySubType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * </p>
     * 
     * @param type
     *        Describes the specific type of entity with category of entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitySubType
     */

    public Entity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * </p>
     * 
     * @param type
     *        Describes the specific type of entity with category of entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitySubType
     */

    public Entity withType(EntitySubType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     * 
     * @return Contextual information for the entity.
     */

    public java.util.List<Trait> getTraits() {
        return traits;
    }

    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     * 
     * @param traits
     *        Contextual information for the entity.
     */

    public void setTraits(java.util.Collection<Trait> traits) {
        if (traits == null) {
            this.traits = null;
            return;
        }

        this.traits = new java.util.ArrayList<Trait>(traits);
    }

    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraits(java.util.Collection)} or {@link #withTraits(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param traits
     *        Contextual information for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withTraits(Trait... traits) {
        if (this.traits == null) {
            setTraits(new java.util.ArrayList<Trait>(traits.length));
        }
        for (Trait ele : traits) {
            this.traits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     * 
     * @param traits
     *        Contextual information for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withTraits(java.util.Collection<Trait> traits) {
        setTraits(traits);
        return this;
    }

    /**
     * <p>
     * The extracted attributes that relate to this entity.
     * </p>
     * 
     * @return The extracted attributes that relate to this entity.
     */

    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The extracted attributes that relate to this entity.
     * </p>
     * 
     * @param attributes
     *        The extracted attributes that relate to this entity.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The extracted attributes that relate to this entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The extracted attributes that relate to this entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The extracted attributes that relate to this entity.
     * </p>
     * 
     * @param attributes
     *        The extracted attributes that relate to this entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTraits() != null)
            sb.append("Traits: ").append(getTraits()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Entity == false)
            return false;
        Entity other = (Entity) obj;
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
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTraits() == null ^ this.getTraits() == null)
            return false;
        if (other.getTraits() != null && other.getTraits().equals(this.getTraits()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTraits() == null) ? 0 : getTraits().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Entity clone() {
        try {
            return (Entity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.EntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

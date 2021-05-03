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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSlotTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the slot type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the slot type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     */
    private java.util.List<EnumerationValue> enumerationValues;
    /**
     * <p>
     * The date that the slot type was updated. When you create a resource, the creation date and last update date are
     * the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The version of the slot type.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     */
    private String valueSelectionStrategy;
    /**
     * <p>
     * The built-in slot type used as a parent for the slot type.
     * </p>
     */
    private String parentSlotTypeSignature;
    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     */
    private java.util.List<SlotTypeConfiguration> slotTypeConfigurations;

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @param name
     *        The name of the slot type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @return The name of the slot type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @param name
     *        The name of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @param description
     *        A description of the slot type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @return A description of the slot type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @param description
     *        A description of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     * 
     * @return A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     */

    public java.util.List<EnumerationValue> getEnumerationValues() {
        return enumerationValues;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     */

    public void setEnumerationValues(java.util.Collection<EnumerationValue> enumerationValues) {
        if (enumerationValues == null) {
            this.enumerationValues = null;
            return;
        }

        this.enumerationValues = new java.util.ArrayList<EnumerationValue>(enumerationValues);
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnumerationValues(java.util.Collection)} or {@link #withEnumerationValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withEnumerationValues(EnumerationValue... enumerationValues) {
        if (this.enumerationValues == null) {
            setEnumerationValues(new java.util.ArrayList<EnumerationValue>(enumerationValues.length));
        }
        for (EnumerationValue ele : enumerationValues) {
            this.enumerationValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withEnumerationValues(java.util.Collection<EnumerationValue> enumerationValues) {
        setEnumerationValues(enumerationValues);
        return this;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a resource, the creation date and last update date are
     * the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the slot type was updated. When you create a resource, the creation date and last update
     *        date are the same.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a resource, the creation date and last update date are
     * the same.
     * </p>
     * 
     * @return The date that the slot type was updated. When you create a resource, the creation date and last update
     *         date are the same.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a resource, the creation date and last update date are
     * the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the slot type was updated. When you create a resource, the creation date and last update
     *        date are the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the slot type was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     * 
     * @return The date that the slot type was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the slot type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * 
     * @param version
     *        The version of the slot type.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * 
     * @return The version of the slot type.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * 
     * @param version
     *        The version of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     * 
     * @param checksum
     *        Checksum of the <code>$LATEST</code> version of the slot type.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     * 
     * @return Checksum of the <code>$LATEST</code> version of the slot type.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     * 
     * @param checksum
     *        Checksum of the <code>$LATEST</code> version of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     *        <a>PutSlotType</a>.
     * @see SlotValueSelectionStrategy
     */

    public void setValueSelectionStrategy(String valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     * 
     * @return The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     *         <a>PutSlotType</a>.
     * @see SlotValueSelectionStrategy
     */

    public String getValueSelectionStrategy() {
        return this.valueSelectionStrategy;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     *        <a>PutSlotType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotValueSelectionStrategy
     */

    public GetSlotTypeResult withValueSelectionStrategy(String valueSelectionStrategy) {
        setValueSelectionStrategy(valueSelectionStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        The strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     *        <a>PutSlotType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotValueSelectionStrategy
     */

    public GetSlotTypeResult withValueSelectionStrategy(SlotValueSelectionStrategy valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The built-in slot type used as a parent for the slot type.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        The built-in slot type used as a parent for the slot type.
     */

    public void setParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built-in slot type used as a parent for the slot type.
     * </p>
     * 
     * @return The built-in slot type used as a parent for the slot type.
     */

    public String getParentSlotTypeSignature() {
        return this.parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built-in slot type used as a parent for the slot type.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        The built-in slot type used as a parent for the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withParentSlotTypeSignature(String parentSlotTypeSignature) {
        setParentSlotTypeSignature(parentSlotTypeSignature);
        return this;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     * 
     * @return Configuration information that extends the parent built-in slot type.
     */

    public java.util.List<SlotTypeConfiguration> getSlotTypeConfigurations() {
        return slotTypeConfigurations;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     * 
     * @param slotTypeConfigurations
     *        Configuration information that extends the parent built-in slot type.
     */

    public void setSlotTypeConfigurations(java.util.Collection<SlotTypeConfiguration> slotTypeConfigurations) {
        if (slotTypeConfigurations == null) {
            this.slotTypeConfigurations = null;
            return;
        }

        this.slotTypeConfigurations = new java.util.ArrayList<SlotTypeConfiguration>(slotTypeConfigurations);
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotTypeConfigurations(java.util.Collection)} or
     * {@link #withSlotTypeConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param slotTypeConfigurations
     *        Configuration information that extends the parent built-in slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withSlotTypeConfigurations(SlotTypeConfiguration... slotTypeConfigurations) {
        if (this.slotTypeConfigurations == null) {
            setSlotTypeConfigurations(new java.util.ArrayList<SlotTypeConfiguration>(slotTypeConfigurations.length));
        }
        for (SlotTypeConfiguration ele : slotTypeConfigurations) {
            this.slotTypeConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     * 
     * @param slotTypeConfigurations
     *        Configuration information that extends the parent built-in slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSlotTypeResult withSlotTypeConfigurations(java.util.Collection<SlotTypeConfiguration> slotTypeConfigurations) {
        setSlotTypeConfigurations(slotTypeConfigurations);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnumerationValues() != null)
            sb.append("EnumerationValues: ").append(getEnumerationValues()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getValueSelectionStrategy() != null)
            sb.append("ValueSelectionStrategy: ").append(getValueSelectionStrategy()).append(",");
        if (getParentSlotTypeSignature() != null)
            sb.append("ParentSlotTypeSignature: ").append(getParentSlotTypeSignature()).append(",");
        if (getSlotTypeConfigurations() != null)
            sb.append("SlotTypeConfigurations: ").append(getSlotTypeConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSlotTypeResult == false)
            return false;
        GetSlotTypeResult other = (GetSlotTypeResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnumerationValues() == null ^ this.getEnumerationValues() == null)
            return false;
        if (other.getEnumerationValues() != null && other.getEnumerationValues().equals(this.getEnumerationValues()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getValueSelectionStrategy() == null ^ this.getValueSelectionStrategy() == null)
            return false;
        if (other.getValueSelectionStrategy() != null && other.getValueSelectionStrategy().equals(this.getValueSelectionStrategy()) == false)
            return false;
        if (other.getParentSlotTypeSignature() == null ^ this.getParentSlotTypeSignature() == null)
            return false;
        if (other.getParentSlotTypeSignature() != null && other.getParentSlotTypeSignature().equals(this.getParentSlotTypeSignature()) == false)
            return false;
        if (other.getSlotTypeConfigurations() == null ^ this.getSlotTypeConfigurations() == null)
            return false;
        if (other.getSlotTypeConfigurations() != null && other.getSlotTypeConfigurations().equals(this.getSlotTypeConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnumerationValues() == null) ? 0 : getEnumerationValues().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getValueSelectionStrategy() == null) ? 0 : getValueSelectionStrategy().hashCode());
        hashCode = prime * hashCode + ((getParentSlotTypeSignature() == null) ? 0 : getParentSlotTypeSignature().hashCode());
        hashCode = prime * hashCode + ((getSlotTypeConfigurations() == null) ? 0 : getSlotTypeConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public GetSlotTypeResult clone() {
        try {
            return (GetSlotTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

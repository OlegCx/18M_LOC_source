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
package com.amazonaws.services.personalizeruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that identifies an item.
 * </p>
 * <p>
 * The and APIs return a list of <code>PredictedItem</code>s.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/PredictedItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictedItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended item ID.
     * </p>
     */
    private String itemId;
    /**
     * <p>
     * A numeric representation of the model's certainty that the item will be the next user selection. For more
     * information on scoring logic, see <a>how-scores-work</a>.
     * </p>
     */
    private Double score;

    /**
     * <p>
     * The recommended item ID.
     * </p>
     * 
     * @param itemId
     *        The recommended item ID.
     */

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>
     * The recommended item ID.
     * </p>
     * 
     * @return The recommended item ID.
     */

    public String getItemId() {
        return this.itemId;
    }

    /**
     * <p>
     * The recommended item ID.
     * </p>
     * 
     * @param itemId
     *        The recommended item ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem withItemId(String itemId) {
        setItemId(itemId);
        return this;
    }

    /**
     * <p>
     * A numeric representation of the model's certainty that the item will be the next user selection. For more
     * information on scoring logic, see <a>how-scores-work</a>.
     * </p>
     * 
     * @param score
     *        A numeric representation of the model's certainty that the item will be the next user selection. For more
     *        information on scoring logic, see <a>how-scores-work</a>.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * A numeric representation of the model's certainty that the item will be the next user selection. For more
     * information on scoring logic, see <a>how-scores-work</a>.
     * </p>
     * 
     * @return A numeric representation of the model's certainty that the item will be the next user selection. For more
     *         information on scoring logic, see <a>how-scores-work</a>.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * A numeric representation of the model's certainty that the item will be the next user selection. For more
     * information on scoring logic, see <a>how-scores-work</a>.
     * </p>
     * 
     * @param score
     *        A numeric representation of the model's certainty that the item will be the next user selection. For more
     *        information on scoring logic, see <a>how-scores-work</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem withScore(Double score) {
        setScore(score);
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
        if (getItemId() != null)
            sb.append("ItemId: ").append(getItemId()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictedItem == false)
            return false;
        PredictedItem other = (PredictedItem) obj;
        if (other.getItemId() == null ^ this.getItemId() == null)
            return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public PredictedItem clone() {
        try {
            return (PredictedItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeruntime.model.transform.PredictedItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

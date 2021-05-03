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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details of a batch inference job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/BatchInferenceJobConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchInferenceJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string to string map specifying the exploration configuration hyperparameters, including
     * <code>explorationWeight</code> and <code>explorationItemAgeCutOff</code>, you want to use to configure the amount
     * of item exploration Amazon Personalize uses when recommending items. See <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a>.
     * </p>
     */
    private java.util.Map<String, String> itemExplorationConfig;

    /**
     * <p>
     * A string to string map specifying the exploration configuration hyperparameters, including
     * <code>explorationWeight</code> and <code>explorationItemAgeCutOff</code>, you want to use to configure the amount
     * of item exploration Amazon Personalize uses when recommending items. See <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a>.
     * </p>
     * 
     * @return A string to string map specifying the exploration configuration hyperparameters, including
     *         <code>explorationWeight</code> and <code>explorationItemAgeCutOff</code>, you want to use to configure
     *         the amount of item exploration Amazon Personalize uses when recommending items. See <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     *         >User-Personalization</a>.
     */

    public java.util.Map<String, String> getItemExplorationConfig() {
        return itemExplorationConfig;
    }

    /**
     * <p>
     * A string to string map specifying the exploration configuration hyperparameters, including
     * <code>explorationWeight</code> and <code>explorationItemAgeCutOff</code>, you want to use to configure the amount
     * of item exploration Amazon Personalize uses when recommending items. See <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a>.
     * </p>
     * 
     * @param itemExplorationConfig
     *        A string to string map specifying the exploration configuration hyperparameters, including
     *        <code>explorationWeight</code> and <code>explorationItemAgeCutOff</code>, you want to use to configure the
     *        amount of item exploration Amazon Personalize uses when recommending items. See <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     *        >User-Personalization</a>.
     */

    public void setItemExplorationConfig(java.util.Map<String, String> itemExplorationConfig) {
        this.itemExplorationConfig = itemExplorationConfig;
    }

    /**
     * <p>
     * A string to string map specifying the exploration configuration hyperparameters, including
     * <code>explorationWeight</code> and <code>explorationItemAgeCutOff</code>, you want to use to configure the amount
     * of item exploration Amazon Personalize uses when recommending items. See <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a>.
     * </p>
     * 
     * @param itemExplorationConfig
     *        A string to string map specifying the exploration configuration hyperparameters, including
     *        <code>explorationWeight</code> and <code>explorationItemAgeCutOff</code>, you want to use to configure the
     *        amount of item exploration Amazon Personalize uses when recommending items. See <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     *        >User-Personalization</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobConfig withItemExplorationConfig(java.util.Map<String, String> itemExplorationConfig) {
        setItemExplorationConfig(itemExplorationConfig);
        return this;
    }

    /**
     * Add a single ItemExplorationConfig entry
     *
     * @see BatchInferenceJobConfig#withItemExplorationConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobConfig addItemExplorationConfigEntry(String key, String value) {
        if (null == this.itemExplorationConfig) {
            this.itemExplorationConfig = new java.util.HashMap<String, String>();
        }
        if (this.itemExplorationConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.itemExplorationConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ItemExplorationConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobConfig clearItemExplorationConfigEntries() {
        this.itemExplorationConfig = null;
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
        if (getItemExplorationConfig() != null)
            sb.append("ItemExplorationConfig: ").append(getItemExplorationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchInferenceJobConfig == false)
            return false;
        BatchInferenceJobConfig other = (BatchInferenceJobConfig) obj;
        if (other.getItemExplorationConfig() == null ^ this.getItemExplorationConfig() == null)
            return false;
        if (other.getItemExplorationConfig() != null && other.getItemExplorationConfig().equals(this.getItemExplorationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemExplorationConfig() == null) ? 0 : getItemExplorationConfig().hashCode());
        return hashCode;
    }

    @Override
    public BatchInferenceJobConfig clone() {
        try {
            return (BatchInferenceJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.BatchInferenceJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

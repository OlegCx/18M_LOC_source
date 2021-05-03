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
 * When the solution performs AutoML (<code>performAutoML</code> is true in <a>CreateSolution</a>), specifies the recipe
 * that best optimized the specified metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/AutoMLResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the best recipe.
     * </p>
     */
    private String bestRecipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the best recipe.
     * </p>
     * 
     * @param bestRecipeArn
     *        The Amazon Resource Name (ARN) of the best recipe.
     */

    public void setBestRecipeArn(String bestRecipeArn) {
        this.bestRecipeArn = bestRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the best recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the best recipe.
     */

    public String getBestRecipeArn() {
        return this.bestRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the best recipe.
     * </p>
     * 
     * @param bestRecipeArn
     *        The Amazon Resource Name (ARN) of the best recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLResult withBestRecipeArn(String bestRecipeArn) {
        setBestRecipeArn(bestRecipeArn);
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
        if (getBestRecipeArn() != null)
            sb.append("BestRecipeArn: ").append(getBestRecipeArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLResult == false)
            return false;
        AutoMLResult other = (AutoMLResult) obj;
        if (other.getBestRecipeArn() == null ^ this.getBestRecipeArn() == null)
            return false;
        if (other.getBestRecipeArn() != null && other.getBestRecipeArn().equals(this.getBestRecipeArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBestRecipeArn() == null) ? 0 : getBestRecipeArn().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLResult clone() {
        try {
            return (AutoMLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.AutoMLResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrial" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrialResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     */
    private String trialArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @param trialArn
     *        The Amazon Resource Name (ARN) of the trial.
     */

    public void setTrialArn(String trialArn) {
        this.trialArn = trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trial.
     */

    public String getTrialArn() {
        return this.trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @param trialArn
     *        The Amazon Resource Name (ARN) of the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialResult withTrialArn(String trialArn) {
        setTrialArn(trialArn);
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
        if (getTrialArn() != null)
            sb.append("TrialArn: ").append(getTrialArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrialResult == false)
            return false;
        CreateTrialResult other = (CreateTrialResult) obj;
        if (other.getTrialArn() == null ^ this.getTrialArn() == null)
            return false;
        if (other.getTrialArn() != null && other.getTrialArn().equals(this.getTrialArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialArn() == null) ? 0 : getTrialArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrialResult clone() {
        try {
            return (CreateTrialResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

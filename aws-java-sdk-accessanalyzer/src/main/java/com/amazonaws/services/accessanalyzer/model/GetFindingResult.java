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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response to the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetFinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>finding</code> object that contains finding details.
     * </p>
     */
    private Finding finding;

    /**
     * <p>
     * A <code>finding</code> object that contains finding details.
     * </p>
     * 
     * @param finding
     *        A <code>finding</code> object that contains finding details.
     */

    public void setFinding(Finding finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * A <code>finding</code> object that contains finding details.
     * </p>
     * 
     * @return A <code>finding</code> object that contains finding details.
     */

    public Finding getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * A <code>finding</code> object that contains finding details.
     * </p>
     * 
     * @param finding
     *        A <code>finding</code> object that contains finding details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingResult withFinding(Finding finding) {
        setFinding(finding);
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
        if (getFinding() != null)
            sb.append("Finding: ").append(getFinding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingResult == false)
            return false;
        GetFindingResult other = (GetFindingResult) obj;
        if (other.getFinding() == null ^ this.getFinding() == null)
            return false;
        if (other.getFinding() != null && other.getFinding().equals(this.getFinding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingResult clone() {
        try {
            return (GetFindingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

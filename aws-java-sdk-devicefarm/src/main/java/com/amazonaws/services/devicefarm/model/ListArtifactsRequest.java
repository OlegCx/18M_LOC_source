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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to the list artifacts operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListArtifactsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The run, job, suite, or test ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The artifacts' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FILE
     * </p>
     * </li>
     * <li>
     * <p>
     * LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The run, job, suite, or test ARN.
     * </p>
     * 
     * @param arn
     *        The run, job, suite, or test ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The run, job, suite, or test ARN.
     * </p>
     * 
     * @return The run, job, suite, or test ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The run, job, suite, or test ARN.
     * </p>
     * 
     * @param arn
     *        The run, job, suite, or test ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The artifacts' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FILE
     * </p>
     * </li>
     * <li>
     * <p>
     * LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The artifacts' type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FILE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCREENSHOT
     *        </p>
     *        </li>
     * @see ArtifactCategory
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The artifacts' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FILE
     * </p>
     * </li>
     * <li>
     * <p>
     * LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * </ul>
     * 
     * @return The artifacts' type.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         FILE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCREENSHOT
     *         </p>
     *         </li>
     * @see ArtifactCategory
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The artifacts' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FILE
     * </p>
     * </li>
     * <li>
     * <p>
     * LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The artifacts' type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FILE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCREENSHOT
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactCategory
     */

    public ListArtifactsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The artifacts' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FILE
     * </p>
     * </li>
     * <li>
     * <p>
     * LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The artifacts' type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FILE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCREENSHOT
     *        </p>
     *        </li>
     * @see ArtifactCategory
     */

    public void setType(ArtifactCategory type) {
        withType(type);
    }

    /**
     * <p>
     * The artifacts' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FILE
     * </p>
     * </li>
     * <li>
     * <p>
     * LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The artifacts' type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FILE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCREENSHOT
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactCategory
     */

    public ListArtifactsRequest withType(ArtifactCategory type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListArtifactsRequest == false)
            return false;
        ListArtifactsRequest other = (ListArtifactsRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListArtifactsRequest clone() {
        return (ListArtifactsRequest) super.clone();
    }

}

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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListEntityRecognizers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntityRecognizersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     */
    private java.util.List<EntityRecognizerProperties> entityRecognizerPropertiesList;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     * 
     * @return The list of properties of an entity recognizer.
     */

    public java.util.List<EntityRecognizerProperties> getEntityRecognizerPropertiesList() {
        return entityRecognizerPropertiesList;
    }

    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     * 
     * @param entityRecognizerPropertiesList
     *        The list of properties of an entity recognizer.
     */

    public void setEntityRecognizerPropertiesList(java.util.Collection<EntityRecognizerProperties> entityRecognizerPropertiesList) {
        if (entityRecognizerPropertiesList == null) {
            this.entityRecognizerPropertiesList = null;
            return;
        }

        this.entityRecognizerPropertiesList = new java.util.ArrayList<EntityRecognizerProperties>(entityRecognizerPropertiesList);
    }

    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityRecognizerPropertiesList(java.util.Collection)} or
     * {@link #withEntityRecognizerPropertiesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param entityRecognizerPropertiesList
     *        The list of properties of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntityRecognizersResult withEntityRecognizerPropertiesList(EntityRecognizerProperties... entityRecognizerPropertiesList) {
        if (this.entityRecognizerPropertiesList == null) {
            setEntityRecognizerPropertiesList(new java.util.ArrayList<EntityRecognizerProperties>(entityRecognizerPropertiesList.length));
        }
        for (EntityRecognizerProperties ele : entityRecognizerPropertiesList) {
            this.entityRecognizerPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     * 
     * @param entityRecognizerPropertiesList
     *        The list of properties of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntityRecognizersResult withEntityRecognizerPropertiesList(java.util.Collection<EntityRecognizerProperties> entityRecognizerPropertiesList) {
        setEntityRecognizerPropertiesList(entityRecognizerPropertiesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntityRecognizersResult withNextToken(String nextToken) {
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
        if (getEntityRecognizerPropertiesList() != null)
            sb.append("EntityRecognizerPropertiesList: ").append(getEntityRecognizerPropertiesList()).append(",");
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

        if (obj instanceof ListEntityRecognizersResult == false)
            return false;
        ListEntityRecognizersResult other = (ListEntityRecognizersResult) obj;
        if (other.getEntityRecognizerPropertiesList() == null ^ this.getEntityRecognizerPropertiesList() == null)
            return false;
        if (other.getEntityRecognizerPropertiesList() != null
                && other.getEntityRecognizerPropertiesList().equals(this.getEntityRecognizerPropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getEntityRecognizerPropertiesList() == null) ? 0 : getEntityRecognizerPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEntityRecognizersResult clone() {
        try {
            return (ListEntityRecognizersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

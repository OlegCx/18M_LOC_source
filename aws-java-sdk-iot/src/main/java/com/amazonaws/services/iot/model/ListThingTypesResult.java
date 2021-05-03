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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output for the ListThingTypes operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The thing types.
     * </p>
     */
    private java.util.List<ThingTypeDefinition> thingTypes;
    /**
     * <p>
     * The token for the next set of results. Will not be returned if operation has returned all results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The thing types.
     * </p>
     * 
     * @return The thing types.
     */

    public java.util.List<ThingTypeDefinition> getThingTypes() {
        return thingTypes;
    }

    /**
     * <p>
     * The thing types.
     * </p>
     * 
     * @param thingTypes
     *        The thing types.
     */

    public void setThingTypes(java.util.Collection<ThingTypeDefinition> thingTypes) {
        if (thingTypes == null) {
            this.thingTypes = null;
            return;
        }

        this.thingTypes = new java.util.ArrayList<ThingTypeDefinition>(thingTypes);
    }

    /**
     * <p>
     * The thing types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThingTypes(java.util.Collection)} or {@link #withThingTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param thingTypes
     *        The thing types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingTypesResult withThingTypes(ThingTypeDefinition... thingTypes) {
        if (this.thingTypes == null) {
            setThingTypes(new java.util.ArrayList<ThingTypeDefinition>(thingTypes.length));
        }
        for (ThingTypeDefinition ele : thingTypes) {
            this.thingTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The thing types.
     * </p>
     * 
     * @param thingTypes
     *        The thing types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingTypesResult withThingTypes(java.util.Collection<ThingTypeDefinition> thingTypes) {
        setThingTypes(thingTypes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Will not be returned if operation has returned all results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Will not be returned if operation has returned all results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Will not be returned if operation has returned all results.
     * </p>
     * 
     * @return The token for the next set of results. Will not be returned if operation has returned all results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Will not be returned if operation has returned all results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Will not be returned if operation has returned all results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingTypesResult withNextToken(String nextToken) {
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
        if (getThingTypes() != null)
            sb.append("ThingTypes: ").append(getThingTypes()).append(",");
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

        if (obj instanceof ListThingTypesResult == false)
            return false;
        ListThingTypesResult other = (ListThingTypesResult) obj;
        if (other.getThingTypes() == null ^ this.getThingTypes() == null)
            return false;
        if (other.getThingTypes() != null && other.getThingTypes().equals(this.getThingTypes()) == false)
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

        hashCode = prime * hashCode + ((getThingTypes() == null) ? 0 : getThingTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListThingTypesResult clone() {
        try {
            return (ListThingTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

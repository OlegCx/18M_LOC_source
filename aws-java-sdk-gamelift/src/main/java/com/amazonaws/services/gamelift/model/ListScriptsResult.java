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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListScripts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScriptsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A set of properties describing the requested script.
     * </p>
     */
    private java.util.List<Script> scripts;
    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A set of properties describing the requested script.
     * </p>
     * 
     * @return A set of properties describing the requested script.
     */

    public java.util.List<Script> getScripts() {
        return scripts;
    }

    /**
     * <p>
     * A set of properties describing the requested script.
     * </p>
     * 
     * @param scripts
     *        A set of properties describing the requested script.
     */

    public void setScripts(java.util.Collection<Script> scripts) {
        if (scripts == null) {
            this.scripts = null;
            return;
        }

        this.scripts = new java.util.ArrayList<Script>(scripts);
    }

    /**
     * <p>
     * A set of properties describing the requested script.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScripts(java.util.Collection)} or {@link #withScripts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param scripts
     *        A set of properties describing the requested script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScriptsResult withScripts(Script... scripts) {
        if (this.scripts == null) {
            setScripts(new java.util.ArrayList<Script>(scripts.length));
        }
        for (Script ele : scripts) {
            this.scripts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of properties describing the requested script.
     * </p>
     * 
     * @param scripts
     *        A set of properties describing the requested script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScriptsResult withScripts(java.util.Collection<Script> scripts) {
        setScripts(scripts);
        return this;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *        is returned, these results represent the end of the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @return A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *         is returned, these results represent the end of the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *        is returned, these results represent the end of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScriptsResult withNextToken(String nextToken) {
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
        if (getScripts() != null)
            sb.append("Scripts: ").append(getScripts()).append(",");
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

        if (obj instanceof ListScriptsResult == false)
            return false;
        ListScriptsResult other = (ListScriptsResult) obj;
        if (other.getScripts() == null ^ this.getScripts() == null)
            return false;
        if (other.getScripts() != null && other.getScripts().equals(this.getScripts()) == false)
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

        hashCode = prime * hashCode + ((getScripts() == null) ? 0 : getScripts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListScriptsResult clone() {
        try {
            return (ListScriptsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

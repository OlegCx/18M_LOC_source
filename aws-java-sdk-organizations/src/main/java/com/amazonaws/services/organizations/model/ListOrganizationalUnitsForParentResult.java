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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListOrganizationalUnitsForParent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationalUnitsForParentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     */
    private java.util.List<OrganizationalUnit> organizationalUnits;
    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     * 
     * @return A list of the OUs in the specified root or parent OU.
     */

    public java.util.List<OrganizationalUnit> getOrganizationalUnits() {
        return organizationalUnits;
    }

    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     * 
     * @param organizationalUnits
     *        A list of the OUs in the specified root or parent OU.
     */

    public void setOrganizationalUnits(java.util.Collection<OrganizationalUnit> organizationalUnits) {
        if (organizationalUnits == null) {
            this.organizationalUnits = null;
            return;
        }

        this.organizationalUnits = new java.util.ArrayList<OrganizationalUnit>(organizationalUnits);
    }

    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnits(java.util.Collection)} or {@link #withOrganizationalUnits(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param organizationalUnits
     *        A list of the OUs in the specified root or parent OU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationalUnitsForParentResult withOrganizationalUnits(OrganizationalUnit... organizationalUnits) {
        if (this.organizationalUnits == null) {
            setOrganizationalUnits(new java.util.ArrayList<OrganizationalUnit>(organizationalUnits.length));
        }
        for (OrganizationalUnit ele : organizationalUnits) {
            this.organizationalUnits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     * 
     * @param organizationalUnits
     *        A list of the OUs in the specified root or parent OU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationalUnitsForParentResult withOrganizationalUnits(java.util.Collection<OrganizationalUnit> organizationalUnits) {
        setOrganizationalUnits(organizationalUnits);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @return If present, indicates that more output is available than is included in the current response. Use this
     *         value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *         next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *         back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationalUnitsForParentResult withNextToken(String nextToken) {
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
        if (getOrganizationalUnits() != null)
            sb.append("OrganizationalUnits: ").append(getOrganizationalUnits()).append(",");
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

        if (obj instanceof ListOrganizationalUnitsForParentResult == false)
            return false;
        ListOrganizationalUnitsForParentResult other = (ListOrganizationalUnitsForParentResult) obj;
        if (other.getOrganizationalUnits() == null ^ this.getOrganizationalUnits() == null)
            return false;
        if (other.getOrganizationalUnits() != null && other.getOrganizationalUnits().equals(this.getOrganizationalUnits()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationalUnits() == null) ? 0 : getOrganizationalUnits().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationalUnitsForParentResult clone() {
        try {
            return (ListOrganizationalUnitsForParentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

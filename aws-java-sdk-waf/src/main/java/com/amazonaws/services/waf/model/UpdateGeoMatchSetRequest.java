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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateGeoMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGeoMatchSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to update. <code>GeoMatchSetId</code> is
     * returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     */
    private String geoMatchSetId;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;
    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     * <a>GeoMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To add
     * multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<GeoMatchSetUpdate> updates;

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to update. <code>GeoMatchSetId</code> is
     * returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @param geoMatchSetId
     *        The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to update.
     *        <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     */

    public void setGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to update. <code>GeoMatchSetId</code> is
     * returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @return The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to update.
     *         <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     */

    public String getGeoMatchSetId() {
        return this.geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to update. <code>GeoMatchSetId</code> is
     * returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @param geoMatchSetId
     *        The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to update.
     *        <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeoMatchSetRequest withGeoMatchSetId(String geoMatchSetId) {
        setGeoMatchSetId(geoMatchSetId);
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @return The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeoMatchSetRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     * <a>GeoMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To add
     * multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     *         <a>GeoMatchSet</a>. For more information, see the applicable data types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     *         </p>
     *         <p>
     *         You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To
     *         add multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     *         </p>
     *         </li>
     */

    public java.util.List<GeoMatchSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     * <a>GeoMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To add
     * multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     *        <a>GeoMatchSet</a>. For more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     *        </p>
     *        <p>
     *        You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To add
     *        multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     *        </p>
     *        </li>
     */

    public void setUpdates(java.util.Collection<GeoMatchSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<GeoMatchSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     * <a>GeoMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To add
     * multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     *        <a>GeoMatchSet</a>. For more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     *        </p>
     *        <p>
     *        You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To add
     *        multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeoMatchSetRequest withUpdates(GeoMatchSetUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<GeoMatchSetUpdate>(updates.length));
        }
        for (GeoMatchSetUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     * <a>GeoMatchSet</a>. For more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To add
     * multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>GeoMatchSetUpdate</code> objects that you want to insert into or delete from an
     *        <a>GeoMatchSet</a>. For more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and <code>GeoMatchConstraint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>GeoMatchConstraint</a>: Contains <code>Type</code> and <code>Value</code>
     *        </p>
     *        <p>
     *        You can have only one <code>Type</code> and <code>Value</code> per <code>GeoMatchConstraint</code>. To add
     *        multiple countries, include multiple <code>GeoMatchSetUpdate</code> objects in your request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeoMatchSetRequest withUpdates(java.util.Collection<GeoMatchSetUpdate> updates) {
        setUpdates(updates);
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
        if (getGeoMatchSetId() != null)
            sb.append("GeoMatchSetId: ").append(getGeoMatchSetId()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGeoMatchSetRequest == false)
            return false;
        UpdateGeoMatchSetRequest other = (UpdateGeoMatchSetRequest) obj;
        if (other.getGeoMatchSetId() == null ^ this.getGeoMatchSetId() == null)
            return false;
        if (other.getGeoMatchSetId() != null && other.getGeoMatchSetId().equals(this.getGeoMatchSetId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoMatchSetId() == null) ? 0 : getGeoMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGeoMatchSetRequest clone() {
        return (UpdateGeoMatchSetRequest) super.clone();
    }

}

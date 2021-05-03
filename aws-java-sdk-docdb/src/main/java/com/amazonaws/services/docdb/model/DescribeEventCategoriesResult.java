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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of <a>DescribeEventCategories</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEventCategories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventCategoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of event category maps.
     * </p>
     */
    private java.util.List<EventCategoriesMap> eventCategoriesMapList;

    /**
     * <p>
     * A list of event category maps.
     * </p>
     * 
     * @return A list of event category maps.
     */

    public java.util.List<EventCategoriesMap> getEventCategoriesMapList() {
        return eventCategoriesMapList;
    }

    /**
     * <p>
     * A list of event category maps.
     * </p>
     * 
     * @param eventCategoriesMapList
     *        A list of event category maps.
     */

    public void setEventCategoriesMapList(java.util.Collection<EventCategoriesMap> eventCategoriesMapList) {
        if (eventCategoriesMapList == null) {
            this.eventCategoriesMapList = null;
            return;
        }

        this.eventCategoriesMapList = new java.util.ArrayList<EventCategoriesMap>(eventCategoriesMapList);
    }

    /**
     * <p>
     * A list of event category maps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategoriesMapList(java.util.Collection)} or
     * {@link #withEventCategoriesMapList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eventCategoriesMapList
     *        A list of event category maps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventCategoriesResult withEventCategoriesMapList(EventCategoriesMap... eventCategoriesMapList) {
        if (this.eventCategoriesMapList == null) {
            setEventCategoriesMapList(new java.util.ArrayList<EventCategoriesMap>(eventCategoriesMapList.length));
        }
        for (EventCategoriesMap ele : eventCategoriesMapList) {
            this.eventCategoriesMapList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event category maps.
     * </p>
     * 
     * @param eventCategoriesMapList
     *        A list of event category maps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventCategoriesResult withEventCategoriesMapList(java.util.Collection<EventCategoriesMap> eventCategoriesMapList) {
        setEventCategoriesMapList(eventCategoriesMapList);
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
        if (getEventCategoriesMapList() != null)
            sb.append("EventCategoriesMapList: ").append(getEventCategoriesMapList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventCategoriesResult == false)
            return false;
        DescribeEventCategoriesResult other = (DescribeEventCategoriesResult) obj;
        if (other.getEventCategoriesMapList() == null ^ this.getEventCategoriesMapList() == null)
            return false;
        if (other.getEventCategoriesMapList() != null && other.getEventCategoriesMapList().equals(this.getEventCategoriesMapList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventCategoriesMapList() == null) ? 0 : getEventCategoriesMapList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventCategoriesResult clone() {
        try {
            return (DescribeEventCategoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

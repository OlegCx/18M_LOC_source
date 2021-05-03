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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMapResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp for when the map resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     * </p>
     * </li>
     * </ul>
     */
    private String mapArn;
    /**
     * <p>
     * The name of the map resource.
     * </p>
     */
    private String mapName;

    /**
     * <p>
     * The timestamp for when the map resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the map resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the map resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the map resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp for when the map resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the map resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMapResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param mapArn
     *        The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all
     *        AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     *        </p>
     *        </li>
     */

    public void setMapArn(String mapArn) {
        this.mapArn = mapArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all
     *         AWS.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     *         </p>
     *         </li>
     */

    public String getMapArn() {
        return this.mapArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param mapArn
     *        The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all
     *        AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMapResult withMapArn(String mapArn) {
        setMapArn(mapArn);
        return this;
    }

    /**
     * <p>
     * The name of the map resource.
     * </p>
     * 
     * @param mapName
     *        The name of the map resource.
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The name of the map resource.
     * </p>
     * 
     * @return The name of the map resource.
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The name of the map resource.
     * </p>
     * 
     * @param mapName
     *        The name of the map resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMapResult withMapName(String mapName) {
        setMapName(mapName);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getMapArn() != null)
            sb.append("MapArn: ").append(getMapArn()).append(",");
        if (getMapName() != null)
            sb.append("MapName: ").append(getMapName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMapResult == false)
            return false;
        CreateMapResult other = (CreateMapResult) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getMapArn() == null ^ this.getMapArn() == null)
            return false;
        if (other.getMapArn() != null && other.getMapArn().equals(this.getMapArn()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getMapArn() == null) ? 0 : getMapArn().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        return hashCode;
    }

    @Override
    public CreateMapResult clone() {
        try {
            return (CreateMapResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

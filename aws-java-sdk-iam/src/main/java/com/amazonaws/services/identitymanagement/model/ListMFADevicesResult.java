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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>ListMFADevices</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListMFADevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMFADevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of MFA devices.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MFADevice> mFADevices;
    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of MFA devices.
     * </p>
     * 
     * @return A list of MFA devices.
     */

    public java.util.List<MFADevice> getMFADevices() {
        if (mFADevices == null) {
            mFADevices = new com.amazonaws.internal.SdkInternalList<MFADevice>();
        }
        return mFADevices;
    }

    /**
     * <p>
     * A list of MFA devices.
     * </p>
     * 
     * @param mFADevices
     *        A list of MFA devices.
     */

    public void setMFADevices(java.util.Collection<MFADevice> mFADevices) {
        if (mFADevices == null) {
            this.mFADevices = null;
            return;
        }

        this.mFADevices = new com.amazonaws.internal.SdkInternalList<MFADevice>(mFADevices);
    }

    /**
     * <p>
     * A list of MFA devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMFADevices(java.util.Collection)} or {@link #withMFADevices(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mFADevices
     *        A list of MFA devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMFADevicesResult withMFADevices(MFADevice... mFADevices) {
        if (this.mFADevices == null) {
            setMFADevices(new com.amazonaws.internal.SdkInternalList<MFADevice>(mFADevices.length));
        }
        for (MFADevice ele : mFADevices) {
            this.mFADevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of MFA devices.
     * </p>
     * 
     * @param mFADevices
     *        A list of MFA devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMFADevicesResult withMFADevices(java.util.Collection<MFADevice> mFADevices) {
        setMFADevices(mFADevices);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can make
     *        a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items.
     *        Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there are more
     *        results available. We recommend that you check <code>IsTruncated</code> after every call to ensure that
     *        you receive all your results.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @return A flag that indicates whether there are more items to return. If your results were truncated, you can
     *         make a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there
     *         are more results available. We recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all your results.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can make
     *        a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items.
     *        Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there are more
     *        results available. We recommend that you check <code>IsTruncated</code> after every call to ensure that
     *        you receive all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMFADevicesResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @return A flag that indicates whether there are more items to return. If your results were truncated, you can
     *         make a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there
     *         are more results available. We recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all your results.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param marker
     *        When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *        for the <code>Marker</code> parameter in a subsequent pagination request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @return When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *         for the <code>Marker</code> parameter in a subsequent pagination request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param marker
     *        When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *        for the <code>Marker</code> parameter in a subsequent pagination request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMFADevicesResult withMarker(String marker) {
        setMarker(marker);
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
        if (getMFADevices() != null)
            sb.append("MFADevices: ").append(getMFADevices()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMFADevicesResult == false)
            return false;
        ListMFADevicesResult other = (ListMFADevicesResult) obj;
        if (other.getMFADevices() == null ^ this.getMFADevices() == null)
            return false;
        if (other.getMFADevices() != null && other.getMFADevices().equals(this.getMFADevices()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMFADevices() == null) ? 0 : getMFADevices().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListMFADevicesResult clone() {
        try {
            return (ListMFADevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

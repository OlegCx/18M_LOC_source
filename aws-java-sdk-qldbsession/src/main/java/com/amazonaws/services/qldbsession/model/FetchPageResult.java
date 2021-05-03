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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the page that was fetched.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/FetchPageResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FetchPageResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains details of the fetched page.
     * </p>
     */
    private Page page;
    /**
     * <p>
     * Contains server-side performance information for the command.
     * </p>
     */
    private TimingInformation timingInformation;
    /**
     * <p>
     * Contains metrics about the number of I/O requests that were consumed.
     * </p>
     */
    private IOUsage consumedIOs;

    /**
     * <p>
     * Contains details of the fetched page.
     * </p>
     * 
     * @param page
     *        Contains details of the fetched page.
     */

    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * <p>
     * Contains details of the fetched page.
     * </p>
     * 
     * @return Contains details of the fetched page.
     */

    public Page getPage() {
        return this.page;
    }

    /**
     * <p>
     * Contains details of the fetched page.
     * </p>
     * 
     * @param page
     *        Contains details of the fetched page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FetchPageResult withPage(Page page) {
        setPage(page);
        return this;
    }

    /**
     * <p>
     * Contains server-side performance information for the command.
     * </p>
     * 
     * @param timingInformation
     *        Contains server-side performance information for the command.
     */

    public void setTimingInformation(TimingInformation timingInformation) {
        this.timingInformation = timingInformation;
    }

    /**
     * <p>
     * Contains server-side performance information for the command.
     * </p>
     * 
     * @return Contains server-side performance information for the command.
     */

    public TimingInformation getTimingInformation() {
        return this.timingInformation;
    }

    /**
     * <p>
     * Contains server-side performance information for the command.
     * </p>
     * 
     * @param timingInformation
     *        Contains server-side performance information for the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FetchPageResult withTimingInformation(TimingInformation timingInformation) {
        setTimingInformation(timingInformation);
        return this;
    }

    /**
     * <p>
     * Contains metrics about the number of I/O requests that were consumed.
     * </p>
     * 
     * @param consumedIOs
     *        Contains metrics about the number of I/O requests that were consumed.
     */

    public void setConsumedIOs(IOUsage consumedIOs) {
        this.consumedIOs = consumedIOs;
    }

    /**
     * <p>
     * Contains metrics about the number of I/O requests that were consumed.
     * </p>
     * 
     * @return Contains metrics about the number of I/O requests that were consumed.
     */

    public IOUsage getConsumedIOs() {
        return this.consumedIOs;
    }

    /**
     * <p>
     * Contains metrics about the number of I/O requests that were consumed.
     * </p>
     * 
     * @param consumedIOs
     *        Contains metrics about the number of I/O requests that were consumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FetchPageResult withConsumedIOs(IOUsage consumedIOs) {
        setConsumedIOs(consumedIOs);
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
        if (getPage() != null)
            sb.append("Page: ").append(getPage()).append(",");
        if (getTimingInformation() != null)
            sb.append("TimingInformation: ").append(getTimingInformation()).append(",");
        if (getConsumedIOs() != null)
            sb.append("ConsumedIOs: ").append(getConsumedIOs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FetchPageResult == false)
            return false;
        FetchPageResult other = (FetchPageResult) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getTimingInformation() == null ^ this.getTimingInformation() == null)
            return false;
        if (other.getTimingInformation() != null && other.getTimingInformation().equals(this.getTimingInformation()) == false)
            return false;
        if (other.getConsumedIOs() == null ^ this.getConsumedIOs() == null)
            return false;
        if (other.getConsumedIOs() != null && other.getConsumedIOs().equals(this.getConsumedIOs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getTimingInformation() == null) ? 0 : getTimingInformation().hashCode());
        hashCode = prime * hashCode + ((getConsumedIOs() == null) ? 0 : getConsumedIOs().hashCode());
        return hashCode;
    }

    @Override
    public FetchPageResult clone() {
        try {
            return (FetchPageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.FetchPageResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

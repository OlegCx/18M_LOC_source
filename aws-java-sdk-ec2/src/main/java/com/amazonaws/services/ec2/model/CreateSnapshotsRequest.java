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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateSnapshotsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateSnapshotsRequest> {

    /**
     * <p>
     * A description propagated to every snapshot specified by the instance.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The instance to specify which volumes should be included in the snapshots.
     * </p>
     */
    private InstanceSpecification instanceSpecification;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Outpost on which to create the local snapshots.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create snapshots from an instance in a Region, omit this parameter. The snapshots are created in the same
     * Region as the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create snapshots from an instance on an Outpost and store the snapshots in the Region, omit this parameter.
     * The snapshots are created in the Region for the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create snapshots from an instance on an Outpost and store the snapshots on an Outpost, specify the ARN of the
     * destination Outpost. The snapshots must be created on the same Outpost as the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#create-multivol-snapshot">
     * Creating multi-volume local snapshots from instances on an Outpost</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     */
    private String copyTagsFromSource;

    /**
     * <p>
     * A description propagated to every snapshot specified by the instance.
     * </p>
     * 
     * @param description
     *        A description propagated to every snapshot specified by the instance.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description propagated to every snapshot specified by the instance.
     * </p>
     * 
     * @return A description propagated to every snapshot specified by the instance.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description propagated to every snapshot specified by the instance.
     * </p>
     * 
     * @param description
     *        A description propagated to every snapshot specified by the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotsRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The instance to specify which volumes should be included in the snapshots.
     * </p>
     * 
     * @param instanceSpecification
     *        The instance to specify which volumes should be included in the snapshots.
     */

    public void setInstanceSpecification(InstanceSpecification instanceSpecification) {
        this.instanceSpecification = instanceSpecification;
    }

    /**
     * <p>
     * The instance to specify which volumes should be included in the snapshots.
     * </p>
     * 
     * @return The instance to specify which volumes should be included in the snapshots.
     */

    public InstanceSpecification getInstanceSpecification() {
        return this.instanceSpecification;
    }

    /**
     * <p>
     * The instance to specify which volumes should be included in the snapshots.
     * </p>
     * 
     * @param instanceSpecification
     *        The instance to specify which volumes should be included in the snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotsRequest withInstanceSpecification(InstanceSpecification instanceSpecification) {
        setInstanceSpecification(instanceSpecification);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Outpost on which to create the local snapshots.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create snapshots from an instance in a Region, omit this parameter. The snapshots are created in the same
     * Region as the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create snapshots from an instance on an Outpost and store the snapshots in the Region, omit this parameter.
     * The snapshots are created in the Region for the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create snapshots from an instance on an Outpost and store the snapshots on an Outpost, specify the ARN of the
     * destination Outpost. The snapshots must be created on the same Outpost as the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#create-multivol-snapshot">
     * Creating multi-volume local snapshots from instances on an Outpost</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the AWS Outpost on which to create the local snapshots.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To create snapshots from an instance in a Region, omit this parameter. The snapshots are created in the
     *        same Region as the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create snapshots from an instance on an Outpost and store the snapshots in the Region, omit this
     *        parameter. The snapshots are created in the Region for the Outpost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create snapshots from an instance on an Outpost and store the snapshots on an Outpost, specify the ARN
     *        of the destination Outpost. The snapshots must be created on the same Outpost as the instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#create-multivol-snapshot">
     *        Creating multi-volume local snapshots from instances on an Outpost</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide</i>.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Outpost on which to create the local snapshots.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create snapshots from an instance in a Region, omit this parameter. The snapshots are created in the same
     * Region as the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create snapshots from an instance on an Outpost and store the snapshots in the Region, omit this parameter.
     * The snapshots are created in the Region for the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create snapshots from an instance on an Outpost and store the snapshots on an Outpost, specify the ARN of the
     * destination Outpost. The snapshots must be created on the same Outpost as the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#create-multivol-snapshot">
     * Creating multi-volume local snapshots from instances on an Outpost</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Outpost on which to create the local snapshots.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To create snapshots from an instance in a Region, omit this parameter. The snapshots are created in the
     *         same Region as the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To create snapshots from an instance on an Outpost and store the snapshots in the Region, omit this
     *         parameter. The snapshots are created in the Region for the Outpost.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To create snapshots from an instance on an Outpost and store the snapshots on an Outpost, specify the ARN
     *         of the destination Outpost. The snapshots must be created on the same Outpost as the instance.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#create-multivol-snapshot">
     *         Creating multi-volume local snapshots from instances on an Outpost</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Outpost on which to create the local snapshots.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create snapshots from an instance in a Region, omit this parameter. The snapshots are created in the same
     * Region as the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create snapshots from an instance on an Outpost and store the snapshots in the Region, omit this parameter.
     * The snapshots are created in the Region for the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create snapshots from an instance on an Outpost and store the snapshots on an Outpost, specify the ARN of the
     * destination Outpost. The snapshots must be created on the same Outpost as the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#create-multivol-snapshot">
     * Creating multi-volume local snapshots from instances on an Outpost</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the AWS Outpost on which to create the local snapshots.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To create snapshots from an instance in a Region, omit this parameter. The snapshots are created in the
     *        same Region as the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create snapshots from an instance on an Outpost and store the snapshots in the Region, omit this
     *        parameter. The snapshots are created in the Region for the Outpost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create snapshots from an instance on an Outpost and store the snapshots on an Outpost, specify the ARN
     *        of the destination Outpost. The snapshots must be created on the same Outpost as the instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#create-multivol-snapshot">
     *        Creating multi-volume local snapshots from instances on an Outpost</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotsRequest withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     * 
     * @return Tags to apply to every snapshot specified by the instance.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     * 
     * @param tagSpecifications
     *        Tags to apply to every snapshot specified by the instance.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        Tags to apply to every snapshot specified by the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotsRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     * 
     * @param tagSpecifications
     *        Tags to apply to every snapshot specified by the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotsRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * 
     * @param copyTagsFromSource
     *        Copies the tags from the specified volume to corresponding snapshot.
     * @see CopyTagsFromSource
     */

    public void setCopyTagsFromSource(String copyTagsFromSource) {
        this.copyTagsFromSource = copyTagsFromSource;
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * 
     * @return Copies the tags from the specified volume to corresponding snapshot.
     * @see CopyTagsFromSource
     */

    public String getCopyTagsFromSource() {
        return this.copyTagsFromSource;
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * 
     * @param copyTagsFromSource
     *        Copies the tags from the specified volume to corresponding snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyTagsFromSource
     */

    public CreateSnapshotsRequest withCopyTagsFromSource(String copyTagsFromSource) {
        setCopyTagsFromSource(copyTagsFromSource);
        return this;
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * 
     * @param copyTagsFromSource
     *        Copies the tags from the specified volume to corresponding snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyTagsFromSource
     */

    public CreateSnapshotsRequest withCopyTagsFromSource(CopyTagsFromSource copyTagsFromSource) {
        this.copyTagsFromSource = copyTagsFromSource.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateSnapshotsRequest> getDryRunRequest() {
        Request<CreateSnapshotsRequest> request = new CreateSnapshotsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInstanceSpecification() != null)
            sb.append("InstanceSpecification: ").append(getInstanceSpecification()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getCopyTagsFromSource() != null)
            sb.append("CopyTagsFromSource: ").append(getCopyTagsFromSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotsRequest == false)
            return false;
        CreateSnapshotsRequest other = (CreateSnapshotsRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceSpecification() == null ^ this.getInstanceSpecification() == null)
            return false;
        if (other.getInstanceSpecification() != null && other.getInstanceSpecification().equals(this.getInstanceSpecification()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getCopyTagsFromSource() == null ^ this.getCopyTagsFromSource() == null)
            return false;
        if (other.getCopyTagsFromSource() != null && other.getCopyTagsFromSource().equals(this.getCopyTagsFromSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceSpecification() == null) ? 0 : getInstanceSpecification().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsFromSource() == null) ? 0 : getCopyTagsFromSource().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotsRequest clone() {
        return (CreateSnapshotsRequest) super.clone();
    }
}

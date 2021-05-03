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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProtectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * <p>
     * The ARN should be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic Load Balancer (Classic Load Balancer):
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS CloudFront distribution:
     * <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS Global Accelerator accelerator:
     * <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Route 53: <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic IP address:
     * <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     * </p>
     * </li>
     * </ul>
     */
    private String resourceArn;
    /**
     * <p>
     * One or more tag key-value pairs for the <a>Protection</a> object that is created.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * 
     * @param name
     *        Friendly name for the <code>Protection</code> you are creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * 
     * @return Friendly name for the <code>Protection</code> you are creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * 
     * @param name
     *        Friendly name for the <code>Protection</code> you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * <p>
     * The ARN should be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic Load Balancer (Classic Load Balancer):
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS CloudFront distribution:
     * <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS Global Accelerator accelerator:
     * <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Route 53: <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic IP address:
     * <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource to be protected.</p>
     *        <p>
     *        The ARN should be in one of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an Application Load Balancer:
     *        <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an Elastic Load Balancer (Classic Load Balancer):
     *        <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an AWS CloudFront distribution:
     *        <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an AWS Global Accelerator accelerator:
     *        <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon Route 53: <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an Elastic IP address:
     *        <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     *        </p>
     *        </li>
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * <p>
     * The ARN should be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic Load Balancer (Classic Load Balancer):
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS CloudFront distribution:
     * <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS Global Accelerator accelerator:
     * <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Route 53: <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic IP address:
     * <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ARN (Amazon Resource Name) of the resource to be protected.</p>
     *         <p>
     *         The ARN should be in one of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an Application Load Balancer:
     *         <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an Elastic Load Balancer (Classic Load Balancer):
     *         <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an AWS CloudFront distribution:
     *         <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an AWS Global Accelerator accelerator:
     *         <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon Route 53: <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an Elastic IP address:
     *         <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     *         </p>
     *         </li>
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * <p>
     * The ARN should be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic Load Balancer (Classic Load Balancer):
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS CloudFront distribution:
     * <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS Global Accelerator accelerator:
     * <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Route 53: <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic IP address:
     * <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource to be protected.</p>
     *        <p>
     *        The ARN should be in one of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an Application Load Balancer:
     *        <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an Elastic Load Balancer (Classic Load Balancer):
     *        <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an AWS CloudFront distribution:
     *        <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an AWS Global Accelerator accelerator:
     *        <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon Route 53: <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an Elastic IP address:
     *        <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the <a>Protection</a> object that is created.
     * </p>
     * 
     * @return One or more tag key-value pairs for the <a>Protection</a> object that is created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the <a>Protection</a> object that is created.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the <a>Protection</a> object that is created.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tag key-value pairs for the <a>Protection</a> object that is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the <a>Protection</a> object that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the <a>Protection</a> object that is created.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the <a>Protection</a> object that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProtectionRequest == false)
            return false;
        CreateProtectionRequest other = (CreateProtectionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProtectionRequest clone() {
        return (CreateProtectionRequest) super.clone();
    }

}

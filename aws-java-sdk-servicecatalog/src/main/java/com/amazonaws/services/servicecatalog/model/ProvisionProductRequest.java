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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisionProduct" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The product identifier. You must provide the name or ID, but not both.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The name of the product. You must provide the name or ID, but not both.
     * </p>
     */
    private String productName;
    /**
     * <p>
     * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The name of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     */
    private String provisioningArtifactName;
    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You must provide the
     * name or ID, but not both.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * The name of the path. You must provide the name or ID, but not both.
     * </p>
     */
    private String pathName;
    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be
     * updated after the product is provisioned.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     */
    private java.util.List<ProvisioningParameter> provisioningParameters;
    /**
     * <p>
     * An object that contains information about the provisioning preferences for a stack set.
     * </p>
     */
    private ProvisioningPreferences provisioningPreferences;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     */
    private java.util.List<String> notificationArns;
    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     */
    private String provisionToken;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The product identifier. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param productId
     *        The product identifier. You must provide the name or ID, but not both.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The product identifier. You must provide the name or ID, but not both.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param productId
     *        The product identifier. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The name of the product. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param productName
     *        The name of the product. You must provide the name or ID, but not both.
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * The name of the product. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The name of the product. You must provide the name or ID, but not both.
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * The name of the product. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param productName
     *        The name of the product. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The name of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param provisioningArtifactName
     *        The name of the provisioning artifact. You must provide the name or ID, but not both.
     */

    public void setProvisioningArtifactName(String provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
    }

    /**
     * <p>
     * The name of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The name of the provisioning artifact. You must provide the name or ID, but not both.
     */

    public String getProvisioningArtifactName() {
        return this.provisioningArtifactName;
    }

    /**
     * <p>
     * The name of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param provisioningArtifactName
     *        The name of the provisioning artifact. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisioningArtifactName(String provisioningArtifactName) {
        setProvisioningArtifactName(provisioningArtifactName);
        return this;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You must provide the
     * name or ID, but not both.
     * </p>
     * 
     * @param pathId
     *        The path identifier of the product. This value is optional if the product has a default path, and required
     *        if the product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You
     *        must provide the name or ID, but not both.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You must provide the
     * name or ID, but not both.
     * </p>
     * 
     * @return The path identifier of the product. This value is optional if the product has a default path, and
     *         required if the product has more than one path. To list the paths for a product, use
     *         <a>ListLaunchPaths</a>. You must provide the name or ID, but not both.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You must provide the
     * name or ID, but not both.
     * </p>
     * 
     * @param pathId
     *        The path identifier of the product. This value is optional if the product has a default path, and required
     *        if the product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You
     *        must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * The name of the path. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param pathName
     *        The name of the path. You must provide the name or ID, but not both.
     */

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    /**
     * <p>
     * The name of the path. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The name of the path. You must provide the name or ID, but not both.
     */

    public String getPathName() {
        return this.pathName;
    }

    /**
     * <p>
     * The name of the path. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param pathName
     *        The name of the path. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withPathName(String pathName) {
        setPathName(pathName);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be
     * updated after the product is provisioned.
     * </p>
     * 
     * @param provisionedProductName
     *        A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot
     *        be updated after the product is provisioned.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be
     * updated after the product is provisioned.
     * </p>
     * 
     * @return A user-friendly name for the provisioned product. This value must be unique for the AWS account and
     *         cannot be updated after the product is provisioned.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be
     * updated after the product is provisioned.
     * </p>
     * 
     * @param provisionedProductName
     *        A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot
     *        be updated after the product is provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @return Parameters specified by the administrator that are required for provisioning the product.
     */

    public java.util.List<ProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     */

    public void setProvisioningParameters(java.util.Collection<ProvisioningParameter> provisioningParameters) {
        if (provisioningParameters == null) {
            this.provisioningParameters = null;
            return;
        }

        this.provisioningParameters = new java.util.ArrayList<ProvisioningParameter>(provisioningParameters);
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningParameters(java.util.Collection)} or
     * {@link #withProvisioningParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisioningParameters(ProvisioningParameter... provisioningParameters) {
        if (this.provisioningParameters == null) {
            setProvisioningParameters(new java.util.ArrayList<ProvisioningParameter>(provisioningParameters.length));
        }
        for (ProvisioningParameter ele : provisioningParameters) {
            this.provisioningParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisioningParameters(java.util.Collection<ProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
        return this;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences for a stack set.
     * </p>
     * 
     * @param provisioningPreferences
     *        An object that contains information about the provisioning preferences for a stack set.
     */

    public void setProvisioningPreferences(ProvisioningPreferences provisioningPreferences) {
        this.provisioningPreferences = provisioningPreferences;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences for a stack set.
     * </p>
     * 
     * @return An object that contains information about the provisioning preferences for a stack set.
     */

    public ProvisioningPreferences getProvisioningPreferences() {
        return this.provisioningPreferences;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences for a stack set.
     * </p>
     * 
     * @param provisioningPreferences
     *        An object that contains information about the provisioning preferences for a stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisioningPreferences(ProvisioningPreferences provisioningPreferences) {
        setProvisioningPreferences(provisioningPreferences);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
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
     * One or more tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withTags(Tag... tags) {
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
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @return Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     */

    public java.util.List<String> getNotificationArns() {
        return notificationArns;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     */

    public void setNotificationArns(java.util.Collection<String> notificationArns) {
        if (notificationArns == null) {
            this.notificationArns = null;
            return;
        }

        this.notificationArns = new java.util.ArrayList<String>(notificationArns);
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationArns(java.util.Collection)} or {@link #withNotificationArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withNotificationArns(String... notificationArns) {
        if (this.notificationArns == null) {
            setNotificationArns(new java.util.ArrayList<String>(notificationArns.length));
        }
        for (String ele : notificationArns) {
            this.notificationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withNotificationArns(java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
        return this;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * 
     * @param provisionToken
     *        An idempotency token that uniquely identifies the provisioning request.
     */

    public void setProvisionToken(String provisionToken) {
        this.provisionToken = provisionToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * 
     * @return An idempotency token that uniquely identifies the provisioning request.
     */

    public String getProvisionToken() {
        return this.provisionToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * 
     * @param provisionToken
     *        An idempotency token that uniquely identifies the provisioning request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisionToken(String provisionToken) {
        setProvisionToken(provisionToken);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getProvisioningArtifactName() != null)
            sb.append("ProvisioningArtifactName: ").append(getProvisioningArtifactName()).append(",");
        if (getPathId() != null)
            sb.append("PathId: ").append(getPathId()).append(",");
        if (getPathName() != null)
            sb.append("PathName: ").append(getPathName()).append(",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: ").append(getProvisionedProductName()).append(",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: ").append(getProvisioningParameters()).append(",");
        if (getProvisioningPreferences() != null)
            sb.append("ProvisioningPreferences: ").append(getProvisioningPreferences()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: ").append(getNotificationArns()).append(",");
        if (getProvisionToken() != null)
            sb.append("ProvisionToken: ").append(getProvisionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionProductRequest == false)
            return false;
        ProvisionProductRequest other = (ProvisionProductRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getProvisioningArtifactName() == null ^ this.getProvisioningArtifactName() == null)
            return false;
        if (other.getProvisioningArtifactName() != null && other.getProvisioningArtifactName().equals(this.getProvisioningArtifactName()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getPathName() == null ^ this.getPathName() == null)
            return false;
        if (other.getPathName() != null && other.getPathName().equals(this.getPathName()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        if (other.getProvisioningPreferences() == null ^ this.getProvisioningPreferences() == null)
            return false;
        if (other.getProvisioningPreferences() != null && other.getProvisioningPreferences().equals(this.getProvisioningPreferences()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getProvisionToken() == null ^ this.getProvisionToken() == null)
            return false;
        if (other.getProvisionToken() != null && other.getProvisionToken().equals(this.getProvisionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactName() == null) ? 0 : getProvisioningArtifactName().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getPathName() == null) ? 0 : getPathName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters().hashCode());
        hashCode = prime * hashCode + ((getProvisioningPreferences() == null) ? 0 : getProvisioningPreferences().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime * hashCode + ((getProvisionToken() == null) ? 0 : getProvisionToken().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionProductRequest clone() {
        return (ProvisionProductRequest) super.clone();
    }

}

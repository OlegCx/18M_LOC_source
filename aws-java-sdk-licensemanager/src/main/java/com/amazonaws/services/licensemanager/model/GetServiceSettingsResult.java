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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * SNS topic configured to receive notifications from License Manager.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * Indicates whether AWS Organizations is integrated with License Manager for cross-account discovery.
     * </p>
     */
    private OrganizationConfiguration organizationConfiguration;
    /**
     * <p>
     * Indicates whether cross-account discovery is enabled.
     * </p>
     */
    private Boolean enableCrossAccountsDiscovery;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide member
     * accounts with access to this share.
     * </p>
     */
    private String licenseManagerResourceShareArn;

    /**
     * <p>
     * Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
     * </p>
     * 
     * @param s3BucketArn
     *        Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
     * </p>
     * 
     * @return Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
     * </p>
     * 
     * @param s3BucketArn
     *        Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * SNS topic configured to receive notifications from License Manager.
     * </p>
     * 
     * @param snsTopicArn
     *        SNS topic configured to receive notifications from License Manager.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * SNS topic configured to receive notifications from License Manager.
     * </p>
     * 
     * @return SNS topic configured to receive notifications from License Manager.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * SNS topic configured to receive notifications from License Manager.
     * </p>
     * 
     * @param snsTopicArn
     *        SNS topic configured to receive notifications from License Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS Organizations is integrated with License Manager for cross-account discovery.
     * </p>
     * 
     * @param organizationConfiguration
     *        Indicates whether AWS Organizations is integrated with License Manager for cross-account discovery.
     */

    public void setOrganizationConfiguration(OrganizationConfiguration organizationConfiguration) {
        this.organizationConfiguration = organizationConfiguration;
    }

    /**
     * <p>
     * Indicates whether AWS Organizations is integrated with License Manager for cross-account discovery.
     * </p>
     * 
     * @return Indicates whether AWS Organizations is integrated with License Manager for cross-account discovery.
     */

    public OrganizationConfiguration getOrganizationConfiguration() {
        return this.organizationConfiguration;
    }

    /**
     * <p>
     * Indicates whether AWS Organizations is integrated with License Manager for cross-account discovery.
     * </p>
     * 
     * @param organizationConfiguration
     *        Indicates whether AWS Organizations is integrated with License Manager for cross-account discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withOrganizationConfiguration(OrganizationConfiguration organizationConfiguration) {
        setOrganizationConfiguration(organizationConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates whether cross-account discovery is enabled.
     * </p>
     * 
     * @param enableCrossAccountsDiscovery
     *        Indicates whether cross-account discovery is enabled.
     */

    public void setEnableCrossAccountsDiscovery(Boolean enableCrossAccountsDiscovery) {
        this.enableCrossAccountsDiscovery = enableCrossAccountsDiscovery;
    }

    /**
     * <p>
     * Indicates whether cross-account discovery is enabled.
     * </p>
     * 
     * @return Indicates whether cross-account discovery is enabled.
     */

    public Boolean getEnableCrossAccountsDiscovery() {
        return this.enableCrossAccountsDiscovery;
    }

    /**
     * <p>
     * Indicates whether cross-account discovery is enabled.
     * </p>
     * 
     * @param enableCrossAccountsDiscovery
     *        Indicates whether cross-account discovery is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withEnableCrossAccountsDiscovery(Boolean enableCrossAccountsDiscovery) {
        setEnableCrossAccountsDiscovery(enableCrossAccountsDiscovery);
        return this;
    }

    /**
     * <p>
     * Indicates whether cross-account discovery is enabled.
     * </p>
     * 
     * @return Indicates whether cross-account discovery is enabled.
     */

    public Boolean isEnableCrossAccountsDiscovery() {
        return this.enableCrossAccountsDiscovery;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide member
     * accounts with access to this share.
     * </p>
     * 
     * @param licenseManagerResourceShareArn
     *        Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide
     *        member accounts with access to this share.
     */

    public void setLicenseManagerResourceShareArn(String licenseManagerResourceShareArn) {
        this.licenseManagerResourceShareArn = licenseManagerResourceShareArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide member
     * accounts with access to this share.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide
     *         member accounts with access to this share.
     */

    public String getLicenseManagerResourceShareArn() {
        return this.licenseManagerResourceShareArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide member
     * accounts with access to this share.
     * </p>
     * 
     * @param licenseManagerResourceShareArn
     *        Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide
     *        member accounts with access to this share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withLicenseManagerResourceShareArn(String licenseManagerResourceShareArn) {
        setLicenseManagerResourceShareArn(licenseManagerResourceShareArn);
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
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getOrganizationConfiguration() != null)
            sb.append("OrganizationConfiguration: ").append(getOrganizationConfiguration()).append(",");
        if (getEnableCrossAccountsDiscovery() != null)
            sb.append("EnableCrossAccountsDiscovery: ").append(getEnableCrossAccountsDiscovery()).append(",");
        if (getLicenseManagerResourceShareArn() != null)
            sb.append("LicenseManagerResourceShareArn: ").append(getLicenseManagerResourceShareArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceSettingsResult == false)
            return false;
        GetServiceSettingsResult other = (GetServiceSettingsResult) obj;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getOrganizationConfiguration() == null ^ this.getOrganizationConfiguration() == null)
            return false;
        if (other.getOrganizationConfiguration() != null && other.getOrganizationConfiguration().equals(this.getOrganizationConfiguration()) == false)
            return false;
        if (other.getEnableCrossAccountsDiscovery() == null ^ this.getEnableCrossAccountsDiscovery() == null)
            return false;
        if (other.getEnableCrossAccountsDiscovery() != null && other.getEnableCrossAccountsDiscovery().equals(this.getEnableCrossAccountsDiscovery()) == false)
            return false;
        if (other.getLicenseManagerResourceShareArn() == null ^ this.getLicenseManagerResourceShareArn() == null)
            return false;
        if (other.getLicenseManagerResourceShareArn() != null
                && other.getLicenseManagerResourceShareArn().equals(this.getLicenseManagerResourceShareArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getOrganizationConfiguration() == null) ? 0 : getOrganizationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnableCrossAccountsDiscovery() == null) ? 0 : getEnableCrossAccountsDiscovery().hashCode());
        hashCode = prime * hashCode + ((getLicenseManagerResourceShareArn() == null) ? 0 : getLicenseManagerResourceShareArn().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceSettingsResult clone() {
        try {
            return (GetServiceSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

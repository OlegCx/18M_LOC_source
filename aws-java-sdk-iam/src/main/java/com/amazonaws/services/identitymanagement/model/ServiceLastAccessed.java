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
 * Contains details about the most recent attempt to access the service.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetServiceLastAccessedDetails</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ServiceLastAccessed" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLastAccessed implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private java.util.Date lastAuthenticated;
    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Actions, resources, and condition keys for AWS services</a> in the <i>Service Authorization Reference</i>.
     * Choose the name of the service to view details for that service. In the first paragraph, find the service prefix.
     * For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private String lastAuthenticatedEntity;
    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last attempted to access the service. AWS does not
     * report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private String lastAuthenticatedRegion;
    /**
     * <p>
     * The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to access
     * the service.
     * </p>
     * <p>
     * This field is null if no principals attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private Integer totalAuthenticatedEntities;
    /**
     * <p>
     * An object that contains details about the most recent attempt to access a tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did not use the tracked actions within the <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was generated at the service level and not the
     * action level. For more information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrackedActionLastAccessed> trackedActionsLastAccessed;

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     * 
     * @param serviceName
     *        The name of the service in which access was attempted.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     * 
     * @return The name of the service in which access was attempted.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     * 
     * @param serviceName
     *        The name of the service in which access was attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLastAccessed withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticated
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *        authenticated entity most recently attempted to access the service. AWS does not report unauthenticated
     *        requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setLastAuthenticated(java.util.Date lastAuthenticated) {
        this.lastAuthenticated = lastAuthenticated;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *         authenticated entity most recently attempted to access the service. AWS does not report unauthenticated
     *         requests.</p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public java.util.Date getLastAuthenticated() {
        return this.lastAuthenticated;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticated
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *        authenticated entity most recently attempted to access the service. AWS does not report unauthenticated
     *        requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLastAccessed withLastAuthenticated(java.util.Date lastAuthenticated) {
        setLastAuthenticated(lastAuthenticated);
        return this;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Actions, resources, and condition keys for AWS services</a> in the <i>Service Authorization Reference</i>.
     * Choose the name of the service to view details for that service. In the first paragraph, find the service prefix.
     * For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the service in which access was attempted.</p>
     *        <p>
     *        To learn the service namespace of a service, see <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, resources, and condition keys for AWS services</a> in the <i>Service Authorization
     *        Reference</i>. Choose the name of the service to view details for that service. In the first paragraph,
     *        find the service prefix. For example, <code>(service prefix: a4b)</code>. For more information about
     *        service namespaces, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Actions, resources, and condition keys for AWS services</a> in the <i>Service Authorization Reference</i>.
     * Choose the name of the service to view details for that service. In the first paragraph, find the service prefix.
     * For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The namespace of the service in which access was attempted.</p>
     *         <p>
     *         To learn the service namespace of a service, see <a href=
     *         "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *         >Actions, resources, and condition keys for AWS services</a> in the <i>Service Authorization
     *         Reference</i>. Choose the name of the service to view details for that service. In the first paragraph,
     *         find the service prefix. For example, <code>(service prefix: a4b)</code>. For more information about
     *         service namespaces, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Actions, resources, and condition keys for AWS services</a> in the <i>Service Authorization Reference</i>.
     * Choose the name of the service to view details for that service. In the first paragraph, find the service prefix.
     * For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the service in which access was attempted.</p>
     *        <p>
     *        To learn the service namespace of a service, see <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, resources, and condition keys for AWS services</a> in the <i>Service Authorization
     *        Reference</i>. Choose the name of the service to view details for that service. In the first paragraph,
     *        find the service prefix. For example, <code>(service prefix: a4b)</code>. For more information about
     *        service namespaces, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLastAccessed withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticatedEntity
     *        The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not
     *        report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setLastAuthenticatedEntity(String lastAuthenticatedEntity) {
        this.lastAuthenticatedEntity = lastAuthenticatedEntity;
    }

    /**
     * <p>
     * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does
     *         not report unauthenticated requests.</p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public String getLastAuthenticatedEntity() {
        return this.lastAuthenticatedEntity;
    }

    /**
     * <p>
     * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticatedEntity
     *        The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not
     *        report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLastAccessed withLastAuthenticatedEntity(String lastAuthenticatedEntity) {
        setLastAuthenticatedEntity(lastAuthenticatedEntity);
        return this;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last attempted to access the service. AWS does not
     * report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticatedRegion
     *        The Region from which the authenticated entity (user or role) last attempted to access the service. AWS
     *        does not report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setLastAuthenticatedRegion(String lastAuthenticatedRegion) {
        this.lastAuthenticatedRegion = lastAuthenticatedRegion;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last attempted to access the service. AWS does not
     * report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The Region from which the authenticated entity (user or role) last attempted to access the service. AWS
     *         does not report unauthenticated requests.</p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public String getLastAuthenticatedRegion() {
        return this.lastAuthenticatedRegion;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last attempted to access the service. AWS does not
     * report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticatedRegion
     *        The Region from which the authenticated entity (user or role) last attempted to access the service. AWS
     *        does not report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLastAccessed withLastAuthenticatedRegion(String lastAuthenticatedRegion) {
        setLastAuthenticatedRegion(lastAuthenticatedRegion);
        return this;
    }

    /**
     * <p>
     * The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to access
     * the service.
     * </p>
     * <p>
     * This field is null if no principals attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param totalAuthenticatedEntities
     *        The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to
     *        access the service.</p>
     *        <p>
     *        This field is null if no principals attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
        this.totalAuthenticatedEntities = totalAuthenticatedEntities;
    }

    /**
     * <p>
     * The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to access
     * the service.
     * </p>
     * <p>
     * This field is null if no principals attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to
     *         access the service.</p>
     *         <p>
     *         This field is null if no principals attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public Integer getTotalAuthenticatedEntities() {
        return this.totalAuthenticatedEntities;
    }

    /**
     * <p>
     * The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to access
     * the service.
     * </p>
     * <p>
     * This field is null if no principals attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param totalAuthenticatedEntities
     *        The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to
     *        access the service.</p>
     *        <p>
     *        This field is null if no principals attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLastAccessed withTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
        setTotalAuthenticatedEntities(totalAuthenticatedEntities);
        return this;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did not use the tracked actions within the <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was generated at the service level and not the
     * action level. For more information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     * 
     * @return An object that contains details about the most recent attempt to access a tracked action within the
     *         service.</p>
     *         <p>
     *         This field is null if there no tracked actions or if the principal did not use the tracked actions within
     *         the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>. This field is also null if the report was generated at the service level and not
     *         the action level. For more information, see the <code>Granularity</code> field in
     *         <a>GenerateServiceLastAccessedDetails</a>.
     */

    public java.util.List<TrackedActionLastAccessed> getTrackedActionsLastAccessed() {
        if (trackedActionsLastAccessed == null) {
            trackedActionsLastAccessed = new com.amazonaws.internal.SdkInternalList<TrackedActionLastAccessed>();
        }
        return trackedActionsLastAccessed;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did not use the tracked actions within the <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was generated at the service level and not the
     * action level. For more information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     * 
     * @param trackedActionsLastAccessed
     *        An object that contains details about the most recent attempt to access a tracked action within the
     *        service.</p>
     *        <p>
     *        This field is null if there no tracked actions or if the principal did not use the tracked actions within
     *        the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>. This field is also null if the report was generated at the service level and not
     *        the action level. For more information, see the <code>Granularity</code> field in
     *        <a>GenerateServiceLastAccessedDetails</a>.
     */

    public void setTrackedActionsLastAccessed(java.util.Collection<TrackedActionLastAccessed> trackedActionsLastAccessed) {
        if (trackedActionsLastAccessed == null) {
            this.trackedActionsLastAccessed = null;
            return;
        }

        this.trackedActionsLastAccessed = new com.amazonaws.internal.SdkInternalList<TrackedActionLastAccessed>(trackedActionsLastAccessed);
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did not use the tracked actions within the <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was generated at the service level and not the
     * action level. For more information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrackedActionsLastAccessed(java.util.Collection)} or
     * {@link #withTrackedActionsLastAccessed(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trackedActionsLastAccessed
     *        An object that contains details about the most recent attempt to access a tracked action within the
     *        service.</p>
     *        <p>
     *        This field is null if there no tracked actions or if the principal did not use the tracked actions within
     *        the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>. This field is also null if the report was generated at the service level and not
     *        the action level. For more information, see the <code>Granularity</code> field in
     *        <a>GenerateServiceLastAccessedDetails</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLastAccessed withTrackedActionsLastAccessed(TrackedActionLastAccessed... trackedActionsLastAccessed) {
        if (this.trackedActionsLastAccessed == null) {
            setTrackedActionsLastAccessed(new com.amazonaws.internal.SdkInternalList<TrackedActionLastAccessed>(trackedActionsLastAccessed.length));
        }
        for (TrackedActionLastAccessed ele : trackedActionsLastAccessed) {
            this.trackedActionsLastAccessed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did not use the tracked actions within the <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was generated at the service level and not the
     * action level. For more information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     * 
     * @param trackedActionsLastAccessed
     *        An object that contains details about the most recent attempt to access a tracked action within the
     *        service.</p>
     *        <p>
     *        This field is null if there no tracked actions or if the principal did not use the tracked actions within
     *        the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>. This field is also null if the report was generated at the service level and not
     *        the action level. For more information, see the <code>Granularity</code> field in
     *        <a>GenerateServiceLastAccessedDetails</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLastAccessed withTrackedActionsLastAccessed(java.util.Collection<TrackedActionLastAccessed> trackedActionsLastAccessed) {
        setTrackedActionsLastAccessed(trackedActionsLastAccessed);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getLastAuthenticated() != null)
            sb.append("LastAuthenticated: ").append(getLastAuthenticated()).append(",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getLastAuthenticatedEntity() != null)
            sb.append("LastAuthenticatedEntity: ").append(getLastAuthenticatedEntity()).append(",");
        if (getLastAuthenticatedRegion() != null)
            sb.append("LastAuthenticatedRegion: ").append(getLastAuthenticatedRegion()).append(",");
        if (getTotalAuthenticatedEntities() != null)
            sb.append("TotalAuthenticatedEntities: ").append(getTotalAuthenticatedEntities()).append(",");
        if (getTrackedActionsLastAccessed() != null)
            sb.append("TrackedActionsLastAccessed: ").append(getTrackedActionsLastAccessed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLastAccessed == false)
            return false;
        ServiceLastAccessed other = (ServiceLastAccessed) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getLastAuthenticated() == null ^ this.getLastAuthenticated() == null)
            return false;
        if (other.getLastAuthenticated() != null && other.getLastAuthenticated().equals(this.getLastAuthenticated()) == false)
            return false;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getLastAuthenticatedEntity() == null ^ this.getLastAuthenticatedEntity() == null)
            return false;
        if (other.getLastAuthenticatedEntity() != null && other.getLastAuthenticatedEntity().equals(this.getLastAuthenticatedEntity()) == false)
            return false;
        if (other.getLastAuthenticatedRegion() == null ^ this.getLastAuthenticatedRegion() == null)
            return false;
        if (other.getLastAuthenticatedRegion() != null && other.getLastAuthenticatedRegion().equals(this.getLastAuthenticatedRegion()) == false)
            return false;
        if (other.getTotalAuthenticatedEntities() == null ^ this.getTotalAuthenticatedEntities() == null)
            return false;
        if (other.getTotalAuthenticatedEntities() != null && other.getTotalAuthenticatedEntities().equals(this.getTotalAuthenticatedEntities()) == false)
            return false;
        if (other.getTrackedActionsLastAccessed() == null ^ this.getTrackedActionsLastAccessed() == null)
            return false;
        if (other.getTrackedActionsLastAccessed() != null && other.getTrackedActionsLastAccessed().equals(this.getTrackedActionsLastAccessed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getLastAuthenticated() == null) ? 0 : getLastAuthenticated().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getLastAuthenticatedEntity() == null) ? 0 : getLastAuthenticatedEntity().hashCode());
        hashCode = prime * hashCode + ((getLastAuthenticatedRegion() == null) ? 0 : getLastAuthenticatedRegion().hashCode());
        hashCode = prime * hashCode + ((getTotalAuthenticatedEntities() == null) ? 0 : getTotalAuthenticatedEntities().hashCode());
        hashCode = prime * hashCode + ((getTrackedActionsLastAccessed() == null) ? 0 : getTrackedActionsLastAccessed().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLastAccessed clone() {
        try {
            return (ServiceLastAccessed) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

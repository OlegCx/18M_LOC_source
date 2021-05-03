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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/AppSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the application.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String importedAppId;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Status of the application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message related to the status of the application
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Status of the replication configuration.
     * </p>
     */
    private String replicationConfigurationStatus;
    /**
     * <p>
     * The replication status of the application.
     * </p>
     */
    private String replicationStatus;
    /**
     * <p>
     * A message related to the replication status of the application.
     * </p>
     */
    private String replicationStatusMessage;
    /**
     * <p>
     * The timestamp of the application's most recent successful replication.
     * </p>
     */
    private java.util.Date latestReplicationTime;
    /**
     * <p>
     * Status of the launch configuration.
     * </p>
     */
    private String launchConfigurationStatus;
    /**
     * <p>
     * The launch status of the application.
     * </p>
     */
    private String launchStatus;
    /**
     * <p>
     * A message related to the launch status of the application.
     * </p>
     */
    private String launchStatusMessage;
    /**
     * <p>
     * Details about the latest launch of the application.
     * </p>
     */
    private LaunchDetails launchDetails;
    /**
     * <p>
     * The creation time of the application.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last modified time of the application.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The name of the service role in the customer's account used by AWS SMS.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The number of server groups present in the application.
     * </p>
     */
    private Integer totalServerGroups;
    /**
     * <p>
     * The number of servers present in the application.
     * </p>
     */
    private Integer totalServers;

    /**
     * <p>
     * The unique ID of the application.
     * </p>
     * 
     * @param appId
     *        The unique ID of the application.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID of the application.
     * </p>
     * 
     * @return The unique ID of the application.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID of the application.
     * </p>
     * 
     * @param appId
     *        The unique ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param importedAppId
     *        The ID of the application.
     */

    public void setImportedAppId(String importedAppId) {
        this.importedAppId = importedAppId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getImportedAppId() {
        return this.importedAppId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param importedAppId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withImportedAppId(String importedAppId) {
        setImportedAppId(importedAppId);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @see AppStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @return Status of the application.
     * @see AppStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatus
     */

    public AppSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatus
     */

    public AppSummary withStatus(AppStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message related to the status of the application
     * </p>
     * 
     * @param statusMessage
     *        A message related to the status of the application
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message related to the status of the application
     * </p>
     * 
     * @return A message related to the status of the application
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message related to the status of the application
     * </p>
     * 
     * @param statusMessage
     *        A message related to the status of the application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Status of the replication configuration.
     * </p>
     * 
     * @param replicationConfigurationStatus
     *        Status of the replication configuration.
     * @see AppReplicationConfigurationStatus
     */

    public void setReplicationConfigurationStatus(String replicationConfigurationStatus) {
        this.replicationConfigurationStatus = replicationConfigurationStatus;
    }

    /**
     * <p>
     * Status of the replication configuration.
     * </p>
     * 
     * @return Status of the replication configuration.
     * @see AppReplicationConfigurationStatus
     */

    public String getReplicationConfigurationStatus() {
        return this.replicationConfigurationStatus;
    }

    /**
     * <p>
     * Status of the replication configuration.
     * </p>
     * 
     * @param replicationConfigurationStatus
     *        Status of the replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppReplicationConfigurationStatus
     */

    public AppSummary withReplicationConfigurationStatus(String replicationConfigurationStatus) {
        setReplicationConfigurationStatus(replicationConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * Status of the replication configuration.
     * </p>
     * 
     * @param replicationConfigurationStatus
     *        Status of the replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppReplicationConfigurationStatus
     */

    public AppSummary withReplicationConfigurationStatus(AppReplicationConfigurationStatus replicationConfigurationStatus) {
        this.replicationConfigurationStatus = replicationConfigurationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The replication status of the application.
     * </p>
     * 
     * @param replicationStatus
     *        The replication status of the application.
     * @see AppReplicationStatus
     */

    public void setReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    /**
     * <p>
     * The replication status of the application.
     * </p>
     * 
     * @return The replication status of the application.
     * @see AppReplicationStatus
     */

    public String getReplicationStatus() {
        return this.replicationStatus;
    }

    /**
     * <p>
     * The replication status of the application.
     * </p>
     * 
     * @param replicationStatus
     *        The replication status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppReplicationStatus
     */

    public AppSummary withReplicationStatus(String replicationStatus) {
        setReplicationStatus(replicationStatus);
        return this;
    }

    /**
     * <p>
     * The replication status of the application.
     * </p>
     * 
     * @param replicationStatus
     *        The replication status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppReplicationStatus
     */

    public AppSummary withReplicationStatus(AppReplicationStatus replicationStatus) {
        this.replicationStatus = replicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message related to the replication status of the application.
     * </p>
     * 
     * @param replicationStatusMessage
     *        A message related to the replication status of the application.
     */

    public void setReplicationStatusMessage(String replicationStatusMessage) {
        this.replicationStatusMessage = replicationStatusMessage;
    }

    /**
     * <p>
     * A message related to the replication status of the application.
     * </p>
     * 
     * @return A message related to the replication status of the application.
     */

    public String getReplicationStatusMessage() {
        return this.replicationStatusMessage;
    }

    /**
     * <p>
     * A message related to the replication status of the application.
     * </p>
     * 
     * @param replicationStatusMessage
     *        A message related to the replication status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withReplicationStatusMessage(String replicationStatusMessage) {
        setReplicationStatusMessage(replicationStatusMessage);
        return this;
    }

    /**
     * <p>
     * The timestamp of the application's most recent successful replication.
     * </p>
     * 
     * @param latestReplicationTime
     *        The timestamp of the application's most recent successful replication.
     */

    public void setLatestReplicationTime(java.util.Date latestReplicationTime) {
        this.latestReplicationTime = latestReplicationTime;
    }

    /**
     * <p>
     * The timestamp of the application's most recent successful replication.
     * </p>
     * 
     * @return The timestamp of the application's most recent successful replication.
     */

    public java.util.Date getLatestReplicationTime() {
        return this.latestReplicationTime;
    }

    /**
     * <p>
     * The timestamp of the application's most recent successful replication.
     * </p>
     * 
     * @param latestReplicationTime
     *        The timestamp of the application's most recent successful replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withLatestReplicationTime(java.util.Date latestReplicationTime) {
        setLatestReplicationTime(latestReplicationTime);
        return this;
    }

    /**
     * <p>
     * Status of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationStatus
     *        Status of the launch configuration.
     * @see AppLaunchConfigurationStatus
     */

    public void setLaunchConfigurationStatus(String launchConfigurationStatus) {
        this.launchConfigurationStatus = launchConfigurationStatus;
    }

    /**
     * <p>
     * Status of the launch configuration.
     * </p>
     * 
     * @return Status of the launch configuration.
     * @see AppLaunchConfigurationStatus
     */

    public String getLaunchConfigurationStatus() {
        return this.launchConfigurationStatus;
    }

    /**
     * <p>
     * Status of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationStatus
     *        Status of the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppLaunchConfigurationStatus
     */

    public AppSummary withLaunchConfigurationStatus(String launchConfigurationStatus) {
        setLaunchConfigurationStatus(launchConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * Status of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationStatus
     *        Status of the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppLaunchConfigurationStatus
     */

    public AppSummary withLaunchConfigurationStatus(AppLaunchConfigurationStatus launchConfigurationStatus) {
        this.launchConfigurationStatus = launchConfigurationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The launch status of the application.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of the application.
     * @see AppLaunchStatus
     */

    public void setLaunchStatus(String launchStatus) {
        this.launchStatus = launchStatus;
    }

    /**
     * <p>
     * The launch status of the application.
     * </p>
     * 
     * @return The launch status of the application.
     * @see AppLaunchStatus
     */

    public String getLaunchStatus() {
        return this.launchStatus;
    }

    /**
     * <p>
     * The launch status of the application.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppLaunchStatus
     */

    public AppSummary withLaunchStatus(String launchStatus) {
        setLaunchStatus(launchStatus);
        return this;
    }

    /**
     * <p>
     * The launch status of the application.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppLaunchStatus
     */

    public AppSummary withLaunchStatus(AppLaunchStatus launchStatus) {
        this.launchStatus = launchStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message related to the launch status of the application.
     * </p>
     * 
     * @param launchStatusMessage
     *        A message related to the launch status of the application.
     */

    public void setLaunchStatusMessage(String launchStatusMessage) {
        this.launchStatusMessage = launchStatusMessage;
    }

    /**
     * <p>
     * A message related to the launch status of the application.
     * </p>
     * 
     * @return A message related to the launch status of the application.
     */

    public String getLaunchStatusMessage() {
        return this.launchStatusMessage;
    }

    /**
     * <p>
     * A message related to the launch status of the application.
     * </p>
     * 
     * @param launchStatusMessage
     *        A message related to the launch status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withLaunchStatusMessage(String launchStatusMessage) {
        setLaunchStatusMessage(launchStatusMessage);
        return this;
    }

    /**
     * <p>
     * Details about the latest launch of the application.
     * </p>
     * 
     * @param launchDetails
     *        Details about the latest launch of the application.
     */

    public void setLaunchDetails(LaunchDetails launchDetails) {
        this.launchDetails = launchDetails;
    }

    /**
     * <p>
     * Details about the latest launch of the application.
     * </p>
     * 
     * @return Details about the latest launch of the application.
     */

    public LaunchDetails getLaunchDetails() {
        return this.launchDetails;
    }

    /**
     * <p>
     * Details about the latest launch of the application.
     * </p>
     * 
     * @param launchDetails
     *        Details about the latest launch of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withLaunchDetails(LaunchDetails launchDetails) {
        setLaunchDetails(launchDetails);
        return this;
    }

    /**
     * <p>
     * The creation time of the application.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the application.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the application.
     * </p>
     * 
     * @return The creation time of the application.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the application.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last modified time of the application.
     * </p>
     * 
     * @param lastModified
     *        The last modified time of the application.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The last modified time of the application.
     * </p>
     * 
     * @return The last modified time of the application.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The last modified time of the application.
     * </p>
     * 
     * @param lastModified
     *        The last modified time of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @param roleName
     *        The name of the service role in the customer's account used by AWS SMS.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @return The name of the service role in the customer's account used by AWS SMS.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @param roleName
     *        The name of the service role in the customer's account used by AWS SMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The number of server groups present in the application.
     * </p>
     * 
     * @param totalServerGroups
     *        The number of server groups present in the application.
     */

    public void setTotalServerGroups(Integer totalServerGroups) {
        this.totalServerGroups = totalServerGroups;
    }

    /**
     * <p>
     * The number of server groups present in the application.
     * </p>
     * 
     * @return The number of server groups present in the application.
     */

    public Integer getTotalServerGroups() {
        return this.totalServerGroups;
    }

    /**
     * <p>
     * The number of server groups present in the application.
     * </p>
     * 
     * @param totalServerGroups
     *        The number of server groups present in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withTotalServerGroups(Integer totalServerGroups) {
        setTotalServerGroups(totalServerGroups);
        return this;
    }

    /**
     * <p>
     * The number of servers present in the application.
     * </p>
     * 
     * @param totalServers
     *        The number of servers present in the application.
     */

    public void setTotalServers(Integer totalServers) {
        this.totalServers = totalServers;
    }

    /**
     * <p>
     * The number of servers present in the application.
     * </p>
     * 
     * @return The number of servers present in the application.
     */

    public Integer getTotalServers() {
        return this.totalServers;
    }

    /**
     * <p>
     * The number of servers present in the application.
     * </p>
     * 
     * @param totalServers
     *        The number of servers present in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSummary withTotalServers(Integer totalServers) {
        setTotalServers(totalServers);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getImportedAppId() != null)
            sb.append("ImportedAppId: ").append(getImportedAppId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getReplicationConfigurationStatus() != null)
            sb.append("ReplicationConfigurationStatus: ").append(getReplicationConfigurationStatus()).append(",");
        if (getReplicationStatus() != null)
            sb.append("ReplicationStatus: ").append(getReplicationStatus()).append(",");
        if (getReplicationStatusMessage() != null)
            sb.append("ReplicationStatusMessage: ").append(getReplicationStatusMessage()).append(",");
        if (getLatestReplicationTime() != null)
            sb.append("LatestReplicationTime: ").append(getLatestReplicationTime()).append(",");
        if (getLaunchConfigurationStatus() != null)
            sb.append("LaunchConfigurationStatus: ").append(getLaunchConfigurationStatus()).append(",");
        if (getLaunchStatus() != null)
            sb.append("LaunchStatus: ").append(getLaunchStatus()).append(",");
        if (getLaunchStatusMessage() != null)
            sb.append("LaunchStatusMessage: ").append(getLaunchStatusMessage()).append(",");
        if (getLaunchDetails() != null)
            sb.append("LaunchDetails: ").append(getLaunchDetails()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getTotalServerGroups() != null)
            sb.append("TotalServerGroups: ").append(getTotalServerGroups()).append(",");
        if (getTotalServers() != null)
            sb.append("TotalServers: ").append(getTotalServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppSummary == false)
            return false;
        AppSummary other = (AppSummary) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getImportedAppId() == null ^ this.getImportedAppId() == null)
            return false;
        if (other.getImportedAppId() != null && other.getImportedAppId().equals(this.getImportedAppId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getReplicationConfigurationStatus() == null ^ this.getReplicationConfigurationStatus() == null)
            return false;
        if (other.getReplicationConfigurationStatus() != null
                && other.getReplicationConfigurationStatus().equals(this.getReplicationConfigurationStatus()) == false)
            return false;
        if (other.getReplicationStatus() == null ^ this.getReplicationStatus() == null)
            return false;
        if (other.getReplicationStatus() != null && other.getReplicationStatus().equals(this.getReplicationStatus()) == false)
            return false;
        if (other.getReplicationStatusMessage() == null ^ this.getReplicationStatusMessage() == null)
            return false;
        if (other.getReplicationStatusMessage() != null && other.getReplicationStatusMessage().equals(this.getReplicationStatusMessage()) == false)
            return false;
        if (other.getLatestReplicationTime() == null ^ this.getLatestReplicationTime() == null)
            return false;
        if (other.getLatestReplicationTime() != null && other.getLatestReplicationTime().equals(this.getLatestReplicationTime()) == false)
            return false;
        if (other.getLaunchConfigurationStatus() == null ^ this.getLaunchConfigurationStatus() == null)
            return false;
        if (other.getLaunchConfigurationStatus() != null && other.getLaunchConfigurationStatus().equals(this.getLaunchConfigurationStatus()) == false)
            return false;
        if (other.getLaunchStatus() == null ^ this.getLaunchStatus() == null)
            return false;
        if (other.getLaunchStatus() != null && other.getLaunchStatus().equals(this.getLaunchStatus()) == false)
            return false;
        if (other.getLaunchStatusMessage() == null ^ this.getLaunchStatusMessage() == null)
            return false;
        if (other.getLaunchStatusMessage() != null && other.getLaunchStatusMessage().equals(this.getLaunchStatusMessage()) == false)
            return false;
        if (other.getLaunchDetails() == null ^ this.getLaunchDetails() == null)
            return false;
        if (other.getLaunchDetails() != null && other.getLaunchDetails().equals(this.getLaunchDetails()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getTotalServerGroups() == null ^ this.getTotalServerGroups() == null)
            return false;
        if (other.getTotalServerGroups() != null && other.getTotalServerGroups().equals(this.getTotalServerGroups()) == false)
            return false;
        if (other.getTotalServers() == null ^ this.getTotalServers() == null)
            return false;
        if (other.getTotalServers() != null && other.getTotalServers().equals(this.getTotalServers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getImportedAppId() == null) ? 0 : getImportedAppId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfigurationStatus() == null) ? 0 : getReplicationConfigurationStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatus() == null) ? 0 : getReplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatusMessage() == null) ? 0 : getReplicationStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLatestReplicationTime() == null) ? 0 : getLatestReplicationTime().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationStatus() == null) ? 0 : getLaunchConfigurationStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchStatus() == null) ? 0 : getLaunchStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchStatusMessage() == null) ? 0 : getLaunchStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLaunchDetails() == null) ? 0 : getLaunchDetails().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getTotalServerGroups() == null) ? 0 : getTotalServerGroups().hashCode());
        hashCode = prime * hashCode + ((getTotalServers() == null) ? 0 : getTotalServers().hashCode());
        return hashCode;
    }

    @Override
    public AppSummary clone() {
        try {
            return (AppSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.AppSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

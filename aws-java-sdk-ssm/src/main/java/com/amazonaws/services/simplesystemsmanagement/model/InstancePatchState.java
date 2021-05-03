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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the high-level patch compliance state for a managed instance, providing information about the number of
 * installed, missing, not applicable, and failed patches along with metadata about the operation when this information
 * was gathered for the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InstancePatchState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancePatchState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the managed instance the high-level patch compliance information was collected for.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the patch group the managed instance belongs to.
     * </p>
     */
    private String patchGroup;
    /**
     * <p>
     * The ID of the patch baseline used to patch the instance.
     * </p>
     */
    private String baselineId;
    /**
     * <p>
     * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list,
     * which you maintain in an S3 bucket in YAML format and specify in the SSM document
     * <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.
     * </p>
     * <p>
     * For more information about the <code>InstallOverrideList</code> parameter, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html"
     * >About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private String installOverrideList;
    /**
     * <p>
     * Placeholder information. This field will always be empty in the current release of the service.
     * </p>
     */
    private String ownerInformation;
    /**
     * <p>
     * The number of patches from the patch baseline that are installed on the instance.
     * </p>
     */
    private Integer installedCount;
    /**
     * <p>
     * The number of patches not specified in the patch baseline that are installed on the instance.
     * </p>
     */
    private Integer installedOtherCount;
    /**
     * <p>
     * The number of patches installed by Patch Manager since the last time the instance was rebooted.
     * </p>
     */
    private Integer installedPendingRebootCount;
    /**
     * <p>
     * The number of patches installed on an instance that are specified in a <code>RejectedPatches</code> list. Patches
     * with a status of <i>InstalledRejected</i> were typically installed before they were added to a
     * <code>RejectedPatches</code> list.
     * </p>
     * <note>
     * <p>
     * If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the value of
     * <code>InstalledRejectedCount</code> will always be <code>0</code> (zero).
     * </p>
     * </note>
     */
    private Integer installedRejectedCount;
    /**
     * <p>
     * The number of patches from the patch baseline that are applicable for the instance but aren't currently
     * installed.
     * </p>
     */
    private Integer missingCount;
    /**
     * <p>
     * The number of patches from the patch baseline that were attempted to be installed during the last patching
     * operation, but failed to install.
     * </p>
     */
    private Integer failedCount;
    /**
     * <p>
     * The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name
     * to Systems Manager Inventory.
     * </p>
     */
    private Integer unreportedNotApplicableCount;
    /**
     * <p>
     * The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't
     * installed on the instance. This number may be truncated if the list of patch names is very large. The number of
     * patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.
     * </p>
     */
    private Integer notApplicableCount;
    /**
     * <p>
     * The time the most recent patching operation was started on the instance.
     * </p>
     */
    private java.util.Date operationStartTime;
    /**
     * <p>
     * The time the most recent patching operation completed on the instance.
     * </p>
     */
    private java.util.Date operationEndTime;
    /**
     * <p>
     * The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     * <code>INSTALL</code> (install missing patches).
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.
     * </p>
     */
    private java.util.Date lastNoRebootInstallOperationTime;
    /**
     * <p>
     * Indicates the reboot option specified in the patch baseline.
     * </p>
     * <note>
     * <p>
     * Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     * <code>Scan</code> operations.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches
     * are detected with a status of <code>InstalledPendingReboot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches
     * installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not
     * be in effect until a reboot is performed.
     * </p>
     * </li>
     * </ul>
     */
    private String rebootOption;
    /**
     * <p>
     * The number of instances where patches that are specified as "Critical" for compliance reporting in the patch
     * baseline are not installed. These patches might be missing, have failed installation, were rejected, or were
     * installed but awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     */
    private Integer criticalNonCompliantCount;
    /**
     * <p>
     * The number of instances where patches that are specified as "Security" in a patch advisory are not installed.
     * These patches might be missing, have failed installation, were rejected, or were installed but awaiting a
     * required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     */
    private Integer securityNonCompliantCount;
    /**
     * <p>
     * The number of instances with patches installed that are specified as other than "Critical" or "Security" but are
     * not compliant with the patch baseline. The status of these instances is NON_COMPLIANT.
     * </p>
     */
    private Integer otherNonCompliantCount;

    /**
     * <p>
     * The ID of the managed instance the high-level patch compliance information was collected for.
     * </p>
     * 
     * @param instanceId
     *        The ID of the managed instance the high-level patch compliance information was collected for.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the managed instance the high-level patch compliance information was collected for.
     * </p>
     * 
     * @return The ID of the managed instance the high-level patch compliance information was collected for.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the managed instance the high-level patch compliance information was collected for.
     * </p>
     * 
     * @param instanceId
     *        The ID of the managed instance the high-level patch compliance information was collected for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the patch group the managed instance belongs to.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group the managed instance belongs to.
     */

    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>
     * The name of the patch group the managed instance belongs to.
     * </p>
     * 
     * @return The name of the patch group the managed instance belongs to.
     */

    public String getPatchGroup() {
        return this.patchGroup;
    }

    /**
     * <p>
     * The name of the patch group the managed instance belongs to.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group the managed instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withPatchGroup(String patchGroup) {
        setPatchGroup(patchGroup);
        return this;
    }

    /**
     * <p>
     * The ID of the patch baseline used to patch the instance.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline used to patch the instance.
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline used to patch the instance.
     * </p>
     * 
     * @return The ID of the patch baseline used to patch the instance.
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline used to patch the instance.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline used to patch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withBaselineId(String baselineId) {
        setBaselineId(baselineId);
        return this;
    }

    /**
     * <p>
     * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the patch baseline snapshot used during the patching operation when this compliance data was
     *        collected.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
     * </p>
     * 
     * @return The ID of the patch baseline snapshot used during the patching operation when this compliance data was
     *         collected.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the patch baseline snapshot used during the patching operation when this compliance data was
     *        collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list,
     * which you maintain in an S3 bucket in YAML format and specify in the SSM document
     * <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.
     * </p>
     * <p>
     * For more information about the <code>InstallOverrideList</code> parameter, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html"
     * >About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param installOverrideList
     *        An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation
     *        list, which you maintain in an S3 bucket in YAML format and specify in the SSM document
     *        <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p>
     *        <p>
     *        For more information about the <code>InstallOverrideList</code> parameter, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html"
     *        >About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setInstallOverrideList(String installOverrideList) {
        this.installOverrideList = installOverrideList;
    }

    /**
     * <p>
     * An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list,
     * which you maintain in an S3 bucket in YAML format and specify in the SSM document
     * <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.
     * </p>
     * <p>
     * For more information about the <code>InstallOverrideList</code> parameter, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html"
     * >About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation
     *         list, which you maintain in an S3 bucket in YAML format and specify in the SSM document
     *         <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p>
     *         <p>
     *         For more information about the <code>InstallOverrideList</code> parameter, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html"
     *         >About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public String getInstallOverrideList() {
        return this.installOverrideList;
    }

    /**
     * <p>
     * An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list,
     * which you maintain in an S3 bucket in YAML format and specify in the SSM document
     * <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.
     * </p>
     * <p>
     * For more information about the <code>InstallOverrideList</code> parameter, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html"
     * >About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param installOverrideList
     *        An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation
     *        list, which you maintain in an S3 bucket in YAML format and specify in the SSM document
     *        <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p>
     *        <p>
     *        For more information about the <code>InstallOverrideList</code> parameter, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html"
     *        >About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withInstallOverrideList(String installOverrideList) {
        setInstallOverrideList(installOverrideList);
        return this;
    }

    /**
     * <p>
     * Placeholder information. This field will always be empty in the current release of the service.
     * </p>
     * 
     * @param ownerInformation
     *        Placeholder information. This field will always be empty in the current release of the service.
     */

    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>
     * Placeholder information. This field will always be empty in the current release of the service.
     * </p>
     * 
     * @return Placeholder information. This field will always be empty in the current release of the service.
     */

    public String getOwnerInformation() {
        return this.ownerInformation;
    }

    /**
     * <p>
     * Placeholder information. This field will always be empty in the current release of the service.
     * </p>
     * 
     * @param ownerInformation
     *        Placeholder information. This field will always be empty in the current release of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withOwnerInformation(String ownerInformation) {
        setOwnerInformation(ownerInformation);
        return this;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that are installed on the instance.
     * </p>
     * 
     * @param installedCount
     *        The number of patches from the patch baseline that are installed on the instance.
     */

    public void setInstalledCount(Integer installedCount) {
        this.installedCount = installedCount;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that are installed on the instance.
     * </p>
     * 
     * @return The number of patches from the patch baseline that are installed on the instance.
     */

    public Integer getInstalledCount() {
        return this.installedCount;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that are installed on the instance.
     * </p>
     * 
     * @param installedCount
     *        The number of patches from the patch baseline that are installed on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withInstalledCount(Integer installedCount) {
        setInstalledCount(installedCount);
        return this;
    }

    /**
     * <p>
     * The number of patches not specified in the patch baseline that are installed on the instance.
     * </p>
     * 
     * @param installedOtherCount
     *        The number of patches not specified in the patch baseline that are installed on the instance.
     */

    public void setInstalledOtherCount(Integer installedOtherCount) {
        this.installedOtherCount = installedOtherCount;
    }

    /**
     * <p>
     * The number of patches not specified in the patch baseline that are installed on the instance.
     * </p>
     * 
     * @return The number of patches not specified in the patch baseline that are installed on the instance.
     */

    public Integer getInstalledOtherCount() {
        return this.installedOtherCount;
    }

    /**
     * <p>
     * The number of patches not specified in the patch baseline that are installed on the instance.
     * </p>
     * 
     * @param installedOtherCount
     *        The number of patches not specified in the patch baseline that are installed on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withInstalledOtherCount(Integer installedOtherCount) {
        setInstalledOtherCount(installedOtherCount);
        return this;
    }

    /**
     * <p>
     * The number of patches installed by Patch Manager since the last time the instance was rebooted.
     * </p>
     * 
     * @param installedPendingRebootCount
     *        The number of patches installed by Patch Manager since the last time the instance was rebooted.
     */

    public void setInstalledPendingRebootCount(Integer installedPendingRebootCount) {
        this.installedPendingRebootCount = installedPendingRebootCount;
    }

    /**
     * <p>
     * The number of patches installed by Patch Manager since the last time the instance was rebooted.
     * </p>
     * 
     * @return The number of patches installed by Patch Manager since the last time the instance was rebooted.
     */

    public Integer getInstalledPendingRebootCount() {
        return this.installedPendingRebootCount;
    }

    /**
     * <p>
     * The number of patches installed by Patch Manager since the last time the instance was rebooted.
     * </p>
     * 
     * @param installedPendingRebootCount
     *        The number of patches installed by Patch Manager since the last time the instance was rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withInstalledPendingRebootCount(Integer installedPendingRebootCount) {
        setInstalledPendingRebootCount(installedPendingRebootCount);
        return this;
    }

    /**
     * <p>
     * The number of patches installed on an instance that are specified in a <code>RejectedPatches</code> list. Patches
     * with a status of <i>InstalledRejected</i> were typically installed before they were added to a
     * <code>RejectedPatches</code> list.
     * </p>
     * <note>
     * <p>
     * If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the value of
     * <code>InstalledRejectedCount</code> will always be <code>0</code> (zero).
     * </p>
     * </note>
     * 
     * @param installedRejectedCount
     *        The number of patches installed on an instance that are specified in a <code>RejectedPatches</code> list.
     *        Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a
     *        <code>RejectedPatches</code> list.</p> <note>
     *        <p>
     *        If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the
     *        value of <code>InstalledRejectedCount</code> will always be <code>0</code> (zero).
     *        </p>
     */

    public void setInstalledRejectedCount(Integer installedRejectedCount) {
        this.installedRejectedCount = installedRejectedCount;
    }

    /**
     * <p>
     * The number of patches installed on an instance that are specified in a <code>RejectedPatches</code> list. Patches
     * with a status of <i>InstalledRejected</i> were typically installed before they were added to a
     * <code>RejectedPatches</code> list.
     * </p>
     * <note>
     * <p>
     * If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the value of
     * <code>InstalledRejectedCount</code> will always be <code>0</code> (zero).
     * </p>
     * </note>
     * 
     * @return The number of patches installed on an instance that are specified in a <code>RejectedPatches</code> list.
     *         Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a
     *         <code>RejectedPatches</code> list.</p> <note>
     *         <p>
     *         If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the
     *         value of <code>InstalledRejectedCount</code> will always be <code>0</code> (zero).
     *         </p>
     */

    public Integer getInstalledRejectedCount() {
        return this.installedRejectedCount;
    }

    /**
     * <p>
     * The number of patches installed on an instance that are specified in a <code>RejectedPatches</code> list. Patches
     * with a status of <i>InstalledRejected</i> were typically installed before they were added to a
     * <code>RejectedPatches</code> list.
     * </p>
     * <note>
     * <p>
     * If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the value of
     * <code>InstalledRejectedCount</code> will always be <code>0</code> (zero).
     * </p>
     * </note>
     * 
     * @param installedRejectedCount
     *        The number of patches installed on an instance that are specified in a <code>RejectedPatches</code> list.
     *        Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a
     *        <code>RejectedPatches</code> list.</p> <note>
     *        <p>
     *        If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the
     *        value of <code>InstalledRejectedCount</code> will always be <code>0</code> (zero).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withInstalledRejectedCount(Integer installedRejectedCount) {
        setInstalledRejectedCount(installedRejectedCount);
        return this;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that are applicable for the instance but aren't currently
     * installed.
     * </p>
     * 
     * @param missingCount
     *        The number of patches from the patch baseline that are applicable for the instance but aren't currently
     *        installed.
     */

    public void setMissingCount(Integer missingCount) {
        this.missingCount = missingCount;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that are applicable for the instance but aren't currently
     * installed.
     * </p>
     * 
     * @return The number of patches from the patch baseline that are applicable for the instance but aren't currently
     *         installed.
     */

    public Integer getMissingCount() {
        return this.missingCount;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that are applicable for the instance but aren't currently
     * installed.
     * </p>
     * 
     * @param missingCount
     *        The number of patches from the patch baseline that are applicable for the instance but aren't currently
     *        installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withMissingCount(Integer missingCount) {
        setMissingCount(missingCount);
        return this;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that were attempted to be installed during the last patching
     * operation, but failed to install.
     * </p>
     * 
     * @param failedCount
     *        The number of patches from the patch baseline that were attempted to be installed during the last patching
     *        operation, but failed to install.
     */

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that were attempted to be installed during the last patching
     * operation, but failed to install.
     * </p>
     * 
     * @return The number of patches from the patch baseline that were attempted to be installed during the last
     *         patching operation, but failed to install.
     */

    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that were attempted to be installed during the last patching
     * operation, but failed to install.
     * </p>
     * 
     * @param failedCount
     *        The number of patches from the patch baseline that were attempted to be installed during the last patching
     *        operation, but failed to install.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withFailedCount(Integer failedCount) {
        setFailedCount(failedCount);
        return this;
    }

    /**
     * <p>
     * The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name
     * to Systems Manager Inventory.
     * </p>
     * 
     * @param unreportedNotApplicableCount
     *        The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported
     *        by name to Systems Manager Inventory.
     */

    public void setUnreportedNotApplicableCount(Integer unreportedNotApplicableCount) {
        this.unreportedNotApplicableCount = unreportedNotApplicableCount;
    }

    /**
     * <p>
     * The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name
     * to Systems Manager Inventory.
     * </p>
     * 
     * @return The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported
     *         by name to Systems Manager Inventory.
     */

    public Integer getUnreportedNotApplicableCount() {
        return this.unreportedNotApplicableCount;
    }

    /**
     * <p>
     * The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name
     * to Systems Manager Inventory.
     * </p>
     * 
     * @param unreportedNotApplicableCount
     *        The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported
     *        by name to Systems Manager Inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withUnreportedNotApplicableCount(Integer unreportedNotApplicableCount) {
        setUnreportedNotApplicableCount(unreportedNotApplicableCount);
        return this;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't
     * installed on the instance. This number may be truncated if the list of patch names is very large. The number of
     * patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.
     * </p>
     * 
     * @param notApplicableCount
     *        The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't
     *        installed on the instance. This number may be truncated if the list of patch names is very large. The
     *        number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.
     */

    public void setNotApplicableCount(Integer notApplicableCount) {
        this.notApplicableCount = notApplicableCount;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't
     * installed on the instance. This number may be truncated if the list of patch names is very large. The number of
     * patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.
     * </p>
     * 
     * @return The number of patches from the patch baseline that aren't applicable for the instance and therefore
     *         aren't installed on the instance. This number may be truncated if the list of patch names is very large.
     *         The number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.
     */

    public Integer getNotApplicableCount() {
        return this.notApplicableCount;
    }

    /**
     * <p>
     * The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't
     * installed on the instance. This number may be truncated if the list of patch names is very large. The number of
     * patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.
     * </p>
     * 
     * @param notApplicableCount
     *        The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't
     *        installed on the instance. This number may be truncated if the list of patch names is very large. The
     *        number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withNotApplicableCount(Integer notApplicableCount) {
        setNotApplicableCount(notApplicableCount);
        return this;
    }

    /**
     * <p>
     * The time the most recent patching operation was started on the instance.
     * </p>
     * 
     * @param operationStartTime
     *        The time the most recent patching operation was started on the instance.
     */

    public void setOperationStartTime(java.util.Date operationStartTime) {
        this.operationStartTime = operationStartTime;
    }

    /**
     * <p>
     * The time the most recent patching operation was started on the instance.
     * </p>
     * 
     * @return The time the most recent patching operation was started on the instance.
     */

    public java.util.Date getOperationStartTime() {
        return this.operationStartTime;
    }

    /**
     * <p>
     * The time the most recent patching operation was started on the instance.
     * </p>
     * 
     * @param operationStartTime
     *        The time the most recent patching operation was started on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withOperationStartTime(java.util.Date operationStartTime) {
        setOperationStartTime(operationStartTime);
        return this;
    }

    /**
     * <p>
     * The time the most recent patching operation completed on the instance.
     * </p>
     * 
     * @param operationEndTime
     *        The time the most recent patching operation completed on the instance.
     */

    public void setOperationEndTime(java.util.Date operationEndTime) {
        this.operationEndTime = operationEndTime;
    }

    /**
     * <p>
     * The time the most recent patching operation completed on the instance.
     * </p>
     * 
     * @return The time the most recent patching operation completed on the instance.
     */

    public java.util.Date getOperationEndTime() {
        return this.operationEndTime;
    }

    /**
     * <p>
     * The time the most recent patching operation completed on the instance.
     * </p>
     * 
     * @param operationEndTime
     *        The time the most recent patching operation completed on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withOperationEndTime(java.util.Date operationEndTime) {
        setOperationEndTime(operationEndTime);
        return this;
    }

    /**
     * <p>
     * The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     * <code>INSTALL</code> (install missing patches).
     * </p>
     * 
     * @param operation
     *        The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     *        <code>INSTALL</code> (install missing patches).
     * @see PatchOperationType
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     * <code>INSTALL</code> (install missing patches).
     * </p>
     * 
     * @return The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     *         <code>INSTALL</code> (install missing patches).
     * @see PatchOperationType
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     * <code>INSTALL</code> (install missing patches).
     * </p>
     * 
     * @param operation
     *        The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     *        <code>INSTALL</code> (install missing patches).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchOperationType
     */

    public InstancePatchState withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     * <code>INSTALL</code> (install missing patches).
     * </p>
     * 
     * @param operation
     *        The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     *        <code>INSTALL</code> (install missing patches).
     * @see PatchOperationType
     */

    public void setOperation(PatchOperationType operation) {
        withOperation(operation);
    }

    /**
     * <p>
     * The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     * <code>INSTALL</code> (install missing patches).
     * </p>
     * 
     * @param operation
     *        The type of patching operation that was performed: <code>SCAN</code> (assess patch compliance state) or
     *        <code>INSTALL</code> (install missing patches).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchOperationType
     */

    public InstancePatchState withOperation(PatchOperationType operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.
     * </p>
     * 
     * @param lastNoRebootInstallOperationTime
     *        The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot
     *        option.
     */

    public void setLastNoRebootInstallOperationTime(java.util.Date lastNoRebootInstallOperationTime) {
        this.lastNoRebootInstallOperationTime = lastNoRebootInstallOperationTime;
    }

    /**
     * <p>
     * The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.
     * </p>
     * 
     * @return The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot
     *         option.
     */

    public java.util.Date getLastNoRebootInstallOperationTime() {
        return this.lastNoRebootInstallOperationTime;
    }

    /**
     * <p>
     * The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.
     * </p>
     * 
     * @param lastNoRebootInstallOperationTime
     *        The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot
     *        option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withLastNoRebootInstallOperationTime(java.util.Date lastNoRebootInstallOperationTime) {
        setLastNoRebootInstallOperationTime(lastNoRebootInstallOperationTime);
        return this;
    }

    /**
     * <p>
     * Indicates the reboot option specified in the patch baseline.
     * </p>
     * <note>
     * <p>
     * Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     * <code>Scan</code> operations.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches
     * are detected with a status of <code>InstalledPendingReboot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches
     * installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not
     * be in effect until a reboot is performed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rebootOption
     *        Indicates the reboot option specified in the patch baseline.</p> <note>
     *        <p>
     *        Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     *        <code>Scan</code> operations.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any
     *        patches are detected with a status of <code>InstalledPendingReboot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system.
     *        Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These
     *        patches might not be in effect until a reboot is performed.
     *        </p>
     *        </li>
     * @see RebootOption
     */

    public void setRebootOption(String rebootOption) {
        this.rebootOption = rebootOption;
    }

    /**
     * <p>
     * Indicates the reboot option specified in the patch baseline.
     * </p>
     * <note>
     * <p>
     * Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     * <code>Scan</code> operations.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches
     * are detected with a status of <code>InstalledPendingReboot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches
     * installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not
     * be in effect until a reboot is performed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the reboot option specified in the patch baseline.</p> <note>
     *         <p>
     *         Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     *         <code>Scan</code> operations.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any
     *         patches are detected with a status of <code>InstalledPendingReboot</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system.
     *         Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These
     *         patches might not be in effect until a reboot is performed.
     *         </p>
     *         </li>
     * @see RebootOption
     */

    public String getRebootOption() {
        return this.rebootOption;
    }

    /**
     * <p>
     * Indicates the reboot option specified in the patch baseline.
     * </p>
     * <note>
     * <p>
     * Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     * <code>Scan</code> operations.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches
     * are detected with a status of <code>InstalledPendingReboot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches
     * installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not
     * be in effect until a reboot is performed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rebootOption
     *        Indicates the reboot option specified in the patch baseline.</p> <note>
     *        <p>
     *        Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     *        <code>Scan</code> operations.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any
     *        patches are detected with a status of <code>InstalledPendingReboot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system.
     *        Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These
     *        patches might not be in effect until a reboot is performed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RebootOption
     */

    public InstancePatchState withRebootOption(String rebootOption) {
        setRebootOption(rebootOption);
        return this;
    }

    /**
     * <p>
     * Indicates the reboot option specified in the patch baseline.
     * </p>
     * <note>
     * <p>
     * Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     * <code>Scan</code> operations.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches
     * are detected with a status of <code>InstalledPendingReboot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches
     * installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not
     * be in effect until a reboot is performed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rebootOption
     *        Indicates the reboot option specified in the patch baseline.</p> <note>
     *        <p>
     *        Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     *        <code>Scan</code> operations.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any
     *        patches are detected with a status of <code>InstalledPendingReboot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system.
     *        Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These
     *        patches might not be in effect until a reboot is performed.
     *        </p>
     *        </li>
     * @see RebootOption
     */

    public void setRebootOption(RebootOption rebootOption) {
        withRebootOption(rebootOption);
    }

    /**
     * <p>
     * Indicates the reboot option specified in the patch baseline.
     * </p>
     * <note>
     * <p>
     * Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     * <code>Scan</code> operations.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches
     * are detected with a status of <code>InstalledPendingReboot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches
     * installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not
     * be in effect until a reboot is performed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rebootOption
     *        Indicates the reboot option specified in the patch baseline.</p> <note>
     *        <p>
     *        Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager
     *        <code>Scan</code> operations.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any
     *        patches are detected with a status of <code>InstalledPendingReboot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system.
     *        Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These
     *        patches might not be in effect until a reboot is performed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RebootOption
     */

    public InstancePatchState withRebootOption(RebootOption rebootOption) {
        this.rebootOption = rebootOption.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as "Critical" for compliance reporting in the patch
     * baseline are not installed. These patches might be missing, have failed installation, were rejected, or were
     * installed but awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param criticalNonCompliantCount
     *        The number of instances where patches that are specified as "Critical" for compliance reporting in the
     *        patch baseline are not installed. These patches might be missing, have failed installation, were rejected,
     *        or were installed but awaiting a required instance reboot. The status of these instances is
     *        <code>NON_COMPLIANT</code>.
     */

    public void setCriticalNonCompliantCount(Integer criticalNonCompliantCount) {
        this.criticalNonCompliantCount = criticalNonCompliantCount;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as "Critical" for compliance reporting in the patch
     * baseline are not installed. These patches might be missing, have failed installation, were rejected, or were
     * installed but awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return The number of instances where patches that are specified as "Critical" for compliance reporting in the
     *         patch baseline are not installed. These patches might be missing, have failed installation, were
     *         rejected, or were installed but awaiting a required instance reboot. The status of these instances is
     *         <code>NON_COMPLIANT</code>.
     */

    public Integer getCriticalNonCompliantCount() {
        return this.criticalNonCompliantCount;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as "Critical" for compliance reporting in the patch
     * baseline are not installed. These patches might be missing, have failed installation, were rejected, or were
     * installed but awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param criticalNonCompliantCount
     *        The number of instances where patches that are specified as "Critical" for compliance reporting in the
     *        patch baseline are not installed. These patches might be missing, have failed installation, were rejected,
     *        or were installed but awaiting a required instance reboot. The status of these instances is
     *        <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withCriticalNonCompliantCount(Integer criticalNonCompliantCount) {
        setCriticalNonCompliantCount(criticalNonCompliantCount);
        return this;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as "Security" in a patch advisory are not installed.
     * These patches might be missing, have failed installation, were rejected, or were installed but awaiting a
     * required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param securityNonCompliantCount
     *        The number of instances where patches that are specified as "Security" in a patch advisory are not
     *        installed. These patches might be missing, have failed installation, were rejected, or were installed but
     *        awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     */

    public void setSecurityNonCompliantCount(Integer securityNonCompliantCount) {
        this.securityNonCompliantCount = securityNonCompliantCount;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as "Security" in a patch advisory are not installed.
     * These patches might be missing, have failed installation, were rejected, or were installed but awaiting a
     * required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return The number of instances where patches that are specified as "Security" in a patch advisory are not
     *         installed. These patches might be missing, have failed installation, were rejected, or were installed but
     *         awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     */

    public Integer getSecurityNonCompliantCount() {
        return this.securityNonCompliantCount;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as "Security" in a patch advisory are not installed.
     * These patches might be missing, have failed installation, were rejected, or were installed but awaiting a
     * required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param securityNonCompliantCount
     *        The number of instances where patches that are specified as "Security" in a patch advisory are not
     *        installed. These patches might be missing, have failed installation, were rejected, or were installed but
     *        awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withSecurityNonCompliantCount(Integer securityNonCompliantCount) {
        setSecurityNonCompliantCount(securityNonCompliantCount);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified as other than "Critical" or "Security" but are
     * not compliant with the patch baseline. The status of these instances is NON_COMPLIANT.
     * </p>
     * 
     * @param otherNonCompliantCount
     *        The number of instances with patches installed that are specified as other than "Critical" or "Security"
     *        but are not compliant with the patch baseline. The status of these instances is NON_COMPLIANT.
     */

    public void setOtherNonCompliantCount(Integer otherNonCompliantCount) {
        this.otherNonCompliantCount = otherNonCompliantCount;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified as other than "Critical" or "Security" but are
     * not compliant with the patch baseline. The status of these instances is NON_COMPLIANT.
     * </p>
     * 
     * @return The number of instances with patches installed that are specified as other than "Critical" or "Security"
     *         but are not compliant with the patch baseline. The status of these instances is NON_COMPLIANT.
     */

    public Integer getOtherNonCompliantCount() {
        return this.otherNonCompliantCount;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified as other than "Critical" or "Security" but are
     * not compliant with the patch baseline. The status of these instances is NON_COMPLIANT.
     * </p>
     * 
     * @param otherNonCompliantCount
     *        The number of instances with patches installed that are specified as other than "Critical" or "Security"
     *        but are not compliant with the patch baseline. The status of these instances is NON_COMPLIANT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePatchState withOtherNonCompliantCount(Integer otherNonCompliantCount) {
        setOtherNonCompliantCount(otherNonCompliantCount);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPatchGroup() != null)
            sb.append("PatchGroup: ").append(getPatchGroup()).append(",");
        if (getBaselineId() != null)
            sb.append("BaselineId: ").append(getBaselineId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getInstallOverrideList() != null)
            sb.append("InstallOverrideList: ").append(getInstallOverrideList()).append(",");
        if (getOwnerInformation() != null)
            sb.append("OwnerInformation: ").append("***Sensitive Data Redacted***").append(",");
        if (getInstalledCount() != null)
            sb.append("InstalledCount: ").append(getInstalledCount()).append(",");
        if (getInstalledOtherCount() != null)
            sb.append("InstalledOtherCount: ").append(getInstalledOtherCount()).append(",");
        if (getInstalledPendingRebootCount() != null)
            sb.append("InstalledPendingRebootCount: ").append(getInstalledPendingRebootCount()).append(",");
        if (getInstalledRejectedCount() != null)
            sb.append("InstalledRejectedCount: ").append(getInstalledRejectedCount()).append(",");
        if (getMissingCount() != null)
            sb.append("MissingCount: ").append(getMissingCount()).append(",");
        if (getFailedCount() != null)
            sb.append("FailedCount: ").append(getFailedCount()).append(",");
        if (getUnreportedNotApplicableCount() != null)
            sb.append("UnreportedNotApplicableCount: ").append(getUnreportedNotApplicableCount()).append(",");
        if (getNotApplicableCount() != null)
            sb.append("NotApplicableCount: ").append(getNotApplicableCount()).append(",");
        if (getOperationStartTime() != null)
            sb.append("OperationStartTime: ").append(getOperationStartTime()).append(",");
        if (getOperationEndTime() != null)
            sb.append("OperationEndTime: ").append(getOperationEndTime()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getLastNoRebootInstallOperationTime() != null)
            sb.append("LastNoRebootInstallOperationTime: ").append(getLastNoRebootInstallOperationTime()).append(",");
        if (getRebootOption() != null)
            sb.append("RebootOption: ").append(getRebootOption()).append(",");
        if (getCriticalNonCompliantCount() != null)
            sb.append("CriticalNonCompliantCount: ").append(getCriticalNonCompliantCount()).append(",");
        if (getSecurityNonCompliantCount() != null)
            sb.append("SecurityNonCompliantCount: ").append(getSecurityNonCompliantCount()).append(",");
        if (getOtherNonCompliantCount() != null)
            sb.append("OtherNonCompliantCount: ").append(getOtherNonCompliantCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancePatchState == false)
            return false;
        InstancePatchState other = (InstancePatchState) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null)
            return false;
        if (other.getPatchGroup() != null && other.getPatchGroup().equals(this.getPatchGroup()) == false)
            return false;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getInstallOverrideList() == null ^ this.getInstallOverrideList() == null)
            return false;
        if (other.getInstallOverrideList() != null && other.getInstallOverrideList().equals(this.getInstallOverrideList()) == false)
            return false;
        if (other.getOwnerInformation() == null ^ this.getOwnerInformation() == null)
            return false;
        if (other.getOwnerInformation() != null && other.getOwnerInformation().equals(this.getOwnerInformation()) == false)
            return false;
        if (other.getInstalledCount() == null ^ this.getInstalledCount() == null)
            return false;
        if (other.getInstalledCount() != null && other.getInstalledCount().equals(this.getInstalledCount()) == false)
            return false;
        if (other.getInstalledOtherCount() == null ^ this.getInstalledOtherCount() == null)
            return false;
        if (other.getInstalledOtherCount() != null && other.getInstalledOtherCount().equals(this.getInstalledOtherCount()) == false)
            return false;
        if (other.getInstalledPendingRebootCount() == null ^ this.getInstalledPendingRebootCount() == null)
            return false;
        if (other.getInstalledPendingRebootCount() != null && other.getInstalledPendingRebootCount().equals(this.getInstalledPendingRebootCount()) == false)
            return false;
        if (other.getInstalledRejectedCount() == null ^ this.getInstalledRejectedCount() == null)
            return false;
        if (other.getInstalledRejectedCount() != null && other.getInstalledRejectedCount().equals(this.getInstalledRejectedCount()) == false)
            return false;
        if (other.getMissingCount() == null ^ this.getMissingCount() == null)
            return false;
        if (other.getMissingCount() != null && other.getMissingCount().equals(this.getMissingCount()) == false)
            return false;
        if (other.getFailedCount() == null ^ this.getFailedCount() == null)
            return false;
        if (other.getFailedCount() != null && other.getFailedCount().equals(this.getFailedCount()) == false)
            return false;
        if (other.getUnreportedNotApplicableCount() == null ^ this.getUnreportedNotApplicableCount() == null)
            return false;
        if (other.getUnreportedNotApplicableCount() != null && other.getUnreportedNotApplicableCount().equals(this.getUnreportedNotApplicableCount()) == false)
            return false;
        if (other.getNotApplicableCount() == null ^ this.getNotApplicableCount() == null)
            return false;
        if (other.getNotApplicableCount() != null && other.getNotApplicableCount().equals(this.getNotApplicableCount()) == false)
            return false;
        if (other.getOperationStartTime() == null ^ this.getOperationStartTime() == null)
            return false;
        if (other.getOperationStartTime() != null && other.getOperationStartTime().equals(this.getOperationStartTime()) == false)
            return false;
        if (other.getOperationEndTime() == null ^ this.getOperationEndTime() == null)
            return false;
        if (other.getOperationEndTime() != null && other.getOperationEndTime().equals(this.getOperationEndTime()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getLastNoRebootInstallOperationTime() == null ^ this.getLastNoRebootInstallOperationTime() == null)
            return false;
        if (other.getLastNoRebootInstallOperationTime() != null
                && other.getLastNoRebootInstallOperationTime().equals(this.getLastNoRebootInstallOperationTime()) == false)
            return false;
        if (other.getRebootOption() == null ^ this.getRebootOption() == null)
            return false;
        if (other.getRebootOption() != null && other.getRebootOption().equals(this.getRebootOption()) == false)
            return false;
        if (other.getCriticalNonCompliantCount() == null ^ this.getCriticalNonCompliantCount() == null)
            return false;
        if (other.getCriticalNonCompliantCount() != null && other.getCriticalNonCompliantCount().equals(this.getCriticalNonCompliantCount()) == false)
            return false;
        if (other.getSecurityNonCompliantCount() == null ^ this.getSecurityNonCompliantCount() == null)
            return false;
        if (other.getSecurityNonCompliantCount() != null && other.getSecurityNonCompliantCount().equals(this.getSecurityNonCompliantCount()) == false)
            return false;
        if (other.getOtherNonCompliantCount() == null ^ this.getOtherNonCompliantCount() == null)
            return false;
        if (other.getOtherNonCompliantCount() != null && other.getOtherNonCompliantCount().equals(this.getOtherNonCompliantCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getInstallOverrideList() == null) ? 0 : getInstallOverrideList().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getInstalledCount() == null) ? 0 : getInstalledCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledOtherCount() == null) ? 0 : getInstalledOtherCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledPendingRebootCount() == null) ? 0 : getInstalledPendingRebootCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledRejectedCount() == null) ? 0 : getInstalledRejectedCount().hashCode());
        hashCode = prime * hashCode + ((getMissingCount() == null) ? 0 : getMissingCount().hashCode());
        hashCode = prime * hashCode + ((getFailedCount() == null) ? 0 : getFailedCount().hashCode());
        hashCode = prime * hashCode + ((getUnreportedNotApplicableCount() == null) ? 0 : getUnreportedNotApplicableCount().hashCode());
        hashCode = prime * hashCode + ((getNotApplicableCount() == null) ? 0 : getNotApplicableCount().hashCode());
        hashCode = prime * hashCode + ((getOperationStartTime() == null) ? 0 : getOperationStartTime().hashCode());
        hashCode = prime * hashCode + ((getOperationEndTime() == null) ? 0 : getOperationEndTime().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getLastNoRebootInstallOperationTime() == null) ? 0 : getLastNoRebootInstallOperationTime().hashCode());
        hashCode = prime * hashCode + ((getRebootOption() == null) ? 0 : getRebootOption().hashCode());
        hashCode = prime * hashCode + ((getCriticalNonCompliantCount() == null) ? 0 : getCriticalNonCompliantCount().hashCode());
        hashCode = prime * hashCode + ((getSecurityNonCompliantCount() == null) ? 0 : getSecurityNonCompliantCount().hashCode());
        hashCode = prime * hashCode + ((getOtherNonCompliantCount() == null) ? 0 : getOtherNonCompliantCount().hashCode());
        return hashCode;
    }

    @Override
    public InstancePatchState clone() {
        try {
            return (InstancePatchState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InstancePatchStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

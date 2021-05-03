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
package com.amazonaws.services.fsx;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;

/**
 * Interface for accessing Amazon FSx asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.fsx.AbstractAmazonFSxAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
 * shared file storage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonFSxAsync extends AmazonFSx {

    /**
     * <p>
     * Use this action to associate one or more Domain Name Server (DNS) aliases with an existing Amazon FSx for Windows
     * File Server file system. A file systen can have a maximum of 50 DNS aliases associated with it at any one time.
     * If you try to associate a DNS alias that is already associated with the file system, FSx takes no action on that
     * alias in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS Aliases</a>
     * and <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html">
     * Walkthrough 5: Using DNS aliases to access your file system</a>, including additional steps you must take to be
     * able to access your file system using a DNS alias.
     * </p>
     * <p>
     * The system response shows the DNS aliases that Amazon FSx is attempting to associate with the file system. Use
     * the API operation to monitor the status of the aliases Amazon FSx is associating with the file system.
     * </p>
     * 
     * @param associateFileSystemAliasesRequest
     *        The request object specifying one or more DNS alias names to associate with an Amazon FSx for Windows File
     *        Server file system.
     * @return A Java Future containing the result of the AssociateFileSystemAliases operation returned by the service.
     * @sample AmazonFSxAsync.AssociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AssociateFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(
            AssociateFileSystemAliasesRequest associateFileSystemAliasesRequest);

    /**
     * <p>
     * Use this action to associate one or more Domain Name Server (DNS) aliases with an existing Amazon FSx for Windows
     * File Server file system. A file systen can have a maximum of 50 DNS aliases associated with it at any one time.
     * If you try to associate a DNS alias that is already associated with the file system, FSx takes no action on that
     * alias in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS Aliases</a>
     * and <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html">
     * Walkthrough 5: Using DNS aliases to access your file system</a>, including additional steps you must take to be
     * able to access your file system using a DNS alias.
     * </p>
     * <p>
     * The system response shows the DNS aliases that Amazon FSx is attempting to associate with the file system. Use
     * the API operation to monitor the status of the aliases Amazon FSx is associating with the file system.
     * </p>
     * 
     * @param associateFileSystemAliasesRequest
     *        The request object specifying one or more DNS alias names to associate with an Amazon FSx for Windows File
     *        Server file system.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateFileSystemAliases operation returned by the service.
     * @sample AmazonFSxAsyncHandler.AssociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AssociateFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(
            AssociateFileSystemAliasesRequest associateFileSystemAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateFileSystemAliasesRequest, AssociateFileSystemAliasesResult> asyncHandler);

    /**
     * <p>
     * Cancels an existing Amazon FSx for Lustre data repository task if that task is in either the <code>PENDING</code>
     * or <code>EXECUTING</code> state. When you cancel a task, Amazon FSx does the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any files that FSx has already exported are not reverted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx continues to export any files that are "in-flight" when the cancel operation is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx does not export any files that have not yet been exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelDataRepositoryTaskRequest
     *        Cancels a data repository task.
     * @return A Java Future containing the result of the CancelDataRepositoryTask operation returned by the service.
     * @sample AmazonFSxAsync.CancelDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CancelDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest);

    /**
     * <p>
     * Cancels an existing Amazon FSx for Lustre data repository task if that task is in either the <code>PENDING</code>
     * or <code>EXECUTING</code> state. When you cancel a task, Amazon FSx does the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any files that FSx has already exported are not reverted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx continues to export any files that are "in-flight" when the cancel operation is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx does not export any files that have not yet been exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelDataRepositoryTaskRequest
     *        Cancels a data repository task.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelDataRepositoryTask operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CancelDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CancelDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelDataRepositoryTaskRequest, CancelDataRepositoryTaskResult> asyncHandler);

    /**
     * <p>
     * Copies an existing backup within the same AWS account to another Region (cross-Region copy) or within the same
     * Region (in-Region copy). You can have up to five backup copy requests in progress to a single destination Region
     * per account.
     * </p>
     * <p>
     * You can use cross-Region backup copies for cross-region disaster recovery. You periodically take backups and copy
     * them to another Region so that in the event of a disaster in the primary Region, you can restore from backup and
     * recover availability quickly in the other Region. You can make cross-Region copies only within your AWS
     * partition.
     * </p>
     * <p>
     * You can also use backup copies to clone your file data set to another Region or within the same Region.
     * </p>
     * <p>
     * You can use the <code>SourceRegion</code> parameter to specify the AWS Region from which the backup will be
     * copied. For example, if you make the call from the <code>us-west-1</code> Region and want to copy a backup from
     * the <code>us-east-2</code> Region, you specify <code>us-east-2</code> in the <code>SourceRegion</code> parameter
     * to make a cross-Region copy. If you don't specify a Region, the backup copy is created in the same Region where
     * the request is sent from (in-Region copy).
     * </p>
     * <p>
     * For more information on creating backup copies, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/copy-backups.html"> Copying backups</a> in the
     * <i>Amazon FSx for Windows User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/copy-backups.html">Copying backups</a> in the <i>Amazon
     * FSx for Lustre User Guide</i>.
     * </p>
     * 
     * @param copyBackupRequest
     * @return A Java Future containing the result of the CopyBackup operation returned by the service.
     * @sample AmazonFSxAsync.CopyBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopyBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest copyBackupRequest);

    /**
     * <p>
     * Copies an existing backup within the same AWS account to another Region (cross-Region copy) or within the same
     * Region (in-Region copy). You can have up to five backup copy requests in progress to a single destination Region
     * per account.
     * </p>
     * <p>
     * You can use cross-Region backup copies for cross-region disaster recovery. You periodically take backups and copy
     * them to another Region so that in the event of a disaster in the primary Region, you can restore from backup and
     * recover availability quickly in the other Region. You can make cross-Region copies only within your AWS
     * partition.
     * </p>
     * <p>
     * You can also use backup copies to clone your file data set to another Region or within the same Region.
     * </p>
     * <p>
     * You can use the <code>SourceRegion</code> parameter to specify the AWS Region from which the backup will be
     * copied. For example, if you make the call from the <code>us-west-1</code> Region and want to copy a backup from
     * the <code>us-east-2</code> Region, you specify <code>us-east-2</code> in the <code>SourceRegion</code> parameter
     * to make a cross-Region copy. If you don't specify a Region, the backup copy is created in the same Region where
     * the request is sent from (in-Region copy).
     * </p>
     * <p>
     * For more information on creating backup copies, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/copy-backups.html"> Copying backups</a> in the
     * <i>Amazon FSx for Windows User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/copy-backups.html">Copying backups</a> in the <i>Amazon
     * FSx for Lustre User Guide</i>.
     * </p>
     * 
     * @param copyBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CopyBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopyBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest copyBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CopyBackupRequest, CopyBackupResult> asyncHandler);

    /**
     * <p>
     * Creates a backup of an existing Amazon FSx file system. Creating regular backups for your file system is a best
     * practice, enabling you to restore a file system from a backup if an issue arises with the original file system.
     * </p>
     * <p>
     * For Amazon FSx for Lustre file systems, you can create a backup only for file systems with the following
     * configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * a Persistent deployment type
     * </p>
     * </li>
     * <li>
     * <p>
     * is <i>not</i> linked to a data respository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about backing up Amazon FSx for Lustre file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with FSx for Lustre
     * backups</a>.
     * </p>
     * <p>
     * For more information about backing up Amazon FSx for Windows file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html">Working with FSx for Windows
     * backups</a>.
     * </p>
     * <p>
     * If a backup with the specified client request token exists, and the parameters match, this operation returns the
     * description of the existing backup. If a backup specified client request token exists, and the parameters don't
     * match, this operation returns <code>IncompatibleParameterError</code>. If a backup with the specified client
     * request token doesn't exist, <code>CreateBackup</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateBackup</code> operation without the risk of
     * creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a backup was created. If you use the same client request token and the initial call created a backup, the
     * operation returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateBackup</code> operation returns while the backup's lifecycle state is still <code>CREATING</code>
     * . You can check the backup creation status by calling the <a>DescribeBackups</a> operation, which returns the
     * backup state along with other information.
     * </p>
     * 
     * @param createBackupRequest
     *        The request object for the <code>CreateBackup</code> operation.
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AmazonFSxAsync.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest);

    /**
     * <p>
     * Creates a backup of an existing Amazon FSx file system. Creating regular backups for your file system is a best
     * practice, enabling you to restore a file system from a backup if an issue arises with the original file system.
     * </p>
     * <p>
     * For Amazon FSx for Lustre file systems, you can create a backup only for file systems with the following
     * configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * a Persistent deployment type
     * </p>
     * </li>
     * <li>
     * <p>
     * is <i>not</i> linked to a data respository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about backing up Amazon FSx for Lustre file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with FSx for Lustre
     * backups</a>.
     * </p>
     * <p>
     * For more information about backing up Amazon FSx for Windows file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html">Working with FSx for Windows
     * backups</a>.
     * </p>
     * <p>
     * If a backup with the specified client request token exists, and the parameters match, this operation returns the
     * description of the existing backup. If a backup specified client request token exists, and the parameters don't
     * match, this operation returns <code>IncompatibleParameterError</code>. If a backup with the specified client
     * request token doesn't exist, <code>CreateBackup</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateBackup</code> operation without the risk of
     * creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a backup was created. If you use the same client request token and the initial call created a backup, the
     * operation returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateBackup</code> operation returns while the backup's lifecycle state is still <code>CREATING</code>
     * . You can check the backup creation status by calling the <a>DescribeBackups</a> operation, which returns the
     * backup state along with other information.
     * </p>
     * 
     * @param createBackupRequest
     *        The request object for the <code>CreateBackup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon FSx for Lustre data repository task. You use data repository tasks to perform bulk operations
     * between your Amazon FSx file system and its linked data repository. An example of a data repository task is
     * exporting any data and metadata changes, including POSIX metadata, to files, directories, and symbolic links
     * (symlinks) from your FSx file system to its linked data repository. A <code>CreateDataRepositoryTask</code>
     * operation will fail if a data repository is not linked to the FSx file system. To learn more about data
     * repository tasks, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-repository-tasks.html">Data Repository Tasks</a>.
     * To learn more about linking a data repository to your file system, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-fs-linked-data-repo.html">Linking your file
     * system to an S3 bucket</a>.
     * </p>
     * 
     * @param createDataRepositoryTaskRequest
     * @return A Java Future containing the result of the CreateDataRepositoryTask operation returned by the service.
     * @sample AmazonFSxAsync.CreateDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest);

    /**
     * <p>
     * Creates an Amazon FSx for Lustre data repository task. You use data repository tasks to perform bulk operations
     * between your Amazon FSx file system and its linked data repository. An example of a data repository task is
     * exporting any data and metadata changes, including POSIX metadata, to files, directories, and symbolic links
     * (symlinks) from your FSx file system to its linked data repository. A <code>CreateDataRepositoryTask</code>
     * operation will fail if a data repository is not linked to the FSx file system. To learn more about data
     * repository tasks, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-repository-tasks.html">Data Repository Tasks</a>.
     * To learn more about linking a data repository to your file system, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-fs-linked-data-repo.html">Linking your file
     * system to an S3 bucket</a>.
     * </p>
     * 
     * @param createDataRepositoryTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataRepositoryTask operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataRepositoryTaskRequest, CreateDataRepositoryTaskResult> asyncHandler);

    /**
     * <p>
     * Creates a new, empty Amazon FSx file system.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match,
     * <code>CreateFileSystem</code> returns the description of the existing file system. If a file system specified
     * client request token exists and the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the specified client request token doesn't exist,
     * <code>CreateFileSystem</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation.
     * This means that calling the operation multiple times with the same client request token has no effect. By using
     * the idempotent operation, you can retry a <code>CreateFileSystem</code> operation without the risk of creating an
     * extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether
     * a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a file system, the client receives success as
     * long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemRequest
     *        The request object used to create a new Amazon FSx file system.
     * @return A Java Future containing the result of the CreateFileSystem operation returned by the service.
     * @sample AmazonFSxAsync.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest createFileSystemRequest);

    /**
     * <p>
     * Creates a new, empty Amazon FSx file system.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match,
     * <code>CreateFileSystem</code> returns the description of the existing file system. If a file system specified
     * client request token exists and the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the specified client request token doesn't exist,
     * <code>CreateFileSystem</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation.
     * This means that calling the operation multiple times with the same client request token has no effect. By using
     * the idempotent operation, you can retry a <code>CreateFileSystem</code> operation without the risk of creating an
     * extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether
     * a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a file system, the client receives success as
     * long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemRequest
     *        The request object used to create a new Amazon FSx file system.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFileSystem operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest createFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon FSx file system from an existing Amazon FSx backup.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match, this operation returns
     * the description of the file system. If a client request token specified by the file system exists and the
     * parameters don't match, this call returns <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist, this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Parameters like Active Directory, default share name, automatic backup, and backup settings default to the
     * parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileSystemFromBackup</code> call without the risk
     * of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it
     * unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call created a file system, the client
     * receives success as long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystemFromBackup</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemFromBackupRequest
     *        The request object for the <code>CreateFileSystemFromBackup</code> operation.
     * @return A Java Future containing the result of the CreateFileSystemFromBackup operation returned by the service.
     * @sample AmazonFSxAsync.CreateFileSystemFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemFromBackup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(
            CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest);

    /**
     * <p>
     * Creates a new Amazon FSx file system from an existing Amazon FSx backup.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match, this operation returns
     * the description of the file system. If a client request token specified by the file system exists and the
     * parameters don't match, this call returns <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist, this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Parameters like Active Directory, default share name, automatic backup, and backup settings default to the
     * parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileSystemFromBackup</code> call without the risk
     * of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it
     * unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call created a file system, the client
     * receives success as long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystemFromBackup</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemFromBackupRequest
     *        The request object for the <code>CreateFileSystemFromBackup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFileSystemFromBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateFileSystemFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemFromBackup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(
            CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemFromBackupRequest, CreateFileSystemFromBackupResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon FSx backup, deleting its contents. After deletion, the backup no longer exists, and its data is
     * gone.
     * </p>
     * <p>
     * The <code>DeleteBackup</code> call returns instantly. The backup will not show up in later
     * <code>DescribeBackups</code> calls.
     * </p>
     * <important>
     * <p>
     * The data in a deleted backup is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteBackupRequest
     *        The request object for <code>DeleteBackup</code> operation.
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AmazonFSxAsync.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes an Amazon FSx backup, deleting its contents. After deletion, the backup no longer exists, and its data is
     * gone.
     * </p>
     * <p>
     * The <code>DeleteBackup</code> call returns instantly. The backup will not show up in later
     * <code>DescribeBackups</code> calls.
     * </p>
     * <important>
     * <p>
     * The data in a deleted backup is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteBackupRequest
     *        The request object for <code>DeleteBackup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler);

    /**
     * <p>
     * Deletes a file system, deleting its contents. After deletion, the file system no longer exists, and its data is
     * gone. Any existing automatic backups will also be deleted.
     * </p>
     * <p>
     * By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon
     * deletion. This final backup is not subject to the file system's retention policy, and must be manually deleted.
     * </p>
     * <p>
     * The <code>DeleteFileSystem</code> action returns while the file system has the <code>DELETING</code> status. You
     * can check the file system deletion status by calling the <a>DescribeFileSystems</a> action, which returns a list
     * of file systems in your account. If you pass the file system ID for a deleted file system, the
     * <a>DescribeFileSystems</a> returns a <code>FileSystemNotFound</code> error.
     * </p>
     * <note>
     * <p>
     * Deleting an Amazon FSx for Lustre file system will fail with a 400 BadRequest if a data repository task is in a
     * <code>PENDING</code> or <code>EXECUTING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * The data in a deleted file system is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileSystemRequest
     *        The request object for <code>DeleteFileSystem</code> operation.
     * @return A Java Future containing the result of the DeleteFileSystem operation returned by the service.
     * @sample AmazonFSxAsync.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest deleteFileSystemRequest);

    /**
     * <p>
     * Deletes a file system, deleting its contents. After deletion, the file system no longer exists, and its data is
     * gone. Any existing automatic backups will also be deleted.
     * </p>
     * <p>
     * By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon
     * deletion. This final backup is not subject to the file system's retention policy, and must be manually deleted.
     * </p>
     * <p>
     * The <code>DeleteFileSystem</code> action returns while the file system has the <code>DELETING</code> status. You
     * can check the file system deletion status by calling the <a>DescribeFileSystems</a> action, which returns a list
     * of file systems in your account. If you pass the file system ID for a deleted file system, the
     * <a>DescribeFileSystems</a> returns a <code>FileSystemNotFound</code> error.
     * </p>
     * <note>
     * <p>
     * Deleting an Amazon FSx for Lustre file system will fail with a 400 BadRequest if a data repository task is in a
     * <code>PENDING</code> or <code>EXECUTING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * The data in a deleted file system is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileSystemRequest
     *        The request object for <code>DeleteFileSystem</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFileSystem operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest deleteFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResult> asyncHandler);

    /**
     * <p>
     * Returns the description of specific Amazon FSx backups, if a <code>BackupIds</code> value is provided for that
     * backup. Otherwise, it returns all backups owned by your AWS account in the AWS Region of the endpoint that you're
     * calling.
     * </p>
     * <p>
     * When retrieving all backups, you can optionally specify the <code>MaxResults</code> parameter to limit the number
     * of backups in a response. If more backups remain, Amazon FSx returns a <code>NextToken</code> value in the
     * response. In this case, send a later request with the <code>NextToken</code> request parameter set to the value
     * of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your backups. <code>DescribeBackups</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of backups returned in the response of one <code>DescribeBackups</code> call and the order of backups
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBackupsRequest
     *        The request object for <code>DescribeBackups</code> operation.
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AmazonFSxAsync.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx backups, if a <code>BackupIds</code> value is provided for that
     * backup. Otherwise, it returns all backups owned by your AWS account in the AWS Region of the endpoint that you're
     * calling.
     * </p>
     * <p>
     * When retrieving all backups, you can optionally specify the <code>MaxResults</code> parameter to limit the number
     * of backups in a response. If more backups remain, Amazon FSx returns a <code>NextToken</code> value in the
     * response. In this case, send a later request with the <code>NextToken</code> request parameter set to the value
     * of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your backups. <code>DescribeBackups</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of backups returned in the response of one <code>DescribeBackups</code> call and the order of backups
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBackupsRequest
     *        The request object for <code>DescribeBackups</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler);

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Lustre data repository tasks, if one or more
     * <code>TaskIds</code> values are provided in the request, or if filters are used in the request. You can use
     * filters to narrow the response to include just tasks for specific file systems, or tasks in a specific lifecycle
     * state. Otherwise, it returns all data repository tasks owned by your AWS account in the AWS Region of the
     * endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all tasks, you can paginate the response by using the optional <code>MaxResults</code> parameter
     * to limit the number of tasks returned in a response. If more tasks remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryTasksRequest
     * @return A Java Future containing the result of the DescribeDataRepositoryTasks operation returned by the service.
     * @sample AmazonFSxAsync.DescribeDataRepositoryTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(
            DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Lustre data repository tasks, if one or more
     * <code>TaskIds</code> values are provided in the request, or if filters are used in the request. You can use
     * filters to narrow the response to include just tasks for specific file systems, or tasks in a specific lifecycle
     * state. Otherwise, it returns all data repository tasks owned by your AWS account in the AWS Region of the
     * endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all tasks, you can paginate the response by using the optional <code>MaxResults</code> parameter
     * to limit the number of tasks returned in a response. If more tasks remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataRepositoryTasks operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeDataRepositoryTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(
            DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataRepositoryTasksRequest, DescribeDataRepositoryTasksResult> asyncHandler);

    /**
     * <p>
     * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A
     * history of all DNS aliases that have been associated with and disassociated from the file system is available in
     * the list of <a>AdministrativeAction</a> provided in the <a>DescribeFileSystems</a> operation response.
     * </p>
     * 
     * @param describeFileSystemAliasesRequest
     *        The request object for <code>DescribeFileSystemAliases</code> operation.
     * @return A Java Future containing the result of the DescribeFileSystemAliases operation returned by the service.
     * @sample AmazonFSxAsync.DescribeFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(
            DescribeFileSystemAliasesRequest describeFileSystemAliasesRequest);

    /**
     * <p>
     * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A
     * history of all DNS aliases that have been associated with and disassociated from the file system is available in
     * the list of <a>AdministrativeAction</a> provided in the <a>DescribeFileSystems</a> operation response.
     * </p>
     * 
     * @param describeFileSystemAliasesRequest
     *        The request object for <code>DescribeFileSystemAliases</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFileSystemAliases operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(
            DescribeFileSystemAliasesRequest describeFileSystemAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemAliasesRequest, DescribeFileSystemAliasesResult> asyncHandler);

    /**
     * <p>
     * Returns the description of specific Amazon FSx file systems, if a <code>FileSystemIds</code> value is provided
     * for that file system. Otherwise, it returns descriptions of all file systems owned by your AWS account in the AWS
     * Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxResults</code> parameter to
     * limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your file system descriptions.
     * <code>DescribeFileSystems</code> is called first without a <code>NextToken</code>value. Then the action continues
     * to be called with the <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value
     * until a response has no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of file systems returned in the response of one <code>DescribeFileSystems</code> call and the order of
     * file systems returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileSystemsRequest
     *        The request object for <code>DescribeFileSystems</code> operation.
     * @return A Java Future containing the result of the DescribeFileSystems operation returned by the service.
     * @sample AmazonFSxAsync.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest describeFileSystemsRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx file systems, if a <code>FileSystemIds</code> value is provided
     * for that file system. Otherwise, it returns descriptions of all file systems owned by your AWS account in the AWS
     * Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxResults</code> parameter to
     * limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your file system descriptions.
     * <code>DescribeFileSystems</code> is called first without a <code>NextToken</code>value. Then the action continues
     * to be called with the <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value
     * until a response has no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of file systems returned in the response of one <code>DescribeFileSystems</code> call and the order of
     * file systems returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileSystemsRequest
     *        The request object for <code>DescribeFileSystems</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFileSystems operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest describeFileSystemsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler);

    /**
     * <p>
     * Use this action to disassociate, or remove, one or more Domain Name Service (DNS) aliases from an Amazon FSx for
     * Windows File Server file system. If you attempt to disassociate a DNS alias that is not associated with the file
     * system, Amazon FSx responds with a 400 Bad Request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS
     * Aliases</a>.
     * </p>
     * <p>
     * The system generated response showing the DNS aliases that Amazon FSx is attempting to disassociate from the file
     * system. Use the API operation to monitor the status of the aliases Amazon FSx is disassociating with the file
     * system.
     * </p>
     * 
     * @param disassociateFileSystemAliasesRequest
     *        The request object of DNS aliases to disassociate from an Amazon FSx for Windows File Server file system.
     * @return A Java Future containing the result of the DisassociateFileSystemAliases operation returned by the
     *         service.
     * @sample AmazonFSxAsync.DisassociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DisassociateFileSystemAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(
            DisassociateFileSystemAliasesRequest disassociateFileSystemAliasesRequest);

    /**
     * <p>
     * Use this action to disassociate, or remove, one or more Domain Name Service (DNS) aliases from an Amazon FSx for
     * Windows File Server file system. If you attempt to disassociate a DNS alias that is not associated with the file
     * system, Amazon FSx responds with a 400 Bad Request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS
     * Aliases</a>.
     * </p>
     * <p>
     * The system generated response showing the DNS aliases that Amazon FSx is attempting to disassociate from the file
     * system. Use the API operation to monitor the status of the aliases Amazon FSx is disassociating with the file
     * system.
     * </p>
     * 
     * @param disassociateFileSystemAliasesRequest
     *        The request object of DNS aliases to disassociate from an Amazon FSx for Windows File Server file system.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFileSystemAliases operation returned by the
     *         service.
     * @sample AmazonFSxAsyncHandler.DisassociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DisassociateFileSystemAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(
            DisassociateFileSystemAliasesRequest disassociateFileSystemAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFileSystemAliasesRequest, DisassociateFileSystemAliasesResult> asyncHandler);

    /**
     * <p>
     * Lists tags for an Amazon FSx file systems and backups in the case of Amazon FSx for Windows File Server.
     * </p>
     * <p>
     * When retrieving all tags, you can optionally specify the <code>MaxResults</code> parameter to limit the number of
     * tags in a response. If more tags remain, Amazon FSx returns a <code>NextToken</code> value in the response. In
     * this case, send a later request with the <code>NextToken</code> request parameter set to the value of
     * <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your tags. <code>ListTagsForResource</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of tags returned in the response of one <code>ListTagsForResource</code> call and the order of tags
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest
     *        The request object for <code>ListTagsForResource</code> operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonFSxAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for an Amazon FSx file systems and backups in the case of Amazon FSx for Windows File Server.
     * </p>
     * <p>
     * When retrieving all tags, you can optionally specify the <code>MaxResults</code> parameter to limit the number of
     * tags in a response. If more tags remain, Amazon FSx returns a <code>NextToken</code> value in the response. In
     * this case, send a later request with the <code>NextToken</code> request parameter set to the value of
     * <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your tags. <code>ListTagsForResource</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of tags returned in the response of one <code>ListTagsForResource</code> call and the order of tags
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest
     *        The request object for <code>ListTagsForResource</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonFSxAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request object for the <code>TagResource</code> operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonFSxAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request object for the <code>TagResource</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonFSxAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request object for <code>UntagResource</code> action.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonFSxAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request object for <code>UntagResource</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonFSxAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Use this operation to update the configuration of an existing Amazon FSx file system. You can update multiple
     * properties in a single request.
     * </p>
     * <p>
     * For Amazon FSx for Windows File Server file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutomaticBackupRetentionDays
     * </p>
     * </li>
     * <li>
     * <p>
     * DailyAutomaticBackupStartTime
     * </p>
     * </li>
     * <li>
     * <p>
     * SelfManagedActiveDirectoryConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * StorageCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * ThroughputCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * WeeklyMaintenanceStartTime
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Amazon FSx for Lustre file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutoImportPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * AutomaticBackupRetentionDays
     * </p>
     * </li>
     * <li>
     * <p>
     * DailyAutomaticBackupStartTime
     * </p>
     * </li>
     * <li>
     * <p>
     * StorageCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * WeeklyMaintenanceStartTime
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFileSystemRequest
     *        The request object for the <code>UpdateFileSystem</code> operation.
     * @return A Java Future containing the result of the UpdateFileSystem operation returned by the service.
     * @sample AmazonFSxAsync.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest updateFileSystemRequest);

    /**
     * <p>
     * Use this operation to update the configuration of an existing Amazon FSx file system. You can update multiple
     * properties in a single request.
     * </p>
     * <p>
     * For Amazon FSx for Windows File Server file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutomaticBackupRetentionDays
     * </p>
     * </li>
     * <li>
     * <p>
     * DailyAutomaticBackupStartTime
     * </p>
     * </li>
     * <li>
     * <p>
     * SelfManagedActiveDirectoryConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * StorageCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * ThroughputCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * WeeklyMaintenanceStartTime
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Amazon FSx for Lustre file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutoImportPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * AutomaticBackupRetentionDays
     * </p>
     * </li>
     * <li>
     * <p>
     * DailyAutomaticBackupStartTime
     * </p>
     * </li>
     * <li>
     * <p>
     * StorageCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * WeeklyMaintenanceStartTime
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFileSystemRequest
     *        The request object for the <code>UpdateFileSystem</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFileSystem operation returned by the service.
     * @sample AmazonFSxAsyncHandler.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest updateFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResult> asyncHandler);

}

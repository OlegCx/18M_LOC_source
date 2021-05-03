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
 * Abstract implementation of {@code AmazonFSxAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonFSxAsync extends AbstractAmazonFSx implements AmazonFSxAsync {

    protected AbstractAmazonFSxAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(AssociateFileSystemAliasesRequest request) {

        return associateFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(AssociateFileSystemAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateFileSystemAliasesRequest, AssociateFileSystemAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest request) {

        return cancelDataRepositoryTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelDataRepositoryTaskRequest, CancelDataRepositoryTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest request) {

        return copyBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyBackupRequest, CopyBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request) {

        return createBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest request) {

        return createDataRepositoryTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataRepositoryTaskRequest, CreateDataRepositoryTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest request) {

        return createFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(CreateFileSystemFromBackupRequest request) {

        return createFileSystemFromBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(CreateFileSystemFromBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemFromBackupRequest, CreateFileSystemFromBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request) {

        return deleteBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest request) {

        return deleteFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request) {

        return describeBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(DescribeDataRepositoryTasksRequest request) {

        return describeDataRepositoryTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(DescribeDataRepositoryTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDataRepositoryTasksRequest, DescribeDataRepositoryTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(DescribeFileSystemAliasesRequest request) {

        return describeFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(DescribeFileSystemAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemAliasesRequest, DescribeFileSystemAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest request) {

        return describeFileSystemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(DisassociateFileSystemAliasesRequest request) {

        return disassociateFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(DisassociateFileSystemAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateFileSystemAliasesRequest, DisassociateFileSystemAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest request) {

        return updateFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

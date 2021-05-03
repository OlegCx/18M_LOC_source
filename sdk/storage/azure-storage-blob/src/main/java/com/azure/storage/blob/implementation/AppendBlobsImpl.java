// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Base64Util;
import com.azure.core.util.Context;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.blob.implementation.models.AppendBlobsAppendBlockFromUrlResponse;
import com.azure.storage.blob.implementation.models.AppendBlobsAppendBlockResponse;
import com.azure.storage.blob.implementation.models.AppendBlobsCreateResponse;
import com.azure.storage.blob.implementation.models.AppendBlobsSealResponse;
import com.azure.storage.blob.implementation.models.EncryptionScope;
import com.azure.storage.blob.implementation.models.StorageErrorException;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.models.CpkInfo;
import com.azure.storage.blob.models.EncryptionAlgorithmType;
import java.net.URL;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AppendBlobs. */
public final class AppendBlobsImpl {
    /** The proxy service used to perform REST calls. */
    private final AppendBlobsService service;

    /** The service client containing this operation class. */
    private final AzureBlobStorageImpl client;

    /**
     * Initializes an instance of AppendBlobsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AppendBlobsImpl(AzureBlobStorageImpl client) {
        this.service =
                RestProxy.create(AppendBlobsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageAppendBlobs to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageAppe")
    public interface AppendBlobsService {
        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<AppendBlobsCreateResponse> create(
                @HostParam("url") String url,
                @HeaderParam("x-ms-blob-type") String blobType,
                @PathParam("containerName") String containerName,
                @PathParam("blob") String blob,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("Content-Length") long contentLength,
                @HeaderParam("x-ms-blob-content-type") String contentType,
                @HeaderParam("x-ms-blob-content-encoding") String contentEncoding,
                @HeaderParam("x-ms-blob-content-language") String contentLanguage,
                @HeaderParam("x-ms-blob-content-md5") String contentMd5,
                @HeaderParam("x-ms-blob-cache-control") String cacheControl,
                @HeaderParam("x-ms-meta-") Map<String, String> metadata,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("x-ms-blob-content-disposition") String contentDisposition,
                @HeaderParam("x-ms-encryption-key") String encryptionKey,
                @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256,
                @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm,
                @HeaderParam("x-ms-encryption-scope") String encryptionScope,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("x-ms-if-tags") String ifTags,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("x-ms-tags") String blobTagsString,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<AppendBlobsAppendBlockResponse> appendBlock(
                @HostParam("url") String url,
                @QueryParam("comp") String comp,
                @PathParam("containerName") String containerName,
                @PathParam("blob") String blob,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("Content-Length") long contentLength,
                @HeaderParam("Content-MD5") String transactionalContentMD5,
                @HeaderParam("x-ms-content-crc64") String transactionalContentCrc64,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize,
                @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition,
                @HeaderParam("x-ms-encryption-key") String encryptionKey,
                @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256,
                @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm,
                @HeaderParam("x-ms-encryption-scope") String encryptionScope,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("x-ms-if-tags") String ifTags,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @BodyParam("application/octet-stream") Flux<ByteBuffer> body,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrl(
                @HostParam("url") String url,
                @QueryParam("comp") String comp,
                @PathParam("containerName") String containerName,
                @PathParam("blob") String blob,
                @HeaderParam("x-ms-copy-source") URL sourceUrl,
                @HeaderParam("x-ms-source-range") String sourceRange,
                @HeaderParam("x-ms-source-content-md5") String sourceContentMD5,
                @HeaderParam("x-ms-source-content-crc64") String sourceContentcrc64,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("Content-Length") long contentLength,
                @HeaderParam("Content-MD5") String transactionalContentMD5,
                @HeaderParam("x-ms-encryption-key") String encryptionKey,
                @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256,
                @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm,
                @HeaderParam("x-ms-encryption-scope") String encryptionScope,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize,
                @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("x-ms-if-tags") String ifTags,
                @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince,
                @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince,
                @HeaderParam("x-ms-source-if-match") String sourceIfMatch,
                @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<AppendBlobsSealResponse> seal(
                @HostParam("url") String url,
                @QueryParam("comp") String comp,
                @PathParam("containerName") String containerName,
                @PathParam("blob") String blob,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value
     *     pairs are specified, the operation will copy the metadata from the source blob or file to the destination
     *     blob. If one or more name-value pairs are specified, the destination blob is created with the specified
     *     metadata, and metadata is not copied from the source blob or file. Note that beginning with version
     *     2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing
     *     Containers, Blobs, and Metadata for more information.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param ifTags Specify a SQL where clause on blob tags to operate only on blobs with a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param blobTagsString Optional. Used to set blob tags in various blob operations.
     * @param blobHttpHeaders Parameter group.
     * @param cpkInfo Parameter group.
     * @param encryptionScope Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsCreateResponse> createWithResponseAsync(
            String containerName,
            String blob,
            long contentLength,
            Integer timeout,
            Map<String, String> metadata,
            String leaseId,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String ifMatch,
            String ifNoneMatch,
            String ifTags,
            String requestId,
            String blobTagsString,
            BlobHttpHeaders blobHttpHeaders,
            CpkInfo cpkInfo,
            EncryptionScope encryptionScope,
            Context context) {
        final String blobType = "AppendBlob";
        final String accept = "application/xml";
        String contentTypeInternal = null;
        if (blobHttpHeaders != null) {
            contentTypeInternal = blobHttpHeaders.getContentType();
        }
        String contentType = contentTypeInternal;
        String contentEncodingInternal = null;
        if (blobHttpHeaders != null) {
            contentEncodingInternal = blobHttpHeaders.getContentEncoding();
        }
        String contentEncoding = contentEncodingInternal;
        String contentLanguageInternal = null;
        if (blobHttpHeaders != null) {
            contentLanguageInternal = blobHttpHeaders.getContentLanguage();
        }
        String contentLanguage = contentLanguageInternal;
        byte[] contentMd5Internal = null;
        if (blobHttpHeaders != null) {
            contentMd5Internal = blobHttpHeaders.getContentMd5();
        }
        byte[] contentMd5 = contentMd5Internal;
        String cacheControlInternal = null;
        if (blobHttpHeaders != null) {
            cacheControlInternal = blobHttpHeaders.getCacheControl();
        }
        String cacheControl = cacheControlInternal;
        String contentDispositionInternal = null;
        if (blobHttpHeaders != null) {
            contentDispositionInternal = blobHttpHeaders.getContentDisposition();
        }
        String contentDisposition = contentDispositionInternal;
        String encryptionKeyInternal = null;
        if (cpkInfo != null) {
            encryptionKeyInternal = cpkInfo.getEncryptionKey();
        }
        String encryptionKey = encryptionKeyInternal;
        String encryptionKeySha256Internal = null;
        if (cpkInfo != null) {
            encryptionKeySha256Internal = cpkInfo.getEncryptionKeySha256();
        }
        String encryptionKeySha256 = encryptionKeySha256Internal;
        EncryptionAlgorithmType encryptionAlgorithmInternal = null;
        if (cpkInfo != null) {
            encryptionAlgorithmInternal = cpkInfo.getEncryptionAlgorithm();
        }
        EncryptionAlgorithmType encryptionAlgorithm = encryptionAlgorithmInternal;
        String encryptionScopeInternal = null;
        if (encryptionScope != null) {
            encryptionScopeInternal = encryptionScope.getEncryptionScope();
        }
        String encryptionScopeLocal = encryptionScopeInternal;
        String contentMd5Converted = Base64Util.encodeToString(contentMd5);
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.create(
                this.client.getUrl(),
                blobType,
                containerName,
                blob,
                timeout,
                contentLength,
                contentType,
                contentEncoding,
                contentLanguage,
                contentMd5Converted,
                cacheControl,
                metadata,
                leaseId,
                contentDisposition,
                encryptionKey,
                encryptionKeySha256,
                encryptionAlgorithm,
                encryptionScopeLocal,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                ifMatch,
                ifNoneMatch,
                ifTags,
                this.client.getVersion(),
                requestId,
                blobTagsString,
                accept,
                context);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block
     * operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is
     * supported only on version 2015-02-21 version or later.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param body Initial data.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param transactionalContentMD5 Specify the transactional md5 for the body, to be validated by the service.
     * @param transactionalContentCrc64 Specify the transactional crc64 for the body, to be validated by the service.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param maxSize Optional conditional header. The max length in bytes permitted for the append blob. If the Append
     *     Block operation would cause the blob to exceed that limit or if the blob size is already greater than the
     *     value specified in this header, the request will fail with MaxBlobSizeConditionNotMet error (HTTP status code
     *     412 - Precondition Failed).
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating
     *     the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If
     *     it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 -
     *     Precondition Failed).
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param ifTags Specify a SQL where clause on blob tags to operate only on blobs with a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param cpkInfo Parameter group.
     * @param encryptionScope Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockResponse> appendBlockWithResponseAsync(
            String containerName,
            String blob,
            long contentLength,
            Flux<ByteBuffer> body,
            Integer timeout,
            byte[] transactionalContentMD5,
            byte[] transactionalContentCrc64,
            String leaseId,
            Long maxSize,
            Long appendPosition,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String ifMatch,
            String ifNoneMatch,
            String ifTags,
            String requestId,
            CpkInfo cpkInfo,
            EncryptionScope encryptionScope,
            Context context) {
        final String comp = "appendblock";
        final String accept = "application/xml";
        String encryptionKeyInternal = null;
        if (cpkInfo != null) {
            encryptionKeyInternal = cpkInfo.getEncryptionKey();
        }
        String encryptionKey = encryptionKeyInternal;
        String encryptionKeySha256Internal = null;
        if (cpkInfo != null) {
            encryptionKeySha256Internal = cpkInfo.getEncryptionKeySha256();
        }
        String encryptionKeySha256 = encryptionKeySha256Internal;
        EncryptionAlgorithmType encryptionAlgorithmInternal = null;
        if (cpkInfo != null) {
            encryptionAlgorithmInternal = cpkInfo.getEncryptionAlgorithm();
        }
        EncryptionAlgorithmType encryptionAlgorithm = encryptionAlgorithmInternal;
        String encryptionScopeInternal = null;
        if (encryptionScope != null) {
            encryptionScopeInternal = encryptionScope.getEncryptionScope();
        }
        String encryptionScopeLocal = encryptionScopeInternal;
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        String transactionalContentCrc64Converted = Base64Util.encodeToString(transactionalContentCrc64);
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.appendBlock(
                this.client.getUrl(),
                comp,
                containerName,
                blob,
                timeout,
                contentLength,
                transactionalContentMD5Converted,
                transactionalContentCrc64Converted,
                leaseId,
                maxSize,
                appendPosition,
                encryptionKey,
                encryptionKeySha256,
                encryptionAlgorithm,
                encryptionScopeLocal,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                ifMatch,
                ifNoneMatch,
                ifTags,
                this.client.getVersion(),
                requestId,
                body,
                accept,
                context);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob where the contents
     * are read from a source url. The Append Block operation is permitted only if the blob was created with
     * x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param sourceUrl Specify a URL to the copy source.
     * @param contentLength The length of the request.
     * @param sourceRange Bytes of source data in the specified range.
     * @param sourceContentMD5 Specify the md5 calculated for the range of bytes that must be read from the copy source.
     * @param sourceContentcrc64 Specify the crc64 calculated for the range of bytes that must be read from the copy
     *     source.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param transactionalContentMD5 Specify the transactional md5 for the body, to be validated by the service.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param maxSize Optional conditional header. The max length in bytes permitted for the append blob. If the Append
     *     Block operation would cause the blob to exceed that limit or if the blob size is already greater than the
     *     value specified in this header, the request will fail with MaxBlobSizeConditionNotMet error (HTTP status code
     *     412 - Precondition Failed).
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating
     *     the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If
     *     it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 -
     *     Precondition Failed).
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param ifTags Specify a SQL where clause on blob tags to operate only on blobs with a matching value.
     * @param sourceIfModifiedSince Specify this header value to operate only on a blob if it has been modified since
     *     the specified date/time.
     * @param sourceIfUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified
     *     since the specified date/time.
     * @param sourceIfMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param sourceIfNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param cpkInfo Parameter group.
     * @param encryptionScope Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrlWithResponseAsync(
            String containerName,
            String blob,
            URL sourceUrl,
            long contentLength,
            String sourceRange,
            byte[] sourceContentMD5,
            byte[] sourceContentcrc64,
            Integer timeout,
            byte[] transactionalContentMD5,
            String leaseId,
            Long maxSize,
            Long appendPosition,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String ifMatch,
            String ifNoneMatch,
            String ifTags,
            OffsetDateTime sourceIfModifiedSince,
            OffsetDateTime sourceIfUnmodifiedSince,
            String sourceIfMatch,
            String sourceIfNoneMatch,
            String requestId,
            CpkInfo cpkInfo,
            EncryptionScope encryptionScope,
            Context context) {
        final String comp = "appendblock";
        final String accept = "application/xml";
        String encryptionKeyInternal = null;
        if (cpkInfo != null) {
            encryptionKeyInternal = cpkInfo.getEncryptionKey();
        }
        String encryptionKey = encryptionKeyInternal;
        String encryptionKeySha256Internal = null;
        if (cpkInfo != null) {
            encryptionKeySha256Internal = cpkInfo.getEncryptionKeySha256();
        }
        String encryptionKeySha256 = encryptionKeySha256Internal;
        EncryptionAlgorithmType encryptionAlgorithmInternal = null;
        if (cpkInfo != null) {
            encryptionAlgorithmInternal = cpkInfo.getEncryptionAlgorithm();
        }
        EncryptionAlgorithmType encryptionAlgorithm = encryptionAlgorithmInternal;
        String encryptionScopeInternal = null;
        if (encryptionScope != null) {
            encryptionScopeInternal = encryptionScope.getEncryptionScope();
        }
        String encryptionScopeLocal = encryptionScopeInternal;
        String sourceContentMD5Converted = Base64Util.encodeToString(sourceContentMD5);
        String sourceContentcrc64Converted = Base64Util.encodeToString(sourceContentcrc64);
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted =
                sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted =
                sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.appendBlockFromUrl(
                this.client.getUrl(),
                comp,
                containerName,
                blob,
                sourceUrl,
                sourceRange,
                sourceContentMD5Converted,
                sourceContentcrc64Converted,
                timeout,
                contentLength,
                transactionalContentMD5Converted,
                encryptionKey,
                encryptionKeySha256,
                encryptionAlgorithm,
                encryptionScopeLocal,
                leaseId,
                maxSize,
                appendPosition,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                ifMatch,
                ifNoneMatch,
                ifTags,
                sourceIfModifiedSinceConverted,
                sourceIfUnmodifiedSinceConverted,
                sourceIfMatch,
                sourceIfNoneMatch,
                this.client.getVersion(),
                requestId,
                accept,
                context);
    }

    /**
     * The Seal operation seals the Append Blob to make it read-only. Seal is supported only on version 2019-12-12
     * version or later.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating
     *     the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If
     *     it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 -
     *     Precondition Failed).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsSealResponse> sealWithResponseAsync(
            String containerName,
            String blob,
            Integer timeout,
            String requestId,
            String leaseId,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String ifMatch,
            String ifNoneMatch,
            Long appendPosition,
            Context context) {
        final String comp = "seal";
        final String accept = "application/xml";
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.seal(
                this.client.getUrl(),
                comp,
                containerName,
                blob,
                timeout,
                this.client.getVersion(),
                requestId,
                leaseId,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                ifMatch,
                ifNoneMatch,
                appendPosition,
                accept,
                context);
    }
}
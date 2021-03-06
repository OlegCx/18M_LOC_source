// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.ContentProperties;
import com.azure.containers.containerregistry.models.DeleteRepositoryResult;
import com.azure.containers.containerregistry.models.ListRegistryArtifactOptions;
import com.azure.containers.containerregistry.models.ListTagsOptions;
import com.azure.containers.containerregistry.models.RegistryArtifactProperties;
import com.azure.containers.containerregistry.models.RepositoryProperties;
import com.azure.containers.containerregistry.models.TagProperties;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * This class provides a client that contains all the operations for repositories in Azure Container Registry.
 * Operations allowed by the client are listing, retrieving, deleting, setting writeable properties.
 * These operations are supported on the repository and the respective tags and manifests in it.
 *
 * <p><strong>Instantiating Container Repository Client</strong></p>
 *
 * {@codesnippet com.azure.containers.containerregistry.repositoryclient.instantiation}
 *
 * <p>View {@link ContainerRepositoryClientBuilder this} for additional ways to construct the client.</p>
 *
 * @see ContainerRepositoryClientBuilder
 */
@ServiceClient(builder = ContainerRepositoryClientBuilder.class)
public final class ContainerRepositoryClient {
    private final ContainerRepositoryAsyncClient asyncClient;

    /**
     * Creates a ContainerRepositoryAsyncClient that sends requests to the given repository in the container registry service at {@code endpoint}.
     * Each service call goes through the {@code pipeline}.
     * @param asyncClient The async client for the given repository.
     */
    ContainerRepositoryClient(ContainerRepositoryAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * Gets the Azure Container Registry service endpoint for the current instance.
     * @return The service endpoint for the current instance.
     */
    public String getEndpoint() {
        return this.asyncClient.getEndpoint();
    }

    /**
     * Gets the Azure Container Registry name for the current instance.
     * @return Return the registry name.
     */
    public String getRegistry() {
        return this.asyncClient.getRegistry();
    }

    /**
     * Gets the repository name for the current instance.
     * Gets the repository name for the current instance.
     * @return Name of the repository for the current instance.
     * */
    public String getRepository() {
        return this.asyncClient.getRepository();
    }

    /**
     * Delete the repository in the Azure Container Registry for the given {@link #getRepository() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.deleteRepositoryWithResponse}
     *
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response containing the result of the repository delete operation. It returns the count of the tags and
     * artifacts that are deleted as part of the repository delete.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the repository with the given name was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DeleteRepositoryResult> deleteWithResponse(Context context) {
        return this.asyncClient.deleteWithResponse(context).block();
    }

    /**
     * Delete the repository in the Azure Container Registry for the given {@link #getRepository() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.deleteRepository}
     *
     * @return It returns the count of the tags and artifacts that are deleted as part of the repository delete.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the repository with the given name was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeleteRepositoryResult delete() {
        return this.deleteWithResponse(Context.NONE).getValue();
    }

    /**
     * Deletes the registry artifact with the matching digest in the given {@link #getRepository() respository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the registry artifact.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.deleteRegistryArtifactWithResponse}
     *
     * @param digest The digest that uniquely identifies the artifact to be deleted.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response containing the result of the service call.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws NullPointerException thrown if digest is null.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteRegistryArtifactWithResponse(String digest, Context context) {
        return this.asyncClient.deleteRegistryArtifactWithResponse(digest, context).block();
    }

    /**
     * Deletes the registry artifact with the matching digest in the given {@link #getRepository() respository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the registry artifact.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.deleteRegistryArtifact}
     *
     * @param digest The digest that uniquely identifies the artifact to be deleted.
     * @throws ClientAuthenticationException thrown if the client does not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws NullPointerException thrown if digest is null.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteRegistryArtifact(String digest) {
        this.deleteRegistryArtifactWithResponse(digest, Context.NONE).getValue();
    }

    /**
     * Deletes the tag with the matching tag name for the given {@link #getRepository() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the tag for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.deleteTagWithResponse}
     *
     * @param tag The name of the tag that needs to be deleted.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response containing the result of the service call.
     * @throws ClientAuthenticationException thrown if the client does not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws NullPointerException thrown if tag is null.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteTagWithResponse(String tag, Context context) {
        return this.asyncClient.deleteTagWithResponse(tag, context).block();
    }

    /**
     * Deletes the tag with the matching tag name for the given {@link #getRepository() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the tag for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.deleteTag}
     *
     * @param tag The name of the tag that needs to be deleted.
     * @throws ClientAuthenticationException thrown if the client does not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws NullPointerException thrown if tag is null.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteTag(String tag) {
        this.deleteTagWithResponse(tag, Context.NONE).getValue();
    }

    /**
     * Gets the {@link RepositoryProperties properties} associated with the given {@link #getRepository() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the properties for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.getPropertiesWithResponse}
     *
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response with the {@link RepositoryProperties properties} associated with the given {@link #getRepository() repository}.
     * @throws ClientAuthenticationException thrown if the client does not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the repository with the given name was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RepositoryProperties> getPropertiesWithResponse(Context context) {
        return this.asyncClient.getPropertiesWithResponse(context).block();
    }

    /**
     * Gets the {@link RepositoryProperties properties} associated with the given {@link #getRepository() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the properties for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.getProperties}
     *
     * @return The{@link RepositoryProperties properties} associated with the given {@link #getRepository() repository}.
     * @throws ClientAuthenticationException thrown if the client does not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the repository with the given name was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RepositoryProperties getProperties() {
        return this.getPropertiesWithResponse(Context.NONE).getValue();
    }

    /**
     * Gets the {@link RegistryArtifactProperties properties} associated with an artifact in given {@link #getRepository() repository}.
     *
     * <p>This method can take in both a digest as well as a tag.<br>
     * In case a tag is provided it calls the service to get the digest associated with the given tag.</p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the properties for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.getRegistryArtifactPropertiesWithResponse}
     *
     * @param tagOrDigest tag or digest associated with the artifact.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response containing {@link RegistryArtifactProperties properties} associated with the given {@code tagOrDigest}.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RegistryArtifactProperties> getRegistryArtifactPropertiesWithResponse(String tagOrDigest, Context context) {
        return this.asyncClient.getRegistryArtifactPropertiesWithResponse(tagOrDigest, context).block();
    }

    /**
     * Gets the {@link RegistryArtifactProperties properties} associated with an artifact in given {@link #getRepository() repository}.
     *
     * <p>This method can take in both a digest as well as a tag.<br>
     * In case a tag is provided it calls the service to get the digest associated with the given tag.</p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the registry artifact properties for a given tag or digest.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.getRegistryArtifactProperties}.
     *
     * @param tagOrDigest tag or digest associated with the artifact.
     * @return The {@link RegistryArtifactProperties properties} associated with the given {@code tagOrDigest}.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RegistryArtifactProperties getRegistryArtifactProperties(String tagOrDigest) {
        return this.getRegistryArtifactPropertiesWithResponse(tagOrDigest, Context.NONE).getValue();
    }

    /**
     * Fetches all the artifacts associated with the given {@link #getRepository() repository}.
     *
     * <p> If you would like to specify the order in which the tags are returned please
     * use the overload that takes in the options parameter {@link #listTags(ListTagsOptions) listTags}
     * No assumptions on the order can be made if no options are provided to the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all artifacts associated with the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.listRegistryArtifacts}.
     *
     * @return {@link PagedIterable} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RegistryArtifactProperties> listRegistryArtifacts() {
        return this.listRegistryArtifacts(null);
    }

    /**
     * Fetches all the artifacts associated with the given {@link #getRepository() repository}.
     *
     * <p> The method supports options to select the order in which the artifacts are returned by the service.
     * Currently the service supports an ascending or descending order for the last updated time for the artifacts.
     * No assumptions on the order can be made if no options are provided by the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all artifacts associated with the given repository from the most recently updated to the last.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.listRegistryArtifactsWithOptions}.
     *
     * @param options the options that specifies the order in which the artifacts are returned by the service.
     * @return {@link PagedIterable} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RegistryArtifactProperties> listRegistryArtifacts(ListRegistryArtifactOptions options) {
        return new PagedIterable<>(this.asyncClient.listRegistryArtifacts(options));
    }

    /**
     * Gets the tag properties associated with a given tag in the {@link #getRepository() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve the properties associated with the given tag.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.getTagPropertiesWithResponse}.
     *
     * @param tag name of the tag.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response with the {@link TagProperties properties} associated with the given tag.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)

    public Response<TagProperties> getTagPropertiesWithResponse(String tag, Context context) {
        return this.asyncClient.getTagPropertiesWithResponse(tag, context).block();
    }

    /**
     * Gets the tag properties associated with a given tag in the {@link #getRepository() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve the properties associated with the given tag.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.getTagProperties}.
     *
     * @param tag name of the tag.
     * @return The {@link TagProperties properties} associated with the given tag.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TagProperties getTagProperties(String tag) {
        return getTagPropertiesWithResponse(tag, Context.NONE).getValue();
    }

    /**
     * Fetches all the tags associated with the given {@link #getRepository() repository}.
     *
     * <p> If you would like to specify the order in which the tags are returned please
     * use the overload that takes in the options parameter {@link #listTags(ListTagsOptions) listTags}
     * No assumptions on the order can be made if no options are provided to the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all the tags associated with the given repository from the most recently updated to the last.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.listTagsWithOptions}.
     *
     * @return {@link PagedIterable} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TagProperties> listTags() {
        return listTags(null);
    }

    /**
     * Fetches all the tags associated with the given {@link #getRepository() repository}.
     *
     * <p> The method supports options to select the order in which the tags are returned by the service.
     * Currently the service supports an ascending or descending order based on the last updated time of the tag.
     * No assumptions on the order can be made if no options are provided to the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all the tags associated with the given repository from the most recently updated to the last.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.listTagsWithOptions}.
     *
     * @param options The options that specifies the order in which the tags should be returned by the service.
     * @return {@link PagedIterable} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TagProperties> listTags(ListTagsOptions options) {
        return new PagedIterable<TagProperties>(asyncClient.listTags(options));
    }

    /**
     * Update the writeable properties {@link ContentProperties} of the given {@link #getRepository() repository}.
     * These properties set the update, delete and retrieve options of the repository.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.updatePropertiesWithResponse}.
     *
     * @param value {@link ContentProperties writeable properties} that need to be updated for the repository.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response with the completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the repository with the given name was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updatePropertiesWithResponse(ContentProperties value, Context context) {
        return this.asyncClient.updatePropertiesWithResponse(value, context).block();
    }

    /**
     * Update the writeable properties {@link ContentProperties} of the given {@link #getRepository() repository}.
     * These properties set the update, delete and retrieve options of the repository.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.updateProperties}.
     *
     * @param value {@link ContentProperties writeable properties} that need to be updated for the repository.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the repository with the given name was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateProperties(ContentProperties value) {
        this.updatePropertiesWithResponse(value, Context.NONE).getValue();
    }

    /**
     * Update the writeable properties {@link ContentProperties} of the given tag in {@link #getRepository() repository}.
     * These properties set whether the given tag can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given tag.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.updateTagPropertiesWithResponse}.
     *
     * @param tag Name of the tag.
     * @param value {@link ContentProperties value} to be set.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response for the completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> updateTagPropertiesWithResponse(String tag, ContentProperties value, Context context) {
        return this.asyncClient.updateTagPropertiesWithResponse(tag, value, context).block();
    }

    /**
     * Update the writeable properties {@link ContentProperties} of the given {@code tag}.
     * These properties set whether the given tag can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given tag.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.updateTagProperties}.
     *
     * @param tag Name of the tag.
     * @param value {@link ContentProperties value} to be set.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateTagProperties(String tag, ContentProperties value) {
        this.updateTagPropertiesWithResponse(tag, value, Context.NONE).getValue();
    }

    /**
     * Update the writeable properties {@link ContentProperties} of the artifact with the given {@code digest}.
     * These properties set whether the given manifest can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given artifact.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.updateManifestPropertiesWithResponse}.
     *
     * @param digest Digest of the manifest to be updated.
     * @param value {@link ContentProperties value} to be set.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response for the completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     */
    public Response<Void> updateManifestPropertiesWithResponse(String digest, ContentProperties value, Context context) {
        return this.asyncClient.updateManifestPropertiesWithResponse(digest, value, context).block();
    }

    /**
     * Update the writeable properties {@link ContentProperties} of the artifact with the given {@code digest}.
     * These properties set whether the given manifest can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given manifest.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.repositoryclient.updateManifestProperties}.
     *
     * @param digest Digest of the manifest to be updated.
     * @param value {@link ContentProperties value} to be set.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateManifestProperties(String digest, ContentProperties value) {
        this.updateManifestPropertiesWithResponse(digest, value, Context.NONE).getValue();
    }
}

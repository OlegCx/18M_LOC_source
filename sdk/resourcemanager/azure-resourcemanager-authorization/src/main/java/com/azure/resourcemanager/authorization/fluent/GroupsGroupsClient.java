// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.Get3ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get8ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.GroupsGroupOrderby;
import com.azure.resourcemanager.authorization.fluent.models.GroupsGroupSelect;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphGroupInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GroupsGroupsClient. */
public interface GroupsGroupsClient {
    /**
     * Get entities from groups.
     *
     * @param consistencyLevel Indicates the requested consistency level.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphGroupInner> listGroupAsync(
        String consistencyLevel,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<GroupsGroupOrderby> orderby,
        List<GroupsGroupSelect> select,
        List<Get8ItemsItem> expand);

    /**
     * Get entities from groups.
     *
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphGroupInner> listGroupAsync();

    /**
     * Get entities from groups.
     *
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphGroupInner> listGroup();

    /**
     * Get entities from groups.
     *
     * @param consistencyLevel Indicates the requested consistency level.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphGroupInner> listGroup(
        String consistencyLevel,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<GroupsGroupOrderby> orderby,
        List<GroupsGroupSelect> select,
        List<Get8ItemsItem> expand,
        Context context);

    /**
     * Add new entity to groups.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphGroupInner>> createGroupWithResponseAsync(MicrosoftGraphGroupInner body);

    /**
     * Add new entity to groups.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphGroupInner> createGroupAsync(MicrosoftGraphGroupInner body);

    /**
     * Add new entity to groups.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphGroupInner createGroup(MicrosoftGraphGroupInner body);

    /**
     * Add new entity to groups.
     *
     * @param body New entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphGroupInner> createGroupWithResponse(MicrosoftGraphGroupInner body, Context context);

    /**
     * Get entity from groups by key.
     *
     * @param groupId key: id of group.
     * @param consistencyLevel Indicates the requested consistency level.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from groups by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphGroupInner>> getGroupWithResponseAsync(
        String groupId, String consistencyLevel, List<GroupsGroupSelect> select, List<Get3ItemsItem> expand);

    /**
     * Get entity from groups by key.
     *
     * @param groupId key: id of group.
     * @param consistencyLevel Indicates the requested consistency level.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from groups by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphGroupInner> getGroupAsync(
        String groupId, String consistencyLevel, List<GroupsGroupSelect> select, List<Get3ItemsItem> expand);

    /**
     * Get entity from groups by key.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from groups by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphGroupInner> getGroupAsync(String groupId);

    /**
     * Get entity from groups by key.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from groups by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphGroupInner getGroup(String groupId);

    /**
     * Get entity from groups by key.
     *
     * @param groupId key: id of group.
     * @param consistencyLevel Indicates the requested consistency level.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from groups by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphGroupInner> getGroupWithResponse(
        String groupId,
        String consistencyLevel,
        List<GroupsGroupSelect> select,
        List<Get3ItemsItem> expand,
        Context context);

    /**
     * Update entity in groups.
     *
     * @param groupId key: id of group.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> updateGroupWithResponseAsync(String groupId, MicrosoftGraphGroupInner body);

    /**
     * Update entity in groups.
     *
     * @param groupId key: id of group.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> updateGroupAsync(String groupId, MicrosoftGraphGroupInner body);

    /**
     * Update entity in groups.
     *
     * @param groupId key: id of group.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateGroup(String groupId, MicrosoftGraphGroupInner body);

    /**
     * Update entity in groups.
     *
     * @param groupId key: id of group.
     * @param body New property values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateGroupWithResponse(String groupId, MicrosoftGraphGroupInner body, Context context);

    /**
     * Delete entity from groups.
     *
     * @param groupId key: id of group.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteGroupWithResponseAsync(String groupId, String ifMatch);

    /**
     * Delete entity from groups.
     *
     * @param groupId key: id of group.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteGroupAsync(String groupId, String ifMatch);

    /**
     * Delete entity from groups.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteGroupAsync(String groupId);

    /**
     * Delete entity from groups.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteGroup(String groupId);

    /**
     * Delete entity from groups.
     *
     * @param groupId key: id of group.
     * @param ifMatch ETag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteGroupWithResponse(String groupId, String ifMatch, Context context);
}
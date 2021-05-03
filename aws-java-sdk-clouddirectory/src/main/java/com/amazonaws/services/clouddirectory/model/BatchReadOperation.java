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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <code>BatchRead</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchReadOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchReadOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists all attributes that are associated with an object.
     * </p>
     */
    private BatchListObjectAttributes listObjectAttributes;
    /**
     * <p>
     * Returns a paginated list of child objects that are associated with a given object.
     * </p>
     */
    private BatchListObjectChildren listObjectChildren;
    /**
     * <p>
     * Lists indices attached to an object.
     * </p>
     */
    private BatchListAttachedIndices listAttachedIndices;
    /**
     * <p>
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
     * objects. For more information about objects, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     * >Directory Structure</a>.
     * </p>
     */
    private BatchListObjectParentPaths listObjectParentPaths;
    /**
     * <p>
     * Retrieves metadata about an object.
     * </p>
     */
    private BatchGetObjectInformation getObjectInformation;
    /**
     * <p>
     * Retrieves attributes within a facet that are associated with an object.
     * </p>
     */
    private BatchGetObjectAttributes getObjectAttributes;

    private BatchListObjectParents listObjectParents;
    /**
     * <p>
     * Returns policies attached to an object in pagination fashion.
     * </p>
     */
    private BatchListObjectPolicies listObjectPolicies;
    /**
     * <p>
     * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * </p>
     */
    private BatchListPolicyAttachments listPolicyAttachments;
    /**
     * <p>
     * Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     * present, an empty list is returned. If policies are present, and if some objects don't have the policies
     * attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it returns
     * <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that don't lead to the
     * root from the target object are ignored. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     */
    private BatchLookupPolicy lookupPolicy;
    /**
     * <p>
     * Lists objects attached to the specified index.
     * </p>
     */
    private BatchListIndex listIndex;
    /**
     * <p>
     * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     */
    private BatchListOutgoingTypedLinks listOutgoingTypedLinks;
    /**
     * <p>
     * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     */
    private BatchListIncomingTypedLinks listIncomingTypedLinks;
    /**
     * <p>
     * Retrieves attributes that are associated with a typed link.
     * </p>
     */
    private BatchGetLinkAttributes getLinkAttributes;

    /**
     * <p>
     * Lists all attributes that are associated with an object.
     * </p>
     * 
     * @param listObjectAttributes
     *        Lists all attributes that are associated with an object.
     */

    public void setListObjectAttributes(BatchListObjectAttributes listObjectAttributes) {
        this.listObjectAttributes = listObjectAttributes;
    }

    /**
     * <p>
     * Lists all attributes that are associated with an object.
     * </p>
     * 
     * @return Lists all attributes that are associated with an object.
     */

    public BatchListObjectAttributes getListObjectAttributes() {
        return this.listObjectAttributes;
    }

    /**
     * <p>
     * Lists all attributes that are associated with an object.
     * </p>
     * 
     * @param listObjectAttributes
     *        Lists all attributes that are associated with an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListObjectAttributes(BatchListObjectAttributes listObjectAttributes) {
        setListObjectAttributes(listObjectAttributes);
        return this;
    }

    /**
     * <p>
     * Returns a paginated list of child objects that are associated with a given object.
     * </p>
     * 
     * @param listObjectChildren
     *        Returns a paginated list of child objects that are associated with a given object.
     */

    public void setListObjectChildren(BatchListObjectChildren listObjectChildren) {
        this.listObjectChildren = listObjectChildren;
    }

    /**
     * <p>
     * Returns a paginated list of child objects that are associated with a given object.
     * </p>
     * 
     * @return Returns a paginated list of child objects that are associated with a given object.
     */

    public BatchListObjectChildren getListObjectChildren() {
        return this.listObjectChildren;
    }

    /**
     * <p>
     * Returns a paginated list of child objects that are associated with a given object.
     * </p>
     * 
     * @param listObjectChildren
     *        Returns a paginated list of child objects that are associated with a given object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListObjectChildren(BatchListObjectChildren listObjectChildren) {
        setListObjectChildren(listObjectChildren);
        return this;
    }

    /**
     * <p>
     * Lists indices attached to an object.
     * </p>
     * 
     * @param listAttachedIndices
     *        Lists indices attached to an object.
     */

    public void setListAttachedIndices(BatchListAttachedIndices listAttachedIndices) {
        this.listAttachedIndices = listAttachedIndices;
    }

    /**
     * <p>
     * Lists indices attached to an object.
     * </p>
     * 
     * @return Lists indices attached to an object.
     */

    public BatchListAttachedIndices getListAttachedIndices() {
        return this.listAttachedIndices;
    }

    /**
     * <p>
     * Lists indices attached to an object.
     * </p>
     * 
     * @param listAttachedIndices
     *        Lists indices attached to an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListAttachedIndices(BatchListAttachedIndices listAttachedIndices) {
        setListAttachedIndices(listAttachedIndices);
        return this;
    }

    /**
     * <p>
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
     * objects. For more information about objects, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     * >Directory Structure</a>.
     * </p>
     * 
     * @param listObjectParentPaths
     *        Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index
     *        node objects. For more information about objects, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     *        >Directory Structure</a>.
     */

    public void setListObjectParentPaths(BatchListObjectParentPaths listObjectParentPaths) {
        this.listObjectParentPaths = listObjectParentPaths;
    }

    /**
     * <p>
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
     * objects. For more information about objects, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     * >Directory Structure</a>.
     * </p>
     * 
     * @return Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index
     *         node objects. For more information about objects, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     *         >Directory Structure</a>.
     */

    public BatchListObjectParentPaths getListObjectParentPaths() {
        return this.listObjectParentPaths;
    }

    /**
     * <p>
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
     * objects. For more information about objects, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     * >Directory Structure</a>.
     * </p>
     * 
     * @param listObjectParentPaths
     *        Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index
     *        node objects. For more information about objects, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     *        >Directory Structure</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListObjectParentPaths(BatchListObjectParentPaths listObjectParentPaths) {
        setListObjectParentPaths(listObjectParentPaths);
        return this;
    }

    /**
     * <p>
     * Retrieves metadata about an object.
     * </p>
     * 
     * @param getObjectInformation
     *        Retrieves metadata about an object.
     */

    public void setGetObjectInformation(BatchGetObjectInformation getObjectInformation) {
        this.getObjectInformation = getObjectInformation;
    }

    /**
     * <p>
     * Retrieves metadata about an object.
     * </p>
     * 
     * @return Retrieves metadata about an object.
     */

    public BatchGetObjectInformation getGetObjectInformation() {
        return this.getObjectInformation;
    }

    /**
     * <p>
     * Retrieves metadata about an object.
     * </p>
     * 
     * @param getObjectInformation
     *        Retrieves metadata about an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withGetObjectInformation(BatchGetObjectInformation getObjectInformation) {
        setGetObjectInformation(getObjectInformation);
        return this;
    }

    /**
     * <p>
     * Retrieves attributes within a facet that are associated with an object.
     * </p>
     * 
     * @param getObjectAttributes
     *        Retrieves attributes within a facet that are associated with an object.
     */

    public void setGetObjectAttributes(BatchGetObjectAttributes getObjectAttributes) {
        this.getObjectAttributes = getObjectAttributes;
    }

    /**
     * <p>
     * Retrieves attributes within a facet that are associated with an object.
     * </p>
     * 
     * @return Retrieves attributes within a facet that are associated with an object.
     */

    public BatchGetObjectAttributes getGetObjectAttributes() {
        return this.getObjectAttributes;
    }

    /**
     * <p>
     * Retrieves attributes within a facet that are associated with an object.
     * </p>
     * 
     * @param getObjectAttributes
     *        Retrieves attributes within a facet that are associated with an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withGetObjectAttributes(BatchGetObjectAttributes getObjectAttributes) {
        setGetObjectAttributes(getObjectAttributes);
        return this;
    }

    /**
     * @param listObjectParents
     */

    public void setListObjectParents(BatchListObjectParents listObjectParents) {
        this.listObjectParents = listObjectParents;
    }

    /**
     * @return
     */

    public BatchListObjectParents getListObjectParents() {
        return this.listObjectParents;
    }

    /**
     * @param listObjectParents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListObjectParents(BatchListObjectParents listObjectParents) {
        setListObjectParents(listObjectParents);
        return this;
    }

    /**
     * <p>
     * Returns policies attached to an object in pagination fashion.
     * </p>
     * 
     * @param listObjectPolicies
     *        Returns policies attached to an object in pagination fashion.
     */

    public void setListObjectPolicies(BatchListObjectPolicies listObjectPolicies) {
        this.listObjectPolicies = listObjectPolicies;
    }

    /**
     * <p>
     * Returns policies attached to an object in pagination fashion.
     * </p>
     * 
     * @return Returns policies attached to an object in pagination fashion.
     */

    public BatchListObjectPolicies getListObjectPolicies() {
        return this.listObjectPolicies;
    }

    /**
     * <p>
     * Returns policies attached to an object in pagination fashion.
     * </p>
     * 
     * @param listObjectPolicies
     *        Returns policies attached to an object in pagination fashion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListObjectPolicies(BatchListObjectPolicies listObjectPolicies) {
        setListObjectPolicies(listObjectPolicies);
        return this;
    }

    /**
     * <p>
     * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * </p>
     * 
     * @param listPolicyAttachments
     *        Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     */

    public void setListPolicyAttachments(BatchListPolicyAttachments listPolicyAttachments) {
        this.listPolicyAttachments = listPolicyAttachments;
    }

    /**
     * <p>
     * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * </p>
     * 
     * @return Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     */

    public BatchListPolicyAttachments getListPolicyAttachments() {
        return this.listPolicyAttachments;
    }

    /**
     * <p>
     * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * </p>
     * 
     * @param listPolicyAttachments
     *        Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListPolicyAttachments(BatchListPolicyAttachments listPolicyAttachments) {
        setListPolicyAttachments(listPolicyAttachments);
        return this;
    }

    /**
     * <p>
     * Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     * present, an empty list is returned. If policies are present, and if some objects don't have the policies
     * attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it returns
     * <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that don't lead to the
     * root from the target object are ignored. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * 
     * @param lookupPolicy
     *        Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     *        present, an empty list is returned. If policies are present, and if some objects don't have the policies
     *        attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it
     *        returns <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that
     *        don't lead to the root from the target object are ignored. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     */

    public void setLookupPolicy(BatchLookupPolicy lookupPolicy) {
        this.lookupPolicy = lookupPolicy;
    }

    /**
     * <p>
     * Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     * present, an empty list is returned. If policies are present, and if some objects don't have the policies
     * attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it returns
     * <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that don't lead to the
     * root from the target object are ignored. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * 
     * @return Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no
     *         policies present, an empty list is returned. If policies are present, and if some objects don't have the
     *         policies attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are
     *         present, it returns <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>.
     *         Paths that don't lead to the root from the target object are ignored. For more information, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *         >Policies</a>.
     */

    public BatchLookupPolicy getLookupPolicy() {
        return this.lookupPolicy;
    }

    /**
     * <p>
     * Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     * present, an empty list is returned. If policies are present, and if some objects don't have the policies
     * attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it returns
     * <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that don't lead to the
     * root from the target object are ignored. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * 
     * @param lookupPolicy
     *        Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     *        present, an empty list is returned. If policies are present, and if some objects don't have the policies
     *        attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it
     *        returns <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that
     *        don't lead to the root from the target object are ignored. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withLookupPolicy(BatchLookupPolicy lookupPolicy) {
        setLookupPolicy(lookupPolicy);
        return this;
    }

    /**
     * <p>
     * Lists objects attached to the specified index.
     * </p>
     * 
     * @param listIndex
     *        Lists objects attached to the specified index.
     */

    public void setListIndex(BatchListIndex listIndex) {
        this.listIndex = listIndex;
    }

    /**
     * <p>
     * Lists objects attached to the specified index.
     * </p>
     * 
     * @return Lists objects attached to the specified index.
     */

    public BatchListIndex getListIndex() {
        return this.listIndex;
    }

    /**
     * <p>
     * Lists objects attached to the specified index.
     * </p>
     * 
     * @param listIndex
     *        Lists objects attached to the specified index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListIndex(BatchListIndex listIndex) {
        setListIndex(listIndex);
        return this;
    }

    /**
     * <p>
     * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listOutgoingTypedLinks
     *        Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     *        supports filtering by typed link facet and identity attributes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     */

    public void setListOutgoingTypedLinks(BatchListOutgoingTypedLinks listOutgoingTypedLinks) {
        this.listOutgoingTypedLinks = listOutgoingTypedLinks;
    }

    /**
     * <p>
     * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @return Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     *         supports filtering by typed link facet and identity attributes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *         >Typed Links</a>.
     */

    public BatchListOutgoingTypedLinks getListOutgoingTypedLinks() {
        return this.listOutgoingTypedLinks;
    }

    /**
     * <p>
     * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listOutgoingTypedLinks
     *        Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     *        supports filtering by typed link facet and identity attributes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListOutgoingTypedLinks(BatchListOutgoingTypedLinks listOutgoingTypedLinks) {
        setListOutgoingTypedLinks(listOutgoingTypedLinks);
        return this;
    }

    /**
     * <p>
     * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listIncomingTypedLinks
     *        Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     *        supports filtering by typed link facet and identity attributes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     */

    public void setListIncomingTypedLinks(BatchListIncomingTypedLinks listIncomingTypedLinks) {
        this.listIncomingTypedLinks = listIncomingTypedLinks;
    }

    /**
     * <p>
     * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @return Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     *         supports filtering by typed link facet and identity attributes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *         >Typed Links</a>.
     */

    public BatchListIncomingTypedLinks getListIncomingTypedLinks() {
        return this.listIncomingTypedLinks;
    }

    /**
     * <p>
     * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listIncomingTypedLinks
     *        Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     *        supports filtering by typed link facet and identity attributes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withListIncomingTypedLinks(BatchListIncomingTypedLinks listIncomingTypedLinks) {
        setListIncomingTypedLinks(listIncomingTypedLinks);
        return this;
    }

    /**
     * <p>
     * Retrieves attributes that are associated with a typed link.
     * </p>
     * 
     * @param getLinkAttributes
     *        Retrieves attributes that are associated with a typed link.
     */

    public void setGetLinkAttributes(BatchGetLinkAttributes getLinkAttributes) {
        this.getLinkAttributes = getLinkAttributes;
    }

    /**
     * <p>
     * Retrieves attributes that are associated with a typed link.
     * </p>
     * 
     * @return Retrieves attributes that are associated with a typed link.
     */

    public BatchGetLinkAttributes getGetLinkAttributes() {
        return this.getLinkAttributes;
    }

    /**
     * <p>
     * Retrieves attributes that are associated with a typed link.
     * </p>
     * 
     * @param getLinkAttributes
     *        Retrieves attributes that are associated with a typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperation withGetLinkAttributes(BatchGetLinkAttributes getLinkAttributes) {
        setGetLinkAttributes(getLinkAttributes);
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
        if (getListObjectAttributes() != null)
            sb.append("ListObjectAttributes: ").append(getListObjectAttributes()).append(",");
        if (getListObjectChildren() != null)
            sb.append("ListObjectChildren: ").append(getListObjectChildren()).append(",");
        if (getListAttachedIndices() != null)
            sb.append("ListAttachedIndices: ").append(getListAttachedIndices()).append(",");
        if (getListObjectParentPaths() != null)
            sb.append("ListObjectParentPaths: ").append(getListObjectParentPaths()).append(",");
        if (getGetObjectInformation() != null)
            sb.append("GetObjectInformation: ").append(getGetObjectInformation()).append(",");
        if (getGetObjectAttributes() != null)
            sb.append("GetObjectAttributes: ").append(getGetObjectAttributes()).append(",");
        if (getListObjectParents() != null)
            sb.append("ListObjectParents: ").append(getListObjectParents()).append(",");
        if (getListObjectPolicies() != null)
            sb.append("ListObjectPolicies: ").append(getListObjectPolicies()).append(",");
        if (getListPolicyAttachments() != null)
            sb.append("ListPolicyAttachments: ").append(getListPolicyAttachments()).append(",");
        if (getLookupPolicy() != null)
            sb.append("LookupPolicy: ").append(getLookupPolicy()).append(",");
        if (getListIndex() != null)
            sb.append("ListIndex: ").append(getListIndex()).append(",");
        if (getListOutgoingTypedLinks() != null)
            sb.append("ListOutgoingTypedLinks: ").append(getListOutgoingTypedLinks()).append(",");
        if (getListIncomingTypedLinks() != null)
            sb.append("ListIncomingTypedLinks: ").append(getListIncomingTypedLinks()).append(",");
        if (getGetLinkAttributes() != null)
            sb.append("GetLinkAttributes: ").append(getGetLinkAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchReadOperation == false)
            return false;
        BatchReadOperation other = (BatchReadOperation) obj;
        if (other.getListObjectAttributes() == null ^ this.getListObjectAttributes() == null)
            return false;
        if (other.getListObjectAttributes() != null && other.getListObjectAttributes().equals(this.getListObjectAttributes()) == false)
            return false;
        if (other.getListObjectChildren() == null ^ this.getListObjectChildren() == null)
            return false;
        if (other.getListObjectChildren() != null && other.getListObjectChildren().equals(this.getListObjectChildren()) == false)
            return false;
        if (other.getListAttachedIndices() == null ^ this.getListAttachedIndices() == null)
            return false;
        if (other.getListAttachedIndices() != null && other.getListAttachedIndices().equals(this.getListAttachedIndices()) == false)
            return false;
        if (other.getListObjectParentPaths() == null ^ this.getListObjectParentPaths() == null)
            return false;
        if (other.getListObjectParentPaths() != null && other.getListObjectParentPaths().equals(this.getListObjectParentPaths()) == false)
            return false;
        if (other.getGetObjectInformation() == null ^ this.getGetObjectInformation() == null)
            return false;
        if (other.getGetObjectInformation() != null && other.getGetObjectInformation().equals(this.getGetObjectInformation()) == false)
            return false;
        if (other.getGetObjectAttributes() == null ^ this.getGetObjectAttributes() == null)
            return false;
        if (other.getGetObjectAttributes() != null && other.getGetObjectAttributes().equals(this.getGetObjectAttributes()) == false)
            return false;
        if (other.getListObjectParents() == null ^ this.getListObjectParents() == null)
            return false;
        if (other.getListObjectParents() != null && other.getListObjectParents().equals(this.getListObjectParents()) == false)
            return false;
        if (other.getListObjectPolicies() == null ^ this.getListObjectPolicies() == null)
            return false;
        if (other.getListObjectPolicies() != null && other.getListObjectPolicies().equals(this.getListObjectPolicies()) == false)
            return false;
        if (other.getListPolicyAttachments() == null ^ this.getListPolicyAttachments() == null)
            return false;
        if (other.getListPolicyAttachments() != null && other.getListPolicyAttachments().equals(this.getListPolicyAttachments()) == false)
            return false;
        if (other.getLookupPolicy() == null ^ this.getLookupPolicy() == null)
            return false;
        if (other.getLookupPolicy() != null && other.getLookupPolicy().equals(this.getLookupPolicy()) == false)
            return false;
        if (other.getListIndex() == null ^ this.getListIndex() == null)
            return false;
        if (other.getListIndex() != null && other.getListIndex().equals(this.getListIndex()) == false)
            return false;
        if (other.getListOutgoingTypedLinks() == null ^ this.getListOutgoingTypedLinks() == null)
            return false;
        if (other.getListOutgoingTypedLinks() != null && other.getListOutgoingTypedLinks().equals(this.getListOutgoingTypedLinks()) == false)
            return false;
        if (other.getListIncomingTypedLinks() == null ^ this.getListIncomingTypedLinks() == null)
            return false;
        if (other.getListIncomingTypedLinks() != null && other.getListIncomingTypedLinks().equals(this.getListIncomingTypedLinks()) == false)
            return false;
        if (other.getGetLinkAttributes() == null ^ this.getGetLinkAttributes() == null)
            return false;
        if (other.getGetLinkAttributes() != null && other.getGetLinkAttributes().equals(this.getGetLinkAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListObjectAttributes() == null) ? 0 : getListObjectAttributes().hashCode());
        hashCode = prime * hashCode + ((getListObjectChildren() == null) ? 0 : getListObjectChildren().hashCode());
        hashCode = prime * hashCode + ((getListAttachedIndices() == null) ? 0 : getListAttachedIndices().hashCode());
        hashCode = prime * hashCode + ((getListObjectParentPaths() == null) ? 0 : getListObjectParentPaths().hashCode());
        hashCode = prime * hashCode + ((getGetObjectInformation() == null) ? 0 : getGetObjectInformation().hashCode());
        hashCode = prime * hashCode + ((getGetObjectAttributes() == null) ? 0 : getGetObjectAttributes().hashCode());
        hashCode = prime * hashCode + ((getListObjectParents() == null) ? 0 : getListObjectParents().hashCode());
        hashCode = prime * hashCode + ((getListObjectPolicies() == null) ? 0 : getListObjectPolicies().hashCode());
        hashCode = prime * hashCode + ((getListPolicyAttachments() == null) ? 0 : getListPolicyAttachments().hashCode());
        hashCode = prime * hashCode + ((getLookupPolicy() == null) ? 0 : getLookupPolicy().hashCode());
        hashCode = prime * hashCode + ((getListIndex() == null) ? 0 : getListIndex().hashCode());
        hashCode = prime * hashCode + ((getListOutgoingTypedLinks() == null) ? 0 : getListOutgoingTypedLinks().hashCode());
        hashCode = prime * hashCode + ((getListIncomingTypedLinks() == null) ? 0 : getListIncomingTypedLinks().hashCode());
        hashCode = prime * hashCode + ((getGetLinkAttributes() == null) ? 0 : getGetLinkAttributes().hashCode());
        return hashCode;
    }

    @Override
    public BatchReadOperation clone() {
        try {
            return (BatchReadOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchReadOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

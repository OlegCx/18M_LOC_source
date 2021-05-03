// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServicePrincipalsOrderby. */
public final class ServicePrincipalsOrderby extends ExpandableStringEnum<ServicePrincipalsOrderby> {
    /** Static value id for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby ID = fromString("id");

    /** Static value id desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby ID_DESC = fromString("id desc");

    /** Static value deletedDateTime for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value deletedDateTime desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby DELETED_DATE_TIME_DESC = fromString("deletedDateTime desc");

    /** Static value appRoleId for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby APP_ROLE_ID = fromString("appRoleId");

    /** Static value appRoleId desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby APP_ROLE_ID_DESC = fromString("appRoleId desc");

    /** Static value createdDateTime for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby CREATED_DATE_TIME = fromString("createdDateTime");

    /** Static value createdDateTime desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby CREATED_DATE_TIME_DESC = fromString("createdDateTime desc");

    /** Static value principalDisplayName for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby PRINCIPAL_DISPLAY_NAME = fromString("principalDisplayName");

    /** Static value principalDisplayName desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby PRINCIPAL_DISPLAY_NAME_DESC = fromString("principalDisplayName desc");

    /** Static value principalId for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby PRINCIPAL_ID = fromString("principalId");

    /** Static value principalId desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby PRINCIPAL_ID_DESC = fromString("principalId desc");

    /** Static value principalType for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby PRINCIPAL_TYPE = fromString("principalType");

    /** Static value principalType desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby PRINCIPAL_TYPE_DESC = fromString("principalType desc");

    /** Static value resourceDisplayName for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby RESOURCE_DISPLAY_NAME = fromString("resourceDisplayName");

    /** Static value resourceDisplayName desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby RESOURCE_DISPLAY_NAME_DESC = fromString("resourceDisplayName desc");

    /** Static value resourceId for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby RESOURCE_ID = fromString("resourceId");

    /** Static value resourceId desc for ServicePrincipalsOrderby. */
    public static final ServicePrincipalsOrderby RESOURCE_ID_DESC = fromString("resourceId desc");

    /**
     * Creates or finds a ServicePrincipalsOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServicePrincipalsOrderby.
     */
    @JsonCreator
    public static ServicePrincipalsOrderby fromString(String name) {
        return fromString(name, ServicePrincipalsOrderby.class);
    }

    /** @return known ServicePrincipalsOrderby values. */
    public static Collection<ServicePrincipalsOrderby> values() {
        return values(ServicePrincipalsOrderby.class);
    }
}
/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.RestorePointInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;
import org.joda.time.DateTime;

/**
 * Type representing RestorePoint.
 */
public interface RestorePoint extends HasInner<RestorePointInner>, Indexable, Refreshable<RestorePoint>, HasManager<SynapseManager> {
    /**
     * @return the earliestRestoreDate value.
     */
    DateTime earliestRestoreDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the restorePointCreationDate value.
     */
    DateTime restorePointCreationDate();

    /**
     * @return the restorePointLabel value.
     */
    String restorePointLabel();

    /**
     * @return the restorePointType value.
     */
    RestorePointType restorePointType();

    /**
     * @return the type value.
     */
    String type();

}
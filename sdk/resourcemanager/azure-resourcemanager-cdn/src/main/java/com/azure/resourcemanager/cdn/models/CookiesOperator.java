// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CookiesOperator. */
public final class CookiesOperator extends ExpandableStringEnum<CookiesOperator> {
    /** Static value Any for CookiesOperator. */
    public static final CookiesOperator ANY = fromString("Any");

    /** Static value Equal for CookiesOperator. */
    public static final CookiesOperator EQUAL = fromString("Equal");

    /** Static value Contains for CookiesOperator. */
    public static final CookiesOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for CookiesOperator. */
    public static final CookiesOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for CookiesOperator. */
    public static final CookiesOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for CookiesOperator. */
    public static final CookiesOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for CookiesOperator. */
    public static final CookiesOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for CookiesOperator. */
    public static final CookiesOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for CookiesOperator. */
    public static final CookiesOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value RegEx for CookiesOperator. */
    public static final CookiesOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a CookiesOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CookiesOperator.
     */
    @JsonCreator
    public static CookiesOperator fromString(String name) {
        return fromString(name, CookiesOperator.class);
    }

    /** @return known CookiesOperator values. */
    public static Collection<CookiesOperator> values() {
        return values(CookiesOperator.class);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for RenderingType. */
public enum RenderingType {
    /** Enum value NoGraph. */
    NO_GRAPH("NoGraph"),

    /** Enum value Table. */
    TABLE("Table"),

    /** Enum value TimeSeries. */
    TIME_SERIES("TimeSeries"),

    /** Enum value TimeSeriesPerInstance. */
    TIME_SERIES_PER_INSTANCE("TimeSeriesPerInstance"),

    /** Enum value PieChart. */
    PIE_CHART("PieChart"),

    /** Enum value DataSummary. */
    DATA_SUMMARY("DataSummary"),

    /** Enum value Email. */
    EMAIL("Email"),

    /** Enum value Insights. */
    INSIGHTS("Insights"),

    /** Enum value DynamicInsight. */
    DYNAMIC_INSIGHT("DynamicInsight"),

    /** Enum value Markdown. */
    MARKDOWN("Markdown"),

    /** Enum value Detector. */
    DETECTOR("Detector"),

    /** Enum value DropDown. */
    DROP_DOWN("DropDown"),

    /** Enum value Card. */
    CARD("Card"),

    /** Enum value Solution. */
    SOLUTION("Solution"),

    /** Enum value Guage. */
    GUAGE("Guage"),

    /** Enum value Form. */
    FORM("Form"),

    /** Enum value ChangeSets. */
    CHANGE_SETS("ChangeSets"),

    /** Enum value ChangeAnalysisOnboarding. */
    CHANGE_ANALYSIS_ONBOARDING("ChangeAnalysisOnboarding"),

    /** Enum value ChangesView. */
    CHANGES_VIEW("ChangesView"),

    /** Enum value AppInsight. */
    APP_INSIGHT("AppInsight"),

    /** Enum value DependencyGraph. */
    DEPENDENCY_GRAPH("DependencyGraph"),

    /** Enum value DownTime. */
    DOWN_TIME("DownTime"),

    /** Enum value SummaryCard. */
    SUMMARY_CARD("SummaryCard"),

    /** Enum value SearchComponent. */
    SEARCH_COMPONENT("SearchComponent"),

    /** Enum value AppInsightEnablement. */
    APP_INSIGHT_ENABLEMENT("AppInsightEnablement");

    /** The actual serialized value for a RenderingType instance. */
    private final String value;

    RenderingType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RenderingType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RenderingType object, or null if unable to parse.
     */
    @JsonCreator
    public static RenderingType fromString(String value) {
        RenderingType[] items = RenderingType.values();
        for (RenderingType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
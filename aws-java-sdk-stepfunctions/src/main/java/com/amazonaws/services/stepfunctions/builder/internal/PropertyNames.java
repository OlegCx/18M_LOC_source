/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.stepfunctions.builder.internal;

/**
 * JSON property names used for serialization/deserialization.
 */
public class PropertyNames {

    private PropertyNames() {
    }

    // Common property names
    public static final String TYPE = "Type";
    public static final String COMMENT = "Comment";
    public static final String NEXT = "Next";
    public static final String TIMEOUT_SECONDS = "TimeoutSeconds";
    public static final String START_AT = "StartAt";
    public static final String STATES = "States";
    public static final String RESULT = "Result";
    public static final String RESULT_PATH = "ResultPath";
    public static final String INPUT_PATH = "InputPath";
    public static final String OUTPUT_PATH = "OutputPath";
    public static final String ITEMS_PATH = "ItemsPath";
    public static final String PARAMETERS = "Parameters";
    public static final String RESULT_SELECTOR = "ResultSelector";
    public static final String END = "End";
    public static final String VERSION = "Version";

    // TaskState property names
    public static final String RESOURCE = "Resource";
    public static final String HEARTBEAT_SECONDS = "HeartbeatSeconds";
    public static final String HEARTBEAT_SECONDS_PATH = "HeartbeatSecondsPath";
    public static final String TIMEOUT_SECONDS_PATH = "TimeoutSecondsPath";

    // ParallelState property names
    public static final String BRANCHES = "Branches";

    // MapState property names
    public static final String ITERATOR = "Iterator";
    public static final String MAX_CONCURRENCY = "MaxConcurrency";

    // FailState property names
    public static final String ERROR = "Error";
    public static final String CAUSE = "Cause";

    // ChoiceState propert names
    public static final String DEFAULT_STATE = "Default";
    public static final String CHOICES = "Choices";

    // Retrier/Catcher property names
    public static final String RETRY = "Retry";
    public static final String CATCH = "Catch";
    public static final String ERROR_EQUALS = "ErrorEquals";
    public static final String INTERVAL_SECONDS = "IntervalSeconds";
    public static final String MAX_ATTEMPTS = "MaxAttempts";
    public static final String BACKOFF_RATE = "BackoffRate";

    // WaitState property names
    public static final String SECONDS = "Seconds";
    public static final String TIMESTAMP = "Timestamp";
    public static final String TIMESTAMP_PATH = "TimestampPath";
    public static final String SECONDS_PATH = "SecondsPath";

    // Binary condition property names
    public static final String VARIABLE = "Variable";

    // Binary string condition property names
    public static final String STRING_EQUALS = "StringEquals";
    public static final String STRING_LESS_THAN = "StringLessThan";
    public static final String STRING_GREATER_THAN = "StringGreaterThan";
    public static final String STRING_GREATER_THAN_EQUALS = "StringGreaterThanEquals";
    public static final String STRING_LESS_THAN_EQUALS = "StringLessThanEquals";
    public static final String STRING_EQUALS_PATH = "StringEqualsPath";
    public static final String STRING_LESS_THAN_PATH = "StringLessThanPath";
    public static final String STRING_GREATER_THAN_PATH = "StringGreaterThanPath";
    public static final String STRING_GREATER_THAN_EQUALS_PATH = "StringGreaterThanEqualsPath";
    public static final String STRING_LESS_THAN_EQUALS_PATH = "StringLessThanEqualsPath";

    // Binary numeric condition property names
    public static final String NUMERIC_EQUALS = "NumericEquals";
    public static final String NUMERIC_LESS_THAN = "NumericLessThan";
    public static final String NUMERIC_GREATER_THAN = "NumericGreaterThan";
    public static final String NUMERIC_GREATER_THAN_EQUALS = "NumericGreaterThanEquals";
    public static final String NUMERIC_LESS_THAN_EQUALS = "NumericLessThanEquals";
    public static final String NUMERIC_EQUALS_PATH = "NumericEqualsPath";
    public static final String NUMERIC_LESS_THAN_PATH = "NumericLessThanPath";
    public static final String NUMERIC_GREATER_THAN_PATH = "NumericGreaterThanPath";
    public static final String NUMERIC_GREATER_THAN_EQUALS_PATH = "NumericGreaterThanEqualsPath";
    public static final String NUMERIC_LESS_THAN_EQUALS_PATH = "NumericLessThanEqualsPath";

    // Binary timestamp condition property names
    public static final String TIMESTAMP_EQUALS = "TimestampEquals";
    public static final String TIMESTAMP_LESS_THAN = "TimestampLessThan";
    public static final String TIMESTAMP_GREATER_THAN = "TimestampGreaterThan";
    public static final String TIMESTAMP_GREATER_THAN_EQUALS = "TimestampGreaterThanEquals";
    public static final String TIMESTAMP_LESS_THAN_EQUALS = "TimestampLessThanEquals";
    public static final String TIMESTAMP_EQUALS_PATH = "TimestampEqualsPath";
    public static final String TIMESTAMP_LESS_THAN_PATH = "TimestampLessThanPath";
    public static final String TIMESTAMP_GREATER_THAN_PATH = "TimestampGreaterThanPath";
    public static final String TIMESTAMP_GREATER_THAN_EQUALS_PATH = "TimestampGreaterThanEqualsPath";
    public static final String TIMESTAMP_LESS_THAN_EQUALS_PATH = "TimestampLessThanEqualsPath";

    // Binary boolean condition property names
    public static final String BOOLEAN_EQUALS = "BooleanEquals";
    public static final String BOOLEAN_EQUALS_PATH = "BooleanEqualsPath";

    // Binary type condition property names
    public static final String IS_NULL = "IsNull";
    public static final String IS_PRESENT = "IsPresent";
    public static final String IS_BOOLEAN = "IsBoolean";
    public static final String IS_STRING = "IsString";
    public static final String IS_NUMERIC = "IsNumeric";
    public static final String IS_TIMESTAMP = "IsTimestamp";

    // Composite conditions property names
    public static final String AND = "And";
    public static final String OR = "Or";
    public static final String NOT = "Not";

    // Binary string pattern condition names
    public static final String STRING_MATCHES = "StringMatches";

}

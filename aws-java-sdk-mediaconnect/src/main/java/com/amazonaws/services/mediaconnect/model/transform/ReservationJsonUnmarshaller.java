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
package com.amazonaws.services.mediaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Reservation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationJsonUnmarshaller implements Unmarshaller<Reservation, JsonUnmarshallerContext> {

    public Reservation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Reservation reservation = new Reservation();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("currencyCode", targetDepth)) {
                    context.nextToken();
                    reservation.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("duration", targetDepth)) {
                    context.nextToken();
                    reservation.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("durationUnits", targetDepth)) {
                    context.nextToken();
                    reservation.setDurationUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("end", targetDepth)) {
                    context.nextToken();
                    reservation.setEnd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("offeringArn", targetDepth)) {
                    context.nextToken();
                    reservation.setOfferingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("offeringDescription", targetDepth)) {
                    context.nextToken();
                    reservation.setOfferingDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pricePerUnit", targetDepth)) {
                    context.nextToken();
                    reservation.setPricePerUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("priceUnits", targetDepth)) {
                    context.nextToken();
                    reservation.setPriceUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservationArn", targetDepth)) {
                    context.nextToken();
                    reservation.setReservationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservationName", targetDepth)) {
                    context.nextToken();
                    reservation.setReservationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservationState", targetDepth)) {
                    context.nextToken();
                    reservation.setReservationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceSpecification", targetDepth)) {
                    context.nextToken();
                    reservation.setResourceSpecification(ResourceSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("start", targetDepth)) {
                    context.nextToken();
                    reservation.setStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reservation;
    }

    private static ReservationJsonUnmarshaller instance;

    public static ReservationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationJsonUnmarshaller();
        return instance;
    }
}

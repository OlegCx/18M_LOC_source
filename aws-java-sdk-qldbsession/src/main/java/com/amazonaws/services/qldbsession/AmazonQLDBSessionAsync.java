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
package com.amazonaws.services.qldbsession;

import javax.annotation.Generated;

import com.amazonaws.services.qldbsession.model.*;

/**
 * Interface for accessing QLDB Session asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.qldbsession.AbstractAmazonQLDBSessionAsync} instead.
 * </p>
 * <p>
 * <p>
 * The transactional data APIs for Amazon QLDB
 * </p>
 * <note>
 * <p>
 * Instead of interacting directly with this API, we recommend using the QLDB driver or the QLDB shell to execute data
 * transactions on a ledger.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you are working with an AWS SDK, use the QLDB driver. The driver provides a high-level abstraction layer above
 * this <i>QLDB Session</i> data plane and manages <code>SendCommand</code> API calls for you. For information and a
 * list of supported programming languages, see <a
 * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-driver.html">Getting started with the
 * driver</a> in the <i>Amazon QLDB Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you are working with the AWS Command Line Interface (AWS CLI), use the QLDB shell. The shell is a command line
 * interface that uses the QLDB driver to interact with a ledger. For information, see <a
 * href="https://docs.aws.amazon.com/qldb/latest/developerguide/data-shell.html">Accessing Amazon QLDB using the QLDB
 * shell</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonQLDBSessionAsync extends AmazonQLDBSession {

    /**
     * <p>
     * Sends a command to an Amazon QLDB ledger.
     * </p>
     * <note>
     * <p>
     * Instead of interacting directly with this API, we recommend using the QLDB driver or the QLDB shell to execute
     * data transactions on a ledger.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are working with an AWS SDK, use the QLDB driver. The driver provides a high-level abstraction layer above
     * this <i>QLDB Session</i> data plane and manages <code>SendCommand</code> API calls for you. For information and a
     * list of supported programming languages, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-driver.html">Getting started with
     * the driver</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are working with the AWS Command Line Interface (AWS CLI), use the QLDB shell. The shell is a command line
     * interface that uses the QLDB driver to interact with a ledger. For information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/data-shell.html">Accessing Amazon QLDB using the
     * QLDB shell</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param sendCommandRequest
     * @return A Java Future containing the result of the SendCommand operation returned by the service.
     * @sample AmazonQLDBSessionAsync.SendCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/SendCommand" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest sendCommandRequest);

    /**
     * <p>
     * Sends a command to an Amazon QLDB ledger.
     * </p>
     * <note>
     * <p>
     * Instead of interacting directly with this API, we recommend using the QLDB driver or the QLDB shell to execute
     * data transactions on a ledger.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are working with an AWS SDK, use the QLDB driver. The driver provides a high-level abstraction layer above
     * this <i>QLDB Session</i> data plane and manages <code>SendCommand</code> API calls for you. For information and a
     * list of supported programming languages, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-driver.html">Getting started with
     * the driver</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are working with the AWS Command Line Interface (AWS CLI), use the QLDB shell. The shell is a command line
     * interface that uses the QLDB driver to interact with a ledger. For information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/data-shell.html">Accessing Amazon QLDB using the
     * QLDB shell</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param sendCommandRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendCommand operation returned by the service.
     * @sample AmazonQLDBSessionAsyncHandler.SendCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/SendCommand" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest sendCommandRequest,
            com.amazonaws.handlers.AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler);

}

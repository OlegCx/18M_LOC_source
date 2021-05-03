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
package com.amazonaws.services.rdsdata;

import javax.annotation.Generated;

import com.amazonaws.services.rdsdata.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSRDSData}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRDSData implements AWSRDSData {

    protected AbstractAWSRDSData() {
    }

    @Override
    public BatchExecuteStatementResult batchExecuteStatement(BatchExecuteStatementRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BeginTransactionResult beginTransaction(BeginTransactionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CommitTransactionResult commitTransaction(CommitTransactionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ExecuteSqlResult executeSql(ExecuteSqlRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExecuteStatementResult executeStatement(ExecuteStatementRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RollbackTransactionResult rollbackTransaction(RollbackTransactionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}

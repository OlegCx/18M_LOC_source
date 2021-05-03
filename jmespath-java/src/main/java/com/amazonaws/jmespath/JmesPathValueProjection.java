/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.jmespath;

/**
 * Class definition for value(object) projection that
 * allows you to apply an expression over a JSON object
 */
public class JmesPathValueProjection implements JmesPathExpression {

    /**
     * Represents the left expression
     */
    private final JmesPathExpression lhsExpr;

    /**
     * Represent the projection expression that is applied
     * to the left expression
     */
    private final JmesPathExpression rhsExpr;

    public JmesPathValueProjection(JmesPathExpression lhsExpr, JmesPathExpression rhsExpr) {
        this.lhsExpr = lhsExpr;
        this.rhsExpr = rhsExpr;
    }

    public JmesPathExpression getLhsExpr() {
        return lhsExpr;
    }

    public JmesPathExpression getRhsExpr() {
        return rhsExpr;
    }

    /**
     * Delegates to either the CodeGen visitor(JmesPathValueProjection) or
     * Evaluation visitor(JmesPathValueProjection) based on the type of JmesPath
     * visitor
     *
     * @param visitor  CodeGen visitor or Evaluation visitor
     * @param input    Input expression that needs to be evaluated
     * @param <Input>  Input type for the visitor
     *                 CodeGen visitor: Void
     *                 Evaluation visitor: JsonNode
     * @param <Output> Output type for the visitor
     *                 CodeGen visitor: String
     *                 Evaluation visitor: JsonNode
     * @return Corresponding output is returned. Evaluated String
     * in the case of CodeGen visitor or an evaluated JsonNode
     * in the case of Evaluation visitor
     * @throws InvalidTypeException
     */
    @Override
    public <Input, Output> Output accept(JmesPathVisitor<Input, Output> visitor, Input input)
            throws InvalidTypeException {
        return visitor.visit(this, input);
    }
}

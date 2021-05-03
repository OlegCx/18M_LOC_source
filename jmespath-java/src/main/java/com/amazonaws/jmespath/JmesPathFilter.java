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
 * Class definition for filter expression that provides a way
 * to select JSON elements based on a comparison to another
 * expression.
 */
public class JmesPathFilter implements JmesPathExpression {

    /**
     * Represents the left expression
     */
    private final JmesPathExpression lhsExpr;

    /**
     * Represents the right expression
     */
    private final JmesPathExpression rhsExpr;

    /**
     * Represents the comparison operator
     */
    private final JmesPathExpression comparator;

    public JmesPathFilter(JmesPathExpression lhsExpr, JmesPathExpression rhsExpr, JmesPathExpression comparator) {
        this.lhsExpr = lhsExpr;
        this.rhsExpr = rhsExpr;
        this.comparator = comparator;
    }

    public JmesPathExpression getRhsExpr() {
        return rhsExpr;
    }

    public JmesPathExpression getLhsExpr() {
        return lhsExpr;
    }

    public JmesPathExpression getComparator() {
        return comparator;
    }

    /**
     * Delegates to either the CodeGen visitor(JmesPathFilter) or
     * Evaluation visitor(JmesPathFilter) based on the type of JmesPath
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
    public <Input, Output> Output accept(JmesPathVisitor<Input, Output> visitor, Input input) throws InvalidTypeException {
        return visitor.visit(this, input);
    }
}

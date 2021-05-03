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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of the <code>CreateBudget</code> operation. The content consists of the detailed metadata and
 * data file information, and the current status of the <code>budget</code> object.
 * </p>
 * <p>
 * This is the ARN pattern for a budget:
 * </p>
 * <p>
 * <code>arn:aws:budgets::AccountId:budget/budgetName</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Budget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a budget. The name must be unique within an account. The <code>:</code> and <code>\</code> characters
     * aren't allowed in <code>BudgetName</code>.
     * </p>
     */
    private String budgetName;
    /**
     * <p>
     * The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage that you want to track with your budget.
     * </p>
     * <p>
     * <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI or Savings Plans utilization
     * or coverage budgets. RI and Savings Plans utilization or coverage budgets default to <code>100</code>, which is
     * the only valid value for RI or Savings Plans utilization or coverage budgets. You can't use
     * <code>BudgetLimit</code> with <code>PlannedBudgetLimits</code> for <code>CreateBudget</code> and
     * <code>UpdateBudget</code> actions.
     * </p>
     */
    private Spend budgetLimit;
    /**
     * <p>
     * A map containing multiple <code>BudgetLimit</code>, including current or future limits.
     * </p>
     * <p>
     * <code>PlannedBudgetLimits</code> is available for cost or usage budget and supports monthly and quarterly
     * <code>TimeUnit</code>.
     * </p>
     * <p>
     * For monthly budgets, provide 12 months of <code>PlannedBudgetLimits</code> values. This must start from the
     * current month and include the next 11 months. The <code>key</code> is the start of the month, <code>UTC</code> in
     * epoch seconds.
     * </p>
     * <p>
     * For quarterly budgets, provide 4 quarters of <code>PlannedBudgetLimits</code> value entries in standard calendar
     * quarter increments. This must start from the current quarter and include the next 3 quarters. The
     * <code>key</code> is the start of the quarter, <code>UTC</code> in epoch seconds.
     * </p>
     * <p>
     * If the planned budget expires before 12 months for monthly or 4 quarters for quarterly, provide the
     * <code>PlannedBudgetLimits</code> values only for the remaining periods.
     * </p>
     * <p>
     * If the budget begins at a date in the future, provide <code>PlannedBudgetLimits</code> values from the start date
     * of the budget.
     * </p>
     * <p>
     * After all of the <code>BudgetLimit</code> values in <code>PlannedBudgetLimits</code> are used, the budget
     * continues to use the last limit as the <code>BudgetLimit</code>. At that point, the planned budget provides the
     * same experience as a fixed budget.
     * </p>
     * <p>
     * <code>DescribeBudget</code> and <code>DescribeBudgets</code> response along with <code>PlannedBudgetLimits</code>
     * will also contain <code>BudgetLimit</code> representing the current month or quarter limit present in
     * <code>PlannedBudgetLimits</code>. This only applies to budgets created with <code>PlannedBudgetLimits</code>.
     * Budgets created without <code>PlannedBudgetLimits</code> will only contain <code>BudgetLimit</code>, and no
     * <code>PlannedBudgetLimits</code>.
     * </p>
     */
    private java.util.Map<String, Spend> plannedBudgetLimits;
    /**
     * <p>
     * The cost filters, such as service or tag, that are applied to a budget.
     * </p>
     * <p>
     * AWS Budgets supports the following services as a filter for RI budgets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Elastic Compute Cloud - Compute
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Redshift
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ElastiCache
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Elasticsearch Service
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, java.util.List<String>> costFilters;
    /**
     * <p>
     * The types of costs that are included in this <code>COST</code> budget.
     * </p>
     * <p>
     * <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>, <code>SAVINGS_PLANS_UTILIZATION</code>
     * , and <code>SAVINGS_PLANS_COVERAGE</code> budgets do not have <code>CostTypes</code>.
     * </p>
     */
    private CostTypes costTypes;
    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     */
    private String timeUnit;
    /**
     * <p>
     * The period of time that is covered by a budget. The period has a start date and an end date. The start date must
     * come before the end date. The end date must come before <code>06/15/87 00:00 UTC</code>.
     * </p>
     * <p>
     * If you create your budget and don't specify a start date, AWS defaults to the start of your chosen time period
     * (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24, 2018, chose
     * <code>DAILY</code>, and didn't set a start date, AWS set your start date to <code>01/24/18 00:00 UTC</code>. If
     * you chose <code>MONTHLY</code>, AWS set your start date to <code>01/01/18 00:00 UTC</code>. If you didn't specify
     * an end date, AWS set your end date to <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS
     * Billing and Cost Management console and the API.
     * </p>
     * <p>
     * You can change either date with the <code>UpdateBudget</code> operation.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * </p>
     */
    private TimePeriod timePeriod;
    /**
     * <p>
     * The actual and forecasted cost or usage that the budget tracks.
     * </p>
     */
    private CalculatedSpend calculatedSpend;
    /**
     * <p>
     * Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage.
     * </p>
     */
    private String budgetType;
    /**
     * <p>
     * The last time that you updated this budget.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The name of a budget. The name must be unique within an account. The <code>:</code> and <code>\</code> characters
     * aren't allowed in <code>BudgetName</code>.
     * </p>
     * 
     * @param budgetName
     *        The name of a budget. The name must be unique within an account. The <code>:</code> and <code>\</code>
     *        characters aren't allowed in <code>BudgetName</code>.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of a budget. The name must be unique within an account. The <code>:</code> and <code>\</code> characters
     * aren't allowed in <code>BudgetName</code>.
     * </p>
     * 
     * @return The name of a budget. The name must be unique within an account. The <code>:</code> and <code>\</code>
     *         characters aren't allowed in <code>BudgetName</code>.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of a budget. The name must be unique within an account. The <code>:</code> and <code>\</code> characters
     * aren't allowed in <code>BudgetName</code>.
     * </p>
     * 
     * @param budgetName
     *        The name of a budget. The name must be unique within an account. The <code>:</code> and <code>\</code>
     *        characters aren't allowed in <code>BudgetName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage that you want to track with your budget.
     * </p>
     * <p>
     * <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI or Savings Plans utilization
     * or coverage budgets. RI and Savings Plans utilization or coverage budgets default to <code>100</code>, which is
     * the only valid value for RI or Savings Plans utilization or coverage budgets. You can't use
     * <code>BudgetLimit</code> with <code>PlannedBudgetLimits</code> for <code>CreateBudget</code> and
     * <code>UpdateBudget</code> actions.
     * </p>
     * 
     * @param budgetLimit
     *        The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     *        coverage that you want to track with your budget.</p>
     *        <p>
     *        <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI or Savings Plans
     *        utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default to
     *        <code>100</code>, which is the only valid value for RI or Savings Plans utilization or coverage budgets.
     *        You can't use <code>BudgetLimit</code> with <code>PlannedBudgetLimits</code> for <code>CreateBudget</code>
     *        and <code>UpdateBudget</code> actions.
     */

    public void setBudgetLimit(Spend budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    /**
     * <p>
     * The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage that you want to track with your budget.
     * </p>
     * <p>
     * <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI or Savings Plans utilization
     * or coverage budgets. RI and Savings Plans utilization or coverage budgets default to <code>100</code>, which is
     * the only valid value for RI or Savings Plans utilization or coverage budgets. You can't use
     * <code>BudgetLimit</code> with <code>PlannedBudgetLimits</code> for <code>CreateBudget</code> and
     * <code>UpdateBudget</code> actions.
     * </p>
     * 
     * @return The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     *         coverage that you want to track with your budget.</p>
     *         <p>
     *         <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI or Savings Plans
     *         utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default to
     *         <code>100</code>, which is the only valid value for RI or Savings Plans utilization or coverage budgets.
     *         You can't use <code>BudgetLimit</code> with <code>PlannedBudgetLimits</code> for
     *         <code>CreateBudget</code> and <code>UpdateBudget</code> actions.
     */

    public Spend getBudgetLimit() {
        return this.budgetLimit;
    }

    /**
     * <p>
     * The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage that you want to track with your budget.
     * </p>
     * <p>
     * <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI or Savings Plans utilization
     * or coverage budgets. RI and Savings Plans utilization or coverage budgets default to <code>100</code>, which is
     * the only valid value for RI or Savings Plans utilization or coverage budgets. You can't use
     * <code>BudgetLimit</code> with <code>PlannedBudgetLimits</code> for <code>CreateBudget</code> and
     * <code>UpdateBudget</code> actions.
     * </p>
     * 
     * @param budgetLimit
     *        The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     *        coverage that you want to track with your budget.</p>
     *        <p>
     *        <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI or Savings Plans
     *        utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default to
     *        <code>100</code>, which is the only valid value for RI or Savings Plans utilization or coverage budgets.
     *        You can't use <code>BudgetLimit</code> with <code>PlannedBudgetLimits</code> for <code>CreateBudget</code>
     *        and <code>UpdateBudget</code> actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withBudgetLimit(Spend budgetLimit) {
        setBudgetLimit(budgetLimit);
        return this;
    }

    /**
     * <p>
     * A map containing multiple <code>BudgetLimit</code>, including current or future limits.
     * </p>
     * <p>
     * <code>PlannedBudgetLimits</code> is available for cost or usage budget and supports monthly and quarterly
     * <code>TimeUnit</code>.
     * </p>
     * <p>
     * For monthly budgets, provide 12 months of <code>PlannedBudgetLimits</code> values. This must start from the
     * current month and include the next 11 months. The <code>key</code> is the start of the month, <code>UTC</code> in
     * epoch seconds.
     * </p>
     * <p>
     * For quarterly budgets, provide 4 quarters of <code>PlannedBudgetLimits</code> value entries in standard calendar
     * quarter increments. This must start from the current quarter and include the next 3 quarters. The
     * <code>key</code> is the start of the quarter, <code>UTC</code> in epoch seconds.
     * </p>
     * <p>
     * If the planned budget expires before 12 months for monthly or 4 quarters for quarterly, provide the
     * <code>PlannedBudgetLimits</code> values only for the remaining periods.
     * </p>
     * <p>
     * If the budget begins at a date in the future, provide <code>PlannedBudgetLimits</code> values from the start date
     * of the budget.
     * </p>
     * <p>
     * After all of the <code>BudgetLimit</code> values in <code>PlannedBudgetLimits</code> are used, the budget
     * continues to use the last limit as the <code>BudgetLimit</code>. At that point, the planned budget provides the
     * same experience as a fixed budget.
     * </p>
     * <p>
     * <code>DescribeBudget</code> and <code>DescribeBudgets</code> response along with <code>PlannedBudgetLimits</code>
     * will also contain <code>BudgetLimit</code> representing the current month or quarter limit present in
     * <code>PlannedBudgetLimits</code>. This only applies to budgets created with <code>PlannedBudgetLimits</code>.
     * Budgets created without <code>PlannedBudgetLimits</code> will only contain <code>BudgetLimit</code>, and no
     * <code>PlannedBudgetLimits</code>.
     * </p>
     * 
     * @return A map containing multiple <code>BudgetLimit</code>, including current or future limits.</p>
     *         <p>
     *         <code>PlannedBudgetLimits</code> is available for cost or usage budget and supports monthly and quarterly
     *         <code>TimeUnit</code>.
     *         </p>
     *         <p>
     *         For monthly budgets, provide 12 months of <code>PlannedBudgetLimits</code> values. This must start from
     *         the current month and include the next 11 months. The <code>key</code> is the start of the month,
     *         <code>UTC</code> in epoch seconds.
     *         </p>
     *         <p>
     *         For quarterly budgets, provide 4 quarters of <code>PlannedBudgetLimits</code> value entries in standard
     *         calendar quarter increments. This must start from the current quarter and include the next 3 quarters.
     *         The <code>key</code> is the start of the quarter, <code>UTC</code> in epoch seconds.
     *         </p>
     *         <p>
     *         If the planned budget expires before 12 months for monthly or 4 quarters for quarterly, provide the
     *         <code>PlannedBudgetLimits</code> values only for the remaining periods.
     *         </p>
     *         <p>
     *         If the budget begins at a date in the future, provide <code>PlannedBudgetLimits</code> values from the
     *         start date of the budget.
     *         </p>
     *         <p>
     *         After all of the <code>BudgetLimit</code> values in <code>PlannedBudgetLimits</code> are used, the budget
     *         continues to use the last limit as the <code>BudgetLimit</code>. At that point, the planned budget
     *         provides the same experience as a fixed budget.
     *         </p>
     *         <p>
     *         <code>DescribeBudget</code> and <code>DescribeBudgets</code> response along with
     *         <code>PlannedBudgetLimits</code> will also contain <code>BudgetLimit</code> representing the current
     *         month or quarter limit present in <code>PlannedBudgetLimits</code>. This only applies to budgets created
     *         with <code>PlannedBudgetLimits</code>. Budgets created without <code>PlannedBudgetLimits</code> will only
     *         contain <code>BudgetLimit</code>, and no <code>PlannedBudgetLimits</code>.
     */

    public java.util.Map<String, Spend> getPlannedBudgetLimits() {
        return plannedBudgetLimits;
    }

    /**
     * <p>
     * A map containing multiple <code>BudgetLimit</code>, including current or future limits.
     * </p>
     * <p>
     * <code>PlannedBudgetLimits</code> is available for cost or usage budget and supports monthly and quarterly
     * <code>TimeUnit</code>.
     * </p>
     * <p>
     * For monthly budgets, provide 12 months of <code>PlannedBudgetLimits</code> values. This must start from the
     * current month and include the next 11 months. The <code>key</code> is the start of the month, <code>UTC</code> in
     * epoch seconds.
     * </p>
     * <p>
     * For quarterly budgets, provide 4 quarters of <code>PlannedBudgetLimits</code> value entries in standard calendar
     * quarter increments. This must start from the current quarter and include the next 3 quarters. The
     * <code>key</code> is the start of the quarter, <code>UTC</code> in epoch seconds.
     * </p>
     * <p>
     * If the planned budget expires before 12 months for monthly or 4 quarters for quarterly, provide the
     * <code>PlannedBudgetLimits</code> values only for the remaining periods.
     * </p>
     * <p>
     * If the budget begins at a date in the future, provide <code>PlannedBudgetLimits</code> values from the start date
     * of the budget.
     * </p>
     * <p>
     * After all of the <code>BudgetLimit</code> values in <code>PlannedBudgetLimits</code> are used, the budget
     * continues to use the last limit as the <code>BudgetLimit</code>. At that point, the planned budget provides the
     * same experience as a fixed budget.
     * </p>
     * <p>
     * <code>DescribeBudget</code> and <code>DescribeBudgets</code> response along with <code>PlannedBudgetLimits</code>
     * will also contain <code>BudgetLimit</code> representing the current month or quarter limit present in
     * <code>PlannedBudgetLimits</code>. This only applies to budgets created with <code>PlannedBudgetLimits</code>.
     * Budgets created without <code>PlannedBudgetLimits</code> will only contain <code>BudgetLimit</code>, and no
     * <code>PlannedBudgetLimits</code>.
     * </p>
     * 
     * @param plannedBudgetLimits
     *        A map containing multiple <code>BudgetLimit</code>, including current or future limits.</p>
     *        <p>
     *        <code>PlannedBudgetLimits</code> is available for cost or usage budget and supports monthly and quarterly
     *        <code>TimeUnit</code>.
     *        </p>
     *        <p>
     *        For monthly budgets, provide 12 months of <code>PlannedBudgetLimits</code> values. This must start from
     *        the current month and include the next 11 months. The <code>key</code> is the start of the month,
     *        <code>UTC</code> in epoch seconds.
     *        </p>
     *        <p>
     *        For quarterly budgets, provide 4 quarters of <code>PlannedBudgetLimits</code> value entries in standard
     *        calendar quarter increments. This must start from the current quarter and include the next 3 quarters. The
     *        <code>key</code> is the start of the quarter, <code>UTC</code> in epoch seconds.
     *        </p>
     *        <p>
     *        If the planned budget expires before 12 months for monthly or 4 quarters for quarterly, provide the
     *        <code>PlannedBudgetLimits</code> values only for the remaining periods.
     *        </p>
     *        <p>
     *        If the budget begins at a date in the future, provide <code>PlannedBudgetLimits</code> values from the
     *        start date of the budget.
     *        </p>
     *        <p>
     *        After all of the <code>BudgetLimit</code> values in <code>PlannedBudgetLimits</code> are used, the budget
     *        continues to use the last limit as the <code>BudgetLimit</code>. At that point, the planned budget
     *        provides the same experience as a fixed budget.
     *        </p>
     *        <p>
     *        <code>DescribeBudget</code> and <code>DescribeBudgets</code> response along with
     *        <code>PlannedBudgetLimits</code> will also contain <code>BudgetLimit</code> representing the current month
     *        or quarter limit present in <code>PlannedBudgetLimits</code>. This only applies to budgets created with
     *        <code>PlannedBudgetLimits</code>. Budgets created without <code>PlannedBudgetLimits</code> will only
     *        contain <code>BudgetLimit</code>, and no <code>PlannedBudgetLimits</code>.
     */

    public void setPlannedBudgetLimits(java.util.Map<String, Spend> plannedBudgetLimits) {
        this.plannedBudgetLimits = plannedBudgetLimits;
    }

    /**
     * <p>
     * A map containing multiple <code>BudgetLimit</code>, including current or future limits.
     * </p>
     * <p>
     * <code>PlannedBudgetLimits</code> is available for cost or usage budget and supports monthly and quarterly
     * <code>TimeUnit</code>.
     * </p>
     * <p>
     * For monthly budgets, provide 12 months of <code>PlannedBudgetLimits</code> values. This must start from the
     * current month and include the next 11 months. The <code>key</code> is the start of the month, <code>UTC</code> in
     * epoch seconds.
     * </p>
     * <p>
     * For quarterly budgets, provide 4 quarters of <code>PlannedBudgetLimits</code> value entries in standard calendar
     * quarter increments. This must start from the current quarter and include the next 3 quarters. The
     * <code>key</code> is the start of the quarter, <code>UTC</code> in epoch seconds.
     * </p>
     * <p>
     * If the planned budget expires before 12 months for monthly or 4 quarters for quarterly, provide the
     * <code>PlannedBudgetLimits</code> values only for the remaining periods.
     * </p>
     * <p>
     * If the budget begins at a date in the future, provide <code>PlannedBudgetLimits</code> values from the start date
     * of the budget.
     * </p>
     * <p>
     * After all of the <code>BudgetLimit</code> values in <code>PlannedBudgetLimits</code> are used, the budget
     * continues to use the last limit as the <code>BudgetLimit</code>. At that point, the planned budget provides the
     * same experience as a fixed budget.
     * </p>
     * <p>
     * <code>DescribeBudget</code> and <code>DescribeBudgets</code> response along with <code>PlannedBudgetLimits</code>
     * will also contain <code>BudgetLimit</code> representing the current month or quarter limit present in
     * <code>PlannedBudgetLimits</code>. This only applies to budgets created with <code>PlannedBudgetLimits</code>.
     * Budgets created without <code>PlannedBudgetLimits</code> will only contain <code>BudgetLimit</code>, and no
     * <code>PlannedBudgetLimits</code>.
     * </p>
     * 
     * @param plannedBudgetLimits
     *        A map containing multiple <code>BudgetLimit</code>, including current or future limits.</p>
     *        <p>
     *        <code>PlannedBudgetLimits</code> is available for cost or usage budget and supports monthly and quarterly
     *        <code>TimeUnit</code>.
     *        </p>
     *        <p>
     *        For monthly budgets, provide 12 months of <code>PlannedBudgetLimits</code> values. This must start from
     *        the current month and include the next 11 months. The <code>key</code> is the start of the month,
     *        <code>UTC</code> in epoch seconds.
     *        </p>
     *        <p>
     *        For quarterly budgets, provide 4 quarters of <code>PlannedBudgetLimits</code> value entries in standard
     *        calendar quarter increments. This must start from the current quarter and include the next 3 quarters. The
     *        <code>key</code> is the start of the quarter, <code>UTC</code> in epoch seconds.
     *        </p>
     *        <p>
     *        If the planned budget expires before 12 months for monthly or 4 quarters for quarterly, provide the
     *        <code>PlannedBudgetLimits</code> values only for the remaining periods.
     *        </p>
     *        <p>
     *        If the budget begins at a date in the future, provide <code>PlannedBudgetLimits</code> values from the
     *        start date of the budget.
     *        </p>
     *        <p>
     *        After all of the <code>BudgetLimit</code> values in <code>PlannedBudgetLimits</code> are used, the budget
     *        continues to use the last limit as the <code>BudgetLimit</code>. At that point, the planned budget
     *        provides the same experience as a fixed budget.
     *        </p>
     *        <p>
     *        <code>DescribeBudget</code> and <code>DescribeBudgets</code> response along with
     *        <code>PlannedBudgetLimits</code> will also contain <code>BudgetLimit</code> representing the current month
     *        or quarter limit present in <code>PlannedBudgetLimits</code>. This only applies to budgets created with
     *        <code>PlannedBudgetLimits</code>. Budgets created without <code>PlannedBudgetLimits</code> will only
     *        contain <code>BudgetLimit</code>, and no <code>PlannedBudgetLimits</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withPlannedBudgetLimits(java.util.Map<String, Spend> plannedBudgetLimits) {
        setPlannedBudgetLimits(plannedBudgetLimits);
        return this;
    }

    /**
     * Add a single PlannedBudgetLimits entry
     *
     * @see Budget#withPlannedBudgetLimits
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Budget addPlannedBudgetLimitsEntry(String key, Spend value) {
        if (null == this.plannedBudgetLimits) {
            this.plannedBudgetLimits = new java.util.HashMap<String, Spend>();
        }
        if (this.plannedBudgetLimits.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.plannedBudgetLimits.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PlannedBudgetLimits.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget clearPlannedBudgetLimitsEntries() {
        this.plannedBudgetLimits = null;
        return this;
    }

    /**
     * <p>
     * The cost filters, such as service or tag, that are applied to a budget.
     * </p>
     * <p>
     * AWS Budgets supports the following services as a filter for RI budgets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Elastic Compute Cloud - Compute
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Redshift
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ElastiCache
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Elasticsearch Service
     * </p>
     * </li>
     * </ul>
     * 
     * @return The cost filters, such as service or tag, that are applied to a budget.</p>
     *         <p>
     *         AWS Budgets supports the following services as a filter for RI budgets:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Elastic Compute Cloud - Compute
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Redshift
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Relational Database Service
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon ElastiCache
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Elasticsearch Service
     *         </p>
     *         </li>
     */

    public java.util.Map<String, java.util.List<String>> getCostFilters() {
        return costFilters;
    }

    /**
     * <p>
     * The cost filters, such as service or tag, that are applied to a budget.
     * </p>
     * <p>
     * AWS Budgets supports the following services as a filter for RI budgets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Elastic Compute Cloud - Compute
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Redshift
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ElastiCache
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Elasticsearch Service
     * </p>
     * </li>
     * </ul>
     * 
     * @param costFilters
     *        The cost filters, such as service or tag, that are applied to a budget.</p>
     *        <p>
     *        AWS Budgets supports the following services as a filter for RI budgets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Elastic Compute Cloud - Compute
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Redshift
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon ElastiCache
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Elasticsearch Service
     *        </p>
     *        </li>
     */

    public void setCostFilters(java.util.Map<String, java.util.List<String>> costFilters) {
        this.costFilters = costFilters;
    }

    /**
     * <p>
     * The cost filters, such as service or tag, that are applied to a budget.
     * </p>
     * <p>
     * AWS Budgets supports the following services as a filter for RI budgets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Elastic Compute Cloud - Compute
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Redshift
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ElastiCache
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Elasticsearch Service
     * </p>
     * </li>
     * </ul>
     * 
     * @param costFilters
     *        The cost filters, such as service or tag, that are applied to a budget.</p>
     *        <p>
     *        AWS Budgets supports the following services as a filter for RI budgets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Elastic Compute Cloud - Compute
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Redshift
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon ElastiCache
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Elasticsearch Service
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withCostFilters(java.util.Map<String, java.util.List<String>> costFilters) {
        setCostFilters(costFilters);
        return this;
    }

    /**
     * Add a single CostFilters entry
     *
     * @see Budget#withCostFilters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Budget addCostFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.costFilters) {
            this.costFilters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.costFilters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.costFilters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CostFilters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget clearCostFiltersEntries() {
        this.costFilters = null;
        return this;
    }

    /**
     * <p>
     * The types of costs that are included in this <code>COST</code> budget.
     * </p>
     * <p>
     * <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>, <code>SAVINGS_PLANS_UTILIZATION</code>
     * , and <code>SAVINGS_PLANS_COVERAGE</code> budgets do not have <code>CostTypes</code>.
     * </p>
     * 
     * @param costTypes
     *        The types of costs that are included in this <code>COST</code> budget.</p>
     *        <p>
     *        <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>,
     *        <code>SAVINGS_PLANS_UTILIZATION</code>, and <code>SAVINGS_PLANS_COVERAGE</code> budgets do not have
     *        <code>CostTypes</code>.
     */

    public void setCostTypes(CostTypes costTypes) {
        this.costTypes = costTypes;
    }

    /**
     * <p>
     * The types of costs that are included in this <code>COST</code> budget.
     * </p>
     * <p>
     * <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>, <code>SAVINGS_PLANS_UTILIZATION</code>
     * , and <code>SAVINGS_PLANS_COVERAGE</code> budgets do not have <code>CostTypes</code>.
     * </p>
     * 
     * @return The types of costs that are included in this <code>COST</code> budget.</p>
     *         <p>
     *         <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>,
     *         <code>SAVINGS_PLANS_UTILIZATION</code>, and <code>SAVINGS_PLANS_COVERAGE</code> budgets do not have
     *         <code>CostTypes</code>.
     */

    public CostTypes getCostTypes() {
        return this.costTypes;
    }

    /**
     * <p>
     * The types of costs that are included in this <code>COST</code> budget.
     * </p>
     * <p>
     * <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>, <code>SAVINGS_PLANS_UTILIZATION</code>
     * , and <code>SAVINGS_PLANS_COVERAGE</code> budgets do not have <code>CostTypes</code>.
     * </p>
     * 
     * @param costTypes
     *        The types of costs that are included in this <code>COST</code> budget.</p>
     *        <p>
     *        <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>,
     *        <code>SAVINGS_PLANS_UTILIZATION</code>, and <code>SAVINGS_PLANS_COVERAGE</code> budgets do not have
     *        <code>CostTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withCostTypes(CostTypes costTypes) {
        setCostTypes(costTypes);
        return this;
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @param timeUnit
     *        The length of time until a budget resets the actual and forecasted spend.
     * @see TimeUnit
     */

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @return The length of time until a budget resets the actual and forecasted spend.
     * @see TimeUnit
     */

    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @param timeUnit
     *        The length of time until a budget resets the actual and forecasted spend.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Budget withTimeUnit(String timeUnit) {
        setTimeUnit(timeUnit);
        return this;
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @param timeUnit
     *        The length of time until a budget resets the actual and forecasted spend.
     * @see TimeUnit
     */

    public void setTimeUnit(TimeUnit timeUnit) {
        withTimeUnit(timeUnit);
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @param timeUnit
     *        The length of time until a budget resets the actual and forecasted spend.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Budget withTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit.toString();
        return this;
    }

    /**
     * <p>
     * The period of time that is covered by a budget. The period has a start date and an end date. The start date must
     * come before the end date. The end date must come before <code>06/15/87 00:00 UTC</code>.
     * </p>
     * <p>
     * If you create your budget and don't specify a start date, AWS defaults to the start of your chosen time period
     * (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24, 2018, chose
     * <code>DAILY</code>, and didn't set a start date, AWS set your start date to <code>01/24/18 00:00 UTC</code>. If
     * you chose <code>MONTHLY</code>, AWS set your start date to <code>01/01/18 00:00 UTC</code>. If you didn't specify
     * an end date, AWS set your end date to <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS
     * Billing and Cost Management console and the API.
     * </p>
     * <p>
     * You can change either date with the <code>UpdateBudget</code> operation.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * </p>
     * 
     * @param timePeriod
     *        The period of time that is covered by a budget. The period has a start date and an end date. The start
     *        date must come before the end date. The end date must come before <code>06/15/87 00:00 UTC</code>. </p>
     *        <p>
     *        If you create your budget and don't specify a start date, AWS defaults to the start of your chosen time
     *        period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24,
     *        2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     *        <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     *        <code>01/01/18 00:00 UTC</code>. If you didn't specify an end date, AWS set your end date to
     *        <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console
     *        and the API.
     *        </p>
     *        <p>
     *        You can change either date with the <code>UpdateBudget</code> operation.
     *        </p>
     *        <p>
     *        After the end date, AWS deletes the budget and all associated notifications and subscribers.
     */

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time that is covered by a budget. The period has a start date and an end date. The start date must
     * come before the end date. The end date must come before <code>06/15/87 00:00 UTC</code>.
     * </p>
     * <p>
     * If you create your budget and don't specify a start date, AWS defaults to the start of your chosen time period
     * (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24, 2018, chose
     * <code>DAILY</code>, and didn't set a start date, AWS set your start date to <code>01/24/18 00:00 UTC</code>. If
     * you chose <code>MONTHLY</code>, AWS set your start date to <code>01/01/18 00:00 UTC</code>. If you didn't specify
     * an end date, AWS set your end date to <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS
     * Billing and Cost Management console and the API.
     * </p>
     * <p>
     * You can change either date with the <code>UpdateBudget</code> operation.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * </p>
     * 
     * @return The period of time that is covered by a budget. The period has a start date and an end date. The start
     *         date must come before the end date. The end date must come before <code>06/15/87 00:00 UTC</code>. </p>
     *         <p>
     *         If you create your budget and don't specify a start date, AWS defaults to the start of your chosen time
     *         period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24,
     *         2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     *         <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     *         <code>01/01/18 00:00 UTC</code>. If you didn't specify an end date, AWS set your end date to
     *         <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management
     *         console and the API.
     *         </p>
     *         <p>
     *         You can change either date with the <code>UpdateBudget</code> operation.
     *         </p>
     *         <p>
     *         After the end date, AWS deletes the budget and all associated notifications and subscribers.
     */

    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The period of time that is covered by a budget. The period has a start date and an end date. The start date must
     * come before the end date. The end date must come before <code>06/15/87 00:00 UTC</code>.
     * </p>
     * <p>
     * If you create your budget and don't specify a start date, AWS defaults to the start of your chosen time period
     * (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24, 2018, chose
     * <code>DAILY</code>, and didn't set a start date, AWS set your start date to <code>01/24/18 00:00 UTC</code>. If
     * you chose <code>MONTHLY</code>, AWS set your start date to <code>01/01/18 00:00 UTC</code>. If you didn't specify
     * an end date, AWS set your end date to <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS
     * Billing and Cost Management console and the API.
     * </p>
     * <p>
     * You can change either date with the <code>UpdateBudget</code> operation.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * </p>
     * 
     * @param timePeriod
     *        The period of time that is covered by a budget. The period has a start date and an end date. The start
     *        date must come before the end date. The end date must come before <code>06/15/87 00:00 UTC</code>. </p>
     *        <p>
     *        If you create your budget and don't specify a start date, AWS defaults to the start of your chosen time
     *        period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24,
     *        2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     *        <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     *        <code>01/01/18 00:00 UTC</code>. If you didn't specify an end date, AWS set your end date to
     *        <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console
     *        and the API.
     *        </p>
     *        <p>
     *        You can change either date with the <code>UpdateBudget</code> operation.
     *        </p>
     *        <p>
     *        After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withTimePeriod(TimePeriod timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The actual and forecasted cost or usage that the budget tracks.
     * </p>
     * 
     * @param calculatedSpend
     *        The actual and forecasted cost or usage that the budget tracks.
     */

    public void setCalculatedSpend(CalculatedSpend calculatedSpend) {
        this.calculatedSpend = calculatedSpend;
    }

    /**
     * <p>
     * The actual and forecasted cost or usage that the budget tracks.
     * </p>
     * 
     * @return The actual and forecasted cost or usage that the budget tracks.
     */

    public CalculatedSpend getCalculatedSpend() {
        return this.calculatedSpend;
    }

    /**
     * <p>
     * The actual and forecasted cost or usage that the budget tracks.
     * </p>
     * 
     * @param calculatedSpend
     *        The actual and forecasted cost or usage that the budget tracks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withCalculatedSpend(CalculatedSpend calculatedSpend) {
        setCalculatedSpend(calculatedSpend);
        return this;
    }

    /**
     * <p>
     * Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage.
     * </p>
     * 
     * @param budgetType
     *        Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or
     *        Savings Plans coverage.
     * @see BudgetType
     */

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    /**
     * <p>
     * Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage.
     * </p>
     * 
     * @return Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or
     *         Savings Plans coverage.
     * @see BudgetType
     */

    public String getBudgetType() {
        return this.budgetType;
    }

    /**
     * <p>
     * Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage.
     * </p>
     * 
     * @param budgetType
     *        Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or
     *        Savings Plans coverage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetType
     */

    public Budget withBudgetType(String budgetType) {
        setBudgetType(budgetType);
        return this;
    }

    /**
     * <p>
     * Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage.
     * </p>
     * 
     * @param budgetType
     *        Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or
     *        Savings Plans coverage.
     * @see BudgetType
     */

    public void setBudgetType(BudgetType budgetType) {
        withBudgetType(budgetType);
    }

    /**
     * <p>
     * Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or Savings Plans
     * coverage.
     * </p>
     * 
     * @param budgetType
     *        Whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans utilization, or
     *        Savings Plans coverage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetType
     */

    public Budget withBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType.toString();
        return this;
    }

    /**
     * <p>
     * The last time that you updated this budget.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that you updated this budget.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that you updated this budget.
     * </p>
     * 
     * @return The last time that you updated this budget.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that you updated this budget.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that you updated this budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBudgetName() != null)
            sb.append("BudgetName: ").append(getBudgetName()).append(",");
        if (getBudgetLimit() != null)
            sb.append("BudgetLimit: ").append(getBudgetLimit()).append(",");
        if (getPlannedBudgetLimits() != null)
            sb.append("PlannedBudgetLimits: ").append(getPlannedBudgetLimits()).append(",");
        if (getCostFilters() != null)
            sb.append("CostFilters: ").append(getCostFilters()).append(",");
        if (getCostTypes() != null)
            sb.append("CostTypes: ").append(getCostTypes()).append(",");
        if (getTimeUnit() != null)
            sb.append("TimeUnit: ").append(getTimeUnit()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getCalculatedSpend() != null)
            sb.append("CalculatedSpend: ").append(getCalculatedSpend()).append(",");
        if (getBudgetType() != null)
            sb.append("BudgetType: ").append(getBudgetType()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Budget == false)
            return false;
        Budget other = (Budget) obj;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getBudgetLimit() == null ^ this.getBudgetLimit() == null)
            return false;
        if (other.getBudgetLimit() != null && other.getBudgetLimit().equals(this.getBudgetLimit()) == false)
            return false;
        if (other.getPlannedBudgetLimits() == null ^ this.getPlannedBudgetLimits() == null)
            return false;
        if (other.getPlannedBudgetLimits() != null && other.getPlannedBudgetLimits().equals(this.getPlannedBudgetLimits()) == false)
            return false;
        if (other.getCostFilters() == null ^ this.getCostFilters() == null)
            return false;
        if (other.getCostFilters() != null && other.getCostFilters().equals(this.getCostFilters()) == false)
            return false;
        if (other.getCostTypes() == null ^ this.getCostTypes() == null)
            return false;
        if (other.getCostTypes() != null && other.getCostTypes().equals(this.getCostTypes()) == false)
            return false;
        if (other.getTimeUnit() == null ^ this.getTimeUnit() == null)
            return false;
        if (other.getTimeUnit() != null && other.getTimeUnit().equals(this.getTimeUnit()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getCalculatedSpend() == null ^ this.getCalculatedSpend() == null)
            return false;
        if (other.getCalculatedSpend() != null && other.getCalculatedSpend().equals(this.getCalculatedSpend()) == false)
            return false;
        if (other.getBudgetType() == null ^ this.getBudgetType() == null)
            return false;
        if (other.getBudgetType() != null && other.getBudgetType().equals(this.getBudgetType()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getBudgetLimit() == null) ? 0 : getBudgetLimit().hashCode());
        hashCode = prime * hashCode + ((getPlannedBudgetLimits() == null) ? 0 : getPlannedBudgetLimits().hashCode());
        hashCode = prime * hashCode + ((getCostFilters() == null) ? 0 : getCostFilters().hashCode());
        hashCode = prime * hashCode + ((getCostTypes() == null) ? 0 : getCostTypes().hashCode());
        hashCode = prime * hashCode + ((getTimeUnit() == null) ? 0 : getTimeUnit().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getCalculatedSpend() == null) ? 0 : getCalculatedSpend().hashCode());
        hashCode = prime * hashCode + ((getBudgetType() == null) ? 0 : getBudgetType().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Budget clone() {
        try {
            return (Budget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.BudgetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

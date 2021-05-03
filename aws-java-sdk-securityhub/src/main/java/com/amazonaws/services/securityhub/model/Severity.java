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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The severity of the finding.
 * </p>
 * <p>
 * The finding provider can provide the initial severity. The finding provider can only update the severity if it has
 * not been updated using <code>BatchUpdateFindings</code>.
 * </p>
 * <p>
 * The finding must have either <code>Label</code> or <code>Normalized</code> populated. If only one of these attributes
 * is populated, then Security Hub automatically populates the other one. If neither attribute is populated, then the
 * finding is invalid. <code>Label</code> is the preferred attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Severity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Severity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Deprecated. This attribute is being deprecated. Instead of providing <code>Product</code>, provide
     * <code>Original</code>.
     * </p>
     * <p>
     * The native severity as defined by the AWS service or integrated partner product that generated the finding.
     * </p>
     */
    private Double product;
    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     */
    private String label;
    /**
     * <p>
     * Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of providing
     * <code>Normalized</code>, provide <code>Label</code>.
     * </p>
     * <p>
     * If you provide <code>Label</code> and do not provide <code>Normalized</code>, then <code>Normalized</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - 0
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - 1
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - 40
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - 70
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - 90
     * </p>
     * </li>
     * </ul>
     */
    private Integer normalized;
    /**
     * <p>
     * The native severity from the finding product that generated the finding.
     * </p>
     */
    private String original;

    /**
     * <p>
     * Deprecated. This attribute is being deprecated. Instead of providing <code>Product</code>, provide
     * <code>Original</code>.
     * </p>
     * <p>
     * The native severity as defined by the AWS service or integrated partner product that generated the finding.
     * </p>
     * 
     * @param product
     *        Deprecated. This attribute is being deprecated. Instead of providing <code>Product</code>, provide
     *        <code>Original</code>.</p>
     *        <p>
     *        The native severity as defined by the AWS service or integrated partner product that generated the
     *        finding.
     */

    public void setProduct(Double product) {
        this.product = product;
    }

    /**
     * <p>
     * Deprecated. This attribute is being deprecated. Instead of providing <code>Product</code>, provide
     * <code>Original</code>.
     * </p>
     * <p>
     * The native severity as defined by the AWS service or integrated partner product that generated the finding.
     * </p>
     * 
     * @return Deprecated. This attribute is being deprecated. Instead of providing <code>Product</code>, provide
     *         <code>Original</code>.</p>
     *         <p>
     *         The native severity as defined by the AWS service or integrated partner product that generated the
     *         finding.
     */

    public Double getProduct() {
        return this.product;
    }

    /**
     * <p>
     * Deprecated. This attribute is being deprecated. Instead of providing <code>Product</code>, provide
     * <code>Original</code>.
     * </p>
     * <p>
     * The native severity as defined by the AWS service or integrated partner product that generated the finding.
     * </p>
     * 
     * @param product
     *        Deprecated. This attribute is being deprecated. Instead of providing <code>Product</code>, provide
     *        <code>Original</code>.</p>
     *        <p>
     *        The native severity as defined by the AWS service or integrated partner product that generated the
     *        finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Severity withProduct(Double product) {
        setProduct(product);
        return this;
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param label
     *        The severity value of the finding. The allowed values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFORMATIONAL</code> - No issue was found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOW</code> - The issue does not require action on its own.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code> - The issue must be addressed but not urgently.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIGH</code> - The issue must be addressed as a priority.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is
     *        set automatically as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        0 - <code>INFORMATIONAL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1–39 - <code>LOW</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        40–69 - <code>MEDIUM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        70–89 - <code>HIGH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        90–100 - <code>CRITICAL</code>
     *        </p>
     *        </li>
     * @see SeverityLabel
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The severity value of the finding. The allowed values are the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INFORMATIONAL</code> - No issue was found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOW</code> - The issue does not require action on its own.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MEDIUM</code> - The issue must be addressed but not urgently.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HIGH</code> - The issue must be addressed as a priority.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is
     *         set automatically as follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         0 - <code>INFORMATIONAL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1–39 - <code>LOW</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         40–69 - <code>MEDIUM</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         70–89 - <code>HIGH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         90–100 - <code>CRITICAL</code>
     *         </p>
     *         </li>
     * @see SeverityLabel
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param label
     *        The severity value of the finding. The allowed values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFORMATIONAL</code> - No issue was found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOW</code> - The issue does not require action on its own.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code> - The issue must be addressed but not urgently.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIGH</code> - The issue must be addressed as a priority.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is
     *        set automatically as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        0 - <code>INFORMATIONAL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1–39 - <code>LOW</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        40–69 - <code>MEDIUM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        70–89 - <code>HIGH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        90–100 - <code>CRITICAL</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityLabel
     */

    public Severity withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param label
     *        The severity value of the finding. The allowed values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFORMATIONAL</code> - No issue was found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOW</code> - The issue does not require action on its own.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code> - The issue must be addressed but not urgently.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIGH</code> - The issue must be addressed as a priority.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CRITICAL</code> - The issue must be remediated immediately to avoid it escalating.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you provide <code>Normalized</code> and do not provide <code>Label</code>, then <code>Label</code> is
     *        set automatically as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        0 - <code>INFORMATIONAL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1–39 - <code>LOW</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        40–69 - <code>MEDIUM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        70–89 - <code>HIGH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        90–100 - <code>CRITICAL</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityLabel
     */

    public Severity withLabel(SeverityLabel label) {
        this.label = label.toString();
        return this;
    }

    /**
     * <p>
     * Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of providing
     * <code>Normalized</code>, provide <code>Label</code>.
     * </p>
     * <p>
     * If you provide <code>Label</code> and do not provide <code>Normalized</code>, then <code>Normalized</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - 0
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - 1
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - 40
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - 70
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - 90
     * </p>
     * </li>
     * </ul>
     * 
     * @param normalized
     *        Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of providing
     *        <code>Normalized</code>, provide <code>Label</code>.</p>
     *        <p>
     *        If you provide <code>Label</code> and do not provide <code>Normalized</code>, then <code>Normalized</code>
     *        is set automatically as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFORMATIONAL</code> - 0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOW</code> - 1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code> - 40
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIGH</code> - 70
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CRITICAL</code> - 90
     *        </p>
     *        </li>
     */

    public void setNormalized(Integer normalized) {
        this.normalized = normalized;
    }

    /**
     * <p>
     * Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of providing
     * <code>Normalized</code>, provide <code>Label</code>.
     * </p>
     * <p>
     * If you provide <code>Label</code> and do not provide <code>Normalized</code>, then <code>Normalized</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - 0
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - 1
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - 40
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - 70
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - 90
     * </p>
     * </li>
     * </ul>
     * 
     * @return Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of
     *         providing <code>Normalized</code>, provide <code>Label</code>.</p>
     *         <p>
     *         If you provide <code>Label</code> and do not provide <code>Normalized</code>, then
     *         <code>Normalized</code> is set automatically as follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INFORMATIONAL</code> - 0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOW</code> - 1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MEDIUM</code> - 40
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HIGH</code> - 70
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CRITICAL</code> - 90
     *         </p>
     *         </li>
     */

    public Integer getNormalized() {
        return this.normalized;
    }

    /**
     * <p>
     * Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of providing
     * <code>Normalized</code>, provide <code>Label</code>.
     * </p>
     * <p>
     * If you provide <code>Label</code> and do not provide <code>Normalized</code>, then <code>Normalized</code> is set
     * automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - 0
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - 1
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - 40
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - 70
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - 90
     * </p>
     * </li>
     * </ul>
     * 
     * @param normalized
     *        Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of providing
     *        <code>Normalized</code>, provide <code>Label</code>.</p>
     *        <p>
     *        If you provide <code>Label</code> and do not provide <code>Normalized</code>, then <code>Normalized</code>
     *        is set automatically as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFORMATIONAL</code> - 0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOW</code> - 1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code> - 40
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIGH</code> - 70
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CRITICAL</code> - 90
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Severity withNormalized(Integer normalized) {
        setNormalized(normalized);
        return this;
    }

    /**
     * <p>
     * The native severity from the finding product that generated the finding.
     * </p>
     * 
     * @param original
     *        The native severity from the finding product that generated the finding.
     */

    public void setOriginal(String original) {
        this.original = original;
    }

    /**
     * <p>
     * The native severity from the finding product that generated the finding.
     * </p>
     * 
     * @return The native severity from the finding product that generated the finding.
     */

    public String getOriginal() {
        return this.original;
    }

    /**
     * <p>
     * The native severity from the finding product that generated the finding.
     * </p>
     * 
     * @param original
     *        The native severity from the finding product that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Severity withOriginal(String original) {
        setOriginal(original);
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
        if (getProduct() != null)
            sb.append("Product: ").append(getProduct()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getNormalized() != null)
            sb.append("Normalized: ").append(getNormalized()).append(",");
        if (getOriginal() != null)
            sb.append("Original: ").append(getOriginal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Severity == false)
            return false;
        Severity other = (Severity) obj;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getNormalized() == null ^ this.getNormalized() == null)
            return false;
        if (other.getNormalized() != null && other.getNormalized().equals(this.getNormalized()) == false)
            return false;
        if (other.getOriginal() == null ^ this.getOriginal() == null)
            return false;
        if (other.getOriginal() != null && other.getOriginal().equals(this.getOriginal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getNormalized() == null) ? 0 : getNormalized().hashCode());
        hashCode = prime * hashCode + ((getOriginal() == null) ? 0 : getOriginal().hashCode());
        return hashCode;
    }

    @Override
    public Severity clone() {
        try {
            return (Severity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SeverityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a proactive anomaly. This object is returned by <code>DescribeAnomaly.</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ProactiveAnomalySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProactiveAnomalySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the anomaly.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The severity of the anomaly.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The status of the anomaly.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time of the anomaly's most recent update.
     * </p>
     */
    private java.util.Date updateTime;

    private AnomalyTimeRange anomalyTimeRange;

    private PredictionTimeRange predictionTimeRange;
    /**
     * <p>
     * Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is
     * Amazon CloudWatch metrics.
     * </p>
     */
    private AnomalySourceDetails sourceDetails;
    /**
     * <p>
     * The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * </p>
     */
    private String associatedInsightId;

    private ResourceCollection resourceCollection;
    /**
     * <p>
     * A threshold that was exceeded by behavior in analyzed resources. Exceeding this threshold is related to the
     * anomalous behavior that generated this anomaly.
     * </p>
     */
    private Double limit;

    /**
     * <p>
     * The ID of the anomaly.
     * </p>
     * 
     * @param id
     *        The ID of the anomaly.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the anomaly.
     * </p>
     * 
     * @return The ID of the anomaly.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the anomaly.
     * </p>
     * 
     * @param id
     *        The ID of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The severity of the anomaly.
     * </p>
     * 
     * @param severity
     *        The severity of the anomaly.
     * @see AnomalySeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the anomaly.
     * </p>
     * 
     * @return The severity of the anomaly.
     * @see AnomalySeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the anomaly.
     * </p>
     * 
     * @param severity
     *        The severity of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySeverity
     */

    public ProactiveAnomalySummary withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the anomaly.
     * </p>
     * 
     * @param severity
     *        The severity of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySeverity
     */

    public ProactiveAnomalySummary withSeverity(AnomalySeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The status of the anomaly.
     * </p>
     * 
     * @param status
     *        The status of the anomaly.
     * @see AnomalyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the anomaly.
     * </p>
     * 
     * @return The status of the anomaly.
     * @see AnomalyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the anomaly.
     * </p>
     * 
     * @param status
     *        The status of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyStatus
     */

    public ProactiveAnomalySummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the anomaly.
     * </p>
     * 
     * @param status
     *        The status of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyStatus
     */

    public ProactiveAnomalySummary withStatus(AnomalyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time of the anomaly's most recent update.
     * </p>
     * 
     * @param updateTime
     *        The time of the anomaly's most recent update.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time of the anomaly's most recent update.
     * </p>
     * 
     * @return The time of the anomaly's most recent update.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time of the anomaly's most recent update.
     * </p>
     * 
     * @param updateTime
     *        The time of the anomaly's most recent update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * @param anomalyTimeRange
     */

    public void setAnomalyTimeRange(AnomalyTimeRange anomalyTimeRange) {
        this.anomalyTimeRange = anomalyTimeRange;
    }

    /**
     * @return
     */

    public AnomalyTimeRange getAnomalyTimeRange() {
        return this.anomalyTimeRange;
    }

    /**
     * @param anomalyTimeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withAnomalyTimeRange(AnomalyTimeRange anomalyTimeRange) {
        setAnomalyTimeRange(anomalyTimeRange);
        return this;
    }

    /**
     * @param predictionTimeRange
     */

    public void setPredictionTimeRange(PredictionTimeRange predictionTimeRange) {
        this.predictionTimeRange = predictionTimeRange;
    }

    /**
     * @return
     */

    public PredictionTimeRange getPredictionTimeRange() {
        return this.predictionTimeRange;
    }

    /**
     * @param predictionTimeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withPredictionTimeRange(PredictionTimeRange predictionTimeRange) {
        setPredictionTimeRange(predictionTimeRange);
        return this;
    }

    /**
     * <p>
     * Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is
     * Amazon CloudWatch metrics.
     * </p>
     * 
     * @param sourceDetails
     *        Details about the source of the analyzed operational data that triggered the anomaly. The one supported
     *        source is Amazon CloudWatch metrics.
     */

    public void setSourceDetails(AnomalySourceDetails sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    /**
     * <p>
     * Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is
     * Amazon CloudWatch metrics.
     * </p>
     * 
     * @return Details about the source of the analyzed operational data that triggered the anomaly. The one supported
     *         source is Amazon CloudWatch metrics.
     */

    public AnomalySourceDetails getSourceDetails() {
        return this.sourceDetails;
    }

    /**
     * <p>
     * Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is
     * Amazon CloudWatch metrics.
     * </p>
     * 
     * @param sourceDetails
     *        Details about the source of the analyzed operational data that triggered the anomaly. The one supported
     *        source is Amazon CloudWatch metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withSourceDetails(AnomalySourceDetails sourceDetails) {
        setSourceDetails(sourceDetails);
        return this;
    }

    /**
     * <p>
     * The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * </p>
     * 
     * @param associatedInsightId
     *        The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     */

    public void setAssociatedInsightId(String associatedInsightId) {
        this.associatedInsightId = associatedInsightId;
    }

    /**
     * <p>
     * The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * </p>
     * 
     * @return The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     */

    public String getAssociatedInsightId() {
        return this.associatedInsightId;
    }

    /**
     * <p>
     * The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * </p>
     * 
     * @param associatedInsightId
     *        The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withAssociatedInsightId(String associatedInsightId) {
        setAssociatedInsightId(associatedInsightId);
        return this;
    }

    /**
     * @param resourceCollection
     */

    public void setResourceCollection(ResourceCollection resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * @return
     */

    public ResourceCollection getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * @param resourceCollection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * <p>
     * A threshold that was exceeded by behavior in analyzed resources. Exceeding this threshold is related to the
     * anomalous behavior that generated this anomaly.
     * </p>
     * 
     * @param limit
     *        A threshold that was exceeded by behavior in analyzed resources. Exceeding this threshold is related to
     *        the anomalous behavior that generated this anomaly.
     */

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * A threshold that was exceeded by behavior in analyzed resources. Exceeding this threshold is related to the
     * anomalous behavior that generated this anomaly.
     * </p>
     * 
     * @return A threshold that was exceeded by behavior in analyzed resources. Exceeding this threshold is related to
     *         the anomalous behavior that generated this anomaly.
     */

    public Double getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * A threshold that was exceeded by behavior in analyzed resources. Exceeding this threshold is related to the
     * anomalous behavior that generated this anomaly.
     * </p>
     * 
     * @param limit
     *        A threshold that was exceeded by behavior in analyzed resources. Exceeding this threshold is related to
     *        the anomalous behavior that generated this anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withLimit(Double limit) {
        setLimit(limit);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getAnomalyTimeRange() != null)
            sb.append("AnomalyTimeRange: ").append(getAnomalyTimeRange()).append(",");
        if (getPredictionTimeRange() != null)
            sb.append("PredictionTimeRange: ").append(getPredictionTimeRange()).append(",");
        if (getSourceDetails() != null)
            sb.append("SourceDetails: ").append(getSourceDetails()).append(",");
        if (getAssociatedInsightId() != null)
            sb.append("AssociatedInsightId: ").append(getAssociatedInsightId()).append(",");
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProactiveAnomalySummary == false)
            return false;
        ProactiveAnomalySummary other = (ProactiveAnomalySummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getAnomalyTimeRange() == null ^ this.getAnomalyTimeRange() == null)
            return false;
        if (other.getAnomalyTimeRange() != null && other.getAnomalyTimeRange().equals(this.getAnomalyTimeRange()) == false)
            return false;
        if (other.getPredictionTimeRange() == null ^ this.getPredictionTimeRange() == null)
            return false;
        if (other.getPredictionTimeRange() != null && other.getPredictionTimeRange().equals(this.getPredictionTimeRange()) == false)
            return false;
        if (other.getSourceDetails() == null ^ this.getSourceDetails() == null)
            return false;
        if (other.getSourceDetails() != null && other.getSourceDetails().equals(this.getSourceDetails()) == false)
            return false;
        if (other.getAssociatedInsightId() == null ^ this.getAssociatedInsightId() == null)
            return false;
        if (other.getAssociatedInsightId() != null && other.getAssociatedInsightId().equals(this.getAssociatedInsightId()) == false)
            return false;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getAnomalyTimeRange() == null) ? 0 : getAnomalyTimeRange().hashCode());
        hashCode = prime * hashCode + ((getPredictionTimeRange() == null) ? 0 : getPredictionTimeRange().hashCode());
        hashCode = prime * hashCode + ((getSourceDetails() == null) ? 0 : getSourceDetails().hashCode());
        hashCode = prime * hashCode + ((getAssociatedInsightId() == null) ? 0 : getAssociatedInsightId().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ProactiveAnomalySummary clone() {
        try {
            return (ProactiveAnomalySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ProactiveAnomalySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

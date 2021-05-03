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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies data stores to crawl.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CrawlerTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlerTargets implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     */
    private java.util.List<S3Target> s3Targets;
    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     */
    private java.util.List<JdbcTarget> jdbcTargets;
    /**
     * <p>
     * Specifies Amazon DocumentDB or MongoDB targets.
     * </p>
     */
    private java.util.List<MongoDBTarget> mongoDBTargets;
    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     */
    private java.util.List<DynamoDBTarget> dynamoDBTargets;
    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     */
    private java.util.List<CatalogTarget> catalogTargets;

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     * 
     * @return Specifies Amazon Simple Storage Service (Amazon S3) targets.
     */

    public java.util.List<S3Target> getS3Targets() {
        return s3Targets;
    }

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     * 
     * @param s3Targets
     *        Specifies Amazon Simple Storage Service (Amazon S3) targets.
     */

    public void setS3Targets(java.util.Collection<S3Target> s3Targets) {
        if (s3Targets == null) {
            this.s3Targets = null;
            return;
        }

        this.s3Targets = new java.util.ArrayList<S3Target>(s3Targets);
    }

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Targets(java.util.Collection)} or {@link #withS3Targets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param s3Targets
     *        Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withS3Targets(S3Target... s3Targets) {
        if (this.s3Targets == null) {
            setS3Targets(new java.util.ArrayList<S3Target>(s3Targets.length));
        }
        for (S3Target ele : s3Targets) {
            this.s3Targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     * 
     * @param s3Targets
     *        Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withS3Targets(java.util.Collection<S3Target> s3Targets) {
        setS3Targets(s3Targets);
        return this;
    }

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     * 
     * @return Specifies JDBC targets.
     */

    public java.util.List<JdbcTarget> getJdbcTargets() {
        return jdbcTargets;
    }

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     * 
     * @param jdbcTargets
     *        Specifies JDBC targets.
     */

    public void setJdbcTargets(java.util.Collection<JdbcTarget> jdbcTargets) {
        if (jdbcTargets == null) {
            this.jdbcTargets = null;
            return;
        }

        this.jdbcTargets = new java.util.ArrayList<JdbcTarget>(jdbcTargets);
    }

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJdbcTargets(java.util.Collection)} or {@link #withJdbcTargets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jdbcTargets
     *        Specifies JDBC targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withJdbcTargets(JdbcTarget... jdbcTargets) {
        if (this.jdbcTargets == null) {
            setJdbcTargets(new java.util.ArrayList<JdbcTarget>(jdbcTargets.length));
        }
        for (JdbcTarget ele : jdbcTargets) {
            this.jdbcTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     * 
     * @param jdbcTargets
     *        Specifies JDBC targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withJdbcTargets(java.util.Collection<JdbcTarget> jdbcTargets) {
        setJdbcTargets(jdbcTargets);
        return this;
    }

    /**
     * <p>
     * Specifies Amazon DocumentDB or MongoDB targets.
     * </p>
     * 
     * @return Specifies Amazon DocumentDB or MongoDB targets.
     */

    public java.util.List<MongoDBTarget> getMongoDBTargets() {
        return mongoDBTargets;
    }

    /**
     * <p>
     * Specifies Amazon DocumentDB or MongoDB targets.
     * </p>
     * 
     * @param mongoDBTargets
     *        Specifies Amazon DocumentDB or MongoDB targets.
     */

    public void setMongoDBTargets(java.util.Collection<MongoDBTarget> mongoDBTargets) {
        if (mongoDBTargets == null) {
            this.mongoDBTargets = null;
            return;
        }

        this.mongoDBTargets = new java.util.ArrayList<MongoDBTarget>(mongoDBTargets);
    }

    /**
     * <p>
     * Specifies Amazon DocumentDB or MongoDB targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMongoDBTargets(java.util.Collection)} or {@link #withMongoDBTargets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param mongoDBTargets
     *        Specifies Amazon DocumentDB or MongoDB targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withMongoDBTargets(MongoDBTarget... mongoDBTargets) {
        if (this.mongoDBTargets == null) {
            setMongoDBTargets(new java.util.ArrayList<MongoDBTarget>(mongoDBTargets.length));
        }
        for (MongoDBTarget ele : mongoDBTargets) {
            this.mongoDBTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies Amazon DocumentDB or MongoDB targets.
     * </p>
     * 
     * @param mongoDBTargets
     *        Specifies Amazon DocumentDB or MongoDB targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withMongoDBTargets(java.util.Collection<MongoDBTarget> mongoDBTargets) {
        setMongoDBTargets(mongoDBTargets);
        return this;
    }

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     * 
     * @return Specifies Amazon DynamoDB targets.
     */

    public java.util.List<DynamoDBTarget> getDynamoDBTargets() {
        return dynamoDBTargets;
    }

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     * 
     * @param dynamoDBTargets
     *        Specifies Amazon DynamoDB targets.
     */

    public void setDynamoDBTargets(java.util.Collection<DynamoDBTarget> dynamoDBTargets) {
        if (dynamoDBTargets == null) {
            this.dynamoDBTargets = null;
            return;
        }

        this.dynamoDBTargets = new java.util.ArrayList<DynamoDBTarget>(dynamoDBTargets);
    }

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDynamoDBTargets(java.util.Collection)} or {@link #withDynamoDBTargets(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dynamoDBTargets
     *        Specifies Amazon DynamoDB targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withDynamoDBTargets(DynamoDBTarget... dynamoDBTargets) {
        if (this.dynamoDBTargets == null) {
            setDynamoDBTargets(new java.util.ArrayList<DynamoDBTarget>(dynamoDBTargets.length));
        }
        for (DynamoDBTarget ele : dynamoDBTargets) {
            this.dynamoDBTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     * 
     * @param dynamoDBTargets
     *        Specifies Amazon DynamoDB targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withDynamoDBTargets(java.util.Collection<DynamoDBTarget> dynamoDBTargets) {
        setDynamoDBTargets(dynamoDBTargets);
        return this;
    }

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     * 
     * @return Specifies AWS Glue Data Catalog targets.
     */

    public java.util.List<CatalogTarget> getCatalogTargets() {
        return catalogTargets;
    }

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     * 
     * @param catalogTargets
     *        Specifies AWS Glue Data Catalog targets.
     */

    public void setCatalogTargets(java.util.Collection<CatalogTarget> catalogTargets) {
        if (catalogTargets == null) {
            this.catalogTargets = null;
            return;
        }

        this.catalogTargets = new java.util.ArrayList<CatalogTarget>(catalogTargets);
    }

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCatalogTargets(java.util.Collection)} or {@link #withCatalogTargets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param catalogTargets
     *        Specifies AWS Glue Data Catalog targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withCatalogTargets(CatalogTarget... catalogTargets) {
        if (this.catalogTargets == null) {
            setCatalogTargets(new java.util.ArrayList<CatalogTarget>(catalogTargets.length));
        }
        for (CatalogTarget ele : catalogTargets) {
            this.catalogTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     * 
     * @param catalogTargets
     *        Specifies AWS Glue Data Catalog targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerTargets withCatalogTargets(java.util.Collection<CatalogTarget> catalogTargets) {
        setCatalogTargets(catalogTargets);
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
        if (getS3Targets() != null)
            sb.append("S3Targets: ").append(getS3Targets()).append(",");
        if (getJdbcTargets() != null)
            sb.append("JdbcTargets: ").append(getJdbcTargets()).append(",");
        if (getMongoDBTargets() != null)
            sb.append("MongoDBTargets: ").append(getMongoDBTargets()).append(",");
        if (getDynamoDBTargets() != null)
            sb.append("DynamoDBTargets: ").append(getDynamoDBTargets()).append(",");
        if (getCatalogTargets() != null)
            sb.append("CatalogTargets: ").append(getCatalogTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlerTargets == false)
            return false;
        CrawlerTargets other = (CrawlerTargets) obj;
        if (other.getS3Targets() == null ^ this.getS3Targets() == null)
            return false;
        if (other.getS3Targets() != null && other.getS3Targets().equals(this.getS3Targets()) == false)
            return false;
        if (other.getJdbcTargets() == null ^ this.getJdbcTargets() == null)
            return false;
        if (other.getJdbcTargets() != null && other.getJdbcTargets().equals(this.getJdbcTargets()) == false)
            return false;
        if (other.getMongoDBTargets() == null ^ this.getMongoDBTargets() == null)
            return false;
        if (other.getMongoDBTargets() != null && other.getMongoDBTargets().equals(this.getMongoDBTargets()) == false)
            return false;
        if (other.getDynamoDBTargets() == null ^ this.getDynamoDBTargets() == null)
            return false;
        if (other.getDynamoDBTargets() != null && other.getDynamoDBTargets().equals(this.getDynamoDBTargets()) == false)
            return false;
        if (other.getCatalogTargets() == null ^ this.getCatalogTargets() == null)
            return false;
        if (other.getCatalogTargets() != null && other.getCatalogTargets().equals(this.getCatalogTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Targets() == null) ? 0 : getS3Targets().hashCode());
        hashCode = prime * hashCode + ((getJdbcTargets() == null) ? 0 : getJdbcTargets().hashCode());
        hashCode = prime * hashCode + ((getMongoDBTargets() == null) ? 0 : getMongoDBTargets().hashCode());
        hashCode = prime * hashCode + ((getDynamoDBTargets() == null) ? 0 : getDynamoDBTargets().hashCode());
        hashCode = prime * hashCode + ((getCatalogTargets() == null) ? 0 : getCatalogTargets().hashCode());
        return hashCode;
    }

    @Override
    public CrawlerTargets clone() {
        try {
            return (CrawlerTargets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CrawlerTargetsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

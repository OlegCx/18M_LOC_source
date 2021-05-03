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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchFacesByImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     */
    private Image image;
    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence
     * in the match.
     * </p>
     */
    private Integer maxFaces;
    /**
     * <p>
     * (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any matches
     * where confidence in matches is less than 70%. The default value is 80%.
     * </p>
     */
    private Float faceMatchThreshold;
    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If
     * you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t
     * meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections
     * can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too
     * blurry, or a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is
     * performed. The default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     */
    private String qualityFilter;

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * 
     * @param collectionId
     *        ID of the collection to search.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * 
     * @return ID of the collection to search.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * 
     * @param collectionId
     *        ID of the collection to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @return The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *         Rekognition operations, passing base64-encoded image bytes is not supported. </p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *         passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *         developer guide.
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence
     * in the match.
     * </p>
     * 
     * @param maxFaces
     *        Maximum number of faces to return. The operation returns the maximum number of faces with the highest
     *        confidence in the match.
     */

    public void setMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence
     * in the match.
     * </p>
     * 
     * @return Maximum number of faces to return. The operation returns the maximum number of faces with the highest
     *         confidence in the match.
     */

    public Integer getMaxFaces() {
        return this.maxFaces;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence
     * in the match.
     * </p>
     * 
     * @param maxFaces
     *        Maximum number of faces to return. The operation returns the maximum number of faces with the highest
     *        confidence in the match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageRequest withMaxFaces(Integer maxFaces) {
        setMaxFaces(maxFaces);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any matches
     * where confidence in matches is less than 70%. The default value is 80%.
     * </p>
     * 
     * @param faceMatchThreshold
     *        (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any
     *        matches where confidence in matches is less than 70%. The default value is 80%.
     */

    public void setFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
    }

    /**
     * <p>
     * (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any matches
     * where confidence in matches is less than 70%. The default value is 80%.
     * </p>
     * 
     * @return (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any
     *         matches where confidence in matches is less than 70%. The default value is 80%.
     */

    public Float getFaceMatchThreshold() {
        return this.faceMatchThreshold;
    }

    /**
     * <p>
     * (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any matches
     * where confidence in matches is less than 70%. The default value is 80%.
     * </p>
     * 
     * @param faceMatchThreshold
     *        (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any
     *        matches where confidence in matches is less than 70%. The default value is 80%.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageRequest withFaceMatchThreshold(Float faceMatchThreshold) {
        setFaceMatchThreshold(faceMatchThreshold);
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If
     * you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t
     * meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections
     * can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too
     * blurry, or a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is
     * performed. The default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *        quality bar. If you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *        all faces that don’t meet the chosen quality bar. The quality bar is based on a variety of common use
     *        cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     *        misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you
     *        specify <code>NONE</code>, no filtering is performed. The default value is <code>NONE</code>. </p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face model
     *        or higher.
     * @see QualityFilter
     */

    public void setQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If
     * you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t
     * meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections
     * can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too
     * blurry, or a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is
     * performed. The default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     * 
     * @return A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *         aren't searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *         quality bar. If you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering
     *         removes all faces that don’t meet the chosen quality bar. The quality bar is based on a variety of common
     *         use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     *         misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If
     *         you specify <code>NONE</code>, no filtering is performed. The default value is <code>NONE</code>. </p>
     *         <p>
     *         To use quality filtering, the collection you are using must be associated with version 3 of the face
     *         model or higher.
     * @see QualityFilter
     */

    public String getQualityFilter() {
        return this.qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If
     * you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t
     * meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections
     * can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too
     * blurry, or a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is
     * performed. The default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *        quality bar. If you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *        all faces that don’t meet the chosen quality bar. The quality bar is based on a variety of common use
     *        cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     *        misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you
     *        specify <code>NONE</code>, no filtering is performed. The default value is <code>NONE</code>. </p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face model
     *        or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualityFilter
     */

    public SearchFacesByImageRequest withQualityFilter(String qualityFilter) {
        setQualityFilter(qualityFilter);
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If
     * you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t
     * meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections
     * can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too
     * blurry, or a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is
     * performed. The default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't searched for in the collection. If you specify <code>AUTO</code>, Amazon Rekognition chooses the
     *        quality bar. If you specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes
     *        all faces that don’t meet the chosen quality bar. The quality bar is based on a variety of common use
     *        cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     *        misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you
     *        specify <code>NONE</code>, no filtering is performed. The default value is <code>NONE</code>. </p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face model
     *        or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualityFilter
     */

    public SearchFacesByImageRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
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
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getMaxFaces() != null)
            sb.append("MaxFaces: ").append(getMaxFaces()).append(",");
        if (getFaceMatchThreshold() != null)
            sb.append("FaceMatchThreshold: ").append(getFaceMatchThreshold()).append(",");
        if (getQualityFilter() != null)
            sb.append("QualityFilter: ").append(getQualityFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFacesByImageRequest == false)
            return false;
        SearchFacesByImageRequest other = (SearchFacesByImageRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMaxFaces() == null ^ this.getMaxFaces() == null)
            return false;
        if (other.getMaxFaces() != null && other.getMaxFaces().equals(this.getMaxFaces()) == false)
            return false;
        if (other.getFaceMatchThreshold() == null ^ this.getFaceMatchThreshold() == null)
            return false;
        if (other.getFaceMatchThreshold() != null && other.getFaceMatchThreshold().equals(this.getFaceMatchThreshold()) == false)
            return false;
        if (other.getQualityFilter() == null ^ this.getQualityFilter() == null)
            return false;
        if (other.getQualityFilter() != null && other.getQualityFilter().equals(this.getQualityFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMaxFaces() == null) ? 0 : getMaxFaces().hashCode());
        hashCode = prime * hashCode + ((getFaceMatchThreshold() == null) ? 0 : getFaceMatchThreshold().hashCode());
        hashCode = prime * hashCode + ((getQualityFilter() == null) ? 0 : getQualityFilter().hashCode());
        return hashCode;
    }

    @Override
    public SearchFacesByImageRequest clone() {
        return (SearchFacesByImageRequest) super.clone();
    }

}

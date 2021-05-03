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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePredictorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the predictor.
     * </p>
     */
    private String predictorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if <code>PerformAutoML</code>
     * is not set to <code>true</code>.
     * </p>
     * <p class="title">
     * <b>Supported algorithms:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ARIMA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/CNN-QR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/NPTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Prophet</code>
     * </p>
     * </li>
     * </ul>
     */
    private String algorithmArn;
    /**
     * <p>
     * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the
     * prediction length.
     * </p>
     * <p>
     * For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code> parameter
     * of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns predictions for 10
     * days.
     * </p>
     * <p>
     * The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
     * </p>
     */
    private Integer forecastHorizon;
    /**
     * <p>
     * Specifies the forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     * can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * <p>
     * The default value is <code>["0.10", "0.50", "0.9"]</code>.
     * </p>
     */
    private java.util.List<String> forecastTypes;
    /**
     * <p>
     * Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides and
     * chooses the best algorithm and configuration for your training dataset.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     * </p>
     * <p>
     * Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a good option
     * if you aren't sure which algorithm is suitable for your training data. In this case, <code>PerformHPO</code> must
     * be false.
     * </p>
     */
    private Boolean performAutoML;
    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as running a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which hyperparameters
     * participate in tuning, and the valid range for each tunable hyperparameter. In this case, you are required to
     * specify an algorithm and <code>PerformAutoML</code> must be false.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * <li>
     * <p>
     * CNN-QR
     * </p>
     * </li>
     * </ul>
     */
    private Boolean performHPO;
    /**
     * <p>
     * The hyperparameters to override for model training. The hyperparameters that you can override are listed in the
     * individual algorithms. For the list of supported algorithms, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     */
    private java.util.Map<String, String> trainingParameters;
    /**
     * <p>
     * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     * predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to
     * perform the split and the number of iterations.
     * </p>
     */
    private EvaluationParameters evaluationParameters;
    /**
     * <p>
     * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast
     * uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization
     * (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * <p>
     * If you included the <code>HPOConfig</code> object, you must set <code>PerformHPO</code> to true.
     * </p>
     */
    private HyperParameterTuningJobConfig hPOConfig;
    /**
     * <p>
     * Describes the dataset group that contains the data to use to train the predictor.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The featurization configuration.
     * </p>
     */
    private FeaturizationConfig featurizationConfig;
    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     */
    private EncryptionConfig encryptionConfig;
    /**
     * <p>
     * The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the predictor.
     * </p>
     * 
     * @param predictorName
     *        A name for the predictor.
     */

    public void setPredictorName(String predictorName) {
        this.predictorName = predictorName;
    }

    /**
     * <p>
     * A name for the predictor.
     * </p>
     * 
     * @return A name for the predictor.
     */

    public String getPredictorName() {
        return this.predictorName;
    }

    /**
     * <p>
     * A name for the predictor.
     * </p>
     * 
     * @param predictorName
     *        A name for the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withPredictorName(String predictorName) {
        setPredictorName(predictorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if <code>PerformAutoML</code>
     * is not set to <code>true</code>.
     * </p>
     * <p class="title">
     * <b>Supported algorithms:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ARIMA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/CNN-QR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/NPTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Prophet</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if
     *        <code>PerformAutoML</code> is not set to <code>true</code>.</p>
     *        <p class="title">
     *        <b>Supported algorithms:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/ARIMA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/CNN-QR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/ETS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/NPTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/Prophet</code>
     *        </p>
     *        </li>
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if <code>PerformAutoML</code>
     * is not set to <code>true</code>.
     * </p>
     * <p class="title">
     * <b>Supported algorithms:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ARIMA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/CNN-QR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/NPTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Prophet</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if
     *         <code>PerformAutoML</code> is not set to <code>true</code>.</p>
     *         <p class="title">
     *         <b>Supported algorithms:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/ARIMA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/CNN-QR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/ETS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/NPTS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/Prophet</code>
     *         </p>
     *         </li>
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if <code>PerformAutoML</code>
     * is not set to <code>true</code>.
     * </p>
     * <p class="title">
     * <b>Supported algorithms:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ARIMA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/CNN-QR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/NPTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Prophet</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if
     *        <code>PerformAutoML</code> is not set to <code>true</code>.</p>
     *        <p class="title">
     *        <b>Supported algorithms:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/ARIMA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/CNN-QR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/ETS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/NPTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/Prophet</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the
     * prediction length.
     * </p>
     * <p>
     * For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code> parameter
     * of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns predictions for 10
     * days.
     * </p>
     * <p>
     * The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
     * </p>
     * 
     * @param forecastHorizon
     *        Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also
     *        called the prediction length.</p>
     *        <p>
     *        For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code>
     *        parameter of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns
     *        predictions for 10 days.
     *        </p>
     *        <p>
     *        The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset
     *        length.
     */

    public void setForecastHorizon(Integer forecastHorizon) {
        this.forecastHorizon = forecastHorizon;
    }

    /**
     * <p>
     * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the
     * prediction length.
     * </p>
     * <p>
     * For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code> parameter
     * of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns predictions for 10
     * days.
     * </p>
     * <p>
     * The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
     * </p>
     * 
     * @return Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also
     *         called the prediction length.</p>
     *         <p>
     *         For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code>
     *         parameter of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns
     *         predictions for 10 days.
     *         </p>
     *         <p>
     *         The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset
     *         length.
     */

    public Integer getForecastHorizon() {
        return this.forecastHorizon;
    }

    /**
     * <p>
     * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the
     * prediction length.
     * </p>
     * <p>
     * For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code> parameter
     * of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns predictions for 10
     * days.
     * </p>
     * <p>
     * The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
     * </p>
     * 
     * @param forecastHorizon
     *        Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also
     *        called the prediction length.</p>
     *        <p>
     *        For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code>
     *        parameter of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns
     *        predictions for 10 days.
     *        </p>
     *        <p>
     *        The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset
     *        length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withForecastHorizon(Integer forecastHorizon) {
        setForecastHorizon(forecastHorizon);
        return this;
    }

    /**
     * <p>
     * Specifies the forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     * can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * <p>
     * The default value is <code>["0.10", "0.50", "0.9"]</code>.
     * </p>
     * 
     * @return Specifies the forecast types used to train a predictor. You can specify up to five forecast types.
     *         Forecast types can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify
     *         the mean forecast with <code>mean</code>. </p>
     *         <p>
     *         The default value is <code>["0.10", "0.50", "0.9"]</code>.
     */

    public java.util.List<String> getForecastTypes() {
        return forecastTypes;
    }

    /**
     * <p>
     * Specifies the forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     * can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * <p>
     * The default value is <code>["0.10", "0.50", "0.9"]</code>.
     * </p>
     * 
     * @param forecastTypes
     *        Specifies the forecast types used to train a predictor. You can specify up to five forecast types.
     *        Forecast types can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify
     *        the mean forecast with <code>mean</code>. </p>
     *        <p>
     *        The default value is <code>["0.10", "0.50", "0.9"]</code>.
     */

    public void setForecastTypes(java.util.Collection<String> forecastTypes) {
        if (forecastTypes == null) {
            this.forecastTypes = null;
            return;
        }

        this.forecastTypes = new java.util.ArrayList<String>(forecastTypes);
    }

    /**
     * <p>
     * Specifies the forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     * can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * <p>
     * The default value is <code>["0.10", "0.50", "0.9"]</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastTypes(java.util.Collection)} or {@link #withForecastTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param forecastTypes
     *        Specifies the forecast types used to train a predictor. You can specify up to five forecast types.
     *        Forecast types can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify
     *        the mean forecast with <code>mean</code>. </p>
     *        <p>
     *        The default value is <code>["0.10", "0.50", "0.9"]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withForecastTypes(String... forecastTypes) {
        if (this.forecastTypes == null) {
            setForecastTypes(new java.util.ArrayList<String>(forecastTypes.length));
        }
        for (String ele : forecastTypes) {
            this.forecastTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     * can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * <p>
     * The default value is <code>["0.10", "0.50", "0.9"]</code>.
     * </p>
     * 
     * @param forecastTypes
     *        Specifies the forecast types used to train a predictor. You can specify up to five forecast types.
     *        Forecast types can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify
     *        the mean forecast with <code>mean</code>. </p>
     *        <p>
     *        The default value is <code>["0.10", "0.50", "0.9"]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withForecastTypes(java.util.Collection<String> forecastTypes) {
        setForecastTypes(forecastTypes);
        return this;
    }

    /**
     * <p>
     * Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides and
     * chooses the best algorithm and configuration for your training dataset.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     * </p>
     * <p>
     * Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a good option
     * if you aren't sure which algorithm is suitable for your training data. In this case, <code>PerformHPO</code> must
     * be false.
     * </p>
     * 
     * @param performAutoML
     *        Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides
     *        and chooses the best algorithm and configuration for your training dataset.</p>
     *        <p>
     *        The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     *        </p>
     *        <p>
     *        Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a good
     *        option if you aren't sure which algorithm is suitable for your training data. In this case,
     *        <code>PerformHPO</code> must be false.
     */

    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <p>
     * Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides and
     * chooses the best algorithm and configuration for your training dataset.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     * </p>
     * <p>
     * Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a good option
     * if you aren't sure which algorithm is suitable for your training data. In this case, <code>PerformHPO</code> must
     * be false.
     * </p>
     * 
     * @return Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides
     *         and chooses the best algorithm and configuration for your training dataset.</p>
     *         <p>
     *         The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     *         </p>
     *         <p>
     *         Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a
     *         good option if you aren't sure which algorithm is suitable for your training data. In this case,
     *         <code>PerformHPO</code> must be false.
     */

    public Boolean getPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides and
     * chooses the best algorithm and configuration for your training dataset.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     * </p>
     * <p>
     * Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a good option
     * if you aren't sure which algorithm is suitable for your training data. In this case, <code>PerformHPO</code> must
     * be false.
     * </p>
     * 
     * @param performAutoML
     *        Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides
     *        and chooses the best algorithm and configuration for your training dataset.</p>
     *        <p>
     *        The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     *        </p>
     *        <p>
     *        Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a good
     *        option if you aren't sure which algorithm is suitable for your training data. In this case,
     *        <code>PerformHPO</code> must be false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withPerformAutoML(Boolean performAutoML) {
        setPerformAutoML(performAutoML);
        return this;
    }

    /**
     * <p>
     * Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides and
     * chooses the best algorithm and configuration for your training dataset.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     * </p>
     * <p>
     * Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a good option
     * if you aren't sure which algorithm is suitable for your training data. In this case, <code>PerformHPO</code> must
     * be false.
     * </p>
     * 
     * @return Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides
     *         and chooses the best algorithm and configuration for your training dataset.</p>
     *         <p>
     *         The default value is <code>false</code>. In this case, you are required to specify an algorithm.
     *         </p>
     *         <p>
     *         Set <code>PerformAutoML</code> to <code>true</code> to have Amazon Forecast perform AutoML. This is a
     *         good option if you aren't sure which algorithm is suitable for your training data. In this case,
     *         <code>PerformHPO</code> must be false.
     */

    public Boolean isPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as running a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which hyperparameters
     * participate in tuning, and the valid range for each tunable hyperparameter. In this case, you are required to
     * specify an algorithm and <code>PerformAutoML</code> must be false.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * <li>
     * <p>
     * CNN-QR
     * </p>
     * </li>
     * </ul>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your
     *        training data. The process of performing HPO is known as running a hyperparameter tuning job.</p>
     *        <p>
     *        The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values
     *        from the chosen algorithm.
     *        </p>
     *        <p>
     *        To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply
     *        the <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which
     *        hyperparameters participate in tuning, and the valid range for each tunable hyperparameter. In this case,
     *        you are required to specify an algorithm and <code>PerformAutoML</code> must be false.
     *        </p>
     *        <p>
     *        The following algorithms support HPO:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DeepAR+
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CNN-QR
     *        </p>
     *        </li>
     */

    public void setPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as running a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which hyperparameters
     * participate in tuning, and the valid range for each tunable hyperparameter. In this case, you are required to
     * specify an algorithm and <code>PerformAutoML</code> must be false.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * <li>
     * <p>
     * CNN-QR
     * </p>
     * </li>
     * </ul>
     * 
     * @return Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your
     *         training data. The process of performing HPO is known as running a hyperparameter tuning job.</p>
     *         <p>
     *         The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values
     *         from the chosen algorithm.
     *         </p>
     *         <p>
     *         To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply
     *         the <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which
     *         hyperparameters participate in tuning, and the valid range for each tunable hyperparameter. In this case,
     *         you are required to specify an algorithm and <code>PerformAutoML</code> must be false.
     *         </p>
     *         <p>
     *         The following algorithms support HPO:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeepAR+
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CNN-QR
     *         </p>
     *         </li>
     */

    public Boolean getPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as running a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which hyperparameters
     * participate in tuning, and the valid range for each tunable hyperparameter. In this case, you are required to
     * specify an algorithm and <code>PerformAutoML</code> must be false.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * <li>
     * <p>
     * CNN-QR
     * </p>
     * </li>
     * </ul>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your
     *        training data. The process of performing HPO is known as running a hyperparameter tuning job.</p>
     *        <p>
     *        The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values
     *        from the chosen algorithm.
     *        </p>
     *        <p>
     *        To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply
     *        the <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which
     *        hyperparameters participate in tuning, and the valid range for each tunable hyperparameter. In this case,
     *        you are required to specify an algorithm and <code>PerformAutoML</code> must be false.
     *        </p>
     *        <p>
     *        The following algorithms support HPO:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DeepAR+
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CNN-QR
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withPerformHPO(Boolean performHPO) {
        setPerformHPO(performHPO);
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as running a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which hyperparameters
     * participate in tuning, and the valid range for each tunable hyperparameter. In this case, you are required to
     * specify an algorithm and <code>PerformAutoML</code> must be false.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * <li>
     * <p>
     * CNN-QR
     * </p>
     * </li>
     * </ul>
     * 
     * @return Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your
     *         training data. The process of performing HPO is known as running a hyperparameter tuning job.</p>
     *         <p>
     *         The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values
     *         from the chosen algorithm.
     *         </p>
     *         <p>
     *         To override the default values, set <code>PerformHPO</code> to <code>true</code> and, optionally, supply
     *         the <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies a metric to optimize, which
     *         hyperparameters participate in tuning, and the valid range for each tunable hyperparameter. In this case,
     *         you are required to specify an algorithm and <code>PerformAutoML</code> must be false.
     *         </p>
     *         <p>
     *         The following algorithms support HPO:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeepAR+
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CNN-QR
     *         </p>
     *         </li>
     */

    public Boolean isPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * The hyperparameters to override for model training. The hyperparameters that you can override are listed in the
     * individual algorithms. For the list of supported algorithms, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @return The hyperparameters to override for model training. The hyperparameters that you can override are listed
     *         in the individual algorithms. For the list of supported algorithms, see
     *         <a>aws-forecast-choosing-recipes</a>.
     */

    public java.util.Map<String, String> getTrainingParameters() {
        return trainingParameters;
    }

    /**
     * <p>
     * The hyperparameters to override for model training. The hyperparameters that you can override are listed in the
     * individual algorithms. For the list of supported algorithms, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @param trainingParameters
     *        The hyperparameters to override for model training. The hyperparameters that you can override are listed
     *        in the individual algorithms. For the list of supported algorithms, see
     *        <a>aws-forecast-choosing-recipes</a>.
     */

    public void setTrainingParameters(java.util.Map<String, String> trainingParameters) {
        this.trainingParameters = trainingParameters;
    }

    /**
     * <p>
     * The hyperparameters to override for model training. The hyperparameters that you can override are listed in the
     * individual algorithms. For the list of supported algorithms, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @param trainingParameters
     *        The hyperparameters to override for model training. The hyperparameters that you can override are listed
     *        in the individual algorithms. For the list of supported algorithms, see
     *        <a>aws-forecast-choosing-recipes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withTrainingParameters(java.util.Map<String, String> trainingParameters) {
        setTrainingParameters(trainingParameters);
        return this;
    }

    /**
     * Add a single TrainingParameters entry
     *
     * @see CreatePredictorRequest#withTrainingParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest addTrainingParametersEntry(String key, String value) {
        if (null == this.trainingParameters) {
            this.trainingParameters = new java.util.HashMap<String, String>();
        }
        if (this.trainingParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.trainingParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TrainingParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest clearTrainingParametersEntries() {
        this.trainingParameters = null;
        return this;
    }

    /**
     * <p>
     * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     * predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to
     * perform the split and the number of iterations.
     * </p>
     * 
     * @param evaluationParameters
     *        Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     *        predictor by splitting a dataset into training data and testing data. The evaluation parameters define how
     *        to perform the split and the number of iterations.
     */

    public void setEvaluationParameters(EvaluationParameters evaluationParameters) {
        this.evaluationParameters = evaluationParameters;
    }

    /**
     * <p>
     * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     * predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to
     * perform the split and the number of iterations.
     * </p>
     * 
     * @return Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates
     *         a predictor by splitting a dataset into training data and testing data. The evaluation parameters define
     *         how to perform the split and the number of iterations.
     */

    public EvaluationParameters getEvaluationParameters() {
        return this.evaluationParameters;
    }

    /**
     * <p>
     * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     * predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to
     * perform the split and the number of iterations.
     * </p>
     * 
     * @param evaluationParameters
     *        Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     *        predictor by splitting a dataset into training data and testing data. The evaluation parameters define how
     *        to perform the split and the number of iterations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withEvaluationParameters(EvaluationParameters evaluationParameters) {
        setEvaluationParameters(evaluationParameters);
        return this;
    }

    /**
     * <p>
     * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast
     * uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization
     * (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * <p>
     * If you included the <code>HPOConfig</code> object, you must set <code>PerformHPO</code> to true.
     * </p>
     * 
     * @param hPOConfig
     *        Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon
     *        Forecast uses default values. The individual algorithms specify which hyperparameters support
     *        hyperparameter optimization (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.</p>
     *        <p>
     *        If you included the <code>HPOConfig</code> object, you must set <code>PerformHPO</code> to true.
     */

    public void setHPOConfig(HyperParameterTuningJobConfig hPOConfig) {
        this.hPOConfig = hPOConfig;
    }

    /**
     * <p>
     * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast
     * uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization
     * (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * <p>
     * If you included the <code>HPOConfig</code> object, you must set <code>PerformHPO</code> to true.
     * </p>
     * 
     * @return Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon
     *         Forecast uses default values. The individual algorithms specify which hyperparameters support
     *         hyperparameter optimization (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.</p>
     *         <p>
     *         If you included the <code>HPOConfig</code> object, you must set <code>PerformHPO</code> to true.
     */

    public HyperParameterTuningJobConfig getHPOConfig() {
        return this.hPOConfig;
    }

    /**
     * <p>
     * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast
     * uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization
     * (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * <p>
     * If you included the <code>HPOConfig</code> object, you must set <code>PerformHPO</code> to true.
     * </p>
     * 
     * @param hPOConfig
     *        Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon
     *        Forecast uses default values. The individual algorithms specify which hyperparameters support
     *        hyperparameter optimization (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.</p>
     *        <p>
     *        If you included the <code>HPOConfig</code> object, you must set <code>PerformHPO</code> to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withHPOConfig(HyperParameterTuningJobConfig hPOConfig) {
        setHPOConfig(hPOConfig);
        return this;
    }

    /**
     * <p>
     * Describes the dataset group that contains the data to use to train the predictor.
     * </p>
     * 
     * @param inputDataConfig
     *        Describes the dataset group that contains the data to use to train the predictor.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Describes the dataset group that contains the data to use to train the predictor.
     * </p>
     * 
     * @return Describes the dataset group that contains the data to use to train the predictor.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Describes the dataset group that contains the data to use to train the predictor.
     * </p>
     * 
     * @param inputDataConfig
     *        Describes the dataset group that contains the data to use to train the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The featurization configuration.
     * </p>
     * 
     * @param featurizationConfig
     *        The featurization configuration.
     */

    public void setFeaturizationConfig(FeaturizationConfig featurizationConfig) {
        this.featurizationConfig = featurizationConfig;
    }

    /**
     * <p>
     * The featurization configuration.
     * </p>
     * 
     * @return The featurization configuration.
     */

    public FeaturizationConfig getFeaturizationConfig() {
        return this.featurizationConfig;
    }

    /**
     * <p>
     * The featurization configuration.
     * </p>
     * 
     * @param featurizationConfig
     *        The featurization configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withFeaturizationConfig(FeaturizationConfig featurizationConfig) {
        setFeaturizationConfig(featurizationConfig);
        return this;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @param encryptionConfig
     *        An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *        Forecast can assume to access the key.
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @return An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *         Forecast can assume to access the key.
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @param encryptionConfig
     *        An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *        Forecast can assume to access the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag
     *         consists of a key and an optional value, both of which you define.</p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and resources, remember that other services may
     *         have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *         representable in UTF-8, and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a
     *         prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix.
     *         Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then
     *         Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the
     *         key prefix of <code>aws</code> do not count against your tags per resource limit.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPredictorName() != null)
            sb.append("PredictorName: ").append(getPredictorName()).append(",");
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: ").append(getAlgorithmArn()).append(",");
        if (getForecastHorizon() != null)
            sb.append("ForecastHorizon: ").append(getForecastHorizon()).append(",");
        if (getForecastTypes() != null)
            sb.append("ForecastTypes: ").append(getForecastTypes()).append(",");
        if (getPerformAutoML() != null)
            sb.append("PerformAutoML: ").append(getPerformAutoML()).append(",");
        if (getPerformHPO() != null)
            sb.append("PerformHPO: ").append(getPerformHPO()).append(",");
        if (getTrainingParameters() != null)
            sb.append("TrainingParameters: ").append(getTrainingParameters()).append(",");
        if (getEvaluationParameters() != null)
            sb.append("EvaluationParameters: ").append(getEvaluationParameters()).append(",");
        if (getHPOConfig() != null)
            sb.append("HPOConfig: ").append(getHPOConfig()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getFeaturizationConfig() != null)
            sb.append("FeaturizationConfig: ").append(getFeaturizationConfig()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePredictorRequest == false)
            return false;
        CreatePredictorRequest other = (CreatePredictorRequest) obj;
        if (other.getPredictorName() == null ^ this.getPredictorName() == null)
            return false;
        if (other.getPredictorName() != null && other.getPredictorName().equals(this.getPredictorName()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getForecastHorizon() == null ^ this.getForecastHorizon() == null)
            return false;
        if (other.getForecastHorizon() != null && other.getForecastHorizon().equals(this.getForecastHorizon()) == false)
            return false;
        if (other.getForecastTypes() == null ^ this.getForecastTypes() == null)
            return false;
        if (other.getForecastTypes() != null && other.getForecastTypes().equals(this.getForecastTypes()) == false)
            return false;
        if (other.getPerformAutoML() == null ^ this.getPerformAutoML() == null)
            return false;
        if (other.getPerformAutoML() != null && other.getPerformAutoML().equals(this.getPerformAutoML()) == false)
            return false;
        if (other.getPerformHPO() == null ^ this.getPerformHPO() == null)
            return false;
        if (other.getPerformHPO() != null && other.getPerformHPO().equals(this.getPerformHPO()) == false)
            return false;
        if (other.getTrainingParameters() == null ^ this.getTrainingParameters() == null)
            return false;
        if (other.getTrainingParameters() != null && other.getTrainingParameters().equals(this.getTrainingParameters()) == false)
            return false;
        if (other.getEvaluationParameters() == null ^ this.getEvaluationParameters() == null)
            return false;
        if (other.getEvaluationParameters() != null && other.getEvaluationParameters().equals(this.getEvaluationParameters()) == false)
            return false;
        if (other.getHPOConfig() == null ^ this.getHPOConfig() == null)
            return false;
        if (other.getHPOConfig() != null && other.getHPOConfig().equals(this.getHPOConfig()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getFeaturizationConfig() == null ^ this.getFeaturizationConfig() == null)
            return false;
        if (other.getFeaturizationConfig() != null && other.getFeaturizationConfig().equals(this.getFeaturizationConfig()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictorName() == null) ? 0 : getPredictorName().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode + ((getForecastHorizon() == null) ? 0 : getForecastHorizon().hashCode());
        hashCode = prime * hashCode + ((getForecastTypes() == null) ? 0 : getForecastTypes().hashCode());
        hashCode = prime * hashCode + ((getPerformAutoML() == null) ? 0 : getPerformAutoML().hashCode());
        hashCode = prime * hashCode + ((getPerformHPO() == null) ? 0 : getPerformHPO().hashCode());
        hashCode = prime * hashCode + ((getTrainingParameters() == null) ? 0 : getTrainingParameters().hashCode());
        hashCode = prime * hashCode + ((getEvaluationParameters() == null) ? 0 : getEvaluationParameters().hashCode());
        hashCode = prime * hashCode + ((getHPOConfig() == null) ? 0 : getHPOConfig().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getFeaturizationConfig() == null) ? 0 : getFeaturizationConfig().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePredictorRequest clone() {
        return (CreatePredictorRequest) super.clone();
    }

}

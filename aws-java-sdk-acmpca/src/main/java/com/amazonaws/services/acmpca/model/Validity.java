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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Validity specifies the period of time during which a certificate is valid. Validity can be expressed as an explicit
 * date and time when the validity of a certificate starts or expires, or as a span of time after issuance, stated in
 * days, months, or years. For more information, see <a
 * href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
 * </p>
 * <p>
 * ACM Private CA API consumes the <code>Validity</code> data type differently in two distinct parameters of the
 * <code>IssueCertificate</code> action. The required parameter <code>IssueCertificate</code>:<code>Validity</code>
 * specifies the end of a certificate's validity period. The optional parameter <code>IssueCertificate</code>:
 * <code>ValidityNotBefore</code> specifies a customized starting time for the validity period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/Validity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Validity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A long integer interpreted according to the value of <code>Type</code>, below.
     * </p>
     */
    private Long value;
    /**
     * <p>
     * Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported validity
     * types include those listed below. Type definitions with values include a sample input value and the resulting
     * output.
     * </p>
     * <p>
     * <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using UTCTime
     * (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field (YY) is
     * greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50, the year is
     * interpreted as 20YY.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 491231235959 (UTCTime format)
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 12/31/2049 23:59:59
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or expire,
     * expressed in seconds since the Unix Epoch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 2524608000
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 01/01/2050 00:00:00
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance until
     * the certificate will expire, expressed in days, months, or years.
     * </p>
     * <p>
     * Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 90
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date: 01/10/2020 12:34:54 UTC
     * </p>
     * </li>
     * </ul>
     * <p>
     * The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The minimum
     * validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>) is one second.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A long integer interpreted according to the value of <code>Type</code>, below.
     * </p>
     * 
     * @param value
     *        A long integer interpreted according to the value of <code>Type</code>, below.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * A long integer interpreted according to the value of <code>Type</code>, below.
     * </p>
     * 
     * @return A long integer interpreted according to the value of <code>Type</code>, below.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * A long integer interpreted according to the value of <code>Type</code>, below.
     * </p>
     * 
     * @param value
     *        A long integer interpreted according to the value of <code>Type</code>, below.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Validity withValue(Long value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported validity
     * types include those listed below. Type definitions with values include a sample input value and the resulting
     * output.
     * </p>
     * <p>
     * <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using UTCTime
     * (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field (YY) is
     * greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50, the year is
     * interpreted as 20YY.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 491231235959 (UTCTime format)
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 12/31/2049 23:59:59
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or expire,
     * expressed in seconds since the Unix Epoch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 2524608000
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 01/01/2050 00:00:00
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance until
     * the certificate will expire, expressed in days, months, or years.
     * </p>
     * <p>
     * Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 90
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date: 01/10/2020 12:34:54 UTC
     * </p>
     * </li>
     * </ul>
     * <p>
     * The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The minimum
     * validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>) is one second.
     * </p>
     * 
     * @param type
     *        Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported
     *        validity types include those listed below. Type definitions with values include a sample input value and
     *        the resulting output. </p>
     *        <p>
     *        <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using
     *        UTCTime (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field
     *        (YY) is greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50,
     *        the year is interpreted as 20YY.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 491231235959 (UTCTime format)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date/time: 12/31/2049 23:59:59
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or expire,
     *        expressed in seconds since the Unix Epoch.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 2524608000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date/time: 01/01/2050 00:00:00
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance
     *        until the certificate will expire, expressed in days, months, or years.
     *        </p>
     *        <p>
     *        Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 90
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date: 01/10/2020 12:34:54 UTC
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The
     *        minimum validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>) is
     *        one second.
     * @see ValidityPeriodType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported validity
     * types include those listed below. Type definitions with values include a sample input value and the resulting
     * output.
     * </p>
     * <p>
     * <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using UTCTime
     * (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field (YY) is
     * greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50, the year is
     * interpreted as 20YY.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 491231235959 (UTCTime format)
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 12/31/2049 23:59:59
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or expire,
     * expressed in seconds since the Unix Epoch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 2524608000
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 01/01/2050 00:00:00
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance until
     * the certificate will expire, expressed in days, months, or years.
     * </p>
     * <p>
     * Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 90
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date: 01/10/2020 12:34:54 UTC
     * </p>
     * </li>
     * </ul>
     * <p>
     * The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The minimum
     * validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>) is one second.
     * </p>
     * 
     * @return Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported
     *         validity types include those listed below. Type definitions with values include a sample input value and
     *         the resulting output. </p>
     *         <p>
     *         <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using
     *         UTCTime (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year
     *         field (YY) is greater than or equal to 50, the year is interpreted as 19YY. If the year field is less
     *         than 50, the year is interpreted as 20YY.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Sample input value: 491231235959 (UTCTime format)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Output expiration date/time: 12/31/2049 23:59:59
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or
     *         expire, expressed in seconds since the Unix Epoch.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Sample input value: 2524608000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Output expiration date/time: 01/01/2050 00:00:00
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance
     *         until the certificate will expire, expressed in days, months, or years.
     *         </p>
     *         <p>
     *         Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Sample input value: 90
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Output expiration date: 01/10/2020 12:34:54 UTC
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The
     *         minimum validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>)
     *         is one second.
     * @see ValidityPeriodType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported validity
     * types include those listed below. Type definitions with values include a sample input value and the resulting
     * output.
     * </p>
     * <p>
     * <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using UTCTime
     * (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field (YY) is
     * greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50, the year is
     * interpreted as 20YY.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 491231235959 (UTCTime format)
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 12/31/2049 23:59:59
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or expire,
     * expressed in seconds since the Unix Epoch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 2524608000
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 01/01/2050 00:00:00
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance until
     * the certificate will expire, expressed in days, months, or years.
     * </p>
     * <p>
     * Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 90
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date: 01/10/2020 12:34:54 UTC
     * </p>
     * </li>
     * </ul>
     * <p>
     * The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The minimum
     * validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>) is one second.
     * </p>
     * 
     * @param type
     *        Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported
     *        validity types include those listed below. Type definitions with values include a sample input value and
     *        the resulting output. </p>
     *        <p>
     *        <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using
     *        UTCTime (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field
     *        (YY) is greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50,
     *        the year is interpreted as 20YY.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 491231235959 (UTCTime format)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date/time: 12/31/2049 23:59:59
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or expire,
     *        expressed in seconds since the Unix Epoch.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 2524608000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date/time: 01/01/2050 00:00:00
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance
     *        until the certificate will expire, expressed in days, months, or years.
     *        </p>
     *        <p>
     *        Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 90
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date: 01/10/2020 12:34:54 UTC
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The
     *        minimum validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>) is
     *        one second.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidityPeriodType
     */

    public Validity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported validity
     * types include those listed below. Type definitions with values include a sample input value and the resulting
     * output.
     * </p>
     * <p>
     * <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using UTCTime
     * (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field (YY) is
     * greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50, the year is
     * interpreted as 20YY.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 491231235959 (UTCTime format)
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 12/31/2049 23:59:59
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or expire,
     * expressed in seconds since the Unix Epoch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 2524608000
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date/time: 01/01/2050 00:00:00
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance until
     * the certificate will expire, expressed in days, months, or years.
     * </p>
     * <p>
     * Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample input value: 90
     * </p>
     * </li>
     * <li>
     * <p>
     * Output expiration date: 01/10/2020 12:34:54 UTC
     * </p>
     * </li>
     * </ul>
     * <p>
     * The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The minimum
     * validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>) is one second.
     * </p>
     * 
     * @param type
     *        Determines how <i>ACM Private CA</i> interprets the <code>Value</code> parameter, an integer. Supported
     *        validity types include those listed below. Type definitions with values include a sample input value and
     *        the resulting output. </p>
     *        <p>
     *        <code>END_DATE</code>: The specific date and time when the certificate will expire, expressed using
     *        UTCTime (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field
     *        (YY) is greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50,
     *        the year is interpreted as 20YY.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 491231235959 (UTCTime format)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date/time: 12/31/2049 23:59:59
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>ABSOLUTE</code>: The specific date and time when the validity of a certificate will start or expire,
     *        expressed in seconds since the Unix Epoch.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 2524608000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date/time: 01/01/2050 00:00:00
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>DAYS</code>, <code>MONTHS</code>, <code>YEARS</code>: The relative time from the moment of issuance
     *        until the certificate will expire, expressed in days, months, or years.
     *        </p>
     *        <p>
     *        Example if <code>DAYS</code>, issued on 10/12/2020 at 12:34:54 UTC:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sample input value: 90
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Output expiration date: 01/10/2020 12:34:54 UTC
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The minimum validity duration for a certificate using relative time (<code>DAYS</code>) is one day. The
     *        minimum validity for a certificate using absolute time (<code>ABSOLUTE</code> or <code>END_DATE</code>) is
     *        one second.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidityPeriodType
     */

    public Validity withType(ValidityPeriodType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Validity == false)
            return false;
        Validity other = (Validity) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Validity clone() {
        try {
            return (Validity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.ValidityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

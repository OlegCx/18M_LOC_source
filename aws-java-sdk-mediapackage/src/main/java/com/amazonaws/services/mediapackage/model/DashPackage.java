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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DashPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashPackage implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<String> adTriggers;

    private String adsOnDeliveryRestrictions;

    private DashEncryption encryption;
    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     */
    private String manifestLayout;
    /** Time window (in seconds) contained in each manifest. */
    private Integer manifestWindowSeconds;
    /** Minimum duration (in seconds) that a player will buffer media before starting the presentation. */
    private Integer minBufferTimeSeconds;
    /**
     * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media
     * Presentation Description (MPD).
     */
    private Integer minUpdatePeriodSeconds;
    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation
     * Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into
     * more than one period. If the list contains "ADS", new periods will be created where the Channel source contains
     * SCTE-35 ad markers.
     */
    private java.util.List<String> periodTriggers;
    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     */
    private String profile;
    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     */
    private Integer segmentDurationSeconds;
    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     * NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to
     * TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to
     * NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     */
    private String segmentTemplateFormat;

    private StreamSelection streamSelection;
    /** Duration (in seconds) to delay live content before presentation. */
    private Integer suggestedPresentationDelaySeconds;
    /** Determines the type of UTCTiming included in the Media Presentation Description (MPD) */
    private String utcTiming;
    /** Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD */
    private String utcTimingUri;

    /**
     * @return
     * @see AdTriggersElement
     */

    public java.util.List<String> getAdTriggers() {
        return adTriggers;
    }

    /**
     * @param adTriggers
     * @see AdTriggersElement
     */

    public void setAdTriggers(java.util.Collection<String> adTriggers) {
        if (adTriggers == null) {
            this.adTriggers = null;
            return;
        }

        this.adTriggers = new java.util.ArrayList<String>(adTriggers);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdTriggers(java.util.Collection)} or {@link #withAdTriggers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param adTriggers
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdTriggersElement
     */

    public DashPackage withAdTriggers(String... adTriggers) {
        if (this.adTriggers == null) {
            setAdTriggers(new java.util.ArrayList<String>(adTriggers.length));
        }
        for (String ele : adTriggers) {
            this.adTriggers.add(ele);
        }
        return this;
    }

    /**
     * @param adTriggers
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdTriggersElement
     */

    public DashPackage withAdTriggers(java.util.Collection<String> adTriggers) {
        setAdTriggers(adTriggers);
        return this;
    }

    /**
     * @param adTriggers
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdTriggersElement
     */

    public DashPackage withAdTriggers(AdTriggersElement... adTriggers) {
        java.util.ArrayList<String> adTriggersCopy = new java.util.ArrayList<String>(adTriggers.length);
        for (AdTriggersElement value : adTriggers) {
            adTriggersCopy.add(value.toString());
        }
        if (getAdTriggers() == null) {
            setAdTriggers(adTriggersCopy);
        } else {
            getAdTriggers().addAll(adTriggersCopy);
        }
        return this;
    }

    /**
     * @param adsOnDeliveryRestrictions
     * @see AdsOnDeliveryRestrictions
     */

    public void setAdsOnDeliveryRestrictions(String adsOnDeliveryRestrictions) {
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
    }

    /**
     * @return
     * @see AdsOnDeliveryRestrictions
     */

    public String getAdsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions;
    }

    /**
     * @param adsOnDeliveryRestrictions
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdsOnDeliveryRestrictions
     */

    public DashPackage withAdsOnDeliveryRestrictions(String adsOnDeliveryRestrictions) {
        setAdsOnDeliveryRestrictions(adsOnDeliveryRestrictions);
        return this;
    }

    /**
     * @param adsOnDeliveryRestrictions
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdsOnDeliveryRestrictions
     */

    public DashPackage withAdsOnDeliveryRestrictions(AdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions.toString();
        return this;
    }

    /**
     * @param encryption
     */

    public void setEncryption(DashEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return
     */

    public DashEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * @param encryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withEncryption(DashEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     * 
     * @param manifestLayout
     *        Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL,
     *        elements like SegmentTemplate and ContentProtection are included in each Representation. When set to
     *        COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * @see ManifestLayout
     */

    public void setManifestLayout(String manifestLayout) {
        this.manifestLayout = manifestLayout;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     * 
     * @return Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL,
     *         elements like SegmentTemplate and ContentProtection are included in each Representation. When set to
     *         COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * @see ManifestLayout
     */

    public String getManifestLayout() {
        return this.manifestLayout;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     * 
     * @param manifestLayout
     *        Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL,
     *        elements like SegmentTemplate and ContentProtection are included in each Representation. When set to
     *        COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestLayout
     */

    public DashPackage withManifestLayout(String manifestLayout) {
        setManifestLayout(manifestLayout);
        return this;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     * 
     * @param manifestLayout
     *        Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL,
     *        elements like SegmentTemplate and ContentProtection are included in each Representation. When set to
     *        COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestLayout
     */

    public DashPackage withManifestLayout(ManifestLayout manifestLayout) {
        this.manifestLayout = manifestLayout.toString();
        return this;
    }

    /**
     * Time window (in seconds) contained in each manifest.
     * 
     * @param manifestWindowSeconds
     *        Time window (in seconds) contained in each manifest.
     */

    public void setManifestWindowSeconds(Integer manifestWindowSeconds) {
        this.manifestWindowSeconds = manifestWindowSeconds;
    }

    /**
     * Time window (in seconds) contained in each manifest.
     * 
     * @return Time window (in seconds) contained in each manifest.
     */

    public Integer getManifestWindowSeconds() {
        return this.manifestWindowSeconds;
    }

    /**
     * Time window (in seconds) contained in each manifest.
     * 
     * @param manifestWindowSeconds
     *        Time window (in seconds) contained in each manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withManifestWindowSeconds(Integer manifestWindowSeconds) {
        setManifestWindowSeconds(manifestWindowSeconds);
        return this;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     * @param minBufferTimeSeconds
     *        Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     */

    public void setMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        this.minBufferTimeSeconds = minBufferTimeSeconds;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     * @return Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     */

    public Integer getMinBufferTimeSeconds() {
        return this.minBufferTimeSeconds;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     * @param minBufferTimeSeconds
     *        Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        setMinBufferTimeSeconds(minBufferTimeSeconds);
        return this;
    }

    /**
     * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media
     * Presentation Description (MPD).
     * 
     * @param minUpdatePeriodSeconds
     *        Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH)
     *        Media Presentation Description (MPD).
     */

    public void setMinUpdatePeriodSeconds(Integer minUpdatePeriodSeconds) {
        this.minUpdatePeriodSeconds = minUpdatePeriodSeconds;
    }

    /**
     * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media
     * Presentation Description (MPD).
     * 
     * @return Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP
     *         (DASH) Media Presentation Description (MPD).
     */

    public Integer getMinUpdatePeriodSeconds() {
        return this.minUpdatePeriodSeconds;
    }

    /**
     * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media
     * Presentation Description (MPD).
     * 
     * @param minUpdatePeriodSeconds
     *        Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH)
     *        Media Presentation Description (MPD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withMinUpdatePeriodSeconds(Integer minUpdatePeriodSeconds) {
        setMinUpdatePeriodSeconds(minUpdatePeriodSeconds);
        return this;
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation
     * Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into
     * more than one period. If the list contains "ADS", new periods will be created where the Channel source contains
     * SCTE-35 ad markers.
     * 
     * @return A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media
     *         Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
     *         be partitioned into more than one period. If the list contains "ADS", new periods will be created where
     *         the Channel source contains SCTE-35 ad markers.
     * @see PeriodTriggersElement
     */

    public java.util.List<String> getPeriodTriggers() {
        return periodTriggers;
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation
     * Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into
     * more than one period. If the list contains "ADS", new periods will be created where the Channel source contains
     * SCTE-35 ad markers.
     * 
     * @param periodTriggers
     *        A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media
     *        Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
     *        be partitioned into more than one period. If the list contains "ADS", new periods will be created where
     *        the Channel source contains SCTE-35 ad markers.
     * @see PeriodTriggersElement
     */

    public void setPeriodTriggers(java.util.Collection<String> periodTriggers) {
        if (periodTriggers == null) {
            this.periodTriggers = null;
            return;
        }

        this.periodTriggers = new java.util.ArrayList<String>(periodTriggers);
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation
     * Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into
     * more than one period. If the list contains "ADS", new periods will be created where the Channel source contains
     * SCTE-35 ad markers.
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPeriodTriggers(java.util.Collection)} or {@link #withPeriodTriggers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param periodTriggers
     *        A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media
     *        Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
     *        be partitioned into more than one period. If the list contains "ADS", new periods will be created where
     *        the Channel source contains SCTE-35 ad markers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodTriggersElement
     */

    public DashPackage withPeriodTriggers(String... periodTriggers) {
        if (this.periodTriggers == null) {
            setPeriodTriggers(new java.util.ArrayList<String>(periodTriggers.length));
        }
        for (String ele : periodTriggers) {
            this.periodTriggers.add(ele);
        }
        return this;
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation
     * Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into
     * more than one period. If the list contains "ADS", new periods will be created where the Channel source contains
     * SCTE-35 ad markers.
     * 
     * @param periodTriggers
     *        A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media
     *        Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
     *        be partitioned into more than one period. If the list contains "ADS", new periods will be created where
     *        the Channel source contains SCTE-35 ad markers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodTriggersElement
     */

    public DashPackage withPeriodTriggers(java.util.Collection<String> periodTriggers) {
        setPeriodTriggers(periodTriggers);
        return this;
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation
     * Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into
     * more than one period. If the list contains "ADS", new periods will be created where the Channel source contains
     * SCTE-35 ad markers.
     * 
     * @param periodTriggers
     *        A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media
     *        Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
     *        be partitioned into more than one period. If the list contains "ADS", new periods will be created where
     *        the Channel source contains SCTE-35 ad markers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodTriggersElement
     */

    public DashPackage withPeriodTriggers(PeriodTriggersElement... periodTriggers) {
        java.util.ArrayList<String> periodTriggersCopy = new java.util.ArrayList<String>(periodTriggers.length);
        for (PeriodTriggersElement value : periodTriggers) {
            periodTriggersCopy.add(value.toString());
        }
        if (getPeriodTriggers() == null) {
            setPeriodTriggers(periodTriggersCopy);
        } else {
            getPeriodTriggers().addAll(periodTriggersCopy);
        }
        return this;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     * 
     * @param profile
     *        The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant
     *        output is enabled.
     * @see Profile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     * 
     * @return The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5
     *         compliant output is enabled.
     * @see Profile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     * 
     * @param profile
     *        The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant
     *        output is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Profile
     */

    public DashPackage withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     * 
     * @param profile
     *        The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant
     *        output is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Profile
     */

    public DashPackage withProfile(Profile profile) {
        this.profile = profile.toString();
        return this;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the
     *        source segment duration.
     */

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     * 
     * @return Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the
     *         source segment duration.
     */

    public Integer getSegmentDurationSeconds() {
        return this.segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the
     *        source segment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        setSegmentDurationSeconds(segmentDurationSeconds);
        return this;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     * NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to
     * TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to
     * NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     * @param segmentTemplateFormat
     *        Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     *        NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When
     *        set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs.
     *        When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media
     *        URLs.
     * @see SegmentTemplateFormat
     */

    public void setSegmentTemplateFormat(String segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     * NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to
     * TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to
     * NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     * @return Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     *         NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.
     *         When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media
     *         URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with
     *         $Number$ media URLs.
     * @see SegmentTemplateFormat
     */

    public String getSegmentTemplateFormat() {
        return this.segmentTemplateFormat;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     * NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to
     * TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to
     * NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     * @param segmentTemplateFormat
     *        Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     *        NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When
     *        set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs.
     *        When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media
     *        URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentTemplateFormat
     */

    public DashPackage withSegmentTemplateFormat(String segmentTemplateFormat) {
        setSegmentTemplateFormat(segmentTemplateFormat);
        return this;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     * NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to
     * TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to
     * NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     * @param segmentTemplateFormat
     *        Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to
     *        NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When
     *        set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs.
     *        When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media
     *        URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentTemplateFormat
     */

    public DashPackage withSegmentTemplateFormat(SegmentTemplateFormat segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat.toString();
        return this;
    }

    /**
     * @param streamSelection
     */

    public void setStreamSelection(StreamSelection streamSelection) {
        this.streamSelection = streamSelection;
    }

    /**
     * @return
     */

    public StreamSelection getStreamSelection() {
        return this.streamSelection;
    }

    /**
     * @param streamSelection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withStreamSelection(StreamSelection streamSelection) {
        setStreamSelection(streamSelection);
        return this;
    }

    /**
     * Duration (in seconds) to delay live content before presentation.
     * 
     * @param suggestedPresentationDelaySeconds
     *        Duration (in seconds) to delay live content before presentation.
     */

    public void setSuggestedPresentationDelaySeconds(Integer suggestedPresentationDelaySeconds) {
        this.suggestedPresentationDelaySeconds = suggestedPresentationDelaySeconds;
    }

    /**
     * Duration (in seconds) to delay live content before presentation.
     * 
     * @return Duration (in seconds) to delay live content before presentation.
     */

    public Integer getSuggestedPresentationDelaySeconds() {
        return this.suggestedPresentationDelaySeconds;
    }

    /**
     * Duration (in seconds) to delay live content before presentation.
     * 
     * @param suggestedPresentationDelaySeconds
     *        Duration (in seconds) to delay live content before presentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withSuggestedPresentationDelaySeconds(Integer suggestedPresentationDelaySeconds) {
        setSuggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds);
        return this;
    }

    /**
     * Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * 
     * @param utcTiming
     *        Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * @see UtcTiming
     */

    public void setUtcTiming(String utcTiming) {
        this.utcTiming = utcTiming;
    }

    /**
     * Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * 
     * @return Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * @see UtcTiming
     */

    public String getUtcTiming() {
        return this.utcTiming;
    }

    /**
     * Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * 
     * @param utcTiming
     *        Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UtcTiming
     */

    public DashPackage withUtcTiming(String utcTiming) {
        setUtcTiming(utcTiming);
        return this;
    }

    /**
     * Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * 
     * @param utcTiming
     *        Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UtcTiming
     */

    public DashPackage withUtcTiming(UtcTiming utcTiming) {
        this.utcTiming = utcTiming.toString();
        return this;
    }

    /**
     * Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
     * 
     * @param utcTimingUri
     *        Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
     */

    public void setUtcTimingUri(String utcTimingUri) {
        this.utcTimingUri = utcTimingUri;
    }

    /**
     * Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
     * 
     * @return Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
     */

    public String getUtcTimingUri() {
        return this.utcTimingUri;
    }

    /**
     * Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
     * 
     * @param utcTimingUri
     *        Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withUtcTimingUri(String utcTimingUri) {
        setUtcTimingUri(utcTimingUri);
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
        if (getAdTriggers() != null)
            sb.append("AdTriggers: ").append(getAdTriggers()).append(",");
        if (getAdsOnDeliveryRestrictions() != null)
            sb.append("AdsOnDeliveryRestrictions: ").append(getAdsOnDeliveryRestrictions()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getManifestLayout() != null)
            sb.append("ManifestLayout: ").append(getManifestLayout()).append(",");
        if (getManifestWindowSeconds() != null)
            sb.append("ManifestWindowSeconds: ").append(getManifestWindowSeconds()).append(",");
        if (getMinBufferTimeSeconds() != null)
            sb.append("MinBufferTimeSeconds: ").append(getMinBufferTimeSeconds()).append(",");
        if (getMinUpdatePeriodSeconds() != null)
            sb.append("MinUpdatePeriodSeconds: ").append(getMinUpdatePeriodSeconds()).append(",");
        if (getPeriodTriggers() != null)
            sb.append("PeriodTriggers: ").append(getPeriodTriggers()).append(",");
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile()).append(",");
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: ").append(getSegmentDurationSeconds()).append(",");
        if (getSegmentTemplateFormat() != null)
            sb.append("SegmentTemplateFormat: ").append(getSegmentTemplateFormat()).append(",");
        if (getStreamSelection() != null)
            sb.append("StreamSelection: ").append(getStreamSelection()).append(",");
        if (getSuggestedPresentationDelaySeconds() != null)
            sb.append("SuggestedPresentationDelaySeconds: ").append(getSuggestedPresentationDelaySeconds()).append(",");
        if (getUtcTiming() != null)
            sb.append("UtcTiming: ").append(getUtcTiming()).append(",");
        if (getUtcTimingUri() != null)
            sb.append("UtcTimingUri: ").append(getUtcTimingUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashPackage == false)
            return false;
        DashPackage other = (DashPackage) obj;
        if (other.getAdTriggers() == null ^ this.getAdTriggers() == null)
            return false;
        if (other.getAdTriggers() != null && other.getAdTriggers().equals(this.getAdTriggers()) == false)
            return false;
        if (other.getAdsOnDeliveryRestrictions() == null ^ this.getAdsOnDeliveryRestrictions() == null)
            return false;
        if (other.getAdsOnDeliveryRestrictions() != null && other.getAdsOnDeliveryRestrictions().equals(this.getAdsOnDeliveryRestrictions()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getManifestLayout() == null ^ this.getManifestLayout() == null)
            return false;
        if (other.getManifestLayout() != null && other.getManifestLayout().equals(this.getManifestLayout()) == false)
            return false;
        if (other.getManifestWindowSeconds() == null ^ this.getManifestWindowSeconds() == null)
            return false;
        if (other.getManifestWindowSeconds() != null && other.getManifestWindowSeconds().equals(this.getManifestWindowSeconds()) == false)
            return false;
        if (other.getMinBufferTimeSeconds() == null ^ this.getMinBufferTimeSeconds() == null)
            return false;
        if (other.getMinBufferTimeSeconds() != null && other.getMinBufferTimeSeconds().equals(this.getMinBufferTimeSeconds()) == false)
            return false;
        if (other.getMinUpdatePeriodSeconds() == null ^ this.getMinUpdatePeriodSeconds() == null)
            return false;
        if (other.getMinUpdatePeriodSeconds() != null && other.getMinUpdatePeriodSeconds().equals(this.getMinUpdatePeriodSeconds()) == false)
            return false;
        if (other.getPeriodTriggers() == null ^ this.getPeriodTriggers() == null)
            return false;
        if (other.getPeriodTriggers() != null && other.getPeriodTriggers().equals(this.getPeriodTriggers()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null)
            return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false)
            return false;
        if (other.getSegmentTemplateFormat() == null ^ this.getSegmentTemplateFormat() == null)
            return false;
        if (other.getSegmentTemplateFormat() != null && other.getSegmentTemplateFormat().equals(this.getSegmentTemplateFormat()) == false)
            return false;
        if (other.getStreamSelection() == null ^ this.getStreamSelection() == null)
            return false;
        if (other.getStreamSelection() != null && other.getStreamSelection().equals(this.getStreamSelection()) == false)
            return false;
        if (other.getSuggestedPresentationDelaySeconds() == null ^ this.getSuggestedPresentationDelaySeconds() == null)
            return false;
        if (other.getSuggestedPresentationDelaySeconds() != null
                && other.getSuggestedPresentationDelaySeconds().equals(this.getSuggestedPresentationDelaySeconds()) == false)
            return false;
        if (other.getUtcTiming() == null ^ this.getUtcTiming() == null)
            return false;
        if (other.getUtcTiming() != null && other.getUtcTiming().equals(this.getUtcTiming()) == false)
            return false;
        if (other.getUtcTimingUri() == null ^ this.getUtcTimingUri() == null)
            return false;
        if (other.getUtcTimingUri() != null && other.getUtcTimingUri().equals(this.getUtcTimingUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdTriggers() == null) ? 0 : getAdTriggers().hashCode());
        hashCode = prime * hashCode + ((getAdsOnDeliveryRestrictions() == null) ? 0 : getAdsOnDeliveryRestrictions().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getManifestLayout() == null) ? 0 : getManifestLayout().hashCode());
        hashCode = prime * hashCode + ((getManifestWindowSeconds() == null) ? 0 : getManifestWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getMinBufferTimeSeconds() == null) ? 0 : getMinBufferTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getMinUpdatePeriodSeconds() == null) ? 0 : getMinUpdatePeriodSeconds().hashCode());
        hashCode = prime * hashCode + ((getPeriodTriggers() == null) ? 0 : getPeriodTriggers().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getSegmentTemplateFormat() == null) ? 0 : getSegmentTemplateFormat().hashCode());
        hashCode = prime * hashCode + ((getStreamSelection() == null) ? 0 : getStreamSelection().hashCode());
        hashCode = prime * hashCode + ((getSuggestedPresentationDelaySeconds() == null) ? 0 : getSuggestedPresentationDelaySeconds().hashCode());
        hashCode = prime * hashCode + ((getUtcTiming() == null) ? 0 : getUtcTiming().hashCode());
        hashCode = prime * hashCode + ((getUtcTimingUri() == null) ? 0 : getUtcTimingUri().hashCode());
        return hashCode;
    }

    @Override
    public DashPackage clone() {
        try {
            return (DashPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.DashPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of captions
 * DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab corresponds to one
 * output captions track. Depending on your output captions format, one tab might correspond to a set of output captions
 * tracks. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CaptionDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Settings related to burn-in captions. Set up burn-in captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to BURN_IN.
     */
    private BurninDestinationSettings burninDestinationSettings;
    /**
     * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Note
     * that your choice of video output container constrains your choice of output captions format. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html. If you are using
     * SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions come first, choose Embedded
     * plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     */
    private String destinationType;
    /**
     * Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to DVB_SUB.
     */
    private DvbSubDestinationSettings dvbSubDestinationSettings;
    /**
     * Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up embedded
     * captions in the same output as your video. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly in your
     * JSON job specification, include this object and any required children when you set destinationType to EMBEDDED,
     * EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
     */
    private EmbeddedDestinationSettings embeddedDestinationSettings;
    /**
     * Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate from
     * the video container. Set up sidecar captions in the same output group, but different output from your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html.
     * When you work directly in your JSON job specification, include this object and any required children when you set
     * destinationType to IMSC.
     */
    private ImscDestinationSettings imscDestinationSettings;
    /**
     * Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate from the
     * video container. Set up sidecar captions in the same output group, but different output from your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to SCC.
     */
    private SccDestinationSettings sccDestinationSettings;
    /**
     * Settings related to teletext captions. Set up teletext captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to TELETEXT.
     */
    private TeletextDestinationSettings teletextDestinationSettings;
    /**
     * Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate from
     * the video container. Set up sidecar captions in the same output group, but different output from your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html.
     * When you work directly in your JSON job specification, include this object and any required children when you set
     * destinationType to TTML.
     */
    private TtmlDestinationSettings ttmlDestinationSettings;
    /** WEBVTT Destination Settings */
    private WebvttDestinationSettings webvttDestinationSettings;

    /**
     * Settings related to burn-in captions. Set up burn-in captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to BURN_IN.
     * 
     * @param burninDestinationSettings
     *        Settings related to burn-in captions. Set up burn-in captions in the same output as your video. For more
     *        information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you
     *        work directly in your JSON job specification, include this object and any required children when you set
     *        destinationType to BURN_IN.
     */

    public void setBurninDestinationSettings(BurninDestinationSettings burninDestinationSettings) {
        this.burninDestinationSettings = burninDestinationSettings;
    }

    /**
     * Settings related to burn-in captions. Set up burn-in captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to BURN_IN.
     * 
     * @return Settings related to burn-in captions. Set up burn-in captions in the same output as your video. For more
     *         information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When
     *         you work directly in your JSON job specification, include this object and any required children when you
     *         set destinationType to BURN_IN.
     */

    public BurninDestinationSettings getBurninDestinationSettings() {
        return this.burninDestinationSettings;
    }

    /**
     * Settings related to burn-in captions. Set up burn-in captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to BURN_IN.
     * 
     * @param burninDestinationSettings
     *        Settings related to burn-in captions. Set up burn-in captions in the same output as your video. For more
     *        information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you
     *        work directly in your JSON job specification, include this object and any required children when you set
     *        destinationType to BURN_IN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withBurninDestinationSettings(BurninDestinationSettings burninDestinationSettings) {
        setBurninDestinationSettings(burninDestinationSettings);
        return this;
    }

    /**
     * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Note
     * that your choice of video output container constrains your choice of output captions format. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html. If you are using
     * SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions come first, choose Embedded
     * plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * 
     * @param destinationType
     *        Specify the format for this set of captions on this output. The default format is embedded without
     *        SCTE-20. Note that your choice of video output container constrains your choice of output captions format.
     *        For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html.
     *        If you are using SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose
     *        SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions
     *        come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @see CaptionDestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Note
     * that your choice of video output container constrains your choice of output captions format. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html. If you are using
     * SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions come first, choose Embedded
     * plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * 
     * @return Specify the format for this set of captions on this output. The default format is embedded without
     *         SCTE-20. Note that your choice of video output container constrains your choice of output captions
     *         format. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html. If you are using SCTE-20
     *         and you want to create an output that complies with the SCTE-43 spec, choose SCTE-20 plus embedded
     *         (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions come first, choose
     *         Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @see CaptionDestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Note
     * that your choice of video output container constrains your choice of output captions format. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html. If you are using
     * SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions come first, choose Embedded
     * plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * 
     * @param destinationType
     *        Specify the format for this set of captions on this output. The default format is embedded without
     *        SCTE-20. Note that your choice of video output container constrains your choice of output captions format.
     *        For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html.
     *        If you are using SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose
     *        SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions
     *        come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptionDestinationType
     */

    public CaptionDestinationSettings withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Note
     * that your choice of video output container constrains your choice of output captions format. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html. If you are using
     * SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions come first, choose Embedded
     * plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * 
     * @param destinationType
     *        Specify the format for this set of captions on this output. The default format is embedded without
     *        SCTE-20. Note that your choice of video output container constrains your choice of output captions format.
     *        For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html.
     *        If you are using SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose
     *        SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions
     *        come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptionDestinationType
     */

    public CaptionDestinationSettings withDestinationType(CaptionDestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to DVB_SUB.
     * 
     * @param dvbSubDestinationSettings
     *        Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more
     *        information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you
     *        work directly in your JSON job specification, include this object and any required children when you set
     *        destinationType to DVB_SUB.
     */

    public void setDvbSubDestinationSettings(DvbSubDestinationSettings dvbSubDestinationSettings) {
        this.dvbSubDestinationSettings = dvbSubDestinationSettings;
    }

    /**
     * Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to DVB_SUB.
     * 
     * @return Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more
     *         information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When
     *         you work directly in your JSON job specification, include this object and any required children when you
     *         set destinationType to DVB_SUB.
     */

    public DvbSubDestinationSettings getDvbSubDestinationSettings() {
        return this.dvbSubDestinationSettings;
    }

    /**
     * Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to DVB_SUB.
     * 
     * @param dvbSubDestinationSettings
     *        Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more
     *        information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you
     *        work directly in your JSON job specification, include this object and any required children when you set
     *        destinationType to DVB_SUB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withDvbSubDestinationSettings(DvbSubDestinationSettings dvbSubDestinationSettings) {
        setDvbSubDestinationSettings(dvbSubDestinationSettings);
        return this;
    }

    /**
     * Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up embedded
     * captions in the same output as your video. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly in your
     * JSON job specification, include this object and any required children when you set destinationType to EMBEDDED,
     * EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
     * 
     * @param embeddedDestinationSettings
     *        Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up
     *        embedded captions in the same output as your video. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly
     *        in your JSON job specification, include this object and any required children when you set destinationType
     *        to EMBEDDED, EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
     */

    public void setEmbeddedDestinationSettings(EmbeddedDestinationSettings embeddedDestinationSettings) {
        this.embeddedDestinationSettings = embeddedDestinationSettings;
    }

    /**
     * Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up embedded
     * captions in the same output as your video. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly in your
     * JSON job specification, include this object and any required children when you set destinationType to EMBEDDED,
     * EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
     * 
     * @return Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up
     *         embedded captions in the same output as your video. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly
     *         in your JSON job specification, include this object and any required children when you set
     *         destinationType to EMBEDDED, EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
     */

    public EmbeddedDestinationSettings getEmbeddedDestinationSettings() {
        return this.embeddedDestinationSettings;
    }

    /**
     * Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up embedded
     * captions in the same output as your video. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly in your
     * JSON job specification, include this object and any required children when you set destinationType to EMBEDDED,
     * EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
     * 
     * @param embeddedDestinationSettings
     *        Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up
     *        embedded captions in the same output as your video. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly
     *        in your JSON job specification, include this object and any required children when you set destinationType
     *        to EMBEDDED, EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withEmbeddedDestinationSettings(EmbeddedDestinationSettings embeddedDestinationSettings) {
        setEmbeddedDestinationSettings(embeddedDestinationSettings);
        return this;
    }

    /**
     * Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate from
     * the video container. Set up sidecar captions in the same output group, but different output from your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html.
     * When you work directly in your JSON job specification, include this object and any required children when you set
     * destinationType to IMSC.
     * 
     * @param imscDestinationSettings
     *        Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate
     *        from the video container. Set up sidecar captions in the same output group, but different output from your
     *        video. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work
     *        directly in your JSON job specification, include this object and any required children when you set
     *        destinationType to IMSC.
     */

    public void setImscDestinationSettings(ImscDestinationSettings imscDestinationSettings) {
        this.imscDestinationSettings = imscDestinationSettings;
    }

    /**
     * Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate from
     * the video container. Set up sidecar captions in the same output group, but different output from your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html.
     * When you work directly in your JSON job specification, include this object and any required children when you set
     * destinationType to IMSC.
     * 
     * @return Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is
     *         separate from the video container. Set up sidecar captions in the same output group, but different output
     *         from your video. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work
     *         directly in your JSON job specification, include this object and any required children when you set
     *         destinationType to IMSC.
     */

    public ImscDestinationSettings getImscDestinationSettings() {
        return this.imscDestinationSettings;
    }

    /**
     * Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate from
     * the video container. Set up sidecar captions in the same output group, but different output from your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html.
     * When you work directly in your JSON job specification, include this object and any required children when you set
     * destinationType to IMSC.
     * 
     * @param imscDestinationSettings
     *        Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate
     *        from the video container. Set up sidecar captions in the same output group, but different output from your
     *        video. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work
     *        directly in your JSON job specification, include this object and any required children when you set
     *        destinationType to IMSC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withImscDestinationSettings(ImscDestinationSettings imscDestinationSettings) {
        setImscDestinationSettings(imscDestinationSettings);
        return this;
    }

    /**
     * Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate from the
     * video container. Set up sidecar captions in the same output group, but different output from your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to SCC.
     * 
     * @param sccDestinationSettings
     *        Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate
     *        from the video container. Set up sidecar captions in the same output group, but different output from your
     *        video. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work directly in
     *        your JSON job specification, include this object and any required children when you set destinationType to
     *        SCC.
     */

    public void setSccDestinationSettings(SccDestinationSettings sccDestinationSettings) {
        this.sccDestinationSettings = sccDestinationSettings;
    }

    /**
     * Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate from the
     * video container. Set up sidecar captions in the same output group, but different output from your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to SCC.
     * 
     * @return Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate
     *         from the video container. Set up sidecar captions in the same output group, but different output from
     *         your video. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work directly
     *         in your JSON job specification, include this object and any required children when you set
     *         destinationType to SCC.
     */

    public SccDestinationSettings getSccDestinationSettings() {
        return this.sccDestinationSettings;
    }

    /**
     * Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate from the
     * video container. Set up sidecar captions in the same output group, but different output from your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to SCC.
     * 
     * @param sccDestinationSettings
     *        Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate
     *        from the video container. Set up sidecar captions in the same output group, but different output from your
     *        video. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work directly in
     *        your JSON job specification, include this object and any required children when you set destinationType to
     *        SCC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withSccDestinationSettings(SccDestinationSettings sccDestinationSettings) {
        setSccDestinationSettings(sccDestinationSettings);
        return this;
    }

    /**
     * Settings related to teletext captions. Set up teletext captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to TELETEXT.
     * 
     * @param teletextDestinationSettings
     *        Settings related to teletext captions. Set up teletext captions in the same output as your video. For more
     *        information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When
     *        you work directly in your JSON job specification, include this object and any required children when you
     *        set destinationType to TELETEXT.
     */

    public void setTeletextDestinationSettings(TeletextDestinationSettings teletextDestinationSettings) {
        this.teletextDestinationSettings = teletextDestinationSettings;
    }

    /**
     * Settings related to teletext captions. Set up teletext captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to TELETEXT.
     * 
     * @return Settings related to teletext captions. Set up teletext captions in the same output as your video. For
     *         more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html.
     *         When you work directly in your JSON job specification, include this object and any required children when
     *         you set destinationType to TELETEXT.
     */

    public TeletextDestinationSettings getTeletextDestinationSettings() {
        return this.teletextDestinationSettings;
    }

    /**
     * Settings related to teletext captions. Set up teletext captions in the same output as your video. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When you work
     * directly in your JSON job specification, include this object and any required children when you set
     * destinationType to TELETEXT.
     * 
     * @param teletextDestinationSettings
     *        Settings related to teletext captions. Set up teletext captions in the same output as your video. For more
     *        information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When
     *        you work directly in your JSON job specification, include this object and any required children when you
     *        set destinationType to TELETEXT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withTeletextDestinationSettings(TeletextDestinationSettings teletextDestinationSettings) {
        setTeletextDestinationSettings(teletextDestinationSettings);
        return this;
    }

    /**
     * Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate from
     * the video container. Set up sidecar captions in the same output group, but different output from your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html.
     * When you work directly in your JSON job specification, include this object and any required children when you set
     * destinationType to TTML.
     * 
     * @param ttmlDestinationSettings
     *        Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate
     *        from the video container. Set up sidecar captions in the same output group, but different output from your
     *        video. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work
     *        directly in your JSON job specification, include this object and any required children when you set
     *        destinationType to TTML.
     */

    public void setTtmlDestinationSettings(TtmlDestinationSettings ttmlDestinationSettings) {
        this.ttmlDestinationSettings = ttmlDestinationSettings;
    }

    /**
     * Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate from
     * the video container. Set up sidecar captions in the same output group, but different output from your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html.
     * When you work directly in your JSON job specification, include this object and any required children when you set
     * destinationType to TTML.
     * 
     * @return Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is
     *         separate from the video container. Set up sidecar captions in the same output group, but different output
     *         from your video. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work
     *         directly in your JSON job specification, include this object and any required children when you set
     *         destinationType to TTML.
     */

    public TtmlDestinationSettings getTtmlDestinationSettings() {
        return this.ttmlDestinationSettings;
    }

    /**
     * Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate from
     * the video container. Set up sidecar captions in the same output group, but different output from your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html.
     * When you work directly in your JSON job specification, include this object and any required children when you set
     * destinationType to TTML.
     * 
     * @param ttmlDestinationSettings
     *        Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate
     *        from the video container. Set up sidecar captions in the same output group, but different output from your
     *        video. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work
     *        directly in your JSON job specification, include this object and any required children when you set
     *        destinationType to TTML.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withTtmlDestinationSettings(TtmlDestinationSettings ttmlDestinationSettings) {
        setTtmlDestinationSettings(ttmlDestinationSettings);
        return this;
    }

    /**
     * WEBVTT Destination Settings
     * 
     * @param webvttDestinationSettings
     *        WEBVTT Destination Settings
     */

    public void setWebvttDestinationSettings(WebvttDestinationSettings webvttDestinationSettings) {
        this.webvttDestinationSettings = webvttDestinationSettings;
    }

    /**
     * WEBVTT Destination Settings
     * 
     * @return WEBVTT Destination Settings
     */

    public WebvttDestinationSettings getWebvttDestinationSettings() {
        return this.webvttDestinationSettings;
    }

    /**
     * WEBVTT Destination Settings
     * 
     * @param webvttDestinationSettings
     *        WEBVTT Destination Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withWebvttDestinationSettings(WebvttDestinationSettings webvttDestinationSettings) {
        setWebvttDestinationSettings(webvttDestinationSettings);
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
        if (getBurninDestinationSettings() != null)
            sb.append("BurninDestinationSettings: ").append(getBurninDestinationSettings()).append(",");
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getDvbSubDestinationSettings() != null)
            sb.append("DvbSubDestinationSettings: ").append(getDvbSubDestinationSettings()).append(",");
        if (getEmbeddedDestinationSettings() != null)
            sb.append("EmbeddedDestinationSettings: ").append(getEmbeddedDestinationSettings()).append(",");
        if (getImscDestinationSettings() != null)
            sb.append("ImscDestinationSettings: ").append(getImscDestinationSettings()).append(",");
        if (getSccDestinationSettings() != null)
            sb.append("SccDestinationSettings: ").append(getSccDestinationSettings()).append(",");
        if (getTeletextDestinationSettings() != null)
            sb.append("TeletextDestinationSettings: ").append(getTeletextDestinationSettings()).append(",");
        if (getTtmlDestinationSettings() != null)
            sb.append("TtmlDestinationSettings: ").append(getTtmlDestinationSettings()).append(",");
        if (getWebvttDestinationSettings() != null)
            sb.append("WebvttDestinationSettings: ").append(getWebvttDestinationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionDestinationSettings == false)
            return false;
        CaptionDestinationSettings other = (CaptionDestinationSettings) obj;
        if (other.getBurninDestinationSettings() == null ^ this.getBurninDestinationSettings() == null)
            return false;
        if (other.getBurninDestinationSettings() != null && other.getBurninDestinationSettings().equals(this.getBurninDestinationSettings()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getDvbSubDestinationSettings() == null ^ this.getDvbSubDestinationSettings() == null)
            return false;
        if (other.getDvbSubDestinationSettings() != null && other.getDvbSubDestinationSettings().equals(this.getDvbSubDestinationSettings()) == false)
            return false;
        if (other.getEmbeddedDestinationSettings() == null ^ this.getEmbeddedDestinationSettings() == null)
            return false;
        if (other.getEmbeddedDestinationSettings() != null && other.getEmbeddedDestinationSettings().equals(this.getEmbeddedDestinationSettings()) == false)
            return false;
        if (other.getImscDestinationSettings() == null ^ this.getImscDestinationSettings() == null)
            return false;
        if (other.getImscDestinationSettings() != null && other.getImscDestinationSettings().equals(this.getImscDestinationSettings()) == false)
            return false;
        if (other.getSccDestinationSettings() == null ^ this.getSccDestinationSettings() == null)
            return false;
        if (other.getSccDestinationSettings() != null && other.getSccDestinationSettings().equals(this.getSccDestinationSettings()) == false)
            return false;
        if (other.getTeletextDestinationSettings() == null ^ this.getTeletextDestinationSettings() == null)
            return false;
        if (other.getTeletextDestinationSettings() != null && other.getTeletextDestinationSettings().equals(this.getTeletextDestinationSettings()) == false)
            return false;
        if (other.getTtmlDestinationSettings() == null ^ this.getTtmlDestinationSettings() == null)
            return false;
        if (other.getTtmlDestinationSettings() != null && other.getTtmlDestinationSettings().equals(this.getTtmlDestinationSettings()) == false)
            return false;
        if (other.getWebvttDestinationSettings() == null ^ this.getWebvttDestinationSettings() == null)
            return false;
        if (other.getWebvttDestinationSettings() != null && other.getWebvttDestinationSettings().equals(this.getWebvttDestinationSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBurninDestinationSettings() == null) ? 0 : getBurninDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getDvbSubDestinationSettings() == null) ? 0 : getDvbSubDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEmbeddedDestinationSettings() == null) ? 0 : getEmbeddedDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getImscDestinationSettings() == null) ? 0 : getImscDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getSccDestinationSettings() == null) ? 0 : getSccDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getTeletextDestinationSettings() == null) ? 0 : getTeletextDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getTtmlDestinationSettings() == null) ? 0 : getTtmlDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getWebvttDestinationSettings() == null) ? 0 : getWebvttDestinationSettings().hashCode());
        return hashCode;
    }

    @Override
    public CaptionDestinationSettings clone() {
        try {
            return (CaptionDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CaptionDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

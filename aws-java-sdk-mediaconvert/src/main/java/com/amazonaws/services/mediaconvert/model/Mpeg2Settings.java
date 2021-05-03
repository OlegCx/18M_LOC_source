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
 * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Mpeg2Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mpeg2Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies
     * to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive
     * quantization (temporalAdaptiveQuantization).
     */
    private String adaptiveQuantization;
    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be
     * unique when rounded down to the nearest multiple of 1000.
     */
    private Integer bitrate;
    /** Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output. */
    private String codecLevel;
    /** Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output. */
    private String codecProfile;
    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     */
    private String dynamicSubGop;
    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     */
    private String framerateControl;
    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     */
    private String framerateConversionAlgorithm;
    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     */
    private Integer framerateDenominator;
    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this
     * example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame
     * rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     */
    private Integer framerateNumerator;
    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     */
    private Integer gopClosedCadence;
    /** GOP Length (keyframe interval) in frames or seconds. Must be greater than zero. */
    private Double gopSize;
    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     */
    private String gopSizeUnits;
    /** Percentage of the buffer that should initially be filled (HRD buffer model). */
    private Integer hrdBufferInitialFillPercentage;
    /** Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000. */
    private Integer hrdBufferSize;
    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     */
    private String interlaceMode;
    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If
     * you choose the value auto, the service will automatically select the precision based on the per-frame compression
     * ratio.
     */
    private String intraDcPrecision;
    /** Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. */
    private Integer maxBitrate;
    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     */
    private Integer minIInterval;
    /** Number of B-frames between reference frames. */
    private Integer numberBFramesBetweenReferenceFrames;
    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     */
    private String parControl;
    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parDenominator is 33.
     */
    private Integer parDenominator;
    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parNumerator is 40.
     */
    private Integer parNumerator;
    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     */
    private String qualityTuningLevel;
    /** Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant (cbr). */
    private String rateControlMode;
    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     */
    private String scanTypeConversionMode;
    /**
     * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves
     * video quality and is enabled by default.
     */
    private String sceneChangeDetect;
    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     */
    private String slowPal;
    /**
     * Ignore this setting unless you need to comply with a specification that requires a specific value. If you don't
     * have a specification requirement, we recommend that you adjust the softness of your output by using a lower value
     * for the setting Sharpness (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness
     * (softness) setting specifies the quantization matrices that the encoder uses. Keep the default value, 0, to use
     * the AWS Elemental default matrices. Choose a value from 17 to 128 to use planar interpolation. Increasing values
     * from 17 to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
     */
    private Integer softness;
    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of
     * content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     * distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be
     * noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are
     * encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that
     * this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be
     * focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this
     * feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization
     * (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set
     * it to Low. For content with a wider variety of textures, set it to High or Higher.
     */
    private String spatialAdaptiveQuantization;
    /**
     * Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax. Related
     * settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value to to D10
     * (D_10).
     */
    private String syntax;
    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD)
     * produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video
     * player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert
     * does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother
     * picture.
     */
    private String telecine;
    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation
     * of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that
     * aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     * improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature
     * will almost always improve your video quality. Note, though, that this feature doesn't take into account where the
     * viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen
     * that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable
     * this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the
     * setting Adaptive quantization (adaptiveQuantization).
     */
    private String temporalAdaptiveQuantization;

    /**
     * Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies
     * to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive
     * quantization (temporalAdaptiveQuantization).
     * 
     * @param adaptiveQuantization
     *        Specify the strength of any adaptive quantization filters that you enable. The value that you choose here
     *        applies to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and
     *        Temporal adaptive quantization (temporalAdaptiveQuantization).
     * @see Mpeg2AdaptiveQuantization
     */

    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies
     * to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive
     * quantization (temporalAdaptiveQuantization).
     * 
     * @return Specify the strength of any adaptive quantization filters that you enable. The value that you choose here
     *         applies to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and
     *         Temporal adaptive quantization (temporalAdaptiveQuantization).
     * @see Mpeg2AdaptiveQuantization
     */

    public String getAdaptiveQuantization() {
        return this.adaptiveQuantization;
    }

    /**
     * Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies
     * to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive
     * quantization (temporalAdaptiveQuantization).
     * 
     * @param adaptiveQuantization
     *        Specify the strength of any adaptive quantization filters that you enable. The value that you choose here
     *        applies to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and
     *        Temporal adaptive quantization (temporalAdaptiveQuantization).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2AdaptiveQuantization
     */

    public Mpeg2Settings withAdaptiveQuantization(String adaptiveQuantization) {
        setAdaptiveQuantization(adaptiveQuantization);
        return this;
    }

    /**
     * Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies
     * to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive
     * quantization (temporalAdaptiveQuantization).
     * 
     * @param adaptiveQuantization
     *        Specify the strength of any adaptive quantization filters that you enable. The value that you choose here
     *        applies to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and
     *        Temporal adaptive quantization (temporalAdaptiveQuantization).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2AdaptiveQuantization
     */

    public Mpeg2Settings withAdaptiveQuantization(Mpeg2AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
        return this;
    }

    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be
     * unique when rounded down to the nearest multiple of 1000.
     * 
     * @param bitrate
     *        Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates
     *        must be unique when rounded down to the nearest multiple of 1000.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be
     * unique when rounded down to the nearest multiple of 1000.
     * 
     * @return Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates
     *         must be unique when rounded down to the nearest multiple of 1000.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be
     * unique when rounded down to the nearest multiple of 1000.
     * 
     * @param bitrate
     *        Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates
     *        must be unique when rounded down to the nearest multiple of 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * 
     * @param codecLevel
     *        Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * @see Mpeg2CodecLevel
     */

    public void setCodecLevel(String codecLevel) {
        this.codecLevel = codecLevel;
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * 
     * @return Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * @see Mpeg2CodecLevel
     */

    public String getCodecLevel() {
        return this.codecLevel;
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * 
     * @param codecLevel
     *        Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2CodecLevel
     */

    public Mpeg2Settings withCodecLevel(String codecLevel) {
        setCodecLevel(codecLevel);
        return this;
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * 
     * @param codecLevel
     *        Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2CodecLevel
     */

    public Mpeg2Settings withCodecLevel(Mpeg2CodecLevel codecLevel) {
        this.codecLevel = codecLevel.toString();
        return this;
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
     * 
     * @param codecProfile
     *        Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
     * @see Mpeg2CodecProfile
     */

    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
     * 
     * @return Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
     * @see Mpeg2CodecProfile
     */

    public String getCodecProfile() {
        return this.codecProfile;
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
     * 
     * @param codecProfile
     *        Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2CodecProfile
     */

    public Mpeg2Settings withCodecProfile(String codecProfile) {
        setCodecProfile(codecProfile);
        return this;
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
     * 
     * @param codecProfile
     *        Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2CodecProfile
     */

    public Mpeg2Settings withCodecProfile(Mpeg2CodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
        return this;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * 
     * @param dynamicSubGop
     *        Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service
     *        to use fewer B-frames (which infer information based on other frames) for high-motion portions of the
     *        video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value
     *        you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * @see Mpeg2DynamicSubGop
     */

    public void setDynamicSubGop(String dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * 
     * @return Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service
     *         to use fewer B-frames (which infer information based on other frames) for high-motion portions of the
     *         video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value
     *         you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * @see Mpeg2DynamicSubGop
     */

    public String getDynamicSubGop() {
        return this.dynamicSubGop;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * 
     * @param dynamicSubGop
     *        Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service
     *        to use fewer B-frames (which infer information based on other frames) for high-motion portions of the
     *        video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value
     *        you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2DynamicSubGop
     */

    public Mpeg2Settings withDynamicSubGop(String dynamicSubGop) {
        setDynamicSubGop(dynamicSubGop);
        return this;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * 
     * @param dynamicSubGop
     *        Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service
     *        to use fewer B-frames (which infer information based on other frames) for high-motion portions of the
     *        video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value
     *        you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2DynamicSubGop
     */

    public Mpeg2Settings withDynamicSubGop(Mpeg2DynamicSubGop dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop.toString();
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job specification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @see Mpeg2FramerateControl
     */

    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @return If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *         want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *         conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *         dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *         fraction. If you are creating your transcoding job specification as a JSON file without the console, use
     *         FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *         INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *         you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *         FramerateDenominator.
     * @see Mpeg2FramerateControl
     */

    public String getFramerateControl() {
        return this.framerateControl;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job specification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2FramerateControl
     */

    public Mpeg2Settings withFramerateControl(String framerateControl) {
        setFramerateControl(framerateControl);
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job specification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2FramerateControl
     */

    public Mpeg2Settings withFramerateControl(Mpeg2FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We
     *        recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30
     *        fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This
     *        results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate
     *        conversions, especially if your source video has already been converted from its original cadence, use
     *        FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion
     *        method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant
     *        add-on cost.
     * @see Mpeg2FramerateConversionAlgorithm
     */

    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     * 
     * @return Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We
     *         recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30
     *         fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This
     *         results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate
     *         conversions, especially if your source video has already been converted from its original cadence, use
     *         FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion
     *         method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a
     *         significant add-on cost.
     * @see Mpeg2FramerateConversionAlgorithm
     */

    public String getFramerateConversionAlgorithm() {
        return this.framerateConversionAlgorithm;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We
     *        recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30
     *        fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This
     *        results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate
     *        conversions, especially if your source video has already been converted from its original cadence, use
     *        FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion
     *        method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant
     *        add-on cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2FramerateConversionAlgorithm
     */

    public Mpeg2Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        setFramerateConversionAlgorithm(framerateConversionAlgorithm);
        return this;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We
     *        recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30
     *        fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This
     *        results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate
     *        conversions, especially if your source video has already been converted from its original cadence, use
     *        FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion
     *        method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant
     *        add-on cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2FramerateConversionAlgorithm
     */

    public Mpeg2Settings withFramerateConversionAlgorithm(Mpeg2FramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
        return this;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateDenominator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *        this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *        for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @return When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *         fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *         this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *         for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate.
     *         In this example, specify 23.976.
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateDenominator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *        this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *        for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withFramerateDenominator(Integer framerateDenominator) {
        setFramerateDenominator(framerateDenominator);
        return this;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this
     * example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame
     * rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateNumerator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this
     *        fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for
     *        transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     */

    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this
     * example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame
     * rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @return When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *         fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this
     *         fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for
     *         transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *         this example, specify 23.976.
     */

    public Integer getFramerateNumerator() {
        return this.framerateNumerator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this
     * example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame
     * rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateNumerator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this
     *        fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for
     *        transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @param gopClosedCadence
     *        Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *        joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *        output segmenting.
     */

    public void setGopClosedCadence(Integer gopClosedCadence) {
        this.gopClosedCadence = gopClosedCadence;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @return Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *         joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *         output segmenting.
     */

    public Integer getGopClosedCadence() {
        return this.gopClosedCadence;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @param gopClosedCadence
     *        Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *        joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *        output segmenting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withGopClosedCadence(Integer gopClosedCadence) {
        setGopClosedCadence(gopClosedCadence);
        return this;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @param gopSize
     *        GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     */

    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @return GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     */

    public Double getGopSize() {
        return this.gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @param gopSize
     *        GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withGopSize(Double gopSize) {
        setGopSize(gopSize);
        return this;
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert
     *        the GOP Size into a frame count at run time.
     * @see Mpeg2GopSizeUnits
     */

    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     * 
     * @return Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert
     *         the GOP Size into a frame count at run time.
     * @see Mpeg2GopSizeUnits
     */

    public String getGopSizeUnits() {
        return this.gopSizeUnits;
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert
     *        the GOP Size into a frame count at run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2GopSizeUnits
     */

    public Mpeg2Settings withGopSizeUnits(String gopSizeUnits) {
        setGopSizeUnits(gopSizeUnits);
        return this;
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert
     *        the GOP Size into a frame count at run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2GopSizeUnits
     */

    public Mpeg2Settings withGopSizeUnits(Mpeg2GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
        return this;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @param hrdBufferInitialFillPercentage
     *        Percentage of the buffer that should initially be filled (HRD buffer model).
     */

    public void setHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        this.hrdBufferInitialFillPercentage = hrdBufferInitialFillPercentage;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @return Percentage of the buffer that should initially be filled (HRD buffer model).
     */

    public Integer getHrdBufferInitialFillPercentage() {
        return this.hrdBufferInitialFillPercentage;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @param hrdBufferInitialFillPercentage
     *        Percentage of the buffer that should initially be filled (HRD buffer model).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        setHrdBufferInitialFillPercentage(hrdBufferInitialFillPercentage);
        return this;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     * 
     * @param hrdBufferSize
     *        Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     */

    public void setHrdBufferSize(Integer hrdBufferSize) {
        this.hrdBufferSize = hrdBufferSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     * 
     * @return Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     */

    public Integer getHrdBufferSize() {
        return this.hrdBufferSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     * 
     * @param hrdBufferSize
     *        Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withHrdBufferSize(Integer hrdBufferSize) {
        setHrdBufferSize(hrdBufferSize);
        return this;
    }

    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     * 
     * @param interlaceMode
     *        Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     *        progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom
     *        field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout.
     *        Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce
     *        outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field
     *        polarity might change over the course of the output. Follow behavior depends on the input scan type. If
     *        the source is interlaced, the output will be interlaced with the same polarity as the source. If the
     *        source is progressive, the output will be interlaced with top field bottom field first, depending on which
     *        of the Follow options you choose.
     * @see Mpeg2InterlaceMode
     */

    public void setInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
    }

    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     * 
     * @return Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     *         progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom
     *         field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout.
     *         Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce
     *         outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field
     *         polarity might change over the course of the output. Follow behavior depends on the input scan type. If
     *         the source is interlaced, the output will be interlaced with the same polarity as the source. If the
     *         source is progressive, the output will be interlaced with top field bottom field first, depending on
     *         which of the Follow options you choose.
     * @see Mpeg2InterlaceMode
     */

    public String getInterlaceMode() {
        return this.interlaceMode;
    }

    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     * 
     * @param interlaceMode
     *        Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     *        progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom
     *        field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout.
     *        Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce
     *        outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field
     *        polarity might change over the course of the output. Follow behavior depends on the input scan type. If
     *        the source is interlaced, the output will be interlaced with the same polarity as the source. If the
     *        source is progressive, the output will be interlaced with top field bottom field first, depending on which
     *        of the Follow options you choose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2InterlaceMode
     */

    public Mpeg2Settings withInterlaceMode(String interlaceMode) {
        setInterlaceMode(interlaceMode);
        return this;
    }

    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     * 
     * @param interlaceMode
     *        Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     *        progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom
     *        field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout.
     *        Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce
     *        outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field
     *        polarity might change over the course of the output. Follow behavior depends on the input scan type. If
     *        the source is interlaced, the output will be interlaced with the same polarity as the source. If the
     *        source is progressive, the output will be interlaced with top field bottom field first, depending on which
     *        of the Follow options you choose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2InterlaceMode
     */

    public Mpeg2Settings withInterlaceMode(Mpeg2InterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If
     * you choose the value auto, the service will automatically select the precision based on the per-frame compression
     * ratio.
     * 
     * @param intraDcPrecision
     *        Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC
     *        coefficients. If you choose the value auto, the service will automatically select the precision based on
     *        the per-frame compression ratio.
     * @see Mpeg2IntraDcPrecision
     */

    public void setIntraDcPrecision(String intraDcPrecision) {
        this.intraDcPrecision = intraDcPrecision;
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If
     * you choose the value auto, the service will automatically select the precision based on the per-frame compression
     * ratio.
     * 
     * @return Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC
     *         coefficients. If you choose the value auto, the service will automatically select the precision based on
     *         the per-frame compression ratio.
     * @see Mpeg2IntraDcPrecision
     */

    public String getIntraDcPrecision() {
        return this.intraDcPrecision;
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If
     * you choose the value auto, the service will automatically select the precision based on the per-frame compression
     * ratio.
     * 
     * @param intraDcPrecision
     *        Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC
     *        coefficients. If you choose the value auto, the service will automatically select the precision based on
     *        the per-frame compression ratio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2IntraDcPrecision
     */

    public Mpeg2Settings withIntraDcPrecision(String intraDcPrecision) {
        setIntraDcPrecision(intraDcPrecision);
        return this;
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If
     * you choose the value auto, the service will automatically select the precision based on the per-frame compression
     * ratio.
     * 
     * @param intraDcPrecision
     *        Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC
     *        coefficients. If you choose the value auto, the service will automatically select the precision based on
     *        the per-frame compression ratio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2IntraDcPrecision
     */

    public Mpeg2Settings withIntraDcPrecision(Mpeg2IntraDcPrecision intraDcPrecision) {
        this.intraDcPrecision = intraDcPrecision.toString();
        return this;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     * 
     * @param maxBitrate
     *        Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     * 
     * @return Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     * 
     * @param maxBitrate
     *        Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *        If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *        stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *        I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *        Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */

    public void setMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @return Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *         If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *         stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *         I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *         Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */

    public Integer getMinIInterval() {
        return this.minIInterval;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *        If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *        stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *        I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *        Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withMinIInterval(Integer minIInterval) {
        setMinIInterval(minIInterval);
        return this;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @param numberBFramesBetweenReferenceFrames
     *        Number of B-frames between reference frames.
     */

    public void setNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @return Number of B-frames between reference frames.
     */

    public Integer getNumberBFramesBetweenReferenceFrames() {
        return this.numberBFramesBetweenReferenceFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @param numberBFramesBetweenReferenceFrames
     *        Number of B-frames between reference frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        setNumberBFramesBetweenReferenceFrames(numberBFramesBetweenReferenceFrames);
        return this;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     * 
     * @param parControl
     *        Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default
     *        behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To
     *        specify a different PAR in the console, choose any value other than Follow source. To specify a different
     *        PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting,
     *        you must also specify values for the parNumerator and parDenominator settings.
     * @see Mpeg2ParControl
     */

    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     * 
     * @return Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default
     *         behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To
     *         specify a different PAR in the console, choose any value other than Follow source. To specify a different
     *         PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting,
     *         you must also specify values for the parNumerator and parDenominator settings.
     * @see Mpeg2ParControl
     */

    public String getParControl() {
        return this.parControl;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     * 
     * @param parControl
     *        Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default
     *        behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To
     *        specify a different PAR in the console, choose any value other than Follow source. To specify a different
     *        PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting,
     *        you must also specify values for the parNumerator and parDenominator settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ParControl
     */

    public Mpeg2Settings withParControl(String parControl) {
        setParControl(parControl);
        return this;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     * 
     * @param parControl
     *        Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default
     *        behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To
     *        specify a different PAR in the console, choose any value other than Follow source. To specify a different
     *        PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting,
     *        you must also specify values for the parNumerator and parDenominator settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ParControl
     */

    public Mpeg2Settings withParControl(Mpeg2ParControl parControl) {
        this.parControl = parControl.toString();
        return this;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parDenominator is 33.
     * 
     * @param parDenominator
     *        Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *        any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *        from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you
     *        would specify the ratio 40:33. In this example, the value for parDenominator is 33.
     */

    public void setParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parDenominator is 33.
     * 
     * @return Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *         any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *         from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen,
     *         you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
     */

    public Integer getParDenominator() {
        return this.parDenominator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parDenominator is 33.
     * 
     * @param parDenominator
     *        Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *        any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *        from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you
     *        would specify the ratio 40:33. In this example, the value for parDenominator is 33.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withParDenominator(Integer parDenominator) {
        setParDenominator(parDenominator);
        return this;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parNumerator is 40.
     * 
     * @param parNumerator
     *        Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *        any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *        from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you
     *        would specify the ratio 40:33. In this example, the value for parNumerator is 40.
     */

    public void setParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parNumerator is 40.
     * 
     * @return Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *         any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *         from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen,
     *         you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
     */

    public Integer getParNumerator() {
        return this.parNumerator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parNumerator is 40.
     * 
     * @param parNumerator
     *        Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *        any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *        from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you
     *        would specify the ratio 40:33. In this example, the value for parNumerator is 40.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withParNumerator(Integer parNumerator) {
        setParNumerator(parNumerator);
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed
     *        for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @see Mpeg2QualityTuningLevel
     */

    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @return Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding
     *         speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @see Mpeg2QualityTuningLevel
     */

    public String getQualityTuningLevel() {
        return this.qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed
     *        for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2QualityTuningLevel
     */

    public Mpeg2Settings withQualityTuningLevel(String qualityTuningLevel) {
        setQualityTuningLevel(qualityTuningLevel);
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed
     *        for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2QualityTuningLevel
     */

    public Mpeg2Settings withQualityTuningLevel(Mpeg2QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
        return this;
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant (cbr).
     * 
     * @param rateControlMode
     *        Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant
     *        (cbr).
     * @see Mpeg2RateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant (cbr).
     * 
     * @return Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant
     *         (cbr).
     * @see Mpeg2RateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant (cbr).
     * 
     * @param rateControlMode
     *        Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant
     *        (cbr).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2RateControlMode
     */

    public Mpeg2Settings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant (cbr).
     * 
     * @param rateControlMode
     *        Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant
     *        (cbr).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2RateControlMode
     */

    public Mpeg2Settings withRateControlMode(Mpeg2RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced
     *        output. In this case, each progressive frame from the input corresponds to an interlaced field in the
     *        output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With
     *        basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames.
     *        When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable
     *        for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings:
     *        To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't
     *        use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a
     *        value other than Progressive (PROGRESSIVE).
     * @see Mpeg2ScanTypeConversionMode
     */

    public void setScanTypeConversionMode(String scanTypeConversionMode) {
        this.scanTypeConversionMode = scanTypeConversionMode;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     * 
     * @return Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *         this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced
     *         output. In this case, each progressive frame from the input corresponds to an interlaced field in the
     *         output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With
     *         basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames.
     *         When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable
     *         for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings:
     *         To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't
     *         use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to
     *         a value other than Progressive (PROGRESSIVE).
     * @see Mpeg2ScanTypeConversionMode
     */

    public String getScanTypeConversionMode() {
        return this.scanTypeConversionMode;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced
     *        output. In this case, each progressive frame from the input corresponds to an interlaced field in the
     *        output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With
     *        basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames.
     *        When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable
     *        for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings:
     *        To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't
     *        use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a
     *        value other than Progressive (PROGRESSIVE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ScanTypeConversionMode
     */

    public Mpeg2Settings withScanTypeConversionMode(String scanTypeConversionMode) {
        setScanTypeConversionMode(scanTypeConversionMode);
        return this;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced
     *        output. In this case, each progressive frame from the input corresponds to an interlaced field in the
     *        output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With
     *        basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames.
     *        When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable
     *        for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings:
     *        To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't
     *        use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a
     *        value other than Progressive (PROGRESSIVE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ScanTypeConversionMode
     */

    public Mpeg2Settings withScanTypeConversionMode(Mpeg2ScanTypeConversionMode scanTypeConversionMode) {
        this.scanTypeConversionMode = scanTypeConversionMode.toString();
        return this;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves
     * video quality and is enabled by default.
     * 
     * @param sceneChangeDetect
     *        Enable this setting to insert I-frames at scene changes that the service automatically detects. This
     *        improves video quality and is enabled by default.
     * @see Mpeg2SceneChangeDetect
     */

    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves
     * video quality and is enabled by default.
     * 
     * @return Enable this setting to insert I-frames at scene changes that the service automatically detects. This
     *         improves video quality and is enabled by default.
     * @see Mpeg2SceneChangeDetect
     */

    public String getSceneChangeDetect() {
        return this.sceneChangeDetect;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves
     * video quality and is enabled by default.
     * 
     * @param sceneChangeDetect
     *        Enable this setting to insert I-frames at scene changes that the service automatically detects. This
     *        improves video quality and is enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SceneChangeDetect
     */

    public Mpeg2Settings withSceneChangeDetect(String sceneChangeDetect) {
        setSceneChangeDetect(sceneChangeDetect);
        return this;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves
     * video quality and is enabled by default.
     * 
     * @param sceneChangeDetect
     *        Enable this setting to insert I-frames at scene changes that the service automatically detects. This
     *        improves video quality and is enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SceneChangeDetect
     */

    public Mpeg2Settings withSceneChangeDetect(Mpeg2SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
        return this;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and
     *        resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly
     *        reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job
     *        specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     *        (framerateDenominator) to 1.
     * @see Mpeg2SlowPal
     */

    public void setSlowPal(String slowPal) {
        this.slowPal = slowPal;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     * 
     * @return Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *         to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and
     *         resamples your audio to keep it synchronized with the video. Note that enabling this setting will
     *         slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your
     *         JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     *         (framerateDenominator) to 1.
     * @see Mpeg2SlowPal
     */

    public String getSlowPal() {
        return this.slowPal;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and
     *        resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly
     *        reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job
     *        specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     *        (framerateDenominator) to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SlowPal
     */

    public Mpeg2Settings withSlowPal(String slowPal) {
        setSlowPal(slowPal);
        return this;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and
     *        resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly
     *        reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job
     *        specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     *        (framerateDenominator) to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SlowPal
     */

    public Mpeg2Settings withSlowPal(Mpeg2SlowPal slowPal) {
        this.slowPal = slowPal.toString();
        return this;
    }

    /**
     * Ignore this setting unless you need to comply with a specification that requires a specific value. If you don't
     * have a specification requirement, we recommend that you adjust the softness of your output by using a lower value
     * for the setting Sharpness (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness
     * (softness) setting specifies the quantization matrices that the encoder uses. Keep the default value, 0, to use
     * the AWS Elemental default matrices. Choose a value from 17 to 128 to use planar interpolation. Increasing values
     * from 17 to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
     * 
     * @param softness
     *        Ignore this setting unless you need to comply with a specification that requires a specific value. If you
     *        don't have a specification requirement, we recommend that you adjust the softness of your output by using
     *        a lower value for the setting Sharpness (sharpness) or by enabling a noise reducer filter
     *        (noiseReducerFilter). The Softness (softness) setting specifies the quantization matrices that the encoder
     *        uses. Keep the default value, 0, to use the AWS Elemental default matrices. Choose a value from 17 to 128
     *        to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of
     *        high-frequency data. The value 128 results in the softest video.
     */

    public void setSoftness(Integer softness) {
        this.softness = softness;
    }

    /**
     * Ignore this setting unless you need to comply with a specification that requires a specific value. If you don't
     * have a specification requirement, we recommend that you adjust the softness of your output by using a lower value
     * for the setting Sharpness (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness
     * (softness) setting specifies the quantization matrices that the encoder uses. Keep the default value, 0, to use
     * the AWS Elemental default matrices. Choose a value from 17 to 128 to use planar interpolation. Increasing values
     * from 17 to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
     * 
     * @return Ignore this setting unless you need to comply with a specification that requires a specific value. If you
     *         don't have a specification requirement, we recommend that you adjust the softness of your output by using
     *         a lower value for the setting Sharpness (sharpness) or by enabling a noise reducer filter
     *         (noiseReducerFilter). The Softness (softness) setting specifies the quantization matrices that the
     *         encoder uses. Keep the default value, 0, to use the AWS Elemental default matrices. Choose a value from
     *         17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of
     *         high-frequency data. The value 128 results in the softest video.
     */

    public Integer getSoftness() {
        return this.softness;
    }

    /**
     * Ignore this setting unless you need to comply with a specification that requires a specific value. If you don't
     * have a specification requirement, we recommend that you adjust the softness of your output by using a lower value
     * for the setting Sharpness (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness
     * (softness) setting specifies the quantization matrices that the encoder uses. Keep the default value, 0, to use
     * the AWS Elemental default matrices. Choose a value from 17 to 128 to use planar interpolation. Increasing values
     * from 17 to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
     * 
     * @param softness
     *        Ignore this setting unless you need to comply with a specification that requires a specific value. If you
     *        don't have a specification requirement, we recommend that you adjust the softness of your output by using
     *        a lower value for the setting Sharpness (sharpness) or by enabling a noise reducer filter
     *        (noiseReducerFilter). The Softness (softness) setting specifies the quantization matrices that the encoder
     *        uses. Keep the default value, 0, to use the AWS Elemental default matrices. Choose a value from 17 to 128
     *        to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of
     *        high-frequency data. The value 128 results in the softest video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withSoftness(Integer softness) {
        setSoftness(softness);
        return this;
    }

    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of
     * content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     * distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be
     * noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are
     * encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that
     * this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be
     * focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this
     * feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization
     * (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set
     * it to Low. For content with a wider variety of textures, set it to High or Higher.
     * 
     * @param spatialAdaptiveQuantization
     *        Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial
     *        variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that
     *        can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any
     *        small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and
     *        smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your
     *        video quality. Note, though, that this feature doesn't take into account where the viewer's attention is
     *        likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of
     *        complex texture, you might choose to disable this feature. Related setting: When you enable spatial
     *        adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your
     *        content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a
     *        wider variety of textures, set it to High or Higher.
     * @see Mpeg2SpatialAdaptiveQuantization
     */

    public void setSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization;
    }

    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of
     * content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     * distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be
     * noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are
     * encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that
     * this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be
     * focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this
     * feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization
     * (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set
     * it to Low. For content with a wider variety of textures, set it to High or Higher.
     * 
     * @return Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial
     *         variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that
     *         can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any
     *         small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and
     *         smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your
     *         video quality. Note, though, that this feature doesn't take into account where the viewer's attention is
     *         likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of
     *         complex texture, you might choose to disable this feature. Related setting: When you enable spatial
     *         adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your
     *         content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a
     *         wider variety of textures, set it to High or Higher.
     * @see Mpeg2SpatialAdaptiveQuantization
     */

    public String getSpatialAdaptiveQuantization() {
        return this.spatialAdaptiveQuantization;
    }

    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of
     * content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     * distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be
     * noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are
     * encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that
     * this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be
     * focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this
     * feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization
     * (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set
     * it to Low. For content with a wider variety of textures, set it to High or Higher.
     * 
     * @param spatialAdaptiveQuantization
     *        Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial
     *        variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that
     *        can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any
     *        small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and
     *        smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your
     *        video quality. Note, though, that this feature doesn't take into account where the viewer's attention is
     *        likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of
     *        complex texture, you might choose to disable this feature. Related setting: When you enable spatial
     *        adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your
     *        content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a
     *        wider variety of textures, set it to High or Higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SpatialAdaptiveQuantization
     */

    public Mpeg2Settings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        setSpatialAdaptiveQuantization(spatialAdaptiveQuantization);
        return this;
    }

    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of
     * content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     * distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be
     * noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are
     * encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that
     * this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be
     * focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this
     * feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization
     * (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set
     * it to Low. For content with a wider variety of textures, set it to High or Higher.
     * 
     * @param spatialAdaptiveQuantization
     *        Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial
     *        variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that
     *        can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any
     *        small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and
     *        smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your
     *        video quality. Note, though, that this feature doesn't take into account where the viewer's attention is
     *        likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of
     *        complex texture, you might choose to disable this feature. Related setting: When you enable spatial
     *        adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your
     *        content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a
     *        wider variety of textures, set it to High or Higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SpatialAdaptiveQuantization
     */

    public Mpeg2Settings withSpatialAdaptiveQuantization(Mpeg2SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
        return this;
    }

    /**
     * Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax. Related
     * settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value to to D10
     * (D_10).
     * 
     * @param syntax
     *        Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax.
     *        Related settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value
     *        to to D10 (D_10).
     * @see Mpeg2Syntax
     */

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    /**
     * Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax. Related
     * settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value to to D10
     * (D_10).
     * 
     * @return Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax.
     *         Related settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value
     *         to to D10 (D_10).
     * @see Mpeg2Syntax
     */

    public String getSyntax() {
        return this.syntax;
    }

    /**
     * Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax. Related
     * settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value to to D10
     * (D_10).
     * 
     * @param syntax
     *        Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax.
     *        Related settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value
     *        to to D10 (D_10).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2Syntax
     */

    public Mpeg2Settings withSyntax(String syntax) {
        setSyntax(syntax);
        return this;
    }

    /**
     * Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax. Related
     * settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value to to D10
     * (D_10).
     * 
     * @param syntax
     *        Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax.
     *        Related settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value
     *        to to D10 (D_10).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2Syntax
     */

    public Mpeg2Settings withSyntax(Mpeg2Syntax syntax) {
        this.syntax = syntax.toString();
        return this;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD)
     * produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video
     * player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert
     * does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother
     * picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard
     *        telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output
     *        that signals to the video player device to do the conversion during play back. When you keep the default
     *        value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     *        with the field polarity to create a smoother picture.
     * @see Mpeg2Telecine
     */

    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD)
     * produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video
     * player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert
     * does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother
     * picture.
     * 
     * @return When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *         type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard
     *         telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output
     *         that signals to the video player device to do the conversion during play back. When you keep the default
     *         value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     *         with the field polarity to create a smoother picture.
     * @see Mpeg2Telecine
     */

    public String getTelecine() {
        return this.telecine;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD)
     * produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video
     * player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert
     * does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother
     * picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard
     *        telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output
     *        that signals to the video player device to do the conversion during play back. When you keep the default
     *        value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     *        with the field polarity to create a smoother picture.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2Telecine
     */

    public Mpeg2Settings withTelecine(String telecine) {
        setTelecine(telecine);
        return this;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD)
     * produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video
     * player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert
     * does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother
     * picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard
     *        telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output
     *        that signals to the video player device to do the conversion during play back. When you keep the default
     *        value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     *        with the field polarity to create a smoother picture.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2Telecine
     */

    public Mpeg2Settings withTelecine(Mpeg2Telecine telecine) {
        this.telecine = telecine.toString();
        return this;
    }

    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation
     * of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that
     * aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     * improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature
     * will almost always improve your video quality. Note, though, that this feature doesn't take into account where the
     * viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen
     * that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable
     * this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the
     * setting Adaptive quantization (adaptiveQuantization).
     * 
     * @param temporalAdaptiveQuantization
     *        Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal
     *        variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the
     *        frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For
     *        example, this feature improves the readability of text tickers on newscasts and scoreboards on sports
     *        matches. Enabling this feature will almost always improve your video quality. Note, though, that this
     *        feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to
     *        be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges,
     *        such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable
     *        temporal quantization, adjust the strength of the filter with the setting Adaptive quantization
     *        (adaptiveQuantization).
     * @see Mpeg2TemporalAdaptiveQuantization
     */

    public void setTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization;
    }

    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation
     * of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that
     * aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     * improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature
     * will almost always improve your video quality. Note, though, that this feature doesn't take into account where the
     * viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen
     * that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable
     * this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the
     * setting Adaptive quantization (adaptiveQuantization).
     * 
     * @return Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal
     *         variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of
     *         the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For
     *         example, this feature improves the readability of text tickers on newscasts and scoreboards on sports
     *         matches. Enabling this feature will almost always improve your video quality. Note, though, that this
     *         feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to
     *         be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges,
     *         such as sports athletes' faces, you might choose to disable this feature. Related setting: When you
     *         enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization
     *         (adaptiveQuantization).
     * @see Mpeg2TemporalAdaptiveQuantization
     */

    public String getTemporalAdaptiveQuantization() {
        return this.temporalAdaptiveQuantization;
    }

    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation
     * of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that
     * aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     * improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature
     * will almost always improve your video quality. Note, though, that this feature doesn't take into account where the
     * viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen
     * that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable
     * this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the
     * setting Adaptive quantization (adaptiveQuantization).
     * 
     * @param temporalAdaptiveQuantization
     *        Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal
     *        variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the
     *        frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For
     *        example, this feature improves the readability of text tickers on newscasts and scoreboards on sports
     *        matches. Enabling this feature will almost always improve your video quality. Note, though, that this
     *        feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to
     *        be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges,
     *        such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable
     *        temporal quantization, adjust the strength of the filter with the setting Adaptive quantization
     *        (adaptiveQuantization).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2TemporalAdaptiveQuantization
     */

    public Mpeg2Settings withTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        setTemporalAdaptiveQuantization(temporalAdaptiveQuantization);
        return this;
    }

    /**
     * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation
     * of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that
     * aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     * improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature
     * will almost always improve your video quality. Note, though, that this feature doesn't take into account where the
     * viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen
     * that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable
     * this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the
     * setting Adaptive quantization (adaptiveQuantization).
     * 
     * @param temporalAdaptiveQuantization
     *        Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal
     *        variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the
     *        frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For
     *        example, this feature improves the readability of text tickers on newscasts and scoreboards on sports
     *        matches. Enabling this feature will almost always improve your video quality. Note, though, that this
     *        feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to
     *        be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges,
     *        such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable
     *        temporal quantization, adjust the strength of the filter with the setting Adaptive quantization
     *        (adaptiveQuantization).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2TemporalAdaptiveQuantization
     */

    public Mpeg2Settings withTemporalAdaptiveQuantization(Mpeg2TemporalAdaptiveQuantization temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization.toString();
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
        if (getAdaptiveQuantization() != null)
            sb.append("AdaptiveQuantization: ").append(getAdaptiveQuantization()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getCodecLevel() != null)
            sb.append("CodecLevel: ").append(getCodecLevel()).append(",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: ").append(getCodecProfile()).append(",");
        if (getDynamicSubGop() != null)
            sb.append("DynamicSubGop: ").append(getDynamicSubGop()).append(",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: ").append(getFramerateControl()).append(",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: ").append(getFramerateConversionAlgorithm()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: ").append(getGopClosedCadence()).append(",");
        if (getGopSize() != null)
            sb.append("GopSize: ").append(getGopSize()).append(",");
        if (getGopSizeUnits() != null)
            sb.append("GopSizeUnits: ").append(getGopSizeUnits()).append(",");
        if (getHrdBufferInitialFillPercentage() != null)
            sb.append("HrdBufferInitialFillPercentage: ").append(getHrdBufferInitialFillPercentage()).append(",");
        if (getHrdBufferSize() != null)
            sb.append("HrdBufferSize: ").append(getHrdBufferSize()).append(",");
        if (getInterlaceMode() != null)
            sb.append("InterlaceMode: ").append(getInterlaceMode()).append(",");
        if (getIntraDcPrecision() != null)
            sb.append("IntraDcPrecision: ").append(getIntraDcPrecision()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getMinIInterval() != null)
            sb.append("MinIInterval: ").append(getMinIInterval()).append(",");
        if (getNumberBFramesBetweenReferenceFrames() != null)
            sb.append("NumberBFramesBetweenReferenceFrames: ").append(getNumberBFramesBetweenReferenceFrames()).append(",");
        if (getParControl() != null)
            sb.append("ParControl: ").append(getParControl()).append(",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: ").append(getParDenominator()).append(",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: ").append(getParNumerator()).append(",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: ").append(getQualityTuningLevel()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getScanTypeConversionMode() != null)
            sb.append("ScanTypeConversionMode: ").append(getScanTypeConversionMode()).append(",");
        if (getSceneChangeDetect() != null)
            sb.append("SceneChangeDetect: ").append(getSceneChangeDetect()).append(",");
        if (getSlowPal() != null)
            sb.append("SlowPal: ").append(getSlowPal()).append(",");
        if (getSoftness() != null)
            sb.append("Softness: ").append(getSoftness()).append(",");
        if (getSpatialAdaptiveQuantization() != null)
            sb.append("SpatialAdaptiveQuantization: ").append(getSpatialAdaptiveQuantization()).append(",");
        if (getSyntax() != null)
            sb.append("Syntax: ").append(getSyntax()).append(",");
        if (getTelecine() != null)
            sb.append("Telecine: ").append(getTelecine()).append(",");
        if (getTemporalAdaptiveQuantization() != null)
            sb.append("TemporalAdaptiveQuantization: ").append(getTemporalAdaptiveQuantization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mpeg2Settings == false)
            return false;
        Mpeg2Settings other = (Mpeg2Settings) obj;
        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodecLevel() == null ^ this.getCodecLevel() == null)
            return false;
        if (other.getCodecLevel() != null && other.getCodecLevel().equals(this.getCodecLevel()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null && other.getCodecProfile().equals(this.getCodecProfile()) == false)
            return false;
        if (other.getDynamicSubGop() == null ^ this.getDynamicSubGop() == null)
            return false;
        if (other.getDynamicSubGop() != null && other.getDynamicSubGop().equals(this.getDynamicSubGop()) == false)
            return false;
        if (other.getFramerateControl() == null ^ this.getFramerateControl() == null)
            return false;
        if (other.getFramerateControl() != null && other.getFramerateControl().equals(this.getFramerateControl()) == false)
            return false;
        if (other.getFramerateConversionAlgorithm() == null ^ this.getFramerateConversionAlgorithm() == null)
            return false;
        if (other.getFramerateConversionAlgorithm() != null && other.getFramerateConversionAlgorithm().equals(this.getFramerateConversionAlgorithm()) == false)
            return false;
        if (other.getFramerateDenominator() == null ^ this.getFramerateDenominator() == null)
            return false;
        if (other.getFramerateDenominator() != null && other.getFramerateDenominator().equals(this.getFramerateDenominator()) == false)
            return false;
        if (other.getFramerateNumerator() == null ^ this.getFramerateNumerator() == null)
            return false;
        if (other.getFramerateNumerator() != null && other.getFramerateNumerator().equals(this.getFramerateNumerator()) == false)
            return false;
        if (other.getGopClosedCadence() == null ^ this.getGopClosedCadence() == null)
            return false;
        if (other.getGopClosedCadence() != null && other.getGopClosedCadence().equals(this.getGopClosedCadence()) == false)
            return false;
        if (other.getGopSize() == null ^ this.getGopSize() == null)
            return false;
        if (other.getGopSize() != null && other.getGopSize().equals(this.getGopSize()) == false)
            return false;
        if (other.getGopSizeUnits() == null ^ this.getGopSizeUnits() == null)
            return false;
        if (other.getGopSizeUnits() != null && other.getGopSizeUnits().equals(this.getGopSizeUnits()) == false)
            return false;
        if (other.getHrdBufferInitialFillPercentage() == null ^ this.getHrdBufferInitialFillPercentage() == null)
            return false;
        if (other.getHrdBufferInitialFillPercentage() != null
                && other.getHrdBufferInitialFillPercentage().equals(this.getHrdBufferInitialFillPercentage()) == false)
            return false;
        if (other.getHrdBufferSize() == null ^ this.getHrdBufferSize() == null)
            return false;
        if (other.getHrdBufferSize() != null && other.getHrdBufferSize().equals(this.getHrdBufferSize()) == false)
            return false;
        if (other.getInterlaceMode() == null ^ this.getInterlaceMode() == null)
            return false;
        if (other.getInterlaceMode() != null && other.getInterlaceMode().equals(this.getInterlaceMode()) == false)
            return false;
        if (other.getIntraDcPrecision() == null ^ this.getIntraDcPrecision() == null)
            return false;
        if (other.getIntraDcPrecision() != null && other.getIntraDcPrecision().equals(this.getIntraDcPrecision()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getMinIInterval() == null ^ this.getMinIInterval() == null)
            return false;
        if (other.getMinIInterval() != null && other.getMinIInterval().equals(this.getMinIInterval()) == false)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() == null ^ this.getNumberBFramesBetweenReferenceFrames() == null)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() != null
                && other.getNumberBFramesBetweenReferenceFrames().equals(this.getNumberBFramesBetweenReferenceFrames()) == false)
            return false;
        if (other.getParControl() == null ^ this.getParControl() == null)
            return false;
        if (other.getParControl() != null && other.getParControl().equals(this.getParControl()) == false)
            return false;
        if (other.getParDenominator() == null ^ this.getParDenominator() == null)
            return false;
        if (other.getParDenominator() != null && other.getParDenominator().equals(this.getParDenominator()) == false)
            return false;
        if (other.getParNumerator() == null ^ this.getParNumerator() == null)
            return false;
        if (other.getParNumerator() != null && other.getParNumerator().equals(this.getParNumerator()) == false)
            return false;
        if (other.getQualityTuningLevel() == null ^ this.getQualityTuningLevel() == null)
            return false;
        if (other.getQualityTuningLevel() != null && other.getQualityTuningLevel().equals(this.getQualityTuningLevel()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getScanTypeConversionMode() == null ^ this.getScanTypeConversionMode() == null)
            return false;
        if (other.getScanTypeConversionMode() != null && other.getScanTypeConversionMode().equals(this.getScanTypeConversionMode()) == false)
            return false;
        if (other.getSceneChangeDetect() == null ^ this.getSceneChangeDetect() == null)
            return false;
        if (other.getSceneChangeDetect() != null && other.getSceneChangeDetect().equals(this.getSceneChangeDetect()) == false)
            return false;
        if (other.getSlowPal() == null ^ this.getSlowPal() == null)
            return false;
        if (other.getSlowPal() != null && other.getSlowPal().equals(this.getSlowPal()) == false)
            return false;
        if (other.getSoftness() == null ^ this.getSoftness() == null)
            return false;
        if (other.getSoftness() != null && other.getSoftness().equals(this.getSoftness()) == false)
            return false;
        if (other.getSpatialAdaptiveQuantization() == null ^ this.getSpatialAdaptiveQuantization() == null)
            return false;
        if (other.getSpatialAdaptiveQuantization() != null && other.getSpatialAdaptiveQuantization().equals(this.getSpatialAdaptiveQuantization()) == false)
            return false;
        if (other.getSyntax() == null ^ this.getSyntax() == null)
            return false;
        if (other.getSyntax() != null && other.getSyntax().equals(this.getSyntax()) == false)
            return false;
        if (other.getTelecine() == null ^ this.getTelecine() == null)
            return false;
        if (other.getTelecine() != null && other.getTelecine().equals(this.getTelecine()) == false)
            return false;
        if (other.getTemporalAdaptiveQuantization() == null ^ this.getTemporalAdaptiveQuantization() == null)
            return false;
        if (other.getTemporalAdaptiveQuantization() != null && other.getTemporalAdaptiveQuantization().equals(this.getTemporalAdaptiveQuantization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodecLevel() == null) ? 0 : getCodecLevel().hashCode());
        hashCode = prime * hashCode + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getDynamicSubGop() == null) ? 0 : getDynamicSubGop().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateConversionAlgorithm() == null) ? 0 : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferInitialFillPercentage() == null) ? 0 : getHrdBufferInitialFillPercentage().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferSize() == null) ? 0 : getHrdBufferSize().hashCode());
        hashCode = prime * hashCode + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode + ((getIntraDcPrecision() == null) ? 0 : getIntraDcPrecision().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime * hashCode + ((getNumberBFramesBetweenReferenceFrames() == null) ? 0 : getNumberBFramesBetweenReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getScanTypeConversionMode() == null) ? 0 : getScanTypeConversionMode().hashCode());
        hashCode = prime * hashCode + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getSoftness() == null) ? 0 : getSoftness().hashCode());
        hashCode = prime * hashCode + ((getSpatialAdaptiveQuantization() == null) ? 0 : getSpatialAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getSyntax() == null) ? 0 : getSyntax().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        hashCode = prime * hashCode + ((getTemporalAdaptiveQuantization() == null) ? 0 : getTemporalAdaptiveQuantization().hashCode());
        return hashCode;
    }

    @Override
    public Mpeg2Settings clone() {
        try {
            return (Mpeg2Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Mpeg2SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

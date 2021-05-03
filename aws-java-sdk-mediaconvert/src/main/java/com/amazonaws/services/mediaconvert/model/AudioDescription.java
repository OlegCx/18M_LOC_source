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
 * Settings related to one audio tab on the MediaConvert console. In your job JSON, an instance of AudioDescription is
 * equivalent to one audio tab in the console. Usually, one audio tab corresponds to one output audio track. Depending
 * on how you set up your input audio selectors and whether you use audio selector groups, one audio tab can correspond
 * to a group of output audio tracks.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AudioDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel layout
     * manually. For example, you would tag the tracks that contain your left, right, and center audio with Left (L),
     * Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert labels your track as Center
     * (C) by default. To use audio layout tagging, your output must be in a QuickTime (.mov) container; your audio codec
     * must be AAC, WAV, or AIFF; and you must set up your audio track to have only one channel.
     */
    private AudioChannelTaggingSettings audioChannelTaggingSettings;
    /** Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard. */
    private AudioNormalizationSettings audioNormalizationSettings;
    /**
     * Specifies which audio data to use from each input. In the simplest case, specify an
     * "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify
     * "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an
     * "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio
     * selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior.
     * If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
     */
    private String audioSourceName;
    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are
     * defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     */
    private Integer audioType;
    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     */
    private String audioTypeControl;
    /**
     * Settings related to audio encoding. The settings in this group vary depending on the value that you choose for
     * your audio codec.
     */
    private AudioCodecSettings codecSettings;
    /**
     * Specify the language for this audio output track. The service puts this language code into your output audio
     * track when you set Language code control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED). The
     * service also uses your specified custom language code when you set Language code control
     * (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a language code.
     * For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other
     * code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output
     * groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     */
    private String customLanguageCode;
    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     */
    private String languageCode;
    /**
     * Specify which source for language code takes precedence for this audio track. When you choose Follow input
     * (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in the setting Language code (languageCode or
     * customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you
     * specify.
     */
    private String languageCodeControl;
    /** Advanced audio remixing settings. */
    private RemixSettings remixSettings;
    /**
     * Specify a label for this output audio stream. For example, "English", "Director commentary", or "track_2". For
     * streaming outputs, MediaConvert passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     */
    private String streamName;

    /**
     * When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel layout
     * manually. For example, you would tag the tracks that contain your left, right, and center audio with Left (L),
     * Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert labels your track as Center
     * (C) by default. To use audio layout tagging, your output must be in a QuickTime (.mov) container; your audio codec
     * must be AAC, WAV, or AIFF; and you must set up your audio track to have only one channel.
     * 
     * @param audioChannelTaggingSettings
     *        When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel
     *        layout manually. For example, you would tag the tracks that contain your left, right, and center audio
     *        with Left (L), Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert
     *        labels your track as Center (C) by default. To use audio layout tagging, your output must be in a
     *        QuickTime (.mov) container; your audio codec must be AAC, WAV, or AIFF; and you must set up your audio
     *        track to have only one channel.
     */

    public void setAudioChannelTaggingSettings(AudioChannelTaggingSettings audioChannelTaggingSettings) {
        this.audioChannelTaggingSettings = audioChannelTaggingSettings;
    }

    /**
     * When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel layout
     * manually. For example, you would tag the tracks that contain your left, right, and center audio with Left (L),
     * Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert labels your track as Center
     * (C) by default. To use audio layout tagging, your output must be in a QuickTime (.mov) container; your audio codec
     * must be AAC, WAV, or AIFF; and you must set up your audio track to have only one channel.
     * 
     * @return When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel
     *         layout manually. For example, you would tag the tracks that contain your left, right, and center audio
     *         with Left (L), Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert
     *         labels your track as Center (C) by default. To use audio layout tagging, your output must be in a
     *         QuickTime (.mov) container; your audio codec must be AAC, WAV, or AIFF; and you must set up your audio
     *         track to have only one channel.
     */

    public AudioChannelTaggingSettings getAudioChannelTaggingSettings() {
        return this.audioChannelTaggingSettings;
    }

    /**
     * When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel layout
     * manually. For example, you would tag the tracks that contain your left, right, and center audio with Left (L),
     * Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert labels your track as Center
     * (C) by default. To use audio layout tagging, your output must be in a QuickTime (.mov) container; your audio codec
     * must be AAC, WAV, or AIFF; and you must set up your audio track to have only one channel.
     * 
     * @param audioChannelTaggingSettings
     *        When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel
     *        layout manually. For example, you would tag the tracks that contain your left, right, and center audio
     *        with Left (L), Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert
     *        labels your track as Center (C) by default. To use audio layout tagging, your output must be in a
     *        QuickTime (.mov) container; your audio codec must be AAC, WAV, or AIFF; and you must set up your audio
     *        track to have only one channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withAudioChannelTaggingSettings(AudioChannelTaggingSettings audioChannelTaggingSettings) {
        setAudioChannelTaggingSettings(audioChannelTaggingSettings);
        return this;
    }

    /**
     * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
     * 
     * @param audioNormalizationSettings
     *        Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness
     *        standard.
     */

    public void setAudioNormalizationSettings(AudioNormalizationSettings audioNormalizationSettings) {
        this.audioNormalizationSettings = audioNormalizationSettings;
    }

    /**
     * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
     * 
     * @return Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness
     *         standard.
     */

    public AudioNormalizationSettings getAudioNormalizationSettings() {
        return this.audioNormalizationSettings;
    }

    /**
     * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
     * 
     * @param audioNormalizationSettings
     *        Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness
     *        standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withAudioNormalizationSettings(AudioNormalizationSettings audioNormalizationSettings) {
        setAudioNormalizationSettings(audioNormalizationSettings);
        return this;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case, specify an
     * "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify
     * "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an
     * "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio
     * selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior.
     * If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
     * 
     * @param audioSourceName
     *        Specifies which audio data to use from each input. In the simplest case, specify an
     *        "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you
     *        specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does
     *        not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If
     *        there is no audio selector marked as "default", silence will be inserted for the duration of that input.
     *        Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar
     *        default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be chosen
     *        automatically.
     */

    public void setAudioSourceName(String audioSourceName) {
        this.audioSourceName = audioSourceName;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case, specify an
     * "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify
     * "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an
     * "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio
     * selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior.
     * If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
     * 
     * @return Specifies which audio data to use from each input. In the simplest case, specify an
     *         "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you
     *         specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does
     *         not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used.
     *         If there is no audio selector marked as "default", silence will be inserted for the duration of that
     *         input. Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with
     *         similar default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be
     *         chosen automatically.
     */

    public String getAudioSourceName() {
        return this.audioSourceName;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case, specify an
     * "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify
     * "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an
     * "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio
     * selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior.
     * If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
     * 
     * @param audioSourceName
     *        Specifies which audio data to use from each input. In the simplest case, specify an
     *        "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you
     *        specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does
     *        not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If
     *        there is no audio selector marked as "default", silence will be inserted for the duration of that input.
     *        Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar
     *        default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be chosen
     *        automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withAudioSourceName(String audioSourceName) {
        setAudioSourceName(audioSourceName);
        return this;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are
     * defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * 
     * @param audioType
     *        Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following
     *        are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually
     *        Impaired Commentary, 4-255 = Reserved.
     */

    public void setAudioType(Integer audioType) {
        this.audioType = audioType;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are
     * defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * 
     * @return Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following
     *         are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually
     *         Impaired Commentary, 4-255 = Reserved.
     */

    public Integer getAudioType() {
        return this.audioType;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are
     * defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * 
     * @param audioType
     *        Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following
     *        are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually
     *        Impaired Commentary, 4-255 = Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withAudioType(Integer audioType) {
        setAudioType(audioType);
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * 
     * @param audioTypeControl
     *        When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through
     *        to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the
     *        output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType
     *        are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @see AudioTypeControl
     */

    public void setAudioTypeControl(String audioTypeControl) {
        this.audioTypeControl = audioTypeControl;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * 
     * @return When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through
     *         to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the
     *         output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType
     *         are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @see AudioTypeControl
     */

    public String getAudioTypeControl() {
        return this.audioTypeControl;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * 
     * @param audioTypeControl
     *        When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through
     *        to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the
     *        output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType
     *        are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioTypeControl
     */

    public AudioDescription withAudioTypeControl(String audioTypeControl) {
        setAudioTypeControl(audioTypeControl);
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * 
     * @param audioTypeControl
     *        When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through
     *        to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the
     *        output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType
     *        are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioTypeControl
     */

    public AudioDescription withAudioTypeControl(AudioTypeControl audioTypeControl) {
        this.audioTypeControl = audioTypeControl.toString();
        return this;
    }

    /**
     * Settings related to audio encoding. The settings in this group vary depending on the value that you choose for
     * your audio codec.
     * 
     * @param codecSettings
     *        Settings related to audio encoding. The settings in this group vary depending on the value that you choose
     *        for your audio codec.
     */

    public void setCodecSettings(AudioCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
    }

    /**
     * Settings related to audio encoding. The settings in this group vary depending on the value that you choose for
     * your audio codec.
     * 
     * @return Settings related to audio encoding. The settings in this group vary depending on the value that you
     *         choose for your audio codec.
     */

    public AudioCodecSettings getCodecSettings() {
        return this.codecSettings;
    }

    /**
     * Settings related to audio encoding. The settings in this group vary depending on the value that you choose for
     * your audio codec.
     * 
     * @param codecSettings
     *        Settings related to audio encoding. The settings in this group vary depending on the value that you choose
     *        for your audio codec.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withCodecSettings(AudioCodecSettings codecSettings) {
        setCodecSettings(codecSettings);
        return this;
    }

    /**
     * Specify the language for this audio output track. The service puts this language code into your output audio
     * track when you set Language code control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED). The
     * service also uses your specified custom language code when you set Language code control
     * (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a language code.
     * For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other
     * code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output
     * groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     * 
     * @param customLanguageCode
     *        Specify the language for this audio output track. The service puts this language code into your output
     *        audio track when you set Language code control (AudioLanguageCodeControl) to Use configured
     *        (USE_CONFIGURED). The service also uses your specified custom language code when you set Language code
     *        control (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a
     *        language code. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can
     *        also use any other code in the full RFC-5646 specification. Streaming outputs are those that are in one of
     *        the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     */

    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * Specify the language for this audio output track. The service puts this language code into your output audio
     * track when you set Language code control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED). The
     * service also uses your specified custom language code when you set Language code control
     * (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a language code.
     * For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other
     * code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output
     * groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     * 
     * @return Specify the language for this audio output track. The service puts this language code into your output
     *         audio track when you set Language code control (AudioLanguageCodeControl) to Use configured
     *         (USE_CONFIGURED). The service also uses your specified custom language code when you set Language code
     *         control (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a
     *         language code. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you
     *         can also use any other code in the full RFC-5646 specification. Streaming outputs are those that are in
     *         one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     */

    public String getCustomLanguageCode() {
        return this.customLanguageCode;
    }

    /**
     * Specify the language for this audio output track. The service puts this language code into your output audio
     * track when you set Language code control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED). The
     * service also uses your specified custom language code when you set Language code control
     * (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a language code.
     * For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other
     * code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output
     * groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     * 
     * @param customLanguageCode
     *        Specify the language for this audio output track. The service puts this language code into your output
     *        audio track when you set Language code control (AudioLanguageCodeControl) to Use configured
     *        (USE_CONFIGURED). The service also uses your specified custom language code when you set Language code
     *        control (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a
     *        language code. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can
     *        also use any other code in the full RFC-5646 specification. Streaming outputs are those that are in one of
     *        the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withCustomLanguageCode(String customLanguageCode) {
        setCustomLanguageCode(customLanguageCode);
        return this;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCode
     *        Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code'
     *        drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language
     *        Code' is selected but there is no ISO 639 language code specified by the input.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     * 
     * @return Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code'
     *         drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language
     *         Code' is selected but there is no ISO 639 language code specified by the input.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCode
     *        Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code'
     *        drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language
     *        Code' is selected but there is no ISO 639 language code specified by the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public AudioDescription withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCode
     *        Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code'
     *        drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language
     *        Code' is selected but there is no ISO 639 language code specified by the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public AudioDescription withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Specify which source for language code takes precedence for this audio track. When you choose Follow input
     * (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in the setting Language code (languageCode or
     * customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you
     * specify.
     * 
     * @param languageCodeControl
     *        Specify which source for language code takes precedence for this audio track. When you choose Follow input
     *        (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no
     *        languge code on the input track, the service uses the code that you specify in the setting Language code
     *        (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses
     *        the language code that you specify.
     * @see AudioLanguageCodeControl
     */

    public void setLanguageCodeControl(String languageCodeControl) {
        this.languageCodeControl = languageCodeControl;
    }

    /**
     * Specify which source for language code takes precedence for this audio track. When you choose Follow input
     * (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in the setting Language code (languageCode or
     * customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you
     * specify.
     * 
     * @return Specify which source for language code takes precedence for this audio track. When you choose Follow
     *         input (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's
     *         no languge code on the input track, the service uses the code that you specify in the setting Language
     *         code (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service
     *         uses the language code that you specify.
     * @see AudioLanguageCodeControl
     */

    public String getLanguageCodeControl() {
        return this.languageCodeControl;
    }

    /**
     * Specify which source for language code takes precedence for this audio track. When you choose Follow input
     * (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in the setting Language code (languageCode or
     * customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you
     * specify.
     * 
     * @param languageCodeControl
     *        Specify which source for language code takes precedence for this audio track. When you choose Follow input
     *        (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no
     *        languge code on the input track, the service uses the code that you specify in the setting Language code
     *        (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses
     *        the language code that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioLanguageCodeControl
     */

    public AudioDescription withLanguageCodeControl(String languageCodeControl) {
        setLanguageCodeControl(languageCodeControl);
        return this;
    }

    /**
     * Specify which source for language code takes precedence for this audio track. When you choose Follow input
     * (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in the setting Language code (languageCode or
     * customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you
     * specify.
     * 
     * @param languageCodeControl
     *        Specify which source for language code takes precedence for this audio track. When you choose Follow input
     *        (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no
     *        languge code on the input track, the service uses the code that you specify in the setting Language code
     *        (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses
     *        the language code that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioLanguageCodeControl
     */

    public AudioDescription withLanguageCodeControl(AudioLanguageCodeControl languageCodeControl) {
        this.languageCodeControl = languageCodeControl.toString();
        return this;
    }

    /**
     * Advanced audio remixing settings.
     * 
     * @param remixSettings
     *        Advanced audio remixing settings.
     */

    public void setRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
    }

    /**
     * Advanced audio remixing settings.
     * 
     * @return Advanced audio remixing settings.
     */

    public RemixSettings getRemixSettings() {
        return this.remixSettings;
    }

    /**
     * Advanced audio remixing settings.
     * 
     * @param remixSettings
     *        Advanced audio remixing settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withRemixSettings(RemixSettings remixSettings) {
        setRemixSettings(remixSettings);
        return this;
    }

    /**
     * Specify a label for this output audio stream. For example, "English", "Director commentary", or "track_2". For
     * streaming outputs, MediaConvert passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     * 
     * @param streamName
     *        Specify a label for this output audio stream. For example, "English", "Director commentary", or "track_2".
     *        For streaming outputs, MediaConvert passes this information into destination manifests for display on the
     *        end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * Specify a label for this output audio stream. For example, "English", "Director commentary", or "track_2". For
     * streaming outputs, MediaConvert passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     * 
     * @return Specify a label for this output audio stream. For example, "English", "Director commentary", or
     *         "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for
     *         display on the end-viewer's player device. For outputs in other output groups, the service ignores this
     *         setting.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * Specify a label for this output audio stream. For example, "English", "Director commentary", or "track_2". For
     * streaming outputs, MediaConvert passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     * 
     * @param streamName
     *        Specify a label for this output audio stream. For example, "English", "Director commentary", or "track_2".
     *        For streaming outputs, MediaConvert passes this information into destination manifests for display on the
     *        end-viewer's player device. For outputs in other output groups, the service ignores this setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withStreamName(String streamName) {
        setStreamName(streamName);
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
        if (getAudioChannelTaggingSettings() != null)
            sb.append("AudioChannelTaggingSettings: ").append(getAudioChannelTaggingSettings()).append(",");
        if (getAudioNormalizationSettings() != null)
            sb.append("AudioNormalizationSettings: ").append(getAudioNormalizationSettings()).append(",");
        if (getAudioSourceName() != null)
            sb.append("AudioSourceName: ").append(getAudioSourceName()).append(",");
        if (getAudioType() != null)
            sb.append("AudioType: ").append(getAudioType()).append(",");
        if (getAudioTypeControl() != null)
            sb.append("AudioTypeControl: ").append(getAudioTypeControl()).append(",");
        if (getCodecSettings() != null)
            sb.append("CodecSettings: ").append(getCodecSettings()).append(",");
        if (getCustomLanguageCode() != null)
            sb.append("CustomLanguageCode: ").append(getCustomLanguageCode()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageCodeControl() != null)
            sb.append("LanguageCodeControl: ").append(getLanguageCodeControl()).append(",");
        if (getRemixSettings() != null)
            sb.append("RemixSettings: ").append(getRemixSettings()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioDescription == false)
            return false;
        AudioDescription other = (AudioDescription) obj;
        if (other.getAudioChannelTaggingSettings() == null ^ this.getAudioChannelTaggingSettings() == null)
            return false;
        if (other.getAudioChannelTaggingSettings() != null && other.getAudioChannelTaggingSettings().equals(this.getAudioChannelTaggingSettings()) == false)
            return false;
        if (other.getAudioNormalizationSettings() == null ^ this.getAudioNormalizationSettings() == null)
            return false;
        if (other.getAudioNormalizationSettings() != null && other.getAudioNormalizationSettings().equals(this.getAudioNormalizationSettings()) == false)
            return false;
        if (other.getAudioSourceName() == null ^ this.getAudioSourceName() == null)
            return false;
        if (other.getAudioSourceName() != null && other.getAudioSourceName().equals(this.getAudioSourceName()) == false)
            return false;
        if (other.getAudioType() == null ^ this.getAudioType() == null)
            return false;
        if (other.getAudioType() != null && other.getAudioType().equals(this.getAudioType()) == false)
            return false;
        if (other.getAudioTypeControl() == null ^ this.getAudioTypeControl() == null)
            return false;
        if (other.getAudioTypeControl() != null && other.getAudioTypeControl().equals(this.getAudioTypeControl()) == false)
            return false;
        if (other.getCodecSettings() == null ^ this.getCodecSettings() == null)
            return false;
        if (other.getCodecSettings() != null && other.getCodecSettings().equals(this.getCodecSettings()) == false)
            return false;
        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageCodeControl() == null ^ this.getLanguageCodeControl() == null)
            return false;
        if (other.getLanguageCodeControl() != null && other.getLanguageCodeControl().equals(this.getLanguageCodeControl()) == false)
            return false;
        if (other.getRemixSettings() == null ^ this.getRemixSettings() == null)
            return false;
        if (other.getRemixSettings() != null && other.getRemixSettings().equals(this.getRemixSettings()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioChannelTaggingSettings() == null) ? 0 : getAudioChannelTaggingSettings().hashCode());
        hashCode = prime * hashCode + ((getAudioNormalizationSettings() == null) ? 0 : getAudioNormalizationSettings().hashCode());
        hashCode = prime * hashCode + ((getAudioSourceName() == null) ? 0 : getAudioSourceName().hashCode());
        hashCode = prime * hashCode + ((getAudioType() == null) ? 0 : getAudioType().hashCode());
        hashCode = prime * hashCode + ((getAudioTypeControl() == null) ? 0 : getAudioTypeControl().hashCode());
        hashCode = prime * hashCode + ((getCodecSettings() == null) ? 0 : getCodecSettings().hashCode());
        hashCode = prime * hashCode + ((getCustomLanguageCode() == null) ? 0 : getCustomLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageCodeControl() == null) ? 0 : getLanguageCodeControl().hashCode());
        hashCode = prime * hashCode + ((getRemixSettings() == null) ? 0 : getRemixSettings().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public AudioDescription clone() {
        try {
            return (AudioDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AudioDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

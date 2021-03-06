/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.autosuggest.implementation;

import com.microsoft.azure.cognitiveservices.search.autosuggest.models.AutoSuggestOptionalParameter;
import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.search.autosuggest.BingAutoSuggestSearch;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.search.autosuggest.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.search.autosuggest.models.ResponseFormat;
import com.microsoft.azure.cognitiveservices.search.autosuggest.models.SafeSearch;
import com.microsoft.azure.cognitiveservices.search.autosuggest.models.Suggestions;
import com.microsoft.rest.CollectionFormat;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BingAutoSuggestSearch.
 */
public class BingAutoSuggestSearchImpl implements BingAutoSuggestSearch {
    /** The Retrofit service to perform REST calls. */
    private BingAutoSuggestSearchService service;
    /** The service client containing this operation class. */
    private BingAutoSuggestSearchAPIImpl client;

    /**
     * Initializes an instance of BingAutoSuggestSearchImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BingAutoSuggestSearchImpl(Retrofit retrofit, BingAutoSuggestSearchAPIImpl client) {
        this.service = retrofit.create(BingAutoSuggestSearchService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BingAutoSuggestSearch to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BingAutoSuggestSearchService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.search.autosuggest.BingAutoSuggestSearch autoSuggest" })
        @GET("Suggestions")
        Observable<Response<ResponseBody>> autoSuggest(@Header("X-BingApis-SDK") String xBingApisSDK, @Header("Accept-Language") String acceptLanguage, @Header("Pragma") String pragma, @Header("User-Agent") String userAgent, @Header("X-MSEdge-ClientID") String clientId, @Header("X-MSEdge-ClientIP") String clientIp, @Header("X-Search-Location") String location, @Query("cc") String countryCode, @Query("mkt") String market, @Query("q") String query, @Query("safeSearch") SafeSearch safeSearch, @Query("setLang") String setLang, @Query("ResponseFormat") String responseFormat);

    }


    /**
     * The AutoSuggest API lets you send a search query to Bing and get back a list of suggestions. This section provides technical details about the query parameters and headers that you use to request suggestions and the JSON response objects that contain them.
     *
     * @param query The user's search term.
     * @param autoSuggestOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Suggestions object if successful.
     */
    public Suggestions autoSuggest(String query, AutoSuggestOptionalParameter autoSuggestOptionalParameter) {
        return autoSuggestWithServiceResponseAsync(query, autoSuggestOptionalParameter).toBlocking().single().body();
    }

    /**
     * The AutoSuggest API lets you send a search query to Bing and get back a list of suggestions. This section provides technical details about the query parameters and headers that you use to request suggestions and the JSON response objects that contain them.
     *
     * @param query The user's search term.
     * @param autoSuggestOptionalParameter the object representing the optional parameters to be set before calling this API
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Suggestions> autoSuggestAsync(String query, AutoSuggestOptionalParameter autoSuggestOptionalParameter, final ServiceCallback<Suggestions> serviceCallback) {
        return ServiceFuture.fromResponse(autoSuggestWithServiceResponseAsync(query, autoSuggestOptionalParameter), serviceCallback);
    }

    /**
     * The AutoSuggest API lets you send a search query to Bing and get back a list of suggestions. This section provides technical details about the query parameters and headers that you use to request suggestions and the JSON response objects that contain them.
     *
     * @param query The user's search term.
     * @param autoSuggestOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Suggestions object
     */
    public Observable<Suggestions> autoSuggestAsync(String query, AutoSuggestOptionalParameter autoSuggestOptionalParameter) {
        return autoSuggestWithServiceResponseAsync(query, autoSuggestOptionalParameter).map(new Func1<ServiceResponse<Suggestions>, Suggestions>() {
            @Override
            public Suggestions call(ServiceResponse<Suggestions> response) {
                return response.body();
            }
        });
    }

    /**
     * The AutoSuggest API lets you send a search query to Bing and get back a list of suggestions. This section provides technical details about the query parameters and headers that you use to request suggestions and the JSON response objects that contain them.
     *
     * @param query The user's search term.
     * @param autoSuggestOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Suggestions object
     */
    public Observable<ServiceResponse<Suggestions>> autoSuggestWithServiceResponseAsync(String query, AutoSuggestOptionalParameter autoSuggestOptionalParameter) {
        if (query == null) {
            throw new IllegalArgumentException("Parameter query is required and cannot be null.");
        }
        final String acceptLanguage = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.acceptLanguage() : null;
        final String pragma = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.pragma() : null;
        final String userAgent = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.userAgent() : this.client.userAgent();
        final String clientId = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.clientId() : null;
        final String clientIp = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.clientIp() : null;
        final String location = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.location() : null;
        final String countryCode = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.countryCode() : null;
        final String market = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.market() : null;
        final SafeSearch safeSearch = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.safeSearch() : null;
        final String setLang = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.setLang() : null;
        final List<ResponseFormat> responseFormat = autoSuggestOptionalParameter != null ? autoSuggestOptionalParameter.responseFormat() : null;

        return autoSuggestWithServiceResponseAsync(query, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, responseFormat);
    }

    /**
     * The AutoSuggest API lets you send a search query to Bing and get back a list of suggestions. This section provides technical details about the query parameters and headers that you use to request suggestions and the JSON response objects that contain them.
     *
     * @param query The user's search term.
     * @param acceptLanguage A comma-delimited list of one or more languages to use for user interface strings. The list is in decreasing order of preference. For additional information, including expected format, see [RFC2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). This header and the setLang query parameter are mutually exclusive; do not specify both. If you set this header, you must also specify the [cc](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-autosuggest-api-v7-reference#cc) query parameter. To determine the market to return results for, Bing uses the first supported language it finds from the list and combines it with the cc parameter value. If the list does not include a supported language, Bing finds the closest language and market that supports the request or it uses an aggregated or default market for the results. To determine the market that Bing used, see the BingAPIs-Market header. Use this header and the cc query parameter only if you specify multiple languages. Otherwise, use the [mkt](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-autosuggest-api-v7-reference#mkt) and [setLang](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-autosuggest-api-v7-reference#setlang) query parameters. A user interface string is a string that's used as a label in a user interface. There are few user interface strings in the JSON response objects. Any links to Bing.com properties in the response objects apply the specified language.
     * @param pragma By default, Bing returns cached content, if available. To prevent Bing from returning cached content, set the Pragma header to no-cache (for example, Pragma: no-cache).
     * @param userAgent The user agent originating the request. Bing uses the user agent to provide mobile users with an optimized experience. Although optional, you are encouraged to always specify this header. The user-agent should be the same string that any commonly used browser sends. For information about user agents, see [RFC 2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). The following are examples of user-agent strings. Windows Phone: Mozilla/5.0 (compatible; MSIE 10.0; Windows Phone 8.0; Trident/6.0; IEMobile/10.0; ARM; Touch; NOKIA; Lumia 822). Android: Mozilla / 5.0 (Linux; U; Android 2.3.5; en - us; SCH - I500 Build / GINGERBREAD) AppleWebKit / 533.1 (KHTML; like Gecko) Version / 4.0 Mobile Safari / 533.1. iPhone: Mozilla / 5.0 (iPhone; CPU iPhone OS 6_1 like Mac OS X) AppleWebKit / 536.26 (KHTML; like Gecko) Mobile / 10B142 iPhone4; 1 BingWeb / 3.03.1428.20120423. PC: Mozilla / 5.0 (Windows NT 6.3; WOW64; Trident / 7.0; Touch; rv:11.0) like Gecko. iPad: Mozilla / 5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit / 537.51.1 (KHTML, like Gecko) Version / 7.0 Mobile / 11A465 Safari / 9537.53
     * @param clientId Bing uses this header to provide users with consistent behavior across Bing API calls. Bing often flights new features and improvements, and it uses the client ID as a key for assigning traffic on different flights. If you do not use the same client ID for a user across multiple requests, then Bing may assign the user to multiple conflicting flights. Being assigned to multiple conflicting flights can lead to an inconsistent user experience. For example, if the second request has a different flight assignment than the first, the experience may be unexpected. Also, Bing can use the client ID to tailor web results to that client ID???s search history, providing a richer experience for the user. Bing also uses this header to help improve result rankings by analyzing the activity generated by a client ID. The relevance improvements help with better quality of results delivered by Bing APIs and in turn enables higher click-through rates for the API consumer. IMPORTANT: Although optional, you should consider this header required. Persisting the client ID across multiple requests for the same end user and device combination enables 1) the API consumer to receive a consistent user experience, and 2) higher click-through rates via better quality of results from the Bing APIs. Each user that uses your application on the device must have a unique, Bing generated client ID. If you do not include this header in the request, Bing generates an ID and returns it in the X-MSEdge-ClientID response header. The only time that you should NOT include this header in a request is the first time the user uses your app on that device. Use the client ID for each Bing API request that your app makes for this user on the device. Persist the client ID. To persist the ID in a browser app, use a persistent HTTP cookie to ensure the ID is used across all sessions. Do not use a session cookie. For other apps such as mobile apps, use the device's persistent storage to persist the ID. The next time the user uses your app on that device, get the client ID that you persisted. Bing responses may or may not include this header. If the response includes this header, capture the client ID and use it for all subsequent Bing requests for the user on that device. If you include the X-MSEdge-ClientID, you must not include cookies in the request.
     * @param clientIp The IPv4 or IPv6 address of the client device. The IP address is used to discover the user's location. Bing uses the location information to determine safe search behavior. Although optional, you are encouraged to always specify this header and the X-Search-Location header. Do not obfuscate the address (for example, by changing the last octet to 0). Obfuscating the address results in the location not being anywhere near the device's actual location, which may result in Bing serving erroneous results.
     * @param location A semicolon-delimited list of key/value pairs that describe the client's geographical location. Bing uses the location information to determine safe search behavior and to return relevant local content. Specify the key/value pair as &lt;key&gt;:&lt;value&gt;. The following are the keys that you use to specify the user's location. lat (required): The latitude of the client's location, in degrees. The latitude must be greater than or equal to -90.0 and less than or equal to +90.0. Negative values indicate southern latitudes and positive values indicate northern latitudes. long (required): The longitude of the client's location, in degrees. The longitude must be greater than or equal to -180.0 and less than or equal to +180.0. Negative values indicate western longitudes and positive values indicate eastern longitudes. re (required): The radius, in meters, which specifies the horizontal accuracy of the coordinates. Pass the value returned by the device's location service. Typical values might be 22m for GPS/Wi-Fi, 380m for cell tower triangulation, and 18,000m for reverse IP lookup. ts (optional): The UTC UNIX timestamp of when the client was at the location. (The UNIX timestamp is the number of seconds since January 1, 1970.) head (optional): The client's relative heading or direction of travel. Specify the direction of travel as degrees from 0 through 360, counting clockwise relative to true north. Specify this key only if the sp key is nonzero. sp (optional): The horizontal velocity (speed), in meters per second, that the client device is traveling. alt (optional): The altitude of the client device, in meters. are (optional): The radius, in meters, that specifies the vertical accuracy of the coordinates. Specify this key only if you specify the alt key. Although many of the keys are optional, the more information that you provide, the more accurate the location results are. Although optional, you are encouraged to always specify the user's geographical location. Providing the location is especially important if the client's IP address does not accurately reflect the user's physical location (for example, if the client uses VPN). For optimal results, you should include this header and the X-MSEdge-ClientIP header, but at a minimum, you should include this header.
     * @param countryCode A 2-character country code of the country where the results come from. This API supports only the United States market. If you specify this query parameter, it must be set to us. If you set this parameter, you must also specify the Accept-Language header. Bing uses the first supported language it finds from the languages list, and combine that language with the country code that you specify to determine the market to return results for. If the languages list does not include a supported language, Bing finds the closest language and market that supports the request, or it may use an aggregated or default market for the results instead of a specified one. You should use this query parameter and the Accept-Language query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. This parameter and the mkt query parameter are mutually exclusive???do not specify both.
     * @param market The market where the results come from. You are strongly encouraged to always specify the market, if known. Specifying the market helps Bing route the request and return an appropriate and optimal response. This parameter and the cc query parameter are mutually exclusive???do not specify both.
     * @param safeSearch Filter suggestions for adult content. The following are the possible filter values. Off: Return suggestions with adult text, images, or videos. Moderate: Return suggestion with adult text but not adult images or videos. Strict: Do not return news articles with adult text, images, or videos. If the request comes from a market that Bing's adult policy requires that safeSearch is set to Strict, Bing ignores the safeSearch value and uses Strict. If you use the site: query operator, there is the chance that the response may contain adult content regardless of what the safeSearch query parameter is set to. Use site: only if you are aware of the content on the site and your scenario supports the possibility of adult content. Possible values include: 'Off', 'Moderate', 'Strict'
     * @param setLang The language to use for user interface strings. Specify the language using the ISO 639-1 2-letter language code. For example, the language code for English is EN. The default is EN (English). Although optional, you should always specify the language. Typically, you set setLang to the same language specified by mkt unless the user wants the user interface strings displayed in a different language. This parameter and the Accept-Language header are mutually exclusive; do not specify both. A user interface string is a string that's used as a label in a user interface. There are few user interface strings in the JSON response objects. Also, any links to Bing.com properties in the response objects apply the specified language.
     * @param responseFormat The media type to use for the response. The following are the possible case-insensitive values: JSON, JSONLD. The default is JSON. If you specify JSONLD, the response body includes JSON-LD objects that contain the search results.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Suggestions object
     */
    public Observable<ServiceResponse<Suggestions>> autoSuggestWithServiceResponseAsync(String query, String acceptLanguage, String pragma, String userAgent, String clientId, String clientIp, String location, String countryCode, String market, SafeSearch safeSearch, String setLang, List<ResponseFormat> responseFormat) {
        if (query == null) {
            throw new IllegalArgumentException("Parameter query is required and cannot be null.");
        }
        Validator.validate(responseFormat);
        final String xBingApisSDK = "true";
        String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
                public Observable<ServiceResponse<Suggestions>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Suggestions> clientResponse = autoSuggestDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Suggestions> autoSuggestDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Suggestions, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Suggestions>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    @Override
    public BingAutoSuggestSearchAutoSuggestParameters autoSuggest() {
        return new BingAutoSuggestSearchAutoSuggestParameters(this);
    }

    /**
     * Internal class implementing BingAutoSuggestSearchAutoSuggestDefinition.
     */
    class BingAutoSuggestSearchAutoSuggestParameters implements BingAutoSuggestSearchAutoSuggestDefinition {
        private BingAutoSuggestSearchImpl parent;
        private String query;
        private String acceptLanguage;
        private String pragma;
        private String userAgent;
        private String clientId;
        private String clientIp;
        private String location;
        private String countryCode;
        private String market;
        private SafeSearch safeSearch;
        private String setLang;
        private List<ResponseFormat> responseFormat;

        /**
         * Constructor.
         * @param parent the parent object.
         */
        BingAutoSuggestSearchAutoSuggestParameters(BingAutoSuggestSearchImpl parent) {
            this.parent = parent;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withQuery(String query) {
            this.query = query;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withAcceptLanguage(String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withPragma(String pragma) {
            this.pragma = pragma;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withLocation(String location) {
            this.location = location;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withMarket(String market) {
            this.market = market;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withSafeSearch(SafeSearch safeSearch) {
            this.safeSearch = safeSearch;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withSetLang(String setLang) {
            this.setLang = setLang;
            return this;
        }

        @Override
        public BingAutoSuggestSearchAutoSuggestParameters withResponseFormat(List<ResponseFormat> responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        @Override
        public Suggestions execute() {
        return autoSuggestWithServiceResponseAsync(query, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, responseFormat).toBlocking().single().body();
    }

        @Override
        public Observable<Suggestions> executeAsync() {
            return autoSuggestWithServiceResponseAsync(query, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, responseFormat).map(new Func1<ServiceResponse<Suggestions>, Suggestions>() {
                @Override
                public Suggestions call(ServiceResponse<Suggestions> response) {
                    return response.body();
                }
            });
        }
    }

}

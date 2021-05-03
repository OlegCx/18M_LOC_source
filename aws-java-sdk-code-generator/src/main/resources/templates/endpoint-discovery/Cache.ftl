${fileHeader}
package ${metadata.packageName}.endpointdiscovery;

import com.amazonaws.endpointdiscovery.EndpointDiscoveryRefreshCache;
import com.amazonaws.endpointdiscovery.Constants;
import ${metadata.packageName}.${metadata.syncInterface};
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${className} extends EndpointDiscoveryRefreshCache<String> {

    private static final Log log = LogFactory.getLog(${className}.class);

    public ${className}(${metadata.syncInterface} client) {
        super(new ${className}Loader(client));
    }

    @Override
    public URI get(String key, boolean required, URI defaultEndpoint) {

        URI endpoint = cache.get(key);

        if (endpoint != null) {
            return endpoint;
        } else {
            if (!required) {
                cache.put(key, defaultEndpoint);
            }
            return discoverEndpoint(key, required, defaultEndpoint);
        }
    }

    @Override
    public URI put(String key, Map<String, String> endpointDetails, URI defaultEndpoint) {
        URI discoveredEndpoint = URI.create(String.format("%s://%s", defaultEndpoint.getScheme(), endpointDetails.get(Constants.ENDPOINT)));

        cache.put(key, discoveredEndpoint);
        loadAndScheduleEvict(key, Long.valueOf(endpointDetails.get(Constants.CACHE_PERIOD)), TimeUnit.MINUTES);

        log.debug("Cached new endpoint from service: " + discoveredEndpoint.toASCIIString());
        log.debug("Cached endpoint TTL: " + endpointDetails.get(Constants.CACHE_PERIOD) + " minutes");

        return discoveredEndpoint;
    }
}

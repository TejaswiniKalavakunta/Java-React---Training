package com.hexaware.Strings;

import java.util.HashMap;
import java.util.Map;

class URLParser {

    private String url;

    public URLParser(String url) {
        this.url = url;
    }

    public String getProtocol() {
        return url.split("://")[0];
    }

    public String getHost() {
        String[] parts = url.split("://")[1].split("/", 2);
        return parts[0];
    }

    public String getPath() {
        String[] parts = url.split("://")[1].split("/", 2);
        return parts.length > 1 ? "/" + parts[1] : "";
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String> queryParams = new HashMap<>();
        String[] parts = url.split("\\?");
        if (parts.length > 1) {
            String queryString = parts[1];
            String[] pairs = queryString.split("&");
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                if (keyValue.length == 2) {
                    queryParams.put(keyValue[0], keyValue[1]);
                }
            }
        }
        return queryParams;
    }
}

class URLBuilder {

    private String protocol;
    private String host;
    private String path;
    private Map<String, String> queryParameters;

    public URLBuilder() {
        this.protocol = "http";
        this.host = "";
        this.path = "";
        this.queryParameters = new HashMap<>();
    }

    public URLBuilder setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public URLBuilder setHost(String host) {
        this.host = host;
        return this;
    }

    public URLBuilder setPath(String path) {
        this.path = path;
        return this;
    }

    public URLBuilder addQueryParameter(String key, String value) {
        queryParameters.put(key, value);
        return this;
    }

    public String build() {
        StringBuilder url = new StringBuilder();
        url.append(protocol).append("://").append(host).append(path);

        if (!queryParameters.isEmpty()) {
            url.append("?");
            for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
                url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
            url.deleteCharAt(url.length() - 1); // Remove the trailing "&"
        }

        return url.toString();
    }
}

public class UrlParserBuilder {
	
	public static void main(String[] args) {
        // Parse URL
        String sampleUrl = "https://www.example.com/path/to/resource?param1=value1&param2=value2";
        URLParser urlParser = new URLParser(sampleUrl);

        System.out.println("Protocol: " + urlParser.getProtocol());
        System.out.println("Host: " + urlParser.getHost());
        System.out.println("Path: " + urlParser.getPath());
        System.out.println("Query Parameters: " + urlParser.getQueryParameters());

        // Build URL
        URLBuilder urlBuilder = new URLBuilder()
                .setProtocol("https")
                .setHost("www.example.com")
                .setPath("/new/resource")
                .addQueryParameter("param3", "value3")
                .addQueryParameter("param4", "value4");

        String newUrl = urlBuilder.build();
        System.out.println("Constructed URL: " + newUrl);
    }

}

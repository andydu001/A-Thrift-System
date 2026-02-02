package org.example;

import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClient;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.web.server.session.DefaultWebSessionManager;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WEBSE extends DefaultWebSessionManager {

    WEBSE(RestClient restClient) throws URISyntaxException, IOException {

        rer(new JdkClientHttpRequestFactory());

    }
    void rer(JdkClientHttpRequestFactory jdkClientHttpRequestFactory) throws URISyntaxException, IOException {

        System.out.println(jdkClientHttpRequestFactory.createRequest(new URI("https://andywill.com"), HttpMethod.GET));
    }

}

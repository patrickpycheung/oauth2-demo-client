package com.somecompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/client")
public class Oauth2DemoClientController {

    private String msg = "";

    @Autowired
    private WebClient webClient;

    @Value("${resourceServer.url}")
    private String resourceServerUrl;

    @Value("${resourceServer.helloPath}")
    private String resourceServerHelloPath;

    @GetMapping("/")
    public String home(@AuthenticationPrincipal OidcUser user) {
        return "Welcome " + user.getFullName();
    }

    @GetMapping("/hello")
    public String sayHello() {
        return webClient.get()
                .uri(resourceServerUrl + resourceServerHelloPath)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}

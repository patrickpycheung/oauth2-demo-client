# OAuth2 client demonstration

  Table of contents

  * [**About the application**](#about-the-application)
  * [**Version history**](#version-history)

## **About the application**

This application is a demonstration of implementing a Spring Boot client application secured with OAuth2. It performs the following:

  * Secures all HTTP access, unless whitelisted otherwise
  * Handles the login process with the OAuth2 authentication code flow
  * Obtains profile information with OIDC ID token
  * Acts as a launch point to backend APIs hosted in the resource server. It will automatically append the access token (JWT token) in the request header on the API call from client application to resource server
<br/>
<br/>
Note: 
<br/>
Git Repository for the resource server application:
<br/>
https://github.com/patrickpycheung/oauth2-demo-resource-server
<br/>
<br/>
<img src="https://bn1301files.storage.live.com/y4mhxaa2NluJhE1D0oMKw449SOEkg1kzwVZaFrRPEB_0Ej4MxZ2tKVQHbspNl_2uqnyqwnHLJF6PfcPlB1ti3CVra3P8Y8Mkg6c_X5cNZQJMzRWaxp_iqsDTinBhsOaN6EZIctLWT_dx-LHxDB0NQrMy9LcDaggOj5L61xL8Hlx6SpybdXpA9SC1kKCpAgvBQWO?width=1368&height=1344&cropmode=none" alt="Okta_Login_Page">

## **Version history**

  | Editor | Version | Date |Description|
  | --- | --- | --- | --- |
  | Patrick Cheung | 1.0.0| 2 Apr 2021 |Initial release|

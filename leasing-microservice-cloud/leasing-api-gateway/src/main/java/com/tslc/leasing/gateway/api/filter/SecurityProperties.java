package com.tslc.leasing.gateway.api.filter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "leasingSecurity")
public class SecurityProperties {

    private String unauthorizedUrl;

    private Map<String, String> filterChainDefinitions;

    private String loginSecurityUrl;

    public String getUnauthorizedUrl() {
        return unauthorizedUrl;
    }

    public void setUnauthorizedUrl(String unauthorizedUrl) {
        this.unauthorizedUrl = unauthorizedUrl;
    }

    public Map<String, String> getFilterChainDefinitions() {
        return filterChainDefinitions;
    }

    public void setFilterChainDefinitions(Map<String, String> filterChainDefinitions) {
        this.filterChainDefinitions = filterChainDefinitions;
    }

    public String getLoginSecurityUrl() {
        return loginSecurityUrl;
    }

    public void setLoginSecurityUrl(String loginSecurityUrl) {
        this.loginSecurityUrl = loginSecurityUrl;
    }
}

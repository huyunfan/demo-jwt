package com.example.demo.util;

import org.springframework.util.StringUtils;

/**
 * @author Leon.Yu
 * @date 2017/9/21
 */
public class JwtUtils {
    private static final String AUTHORIZATION_HEADER_PREFIX = "Bearer ";

    /**
     * remove 'Bearer ' string
     *
     * @param authorizationHeader
     * @return
     */
    public static String getRawToken(String authorizationHeader) {
        return authorizationHeader.substring(AUTHORIZATION_HEADER_PREFIX.length());
    }

    public static String getTokenHeader(String rawToken) {
        return AUTHORIZATION_HEADER_PREFIX + rawToken;
    }

    public static boolean validate(String authorizationHeader) {
        return StringUtils.hasText(authorizationHeader) && authorizationHeader.startsWith(AUTHORIZATION_HEADER_PREFIX);
    }

    public static String getAuthorizationHeaderPrefix() {
        return AUTHORIZATION_HEADER_PREFIX;
    }
}

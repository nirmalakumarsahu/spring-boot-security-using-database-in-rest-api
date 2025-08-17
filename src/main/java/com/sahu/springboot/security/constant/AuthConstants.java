package com.sahu.springboot.security.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AuthConstants {
    public final String LOGIN_URL = "/login";
    public final String REGISTRATION_URL = "/registration";
    public final String LOGOUT_URL = "/logout";
    public final String DASHBOARD_URL = "/dashboard";
    public final String USER_DASHBOARD_URL = "/user-dashboard";
    public final String ADMIN_DASHBOARD_URL = "/admin-dashboard";

    public final String ROLE_USER = "USER";
    public final String ROLE_ADMIN = "ADMIN";
    public final String ROLE_PREFIX = "ROLE_";
}

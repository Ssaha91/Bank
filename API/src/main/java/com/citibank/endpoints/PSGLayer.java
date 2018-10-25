package com.citibank.endpoints;

public interface PSGLayer {

    String AUTHENTICATE_CUSTOMER                                            = "/private/v1/oauth2/auth";
    String AUTHENTICATE_CUSTOMER_CCS                                        = "/private/auth";
    String RETRIEVE_SECURITY_KEY                                            = "/security/e2eKey";
    String VERIFY_CUSTOMER                                                  = "/private/v1/oauth2/customerVerification";
    String GET_CUSTOMER_CONSENT_INFORMATION                                 = "/private/v1/oauth2/accounts";
    String NOTIFY_CUSTOMER_WITH_EMAIL_WHEN_OPTIN                            = "/private/v1/oauth2/customers/notification";
    String NOTIFY_CUSTOMER_WITH_EMAIL_WHEN_REVOKE_TOKEN                     = "/private/v1/oauth2/revoke/customers/notification";

}

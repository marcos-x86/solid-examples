package com.jalasoft.examples.isp.original;

/**
 * Defines request base abstraction.
 */
public interface IRequest {

    /**
     * Sends request using HTTPS.
     */
    void sendByHttps();

    /**
     * Sends request using SMTP.
     */
    void sendBySmtp();
}

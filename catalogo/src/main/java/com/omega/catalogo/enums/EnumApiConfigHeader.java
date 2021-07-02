package com.omega.catalogo.enums;

/**
 *
 * @author GiovanniFC
 */
public enum EnumApiConfigHeader {

    MIME("MIME"),
    MIME_AUTHENTICATION("MIME_AUTHENTICATION"),;

    private final String key;

    EnumApiConfigHeader(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}

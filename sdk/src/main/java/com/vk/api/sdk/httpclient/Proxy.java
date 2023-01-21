/*
 * Copyright (C) 2023 thevalidator
 */
package com.vk.api.sdk.httpclient;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Proxy {

    private String adress;
    private Integer port;

    public Proxy() {
    }

    public Proxy(String adress, int port) {
        this.adress = adress;
        this.port = port;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}

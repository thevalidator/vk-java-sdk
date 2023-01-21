/*
 * Copyright (C) 2023 thevalidator
 */

package com.vk.api.sdk.client.actors;

import com.vk.api.sdk.client.Utils;
import java.util.Objects;


/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class CustomUserActor implements Actor {

    private String accessToken;
    private String coveredAccessToken;
    private String phone;
    private String userName;

    public CustomUserActor(String accessToken) {
        this.accessToken = accessToken;
        this.coveredAccessToken = Utils.coverAccessToken(accessToken);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public Integer getId() {
        return null;
    }

    public String getPhone() {
        return phone;
    }

    public CustomUserActor setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomUserActor userActor = (CustomUserActor) o;
        return Objects.equals(accessToken, userActor.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserActor{");
        sb.append(", accessToken='").append(coveredAccessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }

}

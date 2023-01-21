/*
 * Copyright (C) 2023 thevalidator
 */

package com.vk.api.sdk.client.actors;

import com.vk.api.sdk.client.Utils;
import java.util.Objects;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class UserActorWithoutId extends UserActor {
    
    private String userName;
    
    public UserActorWithoutId(String accessToken) {
        super(null, accessToken);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserActorWithoutId userActor = (UserActorWithoutId) o;
        return Objects.equals(getAccessToken(), userActor.getAccessToken());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAccessToken());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserActorWithoutId{");
        sb.append(", accessToken='").append(Utils.coverAccessToken(getAccessToken())).append('\'');
        sb.append('}');
        return sb.toString();
    }

}

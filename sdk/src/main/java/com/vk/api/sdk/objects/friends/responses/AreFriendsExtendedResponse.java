package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.friends.FriendStatus;
import java.util.Objects;

/**
 * AreFriendsExtendedResponse object
 */
public class AreFriendsExtendedResponse extends FriendStatus implements Validable {
    /**
     * Is friend request from other user unread
     */
    @SerializedName("is_request_unread")
    private Boolean isRequestUnread;

    public Boolean getIsRequestUnread() {
        return isRequestUnread;
    }

    public AreFriendsExtendedResponse setIsRequestUnread(Boolean isRequestUnread) {
        this.isRequestUnread = isRequestUnread;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRequestUnread);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreFriendsExtendedResponse areFriendsExtendedResponse = (AreFriendsExtendedResponse) o;
        return Objects.equals(isRequestUnread, areFriendsExtendedResponse.isRequestUnread);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AreFriendsExtendedResponse{");
        sb.append("isRequestUnread=").append(isRequestUnread);
        sb.append('}');
        return sb.toString();
    }
}

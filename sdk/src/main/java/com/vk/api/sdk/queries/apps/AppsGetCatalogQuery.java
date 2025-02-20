// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.apps.GetCatalogFilter;
import com.vk.api.sdk.objects.apps.GetCatalogSort;
import com.vk.api.sdk.objects.apps.responses.GetCatalogResponse;
import com.vk.api.sdk.objects.users.Fields;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getCatalog method
 */
public class AppsGetCatalogQuery extends AbstractQueryBuilder<AppsGetCatalogQuery, GetCatalogResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param count value of "count" parameter. Minimum is 0. By default 100.
     */
    public AppsGetCatalogQuery(VkApiClient client, UserActor actor, int count) {
        super(client, "apps.getCatalog", GetCatalogResponse.class);
        accessToken(actor.getAccessToken());
        count(count);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param count value of "count" parameter. Minimum is 0. By default 100.
     */
    public AppsGetCatalogQuery(VkApiClient client, ServiceActor actor, int count) {
        super(client, "apps.getCatalog", GetCatalogResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        count(count);
    }

    /**
     * Sort order: 'popular_today' — popular for one day (default), 'visitors' — by visitors number , 'create_date' — by creation date, 'growth_rate' — by growth rate, 'popular_week' — popular for one week
     *
     * @param value value of "sort" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery sort(GetCatalogSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Offset required to return a specific subset of apps.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of apps to return.
     *
     * @param value value of "count" parameter. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppsGetCatalogQuery count(int value) {
        return unsafeParam("count", value);
    }

    /**
     * Set platform
     *
     * @param value value of "platform" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery platform(String value) {
        return unsafeParam("platform", value);
    }

    /**
     * '1' — to return additional fields 'screenshots', 'MAU', 'catalog_position', and 'international'. If set, 'count' must be less than or equal to '100'. '0' — not to return additional fields (default).
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set return friends
     *
     * @param value value of "return friends" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery returnFriends(Boolean value) {
        return unsafeParam("return_friends", value);
    }

    /**
     * Set name case
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery nameCase(String value) {
        return unsafeParam("name_case", value);
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Set genre id
     *
     * @param value value of "genre id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery genreId(Integer value) {
        return unsafeParam("genre_id", value);
    }

    /**
     * 'installed' — to return list of installed apps (only for mobile platform).
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery filter(GetCatalogFilter value) {
        return unsafeParam("filter", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected AppsGetCatalogQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("count", "access_token");
    }
}

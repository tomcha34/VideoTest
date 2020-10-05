package com.android.training.video;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts(@QueryMap Map<String, String> parameters);

}

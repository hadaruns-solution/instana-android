package com.example.myapplication;// Activity1.java

// ApiService.java
import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("comments/1")
    Call<JsonElement> getUser();

    @GET("albums/2")
    Call<JsonElement> getPost();

    @GET("comments/1")
    Call<JsonElement> getComment();
}

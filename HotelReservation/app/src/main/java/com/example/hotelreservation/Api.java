package com.example.hotelreservation;

import retrofit.RestAdapter;

public class Api {

    public static com.example.hotelreservation.ApiInterface getClient() {
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("http://localhost:8080/")
                .build();
        com.example.hotelreservation.ApiInterface api = adapter.create(com.example.hotelreservation.ApiInterface.class);
        return api;
    }
}

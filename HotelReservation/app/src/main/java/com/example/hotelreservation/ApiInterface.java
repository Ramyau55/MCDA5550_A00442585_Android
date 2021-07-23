package com.example.hotelreservation;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface ApiInterface {

    @GET("/getListOfHotels")
    public void getListOfHotels(Callback<List<HotelListData>> callback);
}

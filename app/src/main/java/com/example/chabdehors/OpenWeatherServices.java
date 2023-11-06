package com.example.chabdehors;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OpenWeatherServices<Forecast> {
    @GET("forecast?id=524901&appid=b6907d289e10d714a6e88b30761fae22")
    Call<Forecast> getForcast();
}

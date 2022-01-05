package com.example.verificationnumber.WebServices;


import com.example.verificationnumber.Model.DirectionPlaceModel.DirectionResponseModel;
import com.example.verificationnumber.Model.GooglePlaceModel.GoogleResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {

    @GET
    Call<GoogleResponseModel> getNearByPlaces(@Url String url);

    @GET
    Call<DirectionResponseModel> getDirection(@Url String url);
}

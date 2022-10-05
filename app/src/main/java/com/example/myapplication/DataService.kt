package com.example.myapplication

import retrofit2.http.GET

interface DataService {
  @GET("gifs/trending?api_key=ZRQiUQe8CAClJHcDRek93ar44nBBhG4u")
  fun getGifs(): retrofit2.Call<DataResult>
}
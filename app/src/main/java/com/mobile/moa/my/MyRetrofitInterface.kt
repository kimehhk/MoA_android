package com.mobile.moa.my

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.http.*

/* written by keh
date: 22.08.01 */

interface MyRetrofitInterface {

    @POST("/signUp")
    fun signUp(
        @Body user: RequestSignUp
    ) : retrofit2.Call<MyResponse>

    @POST("/login")
    fun login(
        @Body email: String, @Body password: String
    ) : retrofit2.Call<LoginResponse>

    @GET("/myPage/{id}")
    fun getMyPage(@Path("id") id: Long) : retrofit2.Call<MyResponse>

//    ?input=Museum%20of%20Contemporary%20Art%20Australia
    //    &inputtype=textquery
    //    &fields=formatted_address%2Cname%2Crating%2Copening_hours%2Cgeometry&key=YOUR_API_KEY")
//
    @GET("json")
    fun searchSchool(
        @Query("fields") fields: String,
        @Query("input") input: String,
        @Query("inputtype") type: String,
        @Query("key") key: String
    ) : retrofit2.Call<SchoolResponse>


    @PUT("/myPage/school/{id}")
    fun putSchool(
        @Path("id") id: Long,
        @Body requestSchool: RequestSchool
    ) : retrofit2.Call<MyResponse>

    @PUT("/myPage/update/{id}")
    fun updateMyPage(@Path("id") id: Long) : retrofit2.Call<MyResponse>

    @DELETE("/myPage/{id}")
    fun deleteMy(@Path("id") id: Long) : retrofit2.Call<ResponseBody>
}

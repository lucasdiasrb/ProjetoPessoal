package br.fasam.mobile.app.resources;

import java.util.List;

import br.fasam.mobile.app.model.Photos;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PhotoResource {

    //  OPTIONS https://jsonplaceholder.typicode.com/photos
    //GET,HEAD,PUT,PATCH,POST,DELETE

    @POST("photos")
    Call<Photos> post(@Body Photos photos);

    //GET HTTP://DOMINIO/API/PHOTOS
    @GET("photos")
    Call<List<Photos>> get();

    @GET("photos/{id}")
    Call<Photos> getById(@Path("id") Integer id);

    @PUT("photos/{id}")
    Call<Photos> put(@Path("id") Integer id, @Body Photos photos);

    @PATCH("photos/{id}")
    Call<Photos> patch(@Path("id") Integer id, @Body Photos photos);

}

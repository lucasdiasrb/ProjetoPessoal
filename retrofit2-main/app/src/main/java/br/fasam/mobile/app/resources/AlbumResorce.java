package br.fasam.mobile.app.resources;

import java.util.List;

import br.fasam.mobile.app.model.DefaultModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AlbumResorce {
    @GET("albums")
    Call<List<DefaultModel>> get();

    @GET("albums/{id}")
    Call<DefaultModel> get(@Path("id") int id);
}

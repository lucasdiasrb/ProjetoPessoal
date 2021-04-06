package br.fasam.mobile.app.bootstrap;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * PASSO 2
 * 2. Criar classe de bootsrap que contém:
 * 2.1. Endpoint do serviço
 * 2.2 fábrica de converter (json)
 * 2.3 tipo do converter (json)
 */
public class ApiBoostrapRetrofit {

    public static final String ENDPOINT="https://swapi.dev/";

    public static Retrofit init(){
        return new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

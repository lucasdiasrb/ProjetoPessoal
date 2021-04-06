package br.fasam.mobile.app.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import br.fasam.mobile.app.R;
import br.fasam.mobile.app.bootstrap.ApiBoostrapRetrofit;
import br.fasam.mobile.app.bootstrap.ApiBoostrapRetrofit2;
import br.fasam.mobile.app.model.DefaultModel;
import br.fasam.mobile.app.model.Photos;
import br.fasam.mobile.app.model.Todo;
import br.fasam.mobile.app.resources.AlbumResorce;
import br.fasam.mobile.app.resources.PhotoResource;
import br.fasam.mobile.app.resources.PlanetResource;
import br.fasam.mobile.app.resources.TodoResource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Tela03 extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela03);
    }

    /**
     * 5. Apresentar os dados numa tela preterida.
     * @param view
     */
    public void searchPeople(View view) {
        jsonPlaceHolderPhotos();
//        this.jsonPlaceHolderTodos();
//        album();

    }

    public void jsonPlaceHolderPhotos(){
        //Inidicar instância do RETROFIT
        Retrofit retrofit = ApiBoostrapRetrofit2.init();

        //Chamar contrato (resource) que irá fazer a operação GET,POST,PUT,DELETE,OPTIONS
        //A operação permitida depente da API que você está consultando
        //Neste ponto estamos fazendo um BIND para o RECURSO(RESOURCE) requerido
        PhotoResource photoResource = retrofit.create(PhotoResource.class);

        //Fazer a chamada do serviço
        //Neste ponto a requisição ao ENDPOINT foi realizada
        Call<List<Photos>> fila = photoResource.get();

        //Adicionar a chamada do serviço na FILA (QUEUE) do RETROFIT e tratar os dados como quiser
        fila.enqueue(new Callback<List<Photos>>() {
            @Override
            public void onResponse(Call<List<Photos>> call, Response<List<Photos>> response) {

                if(call.isExecuted()){
                    Log.i("fasam","consulta realizada");

                    //NESTE PONTO LISTVIEW, OPCIONAL
                }
                //Se chegar aqui DEU CERTO
                Log.i("fasam","Acessou método");

                //Neste vc coloca a lista dentro de um ADAPTER para exibir numa LISTVIEW
                //NESTE PONTO LISTVIEW, OPCIONAL
            }

            @Override
            public void onFailure(Call<List<Photos>> call, Throwable t) {
                //CHEGOU AQUI DEU ERRADO
                Toast.makeText(getApplicationContext(),
                        "Erro ao consultar registro no serviço",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void jsonPlaceHolderTodos(){
        //Inidicar instância do RETROFIT
        Retrofit retrofit = ApiBoostrapRetrofit2.init();

        //Chamar contrato (resource) que irá fazer a operação GET,POST,PUT,DELETE,OPTIONS
        //A operação permitida depente da API que você está consultando
        //Neste ponto estamos fazendo um BIND para o RECURSO(RESOURCE) requerido
        TodoResource todoResource = retrofit.create(TodoResource.class);

        //Fazer a chamada do serviço
        //Neste ponto a requisição ao ENDPOINT foi realizada
        Call<List<Todo>> fila = todoResource.get();

        //Adicionar a chamada do serviço na FILA (QUEUE) do RETROFIT e tratar os dados como quiser
        fila.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {

                if(call.isExecuted()){
                    Log.i("fasam","consulta realizada");
                }
                //Se chegar aqui DEU CERTO
                Log.i("fasam","Acessou método");

                //Neste vc coloca a lista dentro de um ADAPTER para exibir numa LISTVIEW
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {
                //CHEGOU AQUI DEU ERRADO
                Toast.makeText(getApplicationContext(),
                        "Erro ao consultar registro no serviço",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void starwars(){
        //Inidicar instância do RETROFIT
        Retrofit retrofit = ApiBoostrapRetrofit.init();

        //Chamar contrato (resource) que irá fazer a operação GET,POST,PUT,DELETE,OPTIONS
        //A operação permitida depente da API que você está consultando
        //Neste ponto estamos fazendo um BIND para o RECURSO(RESOURCE) requerido
        PlanetResource planetResource = retrofit.create(PlanetResource.class);

        //Fazer a chamada do serviço
        //Neste ponto a requisição ao ENDPOINT foi realizada
        Call<List<DefaultModel>> fila = planetResource.get();

        //Adicionar a chamada do serviço na FILA (QUEUE) do RETROFIT e tratar os dados como quiser
        fila.enqueue(new Callback<List<DefaultModel>>() {
            @Override
            public void onResponse(Call<List<DefaultModel>> call, Response<List<DefaultModel>> response) {

                if(call.isExecuted()){
                    Log.i("fasam","consulta realizada");
                }
                //Se chegar aqui DEU CERTO
                Log.i("fasam","Acessou método");
                Log.i("fasam",response.body().toString());
            }

            @Override
            public void onFailure(Call<List<DefaultModel>> call, Throwable t) {
                //CHEGOU AQUI DEU ERRADO
                Toast.makeText(getApplicationContext(),
                        "Erro ao consultar registro no serviço",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
    public void album(){
        //Inidicar instância do RETROFIT
        Retrofit retrofit = ApiBoostrapRetrofit.init();

        //Chamar contrato (resource) que irá fazer a operação GET,POST,PUT,DELETE,OPTIONS
        //A operação permitida depente da API que você está consultando
        //Neste ponto estamos fazendo um BIND para o RECURSO(RESOURCE) requerido
        AlbumResorce albumResorce =  retrofit.create(AlbumResorce.class);

        //Fazer a chamada do serviço
        //Neste ponto a requisição ao ENDPOINT foi realizada
        Call<List<DefaultModel>> fila = albumResorce.get();

        //Adicionar a chamada do serviço na FILA (QUEUE) do RETROFIT e tratar os dados como quiser
        fila.enqueue(new Callback<List<DefaultModel>>() {
            @Override
            public void onResponse(Call<List<DefaultModel>> call, Response<List<DefaultModel>> response) {

                if(call.isExecuted()){
                    Log.i("fasam","consulta realizada");
                }
                //Se chegar aqui DEU CERTO
                Log.i("fasam","Acessou método");
                Log.i("fasam",response.body().toString());
            }

            @Override
            public void onFailure(Call<List<DefaultModel>> call, Throwable t) {
                //CHEGOU AQUI DEU ERRADO
                Toast.makeText(getApplicationContext(),
                        "Erro ao consultar registro no serviço",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
};



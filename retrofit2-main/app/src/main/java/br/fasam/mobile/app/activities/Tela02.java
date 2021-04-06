package br.fasam.mobile.app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.fasam.mobile.app.R;

public class Tela02 extends DebugActivity {

    EditText txtName;
    EditText txtHeight;
    EditText txtMass;

    ListView listViewPeople;
    List<Map<String,String>> mapList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);
    }

    public void addPeople(View view) {

        //Capturar dados entrada

        txtName = findViewById(R.id.txtName);
        txtHeight = findViewById(R.id.txtHeight);
        txtMass = findViewById(R.id.txtMass);

        //Processar

        String name, height, mass;
        name = txtName.getText().toString();
        height = txtHeight.getText().toString();
        mass = txtMass.getText().toString();

        HashMap<String,String> map = new HashMap<>();
        map.put("name", name);
        map.put("height", height);
        map.put("mass", mass);

        //Adicionar dados no arrayList
        mapList.add(map);


        //Mapear from /to para simleAdapter
        String[] from = {"name","height","mass"};
        int[] to = {R.id.txtViewName, R.id.txtViewHeight, R.id.txtViewMass};

        //Criar instância para o simple adapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                mapList,
                R.layout.item_people,
                from,
                to
        );

        //Preencher referência de listView com o adpater
        ListView listViewPeople = findViewById(R.id.listViewPeople);


        //Fazer o acoplamento adapter+list
        listViewPeople.setAdapter(simpleAdapter);
    }
}
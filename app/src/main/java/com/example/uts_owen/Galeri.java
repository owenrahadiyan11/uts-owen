package com.example.uts_owen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Galeri extends AppCompatActivity implements GaleriAdapter.OnAdapterClickListener {
    GaleriClass galeri;
    RecyclerView recyclerView;
    private List<GaleriClass> galeris = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeri);

        recyclerView = findViewById(R.id.rv_galeri);
        galeris = new ArrayList<GaleriClass>();
        galeris = initData();
        GaleriAdapter adapter = new GaleriAdapter(galeris,this);
        adapter.setListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);

    }

    public ArrayList<GaleriClass> initData(){
        ArrayList<GaleriClass> list = new ArrayList<>();
        list.add(new GaleriClass(1,"Rp. 25.000","onigiri"));
        list.add(new GaleriClass(2,"Rp. 25.000","ramen"));
        list.add(new GaleriClass(2,"Rp. 12.000","soba"));
        list.add(new GaleriClass(2,"Rp. 30.000","sushsi"));
        list.add(new GaleriClass(2,"Rp. 10.000","takoyaki"));
        return list;
    }

    @Override
    public void DetailonClick(GaleriClass galeriClass) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("id",galeriClass.getId());
        intent.putExtra("nama",galeriClass.getName());
        intent.putExtra("photo",galeriClass.getPhoto());
        startActivity(intent);
    }
}

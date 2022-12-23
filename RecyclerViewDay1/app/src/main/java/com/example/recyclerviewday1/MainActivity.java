package com.example.recyclerviewday1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView productsRecyclerView;
    private ArrayList<String> products;
    private  ProductsAdapter productsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initProducts();
        initViews();
    }

    private void initViews(){
        productsRecyclerView = findViewById(R.id.productsRecyclerView);
        productsRecyclerView.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        ));

        productsAdapter = new ProductsAdapter(products);
        productsRecyclerView.setAdapter(productsAdapter);
    }

    private void initProducts(){
            products = new ArrayList<>();
            for(int i = 0; i<5; i++){
                products.add("Mixer"+i);
                products.add("Grinder"+i);
                products.add("Food Processor"+i);
                products.add("Microwave"+i);
                products.add("Refrigerator"+i);
            }
    }
}
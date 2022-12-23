package com.example.recyclerviewday1;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    private ArrayList<String> products;

    public ProductsAdapter(ArrayList<String> products){
        this.products = products;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        public TextView txtProduct;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtProduct = (TextView) itemView;
        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView txtProduct = new TextView(parent.getContext());

        txtProduct.setTextColor(Color.BLACK);
        txtProduct.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        txtProduct.setTextSize(30);
        txtProduct.setPadding(20,20,20,20);

        return new ProductViewHolder(txtProduct);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Log.e("tag","onBindViewHolderMethod Called" + position);
        holder.txtProduct.setText(products.get(position));
    }

    @Override
    public int getItemCount() {
        Log.e("tag","getItemCountMethod Called"+products.size());
        return products.size();
    }


}

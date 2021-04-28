package com.example.ongiuaky4;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class CakeAdapter extends RecyclerView.Adapter<CakeViewHolder> {
    private Context context;
    private ArrayList<Cake> cakeList;
    private OnClickItemCake onClickItemCake;
    public CakeAdapter(Context context, ArrayList<Cake> datas, OnClickItemCake onClickItemCake){
        this.context = context;
        this.cakeList = datas;
        this.onClickItemCake = onClickItemCake;
    }
    @NonNull
    @Override
    public CakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_view2, parent, false);
        CakeViewHolder cakeViewHolder = new CakeViewHolder(view, this.onClickItemCake);
        return cakeViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull CakeViewHolder holder, int position) {
        Cake cake = cakeList.get(position);
        holder.cakeName.setText(cake.getCakeName());
        holder.cakeImg.setImageResource(cake.getCakeImg());
        holder.description.setText(cake.getDescription());
        String price =  "$" + String.valueOf(cake.getPrice());
        holder.price.setText(price);

    }
    @Override
    public int getItemCount() {
        return cakeList.size();
    }
}

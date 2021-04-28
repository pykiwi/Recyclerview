package com.example.ongiuaky4;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class CakeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView cakeName;
    ImageView cakeImg;
    TextView description;
    private OnClickItemCake onClickItemCake;
    TextView price;
    public CakeViewHolder(@NonNull View itemView, OnClickItemCake onClickItemCake) {
        super(itemView);
        this.cakeName = (TextView) itemView.findViewById(R.id.textView);
        this.cakeImg = (ImageView) itemView.findViewById(R.id.imageView);
        this.description = (TextView) itemView.findViewById(R.id.textView2);
        this.price = (TextView) itemView.findViewById(R.id.textView3);
        this.onClickItemCake = onClickItemCake;
        itemView.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        onClickItemCake.OnClick(getAdapterPosition());
    }
}

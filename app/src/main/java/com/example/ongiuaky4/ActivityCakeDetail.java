package com.example.ongiuaky4;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class ActivityCakeDetail extends AppCompatActivity {
    private ImageView imageCake;
    private TextView nameCake;
    private TextView price;
    private Button btnAdd;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);
        imageCake = findViewById(R.id.imgdetail);
        nameCake = findViewById(R.id.name);
        price = findViewById(R.id.price);
        btnAdd = findViewById(R.id.btnAdd);
        Bundle bundle = getIntent().getExtras();
        Cake cake = (Cake) bundle.getSerializable("cake");
        SetCakeContent(cake);
    }
    public void SetCakeContent(Cake cake){
        imageCake.setImageResource(cake.getCakeImg());
        nameCake.setText(cake.getCakeName());
        String price123 = "$" + String.valueOf(cake.getPrice());
        price.setText(price123);
    }
}

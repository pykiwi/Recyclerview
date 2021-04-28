package com.example.ongiuaky4;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import static com.example.ongiuaky4.R.id.recyclerView;
public class MainActivity extends AppCompatActivity {
    private ArrayList<Cake> cakes;
    private RecyclerView recyclerView;
    private CakeAdapter cakeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) this.findViewById(R.id.recyclerView);
        cakes = getListData();
        cakeAdapter = new CakeAdapter(this, cakes, new OnClickItemCake(){

            @Override
            public void OnClick(int position) {
                Intent intent = new Intent(MainActivity.this, ActivityCakeDetail.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("cake", cakes.get(position));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(cakeAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);

    }
    private ArrayList<Cake> getListData() {
        ArrayList<Cake> list = new ArrayList<Cake>();
        Cake cake1 = new Cake("Donut1", R.drawable.donut1, "123123", 123123);
        Cake cake2 = new Cake("Donut2", R.drawable.donut1, "123123", 123123);
        Cake cake3 = new Cake("Donut3", R.drawable.donut1, "123123", 123123);
        Cake cake4 = new Cake("Donut3", R.drawable.donut1, "123123", 123123);
        list.add(cake1);
        list.add(cake3);
        list.add(cake2);
        list.add(cake4);
        return list;
    }

}
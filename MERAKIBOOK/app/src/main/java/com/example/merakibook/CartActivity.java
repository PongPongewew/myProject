package com.example.merakibook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.adapter.BookCartAdapter;
import com.example.model.BookCart;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    RecyclerView rcvItemGioHang;
    ArrayList<BookCart> bookCarts;
    BookCartAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        linkView();
        initData();

    }

    private void linkView() {

        rcvItemGioHang = findViewById(R.id.rcvItemGioHang);
    }

    private void initData() {

        bookCarts = new ArrayList<>();
        bookCarts.add(new BookCart("Đời thừa","Nam Cao",R.drawable.doithua,45000));
        bookCarts.add(new BookCart("Bóng hình của gió","Carlos Ruiz Zafón",R.drawable.bonghinhcuagio,105000));

        adapter = new BookCartAdapter(this, bookCarts);
        rcvItemGioHang.setAdapter(adapter);

        rcvItemGioHang.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
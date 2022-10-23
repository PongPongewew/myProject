package com.example.merakibook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.adapter.BookPaymentAdapter;
import com.example.model.BookCart;

import java.util.ArrayList;

public class PaymentActivity extends AppCompatActivity {
    RecyclerView rcvItemThanhToan;
    ArrayList<BookCart> bookPayment;
    BookPaymentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        linkView();
        initData();
    }

    private void linkView() {
        rcvItemThanhToan = findViewById(R.id.rcvItemThanhToan);
    }

    private void initData() {
        bookPayment = new ArrayList<>();
        bookPayment.add(new BookCart("Đời thừa","Nam Cao",R.drawable.doithua,45000));
        bookPayment.add(new BookCart("Bóng hình của gió","Carlos Ruiz Zafón",R.drawable.bonghinhcuagio,105000));

        adapter = new BookPaymentAdapter(getApplicationContext(),bookPayment);
        rcvItemThanhToan.setAdapter(adapter);

        rcvItemThanhToan.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
package com.example.merakibook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adapter.ProductAdapter;
import com.example.adapter.TacGiaAdapter;
import com.example.model.BookItem;
import com.example.model.TacGia;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class SearchActivity extends AppCompatActivity {
    GridView gvBookItem;

    ProductAdapter adapter;
    ImageView imvHinh;
    CircleImageView imvTacGiaImage;
    TextView txtName, txtTacGia, txtTacGiaView;
    RecyclerView rcvTacGia;
    ArrayList<BookItem> bookitems;
    ArrayList<TacGia> tacGias;
    private TacGiaAdapter tacGiaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        linkView();
        configRecyclerView();
        initData();
        loadData();
    }

    private void linkView() {
        imvHinh = findViewById(R.id.imvHinh);
        imvTacGiaImage = findViewById(R.id.imvTacGiaImage);
        txtName = findViewById(R.id.txtName);
        txtTacGia = findViewById(R.id.txtTacGia);
        txtTacGiaView = findViewById(R.id.txtTacGiaView);
        gvBookItem = findViewById(R.id.gvBookItem);
        rcvTacGia = findViewById(R.id.rcvTacGia);
    }

    private void configRecyclerView() {
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcvTacGia.setLayoutManager(manager);
    }

    private void initData() {

        bookitems = new ArrayList<>();
        bookitems.add(new BookItem(R.drawable.harrypotter, "Harry Potter", "J.K Rowling"));
        bookitems.add(new BookItem(R.drawable.truyenkieu, "Truyện Kiều", "Nguyễn Du"));
        bookitems.add(new BookItem(R.drawable.dacnhantam, "Đắc nhân tâm", "Dale Carnegie"));
        bookitems.add(new BookItem(R.drawable.nhagiakim, "Nhà giả kim", "Paulo Ceolho"));
        bookitems.add(new BookItem(R.drawable.laohacreal, "Lão Hạc", "Nam Cao"));
        bookitems.add(new BookItem(R.drawable.duttinh, "Dứt tình", "Vũ Trọng Phụng"));

        tacGias = new ArrayList<>();
        tacGias.add(new TacGia(R.drawable.namcao, "Nam Cao"));
        tacGias.add(new TacGia(R.drawable.nguyennhatanh, "Nguyễn Nhật Ánh"));
        tacGias.add(new TacGia(R.drawable.jkrowling, "J.K.Rolling"));
        tacGias.add(new TacGia(R.drawable.hamlettruong, "Hamlet Trương"));
        tacGias.add(new TacGia(R.drawable.vutrongphung, "Vũ Trọng Phụng"));
        tacGias.add(new TacGia(R.drawable.keigohigashino, "Keigo Higashino"));
        tacGias.add(new TacGia(R.drawable.tohoai, "Tô Hoài"));
        tacGias.add(new TacGia(R.drawable.paulocoel, "Paulo Coelho"));
        tacGias.add(new TacGia(R.drawable.dalecarnegie, "Dale Carnegie"));
        tacGias.add(new TacGia(R.drawable.danbrown, "Dan Brown"));

    }

    private void loadData() {
        adapter = new ProductAdapter(SearchActivity.this, R.layout.bookitem, bookitems);
        gvBookItem.setAdapter(adapter);

        tacGiaAdapter = new TacGiaAdapter(getApplicationContext(), tacGias);
        rcvTacGia.setAdapter(tacGiaAdapter);
    }
}
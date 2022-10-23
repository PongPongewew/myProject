package com.example.merakibook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adapter.BookAdapterHorizontal;
import com.example.model.Book;
import com.example.model.BookItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class DetailBookActivity extends AppCompatActivity implements BookItemClickListener {
    private TextView txtTenSach,txtDesc, txtTacGia,txtTacGia2;
    private ImageView imvImages, imvHinh;
    private RecyclerView rcvcung_the_loai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);
        linkView();
        loadData();
        initData();
    }

    private void linkView() {
        rcvcung_the_loai=findViewById(R.id.rcvcung_the_loai);

        txtTenSach=findViewById(R.id.txtTenSach);
        txtDesc=findViewById(R.id.txtDesc);
        txtTacGia=findViewById(R.id.txtTacGia);
        txtTacGia2=findViewById(R.id.txtTacGia2);

        imvImages=findViewById(R.id.imvDetail_Images);
        imvHinh=findViewById(R.id.imvHinh);
    }

    private void loadData() {
        Intent intent= getIntent();
        String bookName=intent.getExtras().getString("Title");
        String bookAuthor= intent.getExtras().getString("Author");
        int Description= intent.getExtras().getInt("Description");
        int bookImage =intent.getExtras().getInt("Image");

        txtDesc.setText(Description);
        imvImages.setImageResource(bookImage);
        txtTenSach.setText(bookName);
        imvHinh.setImageResource(bookImage);
        txtTacGia.setText(bookAuthor);
        txtTacGia2.setText(bookAuthor);
    }

    private void initData() {
        List<Book> list_book2= new ArrayList<>();
        list_book2.add(new Book("Sapiens","Yuval Noah Harari",R.string.sach_moi,R.drawable.sapiens,R.string.sapiens));
        list_book2.add(new Book("Sinh trắc vân tay","RICHARD UNGER",R.string.sach_moi,R.drawable.sinhtracvantay,R.string.sinh_trac_van_tay));
        list_book2.add(new Book("Bạm đắt giá bao nhiêu","Vãn Tình",R.string.sach_moi,R.drawable.bandatgiabaonhieu,R.string.ban_dat_gia_bao_nhieu));
        list_book2.add(new Book("Đắc nhân tâm","Dale Carnegie",R.string.sach_moi,R.drawable.datnhantam,R.string.dat_nhan_tam));
        list_book2.add(new Book("Dứt Tình","Vũ Trọng Phụng",R.string.sach_moi,R.drawable.duttinh,R.string.dut_tinh));
        list_book2.add(new Book("Lão Hạc","Nam Cao",R.string.sach_moi,R.drawable.laohac,R.string.lao_hac));

        BookAdapterHorizontal adapter2=new BookAdapterHorizontal(this, list_book2,this);
        rcvcung_the_loai.setAdapter(adapter2);
        rcvcung_the_loai.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

    }

    @Override
    public void onBookClick(Book book, ImageView bookImageView) {
        Intent intent=new Intent(this,DetailBookActivity.class);
        intent.putExtra("Title",book.getBookName());
        intent.putExtra("Description",book.getDescription());
        intent.putExtra("Image",book.getBookImage());
        intent.putExtra("Author",book.getBookAuthor());


//        startActivity(intent);

        //Animation
        ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(DetailBookActivity.this, bookImageView,"sharedName");
        startActivity(intent,options.toBundle());
    }
}
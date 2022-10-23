package com.example.merakibook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.adapter.BookAdapterVertical;
import com.example.model.Book;
import com.example.model.BookItemClickListener;
import com.example.model.BookVer;

import java.util.ArrayList;

public class MyBook extends AppCompatActivity implements BookItemClickListener {

    RecyclerView rcvMyBook;
    ArrayList<BookVer> myBook;
    BookAdapterVertical adapterVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_book);

        linkView();
        initData();
    }

    private void linkView() {
        rcvMyBook = findViewById(R.id.rcvMyBook);
    }



    private void initData() {
        myBook = new ArrayList<>();
        myBook.add(new BookVer("Hỏa Ngục","Dan Brown","688 trang",R.drawable.hoanguc,R.drawable.icon_fivestar,R.drawable.icon_heart));
        myBook.add(new BookVer("Sự trừng phạt","Chu Hạo Huy","463 trang",R.drawable.sutrungphat,R.drawable.icon_fivestar,R.drawable.icon_heart));
        myBook.add(new BookVer("Trước khi nhắm mắt ","Keigo Higashino","396 trang",R.drawable.truockhinhammat,R.drawable.icon_fivestar,R.drawable.icon_heart));
        myBook.add(new BookVer("Tên của hoa hồng","Umberto Eco","526 trang",R.drawable.tencuadoahong,R.drawable.icon_fivestar,R.drawable.icon_heart));
        myBook.add(new BookVer("Sherlock Holmes","Arthur Conan Doyle","688 trang",R.drawable.nhungvukyancuasherlockholmes,R.drawable.icon_fivestar,R.drawable.icon_heart));
        myBook.add(new BookVer("Hai số phận","Jeffrey Archer","768 trang",R.drawable.haisophan,R.drawable.icon_fivestar,R.drawable.icon_heart));
        myBook.add(new BookVer("Tội lỗi không chứng cứ","Tử Kim Trần","688 trang",R.drawable.toiloikhongchungcu,R.drawable.icon_fivestar,R.drawable.icon_heart));
        myBook.add(new BookVer("Phía sau nghi can X","Keigo Higashino","396 trang",R.drawable.phiasaunghicanx,R.drawable.icon_fivestar,R.drawable.icon_heart));

        adapterVertical = new BookAdapterVertical(this, myBook,this);
        rcvMyBook.setAdapter(adapterVertical);

        rcvMyBook.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }

    @Override
    public void onBookClick(Book book, ImageView bookImageView) {

    }
}
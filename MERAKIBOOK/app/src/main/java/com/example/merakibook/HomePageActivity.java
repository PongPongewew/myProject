package com.example.merakibook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.adapter.BannerAdapter;
import com.example.adapter.BookAdapterHorizontal;
import com.example.model.Banner;
import com.example.model.Book;
import com.example.model.BookItemClickListener;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomePageActivity extends AppCompatActivity implements BookItemClickListener {
private List<Banner> list_banner;
private ViewPager banner_page;
private TabLayout indicator;
private RecyclerView rcvSachMoiNhat, rcvSachHotNhat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        linkView();
        initData();

    }

    private void linkView() {
        banner_page=findViewById(R.id.banner_page);
        indicator=findViewById(R.id.indicator);
        rcvSachMoiNhat=findViewById(R.id.rcvSachMoiNhat);
        rcvSachHotNhat=findViewById(R.id.rcvSachHotNhat);

    }

    private void initData() {
        //list hình banner
        list_banner= new ArrayList<>();
        list_banner.add(new Banner(R.drawable.banner2));
        list_banner.add(new Banner(R.drawable.banner1));
        list_banner.add(new Banner(R.drawable.banner3));
        list_banner.add(new Banner(R.drawable.banne4));
        list_banner.add(new Banner(R.drawable.banner5));

        // tạo adapter cho banner
        BannerAdapter adapter=new BannerAdapter(this, list_banner);
        // nạp adapter vào banner_page
        banner_page.setAdapter(adapter);
        // set timer
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new HomePageActivity.BannerTimer(),2000,4000);
        indicator.setupWithViewPager(banner_page,true);


        //list sách mới nhất
        List<Book> list_book1= new ArrayList<>();
        list_book1.add(new Book("Đắc nhân tâm","Dale Carnegie",R.string.sach_moi,R.drawable.datnhantam,R.string.dat_nhan_tam));
        list_book1.add(new Book("Dứt Tình","Vũ Trọng Phụng",R.string.sach_moi,R.drawable.duttinh,R.string.dut_tinh));
        list_book1.add(new Book("Lão Hạc","Nam Cao",R.string.sach_moi,R.drawable.laohac,R.string.lao_hac));
        list_book1.add(new Book("Sapiens","Yuval Noah Harari",R.string.sach_moi,R.drawable.sapiens,R.string.sapiens));
        list_book1.add(new Book("Sinh trắc vân tay","RICHARD UNGER",R.string.sach_moi,R.drawable.sinhtracvantay,R.string.sinh_trac_van_tay));
        list_book1.add(new Book("Bạm đắt giá bao nhiêu","Vãn Tình",R.string.sach_moi,R.drawable.bandatgiabaonhieu,R.string.ban_dat_gia_bao_nhieu));

        BookAdapterHorizontal adapter1= new BookAdapterHorizontal(this,list_book1,this);
        rcvSachMoiNhat.setAdapter(adapter1);
        rcvSachMoiNhat.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));



//List sách hot nhât
        List<Book> list_book2= new ArrayList<>();
        list_book2.add(new Book("Sapiens","Yuval Noah Harari",R.string.sach_moi,R.drawable.sapiens,R.string.sapiens));
        list_book2.add(new Book("Sinh trắc vân tay","RICHARD UNGER",R.string.sach_moi,R.drawable.sinhtracvantay,R.string.sinh_trac_van_tay));
        list_book2.add(new Book("Bạm đắt giá bao nhiêu","Vãn Tình",R.string.sach_moi,R.drawable.bandatgiabaonhieu,R.string.ban_dat_gia_bao_nhieu));
        list_book2.add(new Book("Đắc nhân tâm","Dale Carnegie",R.string.sach_moi,R.drawable.datnhantam,R.string.dat_nhan_tam));
        list_book2.add(new Book("Dứt Tình","Vũ Trọng Phụng",R.string.sach_moi,R.drawable.duttinh,R.string.dut_tinh));
        list_book2.add(new Book("Lão Hạc","Nam Cao",R.string.sach_moi,R.drawable.laohac,R.string.lao_hac));

       BookAdapterHorizontal adapter2=new BookAdapterHorizontal(this, list_book2,this);
       rcvSachHotNhat.setAdapter(adapter2);
       rcvSachHotNhat.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
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
        ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(HomePageActivity.this, bookImageView,"sharedName");
        startActivity(intent,options.toBundle());
    }

    class  BannerTimer extends TimerTask {

        @Override
        public void run() {
            HomePageActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (banner_page.getCurrentItem()<list_banner.size()-1){
                        banner_page.setCurrentItem(banner_page.getCurrentItem()+1);
                    }else
                        banner_page.setCurrentItem(0);
                }
            });
        }
    }
}
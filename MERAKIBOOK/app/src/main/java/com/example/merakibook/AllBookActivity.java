package com.example.merakibook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.adapter.BookAdapterHorizontal;
import com.example.model.Book;
import com.example.model.BookItemClickListener;

import java.util.ArrayList;

public class AllBookActivity extends AppCompatActivity implements BookItemClickListener{
    //Spinner
    Spinner spSort;
    ArrayList<String> sort;
    ArrayAdapter<String> adapter;

    //RecyclerView
    RecyclerView rcvAllBook;
    BookAdapterHorizontal bookAdapterHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_book);

        linkView();
        loadData();
        configRecyclerView();
        initData();

    }


    private void linkView() {
        //Spinner Sắp xếp
        spSort = findViewById(R.id.spSort);

        //RecyclerView
        rcvAllBook = findViewById(R.id.rcvAllBook);
    }

    private void loadData() {
        sort = new ArrayList<>();
        sort.add("Bán chạy nhất");
        sort.add("Mới nhất");
        sort.add("Miễn phí");

        adapter = new ArrayAdapter<>(AllBookActivity.this,android.R.layout.simple_list_item_1,sort);
        adapter.addAll(sort);
        spSort.setAdapter(adapter);
    }

    private void configRecyclerView() {
        rcvAllBook.setLayoutManager(new GridLayoutManager(this,3));
    }

    private void initData() {
        ArrayList<Book> allBook = new ArrayList<>();
        allBook.add(new Book("Hỏa ngục","Dan Brown",R.string.sach_hot_nhat,R.drawable.hoanguc,R.string.hoa_nguc));
        allBook.add(new Book("Kỳ án ánh trăng","Quỷ cổ nữ",R.string.sach_hot_nhat,R.drawable.kyananhtrang,R.string.hoa_nguc));
        allBook.add(new Book("Mật mã Da Vinci","Dan Brown",R.string.sach_hot_nhat,R.drawable.matmadavinci,R.string.hoa_nguc));
        allBook.add(new Book("Mười tội ác","Tư Thù",R.string.sach_hot_nhat,R.drawable.muoitoiac,R.string.hoa_nguc));
        allBook.add(new Book("Tội lỗi không chứng cứ","Tử Kim Trần",R.string.sach_hot_nhat,R.drawable.toiloikhongchungcu,R.string.hoa_nguc));
        allBook.add(new Book("Vòng tròn máu","Edgar Wallace",R.string.sach_hot_nhat,R.drawable.vongtronmau,R.string.hoa_nguc));
        allBook.add(new Book("Sự trả thù hoàn hảo","Tử Kim Trần",R.string.sach_hot_nhat,R.drawable.sutrathuhoanhao,R.string.hoa_nguc));
        allBook.add(new Book("Sự im lặng của bầy cừu","Thomas Harris",R.string.sach_hot_nhat,R.drawable.suimlangcuabaycuu,R.string.hoa_nguc));
        allBook.add(new Book("Thiên thần và ác quỷ","Dan Brown",R.string.sach_hot_nhat,R.drawable.thienthanacquy,R.string.hoa_nguc));

        allBook.add(new Book("Hỏa ngục","Dan Brown",R.string.sach_hot_nhat,R.drawable.hoanguc,R.string.hoa_nguc));
        allBook.add(new Book("Kỳ án ánh trăng","Quỷ cổ nữ",R.string.sach_hot_nhat,R.drawable.kyananhtrang,R.string.hoa_nguc));
        allBook.add(new Book("Mật mã Da Vinci","Dan Brown",R.string.sach_hot_nhat,R.drawable.matmadavinci,R.string.hoa_nguc));
        allBook.add(new Book("Mười tội ác","Tư Thù",R.string.sach_hot_nhat,R.drawable.muoitoiac,R.string.hoa_nguc));
        allBook.add(new Book("Tội lỗi không chứng cứ","Tử Kim Trần",R.string.sach_hot_nhat,R.drawable.toiloikhongchungcu,R.string.hoa_nguc));
        allBook.add(new Book("Vòng tròn máu","Edgar Wallace",R.string.sach_hot_nhat,R.drawable.vongtronmau,R.string.hoa_nguc));
        allBook.add(new Book("Sự trả thù hoàn hảo","Tử Kim Trần",R.string.sach_hot_nhat,R.drawable.sutrathuhoanhao,R.string.hoa_nguc));
        allBook.add(new Book("Sự im lặng của bầy cừu","Thomas Harris",R.string.sach_hot_nhat,R.drawable.suimlangcuabaycuu,R.string.hoa_nguc));
        allBook.add(new Book("Thiên thần và ác quỷ","Dan Brown",R.string.sach_hot_nhat,R.drawable.thienthanacquy,R.string.hoa_nguc));

        bookAdapterHorizontal = new BookAdapterHorizontal(this,allBook, this);
        rcvAllBook.setAdapter(bookAdapterHorizontal);

    }

    @Override
    public void onBookClick(Book book, ImageView bookImageView) {

    }
}
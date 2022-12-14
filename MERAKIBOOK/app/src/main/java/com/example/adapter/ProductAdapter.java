package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.merakibook.R;
import com.example.model.BookItem;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends BaseAdapter {
    Activity context;
    int item_gridview;
    List<BookItem> bookList;

    public ProductAdapter(Activity context, int item_gridview, ArrayList<BookItem> bookList) {
        this.context = context;
        this.item_gridview = item_gridview;
        this.bookList = bookList;
    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @Override
    public Object getItem(int i) {
        return bookList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(item_gridview, null);
            holder.imvHinh = view.findViewById(R.id.imvHinh);
            holder.txtName = view.findViewById(R.id.txtName);
            holder.txtTacGia = view.findViewById(R.id.txtTacGia);
            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }
        BookItem b =bookList.get(i);
        holder.imvHinh.setImageResource(b.getProductHinh());
        holder.txtName.setText(b.getProductName());
        holder.txtTacGia.setText(b.getProductTacGia());

        return view;


    }

    public static  class ViewHolder{
        ImageView imvHinh;
        TextView txtName, txtTacGia;
    }
}

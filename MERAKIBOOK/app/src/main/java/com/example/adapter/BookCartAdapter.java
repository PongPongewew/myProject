package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.merakibook.R;
import com.example.model.BookCart;

import java.util.ArrayList;

public class BookCartAdapter extends RecyclerView.Adapter<BookCartAdapter.ViewHoder>{

    Context context;
    ArrayList<BookCart> bookCarts;

    public BookCartAdapter(Context context, ArrayList<BookCart> bookCarts) {
        this.context = context;
        this.bookCarts = bookCarts;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View customView = inflater.inflate(R.layout.cart_item_list, parent,false);
        return new ViewHoder(customView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        holder.imvSach.setImageResource(bookCarts.get(position).getImvSach());
        holder.txtTenSach.setText(bookCarts.get(position).getTxtTenSach());
        holder.txtTacGia.setText(bookCarts.get(position).getTxtTacGia());
        holder.txtGiaSach.setText(String.valueOf(bookCarts.get(position).getTxtGiaSach()));
        holder.btnCong.getContext();
        holder.btnTru.getContext();
        holder.btnTrash.getContext();
        holder.chkCheckItem.getContext();
        holder.edtSoLuong.getText();
    }

    @Override
    public int getItemCount() {
        return bookCarts.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        ImageView imvSach;
        ImageButton btnTru, btnCong, btnTrash;
        CheckBox chkCheckItem;
        TextView txtTenSach, txtTacGia, txtGiaSach;
        EditText edtSoLuong;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            imvSach = itemView.findViewById(R.id.imvSach);
            btnTru = itemView.findViewById(R.id.btnTru);
            btnCong = itemView.findViewById(R.id.btnCong);
            btnTrash = itemView.findViewById(R.id.btnTrash);
            chkCheckItem = itemView.findViewById(R.id.chkCheckItem);
            txtTenSach = itemView.findViewById(R.id.txtTenSach);
            txtTacGia = itemView.findViewById(R.id.txtTacGia);
            txtGiaSach = itemView.findViewById(R.id.txtGiaSach);
            edtSoLuong = itemView.findViewById(R.id.edtSoLuong);
        }
    }

    }

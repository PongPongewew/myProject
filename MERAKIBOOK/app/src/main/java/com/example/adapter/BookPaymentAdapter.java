package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.merakibook.R;
import com.example.model.BookCart;

import java.util.ArrayList;

public class BookPaymentAdapter extends RecyclerView.Adapter<BookPaymentAdapter.ViewHolder> {
    Context context;
    ArrayList<BookCart> bookPayment;

    public BookPaymentAdapter(Context context, ArrayList<BookCart> bookPayment) {
        this.context = context;
        this.bookPayment = bookPayment;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View paymentView = inflater.inflate(R.layout.payment_item_list, parent, false);
        return new ViewHolder(paymentView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imvSach.setImageResource(bookPayment.get(position).getImvSach());
        holder.txtTenSach.setText(bookPayment.get(position).getTxtTenSach());
        holder.txtTacGia.setText(bookPayment.get(position).getTxtTacGia());
        holder.txtGiaSach.setText(String.valueOf(bookPayment.get(position).getTxtGiaSach()));
        holder.txtSoLuong.getContext();
    }

    @Override
    public int getItemCount() {
        return bookPayment.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imvSach;
        TextView txtTenSach, txtTacGia, txtGiaSach, txtSoLuong;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imvSach = itemView.findViewById(R.id.imvSach);
            txtTenSach = itemView.findViewById(R.id.txtTenSach);
            txtTacGia = itemView.findViewById(R.id.txtTacGia);
            txtGiaSach = itemView.findViewById(R.id.txtGiaSach);
            txtSoLuong = itemView.findViewById(R.id.txtSoLuong);
        }
    }
}

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
import com.example.model.TacGia;

import java.util.ArrayList;

public class TacGiaAdapter extends RecyclerView.Adapter<TacGiaAdapter.ViewHolder> {
    Context context;
    ArrayList<TacGia> tacGias;

    public TacGiaAdapter(Context context, ArrayList<TacGia> tacGias) {
        this.context = context;
        this.tacGias = tacGias;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View customView = inflater.inflate(R.layout.item_horizontal, parent, false);

        return new ViewHolder((customView));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imvTacGiaImage.setImageResource(tacGias.get(position).getTacgiaImage());
        holder.txtTacGiaView.setText(tacGias.get(position).getTacgiaView());
    }

    @Override
    public int getItemCount() {
        return tacGias.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imvTacGiaImage;
        TextView txtTacGiaView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imvTacGiaImage = itemView.findViewById(R.id.imvTacGiaImage);
            txtTacGiaView = itemView.findViewById(R.id.txtTacGiaView);
        }
    }
}

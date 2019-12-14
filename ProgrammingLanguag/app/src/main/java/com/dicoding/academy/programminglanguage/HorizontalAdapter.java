package com.dicoding.academy.programminglanguage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    Context context;
    ArrayList<Horizontal> horizontal;

    public HorizontalAdapter(Context context, ArrayList<Horizontal> horizontal) {
        this.context = context;
        this.horizontal = horizontal;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_programming, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgView.setImageResource(horizontal.get(position).getHrImage());
        holder.nameView.setText(horizontal.get(position).hrName);
    }

    @Override
    public int getItemCount() {
        return horizontal.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgView;
        TextView nameView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.top_img);
            nameView = itemView.findViewById(R.id.top_name);
        }
    }
}

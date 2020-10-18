package com.example.homework2;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CapitalAdapter extends RecyclerView.Adapter<CapitalViewHolder> {
    private List<Capital> capitals;
    private Context context;

    @NonNull
    @Override
    public CapitalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.activity_capital_view_holder, parent, false);
        return new CapitalViewHolder(contactView);
    }


    public CapitalAdapter(List<Capital> capitals) {
        this.capitals = capitals;
    }

    @Override
    public void onBindViewHolder(@NonNull final CapitalViewHolder holder, int position) {
        final Capital glassModel = capitals.get(position);
        holder.setValues(glassModel.getCapitalCity(), glassModel.getCapitalCountry());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitals.remove(holder.getAdapterPosition());
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return capitals.size();
    }
}
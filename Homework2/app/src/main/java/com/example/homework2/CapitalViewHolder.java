package com.example.homework2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CapitalViewHolder extends RecyclerView.ViewHolder {
    private TextView capitalCityTv;
    private TextView capitalCountryTv;

    public CapitalViewHolder(@NonNull View itemView) {
        super(itemView);
        capitalCityTv = itemView.findViewById(R.id.tv_capital_city);
        capitalCountryTv = itemView.findViewById(R.id.tv_capital_country);
    }
    public void setValues(String capitalCity, String capitalCountry){
        capitalCityTv.setText(capitalCity);
        capitalCountryTv.setText(capitalCountry);
    }
}
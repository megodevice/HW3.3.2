package com.geeks.hw332;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVButtonsAdapter extends RecyclerView.Adapter<RVButtonsViewHolder> {
    private final ArrayList<String> buttonTextArray;

    public RVButtonsAdapter(ArrayList<String> texts) {
        this.buttonTextArray = texts;
    }

    @NonNull
    @Override
    public RVButtonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RVButtonsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_buttons, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RVButtonsViewHolder holder, int position) {
        holder.onBind(buttonTextArray.get(position));
    }

    @Override
    public int getItemCount() {
        return buttonTextArray.size();
    }
}

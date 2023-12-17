package com.geeks.hw332;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVButtonsViewHolder extends RecyclerView.ViewHolder {
    private Button button;
    public RVButtonsViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
        initListener();
    }

    private void initListener() {
        button.setOnClickListener(v -> {
            Toast.makeText(itemView.getContext(), button.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }

    private void initView(View itemView) {
        button = itemView.findViewById(R.id.item_button);
    }

    public void onBind(String text) {
        button.setText(text);
    }
}

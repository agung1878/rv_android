package com.artivisi.idlix;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvProductAdapter extends RecyclerView.Adapter<RvProductAdapter.RvProductAdapterHolder> {
    @NonNull
    @Override
    public RvProductAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RvProductAdapterHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RvProductAdapterHolder extends RecyclerView.ViewHolder {
        public RvProductAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

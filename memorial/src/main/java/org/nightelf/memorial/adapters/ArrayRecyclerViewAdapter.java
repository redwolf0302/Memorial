package org.nightelf.memorial.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by evan on 2018/2/28.
 */

public class ArrayRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String[] items;

    public ArrayRecyclerViewAdapter(String[] items) {
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SimpleViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String item = items[position];
        ((TextView) holder.itemView).setText(item);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}

class SimpleViewHolder extends RecyclerView.ViewHolder {
    public SimpleViewHolder(View itemView) {
        super(itemView);
    }
}

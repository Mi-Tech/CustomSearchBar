package com.uigitdev.customsearchbar.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.customsearchbar.R;

public class SearchViewHolder extends RecyclerView.ViewHolder {
    public TextView item_person_name;

    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        item_person_name = itemView.findViewById(R.id.item_person_name);
    }
}

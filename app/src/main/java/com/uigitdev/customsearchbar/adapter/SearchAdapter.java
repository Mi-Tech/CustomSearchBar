package com.uigitdev.customsearchbar.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.customsearchbar.R;
import com.uigitdev.customsearchbar.viewholder.SearchViewHolder;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList arrayList;

    public SearchAdapter(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new SearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        setPersonName(((SearchViewHolder) holder).item_person_name, arrayList.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    private void setPersonName(TextView textView, String text) {
        textView.setText(text);
    }

    public void filterList(ArrayList<String> filterList) {
        arrayList = filterList;
        notifyDataSetChanged();
    }
}

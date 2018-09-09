package com.example.dsm2018.calculator_jumpup;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private ArrayList<Contact> mDataList;

    public RecyclerAdapter(ArrayList<Contact> mDataList) {
        this.mDataList = mDataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_contact, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = mDataList.get(position);

        holder.name.setText(contact.getName());
        holder.phone.setText(contact.getPhone());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
//        ImageView imgProfile;
        TextView name;
        TextView phone;

        public ViewHolder(View itemView) {
            super(itemView);
//            imgProfile = itemView.findViewById(R.id.img_profile);
            name = itemView.findViewById(R.id.txt_name);
            phone = itemView.findViewById(R.id.txt_phone);
        }
    }

}

package com.example.dsm2018.calculator_jumpup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CusctomAdapter extends BaseAdapter {
    private ArrayList<Contact> mDataList;

    public CusctomAdapter(ArrayList<Contact> mDataList) {this.mDataList = mDataList;}

    //아이템 개수
    @Override
    public int getCount() {
        return mDataList.size();
    }

    //position 번째의 아이템
    @Override
    public Object getItem(int position) {
        return mDataList.get(position);
    }

    //position 번째의 id
    @Override
    public long getItemId(int position) {
        return position;
    }


    //position 번째의 아이템의 View를 구성
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;

        if(convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_contact, viewGroup, false);

            ImageView imgProfile = (ImageView) convertView.findViewById(R.id.imageView);
            TextView txtName = convertView.findViewById(R.id.txt_name);
            TextView txtPhone = convertView.findViewById(R.id.txt_phone);

            holder.txtName = txtName;
            holder.txtPhone = txtPhone;

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }



        Contact contact = mDataList.get(position);

        holder.txtName.setText(contact.getName());
        holder.txtPhone.setText(contact.getPhone());

        return convertView;
    }

    static class ViewHolder {
        ImageView imgProfile;
        TextView txtName;
        TextView txtPhone;
    }
}

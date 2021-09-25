package com.college.myrecyclerview2;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener{

    private int position;
    private OnItemClickCallBack onItemClickCallBack;
    CustomOnItemClickListener(int position, OnItemClickCallBack onItemClickCallback){
        this.position = position;
        this.onItemClickCallBack = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallBack.onItemClicked(view, position);
    }

    public interface OnItemClickCallBack{
        void onItemClicked(View view, int position);
    }
}

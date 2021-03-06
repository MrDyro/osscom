package com.myfirstapp.myfirstapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public CustomViewHolder(final Context context) {
        super(new CustomView(context));
    }

    public void setImage(String imageUrl) {
        ((CustomView) itemView).setImage(imageUrl);
    }

    public void setText(final String text) {
        ((CustomView) itemView).setText(text);
    }
}

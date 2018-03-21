package com.tutorialstime;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter extends ArrayAdapter {
 private   int [] imageArray;
 private   String[] titleArray;


   public   MyAdapter(Context context, String [] titles1, int [] img1) {
        super(context, R.layout.custview,R.id.idtitle,titles1);
        this.imageArray=img1;
        this.titleArray=titles1;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row= inflater.inflate(R.layout.custview,parent,false);

        ImageView myImage =(ImageView) row.findViewById(R.id.idpic);
        TextView mytitle =(TextView) row.findViewById(R.id.idtitle);

        myImage.setImageResource(imageArray[position]);
        mytitle.setText(titleArray[position]);
        return row;
    }
}

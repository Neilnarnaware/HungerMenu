package com.deeplin.hungermenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Neil_Narnaware on 02-03-2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }
        public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(350,350));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(12,12,12, 12);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    private Integer[] mThumbIds = {
            R.drawable.c1, R.drawable.c2,
            R.drawable.c3, R.drawable.c4,
            R.drawable.c5, R.drawable.c6,
            R.drawable.c7, R.drawable.c8,
            R.drawable.c9, R.drawable.c10,
            R.drawable.c11,R.drawable.c12,
            R.drawable.c15, R.drawable.c16,
            R.drawable.c17,R.drawable.c18
    };
    private String[] names={
            "Espresso","Affogato","Cafe Latte","Cappuccino","Double Espresso","Flat White","Long Black","Long Macchiato","Mocca","Piccolo Latte",
            "Ristretto","Short Macchiato","Shakerato","Caffeine-fix-la-cone","Chocolate Frappe","Cafe Miel"
    };
}
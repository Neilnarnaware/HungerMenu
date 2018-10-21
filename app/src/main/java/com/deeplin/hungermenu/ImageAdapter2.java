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

public class ImageAdapter2 extends BaseAdapter {

        private Context mContext;

        public ImageAdapter2(Context c) {
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
                imageView.setLayoutParams(new GridView.LayoutParams(210, 210));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(12,12, 12,12);
            } else {
                imageView = (ImageView) convertView;
            }

            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }
        private Integer[] mThumbIds = {
                R.drawable.be1, R.drawable.be2,
                R.drawable.be3, R.drawable.be4,
                R.drawable.be5, R.drawable.be6,
                R.drawable.be9, R.drawable.be8,
                R.drawable.be10,R.drawable.be7
        };
}

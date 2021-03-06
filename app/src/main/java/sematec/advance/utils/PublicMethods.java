package sematec.advance.utils;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by amirhossein on 12/29/17.
 */

public class PublicMethods {

    public static void showToast(Context mContext , String msg){
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showImage(Context mContext , String url , ImageView img){
        Glide.with(mContext).load(url).into(img);
    }

}

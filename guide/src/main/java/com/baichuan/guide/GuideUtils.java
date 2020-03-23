package com.baichuan.guide;

import android.content.Context;
import android.widget.Toast;

public class GuideUtils {
    public static void showToastS(Context context,String text){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();;
    }
}

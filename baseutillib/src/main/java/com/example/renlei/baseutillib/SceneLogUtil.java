package com.example.renlei.baseutillib;

import android.text.TextUtils;
import android.util.Log;
/**
 * Time 2016/11/18.
 * User renlei
 * Email renlei@xiaomi.com
 */

public class SceneLogUtil {
    private static final String TAG = "SceneLogUtil";
    public static void log(String s){
        if (TextUtils.isEmpty(s))
            return;

            Log.d(TAG,s);
    }
}

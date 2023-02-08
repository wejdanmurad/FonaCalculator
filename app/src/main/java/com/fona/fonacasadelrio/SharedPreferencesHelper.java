package com.fona.fonacasadelrio;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPreferencesHelper {

    private SharedPreferencesHelper() {
    }

    private static SharedPreferences getSharedPref(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }


    /*<---------------background---------------->*/
    public static int getBackground(Context context) {
        return getSharedPref(context).getInt("BACKGROUND",R.drawable.background_gradient_1);
    }

//    public static void setUserToken(Context context, String token) {
//        getSharedPref(context).edit().putString(context.getString(R.string.TOKEN), token).apply();
//    }
//
//    /*<---------------button---------------->*/
//    public static String getUserImage(Context context) {
//        return getSharedPref(context).getString(context.getString(R.string.USER_IMAGE), "");
//    }
//
//    public static void setUserImage(Context context, String image) {
//        getSharedPref(context).edit().putString(context.getString(R.string.USER_IMAGE), image).apply();
//    }

}

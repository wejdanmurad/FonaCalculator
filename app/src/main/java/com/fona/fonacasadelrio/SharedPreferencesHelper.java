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
        return getSharedPref(context).getInt("BACKGROUND", R.drawable.background_gradient_1);
    }

    public static void setBackground(Context context, int background) {
        getSharedPref(context).edit().putInt("BACKGROUND", background).apply();
    }

    /*<---------------button---------------->*/
    public static int getButton(Context context) {
        return getSharedPref(context).getInt("BUTTON", R.drawable.rounded_background_1);
    }

    public static void setButton(Context context, int button) {
        getSharedPref(context).edit().putInt("BUTTON", button).apply();
    }

    /*<---------------List---------------->*/
    public static int getListHistory(Context context) {
        return getSharedPref(context).getInt("BUTTON", R.drawable.rounded_background_1);
    }

    public static void setListHistory(Context context, int button) {
        getSharedPref(context).edit().putInt("BUTTON", button).apply();
    }

}

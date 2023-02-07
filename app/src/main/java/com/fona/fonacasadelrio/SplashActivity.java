package com.fona.fonacasadelrio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final int sdk = android.os.Build.VERSION.SDK_INT;
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            layout.setBackgroundDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.background_gradient_red, null));
        } else {
            layout.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.background_gradient_red, null));
        }
        ;
    }
}
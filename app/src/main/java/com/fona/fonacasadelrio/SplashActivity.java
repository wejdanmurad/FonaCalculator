package com.fona.fonacasadelrio;

import static com.fona.fonacasadelrio.Constants.background;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.fona.fonacasadelrio.databinding.ActivitySplashBinding;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    ConstraintLayout layout;
    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        layout = findViewById(R.id.constraint_layout);

        layout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));
    }
}
package com.fona.fonacasadelrio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    ConstraintLayout layout;
    static int background = R.drawable.background_gradient_red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        layout = findViewById(R.id.constraint_layout);

        layout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));
    }
}
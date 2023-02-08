package com.fona.fonacasadelrio;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;
import static com.fona.fonacasadelrio.Constants.background;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.fona.fonacasadelrio.databinding.ActivitySplashBinding;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));

        binding.btnAccept.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
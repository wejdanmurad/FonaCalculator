package com.fona.fonacasadelrio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Build;
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
        initViews();
    }

    private void initViews() {
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getBackground(this), null));
        binding.btnAccept.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getButton(this), null));

        binding.btnAccept.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getBackground(this), null));
        binding.btnAccept.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getButton(this), null));
    }
}
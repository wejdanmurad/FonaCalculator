package com.fona.fonacasadelrio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
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
        initViews();
    }

    private void initViews() {
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getBackground(this), null));
        binding.btnAccept.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getButton(this), null));

        binding.tvPolicy.setOnClickListener(this);
        binding.btnAccept.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == binding.tvPolicy.getId()) {
            String url = "https://www.app-privacy-policy.com/live.php?token=IbzHp2IOVsTazLWpsATo3ifIzCMNla4M";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        } else if (view.getId() == binding.btnAccept.getId()) {
            startActivity(new Intent(this, MainActivity.class));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getBackground(this), null));
        binding.btnAccept.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getButton(this), null));
    }
}
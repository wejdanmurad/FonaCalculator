package com.fona.fonacasadelrio.ui;


import static com.fona.fonacasadelrio.Constants.background;
import static com.fona.fonacasadelrio.Constants.button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;

import com.fona.fonacasadelrio.Constants;
import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.databinding.ActivitySettingsBinding;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivitySettingsBinding binding;
    private int backgroundValue = Constants.background;
    private int buttonValue = Constants.button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    private void initViews() {
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));
        binding.btnSave.setBackground(ResourcesCompat.getDrawable(getResources(), button, null));

        binding.btnColor1.setOnClickListener(this);
        binding.btnColor2.setOnClickListener(this);
        binding.btnColor3.setOnClickListener(this);
        binding.btnColor4.setOnClickListener(this);
        binding.btnColor5.setOnClickListener(this);
        binding.btnColor6.setOnClickListener(this);
        binding.btnColor7.setOnClickListener(this);
        binding.btnColor8.setOnClickListener(this);
        binding.btnColor9.setOnClickListener(this);
        binding.btnColor10.setOnClickListener(this);
        binding.btnColor11.setOnClickListener(this);
        binding.btnColor12.setOnClickListener(this);

        binding.btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == binding.btnColor1.getId()) {
            backgroundValue = R.drawable.background_gradient_1;
            buttonValue = R.drawable.rounded_background_1;
        } else if (view.getId() == binding.btnColor2.getId()) {
            backgroundValue = R.drawable.background_gradient_2;
            buttonValue = R.drawable.rounded_background_2;
        } else if (view.getId() == binding.btnColor3.getId()) {
            backgroundValue = R.drawable.background_gradient_3;
            buttonValue = R.drawable.rounded_background_3;
        } else if (view.getId() == binding.btnColor4.getId()) {
            backgroundValue = R.drawable.background_gradient_4;
            buttonValue = R.drawable.rounded_background_4;
        } else if (view.getId() == binding.btnColor5.getId()) {
            backgroundValue = R.drawable.background_gradient_5;
            buttonValue = R.drawable.rounded_background_5;
        } else if (view.getId() == binding.btnColor6.getId()) {
            backgroundValue = R.drawable.background_gradient_6;
            buttonValue = R.drawable.rounded_background_6;
        } else if (view.getId() == binding.btnColor7.getId()) {
            backgroundValue = R.drawable.background_gradient_7;
            buttonValue = R.drawable.rounded_background_7;
        } else if (view.getId() == binding.btnColor8.getId()) {
            backgroundValue = R.drawable.background_gradient_8;
            buttonValue = R.drawable.rounded_background_8;
        } else if (view.getId() == binding.btnColor9.getId()) {
            backgroundValue = R.drawable.background_gradient_9;
            buttonValue = R.drawable.rounded_background_9;
        } else if (view.getId() == binding.btnColor10.getId()) {
            backgroundValue = R.drawable.background_gradient_10;
            buttonValue = R.drawable.rounded_background_10;
        } else if (view.getId() == binding.btnColor11.getId()) {
            backgroundValue = R.drawable.background_gradient_11;
            buttonValue = R.drawable.rounded_background_11;
        } else if (view.getId() == binding.btnColor12.getId()) {
            backgroundValue = R.drawable.background_gradient_12;
            buttonValue = R.drawable.rounded_background_12;
        } else if (view.getId() == binding.btnSave.getId()) {
            Constants.background = backgroundValue;
            Constants.button = buttonValue;
            finish();
        }
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), backgroundValue, null));
        binding.btnSave.setBackground(ResourcesCompat.getDrawable(getResources(), buttonValue, null));
    }
}
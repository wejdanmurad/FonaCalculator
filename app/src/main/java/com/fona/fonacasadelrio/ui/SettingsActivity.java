package com.fona.fonacasadelrio.ui;


import static com.fona.fonacasadelrio.Constants.background;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    private void initViews() {
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));

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
        } else if (view.getId() == binding.btnColor2.getId()) {
            backgroundValue = R.drawable.background_gradient_2;
        } else if (view.getId() == binding.btnColor3.getId()) {
            backgroundValue = R.drawable.background_gradient_3;
        } else if (view.getId() == binding.btnColor4.getId()) {
            backgroundValue = R.drawable.background_gradient_4;
        } else if (view.getId() == binding.btnColor5.getId()) {

        } else if (view.getId() == binding.btnColor6.getId()) {

        } else if (view.getId() == binding.btnColor7.getId()) {

        } else if (view.getId() == binding.btnColor8.getId()) {

        } else if (view.getId() == binding.btnColor9.getId()) {

        } else if (view.getId() == binding.btnColor10.getId()) {

        } else if (view.getId() == binding.btnColor10.getId()) {

        } else if (view.getId() == binding.btnColor11.getId()) {

        } else if (view.getId() == binding.btnColor12.getId()) {

        } else if (view.getId() == binding.btnSave.getId()) {
            Constants.background = backgroundValue;
            finish();
        }
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), backgroundValue, null));
    }
}
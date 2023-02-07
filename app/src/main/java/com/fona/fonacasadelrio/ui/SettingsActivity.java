package com.fona.fonacasadelrio.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.databinding.ActivitySettingsBinding;

public class SettingsActivity extends AppCompatActivity {
    private ActivitySettingsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
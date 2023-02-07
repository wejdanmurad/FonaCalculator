package com.fona.fonacasadelrio.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.databinding.ActivityCalculateBinding;

public class CalculateActivity extends AppCompatActivity {

    private ActivityCalculateBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalculateBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_calculate);
    }
}
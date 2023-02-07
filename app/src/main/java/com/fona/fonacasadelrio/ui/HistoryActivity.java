package com.fona.fonacasadelrio.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.databinding.ActivityHistoryBinding;

public class HistoryActivity extends AppCompatActivity {


    private ActivityHistoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
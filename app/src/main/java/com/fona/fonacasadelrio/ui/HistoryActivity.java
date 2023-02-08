package com.fona.fonacasadelrio.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.databinding.ActivityHistoryBinding;

public class HistoryActivity extends AppCompatActivity {


    private ActivityHistoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        binding = ActivityHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
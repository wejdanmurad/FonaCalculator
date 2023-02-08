package com.fona.fonacasadelrio.ui;

import static com.fona.fonacasadelrio.Constants.background;
import static com.fona.fonacasadelrio.Constants.button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;

import com.fona.fonacasadelrio.Constants;
import com.fona.fonacasadelrio.HistoryAdapter;
import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.databinding.ActivityHistoryBinding;

public class HistoryActivity extends AppCompatActivity implements View.OnClickListener {


    private ActivityHistoryBinding binding;
    private HistoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        binding = ActivityHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    private void initViews() {
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));
        binding.ivBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == binding.ivBack.getId()) {
            finish();
        }
    }
}
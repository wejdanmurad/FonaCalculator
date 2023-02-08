package com.fona.fonacasadelrio;

import static com.fona.fonacasadelrio.Constants.background;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.fona.fonacasadelrio.databinding.ActivityMainBinding;
import com.fona.fonacasadelrio.ui.CalculateActivity;
import com.fona.fonacasadelrio.ui.HistoryActivity;
import com.fona.fonacasadelrio.ui.SettingsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViews();
    }

    private void initViews() {
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));
        binding.calculate.setOnClickListener(this);
        binding.settings.setOnClickListener(this);
        binding.history.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == binding.calculate.getId()) {
            newActivity(CalculateActivity.class);
        } else if (view.getId() == binding.settings.getId()) {
            newActivity(SettingsActivity.class);
        } else if (view.getId() == binding.history.getId()) {
            newActivity(HistoryActivity.class);
        }
    }

    private void newActivity(Class<?> clas) {
        startActivity(new Intent(this, clas));
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));
    }
}
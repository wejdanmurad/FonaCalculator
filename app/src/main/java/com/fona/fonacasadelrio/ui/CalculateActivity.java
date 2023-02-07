package com.fona.fonacasadelrio.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fona.fonacasadelrio.MainActivity;
import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.databinding.ActivityCalculateBinding;

public class CalculateActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityCalculateBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalculateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == binding.imageView2.getId()) {
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}
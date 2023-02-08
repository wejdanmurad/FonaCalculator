package com.fona.fonacasadelrio.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.fona.fonacasadelrio.MainActivity;
import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.databinding.ActivityCalculateBinding;

public class CalculateActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityCalculateBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        binding = ActivityCalculateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
    }


    private void initView() {
        binding.imageView2.setOnClickListener(this);
        binding.ivC.setOnClickListener(this);
        binding.ivX.setOnClickListener(this);
        binding.ivDev.setOnClickListener(this);
        binding.ivDelete.setOnClickListener(this);
        binding.iv7.setOnClickListener(this);
        binding.iv8.setOnClickListener(this);
        binding.iv9.setOnClickListener(this);
        binding.ivMun.setOnClickListener(this);
        binding.iv4.setOnClickListener(this);
        binding.iv5.setOnClickListener(this);
        binding.iv6.setOnClickListener(this);
        binding.ivPlus.setOnClickListener(this);
        binding.iv1.setOnClickListener(this);
        binding.iv2.setOnClickListener(this);
        binding.iv3.setOnClickListener(this);
        binding.ivDote.setOnClickListener(this);
        binding.iv0.setOnClickListener(this);
        binding.ivPercent.setOnClickListener(this);
        binding.ivResult.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == binding.imageView2.getId()) {
            finish();
        } else if (view.getId() == binding.ivC.getId()) {
            binding.tvOperation.setText("");
        } else if (view.getId() == binding.ivX.getId()) {
            binding.tvOperation.append("*");
        } else if (view.getId() == binding.ivDev.getId()) {
            binding.tvOperation.append("/");
        } else if (view.getId() == binding.ivDelete.getId()) {
            binding.tvOperation.append("d");
        } else if (view.getId() == binding.iv7.getId()) {
            binding.tvOperation.append("7");
        } else if (view.getId() == binding.iv8.getId()) {
            binding.tvOperation.append("8");
        } else if (view.getId() == binding.iv9.getId()) {
            binding.tvOperation.append("9");
        } else if (view.getId() == binding.ivMun.getId()) {
            binding.tvOperation.append("-");
        } else if (view.getId() == binding.iv4.getId()) {
            binding.tvOperation.append("4");
        } else if (view.getId() == binding.iv5.getId()) {
            binding.tvOperation.append("5");
        } else if (view.getId() == binding.iv6.getId()) {
            binding.tvOperation.append("6");
        } else if (view.getId() == binding.ivPlus.getId()) {
            binding.tvOperation.append("+");
        } else if (view.getId() == binding.iv1.getId()) {
            binding.tvOperation.append("1");
        } else if (view.getId() == binding.iv2.getId()) {
            binding.tvOperation.append("2");
        } else if (view.getId() == binding.iv3.getId()) {
            binding.tvOperation.append("3");
        } else if (view.getId() == binding.ivDote.getId()) {
            binding.tvOperation.append(",");
        } else if (view.getId() == binding.iv0.getId()) {
            binding.tvOperation.append("0");
        } else if (view.getId() == binding.ivPercent.getId()) {
            binding.tvOperation.append("%");
        } else if (view.getId() == binding.ivResult.getId()) {
            binding.tvOperation.append("=");
        }
    }
}
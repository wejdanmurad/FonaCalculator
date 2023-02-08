package com.fona.fonacasadelrio.ui;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;

import com.fona.fonacasadelrio.Constants;
import com.fona.fonacasadelrio.HistoryAdapter;
import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.SharedPreferencesHelper;
import com.fona.fonacasadelrio.databinding.ActivityHistoryBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HistoryActivity extends AppCompatActivity implements View.OnClickListener {


    private ActivityHistoryBinding binding;
    private HistoryAdapter adapter;
    private List<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        binding = ActivityHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
        if (SharedPreferencesHelper.getListHistory(this) != null) {
            initAdapter();
        }

    }


    private void initAdapter() {
        Gson gson = new Gson();
        String json = SharedPreferencesHelper.getListHistory(this);
        Type type = new TypeToken<List<String>>() {
        }.getType();
        arrayList = gson.fromJson(json, type);
        adapter = new HistoryAdapter(arrayList);
        binding.rvHistory.setAdapter(adapter);
    }

    private void initViews() {
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getBackground(this), null));
        binding.ivBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == binding.ivBack.getId()) {
            finish();
        }
    }
}
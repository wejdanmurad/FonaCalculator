package com.fona.fonacasadelrio;

import static com.fona.fonacasadelrio.Constants.background;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;

import com.fona.fonacasadelrio.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), background, null));
    }
}
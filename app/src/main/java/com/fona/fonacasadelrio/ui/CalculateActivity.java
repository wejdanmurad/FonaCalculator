package com.fona.fonacasadelrio.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Toast;

import com.fona.fonacasadelrio.MainActivity;
import com.fona.fonacasadelrio.R;
import com.fona.fonacasadelrio.SharedPreferencesHelper;
import com.fona.fonacasadelrio.databinding.ActivityCalculateBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.mariuszgromada.math.mxparser.Expression;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPathExpressionException;

public class CalculateActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityCalculateBinding binding;

    private List<String> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        binding = ActivityCalculateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
    }


    private void initView() {
        binding.constraintLayout.setBackground(ResourcesCompat.getDrawable(getResources(), SharedPreferencesHelper.getBackground(this), null));
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
            clearBTN();
        } else if (view.getId() == binding.ivX.getId()) {
            multiplyBTN();
        } else if (view.getId() == binding.ivDev.getId()) {
            divideBTN();
        } else if (view.getId() == binding.ivDelete.getId()) {
            backspaceBTN();
        } else if (view.getId() == binding.iv7.getId()) {
            sevenBTN();
        } else if (view.getId() == binding.iv8.getId()) {
            eightBTN();
        } else if (view.getId() == binding.iv9.getId()) {
            nineBTN();
        } else if (view.getId() == binding.ivMun.getId()) {
            minusBTN();
        } else if (view.getId() == binding.iv4.getId()) {
            fourBTN();
        } else if (view.getId() == binding.iv5.getId()) {
            fiveBTN();
        } else if (view.getId() == binding.iv6.getId()) {
            sixBTN();
        } else if (view.getId() == binding.ivPlus.getId()) {
            plusBTN();
        } else if (view.getId() == binding.iv1.getId()) {
            oneBTN();
        } else if (view.getId() == binding.iv2.getId()) {
            twoBTN();
        } else if (view.getId() == binding.iv3.getId()) {
            threeBTN();
        } else if (view.getId() == binding.ivDote.getId()) {
            pointBTN();
        } else if (view.getId() == binding.iv0.getId()) {
            zeroBTN();
        } else if (view.getId() == binding.ivPercent.getId()) {
            percentBTN();
        } else if (view.getId() == binding.ivResult.getId()) {
            equalsBTN();
        }
    }


    public void zeroBTN() {
        updateText("0");
    }

    public void oneBTN() {
        updateText("1");
    }

    public void twoBTN() {
        updateText("2");
    }

    public void threeBTN() {
        updateText("3");
    }

    public void fourBTN() {
        updateText("4");
    }

    public void fiveBTN() {
        updateText("5");
    }

    public void sixBTN() {
        updateText("6");
    }

    public void sevenBTN() {
        updateText("7");
    }

    public void eightBTN() {
        updateText("8");
    }

    public void nineBTN() {
        updateText("9");
    }


    public void clearBTN() {
        binding.tvOperation.setText("");
        binding.tvResult.setText("");
    }

    public void divideBTN() {
        updateText("÷");
    }

    public void multiplyBTN() {
        updateText("×");
    }

    public void minusBTN() {
        updateText("-");
    }

    public void plusBTN() {
        updateText("+");
    }

    public void percentBTN() {
        updateText("%");
    }


    public void equalsBTN() {
        String userExp = binding.tvOperation.getText().toString();
        userExp = userExp.replaceAll("÷", "/");
        userExp = userExp.replaceAll("×", "*");
        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());
        binding.tvResult.setText(result);
        binding.tvResult.setSelection(result.length());
        String resulte = binding.tvOperation.getText().toString() + " = " + binding.tvResult.getText().toString();

        //save  operation
        if (SharedPreferencesHelper.getListHistory(this)!=null){
            items.clear();
            items.addAll(getOldData());
        }
        items.add(resulte);
        Gson gson = new Gson();
        String json = gson.toJson(items);
        SharedPreferencesHelper.setListHistory(this, json);
    }

    private List<String> getOldData() {
        Gson gson = new Gson();
        String json = SharedPreferencesHelper.getListHistory(this);
        Type type = new TypeToken<List<String>>() {
        }.getType();
        List<String> arrayList = gson.fromJson(json, type);
        return arrayList;
    }

    public void pointBTN() {
        updateText(",");
    }

    public void backspaceBTN() {
        int CursorPos = binding.tvOperation.getSelectionStart();
        int textLen = binding.tvOperation.getText().length();
        if (CursorPos != 0 && textLen != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) binding.tvOperation.getText();
            selection.replace(CursorPos - 1, CursorPos, "");
            binding.tvOperation.setText(selection);
            binding.tvOperation.setSelection(CursorPos - 1);
        }
    }

    private void updateText(String StrToADD) {
        String oldStr = binding.tvOperation.getText().toString();
        int CursorPos = binding.tvOperation.getSelectionStart();

        String leftStr = oldStr.substring(0, CursorPos);
        String rightStr = oldStr.substring(CursorPos);
        if (getString(R.string.enter_a_value).equals(binding.tvOperation.getText().toString())) {
            binding.tvOperation.setText(StrToADD);
        } else {
            binding.tvOperation.setText(String.format("%s%s%s", leftStr, StrToADD, rightStr));
        }
        binding.tvOperation.setSelection(CursorPos + 1);
    }


}
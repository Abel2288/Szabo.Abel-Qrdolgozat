package com.example.qrdolgozat;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class QrCodeList extends AppCompatActivity {

    private Button buttonQRScann;
    private Button aqsBack;
    private TextView aqsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code_list);
        init();
        aqsBack.setOnClickListener(view -> {
            Intent intent = new Intent( QrCodeList.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }

    public void init()
    {
        aqsBack = findViewById(R.id.aqsBack);
        aqsTextView = findViewById(R.id.aqsTextView);

    }
}
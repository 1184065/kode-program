package com.ulf.maria.qrcodescanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class main_tampilanutama extends AppCompatActivity implements View.OnClickListener {
    private Button btnTambah;
    private Button btnOutput;
    private Button btnTabel;

    //qr code scanner object
    private IntentIntegrator intentIntegrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tampilanutama);

        // initialize object
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnOutput = (Button) findViewById(R.id.btnOutput);
        btnTabel = (Button) findViewById(R.id.btnTabel);

        //Setting listeners to button
        btnTambah.setOnClickListener(this);
        btnOutput.setOnClickListener(this);
        btnTabel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // inisialisasi IntentIntegrator(scanQR)
        if (v == btnTambah) {
            startActivity(new Intent(this, MainActivity.class));
        }

        if (v == btnOutput) {
            startActivity(new Intent(this, MainActivity.class));
        }

        if (v == btnTabel) {
            startActivity(new Intent(this, MainActivityTabel.class));
        }
    }
}

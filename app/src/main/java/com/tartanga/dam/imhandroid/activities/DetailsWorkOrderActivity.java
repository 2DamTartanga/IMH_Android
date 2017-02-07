package com.tartanga.dam.imhandroid.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tartanga.dam.imhandroid.R;
import com.tartanga.dam.imhandroid.manager.VersionController;

public class DetailsWorkOrderActivity extends AppCompatActivity {

    private Button btnStart;
    private Button btnNext;
    private Button btnCancel;
    private VersionController vControl = new VersionController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(vControl.olderVersions())
            setContentView(R.layout.fragment_work_order_older_versions);
        else
            setContentView(R.layout.fragment_work_order);

        boolean ins = getIntent().getExtras().getBoolean("Instruct");

        btnStart = (Button) findViewById(R.id.btn_start_working);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnCancel = (Button) findViewById(R.id.btn_cancel_work);

        if(ins) {
            btnStart.setVisibility(View.INVISIBLE);
            btnNext.setVisibility(View.INVISIBLE);
            btnCancel.setVisibility(View.INVISIBLE);
        }
    }

    public void onClickStart(View v) {
        btnStart.setVisibility(View.INVISIBLE);
        btnNext.setVisibility(View.VISIBLE);
        btnCancel.setVisibility(View.VISIBLE);
    }

    public void onClickCancel(View v) {
        btnStart.setVisibility(View.VISIBLE);
        btnNext.setVisibility(View.INVISIBLE);
        btnCancel.setVisibility(View.INVISIBLE);
    }

    public void onClickNext(View v) {
        Intent i = new Intent(this, SendWorkOrderActivity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

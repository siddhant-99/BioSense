package com.cortex.devil.biosense;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class get_started extends Activity {

    Button back_btn;
    Button monitor_btn;
    Button train_btn;
    Button presets_btn;
    Button guide_btn;
    Button community_btn;
    Button support_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        back_btn = (Button) findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent onboard = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(onboard);
            }
        });

        monitor_btn = (Button) findViewById(R.id.monitor_btn);
        monitor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monitor = new Intent(getApplicationContext(),monitor.class);
                startActivity(monitor);
            }
        });

        train_btn = (Button) findViewById(R.id.train_btn);
        train_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent train = new Intent(getApplicationContext(),monitor.class);
                startActivity(train);
            }
        });

        presets_btn = (Button) findViewById(R.id.presets_btn);
        presets_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent presets = new Intent(getApplicationContext(),presets.class);
                startActivity(presets);
            }
        });

        guide_btn = (Button) findViewById(R.id.guide_btn);
        guide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guide = new Intent(getApplicationContext(),under_devel.class);
                startActivity(guide);
            }
        });

        community_btn = (Button) findViewById(R.id.community_btn);
        community_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent community = new Intent(getApplicationContext(),under_devel.class);
                startActivity(community);
            }
        });

        support_btn = (Button) findViewById(R.id.support_btn);
        support_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(getApplicationContext(),under_devel.class);
                startActivity(support);
            }
        });
    }
}

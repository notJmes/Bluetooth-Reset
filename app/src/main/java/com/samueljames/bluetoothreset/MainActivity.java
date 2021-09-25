package com.samueljames.bluetoothreset;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    public void openBluetooth(){
        Intent i = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:com.android.bluetooth"));
        startActivityForResult(i,0);
    }

    public void changeTxt(String msg){
        TextView txtMsg = findViewById(R.id.txtMessage);
        txtMsg.setText(msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTxt("Press button to proceed");

        Button btn = findViewById(R.id.resetBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeTxt("Button clicked!");
                openBluetooth();
            }
        });

    }



}


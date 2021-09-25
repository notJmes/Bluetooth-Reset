package com.samueljames.bluetoothreset;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

public class QuickOpen extends AppCompatActivity {


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

        openBluetooth();

    }



}


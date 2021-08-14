package com.qubittechnologies.writingright;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivityEdit extends AppCompatActivity {
    Button btnActivity1;

    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText0;
    String editTextVal0,editTextVal,editTextVal2,editTextVal3,editTextVal4,editTextVal5,editTextVal6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getActionBar().setTitle(Html.fromHtml("<font color=\"#ffffff\">"));
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                //WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_edit);
        //AdView mAdView;
        //mAdView = findViewById(R.id.adViewedit);
        //AdRequest adRequest = new AdRequest.Builder().
                //addTestDevice(AdRequest.DEVICE_ID_EMULATOR).
                        //build();

        //mAdView.loadAd(adRequest);
        btnActivity1 = (Button)findViewById(R.id.idbtnActivity1);
        editText0 =(EditText)findViewById(R.id.idTxtActivity0);
        editText1 =(EditText)findViewById(R.id.idTxtActivity1);
        editText2 =(EditText)findViewById(R.id.idTxtActivity2);
        editText3 =(EditText)findViewById(R.id.idTxtActivity3);
        editText4 =(EditText)findViewById(R.id.idTxtActivity4);
        editText5 =(EditText)findViewById(R.id.idTxtActivity5);
        editText6 =(EditText)findViewById(R.id.idTxtActivity6);
    }
    public void btnClickAct1(View v){
        Intent i = new Intent(this,MainActivityDisplay.class);
        editTextVal0 = editText0.getText().toString();
        editTextVal = editText1.getText().toString();
        editTextVal2 = editText2.getText().toString();
        editTextVal3 = editText3.getText().toString();
        editTextVal4 = editText4.getText().toString();
        editTextVal5 = editText5.getText().toString();
        editTextVal6 = editText6.getText().toString();
        i.putExtra("Value0",editTextVal0);
        i.putExtra("Value",editTextVal);
        i.putExtra("Value2",editTextVal2);
        i.putExtra("Value3",editTextVal3);
        i.putExtra("Value4",editTextVal4);
        i.putExtra("Value5",editTextVal5);
        i.putExtra("Value6",editTextVal6);
        startActivity(i);
        finish();

    }
}

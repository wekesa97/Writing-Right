package com.qubittechnologies.writingright;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;

public class MainActivityDisplay extends AppCompatActivity {
    ImageButton btnActivity2;

    TextView txtView1,txtView2,txtView3,txtView4;
    String year,yearapa,valFromAct0,valFromAct1,valFromAct2,valFromAct3,valFromAct4,valFromAct5,valFromAct6,finalstring,finalstringchicago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getActionBar().setTitle(Html.fromHtml("<font color=\"#ffffff\">"));
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                //WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_display);
        /*
        AdView mAdView;
        mAdView = findViewById(R.id.adViewdisplay);
        AdRequest adRequest = new AdRequest.Builder().
                //addTestDevice(AdRequest.DEVICE_ID_EMULATOR).
                        build();

        mAdView.loadAd(adRequest);
        **/
        btnActivity2 =(ImageButton)findViewById(R.id.idbtnActivity2);
        txtView1 = (TextView)findViewById(R.id.idTxtActivity1);
        txtView2 = (TextView)findViewById(R.id.idTxtActivity2);
        txtView3 = (TextView)findViewById(R.id.idTxtActivity3);
        txtView4 = (TextView)findViewById(R.id.idTxtActivity4);
        valFromAct0 = getIntent().getExtras().getString("Value0");
        valFromAct1 = getIntent().getExtras().getString("Value");
        valFromAct2 = getIntent().getExtras().getString("Value2");
        valFromAct3 = getIntent().getExtras().getString("Value3");
        valFromAct4 = getIntent().getExtras().getString("Value4");
        valFromAct5 = getIntent().getExtras().getString("Value5");
        valFromAct6 = getIntent().getExtras().getString("Value6");
        year = String.format( (valFromAct3));
        char ch2=valFromAct1.charAt(0);



        String yearapa=String.format( "("+year+")"+"." );
        String firstname = String.format( valFromAct1+", ");
        String letter=Character.toString(firstname.charAt(0));
        String  lastname = String.format( valFromAct0+", ");
        String titleapa = String.format(valFromAct2+", ");
        String titlechicago = String.format(valFromAct2+": ");
        String city = String.format(valFromAct4+": ");
        String publisherapa = String.format(valFromAct5+". ");
        String publisherchicago = String.format(valFromAct5+", ");
        String yearchicago = String.format(valFromAct3);
        String pages = String.format("p."+valFromAct6+" ");
        String intextapa = lastname.concat(" "+year);
        String intextchicago = valFromAct0.concat(" "+year);
        //String effort= String.format(lastname+);
        String effort= lastname.concat(letter+".");

        String in_text_citation_apa = String .format("\"idea paraphrased\""+"("+intextapa+")");
        String in_text_citation_chicago = String .format("\"idea paraphrased\""+"("+intextchicago+")");

        String bibliography_apa=effort.concat(yearapa).concat(titleapa).concat(city).concat(publisherapa);
        String bibliography_chicago=lastname.concat(firstname).concat(titlechicago).concat(city).concat(publisherchicago).concat(year);
        try{
            txtView1.setText(in_text_citation_apa);
        }catch (Exception e) {
        }
        try{
            txtView2.setText(bibliography_apa);
        }catch (Exception e) {
        }
        try{
            txtView3.setText(in_text_citation_chicago);
        }catch (Exception e) {
        }
        try{
            txtView4.setText(bibliography_chicago);
        }catch (Exception e) {
        }
    }

    public void btnClickAct2(View v){
        Intent i = new Intent (this,MainActivityEdit.class);
        startActivity(i);
        finish();
    }
}

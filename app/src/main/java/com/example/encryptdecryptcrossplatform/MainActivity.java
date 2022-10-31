package com.example.encryptdecryptcrossplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class MainActivity extends AppCompatActivity {


    Button button1, button2;
    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);

        txt1 = findViewById(R.id.txt_1);
        txt2= findViewById(R.id.txt_2);

        EncryptionUtils res = new EncryptionUtils();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    txt1.setText(res.encrypt("fabio","fabius@"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    txt2.setText(res.decrypt(txt1.getText().toString(),"fabius@"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



    }
}
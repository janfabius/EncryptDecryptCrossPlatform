package com.example.encryptdecryptcrossplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
    EditText stringa, key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);

        txt1 = findViewById(R.id.txt_1);
        txt2 = findViewById(R.id.txt_2);

        stringa = findViewById(R.id.editText_stringa);
        key = findViewById(R.id.editText_key);

        EncryptionUtils res = new EncryptionUtils();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    txt1.setText(res.encrypt(stringa.getText().toString(),key.getText().toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    txt2.setText(res.decrypt(stringa.getText().toString(),key.getText().toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



    }
}
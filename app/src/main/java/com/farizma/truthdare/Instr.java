package com.farizma.truthdare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.farizma.truthdare.R;

public class Instr extends AppCompatActivity{
    private long backPressedTime;
    private Toast backToast;
    //private TextView result_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instr);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Instr.this, StartActivity.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Instr.this, StartActivity.class);
            startActivity(intent); finish();
        }catch (Exception e){
        }
    }
    }

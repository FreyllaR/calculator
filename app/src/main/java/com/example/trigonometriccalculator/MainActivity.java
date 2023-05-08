package com.example.trigonometriccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.trigonometriccalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Sinbtn, Cosbtn, Tgbtn, Ctgbtn, Lnbtn, Lgbtn, Logbtn, Cleanbtn, answ, answ2;
    TextView Mist1, Mist2;
    EditText EditTextX, EditTextY;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Sinbtn = binding.sinbtn;
        Cosbtn = binding.cosbtn;
        Tgbtn = binding.tgbtn;
        Ctgbtn = binding.ctgbtn;
        Lnbtn = binding.lnbtn;
        Lgbtn = binding.lgbtn;
        Logbtn = binding.logbtn;
        Cleanbtn = binding.cleanbtn;
        EditTextX = binding.editTextX;
        EditTextY = binding.editTextY;
        Mist1 = binding.mistaketextview;
        Mist2 = binding.mistaketextview2;
        answ = binding.answ;
        answ2 = binding.answ2;
        Sinbtn.setOnClickListener(this);
        Cosbtn.setOnClickListener(this);
        Tgbtn.setOnClickListener(this);
        Ctgbtn.setOnClickListener(this);
        Lnbtn.setOnClickListener(this);
        Lgbtn.setOnClickListener(this);
        Logbtn.setOnClickListener(this);
        Cleanbtn.setOnClickListener(this);
        EditTextY.setEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    public void OnClickReset(){
        EditTextY.setText("");
        EditTextX.setText("");
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public void onClick(View v) {
            Fragment frag1 = getSupportFragmentManager().findFragmentById(R.id.fragment1);
            Fragment frag2 = getSupportFragmentManager().findFragmentById(R.id.fragment2);
            Mist1.setText("");
            Mist2.setText("");
            switch (v.getId()) {
                case R.id.sinbtn:
                    Cosbtn.setEnabled(false);
                    Tgbtn.setEnabled(false);
                    Ctgbtn.setEnabled(false);
                    Lnbtn.setEnabled(false);
                    Lgbtn.setEnabled(false);
                    Logbtn.setEnabled(false);
                    answ.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.sin(Double.parseDouble(String.valueOf(EditTextX.getText()))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            } else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                    Mist1.setText("");
                                    Mist2.setText("");
                                    String tmp = String.valueOf(Math.sin(Double.parseDouble(String.valueOf(EditTextX.getText()))));
                                    ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                            .setText("Ответ в градусах: " + tmp);
                                } else{
                                    Mist1.setText("Введены некорректные данные");
                                }
                            }
                    });
                    answ2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians(Math.sin(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                    Mist1.setText("");
                                    Mist2.setText("");
                                    String tmp = String.valueOf(Math.toRadians(Math.sin(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                    ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                            .setText("Ответ в радианах:" + tmp);
                                }else{
                                        Mist1.setText("Введены некорректные данные");
                                    }
                            }
                        });
                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            OnClickReset();
                            Sinbtn.setEnabled(true);
                            Cosbtn.setEnabled(true);
                            Tgbtn.setEnabled(true);
                            Ctgbtn.setEnabled(true);
                            Lnbtn.setEnabled(true);
                            Lgbtn.setEnabled(true);
                            Logbtn.setEnabled(true);
                            Mist1.setText("");
                            Mist2.setText("");
                            ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                    .setText("");
                            ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                    .setText("");
                        }
                    });
                    break;
                case R.id.cosbtn:
                    Sinbtn.setEnabled(false);
                    Tgbtn.setEnabled(false);
                    Ctgbtn.setEnabled(false);
                    Lnbtn.setEnabled(false);
                    Lgbtn.setEnabled(false);
                    Logbtn.setEnabled(false);
                    answ.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.cos(Double.parseDouble(String.valueOf(EditTextX.getText()))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.cos(Double.parseDouble(String.valueOf(EditTextX.getText()))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    answ2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) Math.cos(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) Math.cos(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            OnClickReset();
                            Sinbtn.setEnabled(true);
                            Tgbtn.setEnabled(true);
                            Ctgbtn.setEnabled(true);
                            Lnbtn.setEnabled(true);
                            Lgbtn.setEnabled(true);
                            Logbtn.setEnabled(true);
                            Mist1.setText("");
                            Mist2.setText("");
                            ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                    .setText("");
                            ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                    .setText("");
                        }
                    });
                    break;
                case R.id.tgbtn:
                    Cosbtn.setEnabled(false);
                    Sinbtn.setEnabled(false);
                    Ctgbtn.setEnabled(false);
                    Lnbtn.setEnabled(false);
                    Lgbtn.setEnabled(false);
                    Logbtn.setEnabled(false);
                    answ.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText()))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText()))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    answ2.setOnClickListener(new View.OnClickListener() {
                                                 public void onClick(View v) {
                                                     if (isNumeric(String.valueOf(EditTextX.getText()))) {
                                                         Mist1.setText("");
                                                         Mist2.setText("");
                                                         String tmp = String.valueOf(Math.toRadians((double) Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                                         ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                                                 .setText("Ответ в радианах:" + tmp);
                                                     } else {
                                                         Mist1.setText("Введены некорректные данные");
                                                     }
                                                 }
                                             });
                    findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            OnClickReset();
                            Sinbtn.setEnabled(true);
                            Cosbtn.setEnabled(true);
                            Tgbtn.setEnabled(true);
                            Ctgbtn.setEnabled(true);
                            Lnbtn.setEnabled(true);
                            Lgbtn.setEnabled(true);
                            Logbtn.setEnabled(true);
                            Mist1.setText("");
                            Mist2.setText("");
                            ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                    .setText("");
                            ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                    .setText("");
                        }
                    });
                    break;
                case R.id.ctgbtn:
                    Cosbtn.setEnabled(false);
                    Sinbtn.setEnabled(false);
                    Tgbtn.setEnabled(false);
                    Lnbtn.setEnabled(false);
                    Lgbtn.setEnabled(false);
                    Logbtn.setEnabled(false);
                    answ.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) (1.0 / Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) (1.0 / Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    answ2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) 1.0 / Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) 1.0 / Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            OnClickReset();
                            Sinbtn.setEnabled(true);
                            Cosbtn.setEnabled(true);
                            Tgbtn.setEnabled(true);
                            Ctgbtn.setEnabled(true);
                            Lnbtn.setEnabled(true);
                            Lgbtn.setEnabled(true);
                            Logbtn.setEnabled(true);
                            Mist1.setText("");
                            Mist2.setText("");
                            ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                    .setText("");
                            ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                    .setText("");
                        }
                    });
                    break;
                case R.id.lnbtn:
                    Cosbtn.setEnabled(false);
                    Sinbtn.setEnabled(false);
                    Ctgbtn.setEnabled(false);
                    Tgbtn.setEnabled(false);
                    Lgbtn.setEnabled(false);
                    Logbtn.setEnabled(false);
                    answ.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / 2.7);
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / 2.7);
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    answ2.setOnClickListener(new View.OnClickListener() {
                                                 public void onClick(View v) {
                                                     if (isNumeric(String.valueOf(EditTextX.getText()))) {
                                                         Mist1.setText("");
                                                         Mist2.setText("");
                                                         String tmp = String.valueOf(Math.toRadians((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText())) / 2.7)));
                                                         ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                                                 .setText("Ответ в радианах:" + tmp);
                                                     } else {
                                                         Mist1.setText("Введены некорректные данные");
                                                     }
                                                 }
                                             });
                    findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))/ 2.7)));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                       }
                    });
                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            OnClickReset();
                            Sinbtn.setEnabled(true);
                            Cosbtn.setEnabled(true);
                            Tgbtn.setEnabled(true);
                            Ctgbtn.setEnabled(true);
                            Lnbtn.setEnabled(true);
                            Lgbtn.setEnabled(true);
                            Logbtn.setEnabled(true);
                            Mist1.setText("");
                            Mist2.setText("");
                            ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                    .setText("");
                            ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                    .setText("");
                        }
                    });
                    break;
                case R.id.lgbtn:
                    Cosbtn.setEnabled(false);
                    Sinbtn.setEnabled(false);
                    Ctgbtn.setEnabled(false);
                    Tgbtn.setEnabled(false);
                    Lnbtn.setEnabled(false);
                    Logbtn.setEnabled(false);
                    answ.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if(isNumeric(String.valueOf(EditTextX.getText()))) {
                            Mist1.setText("");
                            Mist2.setText("");
                            String tmp = String.valueOf((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))));
                            ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                    .setText("Ответ в градусах: " + tmp);
                        }else{
                            Mist1.setText("Введены некорректные данные");
                        }
                    }
                    });
                    findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    answ2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText())))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else{
                                Mist1.setText("Введены некорректные данные");
                            }
                        }
                    });
                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            OnClickReset();
                            Sinbtn.setEnabled(true);
                            Cosbtn.setEnabled(true);
                            Tgbtn.setEnabled(true);
                            Ctgbtn.setEnabled(true);
                            Lnbtn.setEnabled(true);
                            Lgbtn.setEnabled(true);
                            Logbtn.setEnabled(true);
                            Mist1.setText("");
                            Mist2.setText("");
                            ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                    .setText("");
                            ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                    .setText("");
                        }
                    });
                    break;
                case R.id.logbtn:
                    Cosbtn.setEnabled(false);
                    Sinbtn.setEnabled(false);
                    Ctgbtn.setEnabled(false);
                    Tgbtn.setEnabled(false);
                    Lgbtn.setEnabled(false);
                    Lnbtn.setEnabled(false);
                    EditTextY.setEnabled(true);
                    answ.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText())) & isNumeric(String.valueOf(EditTextY.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.log(Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / Math.log(Double.parseDouble(String.valueOf(EditTextY.getText())))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else if(!(isNumeric(String.valueOf(EditTextX.getText()))) & isNumeric(String.valueOf(EditTextY.getText()))){
                                Mist1.setText("Введены некорректные данные");
                            }else if(isNumeric(String.valueOf(EditTextX.getText())) & !(isNumeric(String.valueOf(EditTextY.getText())))){
                                Mist2.setText("Введены некорректные данные");
                            }
                            else{
                                Mist1.setText("Введены некорректные данные");
                                Mist2.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText())) & isNumeric(String.valueOf(EditTextY.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf((double) Math.log(Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / Math.log(Double.parseDouble(String.valueOf(EditTextY.getText())))));
                                ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                        .setText("Ответ в градусах: " + tmp);
                            }else if(!(isNumeric(String.valueOf(EditTextX.getText()))) & isNumeric(String.valueOf(EditTextY.getText()))){
                                Mist1.setText("Введены некорректные данные");
                            }else if(isNumeric(String.valueOf(EditTextX.getText())) & !(isNumeric(String.valueOf(EditTextY.getText())))){
                                Mist2.setText("Введены некорректные данные");
                            }
                            else{
                                Mist1.setText("Введены некорректные данные");
                                Mist2.setText("Введены некорректные данные");
                            }
                        }
                    });
                    answ2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText())) & isNumeric(String.valueOf(EditTextY.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) Math.log(Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / Math.log(Double.parseDouble(String.valueOf(EditTextY.getText()))))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else if(!(isNumeric(String.valueOf(EditTextX.getText()))) & isNumeric(String.valueOf(EditTextY.getText()))){
                                Mist1.setText("Введены некорректные данные");
                            }else if(isNumeric(String.valueOf(EditTextX.getText())) & !(isNumeric(String.valueOf(EditTextY.getText())))){
                                Mist2.setText("Введены некорректные данные");
                            }
                            else{
                                Mist1.setText("Введены некорректные данные");
                                Mist2.setText("Введены некорректные данные");
                            }
                        }
                    });
                    findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if(isNumeric(String.valueOf(EditTextX.getText())) & isNumeric(String.valueOf(EditTextY.getText()))) {
                                Mist1.setText("");
                                Mist2.setText("");
                                String tmp = String.valueOf(Math.toRadians((double) Math.log(Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / Math.log(Double.parseDouble(String.valueOf(EditTextY.getText()))))));
                                ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                        .setText("Ответ в радианах:" + tmp);
                            }else if(!(isNumeric(String.valueOf(EditTextX.getText()))) & isNumeric(String.valueOf(EditTextY.getText()))){
                                Mist1.setText("Введены некорректные данные");
                            }else if(isNumeric(String.valueOf(EditTextX.getText())) & !(isNumeric(String.valueOf(EditTextY.getText())))){
                                Mist2.setText("Введены некорректные данные");
                            }
                            else{
                                Mist1.setText("Введены некорректные данные");
                                Mist2.setText("Введены некорректные данные");
                            }
                        }
                    });
                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            OnClickReset();
                            Sinbtn.setEnabled(true);
                            Cosbtn.setEnabled(true);
                            Tgbtn.setEnabled(true);
                            Ctgbtn.setEnabled(true);
                            Lnbtn.setEnabled(true);
                            Lgbtn.setEnabled(true);
                            Logbtn.setEnabled(true);
                            EditTextY.setEnabled(false);
                            Mist1.setText("");
                            Mist2.setText("");
                            ((TextView) frag1.getView().findViewById(R.id.textViewg))
                                    .setText("");
                            ((TextView) frag2.getView().findViewById(R.id.textViewr))
                                    .setText("");
                        }
                    });
                    break;
                default:
                    break;
            }
    }
}
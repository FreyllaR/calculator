package com.example.trigonometriccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.trigonometriccalculator.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//    Button Sinbtn, Cosbtn, Tgbtn, Ctgbtn, Lnbtn, Lgbtn, Logbtn, Cleanbtn, answ, answ2;
//
//    TextView Mist1, Mist2;
//    EditText EditTextX, EditTextY;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        Sinbtn = binding.sinbtn;
//        Cosbtn = binding.cosbtn;
//        Tgbtn = binding.tgbtn;
//        Ctgbtn = binding.ctgbtn;
//        Lnbtn = binding.lnbtn;
//        Lgbtn = binding.lgbtn;
//        Logbtn = binding.logbtn;
//        Cleanbtn = binding.cleanbtn;
//        EditTextX = binding.editTextX;
//        EditTextY = binding.editTextY;
//        Mist1 = binding.mistaketextview;
//        Mist2 = binding.mistaketextview2;
//        answ = binding.answ;
//        answ2 = binding.answ2;
//        Sinbtn.setOnClickListener(this);
//        Cosbtn.setOnClickListener(this);
//        Tgbtn.setOnClickListener(this);
//        Ctgbtn.setOnClickListener(this);
//        Lnbtn.setOnClickListener(this);
//        Lgbtn.setOnClickListener(this);
//        Logbtn.setOnClickListener(this);
//        Cleanbtn.setOnClickListener(this);
//        EditTextY.setEnabled(false);
        FragmentStateAdapter pageAdapter = new MyAdapter(this);
        binding.pager.setAdapter(pageAdapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(binding.tabLayout, binding.pager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0){
                    tab.setText("Калькулятор");
                    binding.pager.setUserInputEnabled(true);
                } else if (position == 1){
                    tab.setText("Об авторе");
                } else if (position == 2){
                    tab.setText("О программе");
                }
            }
        });
        tabLayoutMediator.attach();
    }

//    public void OnClickReset(){
//        EditTextY.setText("");
//        EditTextX.setText("");
//    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public void onClick(View v) {
//            Mist1.setText("");
//            Mist2.setText("");
//            switch (v.getId()) {
//                case R.id.sinbtn:
//                    Cosbtn.setEnabled(false);
//                    Tgbtn.setEnabled(false);
//                    Ctgbtn.setEnabled(false);
//                    Lnbtn.setEnabled(false);
//                    Lgbtn.setEnabled(false);
//                    Logbtn.setEnabled(false);
//                    Intent intent1 = new Intent(this, MainActivity2.class);
//                    answ.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf(Math.sin(Double.parseDouble(String.valueOf(EditTextX.getText()))));
//                                intent1.putExtra("gradusi", tmp);
//                                startActivity(intent1);
//                            } else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    answ2.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf(Math.toRadians(Math.sin(Double.parseDouble(String.valueOf(EditTextX.getText())))));
//                                intent1.putExtra("radiani", tmp);
//                                startActivity(intent1);
//                            }else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            OnClickReset();
//                            Sinbtn.setEnabled(true);
//                            Cosbtn.setEnabled(true);
//                            Tgbtn.setEnabled(true);
//                            Ctgbtn.setEnabled(true);
//                            Lnbtn.setEnabled(true);
//                            Lgbtn.setEnabled(true);
//                            Logbtn.setEnabled(true);
//                            Mist1.setText("");
//                            Mist2.setText("");
//                        }
//                    });
//                    break;
//                case R.id.cosbtn:
//                    Sinbtn.setEnabled(false);
//                    Tgbtn.setEnabled(false);
//                    Ctgbtn.setEnabled(false);
//                    Lnbtn.setEnabled(false);
//                    Lgbtn.setEnabled(false);
//                    Logbtn.setEnabled(false);
//                    Intent intent2 = new Intent(this, MainActivity2.class);
//                    answ.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf((double) Math.cos(Double.parseDouble(String.valueOf(EditTextX.getText()))));
//                                intent2.putExtra("gradusi", tmp);
//                                startActivity(intent2);
//                            }else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    answ2.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf(Math.toRadians((double) Math.cos(Double.parseDouble(String.valueOf(EditTextX.getText())))));
//                                intent2.putExtra("radiani", tmp);
//                                startActivity(intent2);
//                            }else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            OnClickReset();
//                            Sinbtn.setEnabled(true);
//                            Tgbtn.setEnabled(true);
//                            Ctgbtn.setEnabled(true);
//                            Lnbtn.setEnabled(true);
//                            Lgbtn.setEnabled(true);
//                            Logbtn.setEnabled(true);
//                            Mist1.setText("");
//                            Mist2.setText("");
//                        }
//                    });
//                    break;
//                case R.id.tgbtn:
//                    Cosbtn.setEnabled(false);
//                    Sinbtn.setEnabled(false);
//                    Ctgbtn.setEnabled(false);
//                    Lnbtn.setEnabled(false);
//                    Lgbtn.setEnabled(false);
//                    Logbtn.setEnabled(false);
//                    Intent intent3 = new Intent(this, MainActivity2.class);
//                    answ.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf((double) Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText()))));
//                                intent3.putExtra("gradusi", tmp);
//                                startActivity(intent3);
//                            }else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    answ2.setOnClickListener(new View.OnClickListener() {
//                                                 public void onClick(View v) {
//                                                     if (isNumeric(String.valueOf(EditTextX.getText()))) {
//                                                         Mist1.setText("");
//                                                         Mist2.setText("");
//                                                         String tmp = String.valueOf(Math.toRadians((double) Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
//                                                         intent3.putExtra("radiani", tmp);
//                                                         startActivity(intent3);
//                                                     } else {
//                                                         Mist1.setText("Введены некорректные данные");
//                                                     }
//                                                 }
//                                             });
//                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            OnClickReset();
//                            Sinbtn.setEnabled(true);
//                            Cosbtn.setEnabled(true);
//                            Tgbtn.setEnabled(true);
//                            Ctgbtn.setEnabled(true);
//                            Lnbtn.setEnabled(true);
//                            Lgbtn.setEnabled(true);
//                            Logbtn.setEnabled(true);
//                            Mist1.setText("");
//                            Mist2.setText("");
//                        }
//                    });
//                    break;
//                case R.id.ctgbtn:
//                    Cosbtn.setEnabled(false);
//                    Sinbtn.setEnabled(false);
//                    Tgbtn.setEnabled(false);
//                    Lnbtn.setEnabled(false);
//                    Lgbtn.setEnabled(false);
//                    Logbtn.setEnabled(false);
//                    Intent intent4 = new Intent(this, MainActivity2.class);
//                    answ.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf((double) (1.0 / Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
//                                intent4.putExtra("gradusi", tmp);
//                                startActivity(intent4);
//                            }else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    answ2.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf(Math.toRadians((double) 1.0 / Math.tan(Double.parseDouble(String.valueOf(EditTextX.getText())))));
//                                intent4.putExtra("radiani", tmp);
//                                startActivity(intent4);
//                            }else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            OnClickReset();
//                            Sinbtn.setEnabled(true);
//                            Cosbtn.setEnabled(true);
//                            Tgbtn.setEnabled(true);
//                            Ctgbtn.setEnabled(true);
//                            Lnbtn.setEnabled(true);
//                            Lgbtn.setEnabled(true);
//                            Logbtn.setEnabled(true);
//                            Mist1.setText("");
//                            Mist2.setText("");
//                        }
//                    });
//                    break;
//                case R.id.lnbtn:
//                    Cosbtn.setEnabled(false);
//                    Sinbtn.setEnabled(false);
//                    Ctgbtn.setEnabled(false);
//                    Tgbtn.setEnabled(false);
//                    Lgbtn.setEnabled(false);
//                    Logbtn.setEnabled(false);
//                    Intent intent5 = new Intent(this, MainActivity2.class);
//                    answ.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / 2.7);
//                                intent5.putExtra("gradusi", tmp);
//                                startActivity(intent5);
//                            }else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    answ2.setOnClickListener(new View.OnClickListener() {
//                                                 public void onClick(View v) {
//                                                     if (isNumeric(String.valueOf(EditTextX.getText()))) {
//                                                         Mist1.setText("");
//                                                         Mist2.setText("");
//                                                         String tmp = String.valueOf(Math.toRadians((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText())) / 2.7)));
//                                                         intent5.putExtra("radiani", tmp);
//                                                         startActivity(intent5);
//                                                     } else {
//                                                         Mist1.setText("Введены некорректные данные");
//                                                     }
//                                                 }
//                                             });
//                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            OnClickReset();
//                            Sinbtn.setEnabled(true);
//                            Cosbtn.setEnabled(true);
//                            Tgbtn.setEnabled(true);
//                            Ctgbtn.setEnabled(true);
//                            Lnbtn.setEnabled(true);
//                            Lgbtn.setEnabled(true);
//                            Logbtn.setEnabled(true);
//                            Mist1.setText("");
//                            Mist2.setText("");
//                        }
//                    });
//                    break;
//                case R.id.lgbtn:
//                    Cosbtn.setEnabled(false);
//                    Sinbtn.setEnabled(false);
//                    Ctgbtn.setEnabled(false);
//                    Tgbtn.setEnabled(false);
//                    Lnbtn.setEnabled(false);
//                    Logbtn.setEnabled(false);
//                    Intent intent6 = new Intent(this, MainActivity2.class);
//                    answ.setOnClickListener(new View.OnClickListener() {
//                    public void onClick(View v) {
//                        if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                            Mist1.setText("");
//                            Mist2.setText("");
//                            String tmp = String.valueOf((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))));
//                            intent6.putExtra("gradusi", tmp);
//                            startActivity(intent6);
//                        }else{
//                            Mist1.setText("Введены некорректные данные");
//                        }
//                    }
//                    });
//                    answ2.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf(Math.toRadians((double) Math.log(Double.parseDouble(String.valueOf(EditTextX.getText())))));
//                                intent6.putExtra("radiani", tmp);
//                                startActivity(intent6);
//                            }else{
//                                Mist1.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            OnClickReset();
//                            Sinbtn.setEnabled(true);
//                            Cosbtn.setEnabled(true);
//                            Tgbtn.setEnabled(true);
//                            Ctgbtn.setEnabled(true);
//                            Lnbtn.setEnabled(true);
//                            Lgbtn.setEnabled(true);
//                            Logbtn.setEnabled(true);
//                            Mist1.setText("");
//                            Mist2.setText("");
//                        }
//                    });
//                    break;
//                case R.id.logbtn:
//                    Cosbtn.setEnabled(false);
//                    Sinbtn.setEnabled(false);
//                    Ctgbtn.setEnabled(false);
//                    Tgbtn.setEnabled(false);
//                    Lgbtn.setEnabled(false);
//                    Lnbtn.setEnabled(false);
//                    EditTextY.setEnabled(true);
//                    Intent intent7 = new Intent(this, MainActivity2.class);
//                    answ.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText())) & isNumeric(String.valueOf(EditTextY.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf((double) Math.log(Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / Math.log(Double.parseDouble(String.valueOf(EditTextY.getText())))));
//                                intent7.putExtra("gradusi", tmp);
//                                startActivity(intent7);
//                            }else if(!(isNumeric(String.valueOf(EditTextX.getText()))) & isNumeric(String.valueOf(EditTextY.getText()))){
//                                Mist1.setText("Введены некорректные данные");
//                            }else if(isNumeric(String.valueOf(EditTextX.getText())) & !(isNumeric(String.valueOf(EditTextY.getText())))){
//                                Mist2.setText("Введены некорректные данные");
//                            }
//                            else{
//                                Mist1.setText("Введены некорректные данные");
//                                Mist2.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    answ2.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            if(isNumeric(String.valueOf(EditTextX.getText())) & isNumeric(String.valueOf(EditTextY.getText()))) {
//                                Mist1.setText("");
//                                Mist2.setText("");
//                                String tmp = String.valueOf(Math.toRadians((double) Math.log(Math.log(Double.parseDouble(String.valueOf(EditTextX.getText()))) / Math.log(Double.parseDouble(String.valueOf(EditTextY.getText()))))));
//                                intent7.putExtra("radiani", tmp);
//                                startActivity(intent7);
//                            }else if(!(isNumeric(String.valueOf(EditTextX.getText()))) & isNumeric(String.valueOf(EditTextY.getText()))){
//                                Mist1.setText("Введены некорректные данные");
//                            }else if(isNumeric(String.valueOf(EditTextX.getText())) & !(isNumeric(String.valueOf(EditTextY.getText())))){
//                                Mist2.setText("Введены некорректные данные");
//                            }
//                            else{
//                                Mist1.setText("Введены некорректные данные");
//                                Mist2.setText("Введены некорректные данные");
//                            }
//                        }
//                    });
//                    Cleanbtn.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View v) {
//                            OnClickReset();
//                            Sinbtn.setEnabled(true);
//                            Cosbtn.setEnabled(true);
//                            Tgbtn.setEnabled(true);
//                            Ctgbtn.setEnabled(true);
//                            Lnbtn.setEnabled(true);
//                            Lgbtn.setEnabled(true);
//                            Logbtn.setEnabled(true);
//                            EditTextY.setEnabled(false);
//                            Mist1.setText("");
//                            Mist2.setText("");
//                        }
//                    });
//                    break;
//                default:
//                    break;
//            }
    }
}
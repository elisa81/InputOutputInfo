package com.jmj.edu.inputoutputinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnKeyListener, RadioGroup.OnCheckedChangeListener {

    Button button;
    RadioButton radioButtonF, radioButtonM, radioButtonS, radioButtonJ;
    EditText editText, editText2;
    RadioGroup Sex;
    RadioGroup Job;
    String name, job, sex, age;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText.setOnKeyListener(this);
        editText2 = findViewById(R.id.editText2);
        editText2.setOnKeyListener(this);
        textView3 = findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        radioButtonF = (RadioButton) findViewById(R.id.radioButtonF);
        Sex.setOnCheckedChangeListener(this);
        radioButtonM = (RadioButton) findViewById(R.id.radioButtonM);
        Sex.setOnCheckedChangeListener(this);
        radioButtonJ = (RadioButton) findViewById(R.id.radioButtonJ);
        Job.setOnCheckedChangeListener(this);
        radioButtonS = (RadioButton) findViewById(R.id.radioButtonS);
        Job.setOnCheckedChangeListener(this);
        Job = (RadioGroup) findViewById(R.id.Job);
        Job.setOnCheckedChangeListener(this);
        Sex = (RadioGroup) findViewById(R.id.Sex);
        Job.setOnCheckedChangeListener(this);
    }


    @Override
    public void onClick(View v) {
        textView3.setText("Name: " + name + "Age: " + age + "Sex: " + sex + "Job: " + job);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.radioButtonF:
                sex = radioButtonF.getText().toString();
                break;
            case R.id.radioButtonM:
                sex = radioButtonM.getText().toString();
                break;
            case R.id.radioButtonS:
                job = radioButtonS.getText().toString();
                break;
            case R.id.radioButtonJ:
                job = radioButtonJ.getText().toString();
                break;
        }
    }


    @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {

        switch (v.getId()){
            case R.id.editText:
                name=((EditText)v).getText().toString();
                break;
            case R.id.editText2:
                age=((EditText)v).getText().toString();
                break;
        }
        return false;
    }
}
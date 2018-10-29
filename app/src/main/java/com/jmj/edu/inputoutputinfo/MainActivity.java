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
    RadioGroup Gender;
    RadioGroup Job;
    String name, job, gender, age;
    TextView textViewResult;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);

        editText = findViewById(R.id.editText);
        editText.setOnKeyListener(this);
        editText2 = findViewById(R.id.editText2);
        editText2.setOnKeyListener(this);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Gender = findViewById(R.id.Gender);
        radioButtonF = (RadioButton) findViewById(R.id.radioButtonF);
        radioButtonM = (RadioButton) findViewById(R.id.radioButtonM);

        Job = (RadioGroup) findViewById(R.id.Job);
        radioButtonJ = (RadioButton) findViewById(R.id.radioButtonJ);
        radioButtonS = (RadioButton) findViewById(R.id.radioButtonS);

        Job.setOnCheckedChangeListener(this);
        Gender.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View v) {

        result = "Name: " + name + " / Age: " + age + " / Gender: " + gender + " / Job: " + job;
        textViewResult.setText(result);

        // getCheckedRadioButtonId()
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.radioButtonF:
                gender = radioButtonF.getText().toString();
                break;
            case R.id.radioButtonM:
                gender = radioButtonM.getText().toString();
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
                name = editText.getText().toString();
                break;
            case R.id.editText2:
                age = editText2.getText().toString();
                break;
        }
        return false;
    }
}
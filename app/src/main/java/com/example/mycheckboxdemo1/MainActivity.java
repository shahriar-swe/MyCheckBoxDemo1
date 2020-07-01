package com.example.mycheckboxdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheckBox,vegitableCheckBox,meatCheckBox;
    private Button submitButton;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox = findViewById(R.id.milkCheckBoxId);
        vegitableCheckBox = findViewById(R.id.vegitableCheckBoxId);
        meatCheckBox = findViewById(R.id.meatCheckBoxId);
        submitButton = findViewById(R.id.submitButtonId);
        resultTextView = findViewById(R.id.resultTextViewId);


    }
public void showMessage(View v){
    StringBuilder stringBuilder = new StringBuilder();

    if(milkCheckBox.isChecked()){
        String value = milkCheckBox.getText().toString();
        stringBuilder.append(value+" is ordered \n");
    }
    if(vegitableCheckBox.isChecked()){
        String value = vegitableCheckBox.getText().toString();
        stringBuilder.append(value+" is ordered \n");
    }
    if(meatCheckBox.isChecked()){
        String value = meatCheckBox.getText().toString();
        stringBuilder.append(value+" is ordered \n");
    }
    resultTextView.setText(stringBuilder);
}

}

package com.suleman.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btnadd,btnsub;
    EditText edtnum1;
    EditText edtnum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addNumber(View v)
    {
        edtnum1=(EditText)findViewById(R.id.edtnum1);
        edtnum2=(EditText)findViewById(R.id.edtnum2);
        int num1=Integer.parseInt(edtnum1.getText().toString());
        int num2=Integer.parseInt(edtnum2.getText().toString());
        int result = num1 +num2;
        Toast.makeText(MainActivity.this,Integer.toString(result),Toast.LENGTH_LONG).show();
    }
    public void subNumber(View v)
    {
        edtnum1=(EditText)findViewById(R.id.edtnum1);
        edtnum2=(EditText)findViewById(R.id.edtnum2);
        int num1=Integer.parseInt(edtnum1.getText().toString());
        int num2=Integer.parseInt(edtnum2.getText().toString());
        int result = num1 -num2;
        Toast.makeText(MainActivity.this,Integer.toString(result),Toast.LENGTH_LONG).show();
    }
}

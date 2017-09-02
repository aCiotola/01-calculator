package ca.campbell.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etNum1, etNum2;
    TextView result;
    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get a handle on the text fields
        etNum1 = (EditText) findViewById(R.id.num1);
        etNum2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
    }  //onCreate()

    public void addNums(View v)
    {
        if(validateNums(etNum1, etNum2))
        {
            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
            result.setText(Double.toString(num1 + num2));
        }
        else
            result.setText(R.string.enterNumMsg);
    }

    public void subNums(View v)
    {
        if(validateNums(etNum1, etNum2))
        {
            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
            result.setText(Double.toString(num1 - num2));
        }
        else
            result.setText(R.string.enterNumMsg);
    }
    public void multNums(View v)
    {
        if(validateNums(etNum1, etNum2))
        {
            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
            result.setText(Double.toString(num1 * num2));
        }
        else
            result.setText(R.string.enterNumMsg);
    }
    public void divNums(View v)
    {
        if(validateNums(etNum1, etNum2))
        {
            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
            if(num2 == 0)
                result.setText(R.string.zero);
            else
                result.setText(Double.toString(num1 / num2));
        }
        else
            result.setText(R.string.enterNumMsg);
    }

    public void clearNums(View v)
    {
        etNum1.setText("");
        etNum2.setText("");
        result.setText("");
    }

    public boolean validateNums(EditText n1, EditText n2)
    {
        if(n1.getText().toString().equals("") || n2.getText().toString().equals("") ||
                Double.isNaN(Double.parseDouble(etNum1.getText().toString())) || Double.isNaN(Double.parseDouble(etNum2.getText().toString())))
            return false;
        else
            return true;
    }
}
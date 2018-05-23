package pl.swiebodzin.pzs.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText firstNumber;
    EditText last;
    Button clearButton;
    Button clickButton;
    TextView textsum;

    int a,b,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("life","onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber =findViewById(R.id.firstNumber);
        last =findViewById(R.id.last);
        clickButton =findViewById(R.id.clickButton);
        clearButton =findViewById(R.id.clearButton);
        textsum =findViewById(R.id.textsum);




        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Integer.parseInt(firstNumber.getText().toString());
                b = Integer.parseInt(last.getText().toString());

                //to samo co wyzej tylko w dwoch linijkach
                //String firstNumberString = firstNumber.getText().toString();
                //a = Integer.parseInt(firstNumberString);

                sum = getSum(a,b);

                textsum.setText(String.valueOf(sum));

            }
        });
     clearButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             clear();
         }
         });

    }


    public int getSum(int number1, int number2) {
        return number1 + number2;
    }

    public void clear() {
        textsum.setText("");
        firstNumber.setText("");
        last.setText("");
    }


}


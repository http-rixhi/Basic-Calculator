package ga.gamerzaro.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView answer;
    Button add, substract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);

        answer = findViewById(R.id.answer);

        add = findViewById(R.id.btnAddition);
        substract = findViewById(R.id.btnSubstraction);
        multiply= findViewById(R.id.btnMultiplication);
        divide= findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float firstValue, secondValue, ans;

                firstValue = Float.parseFloat(num1.getText().toString());
                secondValue = Float.parseFloat(num2.getText().toString());
                ans = firstValue + secondValue;

                answer.setText("Answer= " + ans);
            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float firstValue, secondValue, ans;

                firstValue = Float.parseFloat(num1.getText().toString());
                secondValue = Float.parseFloat(num2.getText().toString());
                ans = firstValue - secondValue;

                answer.setText("Answer= " + ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float firstValue, secondValue, ans;

                firstValue = Float.parseFloat(num1.getText().toString());
                secondValue = Float.parseFloat(num2.getText().toString());
                ans = firstValue * secondValue;

                answer.setText("Answer= " + ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float firstValue, secondValue, ans;

                firstValue = Float.parseFloat(num1.getText().toString());
                secondValue = Float.parseFloat(num2.getText().toString());
                ans = firstValue / secondValue;

                answer.setText("Answer= " + ans);
            }
        });

    }
}
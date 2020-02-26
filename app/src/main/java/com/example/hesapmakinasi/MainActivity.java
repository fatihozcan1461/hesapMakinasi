package com.example.hesapmakinasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1text;
    EditText number2text;
    Button   toplama_butonu;
    Button   cikarma_butonu;
    Button   carpma_butonu;
    Button   bolme_butonu;
    TextView ResultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        number1text = findViewById(R.id.editText);
        number2text = findViewById( R.id.editText2 );
        ResultText      = findViewById( R.id.result );

    }

    public void toplama_butonu(View view) {
        if (number1text.getText().toString().matches( "" ) || number2text.getText().toString().matches( "" )) {

            ResultText.setText( "Enter Number!" );

        } else {
            int number1 = Integer.parseInt( number1text.getText().toString() );
            int number2 = Integer.parseInt( number2text.getText().toString() );

            int result = number1 + number2;

            ResultText.setText( "Result: " + result );


        }

    }
    public void cikarma(View view)
    {
        if (number1text.getText().toString().matches( "" ) || number2text.getText().toString().matches( "" )) {

            ResultText.setText( "Enter Number!" );

        } else {
            int number1 = Integer.parseInt( number1text.getText().toString() );
            int number2 = Integer.parseInt( number2text.getText().toString() );

            int result = number1 - number2;

            ResultText.setText( "Result: " + result );
        }
    }




    public void bolme_(View view)
    {

        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")) {

            ResultText.setText("Enter Number!");

        } else {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 / number2;

            ResultText.setText("Result: " + result);
        }


    }
    public void carpma(View view) {
        if (number1text.getText().toString().matches( "" ) || number2text.getText().toString().matches( "" )) {

            ResultText.setText( "Enter Number!" );

        } else {
            int number1 = Integer.parseInt( number1text.getText().toString() );
            int number2 = Integer.parseInt( number2text.getText().toString() );

            int result = number1 * number2;

            ResultText.setText( "Result: " + result );


        }

    }
}

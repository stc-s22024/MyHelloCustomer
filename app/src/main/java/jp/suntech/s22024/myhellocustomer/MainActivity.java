package jp.suntech.s22024.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);

        HelloListrner listrner = new HelloListrner();

        btClick.setOnClickListener(listrner);

        Button CResi = findViewById(R.id.CResi);

        CResi.setOnClickListener(listrner);

        Button CName = findViewById(R.id.CName);

        CName.setOnClickListener(listrner);
    }

    private class HelloListrner implements View.OnClickListener{

        @Override
        public void onClick(View view){
            EditText input1 = findViewById(R.id.etResi);

            EditText input2 = findViewById(R.id.etName);

            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();

            if(id == R.id.btClick){

                String inputStr1 = input1.getText().toString();

                String inputStr2 = input2.getText().toString();

                output.setText(inputStr1 + "にお住いの" + inputStr2 + "さん、こんにちは！");

            }

            else if (id == R.id.CResi) {
                input1.setText("");
                output.setText("");
            }

            else if (id == R.id.CName) {
                input2.setText("");
                output.setText("");
            }

        }
    }
}
package com.example.textview_button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
        TextView txt1 = (TextView) findViewById(R.id.textView10);
        txt1.setText("Hello Tèo");
        btncong=(Button)findViewById(R.id.btncong);
        btntru=(Button)findViewById(R.id.btntru);
        btnnhan=(Button)findViewById(R.id.btnnhan);
        btnchia=(Button)findViewById(R.id.btnchia);
        editsoa=(EditText)findViewById(R.id.editsoa);
        editsob=(EditText)findViewById(R.id.editsob);
        txtketqua=(TextView)findViewById(R.id.txtketqua);
        btncong.setOnClickListener(onclick);
        btntru.setOnClickListener(onclick);
        btnnhan.setOnClickListener(onclick);
        btnchia.setOnClickListener(onclick);
    }

    Button btncong, btntru, btnnhan, btnchia;
    TextView txtketqua;
    EditText editsoa, editsob;

    View.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View argO) {
            switch (argO.getId()) {
                case R.id.btncong:
                    String sa = editsoa.getText() + "";
                    String sb = editsob.getText().toString();
                    int a = Integer.parseInt(sa);
                    int b = Integer.parseInt(sb);
                    txtketqua.setText(a + "+" + b + "=" + (a + b));
                    break;
                case R.id.btntru:
                    String sa1 = editsoa.getText() + "";
                    String sb1 = editsob.getText().toString();
                    int a1 = Integer.parseInt(sa1);
                    int b1 = Integer.parseInt(sb1);
                    txtketqua.setText(a1 + "-" + b1 + "=" + (a1 - b1));
                    break;
                case R.id.btnnhan:
                    String sa2 = editsoa.getText() + "";
                    String sb2 = editsob.getText().toString();
                    int a2 = Integer.parseInt(sa2);
                    int b2 = Integer.parseInt(sb2);
                    txtketqua.setText(a2 + "x" + b2 + "=" + (a2 * b2));
                    break;
                case R.id.btnchia:
                    String sa3 = editsoa.getText() + "";
                    String sb3 = editsob.getText().toString();
                    int a3 = Integer.parseInt(sa3);
                    int b3 = Integer.parseInt(sb3);
                    txtketqua.setText(a3 + ": " + b3 + "=" + (a3 + b3));
                    break;
            }
        }
    };






}

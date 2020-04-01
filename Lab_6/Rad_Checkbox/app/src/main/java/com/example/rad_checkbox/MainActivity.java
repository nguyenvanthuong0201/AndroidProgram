package com.example.rad_checkbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editHoTen,editCMND,editBosung;
    private CheckBox chkdocbao,chkdocsach,chkcoding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editHoTen = (EditText) findViewById(R.id.editHoTen);
        editCMND = (EditText) findViewById(R.id.editCMND);
        editBosung = (EditText) findViewById(R.id.editBosung);
        chkdocbao = (CheckBox) findViewById((R.id.chkdocbao));
        chkdocsach = (CheckBox) findViewById(R.id.chkdocsach);
        chkcoding = (CheckBox) findViewById((R.id.chkdoccoding));
        Button btn = (Button) findViewById((R.id.btnguitt));
        btn.setOnClickListener(new View.OnClickListener() {         ///Khi Click vào Button...
            @Override
            public void onClick(View v) {
                doShowInformation();
            }
        });
    }
        //End Click Button...........................
    public void doShowInformation()
    {
    //// Kiểm tra tên hợp lệ
        String ten=editHoTen.getText()+"";
        ten=ten.trim();
        if(ten.length()<3)
        {
            editHoTen.requestFocus();
            editHoTen.selectAll();
            Toast.makeText(this,"Tên phải lớn hơn 3 ký tự",Toast.LENGTH_LONG).show();
            return;
        }
        String cmnd=editCMND.getText()+"";
        cmnd=cmnd.trim();
        if(cmnd.length() !=9)
        {
            editCMND.requestFocus();
            editCMND.selectAll();
            Toast.makeText(this,"CMND phải đúng 9 ký tự",Toast.LENGTH_LONG).show();
            return;
        }
        //////////////Kiểm tra RadioButton
        String bang="";
        RadioGroup group=(RadioGroup)findViewById(R.id.RadioGroup);
        int id=group.getCheckedRadioButtonId();
        if(id ==-1)
        {
            Toast.makeText(this,"Phải chọn bằng cấp ",Toast.LENGTH_LONG).show();
            return;
        }
        RadioButton rad=(RadioButton) findViewById(id);
        bang=rad.getText()+"";
        ///////////Kiểm tra Checkbox
        String sothich="";
        if(chkdocbao.isChecked())
        {
            sothich+=chkdocbao.getText()+ "\n";
        }
        if(chkdocsach.isChecked())
        {
            sothich+=chkdocsach.getText()+ "\n";
        }
        if(chkcoding.isChecked())
        {
            sothich+=chkcoding.getText()+ "\n";
        }
        //// Bổ Sung
        String bosung=editBosung.getText()+"";

        //////hiển thị thông tin cá nhân
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Thông tin cá nhân");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ///tạo bảng nội dung
        String msg=ten+"\n";
        msg+=cmnd + "\n";
        msg+=bang + "\n";
        msg+=sothich ;
        msg+="--------------------"+ "\n";
        msg+="Thông tin bổ sung"+ "\n";
        msg+=bosung + "\n";
        msg+="--------------------";
        builder.setMessage(msg);     ///thiết lập nội dung
        builder.create().show();     ////hiển thị  Dialog

    }

}


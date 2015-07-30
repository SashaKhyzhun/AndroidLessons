package com.khyzhun.sasha.smssender;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText phn, msg;
    Button send;
    String phone, data;
    ImageButton add;
    ListView lv;
    String[] temp = {"Я занятий","перезвоню пізніше","будь ласка, перезвоніть пізніше",
                     "я їм","я в дорозі","не можу зараз говорити"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phn = (EditText) findViewById(R.id.phn);
        msg = (EditText) findViewById(R.id.msg);
        send = (Button) findViewById(R.id.snd);
        add = (ImageButton) findViewById(R.id.imageButton1);
        lv = (ListView)findViewById(R.id.cntct);
        //lv.setCacheColorHint();




        add.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                lv.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,temp));

                lv.setOnItemClickListener(new OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        // TODO Auto-generated method stub

                        String s = lv.getItemAtPosition(position).toString();
                        String ss = msg.getText().toString();
                        String datas = ss + " " + s;
                        msg.setText(datas);
                    }

                });

            }
        });

        send.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                phone = phn.getText().toString();

                data = msg.getText().toString();

                if (!phn.equals(null)) {

                    try {
                        SmsManager sm = SmsManager.getDefault();
                        sm.sendTextMessage(phone, null, data, null, null);
                        Toast.makeText(getApplicationContext(), "SMS SENT",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(),
                                "Error in sending msg", Toast.LENGTH_SHORT)
                                .show();
                    }

                }
            }
        });
    }
}
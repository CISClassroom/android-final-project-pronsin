package th.ac.kku.cis.mobileapp.kan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class page2 extends AppCompatActivity {
    private EditText addtext;
    private Button addbut;
    private ListView addList;
    private ListView Lastname;
    private ListView Phone;

    private ArrayList<String> addItem;
    private ArrayAdapter<String> addAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Button next = (Button) findViewById(R.id.Home);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(page2.this, MainActivity.class);
                startActivity(i);
            }
        });


        init();

        addbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem.add(" ชื่อ : " + addtext.getText().toString());
                addItem.add("-----------------------------------------");
                addAdapter.notifyDataSetChanged();


            }
        });




        init();

        addbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem.add(" นามสกุล : " + Lastname.toString();
                addItem.add("-----------------------------------------");
                addAdapter.notifyDataSetChanged();

            }
        });

        init();

        addbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem.add(" เบอร์โทร : " + Phone.toString();
                addItem.add("-----------------------------------------");
                addAdapter.notifyDataSetChanged();
            }
        });
    }

        public void init () {
            addtext = (EditText) findViewById(R.id.addtext);
            addbut = (Button) findViewById(R.id.addbut);
            addList = (ListView) findViewById(R.id.addList);
                    Lastname = (ListView) findViewById(R.id.addList);
                    Phone = (ListView) findViewById(R.id.addList);


            addItem = new ArrayList<String>();
            addAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, addItem);
            addList.setAdapter(addAdapter);
        }
    }


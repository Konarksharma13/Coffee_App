package in.ac.sharda.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import in.ac.sharda.aff;
import in.ac.sharda.cap;
import in.ac.sharda.cl;
import in.ac.sharda.coffee.R;
import in.ac.sharda.de;
import in.ac.sharda.es;
import in.ac.sharda.fw;
import in.ac.sharda.lb;
import in.ac.sharda.lm;
import in.ac.sharda.menu1.menu1;
import in.ac.sharda.mo;
import in.ac.sharda.pl;
import in.ac.sharda.ri;
import in.ac.sharda.sm;

public class menu extends AppCompatActivity {

    ListView listView;
    String data[]={"Espresso","Double Espresso","Short Macchiato","Long Macchiato","Ristretto","Long Black","Café Latte","Cappuccino","Flat White","Piccolo Latte","Mocha","Affogato"};
    Spinner spin;
    String data1[]={"Espresso", "Milk","Milk Foam"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("Menu");
        listView=(ListView)findViewById(R.id.listview);
        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter adapter =new ArrayAdapter(menu.this, R.layout.list1, data);
        listView.setAdapter(adapter);

        ArrayAdapter adapter1 =new ArrayAdapter(menu.this, R.layout.list1, data1);
        spin.setAdapter(adapter1);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i1 = new Intent(menu.this, es.class);
                        startActivity(i1);
                        break;
                    case 1:
                        Intent i2 = new Intent(menu.this, de.class);
                        startActivity(i2);
                        break;
                    case 2:
                        Intent i3 = new Intent(menu.this, sm.class);
                        startActivity(i3);
                        break;
                    case 3:
                        Intent i4 = new Intent(menu.this, lm.class);
                        startActivity(i4);
                        break;
                    case 4:
                        Intent i5 = new Intent(menu.this, ri.class);
                        startActivity(i5);
                        break;
                    case 5:
                        Intent i6 = new Intent(menu.this, lb.class);
                        startActivity(i6);
                        break;
                    case 6:
                        Intent i7 = new Intent(menu.this, cl.class);
                        startActivity(i7);
                        break;
                    case 7:
                        Intent i8 = new Intent(menu.this, cap.class);
                        startActivity(i8);
                        break;
                    case 8:
                        Intent i9 = new Intent(menu.this, fw.class);
                        startActivity(i9);
                        break;
                    case 9:
                        Intent i10 = new Intent(menu.this, pl.class);
                        startActivity(i10);
                        break;
                    case 10:
                        Intent i11 = new Intent(menu.this, mo.class);
                        startActivity(i11);
                        break;
                    case 11:
                        Intent i12 = new Intent(menu.this, aff.class);
                        startActivity(i12);
                        break;
                }

            }
        });

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                TextView txt=(TextView)view;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}

package in.ac.sharda.menu1;

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

import in.ac.sharda.coffee.MainActivity;
import in.ac.sharda.coffee.R;

public class menu1 extends AppCompatActivity {

    ListView list;
    String data[]={"Espresso","Double Espresso","Short Macchiato","Long Macchiato","Ristretto","Long Black","Café Latte"                     ,"Cappuccino","Flat White","Piccolo Latte","Mocha","Affogato"};
    Button btn;
    Spinner spin;
    String data1[]={"Espresso", "Milk","Milk Foam"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        list=(ListView)findViewById(R.id.listview);
        btn=(Button)findViewById(R.id.back) ;
        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter adapter =new ArrayAdapter(menu1.this, R.layout.list1, data);
        list.setAdapter(adapter);

        ArrayAdapter adapter1 =new ArrayAdapter(menu1.this, R.layout.list1, data1);
        spin.setAdapter(adapter1);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView txt=(TextView)view;

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


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(menu1.this, MainActivity.class);
                startActivity(i);

            }
        });



    }
}

package in.ac.sharda.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import in.ac.sharda.home.home;
import in.ac.sharda.menu1.menu1;

public class MainActivity extends AppCompatActivity {

    Button menu,order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu=(Button)findViewById(R.id.menu);
        order=(Button)findViewById(R.id.order);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, menu1.class);
                startActivity(i);
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, home.class);
                startActivity(i);
            }
        });
    }
}

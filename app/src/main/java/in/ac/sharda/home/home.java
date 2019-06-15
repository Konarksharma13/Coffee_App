package in.ac.sharda.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import in.ac.sharda.coffee.R;
import in.ac.sharda.menu.menu;
import in.ac.sharda.signIn.signIn;

public class home extends AppCompatActivity {

    TextView txt1,txt2;
    Button login,signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Login");
        login=(Button)findViewById(R.id.login);
        signUp=(Button)findViewById(R.id.signUp);

        txt1=(EditText)findViewById(R.id.id);
        txt2=(EditText)findViewById(R.id.pwd);

        final String un="1";
        final String pwd="1";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=txt1.getText().toString();
                String pwd1=txt2.getText().toString();
                if((TextUtils.isEmpty(id))||(TextUtils.isEmpty(pwd1))){
                    txt1.setError("Enter username");
                    txt2.setError("Enter password");

                }
                else {


                    if(txt1.getText().toString().equalsIgnoreCase(un)
                            && (txt2.getText().toString().equalsIgnoreCase(pwd)))
                    {

                        Intent i=new Intent(home.this, menu.class);
                        i.putExtra("data", un);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(home.this, "Please enter correct username/password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home.this, signIn.class);
                startActivity(i);
            }
        });


    }
}

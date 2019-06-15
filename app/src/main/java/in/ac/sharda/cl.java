package in.ac.sharda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import in.ac.sharda.coffee.R;

public class cl extends AppCompatActivity {

    Button btnAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cl);

        btnAddToCart = (Button)findViewById(R.id.btnAddToCart);

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cl.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.imagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onclickSwitch(View view)
    {
        ImageView cat1=(ImageView)findViewById(R.id.imageView);
      cat1.setImageResource(R.drawable.cat2);
        Toast.makeText(this, "id is:"+cat1.getId(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

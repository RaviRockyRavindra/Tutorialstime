package com.tutorialstime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class developerr extends AppCompatActivity implements View.OnClickListener {

    Button button12,button13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developerr);
        button12=(Button)findViewById(R.id.button12);
        button13=(Button)findViewById(R.id.button13);

        button12.setOnClickListener(this);
        button13.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        int h;
        h=view.getId();

        switch(h)
        {
            case R.id.button12:
                Toast.makeText(this, "My Youtube Channel", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCTCgj4ePK0OzSCkyRv7eTEg/videos")));
        break;
            case R.id.button13:
                Toast.makeText(this, "Must be Log_in", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ravilog")));
                 break;


        }





    }
}

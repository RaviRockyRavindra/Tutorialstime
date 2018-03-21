package com.tutorialstime;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class servers extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8=new Intent(Intent.ACTION_SEND);
                i8.setData(Uri.parse("email"));
                String[] s={"Raviforyou1418@gmail.com"};
                i8.putExtra(Intent.EXTRA_EMAIL,s);
                i8.putExtra(Intent.EXTRA_SUBJECT,"Reporting the Query");
                i8.putExtra(Intent.EXTRA_TEXT,"please report your problem clearly");
                i8.setType("message/rfc822");
                Intent chooser=Intent.createChooser(i8,"lunch Email");
                startActivity(chooser);

            }
        });
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
int u;
        u=view.getId();
        switch (u)
        {
            case R.id.button2:
                Toast.makeText(this, "server examples", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CDxaRfwzFrs")));
                break;
            case R.id.button1:
                Toast.makeText(this, "Interview based questions on servers ", Toast.LENGTH_SHORT).show();
                Intent i77=new Intent(this,serversquestions.class);
                startActivity(i77);
                break;
        }
    }
}

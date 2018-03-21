package com.tutorialstime;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by root on 4/11/17.
 */

public class ListAdapter extends AppCompatActivity {

String [] titles = {"Android","Hacking","Ip Address","Linux Commands","Networking","Computer Shortcuts","Routers","Servers","Html","Java","Swift","Python","Javascript","Dotnet","C Language"};
int  [] images={R.drawable.androidd,R.drawable.hackingpic,R.drawable.ipadresslogo,R.drawable.linuxnewlogo,R.drawable.computernetworking,R.drawable.computersshortlogo,R.drawable.routerlogonew,R.drawable.serverlogonew,R.drawable.htmlnewlogo,R.drawable.javanewlogo,R.drawable.swifttut,R.drawable.pythonlogonew,R.drawable.javascrtipnew,R.drawable.dotnetlogo,R.drawable.clannewlogo};
    ListView lv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.listadapter);
        FloatingActionButton fab143 = (FloatingActionButton) findViewById(R.id.fab143);
        fab143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2= new Intent(Intent.ACTION_SEND);
                i2.setType("text/plain");
                i2.putExtra(Intent.EXTRA_TEXT,"Here goes our app TUTORIALS TIME the best way to improve our skills");
                i2.setPackage("com.whatsapp");
                startActivity(i2);

            }
        });
        lv=(ListView) findViewById(R.id.idlistview);
        MyAdapter adapter= new MyAdapter(this,titles,images);
        lv.setAdapter(adapter);
lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        switch(i)
        {
            case 0:
                Intent i0=new Intent(ListAdapter.this,android1.class);
                startActivity(i0);
                break;
            case 1:
                Intent i01=new Intent(ListAdapter.this,hacking1.class);
                startActivity(i01);
                break;
            case 2:
                Intent i13=new Intent(ListAdapter.this,ipadress1.class);
                startActivity(i13);
                break;
            case 3:
                Intent i12=new Intent(ListAdapter.this,linuxcommands.class);
                startActivity(i12);
                break;
            case 4:
                Intent i90=new Intent(ListAdapter.this,networking1.class);
                startActivity(i90);
                break;
            case 5:
                Intent i11=new Intent(ListAdapter.this,computershorts.class);
                startActivity(i11);
                break;
            case 6:
                Intent i1=new Intent(ListAdapter.this,routers.class);
                startActivity(i1);
                break;
            case 7:
                Intent i2=new Intent(ListAdapter.this,servers.class);
                startActivity(i2);
                break;
            case 8:
                Intent i3=new Intent(ListAdapter.this,Html.class);
                startActivity(i3);
                break;
            case 9:
                Intent i4=new Intent(ListAdapter.this,java1.class);
                startActivity(i4);
                break;
            case 10:
                Intent i5=new Intent(ListAdapter.this,swift1.class);
                startActivity(i5);
                break;
            case 11:
                Intent i6=new Intent(ListAdapter.this,myqsl.class);
                startActivity(i6);
                break;
            case 12:
                Intent i7=new Intent(ListAdapter.this,javascript1.class);
                startActivity(i7);
                break;
            case 13:
                Intent i8=new Intent(ListAdapter.this,Dotnet.class);
                startActivity(i8);
                break;

            case 14:
                Intent i09=new Intent(ListAdapter.this,clang.class);
                startActivity(i09);
                break;

        }

    }
});
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.developer)
            {
            Intent iu=new Intent(this,developerr.class);
            startActivity(iu);
            }


        if (id ==R.id.Reporting)
        {

            Toast.makeText(ListAdapter.this, "choose the mail to send the request", Toast.LENGTH_SHORT).show();
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

        return super.onOptionsItemSelected(item);
    }


}

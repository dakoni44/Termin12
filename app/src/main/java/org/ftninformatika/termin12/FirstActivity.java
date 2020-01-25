package org.ftninformatika.termin12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private int a=0;
    private String b="x";
    private float c=4.0f;
    private int[] d={1,2,3};

    private int brojac=0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("a",a);
        outState.putString("b",b);
        outState.putFloat("c",c);
        outState.putIntArray("d",d);
        outState.putInt("brojac", brojac);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        if(savedInstanceState!=null){
            a=savedInstanceState.getInt("a");
            b=savedInstanceState.getString("b");
            c=savedInstanceState.getFloat("c");
            d=savedInstanceState.getIntArray("d");
            brojac=savedInstanceState.getInt("brojac");
        }
        Log.i("FirstActivity", "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }

    public void klikNaPrvoDugme(View v){
        brojac++;
        Toast.makeText(this, "klik na prvo dugme "+brojac, Toast.LENGTH_SHORT).show();
    }

    public void klikNaNext(View v){
        Button b= (Button)v;
        if(v.getId()== R.id.button3){

        }
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("FirstActivity", "onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("FirstActivity", "onResume");
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("FirstActivity", "onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("FirstActivity", "onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("FirstActivity", "onRestart");
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("FirstActivity", "onDestroy");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }
}

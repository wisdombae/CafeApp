package com.bjh.www.cafeapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOrder = findViewById(R.id.buttonOrder);
        buttonOrder.setOnClickListener(this);
        TextView textViewDate = findViewById(R.id.textViewDate);
        TextView textViewCount = findViewById(R.id.textViewCount);

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        String datetime = format.format(new Date());

        textViewDate.setText(datetime);
        textViewCount.setText("오늘 주문건수: ");




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemOrder:
                Intent intent = new Intent(this, OrderListActivity.class);
                startActivityForResult(intent, 1000);
                return true;
            case R.id.itemMenu:

                return true;
            case R.id.itemTable:

                return true;

        }
        return false;
    }

    @Override
    public void onClick(View v) {



        Intent intent = new Intent(this, OrderActivity.class);
        startActivityForResult(intent, 100);



    }
}

package com.example.khoavin.routineapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button b = (Button)findViewById(R.id.button) ;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("haha");
        NotificationManager notifyManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                Notification.Builder notifyBuilder = new Notification.Builder(MainActivity.this);
                notifyBuilder.setContentTitle("My hat is red!");
                notifyBuilder.setContentText("Cái mũ của tôi màu đỏ");
                notifyBuilder.setSmallIcon(R.drawable.icon);
                notifyManager.notify(1,notifyBuilder.build());
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}

package com.cmu.laiw.jamesblunt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
    private boolean flag = false;
    private boolean flag2 = false;
    private boolean flag3 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menu buttons
        LinearLayout menu1 = (LinearLayout)findViewById(R.id.menu_1);
        LinearLayout menu2 = (LinearLayout)findViewById(R.id.menu_2);
        LinearLayout menu3 = (LinearLayout)findViewById(R.id.menu_3);
        LinearLayout menu4 = (LinearLayout)findViewById(R.id.menu_4);
        LinearLayout menu5 = (LinearLayout)findViewById(R.id.menu_5);

        //control menu display
        final LinearLayout display = (LinearLayout)findViewById(R.id.linearLayout_display);
        final LinearLayout mv_display = (LinearLayout)findViewById(R.id.mv_display);
        final LinearLayout song_display = (LinearLayout)findViewById(R.id.song_display);

        //mv buttons
        Button mv1 = (Button)findViewById(R.id.mv1);
        Button mv2 = (Button)findViewById(R.id.mv2);

        //SNS buttons
        ImageButton fb = (ImageButton)findViewById(R.id.fbButton);
        ImageButton twit = (ImageButton)findViewById(R.id.twitterButton);
        ImageButton ins = (ImageButton)findViewById(R.id.insButton);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPackageInstalled("com.facebook.katana",MainActivity.this)) {
                    String uri = "facebook://facebook.com/16855985423";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Install facebook app first!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPackageInstalled("com.twitter.android",MainActivity.this)) {
                String uri = "twitter://user?user_id=82097756";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Install twitter app first!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPackageInstalled("com.instagram.android",MainActivity.this)) {
                Uri uri = Uri.parse("http://instagram.com/_u/jamesblunt");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Install instagram app first!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,VideoActivity.class);
                startActivity(i);
            }
        });

        mv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,VideoActivity2.class);
                startActivity(i);
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=!flag;
                if(flag){
                    display.setVisibility(View.VISIBLE);
                }else{
                    display.setVisibility(View.GONE);

                }
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag3=!flag3;
                if(flag3){
                    song_display.setVisibility(View.VISIBLE);
                }else{
                    song_display.setVisibility(View.GONE);

                }
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag2=!flag2;
                if(flag2){
                    mv_display.setVisibility(View.VISIBLE);
                }else {
                    mv_display.setVisibility(View.GONE);

                }
            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,GalleryActivity.class);
                startActivity(i);
            }
        });

        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i = new Intent(Intent.ACTION_VIEW);
                String subject ="Subscribe for mailing list";
                String body = "I would like to subscribe to james blunt's mailing list!";
                Uri data = Uri.parse("mailto:jamesblunt@jamesblunt.com?subject=" + subject + "&body=" + body);
                i.setData(data);
                startActivity(i);
            }
        });


    }
    //check if package is installed before open
    private boolean isPackageInstalled(String packagename, Context context) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(packagename, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            return false;
        }
    }
    public void playSong1(View view) {
        Intent i = new Intent(this, PlaySong.class);
        startService(i);
        Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();

    }

    public void stopSong1(View view) {
        Intent i = new Intent(this, PlaySong.class);
        stopService(i);
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();

    }

    public void playSong2(View view) {
        Intent i = new Intent(this, PlaySong2.class);
        startService(i);
        Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();

    }

    public void stopSong2(View view) {
        Intent i = new Intent(this, PlaySong2.class);
        stopService(i);
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}

package com.cmu.laiw.jamesblunt;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;


public class PlaySong extends Service{
    private static final String LOGCAT = null;
    MediaPlayer player;

    public void onCreate(){
        super.onCreate();
        Log.d(LOGCAT, "Service Started!");
        player = MediaPlayer.create(this,R.raw.audio_1);
    }

    public int onStartCommand(Intent intent, int flags, int startId){
        player.start();
        Log.d(LOGCAT, "Media Player started!");
        if(player.isLooping() != true){
            Log.d(LOGCAT, "Problem in Playing Audio");
        }
        return 1;
    }

    public void onStop(){
        player.stop();
        player.release();
    }

    public void onPause(){
        player.stop();
        player.release();
    }

    public void onDestroy(){
        player.stop();
        player.release();
    }

    @Override
    public IBinder onBind(Intent objIndent) {
        return null;
    }
}
package com.cmu.laiw.jamesblunt;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Roy on 4/7/15.
 */
public class VideoActivity2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);

        VideoView video2 = (VideoView)findViewById(R.id.video2);
        Uri vid_src2 = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.mv2);

        MediaController mc2 = new MediaController(this);
        video2.setMediaController(mc2);
        video2.setVideoURI(vid_src2);
        video2.start();


    }
}

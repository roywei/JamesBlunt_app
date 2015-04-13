package com.cmu.laiw.jamesblunt;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;
/**
 * Created by Roy on 4/7/15.
 */
public class VideoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView video = (VideoView)findViewById(R.id.video);
        Uri vid_src = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.mv1);

        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.setVideoURI(vid_src);
        video.start();
    }
}

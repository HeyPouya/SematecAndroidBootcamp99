package com.sematec.bootcamp99;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class TestVideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        VideoView vv = findViewById(R.id.vv);
        String address = "https://hw15.cdn.asset.aparat.com/aparat-video/d69d3c92ce475859bb00547f9d40da7a20482399-144p.mp4";

        vv.setMediaController(new MediaController(TestVideoViewActivity.this));
        vv.setVideoURI(Uri.parse(address));
        vv.start();
    }
}

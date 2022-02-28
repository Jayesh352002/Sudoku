package com.example.sudoApp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class BackSound extends Service {
    MediaPlayer mediaPlayer1 ;
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer1 = MediaPlayer.create(this, R.raw.back2);
        mediaPlayer1.setLooping(true); // Set looping
        mediaPlayer1.setVolume(100, 100);
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer1.start();
        Toast.makeText(getApplicationContext(), "Playing Winning Music",    Toast.LENGTH_SHORT).show();
        return startId;
    }
    public void onStart(Intent intent, int startId) {
    }
    @Override
    public boolean onUnbind(Intent intent) {
        mediaPlayer1.stop();
        return true;
    }

    @Override
    public void onDestroy() {
        mediaPlayer1.stop();
        mediaPlayer1.release();
    }
    @Override
    public void onLowMemory() {
    }
}

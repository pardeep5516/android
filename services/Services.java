package com.example.new_app;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Services extends Service {

    private MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate(){
        Toast.makeText(this, "Services created", Toast.LENGTH_LONG).show();
    }
    public int onStartCommand(Intent intent, int flag, int startId){
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        Toast.makeText(this, "Services start", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
    public void onDestroy(){
        super.onDestroy();
        mediaPlayer.stop();
        Toast.makeText(this, "Services stopped", Toast.LENGTH_LONG).show();
    }
}

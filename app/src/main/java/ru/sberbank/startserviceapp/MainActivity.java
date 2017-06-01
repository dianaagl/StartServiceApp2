package ru.sberbank.startserviceapp;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent("ru.sberbank.learning.downloader.DownloadService");//
        ComponentName component = new  ComponentName("ru.sberbank.learning.downloader",
                "ru.sberbank.learning.downloader.DownloadService");

        intent.setData(Uri.parse("https://www.google.ru/imgres?imgurl=http%3A%2F%2Forig02.deviantart.net%2Fc3d2%2Ff%2F2012%2F057%2Fb%2Ff%2Fguitar_art_by_bast202-d4r3w08.jpg&imgrefurl=http%3A%2F%2Fmeanswe.ru%2Fkartinki-gitara-art&docid=EwohV1gZZxkMXM&tbnid=OsQ-5n3CoVzZvM%3A&vet=10ahUKEwjK9c-RjJjUAhVBjSwKHSbQAqoQMwgnKAIwAg..i&w=3000&h=4000&itg=1&bih=599&biw=1004&q=rfhnbyrb&ved=0ahUKEwjK9c-RjJjUAhVBjSwKHSbQAqoQMwgnKAIwAg&iact=mrc&uact=8"));
        intent.putExtra(".EXTRA_FILE_NAME", "HugeFile.jpg");
        intent.setAction("another");

        intent.setComponent(component);

        startService(intent);
    }
}

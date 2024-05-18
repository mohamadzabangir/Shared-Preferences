package com.example.sharedpregerences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    UserSetting userSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSettings = new UserSetting(this);

        //        below codes are for setting data in shared preferences and store that in android system in phone
//        userSettings.setSharedPrefUser("hoseini");
//        userSettings.setSharedPrefEmail("hoseini@gmail.com");


//        below codes are for getting back data from shared preferences and they return String you can use that as string
//        userSettings.getSharePrefEmail();
//        userSettings.getSharedPrefUser();

        Toast.makeText(this, "email : " + userSettings.getSharePrefEmail() + " , User :" + userSettings.getSharedPrefUser(), Toast.LENGTH_SHORT).show();

    }

}
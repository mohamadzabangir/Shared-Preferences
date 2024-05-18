package com.example.sharedpregerences;

import android.content.Context;
import android.content.SharedPreferences;

public class UserSetting {
    private SharedPreferences sharedPref;

    public UserSetting(Context context) {
        sharedPref = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE);
    }

    public void setSharedPrefUser(String user) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("key_user", user);
        editor.apply();
    }

    public void setSharedPrefEmail(String email) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("key_email", email);
        editor.apply();
    }

    public String getSharedPrefUser() {
        return sharedPref.getString("key_user", "");
    }

    public String getSharePrefEmail() {
        return sharedPref.getString("key_email", "");
    }


}
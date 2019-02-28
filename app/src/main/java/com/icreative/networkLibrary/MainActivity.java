package com.icreative.networkLibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.icreative.networkLibrary.apiInterface.ApiBuilder;
import com.icreative.networkLibrary.apiInterface.ApiModel;

import java.util.HashMap;

import okhttp3.OkHttpClient;
import okhttp3.internal.http.HttpMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        HashMap<String, String> mapData = new HashMap<>();
        ApiModel apiModel = new ApiBuilder("Your Custom URL is ").setMapData(mapData).build();
        //

    }

}

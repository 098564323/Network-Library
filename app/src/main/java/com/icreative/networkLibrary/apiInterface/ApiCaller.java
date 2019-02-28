package com.icreative.networkLibrary.apiInterface;


import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;

import okhttp3.internal.http.HttpMethod;

public class ApiCaller {

    private static ApiCaller instance;

    public static ApiCaller getInstance() {
        if (instance == null) {
            instance = new ApiCaller();
        }

        return instance;
    }

    public void testData(String URL) {
        AndroidNetworking.get(URL)
                .addPathParameter("pageNumber", "0")
                .addQueryParameter("limit", "3")
                .setPriority(Priority.LOW)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {
                        // do anything with response
                    }

                    @Override
                    public void onError(ANError error) {
                        // handle error
                    }
                });
    }

}

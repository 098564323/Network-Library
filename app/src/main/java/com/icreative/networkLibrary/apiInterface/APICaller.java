package com.icreative.networkLibrary.apiInterface;


import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;

import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.HashMap;

import io.reactivex.Observable;

public class APICaller {

    private static APICaller instance;

    public static APICaller getInstance() {
        if (instance == null) {
            instance = new APICaller();
        }

        return instance;
    }

    /**
     * @param URL
     * @param yourModelName
     * @param apiInterface
     * @param <T>
     */
    public <T> void requestGetMethod(String URL, HashMap<?, ?> requestData, final T yourModelName, final APIInterface apiInterface) {
        //
        ANRequest.GetRequestBuilder getRequestBuilder = AndroidNetworking.get(URL);
        //
        //getRequestBuilder.addHeaders("");
        //
        getRequestBuilder.addPathParameter(requestData);
        //
        getRequestBuilder.addQueryParameter(requestData);
        getRequestBuilder.setPriority(Priority.MEDIUM);
        //
        ANRequest anRequest = getRequestBuilder.build();
        anRequest.getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {
                Gson gson = new Gson();
                //
                apiInterface.getResponseData(Observable.just(gson.fromJson(response.toString(), yourModelName.getClass())));
                //
            }

            @Override
            public void onError(ANError anError) {
                apiInterface.getResponseData(Observable.error(anError));
            }
        });
    }


}

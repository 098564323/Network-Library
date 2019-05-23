package com.icreative.networkLibrary.apiInterface;

import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.Gson;

import org.json.JSONObject;

import io.reactivex.Observable;

public class APICaller {

    private static APICaller instance;
    public static boolean RESPONSE_LOG = false;

    public static APICaller getInstance() {
        if (instance == null) {
            instance = new APICaller();
        }

        return instance;
    }

    /**
     * @param apiBuilder
     * @param yourModelName
     * @param apiInterface
     */
    public void requestForGetMethod(APIBuilder apiBuilder, Class yourModelName, final APIInterface apiInterface) {
        //
        ANRequest.GetRequestBuilder getRequestBuilder = AndroidNetworking.get(apiBuilder.URL + apiBuilder.methodName);
        //
        getRequestBuilder.setPriority(Priority.MEDIUM);
        //
        ANRequest anRequest = getRequestBuilder.build();
        anRequest.getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {
                if (apiBuilder.isReturnJsonFormat) {
                    apiInterface.getResponseData(Observable.just(response.toString()));
                } else {
                    //
                    Gson gson = new Gson();
                    //
                    apiInterface.getResponseData(Observable.just(gson.fromJson(response.toString(), yourModelName)));
                }
            }

            @Override
            public void onError(ANError anError) {
                apiInterface.getResponseData(Observable.error(anError));
            }
        });
    }


    /**
     * @param apiBuilder
     * @param yourModelName
     * @param apiInterface
     */
    public void requestForPostMethod(APIBuilder apiBuilder, Class yourModelName, final APIInterface apiInterface) {
        //
        ANRequest.PostRequestBuilder postRequestBuilder = AndroidNetworking.post(apiBuilder.URL + apiBuilder.methodName);
        //
        postRequestBuilder.setPriority(Priority.MEDIUM);
        //
        if (apiBuilder.isRequestJsonFormat)
            postRequestBuilder.addJSONObjectBody(apiBuilder.requestJsonObject);
        else
            postRequestBuilder.addBodyParameter(apiBuilder.requestData);
        //
        ANRequest anRequest = postRequestBuilder.build();
        anRequest.getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {
                //
                if (RESPONSE_LOG)
                    Log.e("MyTag", "Response Success:: " + response.toString());
                //
                if (apiBuilder.isReturnJsonFormat) {
                    apiInterface.getResponseData(Observable.just(response.toString()));
                } else {
                    //
                    Gson gson = new Gson();
                    apiInterface.getResponseData(Observable.just(gson.fromJson(response.toString(), yourModelName)));
                }
            }

            @Override
            public void onError(ANError anError) {
                //
                if (RESPONSE_LOG)
                    Log.e("MyTag", "Response Error:: " + anError.getErrorBody() + " Detail :: "
                            + anError.getErrorDetail() + " Message:: " + anError.getMessage() + " Resonse Message:: "
                            + anError.getResponse().message() + " Response String:: " + anError.getResponse().toString());
                //
                apiInterface.getResponseData(Observable.error(anError));
            }
        });


    }

    /**
     * @param apiBuilder
     * @param yourModelName
     * @param apiInterface
     */
    public void requestForMultiPart(APIBuilder apiBuilder, Class yourModelName, final APIInterface apiInterface) {
        //
        ANRequest.MultiPartBuilder multiPartBuilder = new ANRequest.MultiPartBuilder(apiBuilder.URL + apiBuilder.methodName);
        //
        multiPartBuilder.setPriority(Priority.MEDIUM);
        multiPartBuilder.addMultipartFileList(apiBuilder.multiPartFileData);
        multiPartBuilder.addMultipartParameter(apiBuilder.requestData);
        //
        ANRequest anRequest = multiPartBuilder.build();
        anRequest.getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {
                if (apiBuilder.isReturnJsonFormat) {
                    apiInterface.getResponseData(Observable.just(response.toString()));
                } else {
                    //
                    Gson gson = new Gson();
                    //
                    apiInterface.getResponseData(Observable.just(gson.fromJson(response.toString(), yourModelName)));
                }
            }

            @Override
            public void onError(ANError anError) {
                apiInterface.getResponseData(Observable.error(anError));
            }
        });
    }
}

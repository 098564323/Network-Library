package com.icreative.networkLibrary.apiInterface;

import android.util.Log;

import com.icreative.networkLibrary.httpClient.HTTPMethod;

public class APIModel {

    private APIBuilder apiBuilder;

    public APIModel(APIBuilder apiBuilder) {
        this.apiBuilder = apiBuilder;
    }

    /**
     * @param httpMethod
     * @param yourModelName
     * @param apiInterface
     */
    public void getDataOverNetwork(HTTPMethod httpMethod, Class yourModelName, APIInterface apiInterface) {
        switch (httpMethod) {
            case GET:
                APICaller.getInstance().requestForGetMethod(apiBuilder, yourModelName, apiInterface);
                break;
            case PUT:
                Log.e("myTag", "Method is not build yet");
                break;
            case DELETE:
                Log.e("myTag", "Method is not build yet");
                break;
            case POST:
                APICaller.getInstance().requestForPostMethod(apiBuilder, yourModelName, apiInterface);
                break;
            case MULTIPART:
                APICaller.getInstance().requestForMultiPart(apiBuilder, yourModelName, apiInterface);
                break;
            default:
        }
    }
}

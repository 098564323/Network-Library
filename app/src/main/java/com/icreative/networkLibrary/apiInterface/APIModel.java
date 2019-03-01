package com.icreative.networkLibrary.apiInterface;

import android.util.Log;

import com.icreative.networkLibrary.httpClient.HTTPMethod;

import java.util.HashMap;

public class APIModel {

    private String URL;
    private HashMap<?, ?> requestData;
    private String methodName;

    public APIModel(APIBuilder apiBuilder) {
        this.URL = apiBuilder.URL;
        this.requestData = apiBuilder.requestData;
        this.methodName = apiBuilder.methodName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public HashMap<?, ?> getRequestData() {
        return requestData;
    }

    public void setRequestData(HashMap<?, ?> requestData) {
        this.requestData = requestData;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * @param httpMethod
     * @param yourModelName
     * @param apiInterface
     * @param <T>
     */
    public void getDataOverNetwork(HTTPMethod httpMethod, Class yourModelName, APIInterface apiInterface) {
        switch (httpMethod) {
            case GET:
                Log.e("myTag", "GET Method is call from here == " + (URL + methodName));
                APICaller.getInstance().requestGetMethod(URL + methodName, requestData, yourModelName, apiInterface);
                break;
            case PUT:
                Log.e("myTag", "PUT Method is call from here");
                break;
            case DELETE:
                Log.e("myTag", "DELETE Method is call from here");
                break;
            case POST:
                Log.e("myTag", "POST Method is call from here");
                break;
            default:
        }
    }
}

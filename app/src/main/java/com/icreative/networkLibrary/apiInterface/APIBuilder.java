package com.icreative.networkLibrary.apiInterface;

import java.util.HashMap;

public class APIBuilder {

    public String URL;
    public String methodName;
    public HashMap<?, ?> requestData;
    public HashMap<?, ?> multiPartFileData;
    public boolean isReturnJsonFormat;

    public APIBuilder setURL(String URL) {
        this.URL = URL;
        return this;
    }

    public APIBuilder setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public <key, value> APIBuilder setRequestData(HashMap<key, value> requestData) {
        this.requestData = requestData;
        return this;
    }

    public <key, value> APIBuilder setMultiPartFileData(HashMap<key, value> multiPartFileData) {
        this.multiPartFileData = multiPartFileData;
        return this;
    }

    public APIBuilder setResponseAsJson(boolean isReturnJsonFormat) {
        this.isReturnJsonFormat = isReturnJsonFormat;
        return this;
    }

    public APIModel build() {
        return new APIModel(this);
    }
}

package com.icreative.networkLibrary.apiInterface;

import java.util.HashMap;

public class APIBuilder {

    public String URL;
    public String methodName;
    public HashMap<?, ?> requestData;

    public APIBuilder(String URL) {
        this.URL = URL;
    }

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

    public APIModel build() {
        return new APIModel(this);
    }
}

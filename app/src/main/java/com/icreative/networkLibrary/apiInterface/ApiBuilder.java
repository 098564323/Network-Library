package com.icreative.networkLibrary.apiInterface;

import java.util.HashMap;

public class ApiBuilder {

    private String URL;
    private HashMap<?, ?> mapData;

    public ApiBuilder(String URL) {
        this.URL = URL;
    }


    public ApiBuilder setURL(String URL) {
        this.URL = URL;
        return this;
    }

    public <key, value> ApiBuilder setMapData(HashMap<key, value> mapData) {
        this.mapData = mapData;
        return this;
    }

    public ApiModel build() {
        return new ApiModel(URL, mapData);
    }
}

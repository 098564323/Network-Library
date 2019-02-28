package com.icreative.networkLibrary.apiInterface;

import java.util.HashMap;

public class ApiModel {

    private String URL;
    private HashMap<?, ?> mapData;


    public ApiModel(String URL) {
        this.URL = URL;
    }

    public ApiModel(String URL, HashMap<?, ?> mapData) {
        this.URL = URL;
        this.mapData = mapData;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public HashMap<?, ?> getMapData() {
        return mapData;
    }

    public void setMapData(HashMap<?, ?> mapData) {
        this.mapData = mapData;
    }
}

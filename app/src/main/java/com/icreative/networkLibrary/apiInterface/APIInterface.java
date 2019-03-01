package com.icreative.networkLibrary.apiInterface;

import io.reactivex.Observable;

public interface APIInterface {
    <T> void getResponseData(Observable<T> observableData);
}

package com.icreative.networkLibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androidnetworking.error.ANError;
import com.icreative.networkLibrary.apiInterface.APIInterface;
import com.icreative.networkLibrary.apiInterface.APIBuilder;
import com.icreative.networkLibrary.apiInterface.APIModel;
import com.icreative.networkLibrary.httpClient.HTTPMethod;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        HashMap<String, String> mapData = new HashMap<>();
        APIModel apiModel = new APIBuilder("http://68.66.207.57/laser_api/").setMethodName("get_all_users.php").setRequestData(mapData).build();
        //
        apiModel.getDataOverNetwork(HTTPMethod.GET, GetAllData.class, new APIInterface() {
            @Override
            public <T> void getResponseData(Observable<T> observableData) {
                observableData.subscribe(new Observer<T>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("myTag", "OnSubscribe Will Be called");
                    }

                    @Override
                    public void onNext(T t) {
                        Log.e("myTag", "OnNext Will Be called "+(t instanceof GetAllData));
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("myTag", "Error Data is " + ((ANError) e).getErrorBody() + " Message Data " + e.getMessage());

                    }

                    @Override
                    public void onComplete() {
                        Log.e("myTag", "OnComplete Will Be called");
                    }
                });
            }
        });
    }

}

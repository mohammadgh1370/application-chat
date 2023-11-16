package com.buytick.chatapplication.Activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.buytick.chatapplication.R;
import com.buytick.chatapplication.Retrofit.ApiClient;
import com.buytick.chatapplication.Retrofit.ApiInterface;
import com.buytick.chatapplication.Utils.SharedPref;
import com.buytick.chatapplication.Utils.Toasty;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BaseActivity extends AppCompatActivity {

    protected ApiInterface apiInterface;
    protected SharedPref pref;
    protected Toasty toasty;
    protected FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iranian_sans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        container = (FrameLayout) findViewById(R.id.container);

        apiInterface = new ApiClient(this).getClient().create(ApiInterface.class);
        pref = new SharedPref(this);
        toasty = new Toasty(this,container);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

package com.example.arthurwang.reactnative;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.BuildConfig;
import android.view.KeyEvent;

import com.facebook.react.LifecycleState;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;

public class MainActivity extends AppCompatActivity implements DefaultHardwareBackBtnHandler
{
    private ReactRootView mReactRootView;
    private ReactInstanceManager mReactInstanceManager;

    public static int OVERLAY_PERMISSION_REQ_CODE = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mReactRootView = new ReactRootView(this);
        mReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setBundleAssetName("index.android.bundle")
                .setJSMainModuleName("index.android")
                .addPackage(new MainReactPackage())
                .setUseDeveloperSupport(BuildConfig.DEBUG)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build();

        mReactRootView.startReactApplication(mReactInstanceManager, "RNHighScores", null);

        setContentView(R.layout.activity_main);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
//        {
//            if (!Settings.canDrawOverlays(this))
//            {
//                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
//                startActivityForResult(intent, OVERLAY_PERMISSION_REQ_CODE);
//            }
//        }
    }

    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
//
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        if (null != mReactInstanceManager) {
//            mReactInstanceManager.onPause();
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        if (null != mReactInstanceManager) {
//            mReactInstanceManager.onResume(this, this);
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//        if (null != mReactInstanceManager) {
//            mReactInstanceManager.onDestroy();
//        }
//    }
//
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//
//        if (null != mReactInstanceManager)
//        {
//            mReactInstanceManager.onBackPressed();
//        }
//        else
//        {
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onKeyUp(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_MENU && mReactInstanceManager != null)
//        {
//            mReactInstanceManager.showDevOptionsDialog();
//
//            return true;
//        }
//
//        return super.onKeyUp(keyCode, event);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == OVERLAY_PERMISSION_REQ_CODE)
//        {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
//            {
//                if (!Settings.canDrawOverlays(this))
//                {
//                    // TODO
//                }
//            }
//        }
//    }
}

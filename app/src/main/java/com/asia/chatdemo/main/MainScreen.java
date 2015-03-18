package com.asia.chatdemo.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.asia.chatdemo.R;

/**
 * 聊天主界面
 * @author Asia
 * Created by asia on 2015/3/18.
 */
public class MainScreen extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//全屏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_main_srceen);
        init();
    }

    /**
     * 初始化
     */
    private void init(){
        initUI();
        initData();
    }

    /**
     * 初始化UI
     * @return
     */
    private boolean initUI(){
        boolean initResult = false;

        return initResult;
    }

    /**
     * 初始化数据
     * @return
     */
    private boolean initData(){
        boolean initResult = false;

        return initResult;
    }
}

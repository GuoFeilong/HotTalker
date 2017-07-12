package com.hot.hottalker;

import android.support.v4.content.ContextCompat;
import android.widget.TextView;

import com.hot.common.common.app.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.tv_test)
    TextView test;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        test.setTextColor(ContextCompat.getColor(this, R.color.yellow_a700));
        test.setText("公司测试提交");
    }
}

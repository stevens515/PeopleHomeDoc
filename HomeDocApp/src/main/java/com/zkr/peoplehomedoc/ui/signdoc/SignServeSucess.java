package com.zkr.peoplehomedoc.ui.signdoc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zkr.peoplehomedoc.MainActivity;
import com.zkr.peoplehomedoc.R;
import com.zkr.peoplehomedoc.base.BaseActivity;
import com.zkr.peoplehomedoc.ui.servicePlan.AppointmentListActivity;
import com.zkr.peoplehomedoc.utils.ActivityUtil;
import com.zkr.peoplehomedoc.widget.TitleBarUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SignServeSucess extends BaseActivity {

    @Bind(R.id.textView10)
    TextView textView10;
    @Bind(R.id.textView11)
    TextView textView11;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.textView12)
    TextView textView12;
    @Bind(R.id.textView13)
    TextView textView13;
    @Bind(R.id.button1)
    Button button1;
    @Bind(R.id.textView14)
    TextView textView14;
    @Bind(R.id.textView15)
    TextView textView15;
    @Bind(R.id.button2)
    Button button2;
    @Bind(R.id.titleBar)
    TitleBarUtils titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_serve_sucess);
        ButterKnife.bind(this);
        initTitle();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtil.switchTo(SignServeSucess.this, AppointmentListActivity.class, false);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtil.switchTo(SignServeSucess.this, AppointmentListActivity.class, false);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtil.switchTo(SignServeSucess.this, AppointmentListActivity.class, false);
            }
        });
    }

    private void initTitle() {
        titleBar.setTitle("签约医生");
        titleBar.setLeftButtonClick(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        titleBar.setRightImageOne(R.mipmap.back_home);
        titleBar.setRightButtonOneClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtil.switchTo(SignServeSucess.this, MainActivity.class,false);
                finish();
            }
        });
    }
}

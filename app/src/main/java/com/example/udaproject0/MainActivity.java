package com.example.udaproject0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.my_toolbar)
    Toolbar mToolbar;
    @BindView(R.id.popularMoviesTextView)
    TextView mPopularMoviesTextView;
    @BindView(R.id.popularMoviesBtn)
    CardView mPopularMoviesBtn;
    @BindView(R.id.stockHawkTextView)
    TextView mStockHawkTextView;
    @BindView(R.id.stockHawkBtn)
    CardView mStockHawkBtn;
    @BindView(R.id.buildItBiggerTextView)
    TextView mBuildItBiggerTextView;
    @BindView(R.id.buildItBiggerBtn)
    CardView mBuildItBiggerBtn;
    @BindView(R.id.makeYourAppMaterialTextView)
    TextView mMakeYourAppMaterialTextView;
    @BindView(R.id.makeYourAppMaterialBtn)
    CardView mMakeYourAppMaterialBtn;
    @BindView(R.id.goUbiquitousTextView)
    TextView mGoUbiquitousTextView;
    @BindView(R.id.goUbiquitousBtn)
    CardView mGoUbiquitousBtn;
    @BindView(R.id.capstoneTextview)
    TextView mCapstoneTextView;
    @BindView(R.id.capstoneBtn)
    CardView mCapstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeButtonEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menus, menu);

        return true;
    }

    @OnClick({R.id.popularMoviesBtn, R.id.stockHawkBtn, R.id.buildItBiggerBtn, R.id.makeYourAppMaterialBtn, R.id.goUbiquitousBtn, R.id.capstoneBtn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.popularMoviesBtn:
                onClickToast(mPopularMoviesTextView);
                break;
            case R.id.stockHawkBtn:
                onClickToast(mStockHawkTextView);
                break;
            case R.id.buildItBiggerBtn:
                onClickToast(mBuildItBiggerTextView);
                break;
            case R.id.makeYourAppMaterialBtn:
                onClickToast(mMakeYourAppMaterialTextView);
                break;
            case R.id.goUbiquitousBtn:
                onClickToast(mGoUbiquitousTextView);
                break;
            case R.id.capstoneBtn:
                onClickToast(mCapstoneTextView);
                break;
        }
    }

    public void onClickToast(TextView view) {
        Toast.makeText(MainActivity.this, "This button will launch my "
                        .concat(view.getText().toString().toLowerCase())
                        .concat(" app!"),
                Toast.LENGTH_SHORT).show();
    }


}

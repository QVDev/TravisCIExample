package qvdev.examples.travisforandroid.View;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import qvdev.examples.travisforandroid.Adapter.SectionsPagerAdapter;
import qvdev.examples.travisforandroid.Presenter.MainPresenter;
import qvdev.examples.travisforandroid.R;

public class MainView extends FragmentActivity {

    MainPresenter mPresenter;
    ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();

        mPresenter = new MainPresenter(this);
    }

    private void initializeViews() {
        mViewPager = (ViewPager) findViewById(R.id.pager);
    }

    public void setViewPageAdapter(SectionsPagerAdapter sectionsPagerAdapter) {
        mViewPager.setAdapter(sectionsPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

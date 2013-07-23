package qvdev.examples.travisforandroid.Presenter;


import qvdev.examples.travisforandroid.Adapter.SectionsPagerAdapter;
import qvdev.examples.travisforandroid.Model.MainModel;
import qvdev.examples.travisforandroid.View.MainView;

public class MainPresenter {

    MainView mMainView;
    MainModel mMainModel;

    public MainPresenter(MainView view) {
        mMainView = view;
        mMainModel = new MainModel();

        initializeSectionAdapter();
    }

    private void initializeSectionAdapter() {
        mMainModel.setSectionsPagerAdapter(new SectionsPagerAdapter(mMainView, mMainView.getSupportFragmentManager()));
        mMainView.setViewPageAdapter(mMainModel.getSectionsPagerAdapter());
    }
}

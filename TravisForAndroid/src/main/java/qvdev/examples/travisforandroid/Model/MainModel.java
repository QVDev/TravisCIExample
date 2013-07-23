package qvdev.examples.travisforandroid.Model;

import qvdev.examples.travisforandroid.Adapter.SectionsPagerAdapter;

public class MainModel {

    SectionsPagerAdapter mSectionsPagerAdapter;

    public MainModel() {

    }

    public SectionsPagerAdapter getSectionsPagerAdapter() {
        return mSectionsPagerAdapter;
    }

    public void setSectionsPagerAdapter(SectionsPagerAdapter mSectionsPagerAdapter) {
        this.mSectionsPagerAdapter = mSectionsPagerAdapter;
    }

}

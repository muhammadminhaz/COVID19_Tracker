package com.example.covid_19tracker.ui.country;

import android.os.Parcel;
import android.os.Parcelable;

public class CovidCountry implements Parcelable {
    public static final Parcelable.Creator<CovidCountry> CREATOR = new Parcelable.Creator<CovidCountry>() {
        @Override
        public CovidCountry createFromParcel(Parcel source) {
            return new CovidCountry(source);
        }

        @Override
        public CovidCountry[] newArray(int size) {
            return new CovidCountry[size];
        }
    };
    String mCovidCountry, mCases, mTodayCases, mDeaths, mTodayDeaths, mRecovered, mActive, mCritical;

    public CovidCountry(String mCovidCountry, String mCases, String mTodayCases, String mDeaths, String mTodayDeaths, String mRecovered, String mActive, String mCritical) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.mTodayCases = mTodayCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecovered = mRecovered;
        this.mActive = mActive;
        this.mCritical = mCritical;
    }

    protected CovidCountry(Parcel in) {
        this.mCovidCountry = in.readString();
        this.mCases = in.readString();
        this.mTodayCases = in.readString();
        this.mDeaths = in.readString();
        this.mTodayDeaths = in.readString();
        this.mRecovered = in.readString();
        this.mActive = in.readString();
        this.mCritical = in.readString();
    }

    public static Creator<CovidCountry> getCREATOR() {
        return CREATOR;
    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public void setmCovidCountry(String mCovidCountry) {
        this.mCovidCountry = mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }

    public void setmCases(String mCases) {
        this.mCases = mCases;
    }

    public String getmTodayCases() {
        return mTodayCases;
    }

    public void setmTodayCases(String mTodayCases) {
        this.mTodayCases = mTodayCases;
    }

    public String getmDeaths() {
        return mDeaths;
    }

    public void setmDeaths(String mDeaths) {
        this.mDeaths = mDeaths;
    }

    public String getmTodayDeaths() {
        return mTodayDeaths;
    }

    public void setmTodayDeaths(String mTodayDeaths) {
        this.mTodayDeaths = mTodayDeaths;
    }

    public String getmRecovered() {
        return mRecovered;
    }

    public void setmRecovered(String mRecovered) {
        this.mRecovered = mRecovered;
    }

    public String getmActive() {
        return mActive;
    }

    public void setmActive(String mActive) {
        this.mActive = mActive;
    }

    public String getmCritical() {
        return mCritical;
    }

    public void setmCritical(String mCritical) {
        this.mCritical = mCritical;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mCovidCountry);
        dest.writeString(this.mCases);
        dest.writeString(this.mTodayCases);
        dest.writeString(this.mDeaths);
        dest.writeString(this.mTodayDeaths);
        dest.writeString(this.mRecovered);
        dest.writeString(this.mActive);
        dest.writeString(this.mCritical);
    }
}

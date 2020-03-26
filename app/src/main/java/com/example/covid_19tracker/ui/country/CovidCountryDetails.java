package com.example.covid_19tracker.ui.country;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.covid_19tracker.R;

public class CovidCountryDetails extends AppCompatActivity {

    TextView tvDetailCountryName, tvDetailTotalCases, tvDetailTodayCases, tvDetailTotalDeaths, tvDetailTodayDeaths, tvDetailsTotalRecovered, tvDetailsTotalCritical, tvDetailsTotalActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_country_details);
        this.getSupportActionBar().hide();
        tvDetailCountryName = findViewById(R.id.tv_detail_country_name);
        tvDetailTotalCases = findViewById(R.id.tv_detail_total_cases);
        tvDetailTotalDeaths = findViewById(R.id.tv_detail_total_death);
        tvDetailTodayCases = findViewById(R.id.tv_detail_today_cases);
        tvDetailTodayDeaths = findViewById(R.id.tv_detail_today_death);
        tvDetailsTotalRecovered = findViewById(R.id.tv_detail_total_recovered);
        tvDetailsTotalCritical = findViewById(R.id.tv_detail_total_critical);
        tvDetailsTotalActive = findViewById(R.id.tv_detail_total_active);

        CovidCountry covidCountry = getIntent().getParcelableExtra("EXTRA_COVID");

        tvDetailCountryName.setText(covidCountry.getmCovidCountry());
        tvDetailTotalCases.setText(covidCountry.getmCases());
        tvDetailTotalDeaths.setText(covidCountry.getmDeaths());
        tvDetailTodayCases.setText(covidCountry.getmTodayCases());
        tvDetailTodayDeaths.setText(covidCountry.getmTodayDeaths());
        tvDetailsTotalRecovered.setText(covidCountry.getmRecovered());
        tvDetailsTotalCritical.setText(covidCountry.getmCritical());
        tvDetailsTotalActive.setText(covidCountry.getmActive());

    }
}

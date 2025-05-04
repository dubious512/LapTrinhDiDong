package com.laptrinhandroid.on_thi_gplx.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.laptrinhandroid.on_thi_gplx.R;
import com.laptrinhandroid.on_thi_gplx.adapter.ViewBienBaoPagerAdapter;

public class RoadSignActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_sign);
        setTitle("Biển báo giao thông");
        overridePendingTransition(R.anim.slide_in, 0);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout = findViewById(R.id.tab_roadsign);
        viewPager = findViewById(R.id.pager_roadsign);

        ViewBienBaoPagerAdapter viewBienBaoPagerAdapter = new ViewBienBaoPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewBienBaoPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }



    @Override
    public boolean onSupportNavigateUp() {
        finish();
        overridePendingTransition(R.anim.slide_back_in, R.anim.slide_back);
        return true;
    }
}

package com.gandroid.multifragment.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.Color;
import android.os.Bundle;

import com.gandroid.multifragment.R;
import com.gandroid.multifragment.adapter.PagerAdapter;
import com.gandroid.multifragment.databinding.ActivityDashBoardBinding;
import com.google.android.material.tabs.TabLayout;

public class DashBoard extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ActivityDashBoardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dash_board);

        binding.toolbarDashboard.setTitle("Multi Fragment");
        binding.toolbarDashboard.setTitleTextColor(Color.WHITE);
        setSupportActionBar(binding.toolbarDashboard);

        binding.tabLayoutDashboard.addTab(binding.tabLayoutDashboard.newTab().setText("Inbox"));
        binding.tabLayoutDashboard.addTab(binding.tabLayoutDashboard.newTab().setText("Contact Us"));
        binding.tabLayoutDashboard.addTab(binding.tabLayoutDashboard.newTab().setText("Profile"));
        binding.tabLayoutDashboard.setTabGravity(TabLayout.GRAVITY_FILL);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), binding.tabLayoutDashboard.getTabCount());
        binding.viewPagerDashboard.setAdapter(adapter);

        binding.tabLayoutDashboard.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        binding.viewPagerDashboard.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
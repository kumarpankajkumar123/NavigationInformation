package com.example.basicinformation.BasicConcept;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.basicinformation.R;
import com.example.basicinformation.databinding.ActivityNavigationInformationBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class NavigationInformation extends AppCompatActivity {

    ActivityNavigationInformationBinding binding;
    MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBarDrawerToggle toggle;
        binding = ActivityNavigationInformationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        toolbar = findViewById(R.id.toolbarcustom);


        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Main Page");
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.purple_700));
        }

        toggle = new ActionBarDrawerToggle(this,binding.drawerlayout,toolbar,R.string.open,R.string.close);
        binding.drawerlayout.addDrawerListener(toggle);
        toggle.syncState();

        binding.navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.home){
                    binding.drawerlayout.closeDrawer(GravityCompat.START);
                } else if (id == R.id.about) {
                    binding.drawerlayout.closeDrawer(GravityCompat.START);
                }else if (id == R.id.contactus) {
                    binding.drawerlayout.closeDrawer(GravityCompat.START);
                }else if (id == R.id.info) {
                    binding.drawerlayout.closeDrawer(GravityCompat.START);
                }else if (id == R.id.services) {
                    binding.drawerlayout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });


    }
}
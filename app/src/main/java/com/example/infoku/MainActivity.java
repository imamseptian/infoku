package com.example.infoku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Beri view pertama adalah home2_fragment*/
        Fragment selectedFragment = new fragment_home();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();

        BottomNavigationView botNav = findViewById(R.id.botNav);
        botNav.setOnNavigationItemSelectedListener(navListener);
    }


    public void menuFood(View view){
        /* Untuk Menu Food */
        /* Beri view food list */
        Fragment selectedFragment = new fragment_list_food();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();

    }

    public  void menuHotel(View view){
        /* Untuk Menu Hotel*/

    }

    public  void menuTravel(View view){
        /* Untuk Menu Travel */
    }


    public  void menuAccessories(View view){
        /* Untuk Menu Accessories*/


    }



    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId())
                    {

                        case R.id.nav_shopping_cart:
                            selectedFragment = new fragment_shopping_cart();
                            break;


                        case R.id.nav_profile:
                            selectedFragment = new fragment_profile();
                            break;


                        case R.id.nav_home:
                            selectedFragment = new fragment_home();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    return true;


                }
            };


}

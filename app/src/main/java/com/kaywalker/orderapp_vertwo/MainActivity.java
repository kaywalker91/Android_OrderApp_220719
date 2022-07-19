package com.kaywalker.orderapp_vertwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.kaywalker.orderapp_vertwo.Fragment.Frag_account;
import com.kaywalker.orderapp_vertwo.Fragment.Frag_home;
import com.kaywalker.orderapp_vertwo.Fragment.Frag_menu;
import com.kaywalker.orderapp_vertwo.Fragment.Frag_order;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag_home fragment_home;
    private Frag_order fragment_order;
    private Frag_menu fragment_menu;
    private Frag_account fragment_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        firebaseAuth = FirebaseAuth.getInstance();
//
//        Button btn_logout = findViewById(R.id.btn_logout);
//        btn_logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//                firebaseAuth.signOut();
//                finish();
//            }
//        });

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        setFrag(0);
                        break;
                    case R.id.action_order:
                        setFrag(1);
                        break;
                    case R.id.action_menu:
                        setFrag(2);
                        break;
                    case R.id.action_account:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });
        fragment_home = new Frag_home();
        fragment_order = new Frag_order();
        fragment_menu = new Frag_menu();
        fragment_account = new Frag_account();
        setFrag(0);
    }

    private void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n){
            case 0:
                ft.replace(R.id.main_frame, fragment_home);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, fragment_order);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, fragment_menu);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, fragment_account);
                ft.commit();
                break;
        }
    }
}
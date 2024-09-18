package vn.edu.usth.mobilemid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrimeActivity extends AppCompatActivity {
    public static final String on_command ="PrimeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prime);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        if (savedInstanceState == null){
            HomeFragment homeFragment = new HomeFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_home, homeFragment).commit();
        }

        if (savedInstanceState == null){
            NotificationFragment notiFragment = new NotificationFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_noti, notiFragment).commit();
        }
        if (savedInstanceState == null){
            ExploreFragment exFragment = new ExploreFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_explore, exFragment).commit();
        }
        if (savedInstanceState == null){
            ProfileFragment profileFragment = new ProfileFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_profile, profileFragment).commit();
        }
    }
}
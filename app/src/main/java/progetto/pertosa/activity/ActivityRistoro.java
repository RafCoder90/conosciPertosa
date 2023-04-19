package progetto.pertosa.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import progetto.pertosa.R;

public class ActivityRistoro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ristoro);
    }

    public void chiamaVillaDelleRose(){
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:+390975397262"));
        startActivity(callIntent);
    }

    public void chiamaZiMarianna(){
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:+390975397044"));
        startActivity(callIntent);
    }

    public void chiamaVenosa(){
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:+390975397009"));
        startActivity(callIntent);
    }

    public void chiamaBarRioNegro(){
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:+393281089740"));
        startActivity(callIntent);
    }

}


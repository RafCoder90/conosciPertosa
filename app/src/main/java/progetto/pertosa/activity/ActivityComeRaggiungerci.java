package progetto.pertosa.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import progetto.pertosa.R;


public class ActivityComeRaggiungerci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_come_raggiungerci);
    }

    public void schermoMappa(){
        String url = "https://www.google.com/maps/place/40%C2%B032'37.4%22N+15%C2%B026'56.2%22E/@40.543728,15.4467533,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x0!8m2!3d40.543728!4d15.448942";
        Intent intentUrl = new Intent(Intent.ACTION_VIEW);
        intentUrl.setData(Uri.parse(url));
        startActivity(intentUrl);
    }
}

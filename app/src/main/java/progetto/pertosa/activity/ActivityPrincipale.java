package progetto.pertosa.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import progetto.pertosa.R;
import progetto.pertosa.vista.VistaPrincipale;

public class ActivityPrincipale extends AppCompatActivity {

    public static final String TAG = ActivityPrincipale.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principale);
    }

    public VistaPrincipale getVista(){
        return (VistaPrincipale) this.getSupportFragmentManager().findFragmentById(R.id.vistaPrincipale);
    }

    public void schermoProgetto(){
        Intent intent = new Intent(this, ActivityProgetto.class);
        this.startActivity(intent);
    }

    public void schermoComeRaggiungerci(){
        Intent intent = new Intent(this, ActivityComeRaggiungerci.class);
        this.startActivity(intent);
    }

    public void schermoCosaVisitare(){
        Intent intent = new Intent(this, ActivityCosaVisitare.class);
        this.startActivity(intent);
    }

    public void schermoEventi(){
        Intent intent = new Intent(this, ActivityEventi.class);
        this.startActivity(intent);
    }

    public void schermoRistoro(){
        Intent intent = new Intent(this, ActivityRistoro.class);
        this.startActivity(intent);
    }
    
}

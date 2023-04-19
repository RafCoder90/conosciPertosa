package progetto.pertosa.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import progetto.pertosa.R;

public class ActivityCosaVisitare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosa_visitare);
    }

    public void schermoGrotteDiPertosa(){
        Intent intent = new Intent(this,ActivityGrotteDiPertosa.class);
        this.startActivity(intent);
    }

    public void schermoMuseoDelSuolo(){
        Intent intent = new Intent(this,ActivityMuseoDelSuolo.class);
        this.startActivity(intent);
    }

    public void schermoMuseoSpleoArcheologico(){
        Intent intent = new Intent(this,ActivityMuseoSpeleoArcheologico.class);
        this.startActivity(intent);
    }

    public void schermoAltriAttrattori(){
        Intent intent = new Intent(this,ActivityAltriAttrattori.class);
        this.startActivity(intent);
    }
}

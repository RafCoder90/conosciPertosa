package progetto.pertosa.controllo;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import progetto.pertosa.Applicazione;
import progetto.pertosa.activity.ActivityComeRaggiungerci;

public class ControlloComeRaggiungerci {

    private View.OnClickListener azioneCaricaMappa = new AzioneCaricaMappa();

    public View.OnClickListener getAzioneCaricaMappa() {
        return azioneCaricaMappa;
    }

    private class AzioneCaricaMappa implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityComeRaggiungerci activityComeRaggiungerci = (ActivityComeRaggiungerci) Applicazione.getInstance().getCurrentActivity();
            Toast.makeText(activityComeRaggiungerci,"Carico Mappa Pertosa",Toast.LENGTH_LONG).show();
            activityComeRaggiungerci.schermoMappa();
        }
    }
}

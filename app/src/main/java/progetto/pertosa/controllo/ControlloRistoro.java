package progetto.pertosa.controllo;

import android.view.View;

import progetto.pertosa.Applicazione;
import progetto.pertosa.activity.ActivityRistoro;

public class ControlloRistoro {

    private View.OnClickListener azioneChiamaVillaDelleRose = new AzioneChiamaVillaDelleRose();
    private View.OnClickListener azioneChiamaZiMarianna = new AzioneChiamaZiMarianna();
    private View.OnClickListener azioneChiamaVenosa = new AzioneChiamaVenosa();
    private View.OnClickListener azioneChiamaBarRioNegro = new AzioneChiamaBarRioNegro();

    public View.OnClickListener getAzioneChiamaVillaDelleRose() {
        return azioneChiamaVillaDelleRose;
    }

    public View.OnClickListener getAzioneChiamaZiMarianna() {
        return azioneChiamaZiMarianna;
    }

    public View.OnClickListener getAzioneChiamaVenosa() {
        return azioneChiamaVenosa;
    }

    public View.OnClickListener getAzioneChiamaBarRioNegro() {
        return azioneChiamaBarRioNegro;
    }

    private class AzioneChiamaVillaDelleRose implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityRistoro activityRistoro = (ActivityRistoro) Applicazione.getInstance().getCurrentActivity();
            activityRistoro.chiamaVillaDelleRose();
        }
    }

    private class AzioneChiamaZiMarianna implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityRistoro activityRistoro = (ActivityRistoro) Applicazione.getInstance().getCurrentActivity();
            activityRistoro.chiamaZiMarianna();
        }
    }

    private class AzioneChiamaVenosa implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityRistoro activityRistoro = (ActivityRistoro) Applicazione.getInstance().getCurrentActivity();
            activityRistoro.chiamaVenosa();
        }
    }

    private class AzioneChiamaBarRioNegro implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityRistoro activityRistoro = (ActivityRistoro) Applicazione.getInstance().getCurrentActivity();
            activityRistoro.chiamaBarRioNegro();
        }
    }
}

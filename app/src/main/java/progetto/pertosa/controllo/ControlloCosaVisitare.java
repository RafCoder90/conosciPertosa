package progetto.pertosa.controllo;

import android.view.View;

import progetto.pertosa.Applicazione;
import progetto.pertosa.activity.ActivityCosaVisitare;

public class ControlloCosaVisitare {

    private View.OnClickListener azioneGrotteDiPertosa = new AzioneGrotteDiPertosa();
    private View.OnClickListener azioneMuseoDelSuolo = new AzioneMuseoDelSuolo();
    private View.OnClickListener azioenMuseoSpeleoArcheologico = new AzioneMuseoSpeleoArcheologico();
    private View.OnClickListener azioneAltriAttrattori = new AzioneAltriAttrattori();

    public View.OnClickListener getAzioneGrotteDiPertosa() {
        return azioneGrotteDiPertosa;
    }

    public View.OnClickListener getAzioneMuseoDelSuolo() {
        return azioneMuseoDelSuolo;
    }

    public View.OnClickListener getAzioenMuseoSpeleoArcheologico() {
        return azioenMuseoSpeleoArcheologico;
    }

    public View.OnClickListener getAzioneAltriAttrattori() {
        return azioneAltriAttrattori;
    }


    private class AzioneGrotteDiPertosa implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityCosaVisitare activityCosaVisitare = (ActivityCosaVisitare) Applicazione.getInstance().getCurrentActivity();
            activityCosaVisitare.schermoGrotteDiPertosa();
        }
    }

    private class AzioneMuseoDelSuolo implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityCosaVisitare activityCosaVisitare = (ActivityCosaVisitare) Applicazione.getInstance().getCurrentActivity();
            activityCosaVisitare.schermoMuseoDelSuolo();
        }
    }

    private class AzioneMuseoSpeleoArcheologico implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityCosaVisitare activityCosaVisitare = (ActivityCosaVisitare) Applicazione.getInstance().getCurrentActivity();
            activityCosaVisitare.schermoMuseoSpleoArcheologico();
        }
    }

    private class AzioneAltriAttrattori implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityCosaVisitare activityCosaVisitare = (ActivityCosaVisitare) Applicazione.getInstance().getCurrentActivity();
            activityCosaVisitare.schermoAltriAttrattori();
        }
    }
}

package progetto.pertosa.controllo;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import progetto.pertosa.Applicazione;
import progetto.pertosa.activity.ActivityPrincipale;
import progetto.pertosa.vista.VistaPrincipale;

public class ControlloPrincipale {

    private View.OnClickListener azionePertosa = new AzionePertosa();
    private View.OnClickListener azioneSocial = new AzioneSocial();
    private View.OnClickListener azioneSchermoProgetto = new AzioneSchermoProgetto();
    private View.OnClickListener azioneSchermoCosaVisitare = new AzioneSchermoCosaVisitare();
    private View.OnClickListener azioneSchermoEventi  = new AzioneSchermoEventi();
    private View.OnClickListener azioneSchermoRistoro = new AzioneSchermoRistoro();
    private View.OnClickListener azioneSchermoComeRaggiungerci = new AzioneSchermoComeRaggiungerci();

    public View.OnClickListener getAzionePertosa() {
        return azionePertosa;
    }

    public View.OnClickListener getAzioneSocial() {
        return azioneSocial;
    }

    public View.OnClickListener getAzioneSchermoProgetto() {
        return azioneSchermoProgetto;
    }

    public View.OnClickListener getAzioneSchermoCosaVisitare() {
        return azioneSchermoCosaVisitare;
    }

    public View.OnClickListener getAzioneSchermoEventi() {
        return azioneSchermoEventi;
    }

    public View.OnClickListener getAzioneSchermoRistoro() {
        return azioneSchermoRistoro;
    }

    public View.OnClickListener getAzioneSchermoComeRaggiungerci() {
        return azioneSchermoComeRaggiungerci;
    }

    private class AzionePertosa implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityPrincipale activityPrincipale = (ActivityPrincipale) Applicazione.getInstance().getCurrentActivity();
            VistaPrincipale vista = activityPrincipale.getVista();
            TextView testoHomePage = vista.getTestoHomePage();
            testoHomePage.setText("Pertosa è un comune italiano di 664 abitanti della provincia di Salerno in Campania, si trova in una valle a ridosso fra i monti Alburni e il Valdiano, nei pressi del parco nazionale del Cilento e Vallo di Diano. Il nome di Pertosa deriva dalla sua Grotta, e precisamente dal latino pertusus, bucato. I primi abitanti di Pertosa vivevano nella grotta e con il passare dei secoli iniziarono a trasferirsi al di fuori. Verso la metà dell'XI secolo qualche monaco benedettino si stabilì a Pertosa: i benedettini bonificarono la zona e diffusero su vasta scala la coltivazione degli olivi. A partire dal 1º gennaio 1830 Pertosa iniziò ad operare con un'amministrazione autonoma. Il primo sindaco di Pertosa fu Biase Jasimone. Nel 1838 Pertosa richiese di avere un mercato per il giovedì. Sul finire del 1800 il dottor Paolo Carucci iniziò a esplorare la grotta rinvenendo molti reperti classificati nel suo libro \"La Grotta preistorica di Pertosa\". Grazie alle sue grotte, Pertosa è divenuta un importante centro turistico.");
        }
    }

    private class AzioneSocial implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityPrincipale activityPrincipale = (ActivityPrincipale) Applicazione.getInstance().getCurrentActivity();
            VistaPrincipale vista = activityPrincipale.getVista();
            TextView testoHomePage = vista.getTestoHomePage();
            testoHomePage.setClickable(true);
            testoHomePage.setAutoLinkMask(Linkify.WEB_URLS);
            testoHomePage.setText("FACEBOOK\nhttps://www.facebook.com/comune.pertosa\nINSTAGRAM\nhttps://www.instagram.com/pertosa_official/");
        }
    }

    private class AzioneSchermoProgetto implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityPrincipale activityPrincipale = (ActivityPrincipale) Applicazione.getInstance().getCurrentActivity();
            activityPrincipale.schermoProgetto();
        }
    }

    private class AzioneSchermoCosaVisitare implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityPrincipale activityPrincipale = (ActivityPrincipale) Applicazione.getInstance().getCurrentActivity();
            activityPrincipale.schermoCosaVisitare();
        }
    }

    private class AzioneSchermoEventi implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityPrincipale activityPrincipale = (ActivityPrincipale) Applicazione.getInstance().getCurrentActivity();
            activityPrincipale.schermoEventi();
        }
    }

    private class AzioneSchermoRistoro implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityPrincipale activityPrincipale = (ActivityPrincipale) Applicazione.getInstance().getCurrentActivity();
            activityPrincipale.schermoRistoro();
        }
    }


    private class AzioneSchermoComeRaggiungerci implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            ActivityPrincipale activityPrincipale = (ActivityPrincipale) Applicazione.getInstance().getCurrentActivity();
            activityPrincipale.schermoComeRaggiungerci();
        }
    }

}

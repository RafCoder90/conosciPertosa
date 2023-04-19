package progetto.pertosa;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import progetto.pertosa.controllo.ControlloComeRaggiungerci;
import progetto.pertosa.controllo.ControlloCosaVisitare;
import progetto.pertosa.controllo.ControlloPrincipale;
import progetto.pertosa.controllo.ControlloRistoro;
import progetto.pertosa.modello.Modello;
import progetto.pertosa.modello.ModelloPersistente;

public class Applicazione extends Application {

    public static final String TAG = Applicazione.class.getSimpleName();

    private static Applicazione singleton;

    public static Applicazione getInstance() {
        return singleton;
    }

    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Applicazione creata...");
        singleton = (Applicazione) getApplicationContext();
        singleton.registerActivityLifecycleCallbacks(new GestoreAttivita());
    }

    /////////////////////////////////////////////

    private Activity currentActivity = null;

    private Modello modello = new Modello();
    private ModelloPersistente modelloPersistente = new ModelloPersistente();
    private ControlloPrincipale controlloPrincipale = new ControlloPrincipale();
    private ControlloCosaVisitare controlloCosaVisitare = new ControlloCosaVisitare();
    private ControlloRistoro controlloRistoro = new ControlloRistoro();
    private ControlloComeRaggiungerci controlloComeRaggiungerci = new ControlloComeRaggiungerci();

    public Activity getCurrentActivity() {
        return this.currentActivity;
    }

    public Modello getModello() {
        return modello;
    }

    public ModelloPersistente getModelloPersistente() {
        return modelloPersistente;
    }

    public ControlloPrincipale getControlloPrincipale() {
        return controlloPrincipale;
    }

    public ControlloCosaVisitare getControlloCosaVisitare() {
        return controlloCosaVisitare;
    }

    public ControlloRistoro getControlloRistoro() {
        return controlloRistoro;
    }

    public ControlloComeRaggiungerci getControlloComeRaggiungerci() {
        return controlloComeRaggiungerci;
    }

    //////////////////////////////////////////////
    //////////////////////////////////////////////
    private class GestoreAttivita implements ActivityLifecycleCallbacks {
        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            //Log.i(TAG, "onActivityCreated: " + activity);
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            //Log.i(TAG, "onActivityDestroyed: " + activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {
            //Log.d(TAG, "onActivityStarted: " + activity);
        }

        @Override
        public void onActivityResumed(Activity activity) {
            Log.d(TAG, "currentActivity initialized: " + activity);
            currentActivity = activity;
        }

        @Override
        public void onActivityPaused(Activity activity) {
            //Log.d(TAG, "onActivityPaused: " + activity);
        }

        @Override
        public void onActivityStopped(Activity activity) {
            if (currentActivity == activity) {
                Log.d(TAG, "currentActivity stopped: " + activity);
                currentActivity = null;
            }
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            //Log.d(TAG, "onActivitySaveInstanceState: " + activity);
        }
    }
}

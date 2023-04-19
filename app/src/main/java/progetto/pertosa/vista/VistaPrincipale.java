package progetto.pertosa.vista;


import android.graphics.Color;
import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import progetto.pertosa.Applicazione;
import progetto.pertosa.R;

public class VistaPrincipale extends Fragment {

    TextView testoPertosa;
    TextView testoHomePage;
    Button bottonePertosa;
    Button bottoneRaggiungerci;
    FloatingActionButton bottoneProgetto;
    ImageView immagineCosaVisitare;
    ImageView immagineEventi;
    ImageView immagineRistoro;
    ImageView immagineComeRaggiungerci;
    Button bottoneCosaVisitare;
    Button bottoneEventi;
    Button bottoneRistoro;
    Button bottoneComeRaggiungerci;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaPrimaPagina = inflater.inflate(R.layout.vista_principale, container, false);
        testoPertosa = vistaPrimaPagina.findViewById(R.id.testoHome);
        testoHomePage = vistaPrimaPagina.findViewById(R.id.testoHomePage);
        bottonePertosa = vistaPrimaPagina.findViewById(R.id.bottonePertosa);
        bottoneRaggiungerci = vistaPrimaPagina.findViewById(R.id.bottoneSocial);
        bottoneProgetto = vistaPrimaPagina.findViewById(R.id.bottoneProgetto);
        immagineCosaVisitare = vistaPrimaPagina.findViewById(R.id.immagineCosaVisitare);
        immagineEventi = vistaPrimaPagina.findViewById(R.id.immagineEventi);
        immagineRistoro = vistaPrimaPagina.findViewById(R.id.immagineRistoro);
        immagineComeRaggiungerci = vistaPrimaPagina.findViewById(R.id.immagineComeRaggiungerci);
        bottoneCosaVisitare = vistaPrimaPagina.findViewById(R.id.bottoneCosaVisitare);
        bottoneEventi = vistaPrimaPagina.findViewById(R.id.bottoneEventi);
        bottoneRistoro = vistaPrimaPagina.findViewById(R.id.bottoneRistoro);
        bottoneComeRaggiungerci = vistaPrimaPagina.findViewById(R.id.bottoneComeRaggiungerci);
        testoPertosa.setShadowLayer(6.4f*2,6.0f*2,5.2f*2, Color.BLACK);
        bottonePertosa.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzionePertosa());
        bottoneRaggiungerci.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSocial());
        bottoneProgetto.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoProgetto());
        immagineCosaVisitare.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoCosaVisitare());
        immagineEventi.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoEventi());
        immagineRistoro.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoRistoro());
        immagineComeRaggiungerci.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoComeRaggiungerci());
        bottoneCosaVisitare.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoCosaVisitare());
        bottoneEventi.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoEventi());
        bottoneRistoro.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoRistoro());
        bottoneComeRaggiungerci.setOnClickListener(Applicazione.getInstance().getControlloPrincipale().getAzioneSchermoComeRaggiungerci());
        return vistaPrimaPagina;
    }

    public TextView getTestoHomePage() {
        return testoHomePage;
    }
}

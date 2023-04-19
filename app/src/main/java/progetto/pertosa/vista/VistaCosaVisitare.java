package progetto.pertosa.vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import progetto.pertosa.Applicazione;
import progetto.pertosa.R;

public class VistaCosaVisitare extends Fragment {

    Button bottoneGrotteDiPertosa;
    Button bottoneMuseoSpeleoArcheologico;
    Button bottoneMuseoDelSuolo;
    Button bottoneAltriAttrattori;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaCosaVisitare = inflater.inflate(R.layout.vista_cosa_visitare, container, false);
        bottoneGrotteDiPertosa = vistaCosaVisitare.findViewById(R.id.bottoneGrotteDiPertosa);
        bottoneMuseoSpeleoArcheologico = vistaCosaVisitare.findViewById(R.id.bottoneMuseoSpeleoArcheologico);
        bottoneMuseoDelSuolo = vistaCosaVisitare.findViewById(R.id.bottoneMuseoDelSuolo);
        bottoneAltriAttrattori = vistaCosaVisitare.findViewById(R.id.bottoneAltriAttrattori);
        bottoneGrotteDiPertosa.setOnClickListener(Applicazione.getInstance().getControlloCosaVisitare().getAzioneGrotteDiPertosa());
        bottoneMuseoSpeleoArcheologico.setOnClickListener(Applicazione.getInstance().getControlloCosaVisitare().getAzioenMuseoSpeleoArcheologico());
        bottoneMuseoDelSuolo.setOnClickListener(Applicazione.getInstance().getControlloCosaVisitare().getAzioneMuseoDelSuolo());
        bottoneAltriAttrattori.setOnClickListener(Applicazione.getInstance().getControlloCosaVisitare().getAzioneAltriAttrattori());
        return vistaCosaVisitare;
    }

}

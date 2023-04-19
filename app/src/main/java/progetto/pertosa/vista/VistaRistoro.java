package progetto.pertosa.vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import progetto.pertosa.Applicazione;
import progetto.pertosa.R;

public class VistaRistoro extends Fragment {

    ImageView bottoneVillaDelleRose;
    ImageView bottoneZiMarianna;
    ImageView bottoneVenosa;
    ImageView bottoneBarRioNegro;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaRistoro = inflater.inflate(R.layout.vista_ristoro, container, false);
        bottoneVillaDelleRose = vistaRistoro.findViewById(R.id.bottoneVillaDelleRose);
        bottoneZiMarianna = vistaRistoro.findViewById(R.id.bottoneZiMarianna);
        bottoneVenosa = vistaRistoro.findViewById(R.id.bottoneVenosa);
        bottoneBarRioNegro = vistaRistoro.findViewById(R.id.bottoneBarRioNegro);
        bottoneVillaDelleRose.setOnClickListener(Applicazione.getInstance().getControlloRistoro().getAzioneChiamaVillaDelleRose());
        bottoneZiMarianna.setOnClickListener(Applicazione.getInstance().getControlloRistoro().getAzioneChiamaZiMarianna());
        bottoneVenosa.setOnClickListener(Applicazione.getInstance().getControlloRistoro().getAzioneChiamaVenosa());
        bottoneBarRioNegro.setOnClickListener(Applicazione.getInstance().getControlloRistoro().getAzioneChiamaBarRioNegro());
        return vistaRistoro;
    }

}

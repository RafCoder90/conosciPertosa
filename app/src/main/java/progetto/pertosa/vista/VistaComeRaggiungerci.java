package progetto.pertosa.vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import progetto.pertosa.Applicazione;
import progetto.pertosa.R;


public class VistaComeRaggiungerci extends Fragment{

    ImageButton bottoneComeRaggiungerci;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaComeRaggiungerci = inflater.inflate(R.layout.vista_come_raggiungerci, container, false);
        bottoneComeRaggiungerci = vistaComeRaggiungerci.findViewById(R.id.bottoneMappa);
        bottoneComeRaggiungerci.setOnClickListener(Applicazione.getInstance().getControlloComeRaggiungerci().getAzioneCaricaMappa());
        return vistaComeRaggiungerci;
    }

}

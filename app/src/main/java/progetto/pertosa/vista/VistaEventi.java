package progetto.pertosa.vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import progetto.pertosa.R;

public class VistaEventi extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaEventi = inflater.inflate(R.layout.vista_eventi, container, false);
        return vistaEventi;
    }

}

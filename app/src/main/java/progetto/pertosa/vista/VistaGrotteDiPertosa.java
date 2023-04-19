package progetto.pertosa.vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import progetto.pertosa.R;


public class VistaGrotteDiPertosa extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaGrotteDiPertosa = inflater.inflate(R.layout.vista_grotte_di_pertosa, container, false);
        return vistaGrotteDiPertosa;
    }
}

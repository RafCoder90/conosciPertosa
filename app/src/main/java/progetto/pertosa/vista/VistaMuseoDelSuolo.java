package progetto.pertosa.vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import progetto.pertosa.R;

public class VistaMuseoDelSuolo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaMuseoDelSuolo = inflater.inflate(R.layout.vista_museo_del_suolo, container, false);
        return vistaMuseoDelSuolo;
    }

}

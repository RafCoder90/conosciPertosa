package progetto.pertosa.vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import progetto.pertosa.R;

public class VistaAltriAttrattori extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaAltriAttrattori = inflater.inflate(R.layout.vista_altri_attrattori, container, false);
        return vistaAltriAttrattori;
    }
}

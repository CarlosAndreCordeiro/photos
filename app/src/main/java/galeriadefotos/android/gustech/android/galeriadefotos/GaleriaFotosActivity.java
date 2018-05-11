package galeriadefotos.android.gustech.android.galeriadefotos;

import android.app.Fragment;
import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GaleriaFotosActivity extends Fragment {

    private RecyclerView mPhotoRecyclerView;

    public static GaleriaFotosActivity newInstance() {

        return new GaleriaFotosActivity();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    
}
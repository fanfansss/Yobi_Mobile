package com.tugas.yobimobile.ui.Profil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.tugas.yobimobile.R;

public class ProfilFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       View root = inflater.inflate(R.layout.fragment_profil, container, false);
        final TextView textView = root.findViewById(R.id.text_profil);
        return root;
    }
}
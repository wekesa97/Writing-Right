package com.qubittechnologies.writingright;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.chrisbanes.photoview.PhotoView;

public class MlaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mlafragment, container, false);
    }
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            PhotoView photoView = view.findViewById(R.id.firstpagemla);
            photoView.setImageResource(R.drawable.first_page_mla);
            PhotoView mentioned = view.findViewById(R.id.mlamentioned);
            mentioned.setImageResource(R.drawable.mla_already_mentioned);
            PhotoView mla_one =  view.findViewById(R.id.mlaoneperson);
            mla_one.setImageResource(R.drawable.mla_cite_one_person);
            PhotoView biblio = view.findViewById(R.id.mla_refer);
            biblio.setImageResource(R.drawable.mla_refrences);

        }
    }
}

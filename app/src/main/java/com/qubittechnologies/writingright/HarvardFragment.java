package com.qubittechnologies.writingright;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.chrisbanes.photoview.PhotoView;

public class HarvardFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.harvardfragment, container, false);

    }
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            PhotoView photoView = (PhotoView) view.findViewById(R.id.first_page_harvard);
            photoView.setImageResource(R.drawable.first_page_harvard);
            PhotoView biblio = (PhotoView) view.findViewById(R.id.refrence);
            biblio.setImageResource(R.drawable.harvard_refrence);

        }
    }
}

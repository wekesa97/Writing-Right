package com.qubittechnologies.writingright;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.chrisbanes.photoview.PhotoView;

public class ChicagoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.chicagofragment, container, false);
    }
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            PhotoView photoView = (PhotoView) view.findViewById(R.id.first_pageid);
            photoView.setImageResource(R.drawable.first_page_mla);
            PhotoView two_authors = (PhotoView) view.findViewById(R.id.footnotesid);
            two_authors.setImageResource(R.drawable.footnotes);
            PhotoView mentioned = (PhotoView) view.findViewById(R.id.endnotesid);
            mentioned.setImageResource(R.drawable.endnotes);
            PhotoView biblio = (PhotoView) view.findViewById(R.id.chicago_biblioid);
            biblio.setImageResource(R.drawable.chicago_biblio);

        }
    }
}

package com.qubittechnologies.writingright;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.chrisbanes.photoview.PhotoView;

public class ApaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.apafragment, container, false);
    }
    public void onStart(){
        super.onStart();
        View view = getView();
        if(view!=null){
            PhotoView photoView = (PhotoView) view.findViewById(R.id.imageView);
            photoView.setImageResource(R.drawable.title_apa);
            PhotoView two_authors = (PhotoView) view.findViewById(R.id.two_authors);
            two_authors.setImageResource(R.drawable.two_authors_apa);
            PhotoView mentioned = (PhotoView) view.findViewById(R.id.mentioned);
            mentioned.setImageResource(R.drawable.cite_already_mentioned);
            PhotoView biblio = (PhotoView) view.findViewById(R.id.biblio);
            biblio.setImageResource(R.drawable.biblio_apa);

        }
    }


}

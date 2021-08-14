package com.qubittechnologies.writingright;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.github.chrisbanes.photoview.PhotoView;
public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.homefragment, container, false);
    }
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null){
            PhotoView photoView = (PhotoView) view.findViewById(R.id.margins);
            photoView.setImageResource(R.drawable.margins);
            PhotoView abbstract = (PhotoView) view.findViewById(R.id.abbstract);
            abbstract.setImageResource(R.drawable.abbstract);
            Button button = (Button) view.findViewById(R.id.button_ID);
            PhotoView citations = (PhotoView) view.findViewById(R.id.citations);
            citations.setImageResource(R.drawable.two_authors_apa);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myintent = new Intent(getActivity(),MorePapers.class);
                    startActivity(myintent);
                }
            });


        }


        }

}

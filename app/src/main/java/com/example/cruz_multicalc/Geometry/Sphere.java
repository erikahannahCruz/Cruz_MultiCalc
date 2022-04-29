package com.example.cruz_multicalc.Geometry;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cruz_multicalc.Formulas;
import com.example.cruz_multicalc.R;

public class Sphere extends Fragment implements View.OnClickListener {

    private EditText txtRadius ;
    Button btnArea , btnVolume ;
    TextView answerSphere ;

    public Sphere() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_g_sphere, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtRadius = (EditText) getView().findViewById(R.id.txtRadiusSphere);
        btnArea = (Button) getActivity().findViewById(R.id.btnAreaSphere);
        btnVolume = (Button) getActivity().findViewById(R.id.btnVolumeSphere);
        answerSphere = (TextView) getView().findViewById(R.id.txtAnswerSphere);

        btnArea.setOnClickListener(this);
        btnVolume.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){

        double sphRadius = Double.parseDouble(String.valueOf(txtRadius.getText()));

        switch (v.getId()) {
            case R.id.btnAreaSphere:
                answerSphere.setText(String.valueOf(Formulas.sphereAreaFormula(sphRadius)));
                break;

            case R.id.btnVolumeSphere:
                answerSphere.setText(String.valueOf(Formulas.sphereVolumeFormula(sphRadius)));
                break;

        }
    }

}
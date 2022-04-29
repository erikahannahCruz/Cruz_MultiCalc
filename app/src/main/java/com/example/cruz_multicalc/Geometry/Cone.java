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

public class Cone extends Fragment implements View.OnClickListener {

    private EditText txtRadius , txtHeight ;
    Button btnArea , btnVolume;
    TextView answerCone;

    public Cone() {
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
        return inflater.inflate(R.layout.fragment_g_cone, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtRadius = (EditText) getView().findViewById(R.id.txtRadiusCone);
        txtHeight = (EditText) getView().findViewById(R.id.txtHeightCone);
        btnArea = (Button) getActivity().findViewById(R.id.btnAreaCone);
        btnVolume = (Button) getActivity().findViewById(R.id.btnVolumeCone);
        answerCone = (TextView) getView().findViewById(R.id.txtAnswerCone);

        btnArea.setOnClickListener(this);
        btnVolume.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){

        double conRadius = Double.parseDouble(String.valueOf(txtRadius.getText()));
        double conHeight = Double.parseDouble(String.valueOf(txtHeight.getText()));

        switch (v.getId()) {
            case R.id.btnAreaCone:
                answerCone.setText(String.valueOf(Formulas.coneAreaFormula(conHeight , conRadius)));
                break;

            case R.id.btnVolumeCone:
                answerCone.setText(String.valueOf(Formulas.coneVolumeFormula(conHeight , conRadius)));
                break;

        }
    }

}
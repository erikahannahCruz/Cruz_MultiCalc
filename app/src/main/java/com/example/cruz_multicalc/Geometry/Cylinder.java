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

public class Cylinder extends Fragment implements View.OnClickListener {

    private EditText txtRadius , txtHeight;
    Button btnArea , btnVolume ;
    TextView answerCylinder ;

    public Cylinder() {
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
        return inflater.inflate(R.layout.fragment_g_cylinder, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtRadius = (EditText) getView().findViewById(R.id.txtRadiusCylinder);
        txtHeight = (EditText) getView().findViewById(R.id.txtHeightCylinder);
        btnArea = (Button) getActivity().findViewById(R.id.btnAreaCylinder);
        btnVolume = (Button) getActivity().findViewById(R.id.btnVolumeCylinder);
        answerCylinder = (TextView) getView().findViewById(R.id.txtAnswerCylinder);

        btnArea.setOnClickListener(this);
        btnVolume.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){

        double cylRadius = Double.parseDouble(String.valueOf(txtRadius.getText()));
        double cylHeight = Double.parseDouble(String.valueOf(txtHeight.getText()));

        switch (v.getId()) {
            case R.id.btnAreaCylinder:
                answerCylinder.setText(String.valueOf(Formulas.cylinderAreaFormula(cylRadius , cylHeight)));
                break;

            case R.id.btnVolumeCylinder:
                answerCylinder.setText(String.valueOf(Formulas.cylinderVolumeFormula(cylRadius , cylHeight)));
                break;

        }
    }
}
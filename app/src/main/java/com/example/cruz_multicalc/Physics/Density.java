package com.example.cruz_multicalc.Physics;

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

public class Density extends Fragment implements View.OnClickListener {

    private EditText txtMass , txtVolume ;
    Button  btnCalculate ;
    TextView answerDen ;

    public Density() {
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
        return inflater.inflate(R.layout.fragment_p_density, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtMass = (EditText) getView().findViewById(R.id.txtMass);
        txtVolume = (EditText) getView().findViewById(R.id.txtVolume);
        btnCalculate = (Button) getActivity().findViewById(R.id.btnCalculateDen);
        answerDen = (TextView) getView().findViewById(R.id.txtDensity);

        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {

        double denMass = Double.parseDouble(String.valueOf(txtMass.getText()));
        double denVolume = Double.parseDouble(String.valueOf(txtVolume.getText()));

        if (v.getId() == R.id.btnCalculateDen) {
            answerDen.setText(String.valueOf(Formulas.speed(denMass , denVolume)));
        }
        else {}
    }

}
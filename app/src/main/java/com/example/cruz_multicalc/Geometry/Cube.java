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

public class Cube extends Fragment implements View.OnClickListener {

    private EditText txtLength;
    Button btnArea , btnVolume ;
    TextView answerCube ;

    public Cube() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_g_cube, container, false);

        return view;
    }

     public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         txtLength = (EditText) getView().findViewById(R.id.txtCubeLength);
         btnArea = (Button) getActivity().findViewById(R.id.btnAreaCube);
         btnVolume = (Button) getActivity().findViewById(R.id.btnVolumeCube);
         answerCube = (TextView) getView().findViewById(R.id.txtAnswerCube);

         btnArea.setOnClickListener(this);
         btnVolume.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){

        double cubeLength = Double.parseDouble(String.valueOf(txtLength.getText()));

        switch (v.getId()) {
            case R.id.btnAreaCube:
                answerCube.setText(String.valueOf(Formulas.cubeAreaFormula(cubeLength)));
                break;

            case R.id.btnVolumeCube:
                answerCube.setText(String.valueOf(Formulas.cubeVolumeFormula(cubeLength)));
                break;

        }
    }

}
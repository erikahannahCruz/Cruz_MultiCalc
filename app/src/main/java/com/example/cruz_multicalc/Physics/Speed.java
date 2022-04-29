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


public class Speed extends Fragment implements View.OnClickListener {

    private EditText txtDistance , txtTime ;
    Button  btnCalculate ;
    TextView answerSpd ;

    public Speed() {
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
        return inflater.inflate(R.layout.fragment_p_speed, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtDistance = (EditText) getView().findViewById(R.id.txtDistance);
        txtTime = (EditText) getView().findViewById(R.id.txtTimeSpd);
        btnCalculate = (Button) getActivity().findViewById(R.id.btnCalculateSpd);
        answerSpd = (TextView) getView().findViewById(R.id.txtSpeed);

        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {

        double spdDistance = Double.parseDouble(String.valueOf(txtDistance.getText()));
        double spdTime = Double.parseDouble(String.valueOf(txtTime.getText()));

        if (v.getId() == R.id.btnCalculateSpd) {
            answerSpd.setText(String.valueOf(Formulas.speed(spdDistance , spdTime)));
        }
        else {}
    }

}
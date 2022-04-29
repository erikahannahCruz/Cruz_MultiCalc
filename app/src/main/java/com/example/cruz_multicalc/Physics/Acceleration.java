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

public class Acceleration extends Fragment implements View.OnClickListener {

    private EditText txtVelocity1 , txtVelocity2 , txtTimeAcc;
    Button btnCalculate ;
    TextView answerAcc ;


    public Acceleration() {
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
        return inflater.inflate(R.layout.fragment_p_acceleration, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtVelocity1 = (EditText) getView().findViewById(R.id.txtVelocity1);
        txtVelocity2 = (EditText) getView().findViewById(R.id.txtVelocity2);
        txtTimeAcc = (EditText) getView().findViewById(R.id.txtTimeAcc);
        btnCalculate = (Button) getActivity().findViewById(R.id.btnCalculateAcc);
        answerAcc = (TextView) getView().findViewById(R.id.txtAcceleration);

        btnCalculate.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {

        double accVel1 = Double.parseDouble(String.valueOf(txtVelocity1.getText()));
        double accVel2 = Double.parseDouble(String.valueOf(txtVelocity2.getText()));
        double accTime = Double.parseDouble(String.valueOf(txtTimeAcc.getText()));

        if (v.getId() == R.id.btnCalculateAcc) {
            answerAcc.setText(String.valueOf(Formulas.acceleration(accVel1 , accVel2, accTime)));
        }
        else {}
    }
}
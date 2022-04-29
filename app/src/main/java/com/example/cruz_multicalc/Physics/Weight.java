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

import org.w3c.dom.Text;

public class Weight extends Fragment implements View.OnClickListener{

    private EditText txtMass ;
    Button btnCalculate ;
    TextView answerWet ;

    public Weight() {
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
        return inflater.inflate(R.layout.fragment_p_weight, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtMass = (EditText) getView().findViewById(R.id.txtMassWet);
        btnCalculate = (Button) getActivity().findViewById(R.id.btnCalculateWet);
        answerWet = (TextView) getView().findViewById(R.id.txtWeight);

        btnCalculate.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        double wetMass = Double.parseDouble(String.valueOf(txtMass.getText()));

        if (v.getId() == R.id.btnCalculateWet) {
            answerWet.setText(String.valueOf(Formulas.weight(wetMass)));
        }
       else {}
    }

}
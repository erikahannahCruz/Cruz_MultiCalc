package com.example.cruz_multicalc;

import java.lang.Math;

public class Formulas {

    /*GEOMETRY FORMULAS*/

    //Cube
    public static double cubeAreaFormula (double cubeLength) {
        return (6 * (cubeLength * cubeLength));
    }
    public static double cubeVolumeFormula(double cubeLength) {
        return (cubeLength * cubeLength * cubeLength);
    }

    //Cone
    public static double coneAreaFormula (double conHeight , double conRadius) {
        return (Math.PI * conRadius * (conRadius + Math.sqrt((conHeight + conHeight) + (conRadius * conRadius))));

    }
    public static double coneVolumeFormula (double conHeight  , double conRadius) {
        return ((Math.PI * (conRadius * conRadius) * conHeight) / 3);

    }

    //Cylinder
    public static double cylinderAreaFormula (double cylRadius , double cylHeight) {
        return (2 * Math.PI *  cylRadius * (cylHeight + cylRadius));

    }
    public static double cylinderVolumeFormula (double cylRadius, double cylHeight) {
        return (Math.PI * (cylRadius * cylRadius) *  cylHeight);

    }

    //Sphere
    public static double sphereAreaFormula (double sphRadius) {
        return (4 * Math.PI * (sphRadius * sphRadius));

    }
    public static double sphereVolumeFormula (double sphRadius) {
        return ((4 * Math.PI * (sphRadius * sphRadius * sphRadius)) / 3);

    }

    /*PHYSICS FORMULAS*/

    public static double density (double denMass , double denVolume) {
        return  (denMass / denVolume);
    }

    public static double acceleration (double accVel1 , double accVel2 , double accTime) {
        return ((accVel2 - accVel1) / accTime );
    }

    public static double speed (double spdDistance , double spdTime) {
        return (spdDistance / spdTime);
    }

    public static double weight (double wetMass) {
        return (wetMass * 9.8);
    }

}

package com.example.test;

import android.widget.AdapterView;

import com.example.tetris.OpcionesActivity;
import com.example.tetris.Tablero;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OpcionesActivityTest {

    OpcionesActivity opcionesActivity;


    @Test
    public void SetColorTest() {

        AdapterView sCuadrado = null;
        String seleccionC = "";

        if (seleccionC.equals("Red")) {
            assertEquals(Tablero.getColorCuadrado(),7);
        }
        if (seleccionC.equals("Pink")) {
            assertEquals(Tablero.getColorCuadrado(),1);
        }
        if (seleccionC.equals("Light Blue")) {
            assertEquals(Tablero.getColorCuadrado(),2);
        }
        if (seleccionC.equals("Dark Blue")) {
            assertEquals(Tablero.getColorCuadrado(),3);
        }
        if (seleccionC.equals("Green")) {
            assertEquals(Tablero.getColorCuadrado(),4);
        }
        if (seleccionC.equals("Orange")) {
            assertEquals(Tablero.getColorCuadrado(),5);
        }
        if (seleccionC.equals("Yellow")) {
            assertEquals(Tablero.getColorCuadrado(),6);
        }

        AdapterView sZ = null;
        String seleccionZ = "";
        if (seleccionZ.equals("Red")) {
            assertEquals(Tablero.getColorZPieza(),7);
            // codigo set Z a rojo
        }
        if (seleccionZ.equals("Pink")) {
            assertEquals(Tablero.getColorZPieza(),1);
        }
        if (seleccionZ.equals("Light Blue")) {
            assertEquals(Tablero.getColorZPieza(),2);
        }
        if (seleccionZ.equals("Dark Blue")) {
            assertEquals(Tablero.getColorZPieza(),3);
        }
        if (seleccionZ.equals("Green")) {
            assertEquals(Tablero.getColorZPieza(),4);
        }
        if (seleccionZ.equals("Orange")) {
            assertEquals(Tablero.getColorZPieza(),5);
        }
        if (seleccionZ.equals("Yellow")) {
            assertEquals(Tablero.getColorZPieza(),6);
        }

        AdapterView sI = null;
        String seleccionI = "";
        if (seleccionI.equals("Red")) {
            // codigo set I a rojo
            assertEquals(Tablero.getColorIPieza(), 7);

        }
        if (seleccionI.equals("Pink")) {
            assertEquals(Tablero.getColorIPieza(), 1);

        }
        if (seleccionI.equals("Light Blue")) {
            assertEquals(Tablero.getColorIPieza(), 2);

        }
        if (seleccionI.equals("Dark Blue")) {
            assertEquals(Tablero.getColorIPieza(), 3);

        }
        if (seleccionI.equals("Green")) {
            assertEquals(Tablero.getColorIPieza(), 4);

        }
        if (seleccionI.equals("Orange")) {
            assertEquals(Tablero.getColorIPieza(), 5);

        }
        if (seleccionI.equals("Yellow")) {
            assertEquals(Tablero.getColorIPieza(), 6);
        }
        AdapterView sT = null;
        String seleccionT = "";
        if (seleccionT.equals("Red")) {
            assertEquals(Tablero.getColorTPieza(),7);

        }
        if (seleccionT.equals("Pink")) {
            assertEquals(Tablero.getColorTPieza(),1);

        }
        if (seleccionT.equals("Light Blue")) {
            assertEquals(Tablero.getColorTPieza(),2);

        }
        if (seleccionT.equals("Dark Blue")) {
            assertEquals(Tablero.getColorTPieza(),3);

        }
        if (seleccionT.equals("Green")) {
            assertEquals(Tablero.getColorTPieza(),4);

        }
        if (seleccionT.equals("Orange")) {
            assertEquals(Tablero.getColorTPieza(),5);

        }
        if (seleccionT.equals("Yellow")) {
            assertEquals(Tablero.getColorTPieza(),6);

        }
        AdapterView sS = null;
        String seleccionS = "";
        if (seleccionS.equals("Red")) {
            assertEquals(Tablero.getColorSPieza(),7);

        }
        if (seleccionS.equals("Pink")) {
            assertEquals(Tablero.getColorSPieza(),1);

        }
        if (seleccionS.equals("Light Blue")) {
            assertEquals(Tablero.getColorSPieza(),2);

        }
        if (seleccionS.equals("Dark Blue")) {
            assertEquals(Tablero.getColorSPieza(),3);

        }
        if (seleccionS.equals("Green")) {
            assertEquals(Tablero.getColorSPieza(),4);

        }
        if (seleccionS.equals("Orange")) {
            assertEquals(Tablero.getColorSPieza(),5);

        }
        if (seleccionS.equals("Yellow")) {
            assertEquals(Tablero.getColorSPieza(),6);
        }
        AdapterView sL = null;
        String seleccionL = "";
        if (seleccionL.equals("Red")) {
            assertEquals(Tablero.getColorLPieza(), 7);

        }
        if (seleccionL.equals("Pink")) {
            assertEquals(Tablero.getColorLPieza(), 1);

        }
        if (seleccionL.equals("Light Blue")) {
            assertEquals(Tablero.getColorLPieza(), 2);

        }
        if (seleccionL.equals("Dark Blue")) {
            assertEquals(Tablero.getColorLPieza(), 3);

        }
        if (seleccionL.equals("Green")) {
            assertEquals(Tablero.getColorLPieza(), 4);

        }
        if (seleccionL.equals("Orange")) {
            assertEquals(Tablero.getColorLPieza(), 5);

        }
        if (seleccionL.equals("Yellow")) {
            assertEquals(Tablero.getColorLPieza(), 6);

        }
        AdapterView sJ = null;
        String seleccionJ = "";
        if (seleccionJ.equals("Red")) {
            assertEquals(Tablero.getColorJPieza(),7);

        }
        if (seleccionJ.equals("Pink")) {
            assertEquals(Tablero.getColorJPieza(),1);


        }
        if (seleccionJ.equals("Light Blue")) {
            assertEquals(Tablero.getColorJPieza(),2);


        }
        if (seleccionJ.equals("Dark Blue")) {
            assertEquals(Tablero.getColorJPieza(),3);


        }
        if (seleccionJ.equals("Green")) {
            assertEquals(Tablero.getColorJPieza(),4);


        }
        if (seleccionJ.equals("Orange")) {
            assertEquals(Tablero.getColorJPieza(),5);


        }
        if (seleccionJ.equals("Yellow")) {
            assertEquals(Tablero.getColorJPieza(),5);


        }

    }


}

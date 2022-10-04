/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Dino
 */
public class positions {

    Object[][][] p = new Object[8][8][2];

    //inicia, constructor
    public positions() {
        p = start();
    }
// posicion inicial de las piezas
    public Object[][][] start() {
        Object p[][][] = new Object[8][8][2]; //tamaño del tablero, el 2 indica los valores de la casilla, booleano y numero
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                p[i][j][0] = -1;
                p[i][j][1] = -1;
            }
        }
        p[0][0][0] = 3;
        p[0][0][1] = false;

        p[1][0][0] = 2;
        p[1][0][1] = false;

        p[2][0][0] = 1;
        p[2][0][1] = false;

        p[3][0][0] = 4;
        p[3][0][1] = false;

        p[4][0][0] = 5;
        p[4][0][1] = false;

        p[5][0][0] = 1;
        p[5][0][1] = false;

        p[6][0][0] = 2;
        p[6][0][1] = false;

        p[7][0][0] = 3;
        p[7][0][1] = false;

        p[0][1][0] = 0;
        p[0][1][1] = false;

        p[1][1][0] = 0;
        p[1][1][1] = false;

        p[2][1][0] = 0;
        p[2][1][1] = false;

        p[3][1][0] = 0;
        p[3][1][1] = false;

        p[4][1][0] = 0;
        p[4][1][1] = false;

        p[5][1][0] = 0;
        p[5][1][1] = false;

        p[6][1][0] = 0;
        p[6][1][1] = false;

        p[7][1][0] = 0;
        p[7][1][1] = false;
//-----
        p[0][7][0] = 3;
        p[0][7][1] = true;

        p[1][7][0] = 2;
        p[1][7][1] = true;

        p[2][7][0] = 1;
        p[2][7][1] = true;

        p[3][7][0] = 4;
        p[3][7][1] = true;

        p[4][7][0] = 5;
        p[4][7][1] = true;

        p[5][7][0] = 1;
        p[5][7][1] = true;

        p[6][7][0] = 2;
        p[6][7][1] = true;

        p[7][7][0] = 3;
        p[7][7][1] = true;

        p[0][6][0] = 0;
        p[0][6][1] = true;

        p[1][6][0] = 0;
        p[1][6][1] = true;

        p[2][6][0] = 0;
        p[2][6][1] = true;

        p[3][6][0] = 0;
        p[3][6][1] = true;

        p[4][6][0] = 0;
        p[4][6][1] = true;

        p[5][6][0] = 0;
        p[5][6][1] = true;

        p[6][6][0] = 0;
        p[6][6][1] = true;

        p[7][6][0] = 0;
        p[7][6][1] = true;
        return p;
    }

}

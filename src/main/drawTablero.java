/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Elizabeth
 */
import BishopBlack.*;
import BishopWhite.*;
import org.yourorghere.*;
import com.sun.opengl.util.texture.Texture;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class drawTablero {

    private GLUquadric q = null;
    float t = 1.45f;
    int xP = 4;
    int yP = 4;
    boolean turn = true; //turno
    int[][] tab = new int[8][8];//color casillas

    //position of each component int the window
    public drawTablero() {
        normal();
    }

    public void setTurn(boolean tn) {
        this.turn = tn;
    }

    public void draw_stan(GL gl) {
        GLU glu = new GLU();
        q = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(q, GLU.GLU_FILL);
        glu.gluQuadricOrientation(q, GLU.GLU_OUTSIDE);
        glu.gluQuadricNormals(q, GLU.GLU_SMOOTH);
        base(gl, glu, t * 2.0f);
    }

//asigna el color al tablero y la posicion actual    
    private void normal() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chezz_plot(i, j)) {
                    tab[i][j] = 0;
                } else {
                    tab[i][j] = 1;
                }
            }
        }
        if (turn) {
            tab[xP][yP] = 7;
        } else {
            tab[xP][yP] = 6;
        }
    }

    //determina l color del tablero
    public boolean chezz_plot(int i, int j) {
        int p = 0;
        if (i % 2 == 0) {
            p = 1;
        } else {
            p = 0;
        }
        return (j + p) % 2 == 0;
    }

    //limita las coordenadas
    public boolean in(int x, int y) {
        return (x >= 0 && x < 8) && (y >= 0 && y < 8);
    }

    //mover el selector y asignarle color 
    public void move(int x, int y) {
        if (in(x + xP, y + yP)) {
            this.xP += x;
            this.yP += y;
            if (turn) {
                tab[xP][yP] = 7;
            } else {
                tab[xP][yP] = 6;
            }
        }
    }

    public void trajectories(Object[][][] p) {
        normal();
        int pP = Integer.parseInt(String.valueOf(p[xP][yP][0])); //convertir el objeto (posiciones}9 a cadena
        boolean bP = tn(Boolean.parseBoolean(String.valueOf(p[xP][yP][1])), pP);
        if (bP) {
            switch (pP) {
                //trayectoria segun pieza 
                case 1:
                    streak(p, -1, -1);
                    streak(p, 1, -1);
                    streak(p, -1, 1);
                    streak(p, 1, 1);
                    break;
                case 3:
                    streak(p, -1, 0);
                    streak(p, 1, 0);
                    streak(p, 0, 1);
                    streak(p, 0, -1);
                    break;
                case 4:
                    streak(p, -1, -1);
                    streak(p, 1, -1);
                    streak(p, -1, 1);
                    streak(p, 1, 1);
                    streak(p, -1, 0);
                    streak(p, 1, 0);
                    streak(p, 0, 1);
                    streak(p, 0, -1);
                    break;
            }
        }
    }

    //Identifica el turno y que la pieza pertenezca ahí
    private boolean tn(boolean bP, int p) {
        if (turn) {
            if (bP) {
                return true;
            } else {
                return false;
            }
        } else {
            if (bP) {
                return false;
            } else {
                if (p == -1) { //casillas sin piezas 
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    public void streak(Object[][][] p, int x, int y) { //trayectoias
        int xP1 = xP;
        int yP1 = yP;
        int auxP = -1;
        boolean auxB = true; //reevisa si pinta o no 
        do { //revisa los limites del tablero
            xP1 += x;
            yP1 += y;
            if (in(xP1, yP1)) {
                auxP = Integer.parseInt(String.valueOf(p[xP1][yP1][0])); // revisa si hay una pieza
                if (!tn(Boolean.parseBoolean(String.valueOf(p[xP1][yP1][1])), auxP)) { //identifica las piezas compañeras
                    line(xP1, yP1);// si hay pieza del mismo equipo no pinta
                }
            } else {
                auxB = false;//si se sale del limite del tablero no pinta
            }
            if (auxP != -1) { //si hay pieza no pinta
                auxB = false;
            }
        } while (auxB);
    }

    //pinta el tablero sgún el equipo
    public void line(int x, int y) {
        if (turn) {
            if (chezz_plot(x, y)) {
                tab[x][y] = 5;
            } else {
                tab[x][y] = 4;
            }
        } else {
            if (chezz_plot(x, y)) {
                tab[x][y] = 2;
            } else {
                tab[x][y] = 3;
            }
        }
    }

    //pinta todo, ver txt
    public void base(GL gl, GLU glu, float t) {
        gl.glTranslatef((-4.0f * t), -2.01f, (-4.0f * t));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                gl.glPushMatrix();
                switch (tab[i][j]) {
                    case 0:
                        set_black_material(gl);
                        break;
                    case 1:
                        set_white_material(gl);
                        break;
                    case 2:
                        set_red_material(gl);
                        break;
                    case 3:
                        set_red2_material(gl);
                        break;
                    case 4:
                        set_blue_material(gl);
                        break;
                    case 5:
                        set_blue2_material(gl);
                        break;
                    case 6:
                        set_green_material(gl);
                        break;
                    case 7:
                        set_yellow_material(gl);
                        break;
                }
                gl.glBegin(GL.GL_QUADS);
                gl.glNormal3f(0.0f, 0.0f, 0.0f);
                gl.glVertex3f(0.0f + ((float) i * t), 0.0f, 0.0f + ((float) j * t));
                gl.glVertex3f(0.0f + ((float) i * t), 0.0f, t + ((float) j * t));
                gl.glVertex3f(t + ((float) i * t), 0.0f, t + ((float) j * t));
                gl.glVertex3f(t + ((float) i * t), 0.0f, 0.0f + ((float) j * t));
                gl.glEnd();
                gl.glPopMatrix();
            }
        }
    }

    //COLORES
    public void set_white_material(GL gl) {

        float mat_ambient[] = {0.8f, 1.0f, 1.0f, 0.8f};
        float mat_diffuse[] = {1.0f, 0.0f, 1.0f, 0.5f};
        float mat_specular[] = {0.8f, 0.8f, 0.5f, 0.5f};
        float shine = 51.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_blue_material(GL gl) {
        float mat_ambient[] = {0.0f, 0.4f, 1.0f, 0.0f};
        float mat_diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float mat_specular[] = {0.8f, 0.8f, 0.8f, 1.0f};
        float shine = 51.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_blue2_material(GL gl) {
        float mat_ambient[] = {0.0f, 0.2f, 0.5f, 0.0f};
        float mat_diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float mat_specular[] = {0.8f, 0.8f, 0.8f, 1.0f};
        float shine = 51.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_red_material(GL gl) {
        float mat_ambient[] = {0.45f, 0.0f, 0.1f, 0.0f};
        float mat_diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float mat_specular[] = {0.8f, 0.8f, 0.8f, 1.0f};
        float shine = 51.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_red2_material(GL gl) {
        float mat_ambient[] = {0.7f, 0.0f, 0.1f, 0.0f};
        float mat_diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float mat_specular[] = {0.8f, 0.8f, 0.8f, 1.0f};
        float shine = 51.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_green_material(GL gl) {
        float mat_ambient[] = {0.25f, 1.0f, 0.1f, 0.0f};
        float mat_diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float mat_specular[] = {0.8f, 0.8f, 0.8f, 1.0f};
        float shine = 51.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_yellow_material(GL gl) {
        float mat_ambient[] = {0.8f, 0.65f, 0.1f, 0.0f};
        float mat_diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float mat_specular[] = {0.8f, 0.8f, 0.8f, 1.0f};
        float shine = 51.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_grey_material(GL gl) {

        float mat_ambient[] = {0.09f, 0.09f, 0.09f, 0.0f};
        float mat_diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float mat_specular[] = {0.8f, 0.8f, 0.8f, 1.0f};
        float shine = 125.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_black_material(GL gl) {

        float mat_ambient[] = {0.03f, 0.03f, 0.03f, 1.0f};
        float mat_diffuse[] = {0.1f, 0.0f, 0.0f, 1.0f};
        float mat_specular[] = {0.0f, 0.0f, 0.0f, 1.0f};
        float shine = 525.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
    }

    void draw_stan(GL gl, drawTablero t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueenBlack;

/**
 *
 * @author Elizabeth
 */
import QueenWhite.*;
import org.yourorghere.*;
import com.sun.opengl.util.texture.Texture;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class drawBQ {

    private GLUquadric q = null;
    public float x = 0.0f;
    public float z = 0.0f;

    //position of each component int the window
    public drawBQ() {
    }

    public void draw_stan(GL gl) {

        GLU glu = new GLU();
        q = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(q, GLU.GLU_FILL);
        glu.gluQuadricOrientation(q, GLU.GLU_OUTSIDE);
        glu.gluQuadricNormals(q, GLU.GLU_SMOOTH);
        base(gl, glu);

    }

    public void base(GL gl, GLU glu) {

        set_black_material(gl);
        gl.glTranslatef(x, -1f, z);
        gl.glRotatef(90, 0, 1, 0);
//
        //IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(-1.3f, -1f, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(1.3f, -1, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, 1.3f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, -1.3f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //////////////INTERIOR BASE///////////////////////////////////////////////////////////////
        //IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(-1.2f, -1, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 0.8f, 0f);
        gl.glVertex3f(1.2f, 0.8f, 0f);
        gl.glVertex3f(1.2f, 0f, 0f);
        gl.glVertex3f(-1.2f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(1.2f, -1, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 0.8f, 0f);
        gl.glVertex3f(1.2f, 0.8f, 0f);
        gl.glVertex3f(1.2f, 0f, 0f);
        gl.glVertex3f(-1.2f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, 1.2f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 0.8f, 0f);
        gl.glVertex3f(1.2f, 0.8f, 0f);
        gl.glVertex3f(1.2f, 0f, 0f);
        gl.glVertex3f(-1.2f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, -1.2f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 0.8f, 0f);
        gl.glVertex3f(1.2f, 0.8f, 0f);
        gl.glVertex3f(1.2f, 0f, 0f);
        gl.glVertex3f(-1.2f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        ///////////INTERIOR PRINCIPAL
        /////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////
        //IZQUIERDA------------------------------------     
        gl.glPushMatrix();

        gl.glTranslatef(-1f, -0.2f, -0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 3f, 0f);
        gl.glVertex3f(1f, 3f, 0f);
        gl.glVertex3f(1f, 0f, 0f);
        gl.glVertex3f(-1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(1f, -0.2f, -0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3f(-1f, 3f, 0f);
        gl.glVertex3f(1f, 3f, 0f);
        gl.glVertex3f(1f, 0f, 0f);
        gl.glVertex3f(-1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ENFRENTE------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(0f, -0.2f, 1f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 3f, 0f);
        gl.glVertex3f(1f, 3f, 0f);
        gl.glVertex3f(1f, 0f, 0f);
        gl.glVertex3f(-1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(0f, -0.2f, -1f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 3f, 0f);
        gl.glVertex3f(1f, 3f, 0f);
        gl.glVertex3f(1f, 0f, 0f);
        gl.glVertex3f(-1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        ///////////CABEZA
        /////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////
        //IZQUIERDA------------------------------------     
        gl.glPushMatrix();

        gl.glTranslatef(-1f, 2.95f, -0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 1.66f, 0f);
        gl.glVertex3f(1f, 1.6f, 0f);
        gl.glVertex3f(1f, 0f, 0f);
        gl.glVertex3f(-1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(1f, 2.9f, -0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 1.66f, 0f);
        gl.glVertex3f(1f, 1.6f, 0f);
        gl.glVertex3f(1f, 0f, 0f);
        gl.glVertex3f(-1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ENFRENTE------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(0f, 2.95f, 1f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 1.66f, 0f);
        gl.glVertex3f(1f, 1.6f, 0f);
        gl.glVertex3f(1f, 0f, 0f);
        gl.glVertex3f(-1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(0f, 2.9f, -1f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 1.66f, 0f);
        gl.glVertex3f(1f, 1.6f, 0f);
        gl.glVertex3f(1f, 0f, 0f);
        gl.glVertex3f(-1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //+++++++++++++++++++++++++++++++++ 
        // INTERIOR INTERIOR
        //+++++++++++++++++++++++++++++++++
        //IZQUIERDA------------------------------------     
        gl.glPushMatrix();

        gl.glTranslatef(-0.9f, -0.2f, -0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1f, 0.0f, 0.0f);
        gl.glVertex3f(-0.9f, 3.15f, 0f);
        gl.glVertex3f(0.9f, 3.15f, 0f);
        gl.glVertex3f(0.9f, 0f, 0f);
        gl.glVertex3f(-0.9f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(0.9f, -0.2f, -0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3f(-0.9f, 3.15f, 0f);
        gl.glVertex3f(0.9f, 3.15f, 0f);
        gl.glVertex3f(0.9f, 0f, 0f);
        gl.glVertex3f(-0.9f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ENFRENTE------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(0f, -0.2f, 0.9f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.9f, 3.15f, 0f);
        gl.glVertex3f(0.9f, 3.15f, 0f);
        gl.glVertex3f(0.9f, 0f, 0f);
        gl.glVertex3f(-0.9f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS------------------------------------     
        gl.glPushMatrix();
        gl.glTranslatef(0f, -0.2f, -0.9f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.9f, 3.15f, 0f);
        gl.glVertex3f(0.9f, 3.15f, 0f);
        gl.glVertex3f(0.9f, 0f, 0f);
        gl.glVertex3f(-0.9f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
        //CABEZA BASE INFERIOR///////////////////////////////////////////////////////////////////
        //IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(-1.3f, -0.6f, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.3f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(1.3f, -0.6f, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.6f, 1.3f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.6f, -1.3F);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0.3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ABAJO******************************************************************
        gl.glPushMatrix();
        set_grey_material(gl);

        gl.glTranslatef(0, -1f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, -1.3f, 0f);
        gl.glVertex3f(-1.3f, -1.3f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //en medio base
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.6f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, -1.3f, 0f);
        gl.glVertex3f(-1.3f, -1.3f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        // Encima base alta
        gl.glPushMatrix();

        gl.glTranslatef(0, 2.95f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 1f, 0f);
        gl.glVertex3f(1f, 1f, 0f);
        gl.glVertex3f(1f, -1f, 0f);
        gl.glVertex3f(-1f, -1f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //TAPA************************************************
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.7f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, -1.3f, 0f);
        gl.glVertex3f(-1.3f, -1.3f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        // TAPA BASE 
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.3f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, -1.3f, 0f);
        gl.glVertex3f(-1.3f, -1.3f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //Encima base
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.199f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 1.2f, 0f);
        gl.glVertex3f(1.2f, 1.2f, 0f);
        gl.glVertex3f(1.2f, -1.2f, 0f);
        gl.glVertex3f(-1.2f, -1.2f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        // Encima base alta
        gl.glPushMatrix();

        gl.glTranslatef(0, 2.8f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1f, 1f, 0f);
        gl.glVertex3f(1f, 1f, 0f);
        gl.glVertex3f(1f, -1f, 0f);
        gl.glVertex3f(-1f, -1f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

// punta
        gl.glPushMatrix();

        gl.glTranslatef(0, 5.2f, -0f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.2f, 0.2f, 0f);
        gl.glVertex3f(0.2f, 0.2f, 0f);
        gl.glVertex3f(0.2f, -0.2f, 0f);
        gl.glVertex3f(-0.2f, -0.2f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //////////CONO/////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        set_black_material(gl);
        gl.glTranslatef(0, -1, 0);

//ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0f, 5.51f, -2f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glNormal3f(1.0f, 0.0f, 0f);
        gl.glVertex3f(-0.2f, 0.7f, 1.8f);
        gl.glVertex3f(0.2f, 0.7f, 1.8f);
        gl.glVertex3f(1f, 0f, 1f);
        gl.glVertex3f(-1f, 0f, 1f);
        gl.glEnd();
        gl.glPopMatrix();

//FRENTE
        gl.glPushMatrix();

        gl.glTranslatef(0f, 5.51f, -2f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glNormal3f(1.0f, 0.0f, 0f);
        gl.glVertex3f(-0.2f, 0.7f, 2.2f);
        gl.glVertex3f(0.2f, 0.7f, 2.2f);
        gl.glVertex3f(1f, 0f, 3f);
        gl.glVertex3f(-1f, 0f, 3f);
        gl.glEnd();
        gl.glPopMatrix();

//IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(-2f, 5.51f, 0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_POLYGON);
        gl.glNormal3f(1.0f, 0.0f, 0f);
        gl.glVertex3f(-0.2f, 0.7f, 1.8f);
        gl.glVertex3f(0.2f, 0.7f, 1.8f);
        gl.glVertex3f(1f, 0f, 1f);
        gl.glVertex3f(-1f, 0f, 1f);
        gl.glEnd();
        gl.glPopMatrix();

//DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(-2f, 5.51f, 0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_POLYGON);
        gl.glNormal3f(1.0f, 0.0f, 0f);
        gl.glVertex3f(-0.2f, 0.7f, 2.2f);
        gl.glVertex3f(0.2f, 0.7f, 2.2f);
        gl.glVertex3f(1f, 0f, 3f);
        gl.glVertex3f(-1f, 0f, 3f);
        gl.glEnd();
        gl.glPopMatrix();

        // CRUZ
        //VERTICAL
        set_white_material(gl);
        gl.glPushMatrix();
        gl.glTranslatef(0f, 6.1f, 0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1f, 0.0f, 0f);
        gl.glVertex3f(-0.1f, 0.6f, 0f);
        gl.glVertex3f(0.1f, 0.6f, 0f);
        gl.glVertex3f(0.1f, 0f, 0f);
        gl.glVertex3f(-0.1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //HORIZONTAL
        gl.glPushMatrix();
        gl.glTranslatef(0f, 6.4f, 0f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1f, 0.0f, 0f);
        gl.glVertex3f(-0.3f, 0.1f, 0f);
        gl.glVertex3f(0.3f, 0.1f, 0f);
        gl.glVertex3f(0.3f, 0f, 0f);
        gl.glVertex3f(-0.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

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

}

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
import RookBlack.*;
import org.yourorghere.*;
import com.sun.opengl.util.texture.Texture;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class drawBR {

    private GLUquadric q = null;
    float x = 0.0f;
    float z = 0.0f;

    //position of each component int the window
    public drawBR() {
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
//
        //IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(-1.3f, -1, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0.5f, 0f);
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
        gl.glVertex3f(-1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, 1.3f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, -1.3f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //////////////INTERIOR///////////////////////////////////////////////////////////////
        //IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(-1.2f, -1, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 3.8f, 0f);
        gl.glVertex3f(1.2f, 3.8f, 0f);
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
        gl.glVertex3f(-1.2f, 3.8f, 0f);
        gl.glVertex3f(1.2f, 3.8f, 0f);
        gl.glVertex3f(1.2f, 0f, 0f);
        gl.glVertex3f(-1.2f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, 1.2f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 3.8f, 0f);
        gl.glVertex3f(1.2f, 3.8f, 0f);
        gl.glVertex3f(1.2f, 0f, 0f);
        gl.glVertex3f(-1.2f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, -1.2f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 3.8f, 0f);
        gl.glVertex3f(1.2f, 3.8f, 0f);
        gl.glVertex3f(1.2f, 0f, 0f);
        gl.glVertex3f(-1.2f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //CABEZA BASE///////////////////////////////////////////////////////////////////
        //IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(-1.3f, -0.4f, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.3f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(1.3f, -0.4f, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3f(-1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.4f, 1.3f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.4f, -1.3F);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);;
        gl.glEnd();
        gl.glPopMatrix();

        //ABAJO******************************************************************
        gl.glPushMatrix();
        set_grey_material(gl);

        gl.glTranslatef(0, -1, 0);
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

        gl.glTranslatef(0, -0.4f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, -1.3f, 0f);
        gl.glVertex3f(-1.3f, -1.3f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //TAPA************************************************
        gl.glPushMatrix();

        gl.glTranslatef(0, -0.5f, 0);
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

        gl.glTranslatef(0, 2.6F, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, -1.3f, 0f);
        gl.glVertex3f(-1.3f, -1.3f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        // TAPA ENCIMA CABEZA
        gl.glPushMatrix();

        gl.glTranslatef(0, 2.801F, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.2f, 1.2f, 0f);
        gl.glVertex3f(1.2f, 1.2f, 0f);
        gl.glVertex3f(1.2f, -1.2f, 0f);
        gl.glVertex3f(-1.2f, -1.2f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //////////FIGUIRA/////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////-----------------------IZQUIERDA
        set_black_material(gl);
        gl.glPushMatrix();

        gl.glTranslatef(-1.3f, 2.8f, 0.66f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(-0.05f, 2.8f, 0.66f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(-0.68f, 2.8f, 1.29f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(-0.67f, 2.8f, 0.04f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //////////////////-----------------------IZQUIERDA ARRIBA
        gl.glPushMatrix();

        gl.glTranslatef(-1.3f, 2.8f, -0.66f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(-0.05f, 2.8f, -0.66f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(-0.68f, 2.8f, -1.29f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(-0.67f, 2.8f, -0.04f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //////////////////-----------------------DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(1.3f, 2.8f, 0.66f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(0.05f, 2.8f, 0.66f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0.68f, 2.8f, 1.29f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0.67f, 2.8f, 0.04f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //////////////////-----------------------DERECHA ARRIBA
        gl.glPushMatrix();

        gl.glTranslatef(1.3f, 2.8f, -0.66f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(0.05f, 2.8f, -0.66f);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0.68f, 2.8f, -1.29f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0.67f, 2.8f, -0.04f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0.8f, 0f);
        gl.glVertex3f(0.63f, 0f, 0f);
        gl.glVertex3f(-0.63f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        ///++++++++++++TAPAS
        // IZQUIERDA ABAJO
        gl.glPushMatrix();
        set_grey_material(gl);

        gl.glTranslatef(-0.67f, 3.6f, 0.66f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, -0.63f, 0f);
        gl.glVertex3f(-0.63f, -0.63f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //IZQUIERDA ARRIBA
        gl.glPushMatrix();

        gl.glTranslatef(-0.67f, 3.6f, -0.66f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, -0.63f, 0f);
        gl.glVertex3f(-0.63f, -0.63f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        // DERECHA ABAJO
        gl.glPushMatrix();
        gl.glTranslatef(0.67f, 3.6f, 0.66f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, -0.63f, 0f);
        gl.glVertex3f(-0.63f, -0.63f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA ARRIBA
        gl.glPushMatrix();

        gl.glTranslatef(0.67f, 3.6f, -0.66f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, -0.63f, 0f);
        gl.glVertex3f(-0.63f, -0.63f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //+++++++++++++++++++++BASES
        // IZQUIERDA ABAJO
        gl.glPushMatrix();

        gl.glTranslatef(-0.67f, 2.8f, 0.66f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, -0.63f, 0f);
        gl.glVertex3f(-0.63f, -0.63f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //IZQUIERDA ARRIBA
        gl.glPushMatrix();

        gl.glTranslatef(-0.67f, 2.8f, -0.66f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, -0.63f, 0f);
        gl.glVertex3f(-0.63f, -0.63f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        // DERECHA ABAJO
        gl.glPushMatrix();

        gl.glTranslatef(0.67f, 2.8f, 0.66f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, -0.63f, 0f);
        gl.glVertex3f(-0.63f, -0.63f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA ARRIBA
        gl.glPushMatrix();

        gl.glTranslatef(0.67f, 2.8f, -0.66f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, 0.63f, 0f);
        gl.glVertex3f(0.63f, -0.63f, 0f);
        gl.glVertex3f(-0.63f, -0.63f, 0f);
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

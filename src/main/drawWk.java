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
import KnightWhite.*;
import org.yourorghere.*;
import com.sun.opengl.util.texture.Texture;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class drawWk {

    private GLUquadric q = null;
    float x = 0.0f;
    float z = 0.0f;

    //position of each component int the window
    public drawWk() {
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

        set_white_material(gl);
        gl.glTranslatef(x, -1, z);
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

        gl.glTranslatef(-1.1f, -1, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.1f, 1f, 0f);
        gl.glVertex3f(1.1f, 1f, 0f);
        gl.glVertex3f(1.1f, 0f, 0f);
        gl.glVertex3f(-1.1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(1.1f, -1, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.1f, 1f, 0f);
        gl.glVertex3f(1.1f, 1f, 0f);
        gl.glVertex3f(1.1f, 0f, 0f);
        gl.glVertex3f(-1.1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTRE
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, 1.1f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.1f, 1f, 0f);
        gl.glVertex3f(1.1f, 1f, 0f);
        gl.glVertex3f(1.1f, 0f, 0f);
        gl.glVertex3f(-1.1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(0, -1, -1.1f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.1f, 1f, 0f);
        gl.glVertex3f(1.1f, 1f, 0f);
        gl.glVertex3f(1.1f, 0f, 0f);
        gl.glVertex3f(-1.1f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //CABEZA BASE///////////////////////////////////////////////////////////////////
        //IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(-1.3f, -0.4f, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.3f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(1.3f, -0.4f, 0);
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

        gl.glTranslatef(0, -0.4f, 1.3f);
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

        gl.glTranslatef(0, -0.4f, -1.3F);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0.5f, 0f);
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ABAJO******************************************************************
        gl.glPushMatrix();
        set_black_material(gl);

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
        set_grey_material(gl);

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

        gl.glTranslatef(0, 0.1F, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, 1.3f, 0f);
        gl.glVertex3f(1.3f, -1.3f, 0f);
        gl.glVertex3f(-1.3f, -1.3f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //////////FIGUIRA/////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        set_white_material(gl);
        gl.glTranslatef(0, -1, 0);

        //IZQUIERDA
        gl.glPushMatrix();

        gl.glTranslatef(0.43f, 1.1f, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_POLYGON);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 3f, 0f);
        gl.glVertex3f(-0.64f, 3.64f, 0f);
        gl.glVertex3f(1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 2.14f, 0f); //F
        gl.glVertex3f(0.2f, 2.36f, 0f); //G
        gl.glVertex3f(0.2f, 2.2f, 0f); //H
        gl.glVertex3f(1.3f, 1.8f, 0f); //I
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //DERECHA
        gl.glPushMatrix();

        gl.glTranslatef(-0.43f, 1.1f, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glBegin(GL.GL_POLYGON);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-1.3f, 0f, 0f);
        gl.glVertex3f(-1.3f, 3f, 0f);
        gl.glVertex3f(-0.64f, 3.64f, 0f);
        gl.glVertex3f(1.3f, 3f, 0f);
        gl.glVertex3f(1.3f, 2.14f, 0f); //F
        gl.glVertex3f(0.2f, 2.36f, 0f); //G
        gl.glVertex3f(0.2f, 2.2f, 0f); //H
        gl.glVertex3f(1.3f, 1.8f, 0f); //I
        gl.glVertex3f(1.3f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS
        gl.glPushMatrix();

        gl.glTranslatef(-0f, 1.1f, 1.3f);

        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.43f, 0f, 0f);
        gl.glVertex3f(-0.43f, 3f, 0f);
        gl.glVertex3f(0.43f, 3f, 0f);
        gl.glVertex3f(0.43f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRONTAL CABEZA
        gl.glPushMatrix();

        gl.glTranslatef(0f, 3.25f, -1.3f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.43f, 0f, 0f);
        gl.glVertex3f(-0.43f, 0.86f, 0f);
        gl.glVertex3f(0.43f, 0.86f, 0f);
        gl.glVertex3f(0.43f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRONTAL Cuerpo
        gl.glPushMatrix();

        gl.glTranslatef(0f, 1.1f, -1.3f);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.43f, 0f, 0f);
        gl.glVertex3f(-0.43f, 1.8f, 0f);
        gl.glVertex3f(0.43f, 1.8f, 0f);
        gl.glVertex3f(0.43f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPushMatrix();

        gl.glTranslatef(0f, 4.72f, 0.66f);
        gl.glRotatef(-107.5f, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.43f, 0f, 0f);
        gl.glVertex3f(-0.43f, 2.04f, 0f);
        gl.glVertex3f(0.43f, 2.04f, 0f);
        gl.glVertex3f(0.43f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //GRIS*******************************************************************************
        ///CUELLO ABAJO
        gl.glPushMatrix();
        set_grey_material(gl);
        gl.glTranslatef(0f, 2.9f, -1.3f);
        gl.glRotatef(65f, 1, 0, 0);

        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.43f, 0f, 0f);
        gl.glVertex3f(-0.43f, 0.3f, 0f);
        gl.glVertex3f(0.43f, 0.3f, 0f);
        gl.glVertex3f(0.43f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //ATRAS CABEZA
        gl.glPushMatrix();

        gl.glTranslatef(-0f, 4.1f, 1.3f);
        gl.glRotatef(-46, 1, 0, 0);
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.43f, 0f, 0f);
        gl.glVertex3f(-0.43f, 0.92f, 0f);
        gl.glVertex3f(0.43f, 0.92f, 0f);
        gl.glVertex3f(0.43f, 0f, 0f);
        gl.glEnd();
        gl.glPopMatrix();

        //FRENTE CABEZA
        //NEGRO********************************************************************************
        ///CUELLO ARRIBA
        gl.glPushMatrix();
        set_black_material(gl);
        gl.glTranslatef(0f, 3.3f, -1.3f);
        gl.glRotatef(130f, 1, 0, 0);

        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.43f, 0f, 0f);
        gl.glVertex3f(-0.43f, 0.5f, 0f);
        gl.glVertex3f(0.43f, 0.5f, 0f);
        gl.glVertex3f(0.43f, 0f, 0f);
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

        float mat_ambient[] = {0.6f, 0.6f, 0.6f, 0.0f};
        float mat_diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float mat_specular[] = {0.8f, 0.8f, 0.8f, 1.0f};
        float shine = 125.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

    public void set_black_material(GL gl) {

        float mat_ambient[] = {0.0f, 0.0f, 0.0f, 1.0f};
        float mat_diffuse[] = {0.0f, 0.0f, 0.0f, 1.0f};
        float mat_specular[] = {0.0f, 0.0f, 0.0f, 1.0f};
        float shine = 125.2f;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, mat_diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, mat_specular, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

    }

//    public void box(GL gl) {
//        gl.glBegin(GL.GL_POLYGON);/* f1: front */
//        gl.glColor3f(1.0f, 1.0f, 1.0f);
//        gl.glVertex3f(0.0f, 0.0f, 0.0f);
//        gl.glVertex3f(0.0f, 0.0f, 1.0f);
//        gl.glVertex3f(1.0f, 0.0f, 1.0f);
//        gl.glVertex3f(1.0f, 0.0f, 0.0f);
//        gl.glEnd();
//
//        gl.glBegin(GL.GL_POLYGON);/* f2: bottom */
//        gl.glNormal3f(0.0f, 0.0f, -1.0f);
//        gl.glVertex3f(0.0f, 0.0f, 0.0f);
//        gl.glVertex3f(1.0f, 0.0f, 0.0f);
//        gl.glVertex3f(1.0f, 1.0f, 0.0f);
//        gl.glVertex3f(0.0f, 1.0f, 0.0f);
//        gl.glEnd();
//
//        gl.glBegin(GL.GL_POLYGON);/* f3:back */
//        gl.glNormal3f(1.0f, 0.0f, 0.0f);
//        gl.glVertex3f(1.0f, 1.0f, 0.0f);
//        gl.glVertex3f(1.0f, 1.0f, 1.0f);
//        gl.glVertex3f(0.0f, 1.0f, 1.0f);
//        gl.glVertex3f(0.0f, 1.0f, 0.0f);
//        gl.glEnd();
//
//        gl.glBegin(GL.GL_POLYGON);/* f4: top */
//        gl.glNormal3f(0.0f, 0.0f, 1.0f);
//        gl.glVertex3f(1.0f, 1.0f, 1.0f);
//        gl.glVertex3f(1.0f, 0.0f, 1.0f);
//        gl.glVertex3f(0.0f, 0.0f, 1.0f);
//        gl.glVertex3f(0.0f, 1.0f, 1.0f);
//        gl.glEnd();
//
//        gl.glBegin(GL.GL_POLYGON);/* f5: left */
//        gl.glNormal3f(0.0f, 1.0f, 0.0f);
//        gl.glVertex3f(0.0f, 0.0f, 0.0f);
//        gl.glVertex3f(0.0f, 1.0f, 0.0f);
//        gl.glVertex3f(0.0f, 1.0f, 1.0f);
//        gl.glVertex3f(0.0f, 0.0f, 1.0f);
//        gl.glEnd();
//
//        gl.glBegin(GL.GL_POLYGON);/* f6: right */
//        gl.glNormal3f(0.0f, -1.0f, 0.0f);
//        gl.glVertex3f(1.0f, 0.0f, 0.0f);
//        gl.glVertex3f(1.0f, 0.0f, 1.0f);
//        gl.glVertex3f(1.0f, 1.0f, 1.0f);
//        gl.glVertex3f(1.0f, 1.0f, 0.0f);
//        gl.glEnd();
//
//    }
//
//    public void fondo(GL gl, GLU glu, Texture t) {
//        int m = t.getTextureObject();
//        gl.glEnable(GL.GL_TEXTURE_2D);
//        gl.glBindTexture(GL.GL_TEXTURE_2D, m);
//
//        gl.glBegin(GL.GL_QUADS);
//        gl.glTexCoord2d(0.0f, 1.0f);
//        gl.glVertex3d(-6.0f, -6.0f, -6.0f);
//
//        gl.glTexCoord2d(1.0f, 1.0f);
//        gl.glVertex3d(6.0f, -6.0f, -6.0f);
//
//        gl.glTexCoord2d(1.0f, 0.0f);
//        gl.glVertex3d(6.0f, 6.0f, -6.0f);
//
//        gl.glTexCoord2d(0.0f, 0.0f);
//        gl.glVertex3d(-6.0f, 6.0f, -6.0f);
//
//        gl.glEnd();
//        gl.glFlush();
//        gl.glDisable(GL.GL_TEXTURE_2D);
//
//    }

}

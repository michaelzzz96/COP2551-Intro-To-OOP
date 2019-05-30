/* Michael Zulfekar
 * COP 2551 Introduction to OO Programming
 * 5/25/18
 */


//*********************************************************
// PieChart.java
// Draws a pie chart showing percentage of household income
// spent on various expenses.
//*********************************************************


//*********************************************************
// PieChart.java
// Draws a pie chart showing percentage of household income
// spent on various expenses.
//*********************************************************

import javax.swing.JApplet;
import java.awt.*;

public class PieChart extends JApplet
{
    public void paint (Graphics page)
    {
   // Variable Declaration
   final int DEGREES_IN_CIRCLE = 360;
   final int APPLET_WIDTH = 600;
   final int APPLET_HEIGHT = 400;

   int x, y;          // corner point for the pie chart
   int diameter;      // diameter of the pie chart
   int startAngle;    // starting angle for a pie slice
   int arcAngle;      // arc angle for a pie slice

   diameter = 200;
   x = (APPLET_WIDTH - diameter)/2;
   y = (APPLET_HEIGHT - diameter)/2;

   setBackground (Color.white);

   // Draw rent and utilities slice
       //Write code here
   page.setColor(Color.blue);
   page.fillArc(x,y,APPLET_WIDTH,APPLET_HEIGHT,DEGREES_IN_CIRCLE-DEGREES_IN_CIRCLE,DEGREES_IN_CIRCLE- 240);
   page.drawString("Rent and Utilities (35%)",675,128);
   // Draw transportation slice
      //Write code here
   page.setColor(Color.green);
   page.fillArc(x,y,APPLET_WIDTH,APPLET_HEIGHT,DEGREES_IN_CIRCLE-180,DEGREES_IN_CIRCLE-420);
   page.drawString("Transportation (15%)",78,197);
   // Draw food slice
       //Write code here
   page.setColor(Color.cyan);
   page.fillArc(x,y,APPLET_WIDTH,APPLET_HEIGHT,DEGREES_IN_CIRCLE - 110,DEGREES_IN_CIRCLE - 430);
   page.drawString("Food (15%)",105,430);
   // Draw educational slice
       //Write code here
   page.setColor(Color.red);
   page.fillArc(x,y,APPLET_WIDTH,APPLET_HEIGHT,DEGREES_IN_CIRCLE - 120, DEGREES_IN_CIRCLE - 280);
   page.drawString("Educational (25%)",500,550);
   // Draw miscellaneous slice
       //Write code here
   page.setColor(Color.orange);
   page.fillArc(x,y,APPLET_WIDTH,APPLET_HEIGHT,DEGREES_IN_CIRCLE - 40 , DEGREES_IN_CIRCLE -320);
   page.drawString("Miscellaneous (10%)",835,389);
    }
}




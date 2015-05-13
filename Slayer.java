import objectdraw.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Slayer 
{
	
	
	private void adjustSaturation() 
	{
        for (int col = 0; col < transformed.length; col++ ) 
        {
                for (int row = 0; row < transformed[col].length; row++ ) 
                {
                        
                        transformed[col][row] = 
                                grayscalePixel( sourcePixels[col][row] );
                }
        }
	}
	
	private  Color grayscalePixel(Color c ) 
	{
        int red = c.getRed();
        int green = c.getGreen();
        int blue = c.getBlue();
        
        int brightness = (int) ( 255*Math.sqrt(red*red + green*green + blue*blue)/
                                                 MAXBRIGHTNESS
                                               );
        
        return new Color( brightness , brightness, brightness, c.getAlpha());
	}
}

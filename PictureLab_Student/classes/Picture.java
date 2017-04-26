import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;


public class Picture extends SimplePicture 
{
  public Picture ()
  {
    super();  
  }
  
  public Picture(String fileName)
  {
    super(fileName);
  }
  
  public Picture(int height, int width)
  {
    super(width,height);
  }
  
  public Picture(Picture copyPicture)
  {
    super(copyPicture);
  }
  
  public Picture(BufferedImage image)
  {
    super(image);
  }
  

  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  public void zeroBlue()
  {
    Pixel[][] pixs = this.getPixels2D();
    for (Pixel[] rowArray : pixs)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void mirrorH()
  {
    Pixel[][] pixs = this.getPixels2D();
    Pixel leftPix = null;
    Pixel rightPix = null;
    int width = pixs[0].length;
    for (int row = 0; row < pixs.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPix = pixs[row][col];
        rightPix = pixs[row][width - 1 - col];
        rightPix.setColor(leftPix.getColor());
      }
    } 
  }
  
  public void mirrorV()
  {
    Pixel[][] pixs = this.getPixels2D();
    Pixel topPix = null;
    Pixel botPix = null;
    int width = pixs[0].length;
    for (int row = 0; row < pixs.length/2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPix = pixs[row][col];
        botPix = pixs[pixs.length - 1 - row][col];
        botPix.setColor(topPix.getColor());
      }
    } 
  }
  
  public void mirrorD()
  {
    Pixel[][] pixs = this.getPixels2D();
    Pixel topPix = null;
    Pixel botPix = null;
    int width = pixs[0].length;
    for (int row = 0; row < pixs.length; row++)
    {
      for (int col = 0; col < width; col++)
      {
        if(col < width)
		{
			topPix = pixs[row][col];
			botPix = pixs[col][row];
			topPix.setColor(botPix.getColor());
		}
      }
    } 
  }
  
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < toPixels.length; fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  public void createCollage()
  {
    Picture f1 = new Picture("flower1.jpg");
    Picture f2 = new Picture("flower2.jpg");
    this.copy(f1,0,0);
    this.copy(f2,100,0);
    this.copy(f1,200,0);
    Picture flowerNoBlue = new Picture(f2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(f1,400,0);
    this.copy(f2,500,0);
    this.mirrorH();
    this.write("collage.jpg");
  }
  
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPix = null;
    Pixel rightPix = null;
    Pixel[][] pixs = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixs.length; row++)
    {
      for (int col = 0; col < pixs[0].length-1; col++)
      {
        leftPix = pixs[row][col];
        rightPix = pixs[row][col+1];
        rightColor = rightPix.getColor();
        if (leftPix.colorDistance(rightColor) > edgeDist)
		{
			leftPix.setColor(Color.BLACK);
		}
        else
		{
			leftPix.setColor(Color.WHITE);
		}
      }
    }
  }
  
  public void keepOnlyBlue()
  {
    Pixel[][] pixs = this.getPixels2D();
    for (Pixel[] rowArray : pixs)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
		pixelObj.setGreen(0);
      }
    }
  }

  public void negate()
  {
    Pixel[][] pixs = this.getPixels2D();
    for (Pixel[] rowArray : pixs)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
		pixelObj.setGreen(255 - pixelObj.getGreen());
		pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }
  
  public void grayscale()
  {
    Pixel[][] pixs = this.getPixels2D();
	int avg = 0;
    for (Pixel[] rowArray : pixs)
    {
      for (Pixel pixelObj : rowArray)
      {
		avg = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3;
        pixelObj.setRed(avg);
		pixelObj.setGreen(avg);
		pixelObj.setBlue(avg);
      }
    }
  }
  
  public void FixUnderwater()
  {
    Pixel[][] pixs = this.getPixels2D();
    for (Pixel[] rowArray : pixs)
    {
      for (Pixel pixelObj : rowArray)
      {
		if(pixelObj.getBlue() > 160 && pixelObj.getGreen() < 175)
		{
			pixelObj.setRed(88);
			pixelObj.setGreen(92);
			pixelObj.setBlue(157);
		}
      }
    }
  }
  
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
	Picture ny = new Picture("NewYork.jpg");
	Picture smallNY = ny.scale(0.25, 0.25);
	smallNY.write("smallNY.jpg");
  }
}
  
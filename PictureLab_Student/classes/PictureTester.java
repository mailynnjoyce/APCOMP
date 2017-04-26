public class PictureTester
{
  public static void testZeroBlue()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.zeroBlue();
    jenny.explore();
  }
  
  public static void testMirrorH()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.mirrorH();
    jenny.explore();
  }
  
  public static void testMirrorV()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.mirrorV();
    jenny.explore();
  }
  
  public static void testMirrorD()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.mirrorD();
    jenny.explore();
  }
  
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
 
  public static void testEdgeDetection()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.edgeDetection(10);
    jenny.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.keepOnlyBlue();
    jenny.explore();
  }
  
  public static void testNegate()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.negate();
    jenny.explore();
  }
  
  public static void testGrayscale()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.grayscale();
    jenny.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture f = new Picture("water.jpg");
    f.FixUnderwater();
    f.explore();
  }
  
  public static void main(String[] args)
  {
    testZeroBlue();
    testKeepOnlyBlue();
    testNegate();
    testGrayscale();
    testMirrorH();
	testMirrorV();
	testMirrorD();
    testEdgeDetection();
	Picture jenny = new Picture("jenny-red.jpg");
    jenny.explore();
	testCollage();
	testFixUnderwater();
  }
}
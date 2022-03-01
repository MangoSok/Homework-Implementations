/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
      Picture robot = new Picture("robot.jpg");
      robot.explore();
      robot.keepOnlyBlue();
      robot.explore();
  }
  
   public static void testNegate()
   {
      Picture robot = new Picture("robot.jpg");
      robot.explore();
      robot.negate();
      robot.explore();
   }
   
   public static void testGrayscale()
   {
      Picture robot = new Picture("robot.jpg");
      robot.explore();
      robot.grayscale();
      robot.explore();
   }
   
   public static void testFixUnderWater()
   {
      Picture robot = new Picture("water.jpg");
      robot.explore();
      robot.fixUnderWater();
      robot.explore();
   }

   public static void testRightHalfGreen()
   {
      Picture robot = new Picture("robot.jpg");
      robot.explore();
      robot.rightHalfGreen();
      robot.explore();
   }
   
   public static void testMirrorVerticalRightToLeft()
   {
      Picture robot = new Picture("redMotorcycle.jpg");
      robot.explore();
      robot.mirrorVerticalRightToLeft();
      robot.explore();

   }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
   public static void testMirrorHorizontal()
   {
      Picture robot = new Picture("redMotorcycle.jpg");
      robot.explore();
      robot.mirrorHorizontal();
      robot.explore();
   }
  
   public static void testMirrorHorizontalBotToTop()
   {
      Picture robot = new Picture("redMotorcycle.jpg");
      robot.explore();
      robot.mirrorHorizontalBotToTop();
      robot.explore();
   }
   
   public static void testMirrorDiagonal()
   {
     Picture beach = new Picture("beach.jpg");
     beach.explore();
     beach.mirrorDiagonal();
     beach.explore();
   }


  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
   public static void testMirrorArms()
   {
      Picture snow = new Picture("snowman.jpg");
      snow.explore();
   }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void exploreWater()
  {
    Picture swan = new Picture("water.jpg");
    swan.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testRight
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderWater();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //exploreWater();
  }
}
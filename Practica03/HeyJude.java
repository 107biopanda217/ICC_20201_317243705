public class HeyJude{
    public static String HEY = "Hey Jude ";
    public static String DON = "don't ";
    public static String MAK = "make it bad.";
    public static String BEA = "be afraid.";
    public static String LET = "let me down.";
    public static String TAK = "Take a sad song and make it better.";
    public static String YOW = "You were made to go out and get her.";
    public static String YOH = "You have found her, now go and get her.";
    public static String REM = "Remember to ";
    public static String LEH = "let her into you heart.";
    public static String LES = "let her into your skin.";
    public static String THE = "Then you ";
    public static String CAN = "can start ";
    public static String BEG = "begin ";
    public static String TOM = "to make it better ";
    public static String BET = "better ";
    public static String NA  = "na ";

    public static String AND = "And anytime you feel the pain, hey Jude, refrain,\n"
	                            + "Don’t carry the world upon your shoulders.\n"
                                    + "For well you know that it’s a fool who plays it cool\n"
	                            + "By making his world a little colder.";

    public static String SOL = "So let it out and let it in, hey Jude, begin,\n"
	                            + "You’re waiting for someone to perform with.\n"
	                            + "And don’t you know that it’s just you, hey jude, you’ll do,\n"
	                            + "The movement you need is on your shoulder.";

    public static void main(String[] args)
    {
     int dont=1;
     int x=0;
     int rem=1;
     int the=1;
     int tom=1;
     for(x=0;x<12;x++)
     {
      System.out.println("\n" + HEY);
      if (dont<4)
      {
       switch (dont)
       {
        case 1:
              System.out.println(DON+MAK+TAK);
              dont=2;
	      break;
        case 2:
              System.out.println(DON+BEA+YOW);
              dont=3;
	      break;
        case 3:
              System.out.println(DON+LET+YOH);
              dont=1;
	      break;
       }
      }
      System.out.println(REM);
      if (rem<3)
      {
       switch (rem)
       {
        case 1:
              System.out.println(LEH);
              rem=2;
	      break;
        case 2:
              System.out.println(LES);
              rem=1;
	      break;
       }
      } 
       System.out.println(THE);
       if (the<3)
      {
       switch (the)
       {
        case 1:
              System.out.println(CAN);
              the=2;
	      break;
        case 2:
              System.out.println(BEG);
              the=1;
	      break;
       }
      }
      System.out.println(TOM);
      while (tom<5)
      {
       System.out.println(BET);
       tom++;
      }
      tom=0;
      System.out.println("waaaaa");
      System.out.println(NA);
     }
    }
}
        


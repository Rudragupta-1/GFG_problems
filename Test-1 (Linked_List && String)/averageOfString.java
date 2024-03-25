
  public static int avgOfString(String s)
  {
     int sum=0;
     for(int i=0;i<s.length();i++)
     {
         sum+=(int)s.charAt(i);
     }
     return sum/s.length();
  }


class solve{
    
  //Function to generate binary numbers from 1 to N using a queue.
  static ArrayList<String> generate(int n)
  {
      ArrayList<String> list=new ArrayList<>();
      for(int x=1;x<=n;x++)
      {
          int num=x;
          StringBuilder binary=new StringBuilder();
          while(num>0)
          {
              int rem=num%2;
              binary.insert(0,rem); //prepending of digits
              num/=2;
          }
          list.add(binary.toString());
      }
      return list;
  }
}
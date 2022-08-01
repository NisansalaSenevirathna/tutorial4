object q1 extends App{

  def interest(amount:Double):Double = amount match{
         
         case x if x<=20000 =>x*.02;
         case x if x<=200000=>x*.04;
         case x if x<=2000000=>x*.035;
         case x if x>2000000=>x*.065;
  }

  printf("amount of interest=%.2f",interest(10000));

}
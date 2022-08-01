object q1 extends App{

  def interest(amount:Double):Double = amount match{
         
         case x if x<=20000 =>x*.02;
         case x if x>=200000=>x*.04;
         case x if x>=2000000=>x*.035;
         case x if x>20000000=>x*.065;
  }
     
  
   print("The deposited amount : ")
   var deposit =scala.io.StdIn.readInt()
   printf("The actual amount of interest that the money earns in a year %.2f",interest(deposit))



}

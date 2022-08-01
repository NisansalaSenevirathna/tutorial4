object q2 extends App{

  def PatternMatching(input:Int):String = input match{

    case x if x<=0 =>"Negative/Zero"
    case x if x%2==0 =>"even"
    case x if x%2==1 =>"odd"



  }

    print("Enter  a number : ")
    var name = scala.io.StdIn.readInt()
    printf("%s",PatternMatching(name))

           
}


object q3 extends App{
   
  def toUpper(input:String):String={
    input.toUpperCase();
  }

  def toLower(input:String):String ={
    input.toLowerCase();
  }

  def formatNames(name : String)(func:String =>String):String ={
    func(name);
  }

  println(formatNames("Benny")(toUpper(_)))
  println(formatNames("Niroshan".substring(0,2))(toUpper(_))+formatNames("Niroshan".substring(2))(toLower(_)))
  println(formatNames("Saman")(toLower(_)))
  println(formatNames("kumara".substring(0,5))(toLower(_))+formatNames("kumara".substring(5))(toUpper(_)))
  

}

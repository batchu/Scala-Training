/**
  * Created by i1551 on 2/15/2017.
  */
object Main {

  def main(args: Array[String]){
    println(1)

    val list: List[Any] = List(
      "hello",
      1000,
      true,
      'a',
      () => "This is in an anonymous function"
    )

    list.foreach(ele => println(ele))

    val point=  new Point(1,2)
    point.move(3,4)
   println(point)
  }





}

class Point(var x: Int, var y: Int){

  def move (dx: Int, dy: Int): Unit = {
    x= x+dx
    y=y+dy
  }

  override def toString: String =   "(" + x + ", " + y + ")"
}

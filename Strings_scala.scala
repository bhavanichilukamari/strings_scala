class StringExample{
  var s1 = "Scala string example"
  var s2 = "Scala string example"
  var s3 = "Hello Scala"
  var pi = 3.14 // string interpolation
  var version = 2.12
  var s5 = "Scala \tstring \nexample" // string interpolation using raw method
  def show(){
    println(s1)
    println(s1.substring(7,11))
    println(s1.split(" ").toList)
    println(s1 == s2)
    println(s"value of pi = $pi")
    println(f"This is $s1%s, scala version is $version%2.2f")
    println(s5)

  }
}

object Strings_scala extends App {
   var obj = new StringExample
  obj.show()

}

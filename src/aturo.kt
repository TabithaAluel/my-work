fun main() {
    myName()
    bf()
    sentence("Tabby", 28)
    jina()
}
fun myName() {
    val name = "Aluel"
    println(name)
}
fun bf() {
    var nam= "Jungle"
    println(nam[0])
    println(nam[1])
}
fun sentence(name:String, age:Int) {
    val intro=( "Hello, my name is $name and am $age years old")
     println(intro)

}
fun jina() {
    val name= "Tabitha"
    println(name.length)

}
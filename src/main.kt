
data class Players(val name: String, val age:Int, val height :Double)
  fun main(){
    //Function
    fun getAdviceFun(){
        println("you can do it")
    }
    getAdviceFun()
    //Lambda
    val getAdvice = { println("If you fall seven, get up eight") }
    getAdvice()

    // two functions that take in one or more parameters
    //Function
    fun greetingFun( name: String ) : String{
        println("Hello $name!")
        return name
    }
    greetingFun("Munira")

    //Lambda
    val greeting = {name:String -> println("Hi $name!")}
    greeting("Munira Almalki")

    //two functions that return a value
    //Function
    fun sumFun(x : Int, y : Int) : Int{
        var result = x + y
        println(result)
        return result
    }
    sumFun(3,2)

    //Lambda
    val sum = {x: Int,y: Int -> x+y }
    println(sum(6,9))


    val   players = listOf(
        Players("Munira",25,165.0),
        Players("Khalid",30,173.0),
        Players("Mohammed",29,165.0),
        Players("Abdullah",22,166.0),
        Players("Saad",25,165.0),
        Players("Sara",33,170.0),
        Players("Ahmed",29,165.0),
        Players("Riyan",23,177.0),
        Players("Alhanouf",25,169.0),
        Players("Marwa",26,180.0),
        Players("Liala",25,165.0),
        Players("Afnan",27,161.0),
        Players("Aziz",31,165.0),
        Players("Anas",25,175.0),
        Players("Amal",21,177.0),
        Players("Rakan",32,162.0),
        Players("Malk",28,166.0),
        Players("Sultan",25,180.0),
        Players("Noura",30,171.0),
        Players("Rahaf",34,170.0)
    )
      // Lambda
    val highestMan  = players.maxByOrNull { it.height }
    println("The Highest Man is : ${highestMan!!.name} ")

    val olderMan = players.find {
        it.age >= 30
    }
    println("The older man is: ${olderMan!!.name} his age: ${olderMan!!.age}")

    val highestMen = players.filter {
        it.height >= 170.0
    }
    println("The tallest Men:")
    highestMen.forEach{
        println(it.name)
    }
}


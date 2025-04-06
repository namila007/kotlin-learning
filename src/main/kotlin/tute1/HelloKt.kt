package tute1

fun add(a:Int,b:Int):Int = a+b;

@JvmOverloads
fun loopPrint(char: Char = '*', count:Int=5){
    repeat(count){
        print(char)
    }
    println();
}


fun main(args: Array<String>) {
    val name =if(args.size>0)args[0] else "kotlin";
    println("Hello $name")

    val list = listOf(1,2,3,4,5);
    println(list.joinToString(separator = "//", prefix = "(", postfix = ")"));

    loopPrint('a',2)
    loopPrint(count=4)

    println(if(1>2)2 else 1)
    println( response("kotlin"))

    println(mix(1,2))

    println(getPet( cat()))

    iterateMap()
    iterateList()
    print("ball" in "a".."k")

    println("assignment")
    assignment()
}


fun isValidIdentifier(name: String): Boolean {
    if(name.isEmpty()||name[0].isDigit()) return false
    var isValid =true;
    for (ch in name){
       isValid = isValid&& (ch == '_' || ch.isLetterOrDigit())
    }
    return isValid;
}
fun assignment(){
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

fun response(input:String) = when(input){
    "kotlin" -> "Hello Kotlin"
    "java" -> "Hello Java"
    else -> "Hello"
}

fun mix(c1:Int, c2:Int):Int=when(setOf(c1,c2)){
    setOf(1,2) -> 1
    else -> 2
}

fun getPet(pType: pet) = when(pType){
    is cat -> pType.meow();
    is dog -> pType.bark();
    else -> println("unknown pet")
}

fun iterateMap() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for ((key, value) in map) {
        println("$key -> $value")
    }
}

fun iterateList() {
    val list = listOf("one", "two", "three")
    for ((index,item   ) in list.withIndex()) {
        println("$index: $item")
    }
}


open class pet{}

class cat :pet() {
    fun meow() = println("meow")
}
class dog :pet() {
    fun bark() = println("bark")
}


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
}

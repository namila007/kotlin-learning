package tute1


fun main(args: Array<String>) {
    val name =if(args.size>0)args[0] else "kotlin";
    println("Hello $name")
}

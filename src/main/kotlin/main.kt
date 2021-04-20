fun main() {
//    println("""\    /\""")
//    println(""" )  ( ')""")
//    println("""(  /  )""")
//    println(""" \(__)|""")


//    println("""|\_/|""")
//    println("""|q p|   /}""")
//    println("""( 0 )${"\"\"\""}\""")
//    println("""|"^"`    |""")
//    println("""||_/=\\__|""")

//    val a = readLine()!!.split(" ").map { it.toInt() }
//    print(a.sum())

//    val a = readLine()!!.split(" ").map { it.toDouble() }
//    print(a[0] / a[1])

    println("==프로그램 시작==")
    print("숫자(띄어쓰기로 구분) : ")
    val arr = readLine()!!.split(" ").map{it.toInt()}.toMutableList()

    for(i in arr.indices){
        for(x in arr.indices){
            if(arr[i] < arr[x]){
                val y = arr[x]
                arr[x] = arr[i]
                arr[i] = y
            }
        }
    }
    println("오름차순 출력 : ")
    for(i in arr){
        print(i)
    }
    println(" ")
    for(i in arr.indices){
        for(x in arr.indices){
            if(arr[i] > arr[x]){
                val y = arr[x]
                arr[x] = arr[i]
                arr[i] = y
            }
        }
    }
    println("내림차순 출력 : ")
    for(i in arr){
        print(i)
    }


//    println("오름차순 정렬 결과 : ${arr.sorted()}")
//    println("내림차순 정렬 결과 : ${arr.sortedDescending()}")
    print("==프로그램 끝==")

    val numbers = readLine()!!.split(" ").map{it.toInt()}.toMutableList()
}

fun printNumbers(numbers : MutableList<Int>){

}

fun bubbleSort(numbers : MutableList<Int>){
    var maxDepth = numbers.size - 2

    var raiseCount = 0

    for (depth in maxDepth downTo 0){
        for (i in 0 until depth){

        }
    }
}
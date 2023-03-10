import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()
{
    try {
        var student = Student_itog("Иван", "Скворцов", "Сергеевич", "мужской",22,"28.03.2005",189.0,79.0,"футбол")
        student.input()
        print("Сколько раз хотите вывести функцию: ")
        var count = readLine()!!.toInt()
        if (count>0)
        {
            count = count -1
            for (i in 0..count)
            {
                GlobalScope.launch {
                    delay(5000L)
                    println(student.Voidforglav())
                }
            }
            println(student.Voidforsport())
            runBlocking { delay(10000L) }
        }
        else{
            println("Число не может быть равно 0 или меньше")
        }
    }catch (e:Exception){
        println("Неверный ввод")
    }

}
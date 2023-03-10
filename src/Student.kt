import java.util.*

abstract class Student(val name: String, val surname: String,  val otchestvo: String,val pol: String, val group: Int, val datar: String, val rost:Double, val ves: Double ,val vidsporta: String) :Interface{
    override fun input()
    {
        println("Имя студента - $name")
        println("Фамилия студента - $surname")
        println("Отчество студента - $otchestvo")
        println("Пол стуента - $pol")
        println("Группа студента - $group")
        println("Дата рождения студента- $datar")
        println("Рост студента- $rost")
        println("Вес студента - $ves")
        println("Вид спорта студента- $vidsporta")
    }


}
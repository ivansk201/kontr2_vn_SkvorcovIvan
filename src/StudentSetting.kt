class Student_itog(val empname: String, val empsurname: String,  val empotchestvo: String,val emppol: String, val empgroup: Int, val empdatar: String, val emprost:Double, val empves: Double ,val empvidsporta: String):Student(empname,empsurname,empotchestvo,emppol,empgroup, empdatar, emprost, empves, empvidsporta) {

    fun Voidforsport()
    {
        try {
            print("Введите вид спорта который будет основным в группе: ")
            val sports= readLine()!!.toString()
            println("Любимым видом спорта будет - ${sports}")
        }catch (e:Exception)
        {
            println("Неверный ввод")
        }
    }


    fun Voidforglav()
    {
        try {
          print("Введите кто будет старостой в группе: ")
              val starostagroup= readLine()!!.toString()
            println("Староста группы будет $starostagroup")
        }catch (e:Exception)
        {
            println("Неверный ввод")
        }

    }




}
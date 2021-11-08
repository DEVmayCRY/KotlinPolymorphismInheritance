class SalesManager (firstName: String,
                lastName: String, registration: Int,
                age: Int, daysWorked: Int, vacationDaysTaken: Int,
                salary: Double, yearsWorked: Int) :
    Employee(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked){


    val colabSeller = hashMapOf<Int, SalesRep>()

    fun addRepSales(SalesRep: SalesRep){

        colabSeller.put(SalesRep.registration, SalesRep)

    }

    fun calculateComission() {
        // 0.03 * all sales made by team
        var numSell = 0.0
        if(colabSeller.isEmpty()){
            println("Nenhum funcionário encontrado na lista.")
        }else{
            for (i in colabSeller){
                numSell += i.value.salesMade
            }
        val comission = 0.03*numSell
        println("Comissão total da equipe é $comission")
        }
    }
}
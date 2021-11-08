class SalesRep (firstName: String,
            lastName: String, registration: Int,
            age: Int, daysWorked: Int, vacationDaysTaken: Int,
            salary: Double, yearsWorked: Int, var salesMade: Int) :
    Employee(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked){

    var emploSales = arrayListOf(salesMade)

    fun calculateComission(): Double {
        return 0.1 * salesMade
    }

    fun totalSalesMade() {
        for (i in emploSales){
            var totalSales = 0.0
            val calcSales = emploSales[i.toInt()]
            totalSales += calcSales
        }
    }
}

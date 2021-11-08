fun main(args: Array<String>) {
    //depoi eu ponho
    val mary = SalesRep("Mary", "Cabloz", 313, 29, 365,
    0, 3000.00, 1, 5)
    val luca = SalesRep("Luca", "Kate", 314, 40, 700,
        30, 5000.00, 2, 20)
    val robert = SalesRep("Robert", "Xakabon", 315, 20, 40,
        0, 2000.00, 0, 2)
    val rafael = SalesRep("Rafael", "Silva", 665, 45, 1032,
        0, 7000.00, 3, 19)
    val nadia = SalesRep("Nadia", "Isnaik", 316, 29, 365,
        0, 3000.00, 1, 5)


    println("Informações Mary")
    println(mary.timeToRetirement())
    println(mary.vacationTimeLeft())
    println(mary.calculateBonus())
    println(mary.calculateComission())
    println(mary.totalSalesMade())
    println("===========")

    nadia.addRepSales(mary)
    nadia.addRepSales(robert)
    nadia.addRepSales(rafael)

    println("comissão da equipe toda")
    nadia.calculateComission()





}
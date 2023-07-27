/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {    
    println(closestDriver(rider).name)
}

data class Driver(
    val name: String,
    val xPos: Double,
    val yPos: Double
)

data class Rider(
    val name: String,
    val rideCount: Int,
    val averageRating: Double,
    val xPos: Double,
    val yPos: Double
)

// Hint: accessing a property of a data class is as simple as using exampleRider.name to retrieve the String value


val rider = Rider(
    "Pam",
    2,
    4.5,
    41.4241265,
    -75.6696665
)


val driverDatabase = listOf(
    Driver("Michael", 41.441692237165604, -75.74063210378645),
    Driver("Kevin", 41.34579708449845, -75.64069789999186),
    Driver("Dwight", 41.4420651,-75.6374736),
    Driver("Creed", 41.406597,-75.6540727),
    Driver("Jim", 41.418185,-75.6257407)
)


fun closestDriver(rider: Rider): Driver {
    var closestDistance = 9999999999999999999.0
    var closestDriver = driverDatabase[0]
	
	driverDatabase.forEach { driver -> 
    //formula for calculating distance
        val distance = Math.sqrt((rider.xPos - driver.xPos) * (rider.xPos - driver.xPos) + (rider.yPos - driver.yPos) * (rider.yPos - driver.yPos))
        if (distance < closestDistance) {
            closestDistance = distance
            closestDriver = driver
        }
    }
    //return name of closest driver
    return closestDriver
}
    


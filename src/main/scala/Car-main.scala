val selectAction = """
1 - Accelerate
2 - Apply breaks
3 - Turn off the car
"""

def accelerate() = println("Accelerating")
def break() = println("Breaking")

@main def driveCar(): Unit = {
    var isStarted = true
    while(isStarted){
        println(selectAction)
        val input = scala.io.StdIn.readInt()
        input match{
            case 1 => accelerate()
            case 2 => break()
            case 3 => isStarted = false
        }
    }
}


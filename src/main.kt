fun main(args : Array<String>) {
    val list = arrayListOf<Int>()

    for (x in 1 until 101) {
        list.add(x)
    }

    var guessed = false

    var numToGuess = -1

    var stringInput : String

    while (!guessed)
    {
        if (numToGuess == -1)
        {
            numToGuess = list.random()
        }

        print("Pick a number between 1 and 100:   ")

        stringInput = readLine()!!


        if (stringInput.toInt() == numToGuess)
        {
            print("Corret! Play again? [y/n]:   ")

            stringInput = readLine()!!

            if (stringInput.equals("y"))
            {
                numToGuess = -1
            }
            else
            {
                guessed = true
            }
        }
        else if (stringInput.toInt() > numToGuess)
        {
            println("Too high! Try again!")
        }

        else if (stringInput.toInt() < numToGuess)
        {
            println("Too low! Try again!")
        }
    }

}
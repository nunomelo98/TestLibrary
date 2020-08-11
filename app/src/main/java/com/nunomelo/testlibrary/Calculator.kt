package com.nunomelo.testlibrary



object Calculator {
    ///////////

    fun Plus(  a : Int,  b : Int) : Int{

        return a + b
    }

    fun Minus(  a : Int,  b : Int) : Int{

        return a - b
    }

    fun Times(  a : Int,  b : Int) : Int{

        return a * b
    }

    fun Dev(  a : Int,  b : Int) : Float {

        return if (b == 0) {
            throw IllegalArgumentException("Div by Zero Error!")
        } else {
            (a / b).toFloat()

        }
    }

}
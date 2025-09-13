package com.example.tarea

class AnalizadorCalificaciones{
    public var calificaciones: MutableList<Float> = mutableListOf()

    fun TraerDatos(){
        for (i in 1..7){
            println("Catura tu calificacion " + i )
            var x = readln().toFloat()
            calificaciones.add(x)
        }
    }

    fun CalcularPromedio(): Double {
        return calificaciones.average()

    }

    fun MateriasAprobadas(): Int {
        //return calificaciones.filter { it >= 7 }.size
        return  calificaciones.count{ it >= 7 }
    }

    fun MateriasReprobadas(): Int {
        //return calificaciones.filter { it < 7 }.size
        return calificaciones.count { it < 7 }
    }

    fun CalificacionMaxima(): Float{
        return calificaciones.max()
    }

    fun CalificacionMinima(): Float{
        return calificaciones.min()
    }

}
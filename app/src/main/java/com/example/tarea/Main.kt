package com.example.tarea
fun main(){

    print("Tarea calificaciones")
    var Calificacion = AnalizadorCalificaciones()
    Calificacion.TraerDatos()
    println()
    var promedio = Calificacion.CalcularPromedio()
    println("Tu Promedio es de " + promedio)
    println()
    var materias = Calificacion.MateriasAprobadas()
    println("Materias aprobadas " + materias)
    println()
    println("Materias Reprobadas " + Calificacion.MateriasReprobadas())
    println()
    println("Calificacion Maxima " + Calificacion.CalificacionMaxima())
    println()
    println("Calificacion Minime " + Calificacion.CalificacionMinima())
    println()
    println("Materias totales " + Calificacion.calificaciones.size)

}

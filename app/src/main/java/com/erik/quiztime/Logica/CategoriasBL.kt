package com.erik.quiztime.Logica

import com.erik.quiztime.CasoUso.CategoriasCasoUso
import com.erik.quiztime.Entidades.Categorias

class CategoriasBL {
fun getCategoryList(): List<Categorias>{
    return CategoriasCasoUso().getAllCategories()

}
}
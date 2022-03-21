package com.erik.quiztime.Controladores

import com.erik.quiztime.Entidades.Categorias
import com.erik.quiztime.Logica.CategoriasBL

class CategoriasController {
    fun getAllCategories(): List<Categorias>{
        return CategoriasBL().getCategoryList()
    }
}
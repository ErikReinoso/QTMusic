package com.erik.quiztime.Presentacion

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.erik.quiztime.Controladores.CategoryAdapter
import com.erik.quiztime.Entidades.Categorias
import com.erik.quiztime.Logica.CategoriasBL
import com.erik.quiztime.R
import com.erik.quiztime.databinding.FragmentListarBinding


class ListarFragment : Fragment() {
    private lateinit var binding: FragmentListarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListarBinding.inflate(inflater,container,false)
        loadListNews(CategoriasBL().getCategoryList())

        return binding.root

    }
    fun loadListNews (items:List<Categorias>){
        binding.recyclerView.layoutManager = LinearLayoutManager(binding.recyclerView.context)
        binding.recyclerView.adapter = CategoryAdapter(items) { getCategoryItem(it)}

        }
    }
    fun getCategoryItem(categ: Categorias){
  //  var intent = Intent(binding.recyclerView.context, PreguntasActivity::class.java)
      //  PreguntasActivity(intent)
    }


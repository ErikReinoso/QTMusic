package com.erik.quiztime.Presentacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.erik.quiztime.R
import com.erik.quiztime.databinding.ActivityCategoriasBinding


class CategoriasActivity : AppCompatActivity() {
   private lateinit var binding: ActivityCategoriasBinding
    //val textView = findViewById<TextView>(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)
        binding = ActivityCategoriasBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.bottomNavigation.setOnItemSelectedListener{ item ->
            when(item.itemId){
                R.id.itLista->{

                createFragment(ListarFragment())
                    true
                }
                R.id.itAleatorio->{
                    createFragment(AleaFragment())
                    true
                }
                else -> false
            }
        }

    }



    private fun createFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(binding.constraintLayout1.id,fragment)
            addToBackStack(null)
        }.commit()
}
  /**  var lst= listOf<Int>(1,2,3,4,5,6,7)
    fun renderList(){
        lst.filter{
            it>4
        }
    }
    fun filtro(lst:ArrayList<Int>){

    }**/

}
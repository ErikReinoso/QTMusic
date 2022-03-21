package com.erik.quiztime.Controladores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.erik.quiztime.Entidades.Categorias
import com.erik.quiztime.R
import com.erik.quiztime.databinding.CategoryListBinding
import com.squareup.picasso.Picasso

class CategoryAdapter (val categoryItemList : List<Categorias>, val onClickItemSelected:(Categorias)->Unit) : RecyclerView.Adapter<CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.category_list,parent,false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val item = categoryItemList[position]
        holder.render(item, onClickItemSelected)
    }

    override fun getItemCount(): Int = categoryItemList.size
}

class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  private  val binding = CategoryListBinding.bind(itemView)

    fun render (itemView: Categorias, onClickItemSelected: (Categorias) -> Unit){
        binding.txtCategoria.text=itemView.nombre
        binding.txtDescripcion.text=itemView.descripcion
        Picasso.get().load(itemView.imagen).into(binding.imgCategoria)

  /**      itemView.setOnClicListener{
            onClickItemSelected(itemView)

        }**/
    }

}

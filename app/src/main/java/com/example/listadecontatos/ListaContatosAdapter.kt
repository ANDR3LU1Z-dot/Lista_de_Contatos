package com.example.listadecontatos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadecontatos.databinding.ItemListaBinding

class ListaContatosAdapter(val listItems: MutableList<ContactInfo>, val listener: ListAdapterListener): RecyclerView.Adapter<ListaContatosAdapter.ContatosViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatosViewHolder {
        return ContatosViewHolder(ItemListaBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ContatosViewHolder, position: Int) {
        val item = listItems[position]
        holder.tvName.text = item.name
        holder.tvPhone.text = item.phone

        holder.view.setOnClickListener{
            listener.onItemClicked(item.name)
        }
    }

    override fun getItemCount(): Int = listItems.size

    inner class ContatosViewHolder(binding: ItemListaBinding): RecyclerView.ViewHolder(binding.root){
            val view = binding.root
            val tvName = binding.name
            val tvPhone = binding.phone
    }


    interface ListAdapterListener{
        fun onItemClicked(content: String)
    }
}
package com.example.playmarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.AppData
import com.example.playmarket.ApplicationData
import com.example.playmarket.R
import com.example.playmarket.databinding.ShelfBinding

class MainAdapter(
    var sectionList:ArrayList<ApplicationData>,
    var clickListener: ClickListener
):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var binding = ShelfBinding.bind(itemView)

        fun onBind(data:ApplicationData){

                binding.eduApp.text = data.shelf
                val shelfAdapter = Shelf_Adapter(data.app,clickListener)
                binding.shelf.adapter = shelfAdapter



        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.shelf,parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.onBind(sectionList[position])
    }

    override fun getItemCount(): Int = sectionList.size
}


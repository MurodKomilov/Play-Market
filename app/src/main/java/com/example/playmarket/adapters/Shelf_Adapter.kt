package com.example.playmarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.AppData
import com.example.playmarket.ApplicationData
import com.example.playmarket.MainActivity
import com.example.playmarket.R
import com.example.playmarket.databinding.ItemCardBinding


class Shelf_Adapter(
    var appAdapter: ArrayList<AppData>,
    var clickListener: ClickListener
):RecyclerView.Adapter<Shelf_Adapter.AppViewHolder>() {
        inner class AppViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            var binding = ItemCardBinding.bind(itemView)

            fun onBind(data: AppData) {

                binding.appName.text = data.name
                binding.appImage.setImageResource(data.image)

                binding.root.setOnClickListener {
                    clickListener.onClickItem(data)
                }



            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card,parent,false)
        return AppViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.onBind(appAdapter[position])
    }

    override fun getItemCount(): Int = appAdapter.size
}

interface ClickListener{
    fun onClickItem(item:AppData)
}
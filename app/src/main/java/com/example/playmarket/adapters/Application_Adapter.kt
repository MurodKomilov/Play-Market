package com.example.playmarket.adapters

import android.app.Application
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.ApplicationData
import com.example.playmarket.R
import com.example.playmarket.databinding.EducationAppBinding

class Application_Adapter(
    var appAdapter: ArrayList<ApplicationData>
):RecyclerView.Adapter<Application_Adapter.AppViewHolder>() {
        inner class AppViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            var binding = EducationAppBinding.bind(itemView)

            fun onBind(item: ApplicationData) {
                binding.appName.text = item.name
                binding.appImage.setImageResource(item.image)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.education_app,parent,false)
        return AppViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.onBind(appAdapter[position])
    }

    override fun getItemCount(): Int = appAdapter.size
}
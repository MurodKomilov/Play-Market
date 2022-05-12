package com.example.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playmarket.adapters.Application_Adapter
import com.example.playmarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var appList = ArrayList<ApplicationData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        addData()

        val appAdapter = Application_Adapter(appList)
        binding.mainRv.adapter = appAdapter


    }

    private fun addData() {
        appList.add(ApplicationData("Main",R.drawable.main))
        appList.add(ApplicationData("Aron",R.drawable.aron))
        appList.add(ApplicationData("Aron2",R.drawable.aron2))
        appList.add(ApplicationData("Slashio",R.drawable.slashio))
        appList.add(ApplicationData("Ting",R.drawable.ting))
    }
}
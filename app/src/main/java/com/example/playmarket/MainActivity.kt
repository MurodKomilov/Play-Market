package com.example.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playmarket.adapters.MainAdapter
import com.example.playmarket.adapters.Shelf_Adapter
import com.example.playmarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var appList = ArrayList<ApplicationData>()
    var appList1 = ArrayList<AppData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        addData()


        binding.mainRv.adapter = MainAdapter(appList)



    }

    private fun addData() {


        appList1.add(AppData("Aron",R.drawable.aron))
        appList1.add(AppData("Main",R.drawable.main))
        appList1.add(AppData("Aron",R.drawable.aron))
        appList1.add(AppData("Aron",R.drawable.aron))
        appList1.add(AppData("Aron",R.drawable.aron))
        appList.add(ApplicationData("Murod", appList1,))
        appList.add(ApplicationData("Komilov", appList1,))
        appList.add(ApplicationData("Charos", appList1,))
        appList.add(ApplicationData("Mohinur", appList1,))
        appList.add(ApplicationData("Murod", appList1,))
        appList.add(ApplicationData("Murod", appList1,))



//        appList.add(ApplicationData("Aron",R.drawable.aron))
//        appList.add(ApplicationData("Aron2",R.drawable.aron2))
//        appList.add(ApplicationData("Slashio",R.drawable.slashio))
//        appList.add(ApplicationData("Ting",R.drawable.ting))


    }

}
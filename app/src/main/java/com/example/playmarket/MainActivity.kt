package com.example.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.playmarket.adapters.ClickListener
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



        binding.mainRv.adapter = MainAdapter(appList, object :ClickListener{
            override fun onClickItem(item: AppData) {
                Toast.makeText(this@MainActivity, item.name, Toast.LENGTH_SHORT).show()
            }

        })



    }

    private fun addData() {


        appList1.add(AppData("Instagram", R.drawable.instagram))
        appList1.add(AppData("LinkedIn", R.drawable.images))
        appList1.add(AppData("Instagram", R.drawable.instagram))
        appList1.add(AppData("LinkedIn", R.drawable.images))
        appList1.add(AppData("Instagram", R.drawable.instagram))
        appList1.add(AppData("LinkedIn", R.drawable.images))


        appList.add(ApplicationData("Apps", appList1,))
        appList.add(ApplicationData("Games", appList1,))
        appList.add(ApplicationData("Music", appList1,))
        appList.add(ApplicationData("Vide Edit", appList1,))
        appList.add(ApplicationData("Video Editor", appList1,))
        appList.add(ApplicationData("Apps", appList1,))
        appList.add(ApplicationData("Games", appList1,))






    }

}
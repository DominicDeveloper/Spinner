package com.asadbek.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.asadbek.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list:ArrayList<String>
    lateinit var adapterSpinner: AdapterSpinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()

        list.add("Biloldin")
        list.add("Ubaydillo")
        list.add("Ortig`Ali")
        list.add("Azamatjon")

        adapterSpinner = AdapterSpinner(this,list)
       // val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list)
        binding.spinner.adapter = adapterSpinner

    }
}
package com.example.nirs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nirs.Model.Product
import com.example.nirs.Repo.Repository
import com.example.nirs.ViewModel.MainViewModel
import com.example.nirs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    private val repo = Repository()
    private val viewModel by lazy { MainViewModel(repo) }
    private val adapter = ProductAdapter()
    private var indext: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.apply {


            btnSearch.setOnClickListener {

                if (etSearch.text == null) {

                    btnSearch.text = "Введите что нибудь!"

                } else {
                    viewModel.getProduct(etSearch.text.toString())

                    viewModel.myResponse.observe(this@MainActivity) {

                        val list = it.body()!!.data.products

                        rvList.layoutManager = LinearLayoutManager(this@MainActivity)
                        rvList.adapter = adapter
                        adapter.addProduct(list)
                        tvCount.text = list.size.toString()

                    }
                }
            }
        }
    }
}





        //private fun init() = with(binding) {
//
        //    rvList.layoutManager = LinearLayoutManager(this@MainActivity)
        //    rvList.adapter = adapter
//
        //    btnSearch.setOnClickListener {
        //        viewModel.getProduct(btnSearch.getText().toString())
        //    }
//
        //    viewModel.myResponse.observe(this@MainActivity) {
        //        val p = it.body()!!.data.products
        //        adapter.addProduct(p)
        //    }
//
        //}



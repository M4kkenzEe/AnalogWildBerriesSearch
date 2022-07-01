package com.example.nirs

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nirs.Model.Product
import com.example.nirs.databinding.ItemLayoutBinding

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    val productList = ArrayList<Product>()

    class ProductHolder(item: View) : RecyclerView.ViewHolder(item) {

        private val binding = ItemLayoutBinding.bind(item)

        fun bind(product: Product) = with(binding) {

            tvCompany.text = product.brand
            tvTitle.text = product.name
            tvPrice.text = (product.salePriceU / 100).toString() + " руб."
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {

        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return ProductHolder(view)

    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {

        holder.bind(productList[position])

    }

    override fun getItemCount(): Int {

        return productList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addProduct(myList: List<Product>){

        productList.clear()
        myList.map {
            productList.add(it)
        }

        notifyDataSetChanged()
    }


}
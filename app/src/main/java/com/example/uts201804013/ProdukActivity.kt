
package com.example.uts201804013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class ProdukActivity : AppCompatActivity() {
    private  lateinit var rvProduk: RecyclerView
    private var list: ArrayList<Produk> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk)

        rvProduk = findViewById(R.id.rv_produk)
        rvProduk.setHasFixedSize(true)

        list.addAll(DataProduk.listData)
        showRecyclerViewListMode()

    }
    private fun showRecyclerViewListMode(){
        rvProduk.layoutManager = LinearLayoutManager(this)
        val listMakananAdapter = ListProdukAdapter(list)
        rvProduk.adapter = listMakananAdapter
    }
}
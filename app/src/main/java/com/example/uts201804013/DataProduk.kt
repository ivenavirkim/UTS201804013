package com.example.uts201804013

object DataProduk {
    private val namaProduk = arrayOf(
        "wardah",
        "serum scarlet",
        "handbody vaseline",
        "marina",
        "nivea",
        "scrub marina",
        "pensil alis beautiq",
        "pensil alis viva",
        "makeover",
        "maskara maybelline",
        "eykner focallure",
        "foundation loreal",
        "maybelline",
        "blouse on",
        "Harlette Beauty",
        "Somethinc",
        "For Skin",
        "Bhumi",
        "Mellydia",
        "Acne"


    )

    private val hargaProduk = arrayOf(
        "Rp.80.000.",
        "Rp.85.000",
        "Rp.120.000",
        "Rp.75.000",
        "Rp.134.000",
        "Rp.176.000",
        "Rp.155.000",
        "Rp.200.000",
        "Rp.220.000",
        "Rp.245.000",
        "Rp.176.000",
        "Rp.329.000",
        "Rp.345.000",
        "Rp.189.000",
        "Rp.176.000",
        "Rp.220.000",
        "Rp.176.000",
        "Rp.345.000",
        "Rp.220.000",
        "Rp.176.000"


    )

    private val logoProduk = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.p,
        R.drawable.q,
        R.drawable.r,
        R.drawable.ss,
        R.drawable.es



    )

    val listData: ArrayList<Produk>
        get() {
            val listProduk = arrayListOf<Produk>()
            for (position in namaProduk.indices){
                val makanan = Produk()
                makanan.produk = namaProduk[position]
                makanan.harga = hargaProduk[position]
                makanan.logo = logoProduk[position]
                listProduk.add(makanan)
            }
            return listProduk
        }
}
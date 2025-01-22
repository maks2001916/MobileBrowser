package com.example.mobilebrowser

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var toolbarTB: Toolbar
    private lateinit var gridGV: GridView
    private var list = mutableListOf(
        GridViewModal("Яндекс", "https://ya.ru/?npr=1&utm_referrer=https%3A%2F%2Fyandex.ru%2F"),
        GridViewModal("youtube", "https://www.youtube.com/"),
        GridViewModal("Студия подарков", "https://studio-podarok.ru/"),
        GridViewModal("Мвидео", "https://www.mvideo.ru/?utm_source=yandex&utm_medium=organic&utm_campaign=yandex&utm_referrer=yandex"),
        GridViewModal("Читай город", "https://www.chitai-gorod.ru/?utm_source=yandex&utm_medium=cpc&utm_campaign=y_search_brand_rf%7C21077371&utm_term=---autotargeting&utm_content=k50id%7C0100000050972007737_50972007737%7Cy%7Cposition%7Csearch%7Cnone%7Cpremium1%7Cgid%7C5424022015%7Cad%7C15976894828%7Cb%7C15976894828%7C%7Cdevice%7Cdesktop%7Cgeo%7CБузулук%7C11086%7Ccid%7C21077371%7Cmain&k50id=0100000050972007737_50972007737&referrer=reattribution%3D1&yclid=14678983620084891647"),
        GridViewModal("BIGgeek", "https://biggeek.ru/?ysclid=m68590wtj6417914201")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        toolbarTB = findViewById(R.id.toolbarMainTB)
        gridGV = findViewById(R.id.gridGV)

        setSupportActionBar(toolbarTB)

        val adapter = GridViewAdapter(list = list, this@MainActivity)
        gridGV.adapter = adapter

        gridGV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(list[position].address)))
        }

    }
}
package com.example.mobilebrowser

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class GridViewAdapter (
    private val list: List<GridViewModal>,
    private val context: Context
): BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var webSiteTV: TextView
    private lateinit var addressTV: TextView

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return  null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.gridview_item, null)
        }
        webSiteTV = convertView!!.findViewById(R.id.siteTV)
        addressTV = convertView.findViewById(R.id.addressTV)

        webSiteTV.text = list[position].webSite
        addressTV.text = list[position].address
        return convertView
    }

}
package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment: Fragment() {
    lateinit var recyclerView: RecyclerView
    var listData: ArrayList<Contacts> = dataList()
    lateinit var myAdapter: ContactAdapter
    lateinit var addContact: ImageButton
    private lateinit var onClickItem: OnClickItem
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.content_main, container, false)

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.onClickItem = activity as OnClickItem
        addContact = view.findViewById<ImageButton>(R.id.addContact)
        recyclerView = view.findViewById(R.id.recyclerView)
        //listData = dataList()
        myAdapter = ContactAdapter(listData, view.context)
        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = LinearLayoutManager(
            view.context,
            LinearLayoutManager.VERTICAL,
            false
        )
        this.addContact.setOnClickListener{
            onClickItem.ButtonClicked()
        }
        this.myAdapter.setOnClickListener(
            object :
                ContactAdapter.OnClickListener {
                override fun onClick(position: Int, model: Contacts) {
                    onClickItem.ItemClicked(model)
                }
            }
        )
    }


    fun UpdateContent(item: Contacts) {
        this.listData.add(item)
        this.myAdapter.notifyItemInserted(listData.size -1 )
    }
    fun dataList() : ArrayList<Contacts>{
        var list: ArrayList<Contacts> = ArrayList<Contacts>()
        list.add(Contacts("Josefina Lehner", "0000001", "v123@gmail.com", "0916059063"))
        list.add(Contacts("Lehner Stual", "0000003", "vh123@gmail.com", "091787063"))
        list.add(Contacts("Mddison Russei", "0009701", "vhjk123@gmail.com", "0452059063"))
        list.add(Contacts("Josefinar", "0234001", "vher3@gmail.com", "0916059034"))
        list.add(Contacts("Karelle Simonis", "0432001", "verf3@gmail.com", "0916000063"))
        list.add(Contacts("Hannah Vwech", "0056701", "vve3@gmail.com", "0912059063"))
        list.add(Contacts("Com Lam", "0012801", "vwe333@gmail.com", "0916023463"))
        list.add(Contacts("Banh Giay", "0666601", "v12d3@gmail.com", "0923059063"))
        list.add(Contacts("Justin Biter", "0834501", "dfe23@gmail.com", "0913489063"))
        list.add(Contacts("Khong Ai", "0035001", "5563@gmail.com", "0911234063"))
        list.add(Contacts("Lao Nhao", "0056321", "ghu23@gmail.com", "0986059063"))
        list.add(Contacts("Lam Anh", "0023401", "5423@gmail.com", "0923679063"))
        return list
    }
}
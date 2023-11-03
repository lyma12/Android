package com.example.android

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        var list : ArrayList<Message> = ArrayList<Message>()

        list.add(Message("Nam Dang", "Chai lieu hdh", "10:00 AM"))
        list.add(Message("Lam Dang", "[JetBrains/compose-multiplatform] Error displaying .xml illustration on Web platform: Uncaught IllegalStateException - Size is unspecified (Issue #3871)", "9:30 AM"))
        list.add(Message("Pam Dang", "Chai lieu hdh", "9:00 AM"))
        list.add(Message("Shein", "Chai lieu hdh", "8:40 AM"))
        list.add(Message("FaceBook", "Chai lieu hdh", "8:30 AM"))
        list.add(Message("Kam Dang", "KẾT NỐI YÊU THƯƠNG và 7 Nhóm khác là các gợi ý mới dành cho bạn", "8:03 AM"))
        list.add(Message("Ram Dang", "Dazy x HyunA | Tôi sinh ra đã là người tạo ra xu hướng!", "8:00 AM"))
        list.add(Message("Pam Dang", "Chai lieu hdh", "9:00 AM"))
        list.add(Message("Eam Dang", "Chai lieu hdh", "8:40 AM"))
        list.add(Message("Oleksandr Karpovich", "Chai lieu hdh", "8:30 AM"))
        list.add(Message("Kam Dang", "Chai lieu hdh", "8:03 AM"))
        list.add(Message("Ram Dang", "Chai lieu hdh", "8:00 AM"))
        list.add(Message("Pam Dang", "Chai lieu hdh", "9:00 AM"))
        list.add(Message("Eam Dang", "Chai lieu hdh", "8:40 AM"))
        list.add(Message("Iam Dang", "Chai lieu hdh", "8:30 AM"))
        list.add(Message("Kam Dang", "Chai lieu hdh", "8:03 AM"))
        list.add(Message("Ram Dang", "Chai lieu hdh", "8:00 AM"))


        val customAdater: Adapter = Adapter(list)
        val listView: RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        listView.adapter = customAdater
    }
}


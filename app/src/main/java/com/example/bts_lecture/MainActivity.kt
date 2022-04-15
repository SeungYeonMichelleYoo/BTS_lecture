package com.example.bts_lecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 클릭되었다는 것을 알아야 한다. (프로그램이)
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener {

            Toast.makeText(this, "1번 클릭완료", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 큰 사진을 보여줌
            val intent = Intent(this, BtsActivity1::class.java)
            startActivity(intent)
        }

        //7개 image 들의 이름을 다 붙이고, 각각 클릭 시 , 다른 액티비티로 이동
        val image2 = findViewById<ImageView>(R.id.btsImage2)
        val image3 = findViewById<ImageView>(R.id.btsImage3)
        val image4 = findViewById<ImageView>(R.id.btsImage4)
        val image5 = findViewById<ImageView>(R.id.btsImage5)
        val image6 = findViewById<ImageView>(R.id.btsImage6)
        val image7 = findViewById<ImageView>(R.id.btsImage7)

        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, BtsActivity2::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener {
            val intent = Intent(this, BtsActivity3::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener {
            val intent = Intent(this, BtsActivity4::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener {
            val intent = Intent(this, BtsActivity5::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            val intent = Intent(this, BtsActivity6::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            val intent = Intent(this, BtsActivity7::class.java)
            startActivity(intent)
        }
    }
}
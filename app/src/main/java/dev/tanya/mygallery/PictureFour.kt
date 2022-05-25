package dev.tanya.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFour : AppCompatActivity() {
    lateinit var btnPrev2:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_four)

        btnPrev2 = findViewById(R.id.btnPrev2)
        btnPrev2.setOnClickListener {
            val intent = Intent(this, PictureThree::class.java)
            startActivity(intent)
        }

        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this, PictureFive::class.java)
            startActivity(intent)
        }

    }
}
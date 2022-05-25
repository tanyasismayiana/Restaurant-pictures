package dev.tanya.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureTwo : AppCompatActivity() {
    lateinit var btnPrev:Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_two)
        btnPrev = findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnNext1 = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent = Intent(this, PictureThree::class.java)
            startActivity(intent)
        }
    }
}
package dev.tanya.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFive : AppCompatActivity() {
    lateinit var btnPrev3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_five)

        btnPrev3= findViewById(R.id.btnPrev3)
        btnPrev3.setOnClickListener {
            val intent = Intent(this, PictureFour::class.java)
            startActivity(intent)
        }
    }
}
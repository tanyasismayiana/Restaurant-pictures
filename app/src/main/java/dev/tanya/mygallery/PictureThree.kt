package dev.tanya.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureThree : AppCompatActivity() {
    lateinit var btnPrev1:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_three)

        btnPrev1 = findViewById(R.id.btnPrev1)
        btnPrev1.setOnClickListener {
            val intent = Intent(this, PictureTwo::class.java)
            startActivity(intent)
        }

        btnNext2 = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent = Intent(this, PictureFour::class.java)
            startActivity(intent)
        }
    }
}
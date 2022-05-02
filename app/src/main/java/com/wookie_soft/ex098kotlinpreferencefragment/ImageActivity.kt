package com.wookie_soft.ex098kotlinpreferencefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.github.chrisbanes.photoview.PhotoView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val iv = findViewById<PhotoView>(R.id.phv)
        Glide.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYbXpOyWyHvwexOTPja0rYnuwEHvCmgDypzg&usqp=CAU").into(iv)



    }
}
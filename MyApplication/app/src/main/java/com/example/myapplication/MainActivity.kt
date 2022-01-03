package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.login.*
import android.content.Intent
import android.media.AudioRecordingConfiguration
import android.widget.SearchView
import android.widget.Toast
import com.yanzhenjie.permission.Action
import com.yanzhenjie.permission.AndPermission
import kotlinx.android.synthetic.main.collection.*
import kotlinx.android.synthetic.main.find.*
import kotlinx.android.synthetic.main.login.button1
import kotlinx.android.synthetic.main.login.button2
import kotlinx.android.synthetic.main.register.*
import kotlinx.android.synthetic.main.register.button3
import java.io.File
import java.util.jar.Manifest


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        button1.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.home::class.java
            )
            startActivity(intent)}
        button2.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.register::class.java
            )
            startActivity(intent)}
        setContentView(R.layout.register)
        button3.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.login::class.java
            )
            startActivity(intent)}
        setContentView(R.layout.collection)
        button1.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.home::class.java
            )
            startActivity(intent)}
        button2.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.find::class.java
            )
            startActivity(intent)}
        button3.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.collection::class.java
            )
            startActivity(intent)}
        setContentView(R.layout.home)
        button1.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.home::class.java
            )
            startActivity(intent)}
        button2.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.find::class.java
            )
            startActivity(intent)}
        button3.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.collection::class.java
            )
            startActivity(intent)}
        setContentView(R.layout.find)
        button1.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.home::class.java
            )
            startActivity(intent)}
        button2.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.find::class.java
            )
            startActivity(intent)}
        button3.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.collection::class.java
            )
            startActivity(intent)}
        read.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.ask_someone_to_read::class.java
            )
            startActivity(intent)}
        muplord.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.uplord::class.java
            )
            startActivity(intent)}
        setContentView(R.layout.uplord)
        button1.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.home::class.java
            )
            startActivity(intent)}
        button2.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.find::class.java
            )
            startActivity(intent)}
        button3.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                R.layout.collection::class.java
            )
            startActivity(intent)}
    }
}


package com.example.ma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ma.model.ResponseGame
import com.example.ma.retrofit.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val morty = findViewById<RecyclerView>(R.id.rc_view)

        ApiConfig.getServise().getMorty().enqueue(object : Callback<ResponseGame> {
            override fun onResponse(call: Call<ResponseGame>, response: Response<ResponseGame>) {
                if (response.isSuccessful){
                    val responseMorty = response.body()
                    val datMorty = responseMorty?.responseGame
                    val mortyAdapter = MortyAdapter(datMorty)
                    morty.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        setHasFixedSize(true)
                        mortyAdapter.notifyDataSetChanged()
                        adapter = mortyAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseGame>, t: Throwable) {
                Toast.makeText(applicationContext,"errore", Toast.LENGTH_SHORT).show()
            }

        })
    }

}
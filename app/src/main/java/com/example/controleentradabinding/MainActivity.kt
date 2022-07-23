package com.example.controleentradabinding

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.controleentradabinding.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
private var contador: Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.entrou.setOnClickListener {
            contador++
            binding.textView.text = "Pessoas presentes: $contador"
            if (contador == 30){
                binding.entrou.isClickable = false

                binding.textView.text = "Casa lotada, impossivel entrar!"


            }
            binding.saida.isClickable = true
        }


        binding.saida.setOnClickListener {
            contador--
            binding.textView.text = "Pessoas presentes: $contador"
            if (contador == 0){
                binding.saida.isClickable = false
                binding.textView.text = "Casa vazia, impossivel sair!"



            }
            binding.entrou.isClickable = true
        }
    }
}







package com.leonardo.gestao.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.leonardo.gestao.R

/**
 * Activity Sobre: Exibe informações do desenvolvedor e do projeto acadêmico.
 * 
 * @author Leonardo Estevão Alves
 * @version 1.0
 */
class AboutActivity : AppCompatActivity() {

    private val TAG = "CicloVida_About"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Log.d(TAG, "onCreate: Iniciando a Activity")

        // Habilitar botão de voltar na ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // --- Métodos do Ciclo de Vida com Logs ---
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: Activity visível")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: Activity pronta para interação")
    }

    override fun onPause() {
        super.onPause()
        Log.w(TAG, "onPause: Activity perdendo o foco")
    }

    override fun onStop() {
        super.onStop()
        Log.w(TAG, "onStop: Activity não está mais visível")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: Activity sendo destruída")
    }

    // Lógica do botão de voltar na ActionBar
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}

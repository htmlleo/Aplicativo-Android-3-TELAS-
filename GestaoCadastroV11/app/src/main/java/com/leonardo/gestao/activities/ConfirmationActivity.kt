package com.leonardo.gestao.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.leonardo.gestao.R

/**
 * Activity de Confirmação: Exibe os dados cadastrados e permite confirmar ou editar.
 * 
 * @author Leonardo Estevão Alves
 * @version 1.0
 */
class ConfirmationActivity : AppCompatActivity() {

    private val TAG = "CicloVida_Confirmation"

    private lateinit var tvDisplayName: TextView
    private lateinit var tvDisplayAge: TextView
    private lateinit var tvDisplayAddress: TextView
    private lateinit var btnYes: Button
    private lateinit var btnNo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)
        Log.d(TAG, "onCreate: Iniciando a Activity")

        // Inicialização dos componentes
        tvDisplayName = findViewById(R.id.tv_display_name)
        tvDisplayAge = findViewById(R.id.tv_display_age)
        tvDisplayAddress = findViewById(R.id.tv_display_address)
        btnYes = findViewById(R.id.btn_yes)
        btnNo = findViewById(R.id.btn_no)

        // Receber dados da MainActivity
        val name = intent.getStringExtra("NAME") ?: ""
        val age = intent.getStringExtra("AGE") ?: ""
        val address = intent.getStringExtra("ADDRESS") ?: ""

        // Exibir dados formatados
        tvDisplayName.text = "${getString(R.string.label_name)} $name"
        tvDisplayAge.text = "${getString(R.string.label_age)} $age"
        tvDisplayAddress.text = "${getString(R.string.label_address)} $address"

        // Lógica do Botão Sim (Confirmação)
        btnYes.setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_saved), Toast.LENGTH_LONG).show()
            
            // Retorna para a tela inicial limpando os campos
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

        // Lógica do Botão Não (Recusa/Edição)
        btnNo.setOnClickListener {
            // Retorna para a tela inicial mantendo os dados preenchidos
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("NAME", name)
                putExtra("AGE", age)
                putExtra("ADDRESS", address)
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            }
            startActivity(intent)
            finish()
        }
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
}

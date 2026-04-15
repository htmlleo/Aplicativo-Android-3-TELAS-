package com.leonardo.gestao.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.leonardo.gestao.R

/**
 * Activity Principal: Responsável pelo cadastro de usuários.
 * Implementa a primeira tela do aplicativo com campos de entrada e navegação.
 * 
 * @author Leonardo Estevão Alves
 * @version 1.0
 */
class MainActivity : AppCompatActivity() {

    private val TAG = "CicloVida_MainActivity"
    
    private lateinit var etName: EditText
    private lateinit var etAge: EditText
    private lateinit var etAddress: EditText
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Iniciando a Activity")

        // Inicialização dos componentes
        etName = findViewById(R.id.et_name)
        etAge = findViewById(R.id.et_age)
        etAddress = findViewById(R.id.et_address)
        btnSave = findViewById(R.id.btn_save)

        // Recuperar dados caso retorne da tela de confirmação (Botão Não)
        val name = intent.getStringExtra("NAME")
        val age = intent.getStringExtra("AGE")
        val address = intent.getStringExtra("ADDRESS")
        
        if (name != null) etName.setText(name)
        if (age != null) etAge.setText(age)
        if (address != null) etAddress.setText(address)

        // Lógica do Botão Salvar
        btnSave.setOnClickListener {
            saveData()
        }
    }

    /**
     * Captura os dados dos campos, valida e envia para a tela de confirmação.
     */
    private fun saveData() {
        val name = etName.text.toString().trim()
        val age = etAge.text.toString().trim()
        val address = etAddress.text.toString().trim()

        // Validação de campos vazios
        if (name.isEmpty() || age.isEmpty() || address.isEmpty()) {
            Toast.makeText(this, getString(R.string.error_empty_fields), Toast.LENGTH_SHORT).show()
            return
        }

        // Envio de dados via Intent
        val intent = Intent(this, ConfirmationActivity::class.java).apply {
            putExtra("NAME", name)
            putExtra("AGE", age)
            putExtra("ADDRESS", address)
        }
        startActivity(intent)
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

    override fun onRestart() {
        super.onRestart()
        Log.v(TAG, "onRestart: Activity reiniciando")
    }

    // --- Menu ---
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_about -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

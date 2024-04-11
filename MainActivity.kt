package com.example.assignment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val txtResults = findViewById<TextView>(R.id.txtResults)

        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..30 -> "Malala Yousafzai"
                    in 30..40 -> "Amelia Earhart"
                    in 40..50 -> "Frida Kahlo"
                    in 50..60->"Michael Jackson"
                    in 60..70->"Leonardo da Vinci"
                    in 70..80->"Albert Einstein"
                    in 80..90->"Winston Churchil"
                    in 90..100->"Nelson Mandela"
                    else -> "Enter a valid age"
                }
                txtResults.text = "Age: $age\n${
                    when (result) {
                        "Malala Yousafzai" -> "Pakistani activist for female education and the youngest Nobel Prize laureate."
                        "Amelia Earhart" -> "American aviation pioneer and the first female aviator to fly solo across the Atlantic Ocean, known for her courage and contributions to aviation."
                        "Frida Kahlo" -> "Mexican painter known for her vibrant and often surreal self-portraits, as well as her exploration of identity, gender, and culture."
                        "Michael Jackson" -> "Iconic American singer, songwriter, and dancer, often referred to as the King of Pop for his contributions to music and dance."
                        "Leonardo da Vinci"->"Italian polymath known for his contributions to art, science, engineering, and anatomy, among other fields."
                        "Albert Einstein"->"Renowned theoretical physicist, best known for developing the theory of relativity."
                        "Winston Churchil"->"British statesman and Prime Minister who led the United Kingdom during World War II, known for his eloquent speeches and leadership during challenging times."
                        "Nelson Mandela"->"Anti-apartheid revolutionary and former President of South Africa, known for his role in ending apartheid and promoting reconciliation."
                        else -> "Enter a valid age."
                    }
                }"
            } else {
                txtResults.text = "Please enter a valid age."
            }
        }

        buttonClear.setOnClickListener {
            ageNumber.text.clear()
            txtResults.text = ""
        }
    }
}

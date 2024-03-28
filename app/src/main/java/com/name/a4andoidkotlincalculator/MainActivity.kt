package com.name.a4andoidkotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.name.a4andoidkotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var number1: EditText
    lateinit var number2: EditText
    lateinit var buttonArti: Button
    lateinit var buttonEksi: Button
    lateinit var buttonCarpi: Button
    lateinit var buttonBolme: Button
    lateinit var result:TextView

    var sayi1: Double? = null
    var sayi2: Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        number1=binding.number1Text
        number2=binding.number2Text
        buttonArti=binding.buttonArti
        buttonEksi=binding.buttonEksi
        buttonCarpi=binding.buttonCarpi
        buttonBolme=binding.buttonBolme
        result=binding.textView

    }

    fun addition (view: View) {

       sayi1= number1.text.toString().toDoubleOrNull()
       sayi2 = number2.text.toString().toDoubleOrNull()

        if (sayi1!=null && sayi2!=null){
            val result2= sayi1!! + sayi2!!
            result.text= "Result: $result2"
        } else {result.text= "Please Enter Number"}

        // YADA
        /*
        val sonuc = sayi1 ?: 1.0
        val sonuc2 = sayi2 ?: 1.0

        result.text = if (sayi1 != null && sayi2 != null) {
            (sonuc + sonuc2).toString()
        } else {
            "Lutfen  bir sayi girirniz"
        }
         */


        /*
        val sonuc = sayi1 ?: -1
        val sonuc2 = sayi2 ?: -1
        Yani, -1 değeri kullanıcı tarafından belirli bir sayı girilmediğinde veya geçersiz bir giriş yapıldığında bir tür yer tutucu olarak kullanılır. Bu sayede, toplama işlemi gibi matematiksel işlemlerde null olan bir değeri dikkate almak yerine, -1 değeriyle işlem yapılır ve programın beklenmedik bir şekilde hata vermesi veya yanlış sonuçlar üretmesi önlenmiş olur.
        */
    }



    fun subtraction (view: View) {

         sayi1 = number1.text.toString().toDoubleOrNull()
         sayi2 = number2.text.toString().toDoubleOrNull()



        val sonuc = sayi1 ?: -1.0
        val sonuc2 = sayi2 ?: -1.0

        result.text = if (sayi1 != null && sayi2 != null) {
            (sonuc - sonuc2).toString()
        } else {
            "Please Enter Number"
        }

    }
    fun multiplication (view: View) {
         sayi1 = number1.text.toString().toDoubleOrNull()
         sayi2 = number2.text.toString().toDoubleOrNull()



        val sonuc = sayi1 ?: -1.0
        val sonuc2 = sayi2 ?: -1.0

        result.text = if (sayi1 != null && sayi2 != null) {
            (sonuc * sonuc2).toString()
        } else {
            "Please Enter Number"
        }

    }



    fun division (view: View) {
         sayi1 = number1.text.toString().toDoubleOrNull()
         sayi2 = number2.text.toString().toDoubleOrNull()



        val sonuc = sayi1 ?: -1.0
        val sonuc2 = sayi2 ?: -1.0

        result.text = if (sayi1 != null && sayi2 != null) {
            if (sayi2 != 0.0) {
                (sonuc / sonuc2).toString()
            } else {
                "A number cannot divided by Zero"
            }
        } else {
            "Please Enter Number"
        }
    }

    }



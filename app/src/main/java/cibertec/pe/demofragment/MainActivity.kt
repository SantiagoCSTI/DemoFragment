package cibertec.pe.demofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val opantalla1=frPantalla1()
        var oPantalla2 =fgPantalla2()

         BtnPantalla1.setOnClickListener()
         {
             supportFragmentManager.beginTransaction().apply {
                 replace(R.id.fgContenedor, opantalla1)
                 commit()
             }

         }

        BtnPantalla2.setOnClickListener()
        {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fgContenedor, oPantalla2)
                commit()
            }

        }

    }
}

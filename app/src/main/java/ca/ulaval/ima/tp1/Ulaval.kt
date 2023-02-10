package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ulaval : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulaval)

        val closeActivity: Button = findViewById(R.id.fermer)

        closeActivity.setOnClickListener {
            this.finish()
        }
    }
}
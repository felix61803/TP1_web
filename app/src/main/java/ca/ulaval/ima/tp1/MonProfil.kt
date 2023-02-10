package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MonProfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mon_profil)

        val stringProfilText: TextView = findViewById(R.id.tx_monprofil)

        var textComplet: String = "Prénom: " + intent.getParcelableExtra<Profil>("Profil")?.prenom + "\n"
        textComplet += "Nom de famille: " + intent.getParcelableExtra<Profil>("Profil")?.nom + "\n"
        textComplet += "Date de naissance: " + intent.getParcelableExtra<Profil>("Profil")?.naissance + "\n"
        textComplet += "IDUL : " + intent.getParcelableExtra<Profil>("Profil")?.idul + "\n"
        stringProfilText.text =  textComplet
    }
}
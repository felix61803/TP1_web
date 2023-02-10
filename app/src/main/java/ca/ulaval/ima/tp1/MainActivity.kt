package ca.ulaval.ima.tp1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val infoProfil: Parcelable = Profil("Félix","Côté", "19 août 1999","111266852")

        val UrlToLoad: String = "https://www.google.com/"

        val siteExt: Button = findViewById(R.id.bt_sitewebext)

        val siteWebView: Button = findViewById(R.id.bt_sitewebview)

        val ulavalButton: Button = findViewById(R.id.bt_ulaval)

        val monProfilButton: Button = findViewById(R.id.bt_monprofil)

        siteExt.setOnClickListener{
            val openurl: Uri = Uri.parse(UrlToLoad);
            val intent = Intent(Intent.ACTION_VIEW, openurl);
            startActivity(intent)
        }

        siteWebView.setOnClickListener{
            val intent= Intent(this, WebView::class.java)
            intent.putExtra("My_Url_String",UrlToLoad)
            startActivity(intent)
        }


        ulavalButton.setOnClickListener{
            val intent= Intent(this, Ulaval::class.java)
            startActivity(intent)
        }

        monProfilButton.setOnClickListener{
            val intent= Intent(this, MonProfil::class.java)
            intent.putExtra("Profil",infoProfil)
            startActivity(intent)
        }
    }
}
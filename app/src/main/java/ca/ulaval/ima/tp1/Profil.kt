package ca.ulaval.ima.tp1

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Profil(var prenom: String, var nom: String, var naissance: String, var idul: String) :
    Parcelable
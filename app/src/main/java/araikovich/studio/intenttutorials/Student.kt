package araikovich.studio.intenttutorials

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student(
    val age: Int,
    val money: Int,
    val mivina: String
): Parcelable
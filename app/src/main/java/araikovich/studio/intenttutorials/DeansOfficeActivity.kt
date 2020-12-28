package araikovich.studio.intenttutorials

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DeansOfficeActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, DeansOfficeActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deans_office)
    }
}
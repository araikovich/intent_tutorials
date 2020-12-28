package araikovich.studio.intenttutorials

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

open class PrepodReceiver : BroadcastReceiver() {

    companion object {
        const val PREPOD_ACTION = "PREPOD_ACTION"
        const val PREPOD_MESSAGE = "PREPOD_MESSAGE"
    }

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, intent.getStringExtra(PREPOD_MESSAGE), Toast.LENGTH_LONG).show()
    }
}

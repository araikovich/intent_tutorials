package araikovich.studio.intenttutorials

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import araikovich.studio.intenttutorials.databinding.ActivityShowBroadcastBinding

class ShowBroadcastActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, ShowBroadcastActivity::class.java))
        }
    }

    private lateinit var binding: ActivityShowBroadcastBinding
    private lateinit var receiver: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupListeners()

        receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                binding.btnSendMessage.text = "На сессии тебе пи..."
            }
        }
        registerReceiver(receiver, IntentFilter(PrepodReceiver.PREPOD_ACTION))
    }

    private fun setupBinding() {
        binding = ActivityShowBroadcastBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupListeners() {
        binding.btnSendMessage.setOnClickListener {
            val intent = Intent()
            intent.putExtra(PrepodReceiver.PREPOD_MESSAGE, "B6")
            intent.action = PrepodReceiver.PREPOD_ACTION
            sendBroadcast(intent)
        }
    }
}
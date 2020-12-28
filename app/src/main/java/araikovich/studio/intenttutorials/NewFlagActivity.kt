package araikovich.studio.intenttutorials

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import araikovich.studio.intenttutorials.databinding.ActivityNewFlagBinding

class NewFlagActivity : AppCompatActivity() {

    companion object {

        fun start(context: Context) {
            val intent = Intent(context, NewFlagActivity::class.java)
            //intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            context.startActivity(intent)
        }
    }

    private lateinit var binding: ActivityNewFlagBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_flag)
        setupBinding()
        setupListeners()
    }

    private fun setupBinding() {
        binding = ActivityNewFlagBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupListeners() {
        binding.btnAction.setOnClickListener {
            start(this)
        }
    }
}
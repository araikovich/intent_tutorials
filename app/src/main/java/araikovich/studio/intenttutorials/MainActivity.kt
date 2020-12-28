package araikovich.studio.intenttutorials

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import araikovich.studio.intenttutorials.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {

        private const val CUSTOM_ACTIVITY_TAG = "CUSTOM_ACTIVITY_TAG"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupListeners()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupListeners() {
        binding.btnDeansOffice.setOnClickListener {
            Log.d(CUSTOM_ACTIVITY_TAG, "binding.btnDeansOffice.setOnClickListener - click")
            goToDeansOffice()
        }
        binding.btnCallPrepod.setOnClickListener {
            Log.d(CUSTOM_ACTIVITY_TAG, "binding.btnCallPrepod.setOnClickListener - click")
            callToPrepod()
        }
        binding.btnGetNotes.setOnClickListener {
            Log.d(CUSTOM_ACTIVITY_TAG, "binding.btnGetNotes.setOnClickListener - click")
            openShpora()
        }
        binding.btnNext.setOnClickListener {
            Log.d(CUSTOM_ACTIVITY_TAG, "binding.btnNext.setOnClickListener - click")
            goToSecondYear()
        }
        binding.btnBroadcasts.setOnClickListener {
            Log.e(CUSTOM_ACTIVITY_TAG, "binding.btnBroadcasts.setOnClickListener - click")
            ShowBroadcastActivity.start(this)
        }
        binding.btnStarosta.setOnClickListener {
            StarostaActivity.start(this)
        }
    }

    private fun goToDeansOffice() {
        DeansOfficeActivity.start(this)
    }

    private fun callToPrepod() {
        val callIntent = Intent()
        callIntent.action = Intent.ACTION_DIAL
        callIntent.data = Uri.parse("tel:+380997723823")
        startActivity(callIntent)
    }

    private fun openShpora() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ya.ru"))
        startActivity(Intent.createChooser(intent, "Title"))
    }

    private fun goToSecondYear() {
        SecondYearActivity.start(this, "Tihran", 2, Student(18, 0, "Chicken"))
    }
}
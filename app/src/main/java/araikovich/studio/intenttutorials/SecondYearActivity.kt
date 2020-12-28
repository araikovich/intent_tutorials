package araikovich.studio.intenttutorials

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import araikovich.studio.intenttutorials.databinding.ActivitySecondYearBinding
import kotlinx.android.synthetic.main.activity_second_year.*

class SecondYearActivity : AppCompatActivity() {

    companion object {

        private const val NAME_KEY = "NAME_KEY"
        private const val SCORE_KEY = "SCORE_KEY"
        private const val STUDENT_KEY = "STUDENT_KEY"

        fun start(context: Context, name: String, score: Int, student: Student) {
            val intent = Intent(context, SecondYearActivity::class.java)
            intent.putExtra(NAME_KEY, name)
            intent.putExtra(SCORE_KEY, score)
            intent.putExtra(STUDENT_KEY, student)
            context.startActivity(intent)
        }
    }

    private lateinit var binding: ActivitySecondYearBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupData()
    }

    private fun setupBinding() {
        binding = ActivitySecondYearBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupData() {
        val name = intent.getStringExtra(NAME_KEY)
        val score = intent.getIntExtra(SCORE_KEY, 2)
        val student = intent.getParcelableExtra<Student>(STUDENT_KEY)
        binding.tvName.text = name
        binding.tvScore.text = score.toString()
        student?.also {
            binding.tvStudent.text = "student - ${it.age} -- ${it.mivina}"
        }
    }
}
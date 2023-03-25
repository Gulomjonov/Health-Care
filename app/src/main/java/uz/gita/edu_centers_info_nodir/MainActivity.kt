package uz.gita.edu_centers_info_nodir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.gita).setOnClickListener{
            val intent = Intent(this,Info_Activity::class.java)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.robo).setOnClickListener{
            val intent = Intent(this,Robo_Activity::class.java)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.najot).setOnClickListener{
            val intent = Intent(this,Najot_Activity::class.java)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.pdp).setOnClickListener{
            val intent = Intent(this,Pdp_Activity::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.btn_more).setOnClickListener{
            val intent = Intent(this,about_Activity::class.java)
            startActivity(intent)
        }

//        val forgotpasswordtextview = findViewById<TextView>(R.id.gita1)
//
//        forgotpasswordtextview.setOnClickListener {
//
//            val myIntent = Intent(this, Info_Activity::class.java)
//            startActivity(myIntent)
//
//            gita1.movementMethod = LinkMovementMethod.getInstance();
//
//        }
    }
}
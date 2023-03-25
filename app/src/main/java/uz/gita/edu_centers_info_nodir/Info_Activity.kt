package uz.gita.edu_centers_info_nodir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Info_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        findViewById<TextView>(R.id.gita1).setOnClickListener{
            val intent = Intent(this,Info_Activity2::class.java)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.lms).setOnClickListener{
            val OurIntent = Intent(this,infon_Activity3::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.xemis).setOnClickListener{
            val OurIntent = Intent(this,info_Activity4::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.info5).setOnClickListener{
            val OurIntent = Intent(this,info_Activity5::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.info6).setOnClickListener{
            val OurIntent = Intent(this,info_Activity6::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.info7).setOnClickListener{
            val OurIntent = Intent(this,info_Activity7::class.java)
            startActivity(OurIntent)
        }
    }
}
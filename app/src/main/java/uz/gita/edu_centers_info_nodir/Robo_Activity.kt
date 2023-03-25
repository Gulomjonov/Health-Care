package uz.gita.edu_centers_info_nodir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Robo_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_robo)

        findViewById<TextView>(R.id.robo1).setOnClickListener{
            val intent = Intent(this,robo_Activity1::class.java)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.robo2).setOnClickListener{
            val OurIntent = Intent(this,robo_Activity2::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.robo3).setOnClickListener{
            val OurIntent = Intent(this,robo_Activity3::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.robo4).setOnClickListener{
            val OurIntent = Intent(this,robo_Activity4::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.robo5).setOnClickListener{
            val OurIntent = Intent(this,robo_Activity5::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.robo6).setOnClickListener{
            val OurIntent = Intent(this,robo_Activity6::class.java)
            startActivity(OurIntent)
        }
    }
}
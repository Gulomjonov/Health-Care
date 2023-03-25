package uz.gita.edu_centers_info_nodir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pdp_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdp)

        findViewById<TextView>(R.id.pdp1).setOnClickListener{
            val intent = Intent(this,pdp_Activity1::class.java)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.pdp2).setOnClickListener{
            val OurIntent = Intent(this,pdp_Activity2::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.pdp3).setOnClickListener{
            val OurIntent = Intent(this,pdp_Activity3::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.pdp4).setOnClickListener{
            val OurIntent = Intent(this,pdp_Activity4::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.pdp5).setOnClickListener{
            val OurIntent = Intent(this,pdp_Activity5::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.pdp6).setOnClickListener{
            val OurIntent = Intent(this,pdp_Activity6::class.java)
            startActivity(OurIntent)
        }
    }
}
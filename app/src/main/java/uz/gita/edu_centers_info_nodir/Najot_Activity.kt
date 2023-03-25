package uz.gita.edu_centers_info_nodir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Najot_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_najot)

        findViewById<TextView>(R.id.najot1).setOnClickListener{
            val intent = Intent(this,najot_Activity1::class.java)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.najot2).setOnClickListener{
            val OurIntent = Intent(this,najot_Activity2::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.najot3).setOnClickListener{
            val OurIntent = Intent(this,najot_Activity3::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.najot4).setOnClickListener{
            val OurIntent = Intent(this,najot_Activity4::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.najot5).setOnClickListener{
            val OurIntent = Intent(this,najot_Activity5::class.java)
            startActivity(OurIntent)
        }
        findViewById<TextView>(R.id.najot6).setOnClickListener{
            val OurIntent = Intent(this,najot_Activity6::class.java)
            startActivity(OurIntent)
        }
    }
}
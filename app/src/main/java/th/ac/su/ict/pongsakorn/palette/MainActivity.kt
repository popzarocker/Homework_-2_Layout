package th.ac.su.ict.pongsakorn.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)

        val boxRGB = findViewById<TextView>(R.id.boxRGB)
        btn1.setOnClickListener {
            boxRGB.text = "235,225,222"
            boxRGB.setBackgroundColor(Color.parseColor("#EBE1DE"))
        }
        btn2.setOnClickListener {
            boxRGB.text = "236,203,202"
            boxRGB.setBackgroundColor(Color.parseColor("#ECCBCA"))
        }
        btn3.setOnClickListener {
            boxRGB.text = "117,131,156"
            boxRGB.setBackgroundColor(Color.parseColor("#75839C"))
        }
        btn4.setOnClickListener {
            boxRGB.text = "153,169,191"
            boxRGB.setBackgroundColor(Color.parseColor("#99A9BF"))
        }
        btn5.setOnClickListener {
            boxRGB.text = "194,204,213"
            boxRGB.setBackgroundColor(Color.parseColor("#C2CCD5"))
        }
        btn6.setOnClickListener {
            boxRGB.text = "221,226,229"
            boxRGB.setBackgroundColor(Color.parseColor("#DDE2E5"))
        }
    }
}
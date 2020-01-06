package th.ac.su.ict.piyada.culculator_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edt1 = findViewById<EditText>(R.id.edt1)
        var edt2 = findViewById<EditText>(R.id.edt2)
        var tvResult = findViewById<TextView>(R.id.tvResult)
        var btcal = findViewById<Button>(R.id.btcal)

        var ogOperater = findViewById<RadioGroup>(R.id.ogOperater)

        var checkbx = findViewById<CheckBox>(R.id.checkbx)
        btcal.setOnClickListener {

            if (checkbx.isChecked) {
                var calculate1: Int = edt1.text.toString().toInt()
                var calculate2: Int = edt2.text.toString().toInt()
                var ans = 0


                when (ogOperater.checkedRadioButtonId) {
                    R.id.rdAddition -> ans = calculate1 + calculate2
                    R.id.rdSubtraction -> ans = calculate1 - calculate2
                    R.id.rdmultiplication -> ans = calculate1 * calculate2
                    R.id.rdDivision -> ans = calculate1 / calculate2
                }

                tvResult.setText(ans.toString())
            }
        }

    }
}

package vn.edu.hust.registration2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import vn.edu.hust.registration2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.register.setOnClickListener({
            if (binding.firstNameBox.text.isEmpty()) {
                Toast.makeText(this, "Error! Enter your First Name..", Toast.LENGTH_SHORT).show()

            }else if (binding.lastNameBox.text.isEmpty()) {
                Toast.makeText(this, "Error! Enter your Last Name..", Toast.LENGTH_SHORT).show()

            }else if (binding.gender.checkedRadioButtonId == -1) {
                Toast.makeText(this, "Error! Choose your Gender..", Toast.LENGTH_SHORT).show()

            }else if (binding.birthday.text.isEmpty()) {
                Toast.makeText(this, "Error! Enter your Birthday..", Toast.LENGTH_SHORT).show()

            }
           else  if (binding.address.text.isEmpty()) {
                Toast.makeText(this, "Error! Enter your Address..", Toast.LENGTH_SHORT).show()

            }
            else if (binding.checkBox.isChecked == false) {
                Toast.makeText(this, "Agree terms, please..", Toast.LENGTH_SHORT).show()

            }
            else Toast.makeText(this, "Successful!", Toast.LENGTH_SHORT).show()
        })
    }
}
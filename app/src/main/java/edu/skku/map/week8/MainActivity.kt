package edu.skku.map.week8 // package name might be different!

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import edu.skku.map.week8.databinding.ActivityMainBinding
import splitties.toast.toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // binding added
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // get binding from layout_file.xml => LayoutFileBinding
        setContentView(binding.root) // and call setContentView with root of binding

        binding.buttonShowToast.setOnClickListener {
            toast(binding.editTextToastMsg.text.toString())}
        // use binding.ID instead of findViewById<Type>(ID)
    }
}
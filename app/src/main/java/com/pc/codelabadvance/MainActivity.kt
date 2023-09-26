package com.pc.codelabadvance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pc.codelabadvance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isFragmentDisplayed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // binding.btnShowF.setOnClickListener {
        //     if (!isFragmentDisplayed) {
        //         showFragment()
        //     } else {
        //         hideFragment()
        //     }
        // }
    }

    // private fun showFragment() {
    //     val fragment = SimpleFragment()
    //     supportFragmentManager.beginTransaction()
    //         .add(R.id.fragment_container, fragment, fragment::class.java.name)
    //         .addToBackStack(null)
    //         .commit()
    //     isFragmentDisplayed = true
    //     binding.btnShowF.text = getString(R.string.close)
    // }
    //
    // private fun hideFragment() {
    //     val fragment = SimpleFragment()
    //     supportFragmentManager.beginTransaction()
    //         .add(R.id.fragment_container, fragment, fragment::class.java.name)
    //         .remove(fragment)
    //         .commit()
    //     isFragmentDisplayed = false
    //     binding.btnShowF.text = getString(R.string.open)
    //
    // }
    //
    // companion object {
    //     const val STATE_FRAGMENT = "STATE_OF_FRAGMENT"
    // }
}

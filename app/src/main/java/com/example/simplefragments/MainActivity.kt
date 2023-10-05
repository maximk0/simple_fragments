package com.example.simplefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportFragmentManager.findFragmentByTag(AFragment.TAG) == null) {
            supportFragmentManager.beginTransaction().run{
                val fragment = AFragment.newInstance()
                setReorderingAllowed(true)
                add(R.id.fragment_container_view, fragment, AFragment.TAG)
                addToBackStack(AFragment.TAG)
                commit()
            }
        }

    }
}
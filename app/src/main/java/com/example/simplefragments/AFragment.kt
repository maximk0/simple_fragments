package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simplefragments.databinding.FragmentABinding


class AFragment : Fragment(R.layout.fragment_a) {

    private lateinit var binding: FragmentABinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentABinding.bind(view)
        binding.buttonGo.setOnClickListener {
            parentFragmentManager.beginTransaction().run{
                val fragment = BFragment.newInstance()
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, fragment, BFragment.TAG)
                addToBackStack(BFragment.TAG)
                commit()
            }
        }
    }

    companion object {
        fun newInstance() = AFragment()
        const val TAG = "AFragment"
    }

}

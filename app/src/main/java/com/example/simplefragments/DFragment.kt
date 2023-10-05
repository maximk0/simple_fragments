package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simplefragments.databinding.FragmentDBinding

class DFragment : Fragment(R.layout.fragment_d) {

    private lateinit var binding: FragmentDBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDBinding.bind(view)

        binding.buttonGo.setOnClickListener {
            parentFragmentManager.popBackStack(AFragment.TAG, 0)
        }

    }

    companion object {
        fun newInstance() = DFragment()
        const val TAG = "DFragment"
    }

}

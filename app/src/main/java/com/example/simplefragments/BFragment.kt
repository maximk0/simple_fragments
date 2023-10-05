package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simplefragments.databinding.FragmentBBinding


class BFragment : Fragment(R.layout.fragment_b) {

    private lateinit var binding: FragmentBBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBBinding.bind(view)

        binding.buttonGo.setOnClickListener {
            val textFromEditText = binding.editText.text.toString()

            parentFragmentManager.beginTransaction().run{
                val fragment = CFragment.newInstance(textFromEditText)
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, fragment, CFragment.TAG)
                addToBackStack(CFragment.TAG)
                commit()
            }

        }

        binding.buttonBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

    }
    companion object {
        fun newInstance() = BFragment()
        const val TAG = "BFragment"
    }
}


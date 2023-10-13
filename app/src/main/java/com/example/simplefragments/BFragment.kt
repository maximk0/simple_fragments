package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.simplefragments.databinding.FragmentBBinding

const val BUNDLE_KEY = "message"
class BFragment : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGo.setOnClickListener {
            val textFromEditText = binding.editText.text.toString()

            val bundle = Bundle()
            bundle.putString(BUNDLE_KEY, textFromEditText)

            findNavController().navigate(R.id.action_fragment_b_to_fragment_c, bundle)
        }

        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.fragment_a)
        }

    }

}


package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.simplefragments.databinding.FragmentCBinding

class CFragment : Fragment() {

    private lateinit var binding: FragmentCBinding

    val args: CFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = args.message

        binding.buttonGo.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_c_to_fragment_d)
        }

        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.fragment_b)
        }
    }

}

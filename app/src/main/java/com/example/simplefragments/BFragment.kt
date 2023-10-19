package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simplefragments.databinding.FragmentABinding
import com.example.simplefragments.databinding.FragmentBBinding


class BFragment : Fragment(R.layout.fragment_b) {

    private lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBBinding.bind(view)

        binding.buttonGo.setOnClickListener {
            val textFromEditText = binding.editText.text.toString()

            App.application.getRouter.navigateTo(Screens.C(textFromEditText))
        }

        binding.buttonBack.setOnClickListener {
            App.application.getRouter.backTo(Screens.A)
        }

    }
    companion object {
        fun newInstance() = BFragment()
    }
}


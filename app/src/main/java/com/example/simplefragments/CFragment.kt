package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simplefragments.databinding.FragmentBBinding
import com.example.simplefragments.databinding.FragmentCBinding

class CFragment : Fragment(R.layout.fragment_c) {

    private lateinit var binding: FragmentCBinding

    val message: String
        get() = requireArguments().getInt(EXTRA_MESSAGE).toString()

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
        binding = FragmentCBinding.bind(view)
        arguments?.getString(EXTRA_MESSAGE)?.let { message ->
            binding.textView.text = message
        }
        binding.buttonGo.setOnClickListener {
            App.application.getRouter.navigateTo(Screens.D())
        }
        binding.buttonBack.setOnClickListener {
            App.application.getRouter.backTo(Screens.B())
        }
    }

    companion object {
        private const val EXTRA_MESSAGE = "extra_message"
        fun newInstance(message: String) = CFragment().apply {
            arguments = Bundle().apply {
                putString(EXTRA_MESSAGE, message)
            }
        }
    }

}

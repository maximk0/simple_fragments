package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simplefragments.databinding.FragmentCBinding
import com.example.simplefragments.databinding.FragmentDBinding
import com.github.terrakok.cicerone.Screen

class DFragment : Fragment(R.layout.fragment_d) {

    private lateinit var binding: FragmentDBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDBinding.bind(view)

        binding.buttonGo.setOnClickListener {
            App.application.getRouter.newRootScreen(Screens.A)
        }

    }

    companion object {
        fun newInstance() = DFragment()
    }

}

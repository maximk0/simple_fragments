package com.example.simplefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simplefragments.databinding.FragmentCBinding

class CFragment : Fragment(R.layout.fragment_c) {

    private lateinit var binding: FragmentCBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCBinding.bind(view)
        arguments?.getString("message")?.let { message ->
            binding.textView.text = message
        }
        binding.buttonGo.setOnClickListener {
            parentFragmentManager.beginTransaction().run{
                val fragment = DFragment.newInstance()
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, fragment, DFragment.TAG)
                addToBackStack(DFragment.TAG)
                commit()
            }
        }
        binding.buttonBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    companion object {
        fun newInstance(message: String) = CFragment().apply {
            arguments = Bundle().apply {
                putString("message", message)
            }
        }
        const val TAG = "CFragment"
    }

}

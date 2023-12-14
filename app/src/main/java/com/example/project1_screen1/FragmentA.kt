package com.example.project1_screen1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.project1_screen1.databinding.FragmentABinding

class FragmentA : Fragment() {

    private var _binding: FragmentABinding? = null // create a nullable backing property and changing binding property to become a computed property
    private val binding
        get() = checkNotNull(_binding){
            "Cannot access binding because its null. Is the view visible?"
        }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {

        // Note: The fragment's view does not need to be added to the parent view immediately - the activity will handle adding the view later
        _binding = FragmentABinding.inflate(layoutInflater, container, false)
        return binding.root // ready to start wiring up the view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            buttonA.setOnClickListener{
               findNavController().navigate(
                   R.id.fragmentB
               )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView();
        _binding = null // clear binding reference to avoid memory leaks
    }

}
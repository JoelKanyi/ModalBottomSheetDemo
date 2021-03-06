package com.kanyideveloper.modalbottomsheetdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kanyideveloper.modalbottomsheetdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        val view: View = binding.root

        return view.apply{
            binding.buttonOpenBottomSheet.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_bottomSheetFragment)
            }
        }
    }
}
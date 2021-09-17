package com.recep.periodictable.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.recep.periodictable.databinding.FragmentInfoBinding
import com.recep.periodictable.enum.ElementType


class InfoFragment : DialogFragment() {
    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            infoAlkaliMetal.text = ElementType.ALKALI_METAL.toString().replace("_"," ")
            infoAlkalineEarthMetal.text = ElementType.ALKALINE_EARTH_METAL.toString().replace("_"," ")
            infoTransitionMetal.text = ElementType.TRANSITION_METAL.toString().replace("_"," ")
            infoMetal.text = ElementType.METAL.toString().replace("_"," ")
            infoMetaloid.text = ElementType.METALOID.toString().replace("_"," ")
            infoNonMetal.text = ElementType.NON_METAL.toString().replace("_"," ")
            infoHalogen.text = ElementType.HALOGEN.toString().replace("_"," ")
            infoNobleGas.text = ElementType.NOBLE_GAS.toString().replace("_"," ")
            infoLanthanide.text = ElementType.LANTHANIDE.toString().replace("_"," ")
            infoActinide.text = ElementType.ACTINIDE.toString().replace("_"," ")
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package com.recep.periodictable.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.fragment.app.DialogFragment
import com.bumptech.glide.GenericTransitionOptions
import com.bumptech.glide.Glide
import com.recep.periodictable.R
import com.recep.periodictable.databinding.FragmentElementDialogBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_PARAM3 = "param3"
private const val ARG_PARAM4 = "param4"
private const val ARG_PARAM5 = "param5"
private const val ARG_PARAM6 = "param6"

class ElementDialogFragment : DialogFragment() {
    @NonNull
    private var _binding: FragmentElementDialogBinding? = null
    private val binding get() = _binding!!

    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null
    private var param4: Boolean? = null
    private var param5: String? = null
    private var param6: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            param3 = it.getString(ARG_PARAM3)
            param4 = it.getBoolean(ARG_PARAM4)
            param5 = it.getString(ARG_PARAM5)
            param6 = it.getString(ARG_PARAM6)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentElementDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val url = "https://images-of-elements.com/" + (param2!!.lowercase()) + ".jpg"

        binding.textViewSymbolDialog.text = param1
        binding.textViewNameDialog.text = param2
        binding.textViewAtomNumberDialog.text = param3
        binding.textViewAtomicMassValue.text = param5
        binding.textViewElectronConfigValue.text = param6

//        if (param4 == true) {
//            binding.imageViewRadioactivity.visibility = View.VISIBLE
//        } else {
//            binding.imageViewRadioactivity.visibility = View.INVISIBLE
//        }

        binding.imageViewRadioactivity.visibility = if (param4==true) View.VISIBLE else View.INVISIBLE

        Glide
            .with(this)
            .load(url).transition(GenericTransitionOptions.with(R.anim.fade_in))
            .into(binding.imageViewElement)

    }

    companion object {
        @JvmStatic
        fun newInstance(
            elementSymbol: String,
            elementName: String,
            elementAtomNumber: String,
            isRadioactive: Boolean,
            elementAtomicMass: String,
            elementElectronConfig: String
        ) =
            ElementDialogFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, elementSymbol)
                    putString(ARG_PARAM2, elementName)
                    putString(ARG_PARAM3, elementAtomNumber)
                    putBoolean(ARG_PARAM4, isRadioactive)
                    putString(ARG_PARAM5, elementAtomicMass)
                    putString(ARG_PARAM6, elementElectronConfig)
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package com.recep.periodictable.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.recep.periodictable.R


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_PARAM3 = "param3"
private const val ARG_PARAM4 = "param4"

class ElementDialogFragment : DialogFragment() {

    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null
    private var param4: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            param3 = it.getString(ARG_PARAM3)
            param4 = it.getBoolean(ARG_PARAM4)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_element_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val symbolDialog = view.findViewById<TextView>(R.id.textView_symbol_dialog)
        val nameDialog = view.findViewById<TextView>(R.id.textView_name_dialog)
        val atomNumberDialog = view.findViewById<TextView>(R.id.textView_atom_number_dialog)
        val radioactivity = view.findViewById<ImageView>(R.id.imageView_radioactivity)

        symbolDialog.text = param1
        nameDialog.text = param2
        atomNumberDialog.text = param3
        if (param4 == true) {
            radioactivity.visibility = View.VISIBLE
        } else{
            radioactivity.visibility = View.INVISIBLE
        }

    }

    companion object {
        @JvmStatic
        fun newInstance(elementSymbol: String, elementName: String, elementAtomNumber: String, isRadioactive: Boolean) =
            ElementDialogFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, elementSymbol)
                    putString(ARG_PARAM2, elementName)
                    putString(ARG_PARAM3, elementAtomNumber)
                    putBoolean(ARG_PARAM4, isRadioactive)
                }
            }
    }

}
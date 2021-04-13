package com.zeynepduyenli.biseyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

class ThirdFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fm = parentFragmentManager
        val ft = fm.beginTransaction()
        val button: ImageButton = view.findViewById(R.id.imageButton5)
        val button2: ImageButton = view.findViewById(R.id.imageButton6)
        button.setOnClickListener {
            ft.replace(R.id.fragment, RegisterFragment())
            ft.commit()
        }

        button2.setOnClickListener {
            ft.replace(R.id.fragment, RegisterFragment())
            ft.commit()
        }
    }
}
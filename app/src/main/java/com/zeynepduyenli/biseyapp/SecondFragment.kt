package com.zeynepduyenli.biseyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fm = parentFragmentManager
        val ft = fm.beginTransaction()
        val button: ImageButton = view.findViewById(R.id.imageButton2)
        button.setOnClickListener {
            ft.replace(R.id.fragment, ThirdFragment())
            ft.commit()
        }
    }
}
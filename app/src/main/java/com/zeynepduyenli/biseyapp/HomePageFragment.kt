package com.zeynepduyenli.biseyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home_page_.view.*

class HomePageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val homedesign =  inflater.inflate(R.layout.fragment_home_page_, container, false)
        homedesign.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.homePage_Fragment)
        }
        return homedesign
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fm = parentFragmentManager
        val ft = fm.beginTransaction()
        val button:Button = view.findViewById(R.id.button)
        button.setOnClickListener {
            ft.replace(R.id.fragment, FirstFragment())
            ft.commit()
        }

    }
}
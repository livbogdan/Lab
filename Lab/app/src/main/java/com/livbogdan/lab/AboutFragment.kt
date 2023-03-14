package com.livbogdan.lab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AboutFragment : Fragment() {

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment

		val view: View = inflater.inflate(R.layout.fragment_about, container, false)

		view.findViewById<FloatingActionButton>(R.id.fabClose).setOnClickListener() {
			println("happend")
			parentFragmentManager.beginTransaction().remove(this).commit()
		}

		return view
	}

}